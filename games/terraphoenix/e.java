/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    boolean field_J;
    dk field_h;
    int field_f;
    int field_E;
    int field_j;
    int field_d;
    int field_B;
    boolean field_r;
    boolean field_m;
    private r field_D;
    static ci field_g;
    r[] field_C;
    int field_k;
    hk field_e;
    static rh field_l;
    boolean field_M;
    th field_n;
    private int field_z;
    int field_N;
    r field_q;
    boolean field_b;
    static int[] field_t;
    static ci[] field_p;
    int field_a;
    boolean field_u;
    gi[] field_F;
    int field_i;
    int field_x;
    private boolean field_A;
    String field_K;
    boolean field_v;
    private boolean field_I;
    int field_c;
    private int field_s;
    boolean field_w;
    int field_L;
    static String field_o;
    int field_H;
    int field_y;
    Terraphoenix field_G;

    private final void a(boolean param0, r param1) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        dl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        try {
          this.field_h.b((byte) -109);
          if (param0) {
            return;
          }
          param1.field_w = 1;
          var4 = -1 + param1.field_F;
          while ((1 + param1.field_F) >= var4) {
            if (var6 != 0) {
              return;
            }
            var5 = -1 + param1.field_H;
            while (param1.field_H + 1 >= var5) {
              var3 = this.field_h.a(107, var5, param1.field_E, var4);
              if (null != var3 &&
                this.field_h.field_g[param1.field_F][param1.field_H] < this.field_h.field_g[var4][var5] &&
                var3.a(-param1.field_H + var5, var4 - param1.field_F, -128) <= 50) {
                param1.field_jb = 20;
                param1.field_d = param1.field_B;
                param1.field_w = 0;
                param1.field_S = true;
                param1.field_r = null;
                param1.field_Y = true;
                param1.field_n = var5;
                param1.field_A = 0;
                param1.field_X = var4;
                return;
              }
              var5++;
            }
            var4++;
          }
          param1.field_Y = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_28_0 = var3_ref;
          stackIn_28_1 = new StringBuilder().append("e.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, ci param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        ci var7 = null;
        RuntimeException var7_ref = null;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_66_0Lifetime1;
        int stackIn_66_0Lifetime2;
        int stackIn_66_1Lifetime1;
        int stackIn_66_1Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var8Lifetime1Lifetime1;
        int var19Lifetime3Lifetime1;
        var23 = Terraphoenix.field_V;
        try {
          var7 = u.field_e[param3];
          var8 = param1;
          var8 = var8 + param5.field_p;
          var9 = param4;
          var9 = var9 + param5.field_v;
          var10 = 0;
          var11 = param5.field_p + param1;
          var14 = 104 % ((-39 - param2) / 63);
          var12 = param4 + param5.field_v;
          var13 = param5.field_t;
          var15 = param5.field_r;
          var16 = 0;
          var17 = param5.field_p + param5.field_v * var7.field_r;
          if (l.field_d > var9) {
            var19 = l.field_d - var9;
            var17 = var17 + var19 * var15;
            var13 = var13 - var19;
            var9 = l.field_d;
            var12 = var12 + var19;
            var10 = var10 + var15 * var19;
          }
          var18 = 64 - param5.field_r;
          if (var8 < l.field_b) {
            var19Lifetime1 = -var8 + l.field_b;
            var10 = var10 + var19Lifetime1;
            var8 = l.field_b;
            var17 = var17 + var19Lifetime1;
            var15 = var15 - var19Lifetime1;
            var16 = var16 + var19Lifetime1;
            var11 = var11 + var19Lifetime1;
            var18 = var18 + var19Lifetime1;
          }
          if (l.field_c < (var9 + var13)) {
            var13 = var13 - (var13 + (var9 - l.field_c));
          }
          if ((var8 + var15) > l.field_f) {
            var19Lifetime2 = -l.field_f + var15 + var8;
            var16 = var16 + var19Lifetime2;
            var18 = var18 + var19Lifetime2;
            var15 = var15 - var19Lifetime2;
          }
          if (0 < var15 &&
            var13 > 0) {
            var20 = var11;
            var21 = var12;
            var22 = -(var15 >> 2);
            var15 = -(3 & var15);
            var9Lifetime1 = -var13;
            while (var9Lifetime1 < 0) {
              if (var23 != 0) {
                return;
              }
              var8Lifetime1 = var22;
              while (0 > var8Lifetime1) {
                incrementValue$0 = var10;
                var10++;
                var19Lifetime3 = param5.field_z[incrementValue$0];
                stackIn_66_0 = ~var19Lifetime3;
                stackIn_66_1 = -1;
                if (stackIn_66_0 == stackIn_66_1) {
                  var20++;
                  var17++;
                } else {
                  incrementValue$1 = var20;
                  var20++;
                  incrementValue$2 = var17;
                  var17++;
                  gd.field_a[incrementValue$1][var21] = 144 * param0 + (var21 + var7.field_z[incrementValue$2] / 5);
                }
                incrementValue$3 = var10;
                var10++;
                var19Lifetime3 = param5.field_z[incrementValue$3];
                if (var19Lifetime3 == 0) {
                  var20++;
                  var17++;
                } else {
                  incrementValue$4 = var20;
                  var20++;
                  incrementValue$5 = var17;
                  var17++;
                  gd.field_a[incrementValue$4][var21] = param0 * 144 + (var21 + var7.field_z[incrementValue$5] / 5);
                }
                incrementValue$6 = var10;
                var10++;
                var19Lifetime3 = param5.field_z[incrementValue$6];
                if (0 == var19Lifetime3) {
                  var20++;
                  var17++;
                } else {
                  incrementValue$7 = var20;
                  var20++;
                  incrementValue$8 = var17;
                  var17++;
                  gd.field_a[incrementValue$7][var21] = var21 + (param0 * 144 + var7.field_z[incrementValue$8] / 5);
                }
                incrementValue$9 = var10;
                var10++;
                var19Lifetime3 = param5.field_z[incrementValue$9];
                if (var19Lifetime3 == 0) {
                  var20++;
                  var17++;
                } else {
                  incrementValue$10 = var20;
                  var20++;
                  incrementValue$11 = var17;
                  var17++;
                  gd.field_a[incrementValue$10][var21] = var21 + param0 * 144 + var7.field_z[incrementValue$11] / 5;
                }
                var8Lifetime1++;
              }
              var8Lifetime1Lifetime1 = var15;
              while (var8Lifetime1Lifetime1 < 0) {
                incrementValue$12 = var10;
                var10++;
                var19Lifetime3Lifetime1 = param5.field_z[incrementValue$12];
                stackIn_66_0Lifetime1 = -1;
                stackIn_66_1Lifetime1 = ~var19Lifetime3Lifetime1;
                if (stackIn_66_0Lifetime1 == stackIn_66_1Lifetime1) {
                  var17++;
                  var20++;
                } else {
                  incrementValue$13 = var20;
                  var20++;
                  incrementValue$14 = var17;
                  var17++;
                  gd.field_a[incrementValue$13][var21] = 144 * param0 + (var21 + var7.field_z[incrementValue$14] / 5);
                }
                var8Lifetime1Lifetime1++;
              }
              var17 = var17 + var18;
              var20 = var11;
              stackIn_66_0Lifetime2 = var10;
              stackIn_66_1Lifetime2 = var16;
              var10 = stackIn_66_0Lifetime2 + stackIn_66_1Lifetime2;
              var21++;
              var9Lifetime1++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_71_0 = var7_ref;
          stackIn_71_1 = new StringBuilder().append("e.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (!ib.p(86)) {
          return;
        }
        try {
          int var1_int = -25 / ((param0 - 65) / 50);
          ja.a(-110, false, 4);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "e.L(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        th var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          var3 = this.field_n;
          if (param0 != 29518) {
            this.a((Terraphoenix) null, false);
          }
          L3: while (true) {
            if (var3 != null) {
              stackIn_13_0 = ~param1;
              stackIn_13_1 = ~var3.field_a;
              if (var4 != 0) {
                break L3;
              }
              if (stackIn_13_0 != stackIn_13_1) {
                var3 = var3.field_f;
                continue;
              }
            }
            if (var3 == null) {
              return;
            }
            stackIn_13_0 = ~param1;
            stackIn_13_1 = ~var3.field_a;
            break;
          }
          if (stackIn_13_0 == stackIn_13_1 &&
            !var3.field_h) {
            var3.field_h = true;
            var3.field_d = 250;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "e.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_G.field_db) {
            qd.$cfr$intArgs$a$e9dea5688aa5(69, 11);
            decompiledFrameRemainder0 = (var3 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (1 == this.field_G.field_Bb) {
              qd.$cfr$intArgs$a$e9dea5688aa5(26, 13);
            }
            if (this.field_G.field_Bb == 2) {
              qd.$cfr$intArgs$a$e9dea5688aa5(113, 11);
            }
            if (this.field_G.field_Bb == 3) {
              qd.$cfr$intArgs$a$e9dea5688aa5(104, 11);
            }
            if (4 == this.field_G.field_Bb) {
              qd.$cfr$intArgs$a$e9dea5688aa5(122, 11);
            }
            if (this.field_G.field_Bb == 5) {
              qd.$cfr$intArgs$a$e9dea5688aa5(76, 5);
            }
            if (this.field_G.field_Bb == 6) {
              qd.$cfr$intArgs$a$e9dea5688aa5(58, 11);
            }
            if (7 == this.field_G.field_Bb) {
              qd.$cfr$intArgs$a$e9dea5688aa5(32, 5);
            }
            if (this.field_G.field_Bb == 8) {
              qd.$cfr$intArgs$a$e9dea5688aa5(44, 11);
            }
            if (this.field_G.field_Bb == 9) {
              qd.$cfr$intArgs$a$e9dea5688aa5(24, 5);
            }
            if (this.field_G.field_Bb == 10) {
              qd.$cfr$intArgs$a$e9dea5688aa5(52, 11);
            }
            if (this.field_G.field_Bb == 11) {
              qd.$cfr$intArgs$a$e9dea5688aa5(53, 4);
            }
            if (this.field_G.field_Bb == 12) {
              qd.$cfr$intArgs$a$e9dea5688aa5(29, 11);
            }
            if (13 == this.field_G.field_Bb) {
              qd.$cfr$intArgs$a$e9dea5688aa5(70, 11);
            }
          }
          if (param0 > -74) {
            this.field_B = 101;
          }
          var2_int = 0;
          while (var2_int < this.field_C.length) {
            if (var3 != 0) {
              return;
            }
            if (null != this.field_C[var2_int]) {
              if (this.field_C[var2_int].field_Z != null) {
                if (this.field_G.field_Bb == 5 ||
                  this.field_G.field_Bb == 7 ||
                  this.field_G.field_Bb == 9) {
                  this.field_C[var2_int].field_h = true;
                  this.field_C[var2_int].field_R = this.field_C[var2_int].field_E;
                  this.field_C[var2_int].field_i = this.field_C[var2_int].field_F;
                  this.field_C[var2_int].field_gb = this.field_C[var2_int].field_H;
                }
                if (this.field_J) {
                  this.field_C[var2_int].b(60);
                } else {
                  this.field_C[var2_int].b(60);
                  this.field_C[var2_int].field_jb = 0;
                }
                if (null == this.field_q) {
                  this.field_q = this.field_C[var2_int];
                }
                this.field_C[var2_int].a(false);
              } else {
                if (this.field_J) {
                  this.field_C[var2_int].b(60);
                  this.field_C[var2_int].field_q = -(int)(Math.random() * (double)this.field_C[var2_int].field_jb);
                } else {
                  this.field_C[var2_int].b(60);
                }
              }
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "e.I(" + param0 + ')');
        }
    }

    private final int a(byte param0, r param1, r param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.field_F - param1.field_F;
          var5 = -param1.field_H + param2.field_H;
          if (param0 != -60) {
            this.field_i = 27;
          }
          stackIn_4_0 = (int)Math.sqrt((double)(var4_int * var4_int + var5 * var5));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("e.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(Terraphoenix param0, boolean param1) {
        r stackIn_47_0 = null;
        r stackIn_131_0 = null;
        boolean stackIn_132_1 = false;
        r stackIn_315_0 = null;
        boolean stackIn_316_1 = false;
        r stackIn_538_0 = null;
        r stackIn_538_1 = null;
        int stackIn_557_0 = 0;
        int stackIn_558_1 = 0;
        boolean stackIn_562_0 = false;
        r stackIn_670_0 = null;
        ga stackIn_673_0 = null;
        int stackIn_826_0 = 0;
        int stackIn_827_1 = 0;
        int stackIn_927_0 = 0;
        int stackIn_928_1 = 0;
        Object stackIn_1003_0 = null;
        StringBuilder stackIn_1003_1 = null;
        String stackIn_1004_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        Object var3 = null;
        int var4 = 0;
        Object var4_ref = null;
        dl var5 = null;
        int var5_int = 0;
        oh var5_ref = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        dl var5Lifetime1;
        oh var5_refLifetime1;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var8Lifetime1;
        int var5_intLifetime2;
        int var6Lifetime4;
        int var7Lifetime1Lifetime1;
        var9 = Terraphoenix.field_V;
        try {
          if (le.field_q != null) {
            le.field_q.field_g = this.field_y;
            le.field_q.field_z = this.field_N;
            le.field_q.field_c = this.field_j;
            if (!le.field_q.b(0)) {
              return;
            }
          }
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (null != this.field_q &&
            this.field_q.field_P <= 0) {
            this.b((byte) -3);
            var3_int = 0;
            var4 = 0;
            while (var4 < 12) {
              stackIn_538_0 = this.field_q;
              stackIn_538_1 = this.field_C[var4];
              if (var9 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
              if (stackIn_538_0 == stackIn_538_1) {
                var3_int = var4;
              }
              var4++;
            }
            if (decompiledFrameCompleted2) {
              var4 = 0;
              while (true) {
                var4++;
                var3_int++;
                if (12 <= var3_int) {
                  var3_int -= 12;
                }
                if (var4 < 12) {
                  if (this.field_C[var3_int] == null) {
                    continue;
                  }
                  stackIn_47_0 = this.field_C[var3_int];
                  if (var9 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_47_0.field_Z == null) {
                    continue;
                  }
                  if (0 >= this.field_C[var3_int].field_jb) {
                    continue;
                  }
                  if (0 >= this.field_C[var3_int].field_P) {
                    continue;
                  }
                }
                break;
              }
              if (decompiledFrameCompleted1) {
                if (null != this.field_C[var3_int] &&
                  null != this.field_C[var3_int].field_Z &&
                  this.field_C[var3_int].field_P > 0) {
                  this.field_q = this.field_C[var3_int];
                  sj.field_b = (this.field_q.field_F - this.field_q.field_H) * 32;
                  lg.field_c = 16 * (this.field_q.field_F + this.field_q.field_H) - this.field_q.field_E * 48;
                  eg.field_p = this.field_q.field_E;
                }
                if (7 <= this.field_B &&
                  10 > this.field_B) {
                  this.field_B = this.field_B + 1;
                }
                this.a(-1);
                this.field_m = false;
                this.field_L = 0;
              }
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            stackIn_47_0 = this.field_q;
          }
          if (decompiledFrameCompleted2) {
            if (stackIn_47_0 != null &&
              this.field_q.field_b == null) {
              this.field_m = false;
            }
            if (1 == this.field_N &&
              gj.a(this, this.field_y, (byte) 114, this.field_j)) {
              return;
            }
            if (this.field_j < 365 &&
              this.field_j > 39) {
              if (null != this.field_q &&
                this.field_q.field_P <= 0) {
                return;
              }
              var3 = null;
              var4_ref = null;
              if (!ha.field_o) {
                var5 = this.field_h.a(94, vf.field_a, cm.field_d, uf.field_c);
                if (null != this.field_q &&
                  uf.field_c != -1) {
                  var3 = ke.field_g;
                  var4_ref = va.field_b;
                  if (uf.field_c == ql.field_i &&
                    ~vf.field_a == ~ld.field_e) {
                    var3 = wg.field_k;
                    if (null != var5 &&
                      var5.field_w) {
                      var3 = bm.field_b;
                    }
                  }
                  if (this.field_w) {
                    var3 = rl.field_c;
                    if (oh.field_f != 0) {
                      sj.field_b = 32 * uf.field_c - 32 * vf.field_a;
                      lg.field_c = -(eg.field_p * 48) + vf.field_a * 16 + 16 * uf.field_c;
                    }
                    var4_ref = null;
                  }
                }
                if (var5 != null &&
                  null != var5.field_h &&
                  var5.field_h.field_C == 0 &&
                  var5.field_h.field_Z != null) {
                  var3 = ef.field_a + var5.field_h.field_Z.b(1);
                }
                if (null != var5 && (null != var5.field_h &&
                  var5.field_h.field_C != 0 &&
                  var5.field_h.field_k ||
                  this.field_L == 1)) {
                  var3 = q.field_Fb;
                  if (this.field_m) {
                    var3 = hm.field_G;
                  }
                  if (this.field_L == 1) {
                    var4_ref = cm.field_a;
                  }
                  var6 = this.field_q.field_U;
                  var7 = this.field_q.field_ab;
                  this.field_q.a(true, uf.field_c, vf.field_a);
                  if (Math.abs(var6 - this.field_q.field_U) >= 2 &&
                    Math.abs(-this.field_q.field_U + var6) <= 6) {
                    this.field_q.field_ab = 0;
                  }
                  stackIn_131_0 = this.field_q;
                  stackIn_132_1 = !(param1);
                  var8 = ((r) (Object) stackIn_131_0).c(stackIn_132_1);
                  this.field_q.field_ab = var7;
                  if (var5.field_A == this.field_q.field_F &&
                    var5.field_n == this.field_q.field_H) {
                    var3 = var4_ref;
                    var4_ref = null;
                  }
                  this.field_q.field_U = var6;
                  if (this.field_m) {
                    var8 = 15;
                  }
                  if (this.field_q.field_jb < var8 && (!(-10 + var8 <= this.field_q.field_jb) ||
                    this.field_m ||
                    !(10 <= this.field_q.field_jb))) {
                    var3 = m.field_h;
                  }
                  if (!this.field_m &&
                    this.field_q.field_nb.field_c <= 0 &&
                    7 != this.field_q.field_nb.field_g &&
                    this.field_q.field_nb.field_g != 6) {
                    var4_ref = null;
                    var3 = fl.field_d + "<br>" + ql.field_f;
                  }
                }
              }
              if (2 == this.field_N && (!ha.field_o ||
                5 <= this.field_B)) {
                this.b((byte) -3);
                qd.$cfr$intArgs$a$e9dea5688aa5(39, 34);
                if (this.field_B == 5) {
                  this.field_B = 6;
                }
                boolean decompiledSharedTail0 = (!(this.field_L > 0) &&
                  !(this.field_m));
                if (!decompiledSharedTail0) {
                  this.field_L = 0;
                  this.field_m = false;
                  decompiledSharedTail0 = (var9 != 0);
                }
                if ((decompiledSharedTail0) && (0 < this.field_q.field_jb &&
                  !this.field_w)) {
                  var5_int = this.field_q.field_U;
                  this.field_q.a(true, uf.field_c, vf.field_a);
                  ok.field_i = true;
                  if (~var5_int != ~this.field_q.field_U) {
                    this.field_q.field_jb = this.field_q.field_jb - 1;
                    this.field_q.field_ab = 0;
                  }
                }
              }
              if (this.field_m) {
                this.field_L = 1;
              }
              boolean decompiledFrameRemainder1 = true;
              L40: {
                if (uf.field_c != -1 && (oh.field_f == 1 &&
                  !this.field_m ||
                  this.field_N == 1) && this.field_L > 0 && (!ha.field_o ||
                  4 <= this.field_B)) {
                  if (uf.field_c != this.field_q.field_F) {
                    break L40;
                  }
                  if (~this.field_q.field_H != ~vf.field_a) {
                    break L40;
                  }
                }
                decompiledFrameRemainder1 = (this.field_N == 1);
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = (this.field_L == 0))) {
                  L45: {
                    qd.$cfr$intArgs$a$e9dea5688aa5(45, 22);
                    ok.field_i = true;
                    var5Lifetime1 = this.field_h.a(117, vf.field_a, cm.field_d, uf.field_c);
                    this.field_m = false;
                    if (this.field_q != null) {
                      if ((!ha.field_o ||
                        this.field_B >= 8 ||
                        this.field_B == 0 &&
                        uf.field_c >= 8 &&
                        uf.field_c <= 10 &&
                        vf.field_a == 4 ||
                        this.field_B == 2 &&
                        !(8 > uf.field_c) &&
                        !(uf.field_c > 10) &&
                        vf.field_a == 8) && !this.field_w) {
                        this.field_q.field_n = vf.field_a;
                        this.field_q.field_S = true;
                        this.field_q.field_r = null;
                        this.field_q.field_A = 0;
                        this.field_q.field_d = this.field_q.field_B;
                        this.field_q.field_X = uf.field_c;
                        this.field_q.field_N = cm.field_d;
                      }
                      if (null == var5Lifetime1) {
                        this.b((byte) -3);
                        this.field_q.field_S = false;
                        if (var9 == 0) {
                          break L45;
                        }
                      }
                      if (var5Lifetime1.field_h != null &&
                        var5Lifetime1.field_h.field_C == 0 &&
                        var5Lifetime1.field_h.field_Z != null && (!ha.field_o ||
                        7 <= this.field_B)) {
                        this.field_q.field_S = false;
                        if (7 <= this.field_B &&
                          this.field_B < 10) {
                          this.field_B = this.field_B + 1;
                        }
                        this.field_q = this.field_h.a(102, vf.field_a, cm.field_d, uf.field_c).field_h;
                        this.a(-1);
                        this.field_m = false;
                        this.field_L = 0;
                      }
                      if (var5Lifetime1.field_h != null &&
                        var5Lifetime1.field_h.field_C == 1 &&
                        var5Lifetime1.field_h.field_k && (!ha.field_o ||
                        5 <= this.field_B)) {
                        this.field_q.field_X = uf.field_c;
                        this.field_q.field_d = 2;
                        this.field_q.field_N = cm.field_d;
                        ok.field_i = true;
                        this.field_q.field_n = vf.field_a;
                        this.field_q.field_S = true;
                        this.field_q.field_A = 0;
                        if (this.field_m) {
                          this.field_q.field_d = 4;
                        }
                        var6Lifetime4 = this.field_q.field_U;
                        var7Lifetime1 = this.field_q.field_ab;
                        this.field_q.a(param1, this.field_q.field_X, this.field_q.field_n);
                        stackIn_315_0 = this.field_q;
                        stackIn_316_1 = !(param1);
                        var8Lifetime1 = ((r) (Object) stackIn_315_0).c(stackIn_316_1);
                        if (Math.abs(var6Lifetime4 - this.field_q.field_U) >= 2 &&
                          Math.abs(-this.field_q.field_U + var6Lifetime4) <= 6) {
                          this.field_q.field_ab = 0;
                        }
                        this.field_q.field_ab = var7Lifetime1;
                        if (this.field_m) {
                          var8Lifetime1 = 15;
                        }
                        this.field_q.field_U = var6Lifetime4;
                        if (this.field_q.field_jb < var8Lifetime1 && (!(this.field_q.field_jb >= 10) ||
                          this.field_m ||
                          !(10 <= this.field_q.field_jb))) {
                          this.field_q.field_S = false;
                        }
                        if (this.field_q.field_nb.field_c == 0 &&
                          !this.field_m) {
                          this.field_q.field_S = false;
                        }
                        if (this.field_q.field_S &&
                          this.field_m) {
                          this.field_L = 0;
                        }
                      }
                      if (this.field_q.field_S &&
                        this.field_q.field_d != 2 &&
                        this.field_q.field_d != 4) {
                        if (!this.field_w) {
                          if (-1 == var5Lifetime1.field_v ||
                            var5Lifetime1.field_v == 2 ||
                            var5Lifetime1.field_v == 3) {
                            ql.field_i = uf.field_c;
                            fi.field_m = null;
                            this.field_q.field_S = false;
                            ld.field_e = vf.field_a;
                            og.field_d = -1;
                            if (var9 == 0) {
                              break L45;
                            }
                          }
                          if (ql.field_i == uf.field_c &&
                            ld.field_e == vf.field_a) {
                            if (fi.field_m != null &&
                              Math.random() * 100.0 < (double)fi.field_m.a(param1)) {
                              var6_ref_int__ = new int[]{2, 10, 11};
                              var7_ref_int__ = new int[]{15, 20, 21};
                              if (this.field_q.field_Z.field_y) {
                                qd.$cfr$intArgs$a$e9dea5688aa5(54, var6_ref_int__[(int)(Math.random() * (double)var6_ref_int__.length)]);
                              }
                              if (!this.field_q.field_Z.field_y) {
                                qd.$cfr$intArgs$a$e9dea5688aa5(125, var7_ref_int__[(int)(Math.random() * (double)var7_ref_int__.length)]);
                              }
                            }
                            this.b((byte) -3);
                            if (this.field_B != 0) {
                              break L45;
                            }
                            this.field_B = 1;
                            if (var9 == 0) {
                              break L45;
                            }
                          }
                          ql.field_i = uf.field_c;
                          ld.field_e = vf.field_a;
                          og.field_d = -1;
                          this.field_q.field_S = false;
                          this.field_q.field_c.field_h = null;
                          fi.field_m = this.field_h.a(false, this.field_q.field_n, this.field_q.field_H, -89, true, this.field_q.field_N, this.field_q.field_E, this.field_q.field_X, this.field_q.field_F);
                          this.field_q.field_c.field_h = this.field_q;
                          if (fi.field_m != null) {
                            og.field_d = fi.field_m.a(param1);
                            if (var9 != 0) {
                              this.b((byte) -3);
                              if (null != var5Lifetime1 &&
                                null != var5Lifetime1.field_h &&
                                0 == var5Lifetime1.field_h.field_C &&
                                null != var5Lifetime1.field_h.field_Z) {
                                this.b((byte) -3);
                                this.field_m = false;
                                this.field_q = var5Lifetime1.field_h;
                                this.field_L = 0;
                                this.a(-1);
                              }
                            }
                          }
                        }
                      } else {
                        this.b((byte) -3);
                        if ((var9 != 0) && (null != var5Lifetime1 &&
                          null != var5Lifetime1.field_h &&
                          0 == var5Lifetime1.field_h.field_C &&
                          null != var5Lifetime1.field_h.field_Z)) {
                          this.b((byte) -3);
                          this.field_m = false;
                          this.field_q = var5Lifetime1.field_h;
                          this.field_L = 0;
                          this.a(-1);
                        }
                      }
                    } else {
                      if (null != var5Lifetime1 &&
                        null != var5Lifetime1.field_h &&
                        0 == var5Lifetime1.field_h.field_C &&
                        null != var5Lifetime1.field_h.field_Z) {
                        this.b((byte) -3);
                        this.field_m = false;
                        this.field_q = var5Lifetime1.field_h;
                        this.field_L = 0;
                        this.a(-1);
                      }
                    }
                  }
                  decompiledFrameRemainder1 = (var9 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                this.b((byte) -3);
                this.field_q.field_X = uf.field_c;
                ok.field_i = true;
                if (this.field_B == 4) {
                  this.field_B = 5;
                }
                this.field_q.field_n = vf.field_a;
                this.field_q.field_N = cm.field_d;
                this.field_q.field_d = 2;
                this.field_q.field_S = true;
                if (this.field_m) {
                  this.field_q.field_d = 4;
                }
                this.field_q.field_A = 0;
                var5_int = this.field_q.field_U;
                var6Lifetime4 = this.field_q.field_ab;
                this.field_q.a(true, uf.field_c, vf.field_a);
                if (Math.abs(-this.field_q.field_U + var5_int) >= 2 &&
                  Math.abs(-this.field_q.field_U + var5_int) <= 6) {
                  this.field_q.field_ab = 0;
                }
                var7Lifetime1Lifetime1 = this.field_q.c(false);
                if (this.field_m) {
                  var7Lifetime1Lifetime1 = 15;
                }
                this.field_q.field_U = var5_int;
                this.field_q.field_ab = var6Lifetime4;
                if (var7Lifetime1Lifetime1 > this.field_q.field_jb && (!(this.field_q.field_jb >= (var7Lifetime1Lifetime1 - 10)) ||
                  this.field_m ||
                  !(this.field_q.field_jb >= 10))) {
                  this.field_q.field_S = false;
                }
                if (this.field_q.field_nb.field_c == 0 &&
                  !this.field_m) {
                  this.field_q.field_S = false;
                }
                if (this.field_q.field_S &&
                  this.field_m) {
                  this.field_L = 0;
                }
              }
              if (null == var3 ||
                null == var4_ref) {
                if (var3 != null) {
                  param0.field_Eb = new String[1];
                  param0.field_Eb[0] = (String) (var3);
                }
                if (null != var4_ref) {
                  param0.field_Eb = new String[1];
                  param0.field_Eb[0] = (String) (var4_ref);
                  if (var9 != 0) {
                    param0.field_Eb = new String[2];
                    param0.field_Eb[1] = (String) (var4_ref);
                    param0.field_Eb[0] = (String) (var3);
                  }
                }
              } else {
                param0.field_Eb = new String[2];
                param0.field_Eb[1] = (String) (var4_ref);
                param0.field_Eb[0] = (String) (var3);
              }
              decompiledFrameRemainder3 = (var9 != 0);
            }
            if (decompiledFrameRemainder3) {
              var3_int = this.field_y;
              var4 = this.field_j - 385;
              if (var3_int >= 99 &&
                var3_int < 125 &&
                var4 >= 66 &&
                var4 < 92 && (!ha.field_o ||
                this.field_B >= 11) && this.field_q.field_B == 0) {
                param0.field_Eb = new String[1];
                param0.field_Eb[0] = fa.field_e;
                if (this.field_N == 1) {
                  qd.$cfr$intArgs$a$e9dea5688aa5(16, 33);
                  var5_intLifetime2 = this.field_q.g(12384);
                  this.field_q.field_B = 1;
                  this.field_q.field_jb = this.field_q.field_jb - var5_intLifetime2;
                  this.field_q.field_jb = this.field_q.field_jb - this.field_q.field_jb / 2;
                  if (this.field_q.field_jb < 0) {
                    this.field_q.field_jb = 0;
                  }
                  this.field_q.b(var5_intLifetime2, (byte) -126);
                }
              }
              decompiledFrameRemainder2 = !(var3_int < 127);
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder2 = !(var3_int >= 153)) &&
                (decompiledFrameRemainder2 = !(var4 < 66)) &&
                (decompiledFrameRemainder2 = !(92 <= var4)) &&
                (decompiledFrameRemainder2 = (1 == this.field_q.field_B)) &&
                (decompiledFrameRemainder2 = (!(ha.field_o) ||
                !(this.field_B < 11)))) {
                if (this.field_q.field_B == 1) {
                  param0.field_Eb = new String[1];
                  param0.field_Eb[0] = db.field_a;
                }
                decompiledFrameRemainder2 = (this.field_N == 1);
                if (decompiledFrameRemainder2) {
                  qd.$cfr$intArgs$a$e9dea5688aa5(47, 33);
                  this.field_q.field_B = 0;
                  stackIn_538_0 = this.field_q;
                  stackIn_538_1 = this.field_q;
                }
              }
            }
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            stackIn_538_0.field_jb = stackIn_538_1.field_jb + this.field_q.field_jb / 2;
          }
          if (decompiledFrameRemainder3) {
            if (var3_int >= 155 &&
              var3_int < 181 &&
              66 <= var4 &&
              var4 < 92) {
              param0.field_Eb = new String[1];
              param0.field_Eb[0] = of.field_i;
              if (this.field_N == 1) {
                stackIn_557_0 = 39;
                if (d.field_H) {
                  stackIn_558_1 = 34;
                } else {
                  stackIn_558_1 = 33;
                }
                qd.$cfr$intArgs$a$e9dea5688aa5(stackIn_557_0, stackIn_558_1);
                stackIn_562_0 = !(d.field_H);
                d.field_H = stackIn_562_0;
              }
            }
            if (var3_int >= 184 &&
              var3_int < 210 &&
              var4 >= 66 &&
              var4 < 92 &&
              eg.field_p > 0 && (!ha.field_o ||
              this.field_B >= 12)) {
              if (eg.field_p > 1) {
                param0.field_Eb = new String[1];
                param0.field_Eb[0] = di.field_g + (eg.field_p - 1);
              }
              if (eg.field_p == 1) {
                param0.field_Eb = new String[1];
                param0.field_Eb[0] = ph.field_u;
              }
              if (this.field_N == 1) {
                qd.$cfr$intArgs$a$e9dea5688aa5(80, 25);
                if (this.field_B == 12) {
                  this.field_B = 13;
                }
                eg.field_p = eg.field_p - 1;
              }
            }
            if (212 <= var3_int &&
              238 > var3_int &&
              var4 >= 66 &&
              92 > var4 &&
              eg.field_p < 5 && (!ha.field_o ||
              this.field_B >= 12)) {
              param0.field_Eb = new String[1];
              param0.field_Eb[0] = di.field_g + (eg.field_p + 1);
              if (this.field_N == 1) {
                qd.$cfr$intArgs$a$e9dea5688aa5(107, 24);
                if (this.field_B == 12) {
                  this.field_B = 13;
                }
                eg.field_p = eg.field_p + 1;
              }
            }
            if (var3_int >= 241 &&
              267 > var3_int &&
              66 <= var4 &&
              92 > var4 && (!ha.field_o ||
              this.field_B >= 7)) {
              param0.field_Eb = new String[1];
              param0.field_Eb[0] = sd.field_f;
              if (this.field_N == 1) {
                qd.$cfr$intArgs$a$e9dea5688aa5(109, 24);
                var5_intLifetime1 = 0;
                var6Lifetime1 = 0;
                while (true) {
                  boolean decompiledFrameCompleted0 = true;
                  if (var6Lifetime1 < 12) {
                    stackIn_670_0 = this.field_q;
                    if (var9 == 0) {
                      if (stackIn_670_0 == this.field_C[var6Lifetime1]) {
                        var5_intLifetime1 = var6Lifetime1;
                      }
                      var6Lifetime1++;
                      continue;
                    }
                  } else {
                    var6Lifetime1 = 0;
                    while (true) {
                      var6Lifetime1++;
                      var5_intLifetime1++;
                      if (var5_intLifetime1 >= 12) {
                        var5_intLifetime1 -= 12;
                      }
                      if (var6Lifetime1 < 12) {
                        if (this.field_C[var5_intLifetime1] == null) {
                          continue;
                        }
                        stackIn_673_0 = this.field_C[var5_intLifetime1].field_Z;
                        if (var9 != 0) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        if (stackIn_673_0 == null) {
                          continue;
                        }
                        if (this.field_C[var5_intLifetime1].field_jb <= 0) {
                          continue;
                        }
                        if (this.field_C[var5_intLifetime1].field_P <= 0) {
                          continue;
                        }
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      stackIn_670_0 = this.field_C[var5_intLifetime1];
                    }
                  }
                  if (decompiledFrameCompleted0) {
                    if (stackIn_670_0 == null) {
                      break;
                    }
                    stackIn_673_0 = this.field_C[var5_intLifetime1].field_Z;
                  }
                  if (stackIn_673_0 == null) {
                    break;
                  }
                  if (this.field_C[var5_intLifetime1].field_P <= 0) {
                    break;
                  }
                  this.field_q = this.field_C[var5_intLifetime1];
                  lg.field_c = -(this.field_q.field_E * 48) + (this.field_q.field_H + this.field_q.field_F) * 16;
                  this.field_m = false;
                  if (this.field_B >= 7 &&
                    this.field_B < 10) {
                    this.field_B = this.field_B + 1;
                  }
                  sj.field_b = 32 * (-this.field_q.field_H + this.field_q.field_F);
                  eg.field_p = this.field_q.field_E;
                  this.field_L = 0;
                  this.a(-1);
                  break;
                }
              }
            }
            if ((var3_int >= 13 &&
              var3_int < 81 &&
              12 <= var4 &&
              var4 < 80 ||
              var3_int >= 269 &&
              var3_int < 295 &&
              66 <= var4 &&
              var4 < 92) &&
              (!ha.field_o ||
              this.field_B >= 9)) {
              param0.field_Eb = new String[1];
              param0.field_Eb[0] = ab.field_f;
              if (this.field_N == 1) {
                qd.$cfr$intArgs$a$e9dea5688aa5(18, 33);
                lg.field_c = -(48 * this.field_q.field_E) + (this.field_q.field_F + this.field_q.field_H) * 16;
                eg.field_p = this.field_q.field_E;
                sj.field_b = 32 * (this.field_q.field_F - this.field_q.field_H);
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (var3_int >= 309 &&
              var3_int < 457 &&
              var4 >= 10 &&
              var4 < 83 && (!ha.field_o ||
              5 <= this.field_B ||
              3 == this.field_B)) {
              var5_ref = this.field_q.field_nb;
              if (null != var5_ref && (0 == var5_ref.field_g ||
                var5_ref.field_g == 3 ||
                8 == var5_ref.field_g ||
                12 == var5_ref.field_g)) {
                var5_ref = this.field_q.field_eb;
              }
              if (null != var5_ref) {
                param0.field_Eb = new String[1];
                param0.field_Eb[0] = ne.field_b + od.field_c[var5_ref.field_g].field_j + " " + gl.field_h;
                if (this.field_L == 1) {
                  param0.field_Eb[0] = ne.field_b + od.field_c[var5_ref.field_g].field_j + " " + td.field_a;
                }
                if (ef.field_j >= 324 &&
                  ef.field_j <= 354 &&
                  var4 >= 50 &&
                  80 >= var4 &&
                  var5_ref.field_c < var5_ref.a(true) &&
                  var5_ref.field_g != 6 &&
                  var5_ref.field_g != 7) {
                  param0.field_Eb = new String[1];
                  param0.field_Eb[0] = rf.field_q + od.field_c[var5_ref.field_g].field_j + hi.field_Y;
                  decompiledFrameRemainder0 = (1 == this.field_N);
                  if (decompiledFrameRemainder0) {
                    var6Lifetime2 = 14;
                    if (var6Lifetime2 <= this.field_q.field_jb) {
                      var5_ref.a(0);
                      qd.$cfr$intArgs$a$e9dea5688aa5(120, od.field_c[var5_ref.field_g].field_n);
                      this.field_q.field_jb = this.field_q.field_jb - var6Lifetime2;
                      this.field_q.b(var6Lifetime2, (byte) -116);
                      this.field_q.field_ab = 0;
                    }
                    decompiledFrameRemainder0 = (var9 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (1 == this.field_N)) {
                  if (this.field_q.field_eb != null && (this.field_q.field_nb.field_g == 0 ||
                    8 == this.field_q.field_nb.field_g ||
                    this.field_q.field_nb.field_g == 3 ||
                    this.field_q.field_nb.field_g == 12)) {
                    var5_ref = this.field_q.field_nb;
                    this.field_q.field_nb = this.field_q.field_eb;
                    if (this.field_m) {
                      this.field_L = 0;
                    }
                    this.field_q.field_eb = var5_ref;
                    this.field_q.field_ab = 0;
                    if (var9 != 0) {
                      if (this.field_m) {
                        this.field_L = 0;
                        this.field_L = 1 - this.field_L;
                      } else {
                        this.field_L = 1 - this.field_L;
                      }
                    }
                  } else {
                    if (this.field_m) {
                      this.field_L = 0;
                      if (var9 != 0) {
                        this.field_L = 1 - this.field_L;
                      }
                    } else {
                      this.field_L = 1 - this.field_L;
                    }
                  }
                  if (this.field_B == 3) {
                    this.field_B = 4;
                  }
                  this.field_m = false;
                  stackIn_826_0 = 41;
                  if (this.field_L == 0) {
                    stackIn_827_1 = 34;
                  } else {
                    stackIn_827_1 = 33;
                  }
                  qd.$cfr$intArgs$a$e9dea5688aa5(stackIn_826_0, stackIn_827_1);
                }
              }
            }
            if (var3_int >= 467 &&
              var3_int < 540 &&
              var4 >= 10 &&
              83 > var4 && (!ha.field_o ||
              this.field_B >= 5 ||
              this.field_B == 3)) {
              var5_refLifetime1 = this.field_q.field_eb;
              if (null == var5_refLifetime1 ||
                var5_refLifetime1.field_g != 0 &&
                var5_refLifetime1.field_g != 3 &&
                8 != var5_refLifetime1.field_g &&
                var5_refLifetime1.field_g != 12) {
                var5_refLifetime1 = this.field_q.field_nb;
              }
              if (var5_refLifetime1 != null) {
                param0.field_Eb = new String[1];
                param0.field_Eb[0] = ne.field_b + od.field_c[var5_refLifetime1.field_g].field_j + " " + gl.field_h;
                if (this.field_L == 1) {
                  param0.field_Eb[0] = ne.field_b + od.field_c[var5_refLifetime1.field_g].field_j + " " + td.field_a;
                }
                if (!(ef.field_j >= 481) ||
                  !(ef.field_j <= 511) ||
                  var4 < 50 ||
                  var4 > 80 ||
                  !(var5_refLifetime1.field_c < var5_refLifetime1.a(true)) ||
                  var5_refLifetime1.field_g == 6 ||
                  7 == var5_refLifetime1.field_g) {
                  if (this.field_N == 1) {
                    if (null != this.field_q.field_eb &&
                      0 != this.field_q.field_nb.field_g &&
                      this.field_q.field_nb.field_g != 8 &&
                      this.field_q.field_nb.field_g != 3 &&
                      this.field_q.field_nb.field_g != 12) {
                      var5_refLifetime1 = this.field_q.field_nb;
                      this.field_q.field_nb = this.field_q.field_eb;
                      this.field_q.field_ab = 0;
                      if (this.field_m) {
                        this.field_L = 0;
                      }
                      this.field_q.field_eb = var5_refLifetime1;
                      if (var9 != 0) {
                        if (!this.field_m) {
                          this.field_L = 1 - this.field_L;
                          this.field_L = 0;
                        } else {
                          this.field_L = 0;
                        }
                      }
                    } else {
                      if (!this.field_m) {
                        this.field_L = 1 - this.field_L;
                        if (var9 != 0) {
                          this.field_L = 0;
                        }
                      } else {
                        this.field_L = 0;
                      }
                    }
                    if (this.field_B == 3) {
                      this.field_B = 4;
                    }
                    this.field_m = false;
                    if (this.field_B == 5) {
                      this.field_B = 6;
                    }
                    stackIn_927_0 = 16;
                    if (this.field_L == 0) {
                      stackIn_928_1 = 34;
                    } else {
                      stackIn_928_1 = 33;
                    }
                    qd.$cfr$intArgs$a$e9dea5688aa5(stackIn_927_0, stackIn_928_1);
                    if (var9 != 0) {
                      param0.field_Eb = new String[1];
                      param0.field_Eb[0] = rf.field_q + od.field_c[var5_refLifetime1.field_g].field_j + hi.field_Y;
                      if (this.field_N == 1) {
                        var6Lifetime3 = 14;
                        if (this.field_q.field_jb >= var6Lifetime3) {
                          var5_refLifetime1.a(0);
                          qd.$cfr$intArgs$a$e9dea5688aa5(25, od.field_c[var5_refLifetime1.field_g].field_n);
                          this.field_q.field_jb = this.field_q.field_jb - var6Lifetime3;
                          this.field_q.b(var6Lifetime3, (byte) -117);
                          this.field_q.field_ab = 0;
                        }
                      }
                    }
                  }
                } else {
                  param0.field_Eb = new String[1];
                  param0.field_Eb[0] = rf.field_q + od.field_c[var5_refLifetime1.field_g].field_j + hi.field_Y;
                  if (this.field_N == 1) {
                    var6Lifetime3 = 14;
                    if (this.field_q.field_jb >= var6Lifetime3) {
                      var5_refLifetime1.a(0);
                      qd.$cfr$intArgs$a$e9dea5688aa5(25, od.field_c[var5_refLifetime1.field_g].field_n);
                      this.field_q.field_jb = this.field_q.field_jb - var6Lifetime3;
                      this.field_q.b(var6Lifetime3, (byte) -117);
                      this.field_q.field_ab = 0;
                    }
                  }
                }
              }
            }
            if (547 <= var3_int &&
              595 > var3_int &&
              var4 >= 35 &&
              var4 < 83 && (!ha.field_o ||
              this.field_B >= 14)) {
              param0.field_Eb = new String[1];
              param0.field_Eb[0] = wg.field_g;
              if (this.field_m) {
                param0.field_Eb[0] = kd.field_d;
              }
              if (1 == this.field_N) {
                if (0 != this.field_L &&
                  this.field_m) {
                  qd.$cfr$intArgs$a$e9dea5688aa5(108, 34);
                  this.field_m = false;
                  this.field_L = 0;
                  if (var9 != 0) {
                    this.field_L = 1;
                    this.field_m = true;
                    qd.$cfr$intArgs$a$e9dea5688aa5(102, 33);
                  }
                } else {
                  this.field_L = 1;
                  this.field_m = true;
                  qd.$cfr$intArgs$a$e9dea5688aa5(102, 33);
                }
              }
            }
            if (var3_int >= ge.field_b &&
              var3_int < vb.field_i + ge.field_b &&
              var4 >= 9 &&
              var4 < 84 && (!ha.field_o ||
              this.field_B >= 10)) {
              param0.field_Eb = new String[1];
              param0.field_Eb[0] = kd.field_e;
              if (this.field_N == 1) {
                if (this.field_B == 10) {
                  this.field_B = 11;
                }
                this.a(param0, (byte) 69);
                qd.$cfr$intArgs$a$e9dea5688aa5(59, 32);
              }
            }
          }
          if (!param1) {
            this.field_e = (hk) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_1003_0 = var3;
          stackIn_1003_1 = new StringBuilder().append("e.A(");
          if (param0 == null) {
            stackIn_1004_2 = "null";
          } else {
            stackIn_1004_2 = "{...}";
          }
          throw qk.a((Throwable) (stackIn_1003_0), ((StringBuilder) (Object) stackIn_1003_1).append(stackIn_1004_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        boolean stackIn_11_1 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_33_0 = false;
        boolean stackIn_44_1 = false;
        boolean stackIn_55_0 = false;
        boolean stackIn_66_0 = false;
        r stackIn_163_0 = null;
        r stackIn_283_0 = null;
        r stackIn_283_1 = null;
        int stackIn_330_0 = 0;
        int stackIn_330_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        oh var4_ref_oh = null;
        int var4 = 0;
        int var5 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var3_intLifetime2Lifetime1;
        var5 = Terraphoenix.field_V;
        try {
          if (param1 == 64 &&
            mm.field_e >= 2) {
            stackIn_11_1 = !(this.field_I);
            this.field_I = stackIn_11_1;
          }
          if (param1 == 49 &&
            !ha.field_o) {
            stackIn_22_0 = !(d.field_H);
            d.field_H = stackIn_22_0;
          }
          if (param1 == 40 &&
            !ha.field_o) {
            stackIn_33_0 = !(ce.field_e);
            ce.field_e = stackIn_33_0;
          }
          if (wb.field_e == param1 &&
            !ha.field_o) {
            stackIn_44_1 = !(this.field_w);
            this.field_w = stackIn_44_1;
          }
          if (param1 == 32 &&
            mm.field_e >= 2) {
            stackIn_55_0 = !(g.field_tb);
            g.field_tb = stackIn_55_0;
          }
          if (param1 == 39 &&
            !ha.field_o) {
            stackIn_66_0 = !(fd.field_o);
            fd.field_o = stackIn_66_0;
          }
          if (this.field_J &&
            ~rh.field_c == ~param1 &&
            !this.field_q.field_S && (!ha.field_o ||
            11 <= this.field_B) && this.field_q.field_B == 0) {
            var3_int = this.field_q.g(12384);
            this.field_q.field_jb = this.field_q.field_jb - var3_int;
            this.field_q.field_B = 1;
            this.field_q.field_jb = this.field_q.field_jb - this.field_q.field_jb / 2;
            if (this.field_q.field_jb < 0) {
              this.field_q.field_jb = 0;
            }
            this.field_q.b(var3_int, (byte) -64);
          }
          if (this.field_J &&
            param1 == 35 &&
            !this.field_q.field_S && (!ha.field_o ||
            this.field_B >= 11) && 1 == this.field_q.field_B) {
            this.field_q.field_jb = this.field_q.field_jb + this.field_q.field_jb / 2;
            this.field_q.field_B = 0;
          }
          if (this.field_J &&
            param1 == 36 &&
            mm.field_e >= 2) {
            this.field_q.field_jb = this.field_q.field_v;
            kg.field_q = true;
          }
          if (this.field_J &&
            param1 == 56) {
            var3_intLifetime1 = 14;
            var4_ref_oh = this.field_q.field_nb;
            if (od.field_c[var4_ref_oh.field_g].field_o > var4_ref_oh.field_c &&
              this.field_q.field_jb >= var3_intLifetime1) {
              var4_ref_oh.a(0);
              qd.$cfr$intArgs$a$e9dea5688aa5(73, od.field_c[var4_ref_oh.field_g].field_n);
              this.field_q.field_jb = this.field_q.field_jb - var3_intLifetime1;
              this.field_q.b(var3_intLifetime1, (byte) -111);
              this.field_q.field_ab = 0;
            }
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (this.field_J &&
            param1 == 69 && (!ha.field_o ||
            this.field_B >= 7)) {
            this.b((byte) -3);
            var3_intLifetime2 = 0;
            var4 = 0;
            while (var4 < 12) {
              stackIn_283_0 = this.field_q;
              stackIn_283_1 = this.field_C[var4];
              if (var5 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_283_0 == stackIn_283_1) {
                var3_intLifetime2 = var4;
              }
              var4++;
            }
            if (decompiledFrameCompleted1) {
              var4Lifetime2 = 0;
              L30: while (true) {
                var3_intLifetime2++;
                if (var3_intLifetime2 >= 12) {
                  var3_intLifetime2 -= 12;
                }
                var4Lifetime2++;
                if (var4Lifetime2 < 12) {
                  if (null == this.field_C[var3_intLifetime2]) {
                    continue;
                  }
                  stackIn_163_0 = this.field_C[var3_intLifetime2];
                  if (var5 != 0) {
                    break L30;
                  }
                  if (stackIn_163_0.field_Z == null) {
                    continue;
                  }
                  if (this.field_C[var3_intLifetime2].field_jb <= 0) {
                    continue;
                  }
                  if (this.field_C[var3_intLifetime2].field_P <= 0) {
                    continue;
                  }
                }
                stackIn_163_0 = this.field_C[var3_intLifetime2];
                break;
              }
              if (stackIn_163_0 != null &&
                null != this.field_C[var3_intLifetime2].field_Z &&
                this.field_C[var3_intLifetime2].field_P > 0) {
                this.field_q = this.field_C[var3_intLifetime2];
                sj.field_b = 32 * (-this.field_q.field_H + this.field_q.field_F);
                eg.field_p = this.field_q.field_E;
                lg.field_c = (this.field_q.field_H + this.field_q.field_F) * 16 - this.field_q.field_E * 48;
              }
              if (this.field_B >= 7 &&
                this.field_B < 10) {
                this.field_B = this.field_B + 1;
              }
              this.a(-1);
              this.field_m = false;
              ok.field_i = true;
              this.field_L = 0;
            }
          }
          if (decompiledFrameCompleted1) {
            if (this.field_J &&
              param1 == ef.field_h && (!ha.field_o ||
              this.field_B >= 9)) {
              lg.field_c = 16 * (this.field_q.field_F + this.field_q.field_H) - this.field_q.field_E * 48;
              sj.field_b = 32 * (this.field_q.field_F - this.field_q.field_H);
              eg.field_p = this.field_q.field_E;
            }
            if (param0 != -106) {
              return;
            }
            if (this.field_J &&
              param1 == 80) {
              var3_intLifetime2Lifetime1 = 0;
              var4Lifetime1 = 0;
              while (0 == var4Lifetime1) {
                if (110 <= var3_intLifetime2Lifetime1) {
                  break;
                }
                this.field_s = this.field_s + 1;
                var3_intLifetime2Lifetime1++;
                if (this.field_s >= 100) {
                  this.field_s = 0;
                }
                if (this.field_C[this.field_s] == null) {
                  continue;
                }
                stackIn_330_0 = this.field_C[this.field_s].field_C;
                stackIn_330_1 = 1;
                if (var5 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_330_0 != stackIn_330_1) {
                  continue;
                }
                if (!this.field_h.a((byte) -93, this.field_q, this.field_C[this.field_s])) {
                  continue;
                }
                sj.field_b = 32 * (-this.field_C[this.field_s].field_H + this.field_C[this.field_s].field_F);
                var4Lifetime1 = 1;
                lg.field_c = -(48 * this.field_C[this.field_s].field_E) + (this.field_C[this.field_s].field_H + this.field_C[this.field_s].field_F) * 16;
                eg.field_p = this.field_C[this.field_s].field_E;
              }
            }
            if (decompiledFrameCompleted0) {
              if (this.field_J &&
                param1 == fl.field_b && (!ha.field_o ||
                this.field_B == 3 ||
                this.field_B >= 5)) {
                this.b((byte) -3);
                if (3 == this.field_B) {
                  this.field_B = 4;
                }
                if (this.field_m) {
                  this.field_m = false;
                  if (var5 != 0) {
                    this.field_L = 1 - this.field_L;
                  }
                } else {
                  this.field_L = 1 - this.field_L;
                }
                if (5 == this.field_B) {
                  this.field_B = 6;
                }
              }
              if (this.field_J &&
                param1 == 52 && (!ha.field_o ||
                14 <= this.field_B)) {
                this.b((byte) -3);
                if (null != this.field_q.field_b) {
                  if (!this.field_m) {
                    this.field_L = 1;
                    this.field_m = true;
                    if (var5 != 0) {
                      this.field_m = false;
                      this.field_L = 0;
                    }
                  } else {
                    this.field_m = false;
                    this.field_L = 0;
                  }
                }
              }
              decompiledFrameRemainder1 = (this.field_J);
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder1 = (param1 == 67)) &&
                (decompiledFrameRemainder1 = !(ha.field_o)) &&
                (decompiledFrameRemainder1 = !(this.field_q.field_jb <= 0))) {
                this.b((byte) -3);
                var3_intLifetime2Lifetime1 = this.field_q.field_U;
                this.field_q.a(true, uf.field_c, vf.field_a);
                decompiledFrameRemainder0 = (~this.field_q.field_U != ~var3_intLifetime2Lifetime1);
                if (decompiledFrameRemainder0) {
                  stackIn_283_0 = this.field_q;
                  stackIn_283_1 = this.field_q;
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            stackIn_283_0.field_jb = stackIn_283_1.field_jb - 1;
            this.field_q.field_ab = 0;
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameCompleted0)) {
            ok.field_i = true;
          }
          if (decompiledFrameCompleted0) {
            if (this.field_J &&
              param1 == 42 &&
              !g.field_tb && (!ha.field_o ||
              this.field_B >= 12)) {
              this.b((byte) -3);
              eg.field_p = eg.field_p - 1;
              if (this.field_B == 12) {
                this.field_B = 13;
              }
              if (eg.field_p < 0) {
                eg.field_p = 0;
              }
            }
            if (this.field_J &&
              43 == param1 &&
              !g.field_tb && (!ha.field_o ||
              this.field_B >= 12)) {
              this.b((byte) -3);
              if (this.field_B == 12) {
                this.field_B = 13;
              }
              eg.field_p = eg.field_p + 1;
              if (eg.field_p > 5) {
                eg.field_p = 5;
              }
            }
            stackIn_330_0 = 55;
            stackIn_330_1 = param1;
          }
          if (stackIn_330_0 == stackIn_330_1 &&
            mm.field_e >= 2) {
            this.a(true);
            this.a(this.field_G, (byte) -67);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "e.H(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_o = null;
          if (param0 != 20) {
            e.b(-97);
          }
          field_g = null;
          field_l = null;
          field_t = null;
          field_p = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "e.Q(" + param0 + ')');
        }
    }

    private final void a(int param0, Terraphoenix param1, boolean param2) {
        int incrementValue$0 = 0;
        r stackIn_70_0 = null;
        int stackIn_115_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_157_1 = 0;
        int stackIn_177_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_220_1 = 0;
        int stackIn_227_0 = 0;
        boolean stackIn_247_0 = false;
        Object stackIn_277_0 = null;
        Object stackIn_413_0 = null;
        dl stackIn_413_1 = null;
        boolean stackIn_431_0 = false;
        Object stackIn_437_0;
        dk stackIn_437_1;
        int stackIn_437_2;
        int stackIn_437_3;
        int stackIn_437_4;
        int stackIn_437_5;
        boolean stackIn_438_6 = false;
        int stackIn_453_0 = 0;
        int stackIn_457_1 = 0;
        int stackIn_489_0 = 0;
        int stackIn_489_1 = 0;
        boolean stackIn_496_0 = false;
        int stackIn_521_0 = 0;
        Object stackIn_649_0 = null;
        StringBuilder stackIn_649_1 = null;
        String stackIn_650_2 = null;
        RuntimeException decompiledCaughtException = null;
        r stackOut_69_0;
        Object var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        dl var9_ref_dl = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        dl var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = Terraphoenix.field_V;
        try {
          var4 = null;
          if (param0 != 22341) {
            this.a(95, (Terraphoenix) null, false);
          }
          var6 = 0;
          L2: while (true) {
            if (var6 < this.field_C.length) {
              if (null != this.field_C[var6] &&
                this.field_C[var6].field_Z == null && (param1.field_Bb != 0 ||
                this.field_C[var6].field_k ||
                this.field_C[var6].field_h ||
                this.field_B >= 16 ||
                !(fa.field_a <= 0)) && (this.field_C[var6].field_P > 0 &&
                !this.field_C[var6].field_Y)) {
                var4 = this.field_C[var6];
                break L2;
              }
              var6++;
              continue;
            }
            break;
          }
          var5 = null;
          if (null == var4) {
            var6 = 0;
            while (true) {
              if (var6 < 50) {
                if (var16 == 0) {
                  if (null != this.field_F[var6]) {
                    return;
                  }
                  var6++;
                  continue;
                }
              } else {
                this.a(param1, (byte) 99);
              }
              break;
            }
            if (var16 == 0) {
              return;
            }
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_D != var4) {
            var6 = 0;
            while (var6 < 50) {
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (this.field_F[var6] != null) {
                return;
              }
              var6++;
            }
          }
          if (decompiledFrameCompleted0) {
            ((r) (var4)).field_f = false;
          }
          this.field_D = (r) (var4);
          var6 = 0;
          var7 = 20000;
          if (null != ((r) (var4)).field_a &&
            0 >= ((r) (var4)).field_a.field_P) {
            ((r) (var4)).field_a = null;
            ((r) (var4)).field_w = 0;
          }
          var8 = 0;
          L15: while (true) {
            if (var8 < this.field_C.length) {
              stackOut_69_0 = this.field_C[var8];
              stackIn_277_0 = stackOut_69_0;
              stackIn_70_0 = stackOut_69_0;
              if (var16 == 0) {
                if (stackIn_70_0 != null &&
                  this.field_C[var8].field_P > 0 &&
                  ~((r) (var4)).field_C != ~this.field_C[var8].field_C && (this.field_C[var8].field_k ||
                  this.field_C[var8].field_h)) {
                  var9 = 1;
                  var10 = this.field_C[var8].field_F;
                  var11_int = this.field_C[var8].field_H;
                  if (!this.field_C[var8].field_k) {
                    var10 = this.field_C[var8].field_i;
                    var11_int = this.field_C[var8].field_gb;
                  }
                  ((r) (var4)).a(true, var10, var11_int);
                  var12 = this.field_h.a((byte) -93, (r) (var4), this.field_C[var8]) ? 1 : 0;
                  var13 = -((r) (var4)).field_F + var10;
                  var14 = -((r) (var4)).field_H + var11_int;
                  var15 = var13 * var13 + var14 * var14;
                  if (null != var5) {
                    if ((var12 != 0 ||
                      var6 != 0) &&
                      var12 == 0) {
                      if (var12 == 0) {
                        var9 = 0;
                      }
                    } else {
                      if (7 != param1.field_Bb) {
                        stackIn_115_0 = 0;
                        if (param1.field_db) {
                          stackIn_116_1 = 0;
                        } else {
                          stackIn_116_1 = 1;
                        }
                        if (stackIn_115_0 != stackIn_116_1) {
                          if (~((r) (var5)).field_E == ~((r) (var4)).field_E &&
                            ~this.field_C[var8].field_E != ~((r) (var4)).field_E &&
                            var12 == 0) {
                            var9 = 0;
                          }
                          if (((r) (var4)).field_E < ((r) (var5)).field_E &&
                            ((r) (var4)).field_E > this.field_C[var8].field_E &&
                            var12 == 0) {
                            var9 = 0;
                          }
                          if (var12 == 0 &&
                            this.field_C[var8].field_E < ((r) (var4)).field_E) {
                            var9 = 0;
                          }
                        }
                      }
                      if (var12 == 0 &&
                        ((r) (var4)).field_z == 1) {
                        stackIn_153_0 = (((r) (var4)).field_c.field_d) ? 0 : 1;
                        if (this.field_C[var8].field_c.field_d) {
                          stackIn_157_1 = 0;
                        } else {
                          stackIn_157_1 = 1;
                        }
                        if (stackIn_153_0 != stackIn_157_1 &&
                          !this.field_A) {
                          var9 = 0;
                        }
                      }
                      if (var12 == 0 &&
                        ((r) (var4)).field_z == 2 &&
                        this.field_C[var8].field_E < ((r) (var4)).field_E) {
                        stackIn_177_0 = (((r) (var4)).field_c.field_d) ? 0 : 1;
                        if (stackIn_177_0 == (this.field_C[var8].field_c.field_d ? 1 : 0) && (!this.field_A ||
                          param1.field_Bb != 6)) {
                          var9 = 0;
                        }
                      }
                      if (var12 == 0 &&
                        3 <= ((r) (var4)).field_z &&
                        this.field_C[var8].field_E < ((r) (var4)).field_E) {
                        var9 = 0;
                      }
                      if (var7 < var15) {
                        var9 = 0;
                      }
                    }
                  } else {
                    if (var12 == 0 &&
                      this.field_C[var8].field_E < ((r) (var4)).field_E) {
                      var9 = 0;
                    }
                    if (var12 == 0 &&
                      ((r) (var4)).field_z == 1) {
                      stackIn_216_0 = (this.field_C[var8].field_c.field_d) ? 0 : 1;
                      if (((r) (var4)).field_c.field_d) {
                        stackIn_220_1 = 0;
                      } else {
                        stackIn_220_1 = 1;
                      }
                      if (stackIn_216_0 != stackIn_220_1) {
                        stackIn_227_0 = (this.field_A) ? 0 : 1;
                        if (stackIn_227_0 == 1) {
                          var9 = 0;
                        }
                      }
                    }
                    if (var12 == 0 &&
                      2 == ((r) (var4)).field_z &&
                      ((r) (var4)).field_E > this.field_C[var8].field_E &&
                      this.field_C[var8].field_c.field_d != ((r) (var4)).field_c.field_d) {
                      stackIn_247_0 = !(this.field_A);
                      if (stackIn_247_0 ||
                        param1.field_Bb != 6) {
                        var9 = 0;
                      }
                    }
                    if (var12 == 0 &&
                      ((r) (var4)).field_z >= 3 &&
                      ((r) (var4)).field_E > this.field_C[var8].field_E) {
                      var9 = 0;
                    }
                  }
                  if (var9 != 0) {
                    var6 = var12;
                    var5 = this.field_C[var8];
                    var7 = var15;
                  }
                }
                var8++;
                continue;
              }
            } else {
              if (null != ((r) (var4)).field_a &&
                ((r) (var4)).field_a.field_P > 0 &&
                ((r) (var4)).field_a.field_k) {
                var8 = ((r) (var4)).field_a.field_F - ((r) (var4)).field_F;
                var9 = ((r) (var4)).field_a.field_H - ((r) (var4)).field_H;
                var10 = var9 * var9 + var8 * var8;
                var5 = ((r) (var4)).field_a;
                var6 = this.field_h.a((byte) -93, (r) (var4), (r) (var5)) ? 1 : 0;
                var7 = var10;
              }
              if (var6 != 0) {
                ((r) (var4)).field_a = (r) (var5);
                if (var16 == 0) {
                  break L15;
                }
              }
              stackIn_277_0 = var4;
            }
            ((r) (stackIn_277_0)).field_a = null;
            break;
          }
          var7 = (int)Math.sqrt((double)var7);
          if (0 == ((r) (var4)).field_w) {
            var8 = od.field_c[((r) (var4)).field_nb.field_g].field_m;
            if ((0 == var8 ||
              1 == var8 &&
              10.0 > Math.random() * 100.0) && ((r) (var4)).field_B == 1) {
              ((r) (var4)).field_B = 0;
              ((r) (var4)).field_jb = ((r) (var4)).field_jb * 3 / 2;
            }
            if (var8 == 4 &&
              ((r) (var4)).field_B == 1 &&
              ((r) (var4)).field_mb > ((r) (var4)).field_P) {
              ((r) (var4)).field_jb = ((r) (var4)).field_jb * 3 / 2;
              ((r) (var4)).field_B = 0;
            }
            if (var5 != null) {
              if (var6 != 0) {
                ((r) (var4)).field_w = 3;
                if (1 == var8) {
                  ((r) (var4)).field_w = 4;
                  if (((r) (var4)).field_ab == 0 &&
                    (double)var7 > Math.random() * 10.0 + 10.0) {
                    ((r) (var4)).field_w = 3;
                  }
                }
                if (var8 == 2) {
                  ((r) (var4)).field_w = 4;
                }
                if (3 == var8) {
                  ((r) (var4)).field_w = 5;
                }
                if (!(((r) (var4)).field_z < 2)) {
                  ((r) (var4)).field_w = 5;
                  if (var16 != 0) {
                    ((r) (var4)).field_w = 2;
                    ((r) (var4)).field_w = 1;
                    var6 = 0;
                  }
                }
              } else {
                ((r) (var4)).field_w = 2;
                if (var16 != 0) {
                  ((r) (var4)).field_w = 1;
                  var6 = 0;
                }
              }
            } else {
              ((r) (var4)).field_w = 1;
              var6 = 0;
            }
          }
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          var8 = ((r) (var4)).field_w;
          if (var8 == 0) {
            ((r) (var4)).field_Y = true;
          } else {
            if (var8 != 1) {
              decompiledFrameRemainder2 = (2 != var8 ||
                var16 != 0);
              if (((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder2 = (var8 != 3 ||
                var16 != 0))) &&
                (decompiledFrameRemainder3 = (var8 != 4)) &&
                (decompiledFrameRemainder4 = (var8 != 5))) {
                return;
              }
            }
          }
          if ((decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            if (7 == ((r) (var4)).field_t) {
              ((r) (var4)).field_Y = true;
              return;
            }
            if (param2) {
              return;
            }
            if (var6 != 0 &&
              null != var5 &&
              ((r) (var5)).field_P > 0) {
              if (var6 != 0 ||
                var5 != null &&
                !(((r) (var5)).field_P <= 0)) {
                ((r) (var4)).field_w = 4;
                if (var16 == 0) {
                  return;
                }
              }
              ((r) (var4)).field_Y = true;
              if (var16 == 0) {
                return;
              }
            }
            boolean decompiledFrameRemainder1 = true;
            if ((!(Math.abs(((r) (var4)).field_X - ((r) (var4)).field_F) < 2) ||
              !(Math.abs(-((r) (var4)).field_H + ((r) (var4)).field_n) < 2)) &&
              null != this.field_h.a(false, ((r) (var4)).field_X, ((r) (var4)).field_E, ((r) (var4)).field_F, ((r) (var4)).field_n, ((r) (var4)).field_H, 86)) {
              ((r) (var4)).field_A = 0;
              ((r) (var4)).field_d = ((r) (var4)).field_B;
              ((r) (var4)).field_S = true;
              decompiledFrameRemainder1 = (var16 != 0);
            }
            if (decompiledFrameRemainder1) {
              ((r) (var4)).field_A = 0;
              ((r) (var4)).field_S = true;
              ((r) (var4)).field_d = ((r) (var4)).field_B;
              var8 = 0;
              var10 = 0;
              L67: while (true) {
                ((r) (var4)).field_X = 4 + (int)(Math.random() * (double)(this.field_h.field_b - 8));
                ((r) (var4)).field_n = 4 + (int)(Math.random() * (double)(-8 + this.field_h.field_e));
                ((r) (var4)).field_N = ((r) (var4)).field_E;
                if (((r) (var4)).field_z == 2) {
                  ((r) (var4)).field_N = 1;
                }
                if (((r) (var4)).field_z == 3) {
                  ((r) (var4)).field_N = 2;
                }
                if (4 == ((r) (var4)).field_z) {
                  ((r) (var4)).field_N = 4;
                }
                var9_ref_dl = this.field_h.a(-115, ((r) (var4)).field_n, ((r) (var4)).field_E, ((r) (var4)).field_X);
                ((r) (var4)).field_c.field_h = null;
                stackIn_413_0 = null;
                stackIn_413_1 = var9_ref_dl;
                do {
                  if (stackIn_413_0 != stackIn_413_1 && (~((r) (var4)).field_X != ~((r) (var4)).field_F ||
                    ((r) (var4)).field_n != ((r) (var4)).field_H)) {
                    var8 = 1;
                    if (0 == ((r) (var4)).field_z &&
                      var9_ref_dl.field_d) {
                      var8 = 0;
                    }
                  }
                  stackIn_431_0 = (var8 == 0);
                  if (!stackIn_431_0) {
                    stackIn_437_0 = null;
                    stackIn_437_1 = this.field_h;
                    stackIn_437_2 = ((r) (var4)).field_n;
                    stackIn_437_3 = ((r) (var4)).field_H;
                    stackIn_437_4 = ((r) (var4)).field_F;
                    stackIn_437_5 = ((r) (var4)).field_N;
                    stackIn_438_6 = !(((r) (var4)).field_C <= 0);
                    if (stackIn_437_0 == ((dk) (Object) stackIn_437_1).a(stackIn_437_2, stackIn_437_3, stackIn_437_4, stackIn_437_5, stackIn_438_6, ((r) (var4)).field_X, ((r) (var4)).field_E, true)) {
                      var8 = 0;
                    }
                  }
                  ((r) (var4)).field_c.field_h = (r) (var4);
                  var10++;
                  if (25 < var10) {
                    var8 = 1;
                    ((r) (var4)).field_Y = true;
                    ((r) (var4)).field_S = false;
                  }
                  if (0 == var8) {
                    continue L67;
                  }
                  stackIn_413_0 = null;
                  stackIn_413_1 = var9_ref_dl;
                } while (var16 != 0);
                break;
              }
              if (stackIn_413_0 != stackIn_413_1) {
                stackIn_453_0 = (var9_ref_dl.field_d) ? 0 : 1;
                if (((r) (var4)).field_c.field_d) {
                  stackIn_457_1 = 0;
                } else {
                  stackIn_457_1 = 1;
                }
                if (stackIn_453_0 != stackIn_457_1) {
                  ((r) (var4)).field_Y = true;
                  ((r) (var4)).field_S = false;
                }
              }
              ((r) (var4)).field_r = null;
              ((r) (var4)).field_w = 0;
            }
            if (!((double)((r) (var4)).field_jb < (double)((r) (var4)).field_v * Math.random())) {
              return;
            }
            if (!param2) {
              this.a(false, (r) (var4));
            }
            ((r) (var4)).field_Y = true;
            if (var16 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            if (((r) (var4)).field_t == 7) {
              ((r) (var4)).field_Y = true;
              return;
            }
            if (((r) (var4)).field_w != 3) {
            }
            if (null == var5) {
              ((r) (var4)).field_w = 0;
              if (var16 == 0) {
                return;
              }
            }
            if (!param2) {
              ((r) (var4)).field_A = 0;
              ((r) (var4)).field_d = ((r) (var4)).field_B;
              ((r) (var4)).field_S = true;
              var8 = 0;
              var9 = 0;
              L85: while (true) {
                var8 = 1;
                var10 = 0;
                var11 = null;
                L86: while (true) {
                  ((r) (var4)).field_X = ((r) (var5)).field_F + (int)(9.0 * Math.random() - 4.0);
                  ((r) (var4)).field_n = ((r) (var5)).field_H + (int)(9.0 * Math.random() - 4.0);
                  ((r) (var4)).field_N = ((r) (var5)).field_E;
                  var11_ref = ((r) (var4)).field_c.field_s.a(-82, ((r) (var4)).field_n, ((r) (var4)).field_N, ((r) (var4)).field_X);
                  incrementValue$0 = var10;
                  var10++;
                  stackIn_489_0 = ~incrementValue$0;
                  stackIn_489_1 = -6;
                  do {
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_489_0 > stackIn_489_1) {
                      if (null == var11_ref) {
                        continue L86;
                      }
                      stackIn_496_0 = var11_ref.field_z;
                      decompiledFrameRemainder0 = (var16 == 0);
                      if ((decompiledFrameRemainder0) &&
                        (!stackIn_496_0)) {
                        continue L86;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      stackIn_496_0 = ((r) (var5)).field_k;
                    }
                    if (!stackIn_496_0) {
                      ((r) (var4)).field_X = ((r) (var5)).field_i + (int)(-4.0 + Math.random() * 9.0);
                      ((r) (var4)).field_n = ((r) (var5)).field_gb + (int)(9.0 * Math.random() - 4.0);
                      ((r) (var4)).field_N = ((r) (var5)).field_R;
                    }
                    ((r) (var4)).field_c.field_h = null;
                    ((r) (var4)).field_r = null;
                    if (((r) (var4)).field_C == 0) {
                      ((r) (var4)).field_r = this.field_h.a(((r) (var4)).field_n, ((r) (var4)).field_H, ((r) (var4)).field_F, ((r) (var4)).field_N, false, ((r) (var4)).field_X, ((r) (var4)).field_E, true);
                      if (((r) (var4)).field_r == null) {
                        var8 = 0;
                        if (var16 != 0) {
                          this.field_h.b((byte) 75);
                          ((r) (var4)).field_r = this.field_h.a(((r) (var4)).field_n, ((r) (var4)).field_N, ((r) (var4)).field_X, ((r) (var4)).field_E, ((r) (var4)).field_H, ((r) (var4)).field_F, true);
                          if (null == ((r) (var4)).field_r) {
                            var8 = 0;
                          }
                        }
                      }
                    } else {
                      this.field_h.b((byte) 75);
                      ((r) (var4)).field_r = this.field_h.a(((r) (var4)).field_n, ((r) (var4)).field_N, ((r) (var4)).field_X, ((r) (var4)).field_E, ((r) (var4)).field_H, ((r) (var4)).field_F, true);
                      if (null == ((r) (var4)).field_r) {
                        var8 = 0;
                      }
                    }
                    ((r) (var4)).field_c.field_h = (r) (var4);
                    var9++;
                    if (var9 > 25) {
                      ((r) (var4)).field_w = 1;
                      var8 = 1;
                      if (od.field_c[((r) (var4)).field_nb.field_g].field_m > 1) {
                        ((r) (var4)).field_Y = true;
                      }
                      ((r) (var4)).field_X = ((r) (var4)).field_F;
                      ((r) (var4)).field_S = false;
                      ((r) (var4)).field_n = ((r) (var4)).field_H;
                    }
                    stackIn_521_0 = (var8 != 0) ? 0 : 1;
                    if (stackIn_521_0 == 1) {
                      continue L85;
                    }
                    stackIn_489_0 = 2;
                    stackIn_489_1 = ((r) (var4)).field_w;
                  } while (var16 != 0);
                  break;
                }
                break;
              }
              if (stackIn_489_0 == stackIn_489_1 &&
                var6 != 0) {
                ((r) (var4)).field_S = false;
                ((r) (var4)).field_w = 0;
                ((r) (var4)).field_X = ((r) (var4)).field_F;
                ((r) (var4)).field_n = ((r) (var4)).field_H;
              }
            }
            var8 = (int)(10.0 * Math.random() + 10.0);
            if (((r) (var4)).field_t == 9) {
              ((r) (var4)).field_ab = 0;
              var8 = 2;
            }
            if (3 == ((r) (var4)).field_w && (var8 > var7 ||
              !(((r) (var4)).field_ab <= 0)) && var6 != 0 && (!(((r) (var4)).field_jb < ((r) (var4)).c(false)) ||
              !(((r) (var4)).field_jb <= 10))) {
              if (var5 != null) {
                ((r) (var4)).field_N = ((r) (var5)).field_E;
                ((r) (var4)).field_n = ((r) (var5)).field_H;
                ((r) (var4)).field_A = 0;
                ((r) (var4)).field_d = 2;
                ((r) (var4)).field_S = true;
                ((r) (var4)).field_X = ((r) (var5)).field_F;
                if ((!(this.a((byte) -60, (r) (var5), (r) (var4)) >= 8)) &&
                  (null != ((r) (var4)).field_b)) {
                  ((r) (var4)).field_d = 4;
                  if (var16 != 0) {
                    ((r) (var4)).field_w = 0;
                  }
                }
              } else {
                ((r) (var4)).field_w = 0;
              }
            }
            if (var16 == 0) {
              return;
            }
          }
          if (decompiledFrameRemainder4) {
            if (((r) (var4)).field_jb > ((r) (var4)).c(false)) {
              if (var5 == null ||
                !(((r) (var5)).field_P > 0)) {
                ((r) (var4)).field_w = 0;
                if (var16 == 0) {
                  return;
                }
              }
              ((r) (var4)).field_n = ((r) (var5)).field_H;
              ((r) (var4)).field_X = ((r) (var5)).field_F;
              ((r) (var4)).field_S = true;
              ((r) (var4)).field_A = 0;
              ((r) (var4)).field_d = 2;
              ((r) (var4)).field_N = ((r) (var5)).field_E;
              if (this.a((byte) -60, (r) (var5), (r) (var4)) >= 8) {
                return;
              }
              if (null == ((r) (var4)).field_b) {
                return;
              }
              ((r) (var4)).field_d = 4;
              if (var16 == 0) {
                return;
              }
            }
            if (param2) {
              return;
            }
            if (((r) (var4)).field_t == 7) {
              ((r) (var4)).field_Y = true;
              return;
            }
            this.a(false, (r) (var4));
            if (var16 == 0) {
              return;
            }
          }
          if (var6 == 0 ||
            !(((r) (var4)).field_jb >= ((r) (var4)).c(false)) &&
            !(((r) (var4)).field_ab > 0) &&
            !(((r) (var4)).field_jb > 10)) {
            if (param2) {
              return;
            }
            if (7 == ((r) (var4)).field_t) {
              ((r) (var4)).field_Y = true;
              return;
            }
            this.a(false, (r) (var4));
            if (var16 == 0) {
              return;
            }
          }
          if (((r) (var4)).field_jb < ((r) (var4)).c(false) &&
            ((r) (var4)).field_jb <= 10) {
            if (param2) {
              return;
            }
            if (((r) (var4)).field_t == 7) {
              ((r) (var4)).field_Y = true;
              return;
            }
            this.a(false, (r) (var4));
            if (var16 == 0) {
              return;
            }
          }
          if (null == var5) {
            ((r) (var4)).field_w = 0;
            if (var16 == 0) {
              return;
            }
          }
          ((r) (var4)).field_d = 2;
          ((r) (var4)).field_S = true;
          ((r) (var4)).field_A = 0;
          ((r) (var4)).field_N = ((r) (var5)).field_E;
          ((r) (var4)).field_X = ((r) (var5)).field_F;
          ((r) (var4)).field_n = ((r) (var5)).field_H;
          if (this.a((byte) -60, (r) (var5), (r) (var4)) >= 8) {
            return;
          }
          if (((r) (var4)).field_b == null) {
            return;
          }
          ((r) (var4)).field_d = 4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_649_0 = var4;
          stackIn_649_1 = new StringBuilder().append("e.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_650_2 = "null";
          } else {
            stackIn_650_2 = "{...}";
          }
          throw qk.a((Throwable) (stackIn_649_0), ((StringBuilder) (Object) stackIn_649_1).append(stackIn_650_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(gi param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Terraphoenix.field_V;
        try {
          if (param1 != -51) {
            this.a((Terraphoenix) null, false);
          }
          var3_int = 0;
          while (var3_int < 50) {
            if (var4 != 0) {
              return;
            }
            if (this.field_F[var3_int] == null) {
              this.field_F[var3_int] = param0;
              return;
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("e.J(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          if (param0 != -1) {
            return;
          }
          var2_int = 0;
          while (this.field_C.length > var2_int) {
            if (var3 != 0) {
              return;
            }
            if (this.field_C[var2_int] != null &&
              null == this.field_C[var2_int].field_Z &&
              this.field_C[var2_int].field_P > 0) {
              if (!this.field_h.a((byte) -93, this.field_q, this.field_C[var2_int])) {
                this.field_C[var2_int].field_ib = false;
              } else {
                this.field_C[var2_int].field_ib = true;
              }
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "e.B(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ci param3, boolean param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$16 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int stackIn_203_0 = 0;
        int stackIn_216_0 = 0;
        RuntimeException stackIn_221_0 = null;
        StringBuilder stackIn_221_1 = null;
        String stackIn_222_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var20 = 0;
        int stackIn_59_0Lifetime1;
        int stackIn_59_1Lifetime1;
        int stackIn_71_0Lifetime1;
        int stackIn_71_1Lifetime1;
        int stackIn_128_0Lifetime1;
        int stackIn_128_0Lifetime2;
        int stackIn_128_1Lifetime1;
        int stackIn_128_1Lifetime2;
        int stackIn_158_0Lifetime1;
        int stackIn_158_1Lifetime1;
        int stackIn_167_0Lifetime1;
        int stackIn_167_1Lifetime1;
        int stackIn_203_0Lifetime1;
        int stackIn_216_0Lifetime1;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var7_intLifetime2;
        int var8Lifetime3;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var8Lifetime2Lifetime1;
        int var8Lifetime2Lifetime2;
        int var9Lifetime2Lifetime1;
        int var9Lifetime2Lifetime2;
        int var16Lifetime4Lifetime1;
        int var16Lifetime4Lifetime2;
        var20 = Terraphoenix.field_V;
        try {
          if (param5 != 28144) {
            this.a(42, 90);
          }
          boolean decompiledFrameRemainder0 = true;
          if (!param4) {
            var7_int = param0;
            var8 = param1;
            var7_int = var7_int + param3.field_p;
            var8 = var8 + param3.field_v;
            var9 = 0;
            var10 = param0 + param3.field_p;
            var11 = param3.field_v + param1;
            var12 = param3.field_t;
            var13 = param3.field_r;
            var14 = 0;
            if (l.field_d > var8) {
              var15 = l.field_d - var8;
              var11 = var11 + var15;
              var8 = l.field_d;
              var9 = var9 + var13 * var15;
              var12 = var12 - var15;
            }
            if ((var8 + var12) > l.field_c) {
              var12 = var12 - (var12 + (var8 - l.field_c));
            }
            if (l.field_b > var7_int) {
              var15Lifetime2 = l.field_b - var7_int;
              var7_int = l.field_b;
              var13 = var13 - var15Lifetime2;
              var14 = var14 + var15Lifetime2;
              var10 = var10 + var15Lifetime2;
              var9 = var9 + var15Lifetime2;
            }
            if (var7_int + var13 > l.field_f) {
              var15Lifetime3 = -l.field_f + (var7_int + var13);
              var14 = var14 + var15Lifetime3;
              var13 = var13 - var15Lifetime3;
            }
            if (0 < var13 &&
              var12 > 0) {
              var16 = var10;
              var17 = var11;
              var18 = -(var13 >> 2);
              var13 = -(var13 & 3);
              var8Lifetime3 = -var12;
              while (var8Lifetime3 < 0) {
                if (var20 != 0) {
                  return;
                }
                var7_intLifetime2 = var18;
                while (var7_intLifetime2 < 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var15Lifetime4 = param3.field_z[incrementValue$0];
                  stackIn_59_0 = ~var15Lifetime4;
                  stackIn_59_1 = -1;
                  if (stackIn_59_0 != stackIn_59_1) {
                    incrementValue$3 = var16;
                    var16++;
                    gd.field_a[incrementValue$3][var17] = param2 * 144 + var17;
                  } else {
                    var16++;
                  }
                  incrementValue$4 = var9;
                  var9++;
                  var15Lifetime4 = param3.field_z[incrementValue$4];
                  if (var15Lifetime4 != 0) {
                    incrementValue$5 = var16;
                    var16++;
                    gd.field_a[incrementValue$5][var17] = param2 * 144 + var17;
                  } else {
                    var16++;
                  }
                  incrementValue$6 = var9;
                  var9++;
                  var15Lifetime4 = param3.field_z[incrementValue$6];
                  if (var15Lifetime4 != 0) {
                    incrementValue$7 = var16;
                    var16++;
                    gd.field_a[incrementValue$7][var17] = 144 * param2 + var17;
                  } else {
                    var16++;
                  }
                  incrementValue$8 = var9;
                  var9++;
                  var15Lifetime4 = param3.field_z[incrementValue$8];
                  if (0 == var15Lifetime4) {
                    var16++;
                  } else {
                    incrementValue$9 = var16;
                    var16++;
                    gd.field_a[incrementValue$9][var17] = 144 * param2 + var17;
                  }
                  var7_intLifetime2++;
                }
                var7_intLifetime2 = var13;
                while (true) {
                  stackIn_59_0Lifetime1 = ~var7_intLifetime2;
                  stackIn_59_1Lifetime1 = -1;
                  if (stackIn_59_0Lifetime1 <= stackIn_59_1Lifetime1) {
                    break;
                  }
                  incrementValue$1 = var9;
                  var9++;
                  var15Lifetime4 = param3.field_z[incrementValue$1];
                  stackIn_71_0 = 0;
                  stackIn_71_1 = var15Lifetime4;
                  if (stackIn_71_0 == stackIn_71_1) {
                    var16++;
                  } else {
                    incrementValue$2 = var16;
                    var16++;
                    gd.field_a[incrementValue$2][var17] = var17 + param2 * 144;
                  }
                  var7_intLifetime2++;
                }
                var16 = var10;
                stackIn_71_0Lifetime1 = var9;
                stackIn_71_1Lifetime1 = var14;
                var9 = stackIn_71_0Lifetime1 + stackIn_71_1Lifetime1;
                var17++;
                var8Lifetime3++;
              }
              if (var20 == 0) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              return;
            }
          }
          var7_intLifetime1 = -16 + (param3.field_u + param2 * 144);
          if (60 == param3.field_u) {
            var7_intLifetime1 = param2 * 144 + (param3.field_u - 12);
          }
          var8Lifetime1 = param0;
          var8Lifetime1 = var8Lifetime1 + param3.field_p;
          var9Lifetime1 = param1;
          var9Lifetime1 = var9Lifetime1 + param3.field_v;
          var10Lifetime1 = 0;
          var11Lifetime1 = param3.field_p + param0;
          var12Lifetime1 = param3.field_v + param1;
          var13Lifetime1 = param3.field_t;
          var14Lifetime1 = param3.field_r;
          var15Lifetime1 = 0;
          if (var9Lifetime1 < l.field_d) {
            var16Lifetime1 = l.field_d - var9Lifetime1;
            var9Lifetime1 = l.field_d;
            var10Lifetime1 = var10Lifetime1 + var16Lifetime1 * var14Lifetime1;
            var12Lifetime1 = var12Lifetime1 + var16Lifetime1;
            var13Lifetime1 = var13Lifetime1 - var16Lifetime1;
          }
          if (l.field_b > var8Lifetime1) {
            var16Lifetime2 = -var8Lifetime1 + l.field_b;
            var8Lifetime1 = l.field_b;
            var10Lifetime1 = var10Lifetime1 + var16Lifetime2;
            var15Lifetime1 = var15Lifetime1 + var16Lifetime2;
            var11Lifetime1 = var11Lifetime1 + var16Lifetime2;
            var14Lifetime1 = var14Lifetime1 - var16Lifetime2;
          }
          if (var13Lifetime1 + var9Lifetime1 > l.field_c) {
            var13Lifetime1 = var13Lifetime1 - (-l.field_c + var9Lifetime1 + var13Lifetime1);
          }
          if (var14Lifetime1 + var8Lifetime1 > l.field_f) {
            var16Lifetime3 = var8Lifetime1 + var14Lifetime1 - l.field_f;
            var14Lifetime1 = var14Lifetime1 - var16Lifetime3;
            var15Lifetime1 = var15Lifetime1 + var16Lifetime3;
          }
          if (var14Lifetime1 > 0 &&
            var13Lifetime1 > 0) {
            var17Lifetime1 = var11Lifetime1;
            var18Lifetime1 = var12Lifetime1;
            if (param3.field_u == 112 ||
              param3.field_u == 60) {
              var19 = -(var14Lifetime1 >> 2);
              var14Lifetime1 = -(var14Lifetime1 & 3);
              var9Lifetime2 = -var13Lifetime1;
              while (var9Lifetime2 < 0) {
                if (var20 != 0) {
                  return;
                }
                var8Lifetime2 = var19;
                while (0 > var8Lifetime2) {
                  incrementValue$10 = var10Lifetime1;
                  var10Lifetime1++;
                  var16Lifetime4 = param3.field_z[incrementValue$10];
                  stackIn_128_0 = ~var16Lifetime4;
                  stackIn_128_1 = -1;
                  if (stackIn_128_0 != stackIn_128_1) {
                    gd.field_a[var17Lifetime1][var18Lifetime1] = Math.abs(var17Lifetime1 - param0 - param3.field_q) / 2 + var7_intLifetime1 + param1;
                  }
                  var17Lifetime1++;
                  incrementValue$11 = var10Lifetime1;
                  var10Lifetime1++;
                  var16Lifetime4 = param3.field_z[incrementValue$11];
                  if (var16Lifetime4 != 0) {
                    gd.field_a[var17Lifetime1][var18Lifetime1] = Math.abs(-param3.field_q + (var17Lifetime1 - param0)) / 2 + (var7_intLifetime1 + param1);
                  }
                  incrementValue$12 = var10Lifetime1;
                  var10Lifetime1++;
                  var16Lifetime4 = param3.field_z[incrementValue$12];
                  var17Lifetime1++;
                  if (var16Lifetime4 != 0) {
                    gd.field_a[var17Lifetime1][var18Lifetime1] = param1 + var7_intLifetime1 + Math.abs(var17Lifetime1 - (param0 + param3.field_q)) / 2;
                  }
                  incrementValue$13 = var10Lifetime1;
                  var10Lifetime1++;
                  var16Lifetime4 = param3.field_z[incrementValue$13];
                  var17Lifetime1++;
                  if (var16Lifetime4 != 0) {
                    gd.field_a[var17Lifetime1][var18Lifetime1] = Math.abs(-param0 + (var17Lifetime1 - param3.field_q)) / 2 + param1 + var7_intLifetime1;
                  }
                  var17Lifetime1++;
                  var8Lifetime2++;
                }
                var8Lifetime2 = var14Lifetime1;
                while (var8Lifetime2 < 0) {
                  incrementValue$14 = var10Lifetime1;
                  var10Lifetime1++;
                  var16Lifetime4 = param3.field_z[incrementValue$14];
                  stackIn_128_0Lifetime1 = 0;
                  stackIn_128_1Lifetime1 = var16Lifetime4;
                  if (stackIn_128_0Lifetime1 != stackIn_128_1Lifetime1) {
                    gd.field_a[var17Lifetime1][var18Lifetime1] = Math.abs(-param0 + var17Lifetime1 - param3.field_q) / 2 + (var7_intLifetime1 + param1);
                  }
                  var17Lifetime1++;
                  var8Lifetime2++;
                }
                var17Lifetime1 = var11Lifetime1;
                stackIn_128_0Lifetime2 = var10Lifetime1;
                stackIn_128_1Lifetime2 = var15Lifetime1;
                var10Lifetime1 = stackIn_128_0Lifetime2 + stackIn_128_1Lifetime2;
                var18Lifetime1++;
                var9Lifetime2++;
              }
              if (var20 == 0) {
                return;
              }
            }
            if (~param0 == ~var17Lifetime1) {
              var19Lifetime1 = -(var14Lifetime1 >> 2);
              var14Lifetime1 = -(3 & var14Lifetime1);
              var9Lifetime2Lifetime1 = -var13Lifetime1;
              while (var9Lifetime2Lifetime1 < 0) {
                if (var20 != 0) {
                  return;
                }
                var8Lifetime2Lifetime1 = var19Lifetime1;
                while (var8Lifetime2Lifetime1 < 0) {
                  incrementValue$15 = var10Lifetime1;
                  var10Lifetime1++;
                  var16Lifetime4Lifetime1 = param3.field_z[incrementValue$15];
                  stackIn_158_0 = -1;
                  stackIn_158_1 = ~var16Lifetime4Lifetime1;
                  if (stackIn_158_0 != stackIn_158_1) {
                    gd.field_a[var17Lifetime1][var18Lifetime1] = var7_intLifetime1 + param1 - (var17Lifetime1 - param0) / 2;
                  }
                  var17Lifetime1++;
                  incrementValue$17 = var10Lifetime1;
                  var10Lifetime1++;
                  var16Lifetime4Lifetime1 = param3.field_z[incrementValue$17];
                  if (var16Lifetime4Lifetime1 != 0) {
                    gd.field_a[var17Lifetime1][var18Lifetime1] = param1 + var7_intLifetime1 - (var17Lifetime1 - param0) / 2;
                  }
                  var17Lifetime1++;
                  incrementValue$18 = var10Lifetime1;
                  var10Lifetime1++;
                  var16Lifetime4Lifetime1 = param3.field_z[incrementValue$18];
                  if (0 != var16Lifetime4Lifetime1) {
                    gd.field_a[var17Lifetime1][var18Lifetime1] = var7_intLifetime1 + (param1 - (-param0 + var17Lifetime1) / 2);
                  }
                  var17Lifetime1++;
                  incrementValue$19 = var10Lifetime1;
                  var10Lifetime1++;
                  var16Lifetime4Lifetime1 = param3.field_z[incrementValue$19];
                  if (var16Lifetime4Lifetime1 != 0) {
                    gd.field_a[var17Lifetime1][var18Lifetime1] = var7_intLifetime1 + param1 - (-param0 + var17Lifetime1) / 2;
                  }
                  var17Lifetime1++;
                  var8Lifetime2Lifetime1++;
                }
                var8Lifetime2Lifetime1 = var14Lifetime1;
                while (true) {
                  stackIn_158_0Lifetime1 = 0;
                  stackIn_158_1Lifetime1 = var8Lifetime2Lifetime1;
                  if (stackIn_158_0Lifetime1 <= stackIn_158_1Lifetime1) {
                    break;
                  }
                  incrementValue$16 = var10Lifetime1;
                  var10Lifetime1++;
                  var16Lifetime4Lifetime1 = param3.field_z[incrementValue$16];
                  stackIn_167_0 = -1;
                  stackIn_167_1 = ~var16Lifetime4Lifetime1;
                  if (stackIn_167_0 != stackIn_167_1) {
                    gd.field_a[var17Lifetime1][var18Lifetime1] = -((-param0 + var17Lifetime1) / 2) + var7_intLifetime1 + param1;
                  }
                  var17Lifetime1++;
                  var8Lifetime2Lifetime1++;
                }
                var17Lifetime1 = var11Lifetime1;
                var18Lifetime1++;
                stackIn_167_0Lifetime1 = var10Lifetime1;
                stackIn_167_1Lifetime1 = var15Lifetime1;
                var10Lifetime1 = stackIn_167_0Lifetime1 + stackIn_167_1Lifetime1;
                var9Lifetime2Lifetime1++;
              }
              if (var20 == 0) {
                return;
              }
            }
            var19Lifetime2 = -(var14Lifetime1 >> 2);
            var14Lifetime1 = -(3 & var14Lifetime1);
            var9Lifetime2Lifetime2 = -var13Lifetime1;
            while (true) {
              if (var9Lifetime2Lifetime2 >= 0) {
                return;
              }
              if (var20 != 0) {
                return;
              }
              var8Lifetime2Lifetime2 = var19Lifetime2;
              while (var8Lifetime2Lifetime2 < 0) {
                incrementValue$20 = var10Lifetime1;
                var10Lifetime1++;
                var16Lifetime4Lifetime2 = param3.field_z[incrementValue$20];
                stackIn_203_0 = var16Lifetime4Lifetime2;
                if (stackIn_203_0 != 0) {
                  incrementValue$21 = var17Lifetime1;
                  var17Lifetime1++;
                  gd.field_a[incrementValue$21][var18Lifetime1] = param1 + (var7_intLifetime1 - (64 + (-var17Lifetime1 + param0)) / 2);
                } else {
                  var17Lifetime1++;
                }
                incrementValue$22 = var10Lifetime1;
                var10Lifetime1++;
                var16Lifetime4Lifetime2 = param3.field_z[incrementValue$22];
                if (var16Lifetime4Lifetime2 != 0) {
                  incrementValue$23 = var17Lifetime1;
                  var17Lifetime1++;
                  gd.field_a[incrementValue$23][var18Lifetime1] = -((64 - var17Lifetime1 + param0) / 2) + var7_intLifetime1 + param1;
                } else {
                  var17Lifetime1++;
                }
                incrementValue$24 = var10Lifetime1;
                var10Lifetime1++;
                var16Lifetime4Lifetime2 = param3.field_z[incrementValue$24];
                if (var16Lifetime4Lifetime2 == 0) {
                  var17Lifetime1++;
                } else {
                  incrementValue$25 = var17Lifetime1;
                  var17Lifetime1++;
                  gd.field_a[incrementValue$25][var18Lifetime1] = param1 + var7_intLifetime1 - (param0 - var17Lifetime1 + 64) / 2;
                }
                incrementValue$26 = var10Lifetime1;
                var10Lifetime1++;
                var16Lifetime4Lifetime2 = param3.field_z[incrementValue$26];
                if (var16Lifetime4Lifetime2 != 0) {
                  incrementValue$27 = var17Lifetime1;
                  var17Lifetime1++;
                  gd.field_a[incrementValue$27][var18Lifetime1] = -((64 - var17Lifetime1 + param0) / 2) + (var7_intLifetime1 + param1);
                } else {
                  var17Lifetime1++;
                }
                var8Lifetime2Lifetime2++;
              }
              stackIn_203_0Lifetime1 = var14Lifetime1;
              var8Lifetime2Lifetime2 = stackIn_203_0Lifetime1;
              while (var8Lifetime2Lifetime2 < 0) {
                incrementValue$28 = var10Lifetime1;
                var10Lifetime1++;
                var16Lifetime4Lifetime2 = param3.field_z[incrementValue$28];
                stackIn_216_0 = var16Lifetime4Lifetime2;
                if (stackIn_216_0 == 0) {
                  var17Lifetime1++;
                } else {
                  incrementValue$29 = var17Lifetime1;
                  var17Lifetime1++;
                  gd.field_a[incrementValue$29][var18Lifetime1] = -((param0 - var17Lifetime1 + 64) / 2) + param1 + var7_intLifetime1;
                }
                var8Lifetime2Lifetime2++;
              }
              var18Lifetime1++;
              var10Lifetime1 = var10Lifetime1 + var15Lifetime1;
              stackIn_216_0Lifetime1 = var11Lifetime1;
              var17Lifetime1 = stackIn_216_0Lifetime1;
              var9Lifetime2Lifetime2++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_221_0 = var7;
          stackIn_221_1 = new StringBuilder().append("e.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_222_2 = "null";
          } else {
            stackIn_222_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_221_0), ((StringBuilder) (Object) stackIn_221_1).append(stackIn_222_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, Terraphoenix param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        r dupTemp$4 = null;
        ga dupTemp$5 = null;
        ga dupTemp$6 = null;
        ga dupTemp$7 = null;
        ga dupTemp$8 = null;
        ga dupTemp$9 = null;
        ga dupTemp$10 = null;
        ga dupTemp$11 = null;
        ga dupTemp$12 = null;
        ga dupTemp$13 = null;
        ga dupTemp$14 = null;
        ga dupTemp$15 = null;
        int dupTemp$16 = 0;
        int dupTemp$17 = 0;
        int dupTemp$18 = 0;
        hk stackIn_138_0 = null;
        int stackIn_139_1 = 0;
        hk stackIn_149_0 = null;
        int stackIn_150_1 = 0;
        r stackIn_209_0 = null;
        ga stackIn_210_0 = null;
        hk stackIn_270_0 = null;
        int stackIn_271_1 = 0;
        hk stackIn_293_0 = null;
        int stackIn_294_1 = 0;
        hk stackIn_305_0 = null;
        int stackIn_306_1 = 0;
        int stackIn_476_0 = 0;
        int stackIn_523_0 = 0;
        int stackIn_523_1 = 0;
        r stackIn_548_0 = null;
        RuntimeException stackIn_599_0 = null;
        StringBuilder stackIn_599_1 = null;
        String stackIn_600_2 = null;
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
        oh var11_ref_oh = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_476_0Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        var12 = Terraphoenix.field_V;
        try {
          ja.field_i = 7;
          rk.field_c = 32;
          wb.field_g = 20;
          hh.field_m.a();
          l.a();
          k.field_f.a(0);
          var4 = -88 % ((-66 - param0) / 59);
          var3_int = 0;
          var5 = 0;
          var6 = 0;
          L1: while (true) {
            L2: {
              if (this.field_C.length > var6) {
                stackIn_209_0 = this.field_C[var6];
                if (var12 != 0) {
                  while (true) {
                    stackIn_210_0 = stackIn_209_0.field_Z;
                    if (stackIn_210_0.field_b != null) {
                      this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                    }
                    if (null != this.field_C[var6].field_Z.field_A) {
                      this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                    }
                    while (true) {
                      var6++;
                      break L2;
                    }
                  }
                }
                if (stackIn_209_0 != null &&
                  this.field_C[var6].field_P > 0) {
                  if (null != this.field_C[var6].field_c) {
                    this.field_C[var6].field_c.field_h = null;
                  }
                  if (null == this.field_C[var6].field_Z &&
                    this.field_C[var6].field_C != 0) {
                    var5++;
                    if (var12 != 0) {
                      var3_int++;
                    }
                  } else {
                    var3_int++;
                  }
                }
                var6++;
                if (var12 == 0) {
                  continue;
                }
              }
              var6 = 0;
              while (var6 < param1.field_nb.length) {
                stackIn_210_0 = param1.field_nb[var6];
                if (var12 != 0) {
                  while (true) {
                    if (stackIn_210_0.field_b != null) {
                      this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                    }
                    if (null != this.field_C[var6].field_Z.field_A) {
                      this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                    }
                    while (true) {
                      var6++;
                      break L2;
                    }
                  }
                }
                if (stackIn_210_0 != null) {
                  this.field_e.field_e = this.field_e.field_e + 1;
                }
                var6++;
                if (var12 == 0) {
                  continue;
                }
                break;
              }
              if (var3_int <= 0 ||
                var5 != 0 ||
                this.field_r) {
                this.field_f = 2;
                if (this.field_r) {
                  this.field_e.field_i = -1;
                  var6 = 0;
                  while (true) {
                    if (var6 < this.field_C.length &&
                      var12 == 0) {
                      boolean decompiledFrameRemainder2 = true;
                      if (this.field_C[var6] != null) {
                        if (this.field_C[var6].field_Z != null) {
                          if ((param1.field_Bb != 12)) {
                            if (null != this.field_C[var6].field_Z.field_b) {
                              this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                            }
                            if ((this.field_C[var6].field_Z.field_A != null)) {
                              this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                            }
                          }
                          decompiledFrameRemainder2 = false;
                        }
                        else {
                          if (this.field_C[var6].field_t == 0) {
                            this.field_e.field_g = this.field_e.field_g + 1;
                          }
                          if (this.field_C[var6].field_t == 1) {
                            this.field_e.field_j = this.field_e.field_j + 1;
                          }
                          if (this.field_C[var6].field_t == 2) {
                            this.field_e.field_j = this.field_e.field_j + 1;
                          }
                          if (this.field_C[var6].field_t == 3) {
                            this.field_e.field_j = this.field_e.field_j + 1;
                            this.field_e.field_l.field_a[17] = this.field_e.field_l.field_a[17] + 1;
                          }
                          if (4 == this.field_C[var6].field_t) {
                            this.field_e.field_b = this.field_e.field_b + 1;
                          }
                          if (this.field_C[var6].field_t == 5) {
                            this.field_e.field_j = this.field_e.field_j + 1;
                          }
                          if (6 == this.field_C[var6].field_t) {
                            this.field_e.field_j = this.field_e.field_j + 1;
                          }
                          if (9 == this.field_C[var6].field_t) {
                            this.field_e.field_m = this.field_e.field_m + 1;
                          }
                          if (this.field_C[var6].field_nb != null) {
                            dupTemp$0 = this.field_C[var6].field_nb.field_g;
                            this.field_e.field_l.field_a[dupTemp$0] = this.field_e.field_l.field_a[dupTemp$0] + 1;
                          }
                          if (this.field_C[var6].field_b != null) {
                            dupTemp$1 = this.field_C[var6].field_b.field_g;
                            this.field_e.field_l.field_a[dupTemp$1] = this.field_e.field_l.field_a[dupTemp$1] + this.field_C[var6].field_b.field_d;
                          }
                        }
                      }
                      var6++;
                      continue;
                    }
                    break;
                  }
                  this.field_i = 6;
                  if (var12 == 0) {
                    break L1;
                  }
                }
                this.field_i = 5;
                if (param1.field_Bb == 1) {
                  this.field_e.field_i = -2;
                }
                if (param1.field_Bb == 2) {
                  this.field_e.field_i = -2;
                }
                if (param1.field_Bb == 3) {
                  this.field_e.field_i = -2;
                }
                if (param1.field_Bb == 4) {
                  this.field_e.field_i = -1;
                }
                if (param1.field_Bb == 5) {
                  this.field_e.field_i = -2;
                }
                if (param1.field_Bb == 6) {
                  this.field_e.field_i = -1;
                }
                if (param1.field_Bb == 7) {
                  this.field_e.field_i = -2;
                }
                if (param1.field_Bb == 8) {
                  stackIn_138_0 = this.field_e;
                  if (param1.field_vb != 1) {
                    stackIn_139_1 = -1;
                  } else {
                    stackIn_139_1 = -3;
                  }
                  stackIn_138_0.field_i = stackIn_139_1;
                }
                if (9 == param1.field_Bb) {
                  this.field_e.field_i = -2;
                }
                if (10 == param1.field_Bb) {
                  stackIn_149_0 = this.field_e;
                  if (param1.field_vb != 1) {
                    stackIn_150_1 = -3;
                  } else {
                    stackIn_150_1 = -1;
                  }
                  stackIn_149_0.field_i = stackIn_150_1;
                }
                if (param1.field_Bb == 11) {
                  this.field_e.field_i = -4;
                }
                if (12 == param1.field_Bb) {
                  this.field_e.field_i = -3;
                }
                if (param1.field_Bb == 13) {
                  this.field_e.field_i = -5;
                }
                if (param1.field_db) {
                  this.field_e.field_i = -6;
                }
                var6 = 0;
                do {
                  if (var6 >= this.field_C.length) {
                    break L1;
                  }
                  if (null != this.field_C[var6]) {
                    if (null == this.field_C[var6].field_Z) {
                      if (!(this.field_C[var6].field_P > 0)) {
                        if (this.field_C[var6].field_t == 0) {
                          this.field_e.field_g = this.field_e.field_g + 1;
                        }
                        if (this.field_C[var6].field_t == 1) {
                          this.field_e.field_j = this.field_e.field_j + 1;
                        }
                        if (this.field_C[var6].field_t == 2) {
                          this.field_e.field_j = this.field_e.field_j + 1;
                        }
                        if (this.field_C[var6].field_t == 3) {
                          this.field_e.field_j = this.field_e.field_j + 1;
                          this.field_e.field_l.field_a[17] = this.field_e.field_l.field_a[17] + 1;
                        }
                        if (this.field_C[var6].field_t == 4) {
                          this.field_e.field_b = this.field_e.field_b + 1;
                        }
                        if (this.field_C[var6].field_t == 5) {
                          this.field_e.field_j = this.field_e.field_j + 1;
                        }
                        if (6 == this.field_C[var6].field_t) {
                          this.field_e.field_j = this.field_e.field_j + 1;
                        }
                        if (this.field_C[var6].field_t == 9) {
                          this.field_e.field_m = this.field_e.field_m + 1;
                          if ((var12 != 0) &&
                            (param1.field_Bb != 12)) {
                            stackIn_209_0 = this.field_C[var6];
                            stackIn_210_0 = stackIn_209_0.field_Z;
                            if (stackIn_210_0.field_b != null) {
                              this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                            }
                            if (null != this.field_C[var6].field_Z.field_A) {
                              this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                            }
                          }
                        }
                      }
                    } else {
                      if (param1.field_Bb != 12) {
                        stackIn_209_0 = this.field_C[var6];
                        stackIn_210_0 = stackIn_209_0.field_Z;
                        if (stackIn_210_0.field_b != null) {
                          this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                        }
                        if (null != this.field_C[var6].field_Z.field_A) {
                          this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                        }
                      }
                    }
                  }
                  var6++;
                } while (var12 == 0);
              }
            }
            if (!param1.field_db) {
              if (param1.field_Bb == 2) {
                mh.a((byte) 117, 9, 246);
              }
              if (param1.field_Bb == 6) {
                mh.a((byte) 123, 10, 245);
              }
              if (param1.field_Bb == 10) {
                mh.a((byte) 113, 11, 244);
              }
              if (param1.field_Bb == 13) {
                mh.a((byte) 127, 12, 243);
                if (param1.field_fb) {
                  mh.a((byte) 119, 13, 242);
                }
                if (param1.field_ob &&
                  fa.field_a == 1) {
                  mh.a((byte) 117, 14, 241);
                }
                if (fa.field_a == 2) {
                  mh.a((byte) 121, 15, 240);
                }
              }
            }
            if (param1.field_db) {
              param1.field_M = param1.field_M + 1;
              param1.field_Fb = param1.field_Fb + 1;
              qc.field_c = qc.field_c + 1;
              if (mb.b(0, -64)) {
                mh.a((byte) 120, 16, 239);
              }
            }
            this.field_f = 1;
            this.field_i = 6;
            if (13 == param1.field_Bb) {
              this.field_i = 4;
            }
            if (param1.field_Bb == 1) {
              this.field_e.field_i = 1;
            }
            if (2 == param1.field_Bb) {
              this.field_e.field_i = 2;
            }
            if (3 == param1.field_Bb) {
              stackIn_270_0 = this.field_e;
              if (param1.field_ub == 1) {
                stackIn_271_1 = 3;
              } else {
                stackIn_271_1 = 4;
              }
              stackIn_270_0.field_i = stackIn_271_1;
            }
            if (4 == param1.field_Bb) {
              this.field_e.field_i = 5;
            }
            if (5 == param1.field_Bb) {
              this.field_e.field_i = 2;
            }
            if (6 == param1.field_Bb) {
              this.field_e.field_i = 6;
            }
            if (param1.field_Bb == 7) {
              this.field_e.field_i = 2;
            }
            if (param1.field_Bb == 8) {
              stackIn_293_0 = this.field_e;
              if (1 != param1.field_vb) {
                stackIn_294_1 = 8;
              } else {
                stackIn_294_1 = 7;
              }
              stackIn_293_0.field_i = stackIn_294_1;
            }
            if (9 == param1.field_Bb) {
              this.field_e.field_i = 2;
            }
            if (10 == param1.field_Bb) {
              stackIn_305_0 = this.field_e;
              if (param1.field_vb == 1) {
                stackIn_306_1 = 8;
              } else {
                stackIn_306_1 = 7;
              }
              stackIn_305_0.field_i = stackIn_306_1;
            }
            if (param1.field_Bb == 11) {
              this.field_e.field_i = 9;
            }
            if (param1.field_Bb == 12) {
              this.field_e.field_i = 10;
            }
            if (param1.field_Bb == 13) {
              this.field_e.field_i = 11;
            }
            if (param1.field_db) {
              this.field_e.field_i = 12;
            }
            var6 = 0;
            while (this.field_C.length > var6) {
              boolean decompiledFrameRemainder0 = true;
              if (null != this.field_C[var6]) {
                if ((this.field_C[var6].field_Z != null) &&
                  (decompiledFrameRemainder0 = (param1.field_Bb != 12))) {
                  if (this.field_C[var6].field_Z.field_b != null) {
                    this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                  }
                  decompiledFrameRemainder0 = (this.field_C[var6].field_Z.field_A != null);
                  if (decompiledFrameRemainder0) {
                    this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                    decompiledFrameRemainder0 = (var12 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (this.field_C[var6].field_t == 0) {
                    this.field_e.field_g = this.field_e.field_g + 1;
                  }
                  if (this.field_C[var6].field_t == 1) {
                    this.field_e.field_j = this.field_e.field_j + 1;
                  }
                  if (2 == this.field_C[var6].field_t) {
                    this.field_e.field_j = this.field_e.field_j + 1;
                  }
                  if (this.field_C[var6].field_t == 3) {
                    this.field_e.field_j = this.field_e.field_j + 1;
                    this.field_e.field_l.field_a[17] = this.field_e.field_l.field_a[17] + 1;
                  }
                  if (this.field_C[var6].field_t == 4) {
                    this.field_e.field_b = this.field_e.field_b + 1;
                  }
                  if (this.field_C[var6].field_t == 5) {
                    this.field_e.field_j = this.field_e.field_j + 1;
                  }
                  if (6 == this.field_C[var6].field_t) {
                    this.field_e.field_j = this.field_e.field_j + 1;
                  }
                  if (this.field_C[var6].field_t == 9) {
                    this.field_e.field_m = this.field_e.field_m + 1;
                  }
                  if (this.field_C[var6].field_nb != null &&
                    19 > this.field_C[var6].field_nb.field_g) {
                    dupTemp$2 = this.field_C[var6].field_nb.field_g;
                    this.field_e.field_l.field_a[dupTemp$2] = this.field_e.field_l.field_a[dupTemp$2] + 1;
                  }
                  if (null != this.field_C[var6].field_b) {
                    dupTemp$3 = this.field_C[var6].field_b.field_g;
                    this.field_e.field_l.field_a[dupTemp$3] = this.field_e.field_l.field_a[dupTemp$3] + this.field_C[var6].field_b.field_d;
                  }
                }
              }
              var6++;
              if (var12 == 0) {
                continue;
              }
              break;
            }
            break;
          }
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var6 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var6 < ak.field_q)))) {
            stackIn_523_0 = ~var6;
            stackIn_523_1 = -13;
            if (var12 == 0) {
              if (stackIn_523_0 > stackIn_523_1) {
                param1.field_nb[var6] = null;
              }
              boolean decompiledFrameRemainder1 = true;
              if (this.field_C[var6] != null) {
                if (null != this.field_C[var6].field_Z &&
                  0 >= this.field_C[var6].field_P &&
                  this.field_C[var6].field_T > 0 && (this.field_f == 1 ||
                  this.field_r)) {
                  dupTemp$4 = this.field_C[var6];
                  dupTemp$4.field_P = dupTemp$4.field_P + this.field_C[var6].field_T;
                  this.field_C[var6].field_T = 0;
                  this.field_e.field_f = this.field_e.field_f + 1;
                }
                if (this.field_C[var6].field_P > 0) {
                  if ((null != this.field_C[var6].field_Z)) {
                    param1.field_nb[var6] = this.field_C[var6].field_Z;
                    param1.field_nb[var6].field_b = this.field_C[var6].field_nb;
                    param1.field_nb[var6].field_A = this.field_C[var6].field_eb;
                    if (null != param1.field_nb[var6].field_b) {
                      var10 = param1.field_nb[var6].field_b.field_g;
                      if (0 == var10 ||
                        3 == var10 ||
                        var10 == 8 ||
                        var10 == 12) {
                        var11_ref_oh = param1.field_nb[var6].field_A;
                        param1.field_nb[var6].field_A = param1.field_nb[var6].field_b;
                        param1.field_nb[var6].field_b = var11_ref_oh;
                      }
                    }
                    param1.field_nb[var6].field_i = this.field_C[var6].field_b;
                    if (this.field_C[var6].field_Z.field_e > 0 &&
                      this.field_C[var6].field_Z.field_h == 0) {
                      this.field_C[var6].field_Z.field_h = 1;
                    }
                    if (this.field_C[var6].field_Z.field_h == 2) {
                      var8++;
                    }
                    if (this.field_C[var6].field_Z.field_h == 3) {
                      var9++;
                    }
                    if (this.field_C[var6].field_Z.field_h == 1) {
                      var7++;
                    }
                    this.field_C[var6].field_Z.d((byte) 126);
                    var10Lifetime3 = -this.field_C[var6].field_Z.field_v + this.field_C[var6].field_Z.field_x;
                    if (var10Lifetime3 > 0) {
                      if (var10Lifetime3 > 20) {
                        var10Lifetime3 = 20;
                      }
                      dupTemp$5 = this.field_C[var6].field_Z;
                      dupTemp$5.field_v = (int)((double)dupTemp$5.field_v + (3.0 * Math.random() * (double)var10Lifetime3 / 4.0 + (double)(var10Lifetime3 / 4)));
                      if (this.field_C[var6].field_Z.field_v > 100) {
                        this.field_C[var6].field_Z.field_v = 100;
                      }
                    }
                    var11 = 0;
                    while (var11 < this.field_C[var6].field_Z.field_h) {
                      stackIn_476_0 = $cfr$dcmpl(100.0 * Math.random(), (double)this.field_C[var6].field_Z.field_t);
                      if (stackIn_476_0 > 0) {
                        dupTemp$6 = this.field_C[var6].field_Z;
                        dupTemp$6.field_t = dupTemp$6.field_t + 1;
                      }
                      if (100.0 * Math.random() > (double)this.field_C[var6].field_Z.field_w) {
                        dupTemp$7 = this.field_C[var6].field_Z;
                        dupTemp$7.field_w = dupTemp$7.field_w + 1;
                      }
                      if (Math.random() * 100.0 > (double)this.field_C[var6].field_Z.field_v) {
                        dupTemp$8 = this.field_C[var6].field_Z;
                        dupTemp$8.field_v = dupTemp$8.field_v + 1;
                      }
                      if (Math.random() * 100.0 > (double)this.field_C[var6].field_Z.field_B) {
                        dupTemp$9 = this.field_C[var6].field_Z;
                        dupTemp$9.field_B = dupTemp$9.field_B + 1;
                      }
                      if (Math.random() * 100.0 > (double)this.field_C[var6].field_Z.field_q) {
                        dupTemp$10 = this.field_C[var6].field_Z;
                        dupTemp$10.field_q = dupTemp$10.field_q + 1;
                      }
                      var11++;
                    }
                    stackIn_476_0Lifetime1 = 0;
                    if (stackIn_476_0Lifetime1 < this.field_C[var6].field_Z.field_h) {
                      if ((33 * this.field_C[var6].field_Z.field_h + 1) > this.field_C[var6].field_Z.field_t) {
                        dupTemp$11 = this.field_C[var6].field_Z;
                        dupTemp$11.field_t = dupTemp$11.field_t + 1;
                      }
                      if (33 * this.field_C[var6].field_Z.field_h + 1 > this.field_C[var6].field_Z.field_w) {
                        dupTemp$12 = this.field_C[var6].field_Z;
                        dupTemp$12.field_w = dupTemp$12.field_w + 1;
                      }
                      if ((33 * this.field_C[var6].field_Z.field_h + 1) > this.field_C[var6].field_Z.field_v) {
                        dupTemp$13 = this.field_C[var6].field_Z;
                        dupTemp$13.field_v = dupTemp$13.field_v + 1;
                      }
                      if ((this.field_C[var6].field_Z.field_h * 33 + 1) > this.field_C[var6].field_Z.field_B) {
                        dupTemp$14 = this.field_C[var6].field_Z;
                        dupTemp$14.field_B = dupTemp$14.field_B + 1;
                      }
                      if ((this.field_C[var6].field_Z.field_h * 33 + 1) > this.field_C[var6].field_Z.field_q) {
                        dupTemp$15 = this.field_C[var6].field_Z;
                        dupTemp$15.field_q = dupTemp$15.field_q + 1;
                      }
                    }
                    if (this.field_C[var6].field_Z.field_B >= 90) {
                      mh.a((byte) 121, 0, 255);
                    }
                    if (this.field_C[var6].field_Z.field_t >= 90) {
                      mh.a((byte) 125, 1, 254);
                    }
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  if (this.field_C[var6].field_Z != null) {
                    this.field_e.field_k = this.field_e.field_k + 1;
                  }
                  if (this.field_f == 1) {
                    if (null != this.field_C[var6].field_nb) {
                      dupTemp$16 = this.field_C[var6].field_nb.field_g;
                      this.field_e.field_l.field_a[dupTemp$16] = this.field_e.field_l.field_a[dupTemp$16] + 1;
                    }
                    if (null != this.field_C[var6].field_eb) {
                      dupTemp$17 = this.field_C[var6].field_eb.field_g;
                      this.field_e.field_l.field_a[dupTemp$17] = this.field_e.field_l.field_a[dupTemp$17] + 1;
                    }
                    if (null != this.field_C[var6].field_b) {
                      dupTemp$18 = this.field_C[var6].field_b.field_g;
                      this.field_e.field_l.field_a[dupTemp$18] = this.field_e.field_l.field_a[dupTemp$18] + this.field_C[var6].field_b.field_d;
                    }
                  }
                }
              }
              var6++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_523_0 = ~((var8 + 1) * 2);
            stackIn_523_1 = ~var7;
          }
          if (stackIn_523_0 > stackIn_523_1) {
            var10Lifetime1 = 0;
            var6 = 0;
            while (true) {
              if (var6 < ak.field_q) {
                stackIn_548_0 = this.field_C[var6];
                if (var12 == 0) {
                  if (stackIn_548_0 != null &&
                    null != this.field_C[var6].field_Z &&
                    this.field_C[var6].field_Z.field_h == 1 && (var10Lifetime1 == 0 ||
                    !(this.field_C[var6].field_Z.field_e <= this.field_C[var10Lifetime1].field_Z.field_e))) {
                    var10Lifetime1 = var6;
                  }
                  var6++;
                  continue;
                }
              } else {
                var8++;
                var7--;
                stackIn_548_0 = this.field_C[var10Lifetime1];
              }
              break;
            }
            stackIn_548_0.field_Z.field_h = 2;
          }
          if (var8 > 2 * var9 + 2 &&
            var9 == 0) {
            var10Lifetime2 = 0;
            var6 = 0;
            while (true) {
              if (var6 < ak.field_q) {
                if (var12 == 0) {
                  if (null != this.field_C[var6] &&
                    null != this.field_C[var6].field_Z &&
                    this.field_C[var6].field_Z.field_h <= 2 && (0 == var10Lifetime2 ||
                    !(this.field_C[var6].field_Z.field_e <= this.field_C[var10Lifetime2].field_Z.field_e))) {
                    var10Lifetime2 = var6;
                  }
                  var6++;
                  continue;
                }
              } else {
                this.field_C[var10Lifetime2].field_Z.field_h = 3;
                mh.a((byte) 118, 4, 251);
                var9++;
              }
              break;
            }
            var8--;
          }
          if (5 != this.field_i) {
            if (param1.field_Y) {
              mh.a((byte) 125, 5, 250);
            }
            if (param1.field_E) {
              mh.a((byte) 124, 6, 249);
            }
            if (param1.field_Ab) {
              mh.a((byte) 112, 7, 248);
            }
            if (param1.field_H) {
              mh.a((byte) 113, 8, 247);
            }
          }
          cb.a(false, this.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_599_0 = var3;
          stackIn_599_1 = new StringBuilder().append("e.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_600_2 = "null";
          } else {
            stackIn_600_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_599_0), ((StringBuilder) (Object) stackIn_599_1).append(stackIn_600_2).append(')').toString());
        }
    }

    final void a(boolean param0, boolean param1) {
        int stackIn_22_0 = 0;
        dk stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        int stackIn_157_2 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_187_0 = 0;
        int stackIn_214_1 = 0;
        int stackIn_256_0 = 0;
        int stackIn_257_1 = 0;
        int stackIn_273_3 = 0;
        int stackIn_277_4 = 0;
        int stackIn_329_0 = 0;
        int stackIn_329_1 = 0;
        int stackIn_329_2 = 0;
        int stackIn_329_3 = 0;
        int stackIn_329_4 = 0;
        int stackIn_364_3 = 0;
        int stackIn_368_4 = 0;
        int stackIn_426_0;
        int stackIn_426_1;
        int stackIn_426_2;
        int stackIn_426_3;
        int stackIn_426_4;
        dl stackIn_573_0 = null;
        Object stackIn_732_0 = null;
        int stackIn_745_0 = 0;
        int stackIn_745_1 = 0;
        ci[] stackIn_753_0 = null;
        int stackIn_753_1 = 0;
        int stackIn_753_2 = 0;
        boolean stackIn_782_0 = false;
        dk stackIn_810_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dl var8_ref_dl = null;
        ci var8_ref_ci = null;
        th var8_ref_th = null;
        int var9 = 0;
        Object var9_ref = null;
        int var10_int = 0;
        ci var10 = null;
        dl var10_ref = null;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var15_ref_String = null;
        String var16_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        dk stackIn_810_0Lifetime1;
        dl var8_ref_dlLifetime1;
        Object var9_refLifetime1;
        Object var9_refLifetime2;
        int stackIn_176_0Lifetime1;
        int stackIn_176_1Lifetime1;
        int var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10_intLifetime1;
        int var11_intLifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var17Lifetime1;
        int var10_intLifetime2;
        int var12Lifetime2;
        int var14Lifetime2;
        int var4Lifetime1Lifetime1;
        int var6Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        int var11_intLifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var19 = Terraphoenix.field_V;
        try {
          var3_int = li.field_a ? 1 : 0;
          tg.field_l = -1;
          rd.field_t = 0;
          li.field_a = false;
          if (!this.field_u) {
            this.field_h.a(24, (byte) -122, 92);
            return;
          }
          if (this.field_q != null) {
            tg.field_l = -1;
            if (null != this.field_q.field_c.field_C) {
              if (this.field_q.field_c.field_C.field_C != null) {
                tg.field_l = 1 + this.field_q.field_E;
              }
              if (this.field_q.field_c.field_C.field_b != -1) {
                tg.field_l = this.field_q.field_E;
              }
            }
            tg.field_l = eg.field_p;
          }
          var4 = 0;
          stackIn_22_0 = (hl.field_a) ? 0 : 1;
          var5 = stackIn_22_0;
          if (!(jb.field_b < 365) ||
            !(39 < jb.field_b)) {
            var5 = 0;
          }
          if (param1) {
            var5 = 0;
          }
          if (ld.field_b) {
            var5 = 0;
          }
          if (!this.field_J) {
            var5 = 0;
          }
          this.field_h.a(false, var5 != 0);
          var6 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_C.length <= var6))) {
            if (var19 == 0) {
              if (null != this.field_C[var6]) {
                this.field_C[var6].e((byte) 41);
              }
              var6++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (eh.field_m)) {
            var6 = -(32 * ui.field_f.field_H) + (-sj.field_b + (320 + 32 * ui.field_f.field_F));
            var7 = ui.field_f.field_H * 16 + 16 * ui.field_f.field_F + (240 + (-lg.field_c - ui.field_f.field_E * 48 / 100) - 32);
            var8 = -320 + var6;
            var8 += 304;
            var9 = -240 + var7 - 32;
            var9 += 224;
            ui.field_f.field_g.a(var9, 4, var8, -22899, ui.field_f);
            ck.a(ui.field_f.field_g, -31661);
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted5 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameCompleted7 = true;
          if (var5 != 0) {
            var4Lifetime1 = -sj.field_b + 320;
            var4Lifetime1 = var4Lifetime1 + 32 * (-vf.field_a + uf.field_c);
            var6Lifetime1 = 240 - lg.field_c;
            var6Lifetime1 = var6Lifetime1 + 16 * (vf.field_a + uf.field_c);
            var7Lifetime1 = 0;
            while (!(var7Lifetime1 > eg.field_p)) {
              var8_ref_dl = this.field_h.a(-99, vf.field_a, var7Lifetime1, uf.field_c);
              stackIn_573_0 = var8_ref_dl;
              if (var19 != 0) {
                decompiledFrameCompleted7 = false;
                break;
              }
              if (stackIn_573_0 != null) {
                var9_ref = hb.field_p[0];
                if (var8_ref_dl.field_h != null &&
                  ~eg.field_p == ~var7Lifetime1) {
                  if (null != var8_ref_dl.field_h.field_Z) {
                    var9_ref = hb.field_p[2];
                  } else {
                    if (1 == var8_ref_dl.field_h.field_C) {
                      if (var8_ref_dl.field_h.field_k) {
                        var9_ref = hb.field_p[1];
                      }
                    } else {
                      var9_ref = null;
                    }
                  }
                }
                if (this.field_L != 0 &&
                  ~eg.field_p == ~var7Lifetime1) {
                  var9_ref = hb.field_p[1];
                }
                boolean decompiledFrameRemainder1 = true;
                if (var9_ref == hb.field_p[1] &&
                  this.field_q != null) {
                  var10_int = this.field_q.field_U;
                  var11_int = this.field_q.field_ab;
                  this.field_q.a(param0, uf.field_c, vf.field_a);
                  if (2 <= Math.abs(var10_int - this.field_q.field_U) &&
                    Math.abs(var10_int - this.field_q.field_U) <= 6) {
                    this.field_q.field_ab = 0;
                  }
                  var12 = this.field_q.c(false);
                  if (this.field_m) {
                    var12 = 15;
                  }
                  this.field_q.field_U = var10_int;
                  this.field_q.field_ab = var11_int;
                  if (this.field_m ||
                    !(0 >= this.field_q.field_nb.field_c) ||
                    7 == this.field_q.field_nb.field_g ||
                    6 == this.field_q.field_nb.field_g) {
                    if (var12 > this.field_q.field_jb && (!(var12 - 10 <= this.field_q.field_jb) ||
                      this.field_m ||
                      !(this.field_q.field_jb >= 10))) {
                      this.field_h.a(-(48 * var7Lifetime1) - 36 + var6Lifetime1, 16711680, var4Lifetime1, -2, hj.field_A);
                    } else {
                      if (var12 > this.field_q.field_jb) {
                        var12 = this.field_q.field_jb;
                      }
                      var13 = var12;
                      this.field_h.a(-(var7Lifetime1 * 48) + (var6Lifetime1 - 36), 16711680, var4Lifetime1, -2, Integer.toString(var13));
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    this.field_h.a(-36 + var6Lifetime1 - 48 * var7Lifetime1, 16711680, var4Lifetime1, -2, ta.field_a);
                  }
                }
                if (hb.field_p[0] == var9_ref &&
                  var7Lifetime1 == eg.field_p && (var8_ref_dl.field_z ||
                  !var8_ref_dl.field_d)) {
                  if (var8_ref_dl.field_v == 4) {
                    rh.field_b[9].b(-16 + var4Lifetime1, var6Lifetime1 + (-36 - 48 * var7Lifetime1));
                    rh.field_b[9].b(-16 + var4Lifetime1, var6Lifetime1 - 36 + (-(var7Lifetime1 * 48) + 8));
                  }
                  if (5 == var8_ref_dl.field_v) {
                    rh.field_b[10].b(-16 + var4Lifetime1, -(var7Lifetime1 * 48) - 36 + var6Lifetime1);
                    rh.field_b[10].b(var4Lifetime1 - 16, 8 + (var6Lifetime1 - (36 + var7Lifetime1 * 48)));
                  }
                }
              }
              var7Lifetime1++;
            }
          }
          if (decompiledFrameCompleted7) {
            if (ql.field_i > -1 &&
              ld.field_e > -1 &&
              var5 != 0) {
              var4Lifetime1Lifetime1 = -sj.field_b + 320;
              var6Lifetime1Lifetime1 = -lg.field_c + 240;
              var4Lifetime1Lifetime1 = var4Lifetime1Lifetime1 + 32 * (ql.field_i - ld.field_e);
              var6Lifetime1Lifetime1 = var6Lifetime1Lifetime1 + 16 * (ld.field_e + ql.field_i);
              var7Lifetime1Lifetime1 = this.field_q.field_N;
              if (og.field_d > 0) {
                var8_ref_ci = hb.field_p[3];
                var9 = (int)(24.0 + Math.sin(mm.field_f) * 24.0);
                ve.a(var8_ref_ci, -5353, var7Lifetime1Lifetime1 * 144 + var9, var6Lifetime1Lifetime1 + (-(var7Lifetime1Lifetime1 * 48) - var9), var4Lifetime1Lifetime1 - 24);
                var9 = (int)(Math.cos(mm.field_f) * 24.0 + 24.0);
                ve.a(var8_ref_ci, -5353, var9 + var7Lifetime1Lifetime1 * 144, -var9 - 48 * var7Lifetime1Lifetime1 + var6Lifetime1Lifetime1, -24 + var4Lifetime1Lifetime1);
                var10_int = og.field_d;
                stackIn_156_0 = this.field_h;
                stackIn_156_1 = var6Lifetime1Lifetime1 + (-24 - var7Lifetime1Lifetime1 * 48);
                if (var10_int > this.field_q.field_jb) {
                  stackIn_157_2 = 16711680;
                } else {
                  stackIn_157_2 = 65280;
                }
                ((dk) (Object) stackIn_156_0).a(stackIn_156_1, stackIn_157_2, var4Lifetime1Lifetime1, -2, Integer.toString(var10_int));
                if (var19 != 0) {
                  var8_ref_ci = hb.field_p[3];
                  var9 = (int)(24.0 + Math.sin(mm.field_f) * 24.0);
                  ve.a(var8_ref_ci, -5353, var9 + var7Lifetime1Lifetime1 * 144, -(48 * var7Lifetime1Lifetime1) + (var6Lifetime1Lifetime1 - var9), var4Lifetime1Lifetime1 - 24);
                  var9 = (int)(24.0 + 24.0 * Math.cos(mm.field_f));
                  ve.a(var8_ref_ci, -5353, 144 * var7Lifetime1Lifetime1 + var9, -(48 * var7Lifetime1Lifetime1) + (var6Lifetime1Lifetime1 - var9), -24 + var4Lifetime1Lifetime1);
                  this.field_h.a(-(48 * var7Lifetime1Lifetime1) + (-24 + var6Lifetime1Lifetime1), 16711680, var4Lifetime1Lifetime1, -2, rj.field_f);
                }
              } else {
                var8_ref_ci = hb.field_p[3];
                var9 = (int)(24.0 + Math.sin(mm.field_f) * 24.0);
                ve.a(var8_ref_ci, -5353, var9 + var7Lifetime1Lifetime1 * 144, -(48 * var7Lifetime1Lifetime1) + (var6Lifetime1Lifetime1 - var9), var4Lifetime1Lifetime1 - 24);
                var9 = (int)(24.0 + 24.0 * Math.cos(mm.field_f));
                ve.a(var8_ref_ci, -5353, 144 * var7Lifetime1Lifetime1 + var9, -(48 * var7Lifetime1Lifetime1) + (var6Lifetime1Lifetime1 - var9), -24 + var4Lifetime1Lifetime1);
                this.field_h.a(-(48 * var7Lifetime1Lifetime1) + (-24 + var6Lifetime1Lifetime1), 16711680, var4Lifetime1Lifetime1, -2, rj.field_f);
              }
            }
            var6Lifetime1Lifetime1 = 0;
            while (true) {
              if (50 > var6Lifetime1Lifetime1) {
                if (var19 == 0) {
                  if (this.field_F[var6Lifetime1Lifetime1] != null) {
                    this.field_F[var6Lifetime1Lifetime1].c(16);
                  }
                  var6Lifetime1Lifetime1++;
                  continue;
                }
              } else {
                if (le.field_q != null) {
                  le.field_q.d((byte) 124);
                }
              }
              break;
            }
            boolean decompiledFrameCompleted6 = true;
            if (this.field_I) {
              var6Lifetime1Lifetime1 = 0;
              while (true) {
                stackIn_176_0 = 640;
                stackIn_176_1 = var6Lifetime1Lifetime1;
                if (stackIn_176_0 <= stackIn_176_1) {
                  break;
                }
                stackIn_187_0 = 0;
                if (var19 != 0) {
                  decompiledFrameCompleted6 = false;
                  break;
                }
                var7Lifetime1Lifetime1 = stackIn_187_0;
                while (var7Lifetime1Lifetime1 < 480) {
                  stackIn_176_0Lifetime1 = -1;
                  stackIn_176_1Lifetime1 = ~gd.field_a[var6Lifetime1Lifetime1][var7Lifetime1Lifetime1];
                  if (stackIn_176_0Lifetime1 > stackIn_176_1Lifetime1) {
                    l.a(var6Lifetime1Lifetime1, var7Lifetime1Lifetime1, (2048 * gd.field_a[var6Lifetime1Lifetime1][var7Lifetime1Lifetime1] + (gd.field_a[var6Lifetime1Lifetime1][var7Lifetime1Lifetime1] * 16 + 262144 * gd.field_a[var6Lifetime1Lifetime1][var7Lifetime1Lifetime1])) % 16777215);
                  }
                  var7Lifetime1Lifetime1++;
                }
                var6Lifetime1Lifetime1++;
              }
            }
            if (decompiledFrameCompleted6) {
              jl.h((byte) -108);
              stackIn_187_0 = param0 ? 1 : 0;
            }
            if (stackIn_187_0 != 1) {
              return;
            }
            var6Lifetime1Lifetime1 = 608;
            var7Lifetime1Lifetime1 = 448;
            if (this.field_J) {
              var7Lifetime1Lifetime1 = 320;
              wc.a(this, var7Lifetime1Lifetime1, var6Lifetime1Lifetime1, -11669);
            }
            if (this.field_J) {
              var8 = 385;
              ic.field_t.b(0, var8);
              var9 = 0;
              while (7 > var9) {
                stackIn_753_0 = nb.field_d;
                stackIn_753_1 = ~(28 * var9 + 97);
                stackIn_753_2 = ~this.field_y;
                if (var19 != 0) {
                  decompiledFrameCompleted5 = false;
                  break;
                }
                if (stackIn_753_1 >= stackIn_753_2 &&
                  (99 + (28 * var9 + 24)) > this.field_y &&
                  -2 + var8 + 66 < this.field_j &&
                  (26 + (-2 + var8 + 66)) > this.field_j) {
                  stackIn_214_1 = var9 + 8;
                } else {
                  stackIn_214_1 = var9;
                }
                ((ci) (Object) stackIn_753_0[stackIn_214_1]).b(99 + (var9 * 28 - 2), -2 + (66 + var8));
                var9++;
              }
              if (decompiledFrameCompleted5) {
                if (this.field_q != null &&
                  this.field_J) {
                  nf.field_g[this.field_q.field_Z.field_d].b(10, 9 + var8);
                  var9_refLifetime2 = this.field_q.field_nb;
                  if (null != var9_refLifetime2 && (((oh) (var9_refLifetime2)).field_g == 0 ||
                    ((oh) (var9_refLifetime2)).field_g == 3 ||
                    ((oh) (var9_refLifetime2)).field_g == 8 ||
                    ((oh) (var9_refLifetime2)).field_g == 12)) {
                    var9_refLifetime2 = this.field_q.field_eb;
                  }
                  L60: {
                    L61: {
                      L62: {
                        boolean decompiledFrameCompleted4 = true;
                        L64: {
                          if (var9_refLifetime2 == null) {
                            if (this.field_q.field_Z.field_b == null) {
                              break L64;
                            }
                            if (this.field_q.field_Z.field_b.field_g != 17) {
                              break L64;
                            }
                            cc.field_i[17].a(192, 93, 367, 10 + (var8 + 36), (byte) 21);
                            if (var19 == 0) {
                              break L64;
                            }
                          }
                          cc.field_i[((oh) (var9_refLifetime2)).field_g].a(192, 93, 383, var8 + 46, (byte) 21);
                          if (this.field_q.field_nb == var9_refLifetime2) {
                            l.e(310, var8 + 10, 148, 73, 16777215);
                            if (this.field_L == 1) {
                              stackIn_256_0 = 1;
                              if (this.field_m) {
                                stackIn_257_1 = 0;
                              } else {
                                stackIn_257_1 = 1;
                              }
                              if (stackIn_256_0 == stackIn_257_1) {
                                l.e(311, 11 + var8, 146, 71, 16711680);
                              }
                            }
                          }
                          if (0 < ((oh) (var9_refLifetime2)).a(true)) {
                            var10_int = 73 / ((oh) (var9_refLifetime2)).a(true);
                            if (var10_int < 1) {
                              var10_int = 1;
                            }
                            if (1 <= var10_int) {
                              var12Lifetime2 = 1;
                              while (!(var12Lifetime2 > ((oh) (var9_refLifetime2)).a(true))) {
                                var11_intLifetime1 = (int)(((double)(-var12Lifetime2) + (double)((oh) (var9_refLifetime2)).a(param0) / 2.0) * (double)var10_int + (double)(var8 + 47));
                                stackIn_329_0 = 314;
                                stackIn_329_1 = var11_intLifetime1;
                                stackIn_329_2 = 4;
                                stackIn_329_3 = 1;
                                stackIn_329_4 = var10_int;
                                if (var19 != 0) {
                                  decompiledFrameCompleted4 = false;
                                  break;
                                }
                                if (stackIn_329_3 < stackIn_329_4) {
                                  stackIn_273_3 = var10_int - 1;
                                } else {
                                  stackIn_273_3 = 1;
                                }
                                if (((oh) (var9_refLifetime2)).field_c < var12Lifetime2) {
                                  stackIn_277_4 = 16711680;
                                } else {
                                  stackIn_277_4 = 65280;
                                }
                                l.f(stackIn_329_0, stackIn_329_1, stackIn_329_2, stackIn_273_3, stackIn_277_4);
                                var12Lifetime2++;
                              }
                            }
                          }
                          if ((decompiledFrameCompleted4) &&
                            (var9_refLifetime2 == this.field_q.field_nb)) {
                            var10_int = (int)Math.sqrt((double)(this.field_q.c((byte) -16) * this.field_q.field_y));
                            if (95 < var10_int) {
                              var10_int = 95;
                            }
                            og.field_f.a(var10_int + "%", 449, 80 + var8, 16777215, -1);
                            if (6 != ((oh) (var9_refLifetime2)).field_g &&
                              7 != ((oh) (var9_refLifetime2)).field_g &&
                              ((oh) (var9_refLifetime2)).field_c < ((oh) (var9_refLifetime2)).a(true)) {
                              nb.field_d[7].b(324, 50 + var8);
                              if (ef.field_j >= 324 &&
                                ef.field_j <= 354 &&
                                jb.field_b >= var8 + 50 &&
                                80 + var8 >= jb.field_b) {
                                nb.field_d[15].b(324, 50 + var8);
                              }
                              if (((oh) (var9_refLifetime2)).field_c <= 0 &&
                                mm.field_f <= 3.14) {
                                l.d(324, 50 + var8, 30, 30, 16711680, 128);
                              }
                            }
                          }
                        }
                        if (decompiledFrameCompleted4) {
                          var9_refLifetime2 = this.field_q.field_eb;
                          if (var9_refLifetime2 == null ||
                            ((oh) (var9_refLifetime2)).field_g != 0 &&
                            3 != ((oh) (var9_refLifetime2)).field_g &&
                            8 != ((oh) (var9_refLifetime2)).field_g &&
                            12 != ((oh) (var9_refLifetime2)).field_g) {
                            var9_refLifetime2 = this.field_q.field_nb;
                          }
                          if (var9_refLifetime2 == null) {
                            break L62;
                          }
                          var10_int = 467;
                          stackIn_329_0 = var10_int;
                          stackIn_329_1 = 10 + var8;
                          stackIn_329_2 = var10_int + 73;
                          stackIn_329_3 = var8 + 10;
                          stackIn_329_4 = 73;
                        }
                        l.c(stackIn_329_0, stackIn_329_1, stackIn_329_2, stackIn_329_3 + stackIn_329_4);
                        if (((oh) (var9_refLifetime2)).field_g == 0) {
                          cc.field_i[((oh) (var9_refLifetime2)).field_g].a(192, 93, var10_int + 81, var8 + 46, (byte) 21);
                          if (var19 != 0) {
                            cc.field_i[((oh) (var9_refLifetime2)).field_g].a(192, 93, var10_int + 73, 36 + var8 + 10, (byte) 21);
                          }
                        } else {
                          cc.field_i[((oh) (var9_refLifetime2)).field_g].a(192, 93, var10_int + 73, 36 + var8 + 10, (byte) 21);
                        }
                        l.c();
                        if (var9_refLifetime2 == this.field_q.field_nb) {
                          l.e(var10_int, 10 + var8, 73, 73, 16777215);
                          if (1 == this.field_L &&
                            !this.field_m) {
                            l.e(1 + var10_int, var8 + 11, 71, 71, 16711680);
                          }
                        }
                        if (0 < ((oh) (var9_refLifetime2)).a(true)) {
                          var11_intLifetime1 = 73 / ((oh) (var9_refLifetime2)).a(true);
                          if (var11_intLifetime1 < 1) {
                            var11_intLifetime1 = 1;
                          }
                          if (1 <= var11_intLifetime1) {
                            var13Lifetime1 = 1;
                            while (!(((oh) (var9_refLifetime2)).a(true) < var13Lifetime1)) {
                              var12Lifetime2 = (int)((double)(var8 + 47) + ((double)(-var13Lifetime1) + (double)((oh) (var9_refLifetime2)).a(true) / 2.0) * (double)var11_intLifetime1);
                              stackIn_426_0 = var10_int + 4;
                              stackIn_426_1 = var12Lifetime2;
                              stackIn_426_2 = 4;
                              stackIn_426_3 = -2;
                              stackIn_426_4 = ~var11_intLifetime1;
                              if (var19 != 0) {
                                break L61;
                              }
                              if (stackIn_426_3 <= stackIn_426_4) {
                                stackIn_364_3 = 1;
                              } else {
                                stackIn_364_3 = -1 + var11_intLifetime1;
                              }
                              if (((oh) (var9_refLifetime2)).field_c < var13Lifetime1) {
                                stackIn_368_4 = 16711680;
                              } else {
                                stackIn_368_4 = 65280;
                              }
                              l.f(stackIn_426_0, stackIn_426_1, stackIn_426_2, stackIn_364_3, stackIn_368_4);
                              var13Lifetime1++;
                            }
                          }
                          if (((oh) (var9_refLifetime2)).field_g != 6 &&
                            ((oh) (var9_refLifetime2)).field_g != 7 &&
                            ((oh) (var9_refLifetime2)).field_c < ((oh) (var9_refLifetime2)).a(true)) {
                            nb.field_d[7].b(478, var8 + 50);
                            if (((oh) (var9_refLifetime2)).field_c <= 0 &&
                              3.14 >= mm.field_f) {
                              l.d(478, var8 + 50, 30, 30, 16711680, 128);
                              if (-464 + (var10_int + 478) <= ef.field_j &&
                                -464 + (508 + var10_int) >= ef.field_j &&
                                jb.field_b >= (var8 + 50) &&
                                jb.field_b <= (var8 + 80)) {
                                nb.field_d[15].b(478, var8 + 50);
                              }
                            }
                          }
                        }
                        if (this.field_q.field_nb == var9_refLifetime2) {
                          var11_intLifetime1 = (int)Math.sqrt((double)(this.field_q.c((byte) -16) * this.field_q.field_y));
                          if (95 < var11_intLifetime1) {
                            var11_intLifetime1 = 95;
                          }
                          og.field_f.a(var11_intLifetime1 + "%", -464 + (531 + var10_int), 80 + var8, 16777215, -1);
                        }
                      }
                      if (null != this.field_q.field_b) {
                        l.c(547, 35 + var8, 595, 48 + var8 + 35);
                        var10 = cc.field_i[this.field_q.field_b.field_g].d();
                        var10.b();
                        if (this.field_q.field_b.field_g == 5) {
                          var10.b(547 - var10.field_p + 6, 26 + (var8 + var10.field_v / 2));
                        }
                        if (this.field_q.field_b.field_g == 11) {
                          var10.b(547 - var10.field_p, -3 + (var8 - (-32 - var10.field_v / 2)));
                        }
                        l.c();
                        if (this.field_m) {
                          l.e(547, var8 + 35, 48, 48, 16777215);
                          l.e(548, var8 + 36, 46, 46, 16711680);
                        }
                        og.field_f.a(Integer.toString(this.field_q.field_b.field_d), 589, var8 + 81, 16777215, -1);
                      }
                      if (this.field_q.field_B == 0) {
                        l.d(100, var8 + 67, 24, 24, 0, 128);
                      }
                      if (this.field_q.field_B == 1) {
                        l.d(128, 67 + var8, 24, 24, 0, 128);
                      }
                      if (eg.field_p != 0) {
                        break L60;
                      }
                      stackIn_426_0 = 185;
                      stackIn_426_1 = var8 + 67;
                      stackIn_426_2 = 24;
                      stackIn_426_3 = 24;
                      stackIn_426_4 = 0;
                    }
                    l.d(stackIn_426_0, stackIn_426_1, stackIn_426_2, stackIn_426_3, stackIn_426_4, 128);
                  }
                  if (5 <= eg.field_p) {
                    l.d(213, var8 + 67, 24, 24, 0, 128);
                  }
                  var10_int = 133;
                  var11_intLifetime1 = this.field_q.field_P * var10_int / this.field_q.field_mb;
                  var12Lifetime2 = var10_int * this.field_q.field_T / this.field_q.field_mb;
                  var13Lifetime1 = (this.field_q.field_u + this.field_q.field_m) * var10_int / 200;
                  l.d(var11_intLifetime1 + 159, var8 + 28, var10_int - var11_intLifetime1, 7, 16776960, 128);
                  l.d(var11_intLifetime1 + 159 + var12Lifetime2, var8 + 28, -var12Lifetime2 - (var11_intLifetime1 - var10_int), 7, 0, 192);
                  l.d(159 + var13Lifetime1, 45 + var8, var10_int - var13Lifetime1, 7, 0, 192);
                  var14 = this.field_q.field_jb;
                  boolean decompiledSharedTail1 = (this.field_q.field_B == 0);
                  if (!decompiledSharedTail1) {
                    var15 = var10_int * this.field_q.field_jb / this.field_q.field_v;
                    l.d(159 + var15, var8 + 11, -var15 + var10_int, 7, 0, 192);
                    decompiledSharedTail1 = (var19 != 0);
                  }
                  if (decompiledSharedTail1) {
                    var14 = 2 * var14 / 3;
                    var15 = var10_int * var14 / this.field_q.field_v;
                    l.d(159, var8 + 11, var15, 7, 16777215, 128);
                    l.d(159 + var15, var8 + 11, -var15 + var10_int, 7, 0, 192);
                  }
                  var14Lifetime2 = this.field_q.field_jb;
                  var15_ref_String = Integer.toString(var14Lifetime2);
                  if (this.field_q.field_B == 0) {
                    var15_ref_String = "<lt>" + var15_ref_String + "<gt>";
                  }
                  var16_ref_String = Integer.toString(this.field_q.field_P);
                  if (this.field_q.field_T > 0) {
                    var17 = this.field_q.field_P + this.field_q.field_T;
                    if (99 < var17) {
                      var17 = 99;
                    }
                    var16_ref_String = var16_ref_String + "/" + var17;
                  }
                  og.field_f.c(var15_ref_String, 134, 18 + var8, 0, 0);
                  og.field_f.c(var16_ref_String, 134, 35 + var8, 0, 0);
                  og.field_f.c(Integer.toString(this.field_q.field_u + this.field_q.field_m), 134, var8 + 52, 0, 0);
                  og.field_f.c(var15_ref_String, 135, 17 + var8, 0, 0);
                  og.field_f.c(var16_ref_String, 135, var8 + 34, 0, 0);
                  og.field_f.c(Integer.toString(this.field_q.field_m + this.field_q.field_u), 135, var8 + 51, 0, 0);
                  og.field_f.c(var15_ref_String, 135, 18 + var8, 8421631, -1);
                  og.field_f.c(var16_ref_String, 135, 35 + var8, 16719904, -1);
                  og.field_f.c(Integer.toString(this.field_q.field_u + this.field_q.field_m), 135, 52 + var8, 2162464, -1);
                }
                if (ha.field_o) {
                  if (this.field_B < 2) {
                    l.f(306, 7 + var8, 234, 79, 0);
                  }
                  if (this.field_B < 7) {
                    l.f(241, 66 + var8, 26, 26, 0);
                  }
                  if (this.field_B < 9) {
                    l.f(269, var8 + 66, 26, 26, 0);
                  }
                  if (this.field_B < 10) {
                    l.f(606, 7 + var8, 29, 79, 0);
                  }
                  if (this.field_B < 11) {
                    l.f(99, 66 + var8, 54, 26, 0);
                  }
                  if (this.field_B < 12) {
                    l.f(184, var8 + 66, 54, 26, 0);
                  }
                  if (this.field_B < 14) {
                    l.f(541, 7 + var8, 54, 54, 0);
                  }
                }
                var9 = 0;
                var10_int = -1;
                var11_intLifetime1Lifetime1 = 0;
                var12Lifetime2 = 0;
                while (12 > var12Lifetime2) {
                  stackIn_732_0 = null;
                  if (var19 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  if (stackIn_732_0 != this.field_C[var12Lifetime2] &&
                    null != this.field_C[var12Lifetime2].field_Z &&
                    this.field_C[var12Lifetime2].field_P > 0) {
                    if (this.field_q == null) {
                      this.field_q = this.field_C[var11_intLifetime1Lifetime1];
                    }
                    if (this.field_C[var12Lifetime2] == this.field_q) {
                      var10_int = var9;
                    }
                    var11_intLifetime1Lifetime1 = var12Lifetime2;
                    var9++;
                  }
                  var12Lifetime2++;
                }
                if (decompiledFrameCompleted3) {
                  if (var9 <= 1) {
                    var12Lifetime2 = 90;
                  }
                  if (var9 > 1 ||
                    var19 != 0) {
                    var12Lifetime2 = 550 / (-1 + var9);
                  }
                  if (var12Lifetime2 > 90) {
                    var12Lifetime2 = 90;
                  }
                  var13Lifetime1Lifetime1 = -1 + var9;
                  while (var13Lifetime1Lifetime1 >= 0) {
                    var14Lifetime1 = var12Lifetime2;
                    stackIn_745_0 = ~var10_int;
                    stackIn_745_1 = ~var13Lifetime1Lifetime1;
                    if (var19 != 0) {
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                    if (stackIn_745_0 == stackIn_745_1) {
                      var14Lifetime1 = 90;
                    }
                    var4Lifetime1Lifetime1 = var13Lifetime1Lifetime1 * var12Lifetime2;
                    if (var10_int < var13Lifetime1Lifetime1) {
                      var4Lifetime1Lifetime1 = var4Lifetime1Lifetime1 + (90 - var12Lifetime2);
                    }
                    while (null == this.field_C[var11_intLifetime1Lifetime1] ||
                      !(this.field_C[var11_intLifetime1Lifetime1].field_P > 0)) {
                      var11_intLifetime1Lifetime1--;
                    }
                    var8 = 384;
                    if (var4Lifetime1Lifetime1 + (-th.field_i.field_r + var14Lifetime1) <= ef.field_j &&
                      jb.field_b >= 365 &&
                      394 >= jb.field_b &&
                      ef.field_j <= (var14Lifetime1 + var4Lifetime1Lifetime1) && (!ha.field_o ||
                      this.field_B >= 7)) {
                      this.field_G.field_Eb = new String[1];
                      this.field_G.field_Eb[0] = ne.field_b + this.field_C[var11_intLifetime1Lifetime1].field_Z.b(1);
                      if (oh.field_f == 1) {
                        if (this.field_B >= 7 &&
                          this.field_B < 10 &&
                          sj.field_b != 32 * (this.field_q.field_F - this.field_q.field_H) &&
                          16 * (this.field_q.field_F + this.field_q.field_H) != lg.field_c) {
                          this.field_B = this.field_B + 1;
                        }
                        this.field_q = this.field_C[var11_intLifetime1Lifetime1];
                        eg.field_p = this.field_q.field_E;
                        sj.field_b = (-this.field_q.field_H + this.field_q.field_F) * 32;
                        lg.field_c = 16 * (this.field_q.field_F + this.field_q.field_H);
                        this.a(-1);
                        this.field_L = 0;
                        this.field_m = false;
                      }
                    }
                    var15Lifetime1 = this.field_C[var11_intLifetime1Lifetime1].field_jb;
                    var16 = 52428;
                    var17Lifetime1 = 65535;
                    var18 = 16777215;
                    if (this.field_C[var11_intLifetime1Lifetime1].field_B == 0) {
                      var17Lifetime1 = 16711680;
                      var18 = 16744576;
                      var16 = 13369344;
                    }
                    if (~var10_int != ~var13Lifetime1Lifetime1) {
                      th.field_i.b(var4Lifetime1Lifetime1 - th.field_i.field_r + var14Lifetime1, 365);
                      og.field_f.b(this.field_C[var11_intLifetime1Lifetime1].field_Z.a(-1426, -12 + var14Lifetime1 - 8), var4Lifetime1Lifetime1, var8 - 5, 52224, -1);
                      og.field_f.a(Integer.toString(var15Lifetime1), -5 + (var14Lifetime1 + var4Lifetime1Lifetime1), -5 + var8, var16, -1);
                    } else {
                      vl.field_c.b(var14Lifetime1 + var4Lifetime1Lifetime1 - vl.field_c.field_r, 365);
                      og.field_f.b(this.field_C[var11_intLifetime1Lifetime1].field_Z.a(-1426, -20 + var14Lifetime1), var4Lifetime1Lifetime1, var8 - 5, 65280, -1);
                      og.field_f.a(Integer.toString(var15Lifetime1), -5 + (var4Lifetime1Lifetime1 + var14Lifetime1), -5 + var8, var17Lifetime1, -1);
                    }
                    if (this.field_C[var11_intLifetime1Lifetime1].field_ob) {
                      l.e(89 - vl.field_c.field_r + var4Lifetime1Lifetime1 - (-var14Lifetime1 + 1), 383, 4, 16777215);
                      l.e(89 + (-vl.field_c.field_r + (var4Lifetime1Lifetime1 + var14Lifetime1)) + 1, 383, 4, 16777215);
                      l.e(-vl.field_c.field_r + var4Lifetime1Lifetime1 + (var14Lifetime1 + 89), 383, 3, 16711680);
                      l.e(var4Lifetime1Lifetime1 + (-vl.field_c.field_r + var14Lifetime1) + 89, 383, 2, 0);
                    }
                    if (this.field_C[var11_intLifetime1Lifetime1].field_v == this.field_C[var11_intLifetime1Lifetime1].field_jb &&
                      1 == this.field_C[var11_intLifetime1Lifetime1].field_B) {
                      og.field_f.a(Integer.toString(var15Lifetime1), var14Lifetime1 + var4Lifetime1Lifetime1 - 5, var8 - 5, var18, -1);
                    }
                    var11_intLifetime1Lifetime1--;
                    var13Lifetime1Lifetime1--;
                  }
                }
              }
            }
            if (((decompiledFrameCompleted5) && (decompiledFrameCompleted3) && (decompiledFrameCompleted2)) &&
              (decompiledFrameRemainder2 = !(!g.field_tb)) &&
              (decompiledFrameRemainder2 = !(mm.field_e < 2))) {
              vc.field_f.b("QA MODE", 10, 70, 16711823, 0);
              stackIn_573_0 = this.field_h.a(-111, vf.field_a, eg.field_p, uf.field_c);
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameCompleted5) &&
            (decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2)) {
            var8_ref_dlLifetime1 = stackIn_573_0;
            if (null != var8_ref_dlLifetime1) {
              if (null != oi.field_J) {
                l.f(0, 100, oi.field_J.field_q, oi.field_J.field_u, 16711823);
                oi.field_J.b(0, 100);
              }
              var9_refLifetime1 = var8_ref_dlLifetime1.field_h;
              var10_intLifetime2 = 80;
              if (null != var9_refLifetime1) {
                og.field_f.a(((r) (var9_refLifetime1)).field_K, 630, var10_intLifetime2, 16777215, 0);
                var10_intLifetime2 += 12;
                og.field_f.a("Health " + ((r) (var9_refLifetime1)).field_P + "/" + ((r) (var9_refLifetime1)).field_mb, 630, var10_intLifetime2, 16777215, 0);
                var10_intLifetime2 += 12;
                og.field_f.a("Armour " + ((r) (var9_refLifetime1)).field_u + "/" + ((r) (var9_refLifetime1)).field_fb, 630, var10_intLifetime2, 16777215, 0);
                var10_intLifetime2 += 12;
                og.field_f.a("Shield " + ((r) (var9_refLifetime1)).field_m + "/" + ((r) (var9_refLifetime1)).field_J, 630, var10_intLifetime2, 16777215, 0);
                var10_intLifetime2 += 12;
                og.field_f.a("Weapon: " + od.field_c[((r) (var9_refLifetime1)).field_nb.field_g].field_j, 630, var10_intLifetime2, 16777215, 0);
                var10_intLifetime2 += 12;
                if (null != ((r) (var9_refLifetime1)).field_b) {
                  og.field_f.a("Nades:  " + od.field_c[((r) (var9_refLifetime1)).field_b.field_g].field_j + "*" + ((r) (var9_refLifetime1)).field_b.field_d, 630, var10_intLifetime2, 16777215, 0);
                }
                var10_intLifetime2 += 12;
                og.field_f.a("Tus " + ((r) (var9_refLifetime1)).field_jb + "/" + ((r) (var9_refLifetime1)).field_v, 630, var10_intLifetime2, 16777215, 0);
                var10_intLifetime2 += 12;
                og.field_f.a("Interupt " + ((r) (var9_refLifetime1)).field_q, 630, var10_intLifetime2, 16777215, 0);
                var10_intLifetime2 += 12;
                var10_intLifetime2 += 12;
                og.field_f.a("Use [ and ] to change weapon", 630, var10_intLifetime2, 16777215, 0);
                var10_intLifetime2 += 12;
                og.field_f.a("Use <lt> and > to change tus", 630, var10_intLifetime2, 16777215, 0);
                var10_intLifetime2 += 12;
                og.field_f.a("Hold shift and use <lt> and > to change interupttus", 630, var10_intLifetime2, 16777215, 0);
                var10_intLifetime2 += 12;
                og.field_f.a("Press / to kill this unit", 630, var10_intLifetime2, 16777215, 0);
                if (bh.field_e[uf.field_b]) {
                  if (bh.field_e[81]) {
                    ((r) (var9_refLifetime1)).field_q = ((r) (var9_refLifetime1)).field_q - 1;
                    if (((r) (var9_refLifetime1)).field_q < -((r) (var9_refLifetime1)).field_v) {
                      ((r) (var9_refLifetime1)).field_q = -((r) (var9_refLifetime1)).field_v;
                    }
                    if (!(-((r) (var9_refLifetime1)).field_jb <= ((r) (var9_refLifetime1)).field_q)) {
                      ((r) (var9_refLifetime1)).field_jb = -((r) (var9_refLifetime1)).field_q;
                      if (var19 != 0) {
                        ((r) (var9_refLifetime1)).field_jb = ((r) (var9_refLifetime1)).field_jb - 1;
                        if (((r) (var9_refLifetime1)).field_jb < 0) {
                          ((r) (var9_refLifetime1)).field_jb = 0;
                        }
                        if (((r) (var9_refLifetime1)).field_q < -((r) (var9_refLifetime1)).field_jb) {
                          ((r) (var9_refLifetime1)).field_q = -((r) (var9_refLifetime1)).field_jb;
                        }
                      }
                    }
                  } else {
                    ((r) (var9_refLifetime1)).field_jb = ((r) (var9_refLifetime1)).field_jb - 1;
                    if (((r) (var9_refLifetime1)).field_jb < 0) {
                      ((r) (var9_refLifetime1)).field_jb = 0;
                    }
                    if (((r) (var9_refLifetime1)).field_q < -((r) (var9_refLifetime1)).field_jb) {
                      ((r) (var9_refLifetime1)).field_q = -((r) (var9_refLifetime1)).field_jb;
                    }
                  }
                }
                var10_intLifetime2 += 12;
                if (bh.field_e[ne.field_e]) {
                  if (!bh.field_e[81]) {
                    ((r) (var9_refLifetime1)).field_jb = ((r) (var9_refLifetime1)).field_jb + 1;
                    if (((r) (var9_refLifetime1)).field_v < ((r) (var9_refLifetime1)).field_jb) {
                      ((r) (var9_refLifetime1)).field_jb = ((r) (var9_refLifetime1)).field_v;
                    }
                    if (!((((r) (var9_refLifetime1)).field_q + ((r) (var9_refLifetime1)).field_jb) <= ((r) (var9_refLifetime1)).field_v)) {
                      ((r) (var9_refLifetime1)).field_q = ((r) (var9_refLifetime1)).field_v - ((r) (var9_refLifetime1)).field_jb;
                      if (var19 != 0) {
                        ((r) (var9_refLifetime1)).field_q = ((r) (var9_refLifetime1)).field_q + 1;
                        if (((r) (var9_refLifetime1)).field_q > ((r) (var9_refLifetime1)).field_v) {
                          ((r) (var9_refLifetime1)).field_q = ((r) (var9_refLifetime1)).field_v;
                        }
                        if (((r) (var9_refLifetime1)).field_v < (((r) (var9_refLifetime1)).field_q + ((r) (var9_refLifetime1)).field_jb)) {
                          ((r) (var9_refLifetime1)).field_jb = ((r) (var9_refLifetime1)).field_v - ((r) (var9_refLifetime1)).field_q;
                        }
                      }
                    }
                  } else {
                    ((r) (var9_refLifetime1)).field_q = ((r) (var9_refLifetime1)).field_q + 1;
                    if (((r) (var9_refLifetime1)).field_q > ((r) (var9_refLifetime1)).field_v) {
                      ((r) (var9_refLifetime1)).field_q = ((r) (var9_refLifetime1)).field_v;
                    }
                    if (((r) (var9_refLifetime1)).field_v < (((r) (var9_refLifetime1)).field_q + ((r) (var9_refLifetime1)).field_jb)) {
                      ((r) (var9_refLifetime1)).field_jb = ((r) (var9_refLifetime1)).field_v - ((r) (var9_refLifetime1)).field_q;
                    }
                  }
                }
                if (25 > nd.field_k) {
                  if (bh.field_e[42]) {
                    ((r) (var9_refLifetime1)).field_nb.field_g = ((r) (var9_refLifetime1)).field_nb.field_g - 1;
                    if (((r) (var9_refLifetime1)).field_nb.field_g == 17) {
                      ((r) (var9_refLifetime1)).field_nb.field_g = 16;
                    }
                    if (((r) (var9_refLifetime1)).field_nb.field_g == 5) {
                      ((r) (var9_refLifetime1)).field_nb.field_g = 4;
                    }
                    if (11 == ((r) (var9_refLifetime1)).field_nb.field_g) {
                      ((r) (var9_refLifetime1)).field_nb.field_g = 10;
                    }
                    nd.field_k = 25;
                    if (((r) (var9_refLifetime1)).field_nb.field_g <= -1) {
                      ((r) (var9_refLifetime1)).field_nb.field_g = 18;
                    }
                  }
                  if (bh.field_e[43]) {
                    ((r) (var9_refLifetime1)).field_nb.field_g = ((r) (var9_refLifetime1)).field_nb.field_g + 1;
                    if (17 == ((r) (var9_refLifetime1)).field_nb.field_g) {
                      ((r) (var9_refLifetime1)).field_nb.field_g = 18;
                    }
                    if (((r) (var9_refLifetime1)).field_nb.field_g == 5) {
                      ((r) (var9_refLifetime1)).field_nb.field_g = 6;
                    }
                    if (((r) (var9_refLifetime1)).field_nb.field_g == 11) {
                      ((r) (var9_refLifetime1)).field_nb.field_g = 12;
                    }
                    if (((r) (var9_refLifetime1)).field_nb.field_g >= 19) {
                      ((r) (var9_refLifetime1)).field_nb.field_g = 0;
                    }
                    nd.field_k = 25;
                  }
                }
                decompiledFrameRemainder2 = !(!bh.field_e[73]);
                if (decompiledFrameRemainder2) {
                  ((r) (var9_refLifetime1)).field_d = 5;
                  ((r) (var9_refLifetime1)).field_A = 0;
                  ((r) (var9_refLifetime1)).field_S = true;
                  ((r) (var9_refLifetime1)).field_P = 0;
                  decompiledFrameRemainder2 = (var19 != 0);
                }
              }
              if (decompiledFrameRemainder2) {
                if (var8_ref_dlLifetime1.field_v == 0 ||
                  var8_ref_dlLifetime1.field_v == 1) {
                  og.field_f.a("Press the numberkeys from 0 to 6 to create a unit here", 630, var10_intLifetime2, 16777215, 0);
                  var10_intLifetime2 += 12;
                }
                var11 = null;
                if (bh.field_e[25]) {
                  var11 = new r(0, this.field_G.field_Bb);
                }
                if (bh.field_e[16]) {
                  var11 = new r(1, this.field_G.field_Bb);
                }
                if (bh.field_e[17]) {
                  var11 = new r(2, this.field_G.field_Bb);
                }
                if (bh.field_e[18]) {
                  var11 = new r(3, this.field_G.field_Bb);
                }
                if (bh.field_e[19]) {
                  var11 = new r(4, this.field_G.field_Bb);
                }
                if (bh.field_e[20]) {
                  var11 = new r(5, this.field_G.field_Bb);
                }
                if (bh.field_e[21]) {
                  var11 = new r(6, this.field_G.field_Bb);
                }
                if (null != var11) {
                  var12Lifetime1 = 0;
                  while (this.field_C.length > var12Lifetime1) {
                    stackIn_732_0 = null;
                    if (var19 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (stackIn_732_0 != this.field_C[var12Lifetime1]) {
                      var12Lifetime1++;
                      continue;
                    }
                    this.field_C[var12Lifetime1] = (r) (var11);
                    ((r) (var11)).field_c = var8_ref_dlLifetime1;
                    ((r) (var11)).field_H = vf.field_a;
                    ((r) (var11)).field_E = eg.field_p;
                    var8_ref_dlLifetime1.field_h = (r) (var11);
                    ((r) (var11)).field_F = uf.field_c;
                    var11 = null;
                    break;
                  }
                }
                if ((decompiledFrameCompleted1) &&
                  (var11 != null)) {
                  var12Lifetime1Lifetime1 = 0;
                  while (this.field_C.length > var12Lifetime1Lifetime1) {
                    if (var19 != 0) {
                      break;
                    }
                    if (this.field_C[var12Lifetime1Lifetime1] != null &&
                      0 >= this.field_C[var12Lifetime1Lifetime1].field_P) {
                      this.field_C[var12Lifetime1Lifetime1] = (r) (var11);
                      ((r) (var11)).field_H = vf.field_a;
                      ((r) (var11)).field_c = var8_ref_dlLifetime1;
                      ((r) (var11)).field_E = eg.field_p;
                      var8_ref_dlLifetime1.field_h = (r) (var11);
                      ((r) (var11)).field_F = uf.field_c;
                      var11 = null;
                      break;
                    }
                    var12Lifetime1Lifetime1++;
                  }
                }
              }
            }
          }
          if ((decompiledFrameCompleted5) &&
            (decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            if (this.field_w) {
              this.field_h.c(5);
            }
            stackIn_732_0 = null;
          }
          if ((decompiledFrameCompleted5) &&
            (decompiledFrameCompleted2)) {
            if (stackIn_732_0 == this.field_K &&
              !this.field_J) {
              this.field_K = mk.field_f;
              var8 = vc.field_f.b(this.field_K);
              var9 = 24;
              if (var8 >= 320) {
                var8 = 320;
              }
              var9 = 24 * vc.field_f.c(this.field_K, var8);
              l.f(320 - var8 / 2 - 10, 237 - (var9 / 2 - 122), var8 + 20, 8 + var9, 8388608);
              jl.a(jc.field_G, 6 + var9 + 8, 116 + (-(var9 / 2) + 240), 20 + var8 + 6, (byte) -115, -13 + (-(var8 / 2) + 320));
              kb.a(116, 24, var8 + (-(var8 / 2) + 320), this.field_K, -(var8 / 2) + 320, 50 + (240 - var9 + 105), 16777215);
              this.field_K = null;
            }
            decompiledFrameRemainder0 = (null != this.field_K);
            if (decompiledFrameRemainder0) {
              jm.field_h = jm.field_h + 1;
              stackIn_745_0 = ~jm.field_h;
              stackIn_745_1 = -101;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted5)) {
            if (stackIn_745_0 < stackIn_745_1) {
              lg.field_c = this.field_k;
              this.field_K = null;
              sj.field_b = this.field_c;
              jm.field_h = 0;
              eg.field_p = this.field_E;
            }
            var8 = vc.field_f.b(this.field_K);
            var9 = 24;
            if (var8 >= 320) {
              var8 = 320;
            }
            if (var8 < og.field_f.b(jc.field_B)) {
              var8 = og.field_f.b(jc.field_B);
            }
            var9 = 24 + 24 * vc.field_f.c(this.field_K, var8);
            l.f(-10 - var8 / 2 + 320, 50 + (-28 - var9 / 2 + 240), var8 + 20, 8 + var9, 8388608);
            stackIn_753_0 = jc.field_G;
            stackIn_753_1 = var9 + 14;
            stackIn_753_2 = 209 + (-(var9 / 2) + 50);
          }
          if (decompiledFrameRemainder0) {
            jl.a(stackIn_753_0, stackIn_753_1, stackIn_753_2, var8 + 26, (byte) 103, -3 + (310 - var8 / 2));
            vc.field_f.a(this.field_K, -(var8 / 2) + 320, 24 + (240 - var9 / 2), var8, var9, 16777215, 0, 1, 0, vc.field_f.field_s);
            og.field_f.c(jc.field_B, 320, 24 + (var9 / 2 + 240), 16777215, -1);
          }
          vb.field_i = 25;
          ge.field_b = 610;
          if (this.field_J) {
            tf.a(vb.field_i, (byte) 29, 390, ge.field_b, true, 89);
          }
          boolean decompiledFrameCompleted0 = true;
          if (!this.field_w ||
            !this.field_J) {
            var8_ref_th = this.field_n;
            var9Lifetime1 = 361;
            if (!this.field_J) {
              var9Lifetime1 = 472;
            }
            while (var8_ref_th != null) {
              rh.field_b[11].a(0, -14 + var9Lifetime1, 16, 16);
              stackIn_782_0 = var8_ref_th.field_h;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (!stackIn_782_0) {
                var10_intLifetime1 = 65280;
                if (1 == var8_ref_th.field_d / 5 % 2) {
                  var10_intLifetime1 = 16777215;
                }
                og.field_f.b(var8_ref_th.field_b, 21, var9Lifetime1, 0, -1);
                og.field_f.b(var8_ref_th.field_b, 19, var9Lifetime1, 0, -1);
                og.field_f.b(var8_ref_th.field_b, 20, var9Lifetime1 + 1, 0, -1);
                og.field_f.b(var8_ref_th.field_b, 20, -1 + var9Lifetime1, 0, -1);
                og.field_f.b(var8_ref_th.field_b, 20, var9Lifetime1, var10_intLifetime1, -1);
              } else {
                var10_intLifetime1 = 65793 * var8_ref_th.field_d;
                og.field_f.b(var8_ref_th.field_b, 21, var9Lifetime1, 0, -1);
                og.field_f.b(var8_ref_th.field_b, 19, var9Lifetime1, 0, -1);
                og.field_f.b(var8_ref_th.field_b, 20, var9Lifetime1 + 1, 0, -1);
                og.field_f.b(var8_ref_th.field_b, 20, -1 + var9Lifetime1, 0, -1);
                og.field_f.b(var8_ref_th.field_b, 20, var9Lifetime1, var10_intLifetime1, -1);
              }
              if (null != var8_ref_th) {
                var8_ref_th = var8_ref_th.field_f;
              }
              var9Lifetime1 -= 16;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_782_0 = param1;
          }
          if (stackIn_782_0) {
            this.field_G.field_Eb = null;
          }
          if (this.field_J) {
            l.d(162, 7, 364, 33, 0, 128);
            l.b(162, 39, 364, 4473924);
            ua.field_b.b(0, 0);
            if (null != this.field_G.field_Eb) {
              boolean decompiledSharedTail0 = (this.field_G.field_Eb.length != 1);
              if (!decompiledSharedTail0) {
                og.field_f.a(this.field_G.field_Eb[0], 178, 6, 332, 33, 16777215, -1, 1, 1, 12);
                decompiledSharedTail0 = (var19 != 0);
              }
              if (decompiledSharedTail0) {
                og.field_f.a(this.field_G.field_Eb[0], 178, 6, 162, 33, 16777215, -1, 1, 1, 12);
                l.f(344, 10, 27, 4473924);
                og.field_f.a(this.field_G.field_Eb[1], 348, 6, 162, 33, 16777215, -1, 1, 1, 12);
              }
            }
          }
          if (this.field_b) {
            le.field_q = null;
          }
          if (le.field_q != null) {
            le.field_q.a((byte) -100);
          }
          if (var3_int != 0 &&
            !li.field_a) {
            var8Lifetime1 = 0;
            while (true) {
              stackIn_810_0 = this.field_h;
              if (stackIn_810_0.field_b <= var8Lifetime1) {
                return;
              }
              if (var19 != 0) {
                return;
              }
              var9Lifetime2 = 0;
              while (this.field_h.field_e > var9Lifetime2) {
                stackIn_810_0Lifetime1 = this.field_h;
                var10_ref = stackIn_810_0Lifetime1.field_f[var8Lifetime1][var9Lifetime2];
                while (null != var10_ref) {
                  var10_ref.field_p = 0;
                  var10_ref = var10_ref.field_C;
                }
                var9Lifetime2++;
              }
              var8Lifetime1++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "e.U(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0) {
        try {
          fi.field_m = null;
          ql.field_i = -1;
          ld.field_e = -1;
          og.field_d = -1;
          if (param0 != -3) {
            this.field_d = 61;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "e.G(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, ci param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int stackIn_69_0Lifetime1;
        int stackIn_69_0Lifetime2;
        int stackIn_69_1Lifetime1;
        int stackIn_69_1Lifetime2;
        int stackIn_78_0Lifetime1;
        int stackIn_78_1Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var14Lifetime3Lifetime1;
        int var14Lifetime3Lifetime2;
        var18 = Terraphoenix.field_V;
        try {
          var5_int = -16 + param3.field_u;
          if (60 == param3.field_u) {
            var5_int = -12 + param3.field_u;
          }
          var6 = param2;
          var6 = var6 + param3.field_p;
          var7 = param1;
          var7 = var7 + param3.field_v;
          var8 = 0;
          var9 = param3.field_p + param2;
          var10 = param1 + param3.field_v;
          var11 = param3.field_t;
          var12 = param3.field_r;
          if (param0 != -101) {
            return;
          }
          if (l.field_d > var7) {
            var14 = l.field_d - var7;
            var11 = var11 - var14;
            var8 = var8 + var14 * var12;
            var7 = l.field_d;
            var10 = var10 + var14;
          }
          var13 = 0;
          if (l.field_c < var7 + var11) {
            var11 = var11 - (-l.field_c + (var11 + var7));
          }
          if (var6 < l.field_b) {
            var14Lifetime1 = l.field_b - var6;
            var13 = var13 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            var12 = var12 - var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var6 = l.field_b;
          }
          if (l.field_f < var6 + var12) {
            var14Lifetime2 = var12 + var6 - l.field_f;
            var12 = var12 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
          }
          if (0 < var12 &&
            var11 > 0) {
            var15 = var9;
            var16 = var10;
            var17 = -(var12 >> 3);
            var12 = -(var12 & 7);
            var7Lifetime1 = -var11;
            while (0 > var7Lifetime1) {
              if (var18 != 0) {
                return;
              }
              var6Lifetime1 = var17;
              while (var6Lifetime1 < 0) {
                incrementValue$0 = var8;
                var8++;
                var14Lifetime3 = param3.field_z[incrementValue$0];
                stackIn_69_0 = 0;
                stackIn_69_1 = var14Lifetime3;
                if (stackIn_69_0 != stackIn_69_1) {
                  gd.field_a[var15][var16] = param1 + (var5_int + Math.abs(var15 - var9) / 2);
                }
                var15++;
                incrementValue$1 = var8;
                var8++;
                var14Lifetime3 = param3.field_z[incrementValue$1];
                if (var14Lifetime3 != 0) {
                  gd.field_a[var15][var16] = param1 + var5_int + Math.abs(var15 - var9) / 2;
                }
                incrementValue$2 = var8;
                var8++;
                var14Lifetime3 = param3.field_z[incrementValue$2];
                var15++;
                if (var14Lifetime3 != 0) {
                  gd.field_a[var15][var16] = Math.abs(var15 - var9) / 2 + (param1 + var5_int);
                }
                var15++;
                incrementValue$3 = var8;
                var8++;
                var14Lifetime3 = param3.field_z[incrementValue$3];
                if (var14Lifetime3 != 0) {
                  gd.field_a[var15][var16] = Math.abs(-var9 + var15) / 2 + param1 + var5_int;
                }
                var15++;
                var6Lifetime1++;
              }
              var6Lifetime1Lifetime1 = var17;
              while (var6Lifetime1Lifetime1 < 0) {
                incrementValue$4 = var8;
                var8++;
                var14Lifetime3Lifetime1 = param3.field_z[incrementValue$4];
                stackIn_69_0Lifetime1 = -1;
                stackIn_69_1Lifetime1 = ~var14Lifetime3Lifetime1;
                if (stackIn_69_0Lifetime1 != stackIn_69_1Lifetime1) {
                  gd.field_a[var15][var16] = Math.abs(var15 - var9 + var17 * 8) / 2 + var5_int + param1;
                }
                var15++;
                incrementValue$5 = var8;
                var8++;
                var14Lifetime3Lifetime1 = param3.field_z[incrementValue$5];
                if (var14Lifetime3Lifetime1 != 0) {
                  gd.field_a[var15][var16] = var5_int + param1 + Math.abs(var17 * 8 + (var15 - var9)) / 2;
                }
                var15++;
                incrementValue$6 = var8;
                var8++;
                var14Lifetime3Lifetime1 = param3.field_z[incrementValue$6];
                if (0 != var14Lifetime3Lifetime1) {
                  gd.field_a[var15][var16] = Math.abs(8 * var17 + var15 - var9) / 2 + (param1 + var5_int);
                }
                var15++;
                incrementValue$7 = var8;
                var8++;
                var14Lifetime3Lifetime1 = param3.field_z[incrementValue$7];
                if (var14Lifetime3Lifetime1 != 0) {
                  gd.field_a[var15][var16] = param1 + var5_int + Math.abs(var17 * 8 + var15 - var9) / 2;
                }
                var15++;
                var6Lifetime1Lifetime1++;
              }
              var6Lifetime1Lifetime2 = var12;
              while (true) {
                stackIn_69_0Lifetime2 = ~var6Lifetime1Lifetime2;
                stackIn_69_1Lifetime2 = -1;
                if (stackIn_69_0Lifetime2 <= stackIn_69_1Lifetime2) {
                  break;
                }
                incrementValue$8 = var8;
                var8++;
                var14Lifetime3Lifetime2 = param3.field_z[incrementValue$8];
                stackIn_78_0 = 0;
                stackIn_78_1 = var14Lifetime3Lifetime2;
                if (stackIn_78_0 != stackIn_78_1) {
                  gd.field_a[var15][var16] = var5_int + (param1 + Math.abs(var17 * 8 + (var15 - var9)) / 2);
                }
                var15++;
                var6Lifetime1Lifetime2++;
              }
              stackIn_78_0Lifetime1 = var8;
              stackIn_78_1Lifetime1 = var13;
              var8 = stackIn_78_0Lifetime1 + stackIn_78_1Lifetime1;
              var16++;
              var15 = var9;
              var7Lifetime1++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_83_0 = var5;
          stackIn_83_1 = new StringBuilder().append("e.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(')').toString());
        }
    }

    final void a(int param0, String param1, int param2) {
        th var4 = null;
        int var5 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = Terraphoenix.field_V;
        try {
          var4 = this.field_n;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 == null))) {
            stackIn_17_0 = param0;
            stackIn_17_1 = var4.field_a;
            if (var5 == 0) {
              if (stackIn_17_0 == stackIn_17_1) {
                if (0 == var4.field_b.compareTo(param1)) {
                  return;
                }
                this.field_n = new th(param0, param1, this.field_n);
                return;
              }
              var4 = var4.field_f;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            if (null == var4) {
              this.field_n = new th(param0, param1, this.field_n);
            }
            stackIn_17_0 = param2;
            stackIn_17_1 = -3;
          }
          if (stackIn_17_0 > stackIn_17_1) {
            this.field_z = -33;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_24_0 = var4_ref;
          stackIn_24_1 = new StringBuilder().append("e.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          if (!param0) {
            return;
          }
          var2_int = 0;
          while (var2_int < this.field_C.length) {
            if (var3 != 0) {
              return;
            }
            if (null != this.field_C[var2_int] &&
              null == this.field_C[var2_int].field_Z) {
              this.field_C[var2_int].field_P = 0;
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "e.E(" + param0 + ')');
        }
    }

    final void a(Terraphoenix param0, byte param1) {
        dl dupTemp$0 = null;
        dl dupTemp$1 = null;
        boolean stackIn_17_1 = false;
        r stackIn_53_0 = null;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_91_0 = 0;
        r stackIn_170_0 = null;
        RuntimeException stackIn_218_0 = null;
        StringBuilder stackIn_218_1 = null;
        String stackIn_219_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        r var4_ref_r = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_58_0Lifetime1;
        int stackIn_58_1Lifetime1;
        int var4Lifetime1;
        int var6Lifetime1;
        var7 = Terraphoenix.field_V;
        try {
          this.field_L = 0;
          var3_int = 0;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (var3_int < 12) {
              stackIn_53_0 = this.field_C[var3_int];
              if (var7 == 0) {
                if (stackIn_53_0 != null &&
                  this.field_C[var3_int].field_Z != null) {
                  this.field_C[var3_int].field_ob = false;
                }
                var3_int++;
                continue;
              }
            } else {
              var4 = 100 % ((param1 - 17) / 46);
              this.b((byte) -3);
              this.field_D = null;
              stackIn_17_1 = !(this.field_J);
              this.field_J = stackIn_17_1;
              if (this.field_J) {
                jh.field_n = jh.field_n + 1;
              }
              decompiledFrameRemainder0 = !(this.field_J);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (12 == param0.field_Bb ||
                13 == param0.field_Bb))) {
                if (Math.random() * 100.0 < 50.0 &&
                  !this.field_h.field_f[this.field_h.field_b / 2][2].field_z &&
                  !this.field_h.a(this.field_h.field_b / 2, false, 0, 2)) {
                  var3_int = 0;
                  var4_ref_r = this.field_C[0];
                  while (var4_ref_r != null) {
                    stackIn_58_0 = ~(this.field_C.length - 1);
                    stackIn_58_1 = ~var3_int;
                    if (var7 != 0) {
                      if (stackIn_58_0 < stackIn_58_1) {
                        var3_int++;
                        var4_ref_r = this.field_C[var3_int];
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_58_0 < stackIn_58_1) {
                      var3_int++;
                      var4_ref_r = this.field_C[var3_int];
                      continue;
                    }
                    break;
                  }
                  if ((decompiledFrameCompleted1) &&
                    (decompiledFrameCompleted0) &&
                    (null == var4_ref_r)) {
                    this.field_C[var3_int] = new r(4, param0.field_Bb);
                    var4_ref_r = this.field_C[var3_int];
                    var4_ref_r.field_F = this.field_h.field_b / 2;
                    var4_ref_r.field_H = 2;
                    var4_ref_r.field_c = this.field_h.field_f[this.field_h.field_b / 2][2];
                    var4_ref_r.field_c.field_h = var4_ref_r;
                  }
                }
                if (((decompiledFrameCompleted1) && (decompiledFrameCompleted0)) &&
                  (decompiledFrameRemainder0 = !(!(50.0 > Math.random() * 100.0))) &&
                  (decompiledFrameRemainder0 = !(this.field_h.field_f[2][this.field_h.field_e / 2].field_z)) &&
                  (decompiledFrameRemainder0 = !(this.field_h.a(2, false, 0, this.field_h.field_e / 2)))) {
                  var3_int = 0;
                  stackIn_53_0 = this.field_C[0];
                }
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              var4_ref_r = stackIn_53_0;
              while (var4_ref_r != null) {
                stackIn_65_0 = var3_int;
                if (var7 != 0) {
                  break L1;
                }
                stackIn_58_0Lifetime1 = stackIn_65_0;
                stackIn_58_1Lifetime1 = this.field_C.length - 1;
                if (stackIn_58_0Lifetime1 >= stackIn_58_1Lifetime1) {
                  break;
                }
                var3_int++;
                var4_ref_r = this.field_C[var3_int];
              }
            }
            if ((decompiledFrameRemainder0) &&
              (var4_ref_r == null)) {
              this.field_C[var3_int] = new r(4, param0.field_Bb);
              var4_ref_r = this.field_C[var3_int];
              var4_ref_r.field_F = 2;
              var4_ref_r.field_H = this.field_h.field_e / 2;
              var4_ref_r.field_c = this.field_h.field_f[2][this.field_h.field_e / 2];
              var4_ref_r.field_c.field_h = var4_ref_r;
            }
            var3_int = 0;
            stackIn_65_0 = 0;
            break;
          }
          var5 = stackIn_65_0;
          while (true) {
            stackIn_67_0 = ~this.field_h.field_b;
            stackIn_67_1 = ~var5;
            if (stackIn_67_0 < stackIn_67_1) {
              stackIn_91_0 = 0;
              if (var7 == 0) {
                var6 = stackIn_91_0;
                while (var6 < this.field_h.field_e) {
                  this.field_h.field_f[var5][var6].field_B = false;
                  stackIn_67_0 = 0;
                  stackIn_67_1 = this.field_h.field_f[var5][var6].field_i;
                  if (stackIn_67_0 < stackIn_67_1) {
                    if ((1 & this.field_h.field_f[var5][var6].field_i) > 0 &&
                      this.field_h.field_f[var5][var6].field_g % 4 == 3) {
                      dupTemp$0 = this.field_h.field_f[var5][var6];
                      dupTemp$0.field_g = dupTemp$0.field_g - 3;
                      this.field_h.field_f[var5][var6].a(1, true, 114);
                    }
                    if (0 < (2 & this.field_h.field_f[var5][var6].field_i) &&
                      this.field_h.field_f[var5][var6].field_k % 4 == 3) {
                      dupTemp$1 = this.field_h.field_f[var5][var6];
                      dupTemp$1.field_k = dupTemp$1.field_k - 3;
                      this.field_h.field_f[var5][var6].a(2, true, 87);
                    }
                  }
                  var6++;
                }
                var5++;
                continue;
              }
            } else {
              stackIn_91_0 = 0;
            }
            var4Lifetime1 = stackIn_91_0;
            this.field_A = false;
            var5 = 0;
            L24: while (true) {
              if (var5 < this.field_C.length) {
                stackIn_170_0 = this.field_C[var5];
                if (var7 == 0) {
                  boolean decompiledFrameRemainder1 = true;
                  if (stackIn_170_0 != null &&
                    this.field_C[var5].field_P > 0) {
                    if (null != this.field_C[var5].field_Z ||
                      this.field_C[var5].field_C == 0) {
                      var3_int++;
                      if (this.field_z > 0 &&
                        this.field_C[var5].field_c != null &&
                        this.field_C[var5].field_c.field_d) {
                        this.field_A = true;
                      }
                      if (this.field_C[var5].field_Z != null &&
                        null != this.field_C[var5].field_c) {
                        this.field_q = this.field_C[var5];
                      }
                      if (this.field_J) {
                        this.field_C[var5].b(60);
                      } else {
                        this.field_C[var5].f(100);
                      }
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      if (this.field_C[var5].field_C == 1) {
                        var4Lifetime1++;
                      }
                      if (!this.field_J) {
                        this.field_C[var5].b(60);
                      } else {
                        this.field_C[var5].f(106);
                      }
                      this.field_C[var5].field_k = false;
                      var6Lifetime1 = 0;
                      while (this.field_C.length > var6Lifetime1) {
                        stackIn_170_0 = this.field_C[var6Lifetime1];
                        if (stackIn_170_0 != null &&
                          this.field_C[var6Lifetime1].field_C == 0 &&
                          this.field_C[var6Lifetime1].field_P > 0 &&
                          ~this.field_C[var5].field_E == ~this.field_C[var6Lifetime1].field_E &&
                          this.field_h.a((byte) -93, this.field_C[var6Lifetime1], this.field_C[var5])) {
                          this.field_C[var5].field_k = true;
                          this.field_C[var5].field_h = true;
                          this.field_C[var5].field_i = this.field_C[var5].field_F;
                          this.field_C[var5].field_gb = this.field_C[var5].field_H;
                        }
                        var6Lifetime1++;
                      }
                    }
                  }
                  var5++;
                  continue;
                }
              } else {
                if (!this.field_J) {
                  break L24;
                }
                if (null == this.field_q) {
                  break L24;
                }
                lg.field_c = -(this.field_q.field_E * 48) + 16 * (this.field_q.field_F + this.field_q.field_H);
                stackIn_170_0 = this.field_q;
              }
              eg.field_p = stackIn_170_0.field_E;
              sj.field_b = 32 * (this.field_q.field_F - this.field_q.field_H);
              this.a(-1);
              this.field_d = this.field_d + 1;
              this.field_m = false;
              this.field_L = 0;
              jm.field_h = 0;
              this.field_k = lg.field_c;
              this.field_E = eg.field_p;
              this.field_c = sj.field_b;
              this.field_K = mc.field_a + this.field_d;
              this.field_a = this.field_q.field_F;
              this.field_x = this.field_q.field_H;
              break;
            }
            if (!this.field_A &&
              this.field_z > 0 &&
              this.field_J &&
              this.field_z > 0) {
              this.field_z = this.field_z - 1;
              if (this.field_z > 0) {
                if (!(this.field_z > 3)) {
                  qd.$cfr$intArgs$a$e9dea5688aa5(91, 89);
                  if (var7 != 0) {
                    qd.$cfr$intArgs$a$e9dea5688aa5(57, 90);
                    this.a(0, param0);
                  }
                }
              } else {
                qd.$cfr$intArgs$a$e9dea5688aa5(57, 90);
                this.a(0, param0);
              }
            }
            if (this.field_A &&
              4 > this.field_z &&
              this.field_J &&
              this.field_z > 0) {
              this.field_z = 4;
            }
            if (var4Lifetime1 == 0 &&
              !this.field_J ||
              var3_int == 0) {
              this.a(-125, param0);
            }
            this.field_h.b((byte) -19);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_218_0 = var3;
          stackIn_218_1 = new StringBuilder().append("e.O(");
          if (param0 == null) {
            stackIn_219_2 = "null";
          } else {
            stackIn_219_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_218_0), ((StringBuilder) (Object) stackIn_218_1).append(stackIn_219_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, Terraphoenix param1) {
        r dupTemp$0 = null;
        r dupTemp$1 = null;
        r dupTemp$2 = null;
        r dupTemp$3 = null;
        dl dupTemp$4 = null;
        dl dupTemp$5 = null;
        dl dupTemp$6 = null;
        dl dupTemp$7 = null;
        int stackIn_27_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        boolean stackIn_97_0 = false;
        Object stackIn_114_0 = null;
        Object stackIn_114_1 = null;
        Object stackIn_130_0 = null;
        Object stackIn_130_1 = null;
        r stackIn_149_0 = null;
        r stackIn_221_0 = null;
        boolean stackIn_236_0 = false;
        Object stackIn_254_0 = null;
        r stackIn_254_1 = null;
        Object stackIn_256_0 = null;
        r stackIn_256_1 = null;
        r stackIn_262_0 = null;
        r stackIn_272_0 = null;
        r stackIn_273_0 = null;
        r stackIn_292_0 = null;
        Object stackIn_313_0 = null;
        r stackIn_313_1 = null;
        Object stackIn_332_0 = null;
        r stackIn_332_1 = null;
        Object stackIn_333_0 = null;
        r stackIn_333_1 = null;
        r stackIn_349_0 = null;
        r stackIn_390_0 = null;
        Object stackIn_439_0 = null;
        r stackIn_439_1 = null;
        Object stackIn_494_0 = null;
        r stackIn_494_1 = null;
        int stackIn_568_0 = 0;
        Object stackIn_574_0 = null;
        Object stackIn_574_1 = null;
        Object stackIn_576_0 = null;
        r stackIn_576_1 = null;
        int stackIn_598_0 = 0;
        int stackIn_611_0 = 0;
        int stackIn_681_0 = 0;
        r stackIn_686_0 = null;
        Object stackIn_763_0 = null;
        r stackIn_763_1 = null;
        Object stackIn_797_0 = null;
        r stackIn_797_1 = null;
        Object stackIn_831_0 = null;
        Object stackIn_831_1 = null;
        Object stackIn_850_0 = null;
        Object stackIn_850_1 = null;
        Object stackIn_864_0 = null;
        Object stackIn_864_1 = null;
        Object stackIn_865_0 = null;
        r stackIn_865_1 = null;
        r stackIn_884_0 = null;
        r stackIn_909_0 = null;
        RuntimeException stackIn_927_0 = null;
        StringBuilder stackIn_927_1 = null;
        RuntimeException stackIn_929_0 = null;
        StringBuilder stackIn_929_1 = null;
        RuntimeException stackIn_930_0 = null;
        StringBuilder stackIn_930_1 = null;
        String stackIn_930_2 = null;
        boolean stackOut_96_0;
        boolean stackOut_235_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        th var4 = null;
        int var5 = 0;
        int var6 = 0;
        dl var7_ref_dl = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != le.field_q) {
                            /* Inlined CFG state: 4. */
                            {
                                le.field_q.a(false);
                                statePc = 5;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                statePc = 5;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        hl.field_a = false;
                        if (!this.field_u) {
                            /* Inlined CFG state: 8. */
                            {
                                if (1 == this.field_N) {
                                    /* Inlined CFG state: 11. */
                                    {
                                        this.field_u = true;
                                        var3_int = 0;
                                        var4_int = 0;
                                        statePc = 12;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 9. */
                                    {
                                        statePc = 110;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 6. */
                            {
                                /* Sequential CFG blocks: 6, 111. */
                                {
                                }
                                {
                                    var3_int = 1;
                                    var4_int = 0;
                                    statePc = 112;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (~var4_int <= ~ak.field_q) {
                            statePc = 109;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 13. */
                            {
                                if (var12 != 0) {
                                    statePc = 110;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 14. */
                                    {
                                        if (null == this.field_C[var4_int]) {
                                            statePc = 108;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 15. */
                                            {
                                                /* Sequential CFG blocks: 15, 17. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var4_int].field_c != null) {
                                                        statePc = 108;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 18. */
                                                        {
                                                            /* Sequential CFG blocks: 18, 20. */
                                                            {
                                                            }
                                                            {
                                                                if (var3_int >= 1) {
                                                                    statePc = 106;
                                                                } else {
                                                                    statePc = 21;
                                                                }
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_12) {
                        statePc = ((Object) stateCaught_12 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_12);
                        }
                        caughtException = stateCaught_12;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        /* Sequential CFG blocks: 21, 23. */
                        {
                        }
                        {
                            var3_int++;
                            var5 = 0;
                            var6 = 1;
                            statePc = 24;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_21) {
                        statePc = ((Object) stateCaught_21 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_21);
                        }
                        caughtException = stateCaught_21;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var10 = 1;
                        var8 = (int)((double)(-var6) + (double)var6 * Math.random() * 2.0) + uf.field_c;
                        if (1 > var8) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        statePc = ((Object) stateCaught_24 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_24);
                        }
                        caughtException = stateCaught_24;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        statePc = ((Object) stateCaught_25 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_25);
                        }
                        caughtException = stateCaught_25;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_26);
                        }
                        caughtException = stateCaught_26;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var8 = stackIn_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        statePc = ((Object) stateCaught_27 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_27);
                        }
                        caughtException = stateCaught_27;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = (int)((double)(-var6) + 2.0 * (Math.random() * (double)var6)) + vf.field_a;
                        if (var9 >= 1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        statePc = ((Object) stateCaught_28 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_28);
                        }
                        caughtException = stateCaught_28;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        statePc = ((Object) stateCaught_29 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_29);
                        }
                        caughtException = stateCaught_29;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (-2 + this.field_h.field_b < var8) {
                            /* Inlined CFG state: 33. */
                            {
                                var8 = -2 + this.field_h.field_b;
                                statePc = 34;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 31. */
                            {
                                statePc = 34;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_30) {
                        statePc = ((Object) stateCaught_30 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_30);
                        }
                        caughtException = stateCaught_30;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (this.field_h.field_e - 2 >= var9) {
                            statePc = 36;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 35. */
                            {
                                var9 = this.field_h.field_e - 2;
                                statePc = 36;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_34) {
                        statePc = ((Object) stateCaught_34 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_34);
                        }
                        caughtException = stateCaught_34;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        this.field_C[var4_int].field_F = var8;
                        var5++;
                        this.field_C[var4_int].field_H = var9;
                        var7_ref_dl = this.field_h.a(109, this.field_C[var4_int].field_H, 0, this.field_C[var4_int].field_F);
                        if (var5 <= 10) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var5 = 0;
                        var6++;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        statePc = ((Object) stateCaught_37 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_37);
                        }
                        caughtException = stateCaught_37;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (2 != this.field_h.field_a) {
                            statePc = 68;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 39. */
                            {
                                this.field_C[var4_int].a(true, this.field_h.field_b / 2, this.field_h.field_e / 2);
                                dupTemp$0 = this.field_C[var4_int];
                                dupTemp$0.field_U = dupTemp$0.field_U + 4;
                                if (8 <= this.field_C[var4_int].field_U) {
                                    statePc = 44;
                                } else {
                                    statePc = 40;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_38) {
                        statePc = ((Object) stateCaught_38 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_38);
                        }
                        caughtException = stateCaught_38;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        /* Sequential CFG blocks: 40, 42. */
                        {
                        }
                        {
                            statePc = 45;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_40) {
                        statePc = ((Object) stateCaught_40 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_40);
                        }
                        caughtException = stateCaught_40;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        dupTemp$1 = this.field_C[var4_int];
                        dupTemp$1.field_U = dupTemp$1.field_U - 8;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        statePc = ((Object) stateCaught_44 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_44);
                        }
                        caughtException = stateCaught_44;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11 = this.field_h.field_b / 4;
                        if (param1.field_Bb == 11) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        statePc = ((Object) stateCaught_45 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_45);
                        }
                        caughtException = stateCaught_45;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        statePc = ((Object) stateCaught_46 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_46);
                        }
                        caughtException = stateCaught_46;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = this.field_h.field_b / 8 + 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        statePc = ((Object) stateCaught_48 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_48);
                        }
                        caughtException = stateCaught_48;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var8 < -var11 + this.field_h.field_b / 2) {
                            statePc = 59;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 50. */
                            {
                                if (~var8 < ~(var11 + this.field_h.field_b / 2)) {
                                    statePc = 59;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 51. */
                                    {
                                        /* Sequential CFG blocks: 51, 53. */
                                        {
                                        }
                                        {
                                            if (this.field_h.field_e / 2 - var11 > var9) {
                                                statePc = 59;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 54. */
                                                {
                                                    /* Sequential CFG blocks: 54, 56. */
                                                    {
                                                    }
                                                    {
                                                        if (~(this.field_h.field_e / 2 + var11) <= ~var9) {
                                                            statePc = 60;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 57. */
                                                            {
                                                                statePc = 59;
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_49) {
                        statePc = ((Object) stateCaught_49 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_49);
                        }
                        caughtException = stateCaught_49;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var10 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        statePc = ((Object) stateCaught_59 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_59);
                        }
                        caughtException = stateCaught_59;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var9 >= this.field_h.field_e / 2 - var11 + 3) {
                            statePc = 68;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 61. */
                            {
                                if (this.field_h.field_b / 2 - 1 > var8) {
                                    statePc = 68;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 62. */
                                    {
                                        /* Sequential CFG blocks: 62, 64. */
                                        {
                                        }
                                        {
                                            if (~var8 < ~(this.field_h.field_b / 2 + 1)) {
                                                statePc = 68;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 65. */
                                                {
                                                    /* Sequential CFG blocks: 65, 67. */
                                                    {
                                                    }
                                                    {
                                                        var10 = 0;
                                                        statePc = 68;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_60) {
                        statePc = ((Object) stateCaught_60 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_60);
                        }
                        caughtException = stateCaught_60;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (this.field_h.field_a == 3) {
                            /* Inlined CFG state: 71. */
                            {
                                this.field_C[var4_int].a(true, this.field_h.field_b / 2, this.field_h.field_e / 2);
                                if (~var8 >= ~(this.field_h.field_b / 8)) {
                                    statePc = 82;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 72. */
                                    {
                                        if (~(this.field_h.field_b * 7 / 8) >= ~var8) {
                                            statePc = 82;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 73. */
                                            {
                                                /* Sequential CFG blocks: 73, 75. */
                                                {
                                                }
                                                {
                                                    if (this.field_h.field_e / 8 >= var9) {
                                                        statePc = 82;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 76. */
                                                        {
                                                            /* Sequential CFG blocks: 76, 78. */
                                                            {
                                                            }
                                                            {
                                                                if (~(this.field_h.field_e * 7 / 8) >= ~var9) {
                                                                    statePc = 82;
                                                                } else {
                                                                    statePc = 79;
                                                                }
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 69. */
                            {
                                statePc = 82;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_68) {
                        statePc = ((Object) stateCaught_68 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_68);
                        }
                        caughtException = stateCaught_68;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        /* Sequential CFG blocks: 79, 81. */
                        {
                        }
                        {
                            var10 = 0;
                            statePc = 82;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_79) {
                        statePc = ((Object) stateCaught_79 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_79);
                        }
                        caughtException = stateCaught_79;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (this.field_h.field_a == 4) {
                            statePc = 88;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 83. */
                            {
                                if (1 == this.field_h.field_a) {
                                    statePc = 88;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 84. */
                                    {
                                        /* Sequential CFG blocks: 84, 86. */
                                        {
                                        }
                                        {
                                            statePc = 89;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_82) {
                        statePc = ((Object) stateCaught_82 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_82);
                        }
                        caughtException = stateCaught_82;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        this.field_C[var4_int].a(true, this.field_h.field_b / 2, this.field_h.field_e / 2);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        statePc = ((Object) stateCaught_88 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_88);
                        }
                        caughtException = stateCaught_88;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (this.field_h.field_f[this.field_C[var4_int].field_F][this.field_C[var4_int].field_H].field_v < 3) {
                            statePc = 91;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 90. */
                            {
                                var10 = 0;
                                statePc = 91;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_89) {
                        statePc = ((Object) stateCaught_89 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_89);
                        }
                        caughtException = stateCaught_89;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackIn_94_0 = 0;
                        stackIn_92_0 = stackIn_94_0;
                        if (var10 != 0) {
                            /* Inlined CFG state: 94. */
                            {
                                stackIn_95_0 = stackIn_94_0;
                                stackIn_95_1 = 0;
                                statePc = 95;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 92. */
                            {
                                stackIn_95_0 = stackIn_92_0;
                                stackIn_95_1 = 1;
                                statePc = 95;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_91) {
                        statePc = ((Object) stateCaught_91 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_91);
                        }
                        caughtException = stateCaught_91;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (stackIn_95_0 != stackIn_95_1) {
                            statePc = 24;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 96. */
                            {
                                stackOut_96_0 = this.field_h.a(this.field_C[var4_int].field_F, false, 0, this.field_C[var4_int].field_H);
                                stackIn_27_0 = stackOut_96_0 ? 1 : 0;
                                stackIn_97_0 = stackOut_96_0;
                                if (var12 != 0) {
                                    statePc = 27;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 97. */
                                    {
                                        if (stackIn_97_0) {
                                            statePc = 24;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 98. */
                                            {
                                                if (var7_ref_dl.field_d) {
                                                    statePc = 24;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 99. */
                                                    {
                                                        this.field_h.field_f[this.field_C[var4_int].field_F][this.field_C[var4_int].field_H].field_h = this.field_C[var4_int];
                                                        this.field_C[var4_int].field_c = this.field_h.field_f[this.field_C[var4_int].field_F][this.field_C[var4_int].field_H];
                                                        this.field_q = this.field_C[var4_int];
                                                        lg.field_c = 16 * (this.field_q.field_F + this.field_q.field_H);
                                                        eg.field_p = this.field_q.field_E;
                                                        sj.field_b = (-this.field_q.field_H + this.field_q.field_F) * 32;
                                                        if (null == this.field_C[var4_int].field_nb) {
                                                            statePc = 103;
                                                        } else {
                                                            statePc = 100;
                                                        }
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_95) {
                        statePc = ((Object) stateCaught_95 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_95);
                        }
                        caughtException = stateCaught_95;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        qd.$cfr$intArgs$a$e9dea5688aa5(114, od.field_c[this.field_C[var4_int].field_nb.field_g].field_n);
                        if (var12 == 0) {
                            statePc = 105;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 101. */
                            {
                                statePc = 103;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_100) {
                        statePc = ((Object) stateCaught_100 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_100);
                        }
                        caughtException = stateCaught_100;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        qd.$cfr$intArgs$a$e9dea5688aa5(127, od.field_c[this.field_C[var4_int].field_eb.field_g].field_n);
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        statePc = ((Object) stateCaught_103 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_103);
                        }
                        caughtException = stateCaught_103;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        this.a(-1);
                        if (var12 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        statePc = ((Object) stateCaught_105 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_105);
                        }
                        caughtException = stateCaught_105;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        this.field_u = false;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        statePc = ((Object) stateCaught_106 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_106);
                        }
                        caughtException = stateCaught_106;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var4_int++;
                        if (var12 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        statePc = ((Object) stateCaught_108 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_108);
                        }
                        caughtException = stateCaught_108;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        this.field_u = false;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        statePc = ((Object) stateCaught_109 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_109);
                        }
                        caughtException = stateCaught_109;
                        continue stateLoop;
                    }
                }
                case 110: {
                    return;
                }
                case 112: {
                    try {
                        if (var4_int >= 12) {
                            statePc = 125;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 113. */
                            {
                                stackIn_130_0 = null;
                                stackIn_114_0 = stackIn_130_0;
                                stackIn_130_1 = this;
                                stackIn_114_1 = stackIn_130_1;
                                if (var12 != 0) {
                                    statePc = 130;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 114. */
                                    {
                                        if (stackIn_114_0 == ((e) (this)).field_C[var4_int]) {
                                            statePc = 124;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 115. */
                                            {
                                                /* Sequential CFG blocks: 115, 117. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var4_int].field_P <= 0) {
                                                        statePc = 124;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 118. */
                                                        {
                                                            /* Sequential CFG blocks: 118, 120. */
                                                            {
                                                            }
                                                            {
                                                                if (this.field_C[var4_int].field_Z == null) {
                                                                    statePc = 124;
                                                                } else {
                                                                    statePc = 121;
                                                                }
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_112) {
                        statePc = ((Object) stateCaught_112 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_112);
                        }
                        caughtException = stateCaught_112;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        /* Sequential CFG blocks: 121, 123. */
                        {
                        }
                        {
                            var3_int = 0;
                            statePc = 124;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_121) {
                        statePc = ((Object) stateCaught_121 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_121);
                        }
                        caughtException = stateCaught_121;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var4_int++;
                        if (var12 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        statePc = ((Object) stateCaught_124 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_124);
                        }
                        caughtException = stateCaught_124;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (var3_int != 0) {
                            /* Inlined CFG state: 128. */
                            {
                                this.a(29518, 2);
                                this.a(-1, rf.field_s, -41);
                                this.field_b = true;
                                statePc = 129;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 126. */
                            {
                                statePc = 129;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_125) {
                        statePc = ((Object) stateCaught_125 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_125);
                        }
                        caughtException = stateCaught_125;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackIn_130_0 = null;
                        stackIn_130_1 = this;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        statePc = ((Object) stateCaught_129 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_129);
                        }
                        caughtException = stateCaught_129;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (stackIn_130_0 == ((e) (this)).field_n) {
                            statePc = 139;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 131. */
                            {
                                if (!this.field_n.field_h) {
                                    statePc = 139;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 132. */
                                    {
                                        /* Sequential CFG blocks: 132, 134. */
                                        {
                                        }
                                        {
                                            if (this.field_n.field_d > 0) {
                                                statePc = 139;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 135. */
                                                {
                                                    /* Sequential CFG blocks: 135, 137. */
                                                    {
                                                    }
                                                    {
                                                        this.field_n = this.field_n.field_f;
                                                        statePc = 139;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_130) {
                        statePc = ((Object) stateCaught_130 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_130);
                        }
                        caughtException = stateCaught_130;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var4 = this.field_n;
                        if (var4 != null) {
                            statePc = 234;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        statePc = ((Object) stateCaught_139 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_139);
                        }
                        caughtException = stateCaught_139;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (this.field_b) {
                            /* Inlined CFG state: 145. */
                            {
                                if (!this.field_v) {
                                    statePc = 180;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 146. */
                                    {
                                        var5 = 0;
                                        statePc = 147;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 141. */
                            {
                                /* Sequential CFG blocks: 141, 143. */
                                {
                                }
                                {
                                    statePc = 234;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_140) {
                        statePc = ((Object) stateCaught_140 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_140);
                        }
                        caughtException = stateCaught_140;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (~var5 <= ~this.field_C.length) {
                            statePc = 180;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 148. */
                            {
                                stackIn_221_0 = this.field_C[var5];
                                stackIn_149_0 = stackIn_221_0;
                                if (var12 != 0) {
                                    statePc = 221;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 149. */
                                    {
                                        if (stackIn_149_0 == null) {
                                            statePc = 163;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 150. */
                                            {
                                                /* Sequential CFG blocks: 150, 152. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var5].field_Z == null) {
                                                        /* Inlined CFG state: 157. */
                                                        {
                                                            if (0 < this.field_C[var5].field_P) {
                                                                statePc = 161;
                                                            } else {
                                                                statePc = 158;
                                                            }
                                                            continue stateLoop;
                                                        }
                                                    } else {
                                                        /* Inlined CFG state: 153. */
                                                        {
                                                            /* Sequential CFG blocks: 153, 155. */
                                                            {
                                                            }
                                                            {
                                                                statePc = 163;
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_147) {
                        statePc = ((Object) stateCaught_147 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_147);
                        }
                        caughtException = stateCaught_147;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        this.field_C[var5].field_nb = null;
                        this.field_C[var5].field_b = null;
                        if (var12 == 0) {
                            statePc = 163;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 159. */
                            {
                                statePc = 161;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_158) {
                        statePc = ((Object) stateCaught_158 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_158);
                        }
                        caughtException = stateCaught_158;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        this.field_C[var5] = null;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        statePc = ((Object) stateCaught_161 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_161);
                        }
                        caughtException = stateCaught_161;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (this.field_C[var5] == null) {
                            statePc = 179;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 164. */
                            {
                                if (null != this.field_C[var5].field_Z) {
                                    /* Inlined CFG state: 169. */
                                    {
                                        if (this.field_C[var5].field_P > 0) {
                                            statePc = 179;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 170. */
                                            {
                                                if (this.field_C[var5].field_P + this.field_C[var5].field_T <= 0) {
                                                    statePc = 176;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 171. */
                                                    {
                                                        /* Sequential CFG blocks: 171, 173. */
                                                        {
                                                        }
                                                        {
                                                            this.field_e.field_f = this.field_e.field_f + 1;
                                                            if (var12 == 0) {
                                                                statePc = 178;
                                                            } else {
                                                                statePc = 174;
                                                            }
                                                            continue stateLoop;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 165. */
                                    {
                                        /* Sequential CFG blocks: 165, 167. */
                                        {
                                        }
                                        {
                                            statePc = 179;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_163) {
                        statePc = ((Object) stateCaught_163 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_163);
                        }
                        caughtException = stateCaught_163;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        statePc = ((Object) stateCaught_174 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_174);
                        }
                        caughtException = stateCaught_174;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        this.field_e.field_k = this.field_e.field_k + 1;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        statePc = ((Object) stateCaught_176 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_176);
                        }
                        caughtException = stateCaught_176;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        this.field_C[var5] = null;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        statePc = ((Object) stateCaught_178 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_178);
                        }
                        caughtException = stateCaught_178;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 147;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        statePc = ((Object) stateCaught_179 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_179);
                        }
                        caughtException = stateCaught_179;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (!this.field_r) {
                            statePc = 232;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 181. */
                            {
                                var5 = 0;
                                statePc = 182;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_180) {
                        statePc = ((Object) stateCaught_180 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_180);
                        }
                        caughtException = stateCaught_180;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        if (~var5 <= ~this.field_C.length) {
                            statePc = 232;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 183. */
                            {
                                if (var12 != 0) {
                                    statePc = 233;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 184. */
                                    {
                                        if (null == this.field_C[var5]) {
                                            statePc = 220;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 185. */
                                            {
                                                /* Sequential CFG blocks: 185, 187. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var5].field_c.field_d) {
                                                        /* Inlined CFG state: 192. */
                                                        {
                                                            if (this.field_C[var5].field_Z != null) {
                                                                statePc = 211;
                                                            } else {
                                                                statePc = 193;
                                                            }
                                                            continue stateLoop;
                                                        }
                                                    } else {
                                                        /* Inlined CFG state: 188. */
                                                        {
                                                            /* Sequential CFG blocks: 188, 190. */
                                                            {
                                                            }
                                                            {
                                                                statePc = 220;
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_182) {
                        statePc = ((Object) stateCaught_182 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_182);
                        }
                        caughtException = stateCaught_182;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (this.field_C[var5].field_P <= 0) {
                            /* Inlined CFG state: 198. */
                            {
                                if (this.field_C[var5].field_t != 4) {
                                    /* Inlined CFG state: 201. */
                                    {
                                        if (this.field_C[var5].field_t == 9) {
                                            statePc = 205;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 202. */
                                            {
                                                this.field_e.field_j = this.field_e.field_j + 1;
                                                if (var12 == 0) {
                                                    statePc = 207;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 203. */
                                                    {
                                                        statePc = 205;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 199. */
                                    {
                                        statePc = 207;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 194. */
                            {
                                /* Sequential CFG blocks: 194, 196. */
                                {
                                }
                                {
                                    statePc = 219;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_193) {
                        statePc = ((Object) stateCaught_193 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_193);
                        }
                        caughtException = stateCaught_193;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        this.field_e.field_m = this.field_e.field_m + 1;
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        statePc = ((Object) stateCaught_205 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_205);
                        }
                        caughtException = stateCaught_205;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        if (this.field_C[var5].field_t == 4) {
                            /* Inlined CFG state: 210. */
                            {
                                this.field_e.field_b = this.field_e.field_b + 1;
                                if (var12 == 0) {
                                    statePc = 219;
                                } else {
                                    statePc = 211;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 208. */
                            {
                                statePc = 219;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_207) {
                        statePc = ((Object) stateCaught_207 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_207);
                        }
                        caughtException = stateCaught_207;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        if (this.field_C[var5].field_T + this.field_C[var5].field_P > 0) {
                            statePc = 217;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 212. */
                            {
                                /* Sequential CFG blocks: 212, 214. */
                                {
                                }
                                {
                                    this.field_e.field_k = this.field_e.field_k + 1;
                                    if (var12 == 0) {
                                        statePc = 219;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 215. */
                                        {
                                            statePc = 217;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_211) {
                        statePc = ((Object) stateCaught_211 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_211);
                        }
                        caughtException = stateCaught_211;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        this.field_e.field_h = this.field_e.field_h + 1;
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        statePc = ((Object) stateCaught_217 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_217);
                        }
                        caughtException = stateCaught_217;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        this.field_C[var5] = null;
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        statePc = ((Object) stateCaught_219 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_219);
                        }
                        caughtException = stateCaught_219;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        stackIn_221_0 = this.field_C[var5];
                        statePc = 221;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        statePc = ((Object) stateCaught_220 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_220);
                        }
                        caughtException = stateCaught_220;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        if (stackIn_221_0 == null) {
                            statePc = 231;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 222. */
                            {
                                if (this.field_C[var5].field_Z != null) {
                                    statePc = 231;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 223. */
                                    {
                                        /* Sequential CFG blocks: 223, 225. */
                                        {
                                        }
                                        {
                                            if (this.field_C[var5].field_P > 0) {
                                                /* Inlined CFG state: 230. */
                                                {
                                                    this.field_C[var5] = null;
                                                    statePc = 231;
                                                    continue stateLoop;
                                                }
                                            } else {
                                                /* Inlined CFG state: 226. */
                                                {
                                                    /* Sequential CFG blocks: 226, 228. */
                                                    {
                                                    }
                                                    {
                                                        statePc = 231;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_221) {
                        statePc = ((Object) stateCaught_221 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_221);
                        }
                        caughtException = stateCaught_221;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 182;
                        } else {
                            statePc = 232;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        statePc = ((Object) stateCaught_231 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_231);
                        }
                        caughtException = stateCaught_231;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        this.a(41, param1);
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        statePc = ((Object) stateCaught_232 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_232);
                        }
                        caughtException = stateCaught_232;
                        continue stateLoop;
                    }
                }
                case 233: {
                    return;
                }
                case 234: {
                    try {
                        if (null == var4) {
                            statePc = 567;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 235. */
                            {
                                stackOut_235_0 = this.field_b;
                                stackIn_568_0 = stackOut_235_0 ? 1 : 0;
                                stackIn_236_0 = stackOut_235_0;
                                if (var12 != 0) {
                                    statePc = 568;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 236. */
                                    {
                                        if (stackIn_236_0) {
                                            /* Inlined CFG state: 240. */
                                            {
                                                var4.field_h = true;
                                                statePc = 241;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 237. */
                                            {
                                                /* Sequential CFG blocks: 237, 239. */
                                                {
                                                }
                                                {
                                                    statePc = 241;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_234) {
                        statePc = ((Object) stateCaught_234 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_234);
                        }
                        caughtException = stateCaught_234;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        if (param1.field_Bb > 0) {
                            statePc = 245;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 242. */
                            {
                                if (var4.field_a != 1) {
                                    statePc = 536;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 243. */
                                    {
                                        statePc = 245;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_241) {
                        statePc = ((Object) stateCaught_241 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_241);
                        }
                        caughtException = stateCaught_241;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        if (var4.field_h) {
                            statePc = 536;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 246. */
                            {
                                /* Sequential CFG blocks: 246, 248. */
                                {
                                }
                                {
                                    if (var4.field_a != 0) {
                                        statePc = 267;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 249. */
                                        {
                                            /* Sequential CFG blocks: 249, 251. */
                                            {
                                            }
                                            {
                                                var5 = 0;
                                                statePc = 252;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_245) {
                        statePc = ((Object) stateCaught_245 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_245);
                        }
                        caughtException = stateCaught_245;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        if (var5 >= 12) {
                            statePc = 267;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 253. */
                            {
                                stackIn_494_0 = null;
                                stackIn_254_0 = stackIn_494_0;
                                stackIn_494_1 = this.field_C[var5];
                                stackIn_254_1 = stackIn_494_1;
                                if (var12 != 0) {
                                    statePc = 494;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 254. */
                                    {
                                        /* Sequential CFG blocks: 254, 256. */
                                        {
                                            stackIn_256_0 = stackIn_254_0;
                                            stackIn_256_1 = stackIn_254_1;
                                        }
                                        {
                                            if (stackIn_256_0 == stackIn_256_1) {
                                                statePc = 266;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 257. */
                                                {
                                                    /* Sequential CFG blocks: 257, 259. */
                                                    {
                                                    }
                                                    {
                                                        if (null == this.field_C[var5].field_Z) {
                                                            statePc = 266;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 260. */
                                                            {
                                                                stackIn_262_0 = this.field_C[var5];
                                                                statePc = 262;
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_252) {
                        statePc = ((Object) stateCaught_252 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_252);
                        }
                        caughtException = stateCaught_252;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        if (stackIn_262_0.field_c.field_C.field_v != -1) {
                            /* Inlined CFG state: 265. */
                            {
                                this.a(29518, 0);
                                var5 = 12;
                                this.a(1, pl.field_G, -84);
                                if (var12 == 0) {
                                    statePc = 267;
                                } else {
                                    statePc = 266;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 263. */
                            {
                                statePc = 266;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_262) {
                        statePc = ((Object) stateCaught_262 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_262);
                        }
                        caughtException = stateCaught_262;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 252;
                        } else {
                            statePc = 267;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        statePc = ((Object) stateCaught_266 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_266);
                        }
                        caughtException = stateCaught_266;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        if (var4.field_a == 1) {
                            /* Inlined CFG state: 269. */
                            {
                                var3_int = 1;
                                var5 = 0;
                                statePc = 270;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 268. */
                            {
                                statePc = 286;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_267) {
                        statePc = ((Object) stateCaught_267 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_267);
                        }
                        caughtException = stateCaught_267;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        if (~var5 <= ~this.field_C.length) {
                            statePc = 282;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 271. */
                            {
                                stackIn_272_0 = this.field_C[var5];
                                statePc = 272;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_270) {
                        statePc = ((Object) stateCaught_270 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_270);
                        }
                        caughtException = stateCaught_270;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        stackIn_262_0 = stackIn_272_0;
                        stackIn_273_0 = stackIn_262_0;
                        if (var12 != 0) {
                            statePc = 262;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 273. */
                            {
                                if (stackIn_273_0 == null) {
                                    statePc = 281;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 274. */
                                    {
                                        if (this.field_C[var5].field_P <= 0) {
                                            statePc = 281;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 275. */
                                            {
                                                /* Sequential CFG blocks: 275, 277. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var5].field_C != 1) {
                                                        statePc = 281;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 278. */
                                                        {
                                                            /* Sequential CFG blocks: 278, 280. */
                                                            {
                                                            }
                                                            {
                                                                var3_int = 0;
                                                                statePc = 281;
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_272) {
                        statePc = ((Object) stateCaught_272 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_272);
                        }
                        caughtException = stateCaught_272;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 270;
                        } else {
                            statePc = 282;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_281) {
                        statePc = ((Object) stateCaught_281 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_281);
                        }
                        caughtException = stateCaught_281;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        if (var3_int != 0) {
                            /* Inlined CFG state: 285. */
                            {
                                this.a(29518, 1);
                                this.field_b = true;
                                statePc = 286;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 283. */
                            {
                                statePc = 286;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_282) {
                        statePc = ((Object) stateCaught_282 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_282);
                        }
                        caughtException = stateCaught_282;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        if (var4.field_a == 2) {
                            /* Inlined CFG state: 289. */
                            {
                                var3_int = 1;
                                var5 = 0;
                                statePc = 290;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 287. */
                            {
                                statePc = 307;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_286) {
                        statePc = ((Object) stateCaught_286 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_286);
                        }
                        caughtException = stateCaught_286;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        if (var5 >= 12) {
                            statePc = 303;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 291. */
                            {
                                stackIn_272_0 = this.field_C[var5];
                                stackIn_292_0 = stackIn_272_0;
                                if (var12 != 0) {
                                    statePc = 272;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 292. */
                                    {
                                        if (stackIn_292_0 == null) {
                                            statePc = 302;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 293. */
                                            {
                                                if (this.field_C[var5].field_P <= 0) {
                                                    statePc = 302;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 294. */
                                                    {
                                                        /* Sequential CFG blocks: 294, 296. */
                                                        {
                                                        }
                                                        {
                                                            if (this.field_C[var5].field_Z != null) {
                                                                statePc = 301;
                                                            } else {
                                                                statePc = 297;
                                                            }
                                                            continue stateLoop;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_290) {
                        statePc = ((Object) stateCaught_290 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_290);
                        }
                        caughtException = stateCaught_290;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        /* Sequential CFG blocks: 297, 299. */
                        {
                        }
                        {
                            statePc = 302;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_297) {
                        statePc = ((Object) stateCaught_297 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_297);
                        }
                        caughtException = stateCaught_297;
                        continue stateLoop;
                    }
                }
                case 301: {
                    try {
                        var3_int = 0;
                        statePc = 302;
                        continue stateLoop;
                    } catch (Throwable stateCaught_301) {
                        statePc = ((Object) stateCaught_301 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_301);
                        }
                        caughtException = stateCaught_301;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 290;
                        } else {
                            statePc = 303;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_302) {
                        statePc = ((Object) stateCaught_302 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_302);
                        }
                        caughtException = stateCaught_302;
                        continue stateLoop;
                    }
                }
                case 303: {
                    try {
                        if (var3_int != 0) {
                            /* Inlined CFG state: 306. */
                            {
                                this.a(29518, 2);
                                this.a(-1, rf.field_s, -8);
                                this.field_b = true;
                                statePc = 307;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 304. */
                            {
                                statePc = 307;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_303) {
                        statePc = ((Object) stateCaught_303 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_303);
                        }
                        caughtException = stateCaught_303;
                        continue stateLoop;
                    }
                }
                case 307: {
                    try {
                        if (var4.field_a == 3) {
                            /* Inlined CFG state: 310. */
                            {
                                var5 = 0;
                                statePc = 311;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 308. */
                            {
                                statePc = 328;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_307) {
                        statePc = ((Object) stateCaught_307 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_307);
                        }
                        caughtException = stateCaught_307;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        if (var5 >= this.field_C.length) {
                            statePc = 328;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 312. */
                            {
                                stackIn_332_0 = null;
                                stackIn_313_0 = stackIn_332_0;
                                stackIn_332_1 = this.field_C[var5];
                                stackIn_313_1 = stackIn_332_1;
                                if (var12 != 0) {
                                    statePc = 332;
                                } else {
                                    statePc = 313;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_311) {
                        statePc = ((Object) stateCaught_311 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_311);
                        }
                        caughtException = stateCaught_311;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        if (stackIn_313_0 == stackIn_313_1) {
                            statePc = 327;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 314. */
                            {
                                /* Sequential CFG blocks: 314, 316. */
                                {
                                }
                                {
                                    if (6 != this.field_C[var5].field_t) {
                                        statePc = 327;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 317. */
                                        {
                                            /* Sequential CFG blocks: 317, 319. */
                                            {
                                            }
                                            {
                                                if (this.field_C[var5].field_k) {
                                                    statePc = 325;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 320. */
                                                    {
                                                        /* Sequential CFG blocks: 320, 322. */
                                                        {
                                                        }
                                                        {
                                                            if (this.field_C[var5].field_P > 0) {
                                                                statePc = 327;
                                                                continue stateLoop;
                                                            } else {
                                                                /* Inlined CFG state: 323. */
                                                                {
                                                                    statePc = 325;
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_313) {
                        statePc = ((Object) stateCaught_313 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_313);
                        }
                        caughtException = stateCaught_313;
                        continue stateLoop;
                    }
                }
                case 325: {
                    try {
                        this.a(param0 ^ -29519, 3);
                        this.a(9, ki.field_Z, -7);
                        statePc = 327;
                        continue stateLoop;
                    } catch (Throwable stateCaught_325) {
                        statePc = ((Object) stateCaught_325 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_325);
                        }
                        caughtException = stateCaught_325;
                        continue stateLoop;
                    }
                }
                case 327: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 311;
                        } else {
                            statePc = 328;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_327) {
                        statePc = ((Object) stateCaught_327 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_327);
                        }
                        caughtException = stateCaught_327;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        if (var4.field_a != 9) {
                            statePc = 344;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 329. */
                            {
                                var5 = 0;
                                statePc = 330;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_328) {
                        statePc = ((Object) stateCaught_328 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_328);
                        }
                        caughtException = stateCaught_328;
                        continue stateLoop;
                    }
                }
                case 330: {
                    try {
                        if (this.field_C.length <= var5) {
                            statePc = 344;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 331. */
                            {
                                stackIn_332_0 = null;
                                stackIn_332_1 = this.field_C[var5];
                                statePc = 332;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_330) {
                        statePc = ((Object) stateCaught_330 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_330);
                        }
                        caughtException = stateCaught_330;
                        continue stateLoop;
                    }
                }
                case 332: {
                    try {
                        stackIn_313_0 = stackIn_332_0;
                        stackIn_333_0 = stackIn_313_0;
                        stackIn_313_1 = stackIn_332_1;
                        stackIn_333_1 = stackIn_313_1;
                        if (var12 != 0) {
                            statePc = 313;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 333. */
                            {
                                if (stackIn_333_0 == stackIn_333_1) {
                                    statePc = 343;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 334. */
                                    {
                                        if (!this.field_C[var5].field_s) {
                                            statePc = 343;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 335. */
                                            {
                                                /* Sequential CFG blocks: 335, 337. */
                                                {
                                                }
                                                {
                                                    if (null != this.field_C[var5].field_Z) {
                                                        /* Inlined CFG state: 342. */
                                                        {
                                                            this.a(29518, 9);
                                                            this.a(4, ch.field_h, -110);
                                                            statePc = 343;
                                                            continue stateLoop;
                                                        }
                                                    } else {
                                                        /* Inlined CFG state: 338. */
                                                        {
                                                            /* Sequential CFG blocks: 338, 340. */
                                                            {
                                                            }
                                                            {
                                                                statePc = 343;
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_332) {
                        statePc = ((Object) stateCaught_332 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_332);
                        }
                        caughtException = stateCaught_332;
                        continue stateLoop;
                    }
                }
                case 343: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 330;
                        } else {
                            statePc = 344;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_343) {
                        statePc = ((Object) stateCaught_343 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_343);
                        }
                        caughtException = stateCaught_343;
                        continue stateLoop;
                    }
                }
                case 344: {
                    try {
                        if (var4.field_a == 4) {
                            /* Inlined CFG state: 346. */
                            {
                                var3_int = 1;
                                var5 = 0;
                                var6 = 0;
                                statePc = 347;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 345. */
                            {
                                statePc = 386;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_344) {
                        statePc = ((Object) stateCaught_344 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_344);
                        }
                        caughtException = stateCaught_344;
                        continue stateLoop;
                    }
                }
                case 347: {
                    try {
                        if (var6 >= 12) {
                            statePc = 379;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 348. */
                            {
                                stackIn_686_0 = this.field_C[var6];
                                stackIn_349_0 = stackIn_686_0;
                                if (var12 != 0) {
                                    statePc = 686;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 349. */
                                    {
                                        if (stackIn_349_0 == null) {
                                            statePc = 365;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 350. */
                                            {
                                                /* Sequential CFG blocks: 350, 352. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var6].field_P <= 0) {
                                                        statePc = 365;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 353. */
                                                        {
                                                            /* Sequential CFG blocks: 353, 355. */
                                                            {
                                                            }
                                                            {
                                                                if (!this.field_C[var6].field_s) {
                                                                    statePc = 365;
                                                                } else {
                                                                    statePc = 356;
                                                                }
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_347) {
                        statePc = ((Object) stateCaught_347 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_347);
                        }
                        caughtException = stateCaught_347;
                        continue stateLoop;
                    }
                }
                case 356: {
                    try {
                        /* Sequential CFG blocks: 356, 358. */
                        {
                        }
                        {
                            if (this.field_C[var6].field_Z == null) {
                                statePc = 365;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 359. */
                                {
                                    /* Sequential CFG blocks: 359, 361. */
                                    {
                                    }
                                    {
                                        if (this.field_C[var6].field_c.field_d) {
                                            statePc = 365;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 362. */
                                            {
                                                /* Sequential CFG blocks: 362, 364. */
                                                {
                                                }
                                                {
                                                    var5 = 1;
                                                    statePc = 365;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_356) {
                        statePc = ((Object) stateCaught_356 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_356);
                        }
                        caughtException = stateCaught_356;
                        continue stateLoop;
                    }
                }
                case 365: {
                    try {
                        if (null == this.field_C[var6]) {
                            statePc = 378;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 366. */
                            {
                                if (this.field_C[var6].field_P <= 0) {
                                    statePc = 378;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 367. */
                                    {
                                        /* Sequential CFG blocks: 367, 369. */
                                        {
                                        }
                                        {
                                            if (null == this.field_C[var6].field_Z) {
                                                statePc = 378;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 370. */
                                                {
                                                    /* Sequential CFG blocks: 370, 372. */
                                                    {
                                                    }
                                                    {
                                                        if (this.field_C[var6].field_c.field_d) {
                                                            /* Inlined CFG state: 377. */
                                                            {
                                                                var3_int = 0;
                                                                statePc = 378;
                                                                continue stateLoop;
                                                            }
                                                        } else {
                                                            /* Inlined CFG state: 373. */
                                                            {
                                                                /* Sequential CFG blocks: 373, 375. */
                                                                {
                                                                }
                                                                {
                                                                    statePc = 378;
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_365) {
                        statePc = ((Object) stateCaught_365 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_365);
                        }
                        caughtException = stateCaught_365;
                        continue stateLoop;
                    }
                }
                case 378: {
                    try {
                        var6++;
                        if (var12 == 0) {
                            statePc = 347;
                        } else {
                            statePc = 379;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_378) {
                        statePc = ((Object) stateCaught_378 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_378);
                        }
                        caughtException = stateCaught_378;
                        continue stateLoop;
                    }
                }
                case 379: {
                    try {
                        this.field_h.field_m = 1;
                        if (var3_int == 0) {
                            statePc = 386;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 380. */
                            {
                                if (var5 != 0) {
                                    /* Inlined CFG state: 385. */
                                    {
                                        this.a(29518, 4);
                                        this.field_b = true;
                                        this.field_v = true;
                                        statePc = 386;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 381. */
                                    {
                                        /* Sequential CFG blocks: 381, 383. */
                                        {
                                        }
                                        {
                                            statePc = 386;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_379) {
                        statePc = ((Object) stateCaught_379 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_379);
                        }
                        caughtException = stateCaught_379;
                        continue stateLoop;
                    }
                }
                case 386: {
                    try {
                        if (var4.field_a != 5) {
                            statePc = 433;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 387. */
                            {
                                var3_int = 1;
                                var5 = 0;
                                var6 = 0;
                                statePc = 388;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_386) {
                        statePc = ((Object) stateCaught_386 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_386);
                        }
                        caughtException = stateCaught_386;
                        continue stateLoop;
                    }
                }
                case 388: {
                    try {
                        if (var6 >= 12) {
                            statePc = 426;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 389. */
                            {
                                stackIn_686_0 = this.field_C[var6];
                                stackIn_390_0 = stackIn_686_0;
                                if (var12 != 0) {
                                    statePc = 686;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 390. */
                                    {
                                        if (stackIn_390_0 == null) {
                                            statePc = 408;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 391. */
                                            {
                                                /* Sequential CFG blocks: 391, 393. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var6].field_P <= 0) {
                                                        statePc = 408;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 394. */
                                                        {
                                                            /* Sequential CFG blocks: 394, 396. */
                                                            {
                                                            }
                                                            {
                                                                if (null == this.field_C[var6].field_Z) {
                                                                    statePc = 408;
                                                                } else {
                                                                    statePc = 397;
                                                                }
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_388) {
                        statePc = ((Object) stateCaught_388 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_388);
                        }
                        caughtException = stateCaught_388;
                        continue stateLoop;
                    }
                }
                case 397: {
                    try {
                        /* Sequential CFG blocks: 397, 399. */
                        {
                        }
                        {
                            if (Math.abs(-(this.field_h.field_b / 2) + this.field_C[var6].field_F) >= this.field_h.field_b / 2 - 5) {
                                statePc = 408;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 400. */
                                {
                                    /* Sequential CFG blocks: 400, 402. */
                                    {
                                    }
                                    {
                                        if (~Math.abs(-(this.field_h.field_e / 2) + this.field_C[var6].field_H) > ~(this.field_h.field_e / 2 - 5)) {
                                            /* Inlined CFG state: 407. */
                                            {
                                                var3_int = 0;
                                                statePc = 408;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 403. */
                                            {
                                                /* Sequential CFG blocks: 403, 405. */
                                                {
                                                }
                                                {
                                                    statePc = 408;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_397) {
                        statePc = ((Object) stateCaught_397 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_397);
                        }
                        caughtException = stateCaught_397;
                        continue stateLoop;
                    }
                }
                case 408: {
                    try {
                        if (this.field_C[var6] == null) {
                            statePc = 425;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 409. */
                            {
                                if (this.field_C[var6].field_P <= 0) {
                                    statePc = 425;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 410. */
                                    {
                                        /* Sequential CFG blocks: 410, 412. */
                                        {
                                        }
                                        {
                                            if (!this.field_C[var6].field_s) {
                                                statePc = 425;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 413. */
                                                {
                                                    /* Sequential CFG blocks: 413, 415. */
                                                    {
                                                    }
                                                    {
                                                        if (this.field_C[var6].field_Z == null) {
                                                            statePc = 425;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 416. */
                                                            {
                                                                /* Sequential CFG blocks: 416, 418. */
                                                                {
                                                                }
                                                                {
                                                                    if (Math.abs(this.field_C[var6].field_F - this.field_h.field_b / 2) >= -5 + this.field_h.field_b / 2) {
                                                                        statePc = 424;
                                                                    } else {
                                                                        statePc = 419;
                                                                    }
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_408) {
                        statePc = ((Object) stateCaught_408 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_408);
                        }
                        caughtException = stateCaught_408;
                        continue stateLoop;
                    }
                }
                case 419: {
                    try {
                        /* Sequential CFG blocks: 419, 421. */
                        {
                        }
                        {
                            if (Math.abs(-(this.field_h.field_e / 2) + this.field_C[var6].field_H) < -5 + this.field_h.field_e / 2) {
                                statePc = 425;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 422. */
                                {
                                    statePc = 424;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_419) {
                        statePc = ((Object) stateCaught_419 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_419);
                        }
                        caughtException = stateCaught_419;
                        continue stateLoop;
                    }
                }
                case 424: {
                    try {
                        var5 = 1;
                        statePc = 425;
                        continue stateLoop;
                    } catch (Throwable stateCaught_424) {
                        statePc = ((Object) stateCaught_424 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_424);
                        }
                        caughtException = stateCaught_424;
                        continue stateLoop;
                    }
                }
                case 425: {
                    try {
                        var6++;
                        if (var12 == 0) {
                            statePc = 388;
                        } else {
                            statePc = 426;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_425) {
                        statePc = ((Object) stateCaught_425 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_425);
                        }
                        caughtException = stateCaught_425;
                        continue stateLoop;
                    }
                }
                case 426: {
                    try {
                        this.field_h.field_m = 2;
                        if (var3_int == 0) {
                            statePc = 433;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 427. */
                            {
                                if (var5 != 0) {
                                    /* Inlined CFG state: 432. */
                                    {
                                        this.a(29518, 5);
                                        this.field_v = true;
                                        this.field_b = true;
                                        statePc = 433;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 428. */
                                    {
                                        /* Sequential CFG blocks: 428, 430. */
                                        {
                                        }
                                        {
                                            statePc = 433;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_426) {
                        statePc = ((Object) stateCaught_426 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_426);
                        }
                        caughtException = stateCaught_426;
                        continue stateLoop;
                    }
                }
                case 433: {
                    try {
                        if (6 == var4.field_a) {
                            /* Inlined CFG state: 436. */
                            {
                                var3_int = 1;
                                var5 = 0;
                                var6 = 0;
                                statePc = 437;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 434. */
                            {
                                statePc = 488;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_433) {
                        statePc = ((Object) stateCaught_433 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_433);
                        }
                        caughtException = stateCaught_433;
                        continue stateLoop;
                    }
                }
                case 437: {
                    try {
                        if (12 <= var6) {
                            statePc = 481;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 438. */
                            {
                                stackIn_576_0 = null;
                                stackIn_439_0 = stackIn_576_0;
                                stackIn_576_1 = this.field_C[var6];
                                stackIn_439_1 = stackIn_576_1;
                                if (var12 != 0) {
                                    statePc = 576;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 439. */
                                    {
                                        if (stackIn_439_0 == stackIn_439_1) {
                                            statePc = 463;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 440. */
                                            {
                                                /* Sequential CFG blocks: 440, 442. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var6].field_P <= 0) {
                                                        statePc = 463;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 443. */
                                                        {
                                                            /* Sequential CFG blocks: 443, 445. */
                                                            {
                                                            }
                                                            {
                                                                if (this.field_C[var6].field_Z == null) {
                                                                    statePc = 463;
                                                                } else {
                                                                    statePc = 446;
                                                                }
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_437) {
                        statePc = ((Object) stateCaught_437 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_437);
                        }
                        caughtException = stateCaught_437;
                        continue stateLoop;
                    }
                }
                case 446: {
                    try {
                        /* Sequential CFG blocks: 446, 448. */
                        {
                        }
                        {
                            if (1 != this.field_C[var6].field_E) {
                                statePc = 463;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 449. */
                                {
                                    /* Sequential CFG blocks: 449, 451. */
                                    {
                                    }
                                    {
                                        if (this.field_C[var6].field_F > 12) {
                                            statePc = 463;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 452. */
                                            {
                                                /* Sequential CFG blocks: 452, 454. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var6].field_H > 12) {
                                                        statePc = 463;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 455. */
                                                        {
                                                            /* Sequential CFG blocks: 455, 457. */
                                                            {
                                                            }
                                                            {
                                                                if (this.field_C[var6].field_s) {
                                                                    /* Inlined CFG state: 462. */
                                                                    {
                                                                        var5 = 1;
                                                                        statePc = 463;
                                                                        continue stateLoop;
                                                                    }
                                                                } else {
                                                                    /* Inlined CFG state: 458. */
                                                                    {
                                                                        /* Sequential CFG blocks: 458, 460. */
                                                                        {
                                                                        }
                                                                        {
                                                                            statePc = 463;
                                                                            continue stateLoop;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_446) {
                        statePc = ((Object) stateCaught_446 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_446);
                        }
                        caughtException = stateCaught_446;
                        continue stateLoop;
                    }
                }
                case 463: {
                    try {
                        if (this.field_C[var6] == null) {
                            statePc = 480;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 464. */
                            {
                                if (this.field_C[var6].field_P <= 0) {
                                    statePc = 480;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 465. */
                                    {
                                        /* Sequential CFG blocks: 465, 467. */
                                        {
                                        }
                                        {
                                            if (null == this.field_C[var6].field_Z) {
                                                statePc = 480;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 468. */
                                                {
                                                    /* Sequential CFG blocks: 468, 470. */
                                                    {
                                                    }
                                                    {
                                                        if (this.field_C[var6].field_E != 1) {
                                                            statePc = 479;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 471. */
                                                            {
                                                                /* Sequential CFG blocks: 471, 473. */
                                                                {
                                                                }
                                                                {
                                                                    if (this.field_C[var6].field_F > 12) {
                                                                        statePc = 479;
                                                                    } else {
                                                                        statePc = 474;
                                                                    }
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_463) {
                        statePc = ((Object) stateCaught_463 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_463);
                        }
                        caughtException = stateCaught_463;
                        continue stateLoop;
                    }
                }
                case 474: {
                    try {
                        /* Sequential CFG blocks: 474, 476. */
                        {
                        }
                        {
                            if (this.field_C[var6].field_H <= 12) {
                                statePc = 480;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 477. */
                                {
                                    statePc = 479;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_474) {
                        statePc = ((Object) stateCaught_474 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_474);
                        }
                        caughtException = stateCaught_474;
                        continue stateLoop;
                    }
                }
                case 479: {
                    try {
                        var3_int = 0;
                        statePc = 480;
                        continue stateLoop;
                    } catch (Throwable stateCaught_479) {
                        statePc = ((Object) stateCaught_479 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_479);
                        }
                        caughtException = stateCaught_479;
                        continue stateLoop;
                    }
                }
                case 480: {
                    try {
                        var6++;
                        if (var12 == 0) {
                            statePc = 437;
                        } else {
                            statePc = 481;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_480) {
                        statePc = ((Object) stateCaught_480 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_480);
                        }
                        caughtException = stateCaught_480;
                        continue stateLoop;
                    }
                }
                case 481: {
                    try {
                        this.field_h.field_m = 3;
                        if (var3_int == 0) {
                            statePc = 488;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 482. */
                            {
                                if (var5 != 0) {
                                    /* Inlined CFG state: 487. */
                                    {
                                        this.a(param0 ^ -29519, 6);
                                        this.field_v = true;
                                        this.field_b = true;
                                        statePc = 488;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 483. */
                                    {
                                        /* Sequential CFG blocks: 483, 485. */
                                        {
                                        }
                                        {
                                            statePc = 488;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_481) {
                        statePc = ((Object) stateCaught_481 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_481);
                        }
                        caughtException = stateCaught_481;
                        continue stateLoop;
                    }
                }
                case 488: {
                    try {
                        if (var4.field_a == 7) {
                            /* Inlined CFG state: 491. */
                            {
                                this.field_h.field_m = 4;
                                var5 = 0;
                                statePc = 492;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 489. */
                            {
                                statePc = 510;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_488) {
                        statePc = ((Object) stateCaught_488 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_488);
                        }
                        caughtException = stateCaught_488;
                        continue stateLoop;
                    }
                }
                case 492: {
                    try {
                        if (var5 >= 12) {
                            statePc = 510;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 493. */
                            {
                                stackIn_332_0 = null;
                                stackIn_494_0 = stackIn_332_0;
                                stackIn_332_1 = this.field_C[var5];
                                stackIn_494_1 = stackIn_332_1;
                                if (var12 != 0) {
                                    statePc = 332;
                                } else {
                                    statePc = 494;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_492) {
                        statePc = ((Object) stateCaught_492 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_492);
                        }
                        caughtException = stateCaught_492;
                        continue stateLoop;
                    }
                }
                case 494: {
                    try {
                        if (stackIn_494_0 == stackIn_494_1) {
                            statePc = 509;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 495. */
                            {
                                if (this.field_C[var5].field_P <= 0) {
                                    statePc = 509;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 496. */
                                    {
                                        /* Sequential CFG blocks: 496, 498. */
                                        {
                                        }
                                        {
                                            if (!this.field_C[var5].field_s) {
                                                statePc = 509;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 499. */
                                                {
                                                    /* Sequential CFG blocks: 499, 501. */
                                                    {
                                                    }
                                                    {
                                                        if (null == this.field_C[var5].field_Z) {
                                                            statePc = 509;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 502. */
                                                            {
                                                                /* Sequential CFG blocks: 502, 504. */
                                                                {
                                                                }
                                                                {
                                                                    if (this.field_C[var5].field_E != 2) {
                                                                        statePc = 509;
                                                                    } else {
                                                                        statePc = 505;
                                                                    }
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_494) {
                        statePc = ((Object) stateCaught_494 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_494);
                        }
                        caughtException = stateCaught_494;
                        continue stateLoop;
                    }
                }
                case 505: {
                    try {
                        /* Sequential CFG blocks: 505, 507. */
                        {
                        }
                        {
                            this.a(29518, 7);
                            dd.field_M = 8;
                            this.a(4, va.field_j, param0 - 13);
                            statePc = 509;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_505) {
                        statePc = ((Object) stateCaught_505 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_505);
                        }
                        caughtException = stateCaught_505;
                        continue stateLoop;
                    }
                }
                case 509: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 492;
                        } else {
                            statePc = 510;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_509) {
                        statePc = ((Object) stateCaught_509 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_509);
                        }
                        caughtException = stateCaught_509;
                        continue stateLoop;
                    }
                }
                case 510: {
                    try {
                        if (var4.field_a == 8) {
                            /* Inlined CFG state: 513. */
                            {
                                if (3 != this.field_z) {
                                    statePc = 519;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 514. */
                                    {
                                        if (var4.field_b == vk.field_a) {
                                            statePc = 519;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 515. */
                                            {
                                                /* Sequential CFG blocks: 515, 517. */
                                                {
                                                }
                                                {
                                                    var4.field_b = vk.field_a;
                                                    var4.field_d = 0;
                                                    statePc = 519;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 511. */
                            {
                                statePc = 536;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_510) {
                        statePc = ((Object) stateCaught_510 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_510);
                        }
                        caughtException = stateCaught_510;
                        continue stateLoop;
                    }
                }
                case 519: {
                    try {
                        if (2 != this.field_z) {
                            statePc = 526;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 520. */
                            {
                                if (fc.field_h != var4.field_b) {
                                    /* Inlined CFG state: 525. */
                                    {
                                        var4.field_b = fc.field_h;
                                        var4.field_d = 0;
                                        statePc = 526;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 521. */
                                    {
                                        /* Sequential CFG blocks: 521, 523. */
                                        {
                                        }
                                        {
                                            statePc = 526;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_519) {
                        statePc = ((Object) stateCaught_519 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_519);
                        }
                        caughtException = stateCaught_519;
                        continue stateLoop;
                    }
                }
                case 526: {
                    try {
                        if (this.field_z != 1) {
                            statePc = 532;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 527. */
                            {
                                if (var4.field_b == jm.field_a) {
                                    statePc = 532;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 528. */
                                    {
                                        /* Sequential CFG blocks: 528, 530. */
                                        {
                                        }
                                        {
                                            var4.field_d = 0;
                                            var4.field_b = jm.field_a;
                                            statePc = 532;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_526) {
                        statePc = ((Object) stateCaught_526 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_526);
                        }
                        caughtException = stateCaught_526;
                        continue stateLoop;
                    }
                }
                case 532: {
                    try {
                        if (this.field_z == 0) {
                            /* Inlined CFG state: 535. */
                            {
                                this.a(29518, 8);
                                this.a(-1, rf.field_s, -104);
                                this.field_b = true;
                                this.field_r = true;
                                statePc = 536;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 533. */
                            {
                                statePc = 536;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_532) {
                        statePc = ((Object) stateCaught_532 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_532);
                        }
                        caughtException = stateCaught_532;
                        continue stateLoop;
                    }
                }
                case 536: {
                    try {
                        if (null == var4.field_f) {
                            statePc = 545;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 537. */
                            {
                                if (!var4.field_f.field_h) {
                                    statePc = 545;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 538. */
                                    {
                                        /* Sequential CFG blocks: 538, 540. */
                                        {
                                        }
                                        {
                                            if (var4.field_f.field_d > 0) {
                                                statePc = 545;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 541. */
                                                {
                                                    /* Sequential CFG blocks: 541, 543. */
                                                    {
                                                    }
                                                    {
                                                        var4.field_f = var4.field_f.field_f;
                                                        statePc = 545;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_536) {
                        statePc = ((Object) stateCaught_536 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_536);
                        }
                        caughtException = stateCaught_536;
                        continue stateLoop;
                    }
                }
                case 545: {
                    try {
                        if (var4.field_h) {
                            statePc = 558;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 546. */
                            {
                                if (var4.field_d >= 250) {
                                    statePc = 552;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 547. */
                                    {
                                        /* Sequential CFG blocks: 547, 549. */
                                        {
                                        }
                                        {
                                            var4.field_d = var4.field_d + 1;
                                            if (var12 == 0) {
                                                statePc = 563;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 550. */
                                                {
                                                    statePc = 552;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_545) {
                        statePc = ((Object) stateCaught_545 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_545);
                        }
                        caughtException = stateCaught_545;
                        continue stateLoop;
                    }
                }
                case 552: {
                    try {
                        if (le.field_q == null) {
                            statePc = 563;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 553. */
                            {
                                /* Sequential CFG blocks: 553, 555. */
                                {
                                }
                                {
                                    var4.field_d = 0;
                                    if (var12 == 0) {
                                        statePc = 563;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 556. */
                                        {
                                            statePc = 558;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_552) {
                        statePc = ((Object) stateCaught_552 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_552);
                        }
                        caughtException = stateCaught_552;
                        continue stateLoop;
                    }
                }
                case 558: {
                    try {
                        if (var4.field_d <= 0) {
                            statePc = 563;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 559. */
                            {
                                /* Sequential CFG blocks: 559, 561. */
                                {
                                }
                                {
                                    var4.field_d = var4.field_d - 1;
                                    statePc = 563;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_558) {
                        statePc = ((Object) stateCaught_558 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_558);
                        }
                        caughtException = stateCaught_558;
                        continue stateLoop;
                    }
                }
                case 563: {
                    try {
                        if (null != var4) {
                            /* Inlined CFG state: 566. */
                            {
                                var4 = var4.field_f;
                                if (var12 == 0) {
                                    statePc = 234;
                                } else {
                                    statePc = 567;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 564. */
                            {
                                statePc = 234;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_563) {
                        statePc = ((Object) stateCaught_563 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_563);
                        }
                        caughtException = stateCaught_563;
                        continue stateLoop;
                    }
                }
                case 567: {
                    try {
                        stackIn_568_0 = ja.field_n;
                        statePc = 568;
                        continue stateLoop;
                    } catch (Throwable stateCaught_567) {
                        statePc = ((Object) stateCaught_567 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_567);
                        }
                        caughtException = stateCaught_567;
                        continue stateLoop;
                    }
                }
                case 568: {
                    try {
                        if (stackIn_568_0 <= 0) {
                            statePc = 571;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 569. */
                            {
                                ja.field_n = ja.field_n - 1;
                                statePc = 571;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_568) {
                        statePc = ((Object) stateCaught_568 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_568);
                        }
                        caughtException = stateCaught_568;
                        continue stateLoop;
                    }
                }
                case 571: {
                    try {
                        var6 = 0;
                        var5 = 0;
                        statePc = 572;
                        continue stateLoop;
                    } catch (Throwable stateCaught_571) {
                        statePc = ((Object) stateCaught_571 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_571);
                        }
                        caughtException = stateCaught_571;
                        continue stateLoop;
                    }
                }
                case 572: {
                    try {
                        if (~var5 <= ~this.field_C.length) {
                            statePc = 830;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 573. */
                            {
                                stackIn_831_0 = null;
                                stackIn_574_0 = stackIn_831_0;
                                stackIn_831_1 = this;
                                stackIn_574_1 = stackIn_831_1;
                                if (var12 != 0) {
                                    statePc = 831;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 574. */
                                    {
                                        stackIn_576_0 = stackIn_574_0;
                                        stackIn_576_1 = ((e) (this)).field_C[var5];
                                        statePc = 576;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_572) {
                        statePc = ((Object) stateCaught_572 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_572);
                        }
                        caughtException = stateCaught_572;
                        continue stateLoop;
                    }
                }
                case 576: {
                    try {
                        if (stackIn_576_0 == stackIn_576_1) {
                            statePc = 829;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 577. */
                            {
                                if (0 >= this.field_C[var5].field_cb) {
                                    statePc = 582;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 578. */
                                    {
                                        /* Sequential CFG blocks: 578, 580. */
                                        {
                                        }
                                        {
                                            dupTemp$2 = this.field_C[var5];
                                            dupTemp$2.field_cb = dupTemp$2.field_cb - 8;
                                            statePc = 582;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_576) {
                        statePc = ((Object) stateCaught_576 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_576);
                        }
                        caughtException = stateCaught_576;
                        continue stateLoop;
                    }
                }
                case 582: {
                    try {
                        if (this.field_C[var5].field_ib) {
                            statePc = 668;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 583. */
                            {
                                if (this.field_C[var5].field_Z != null) {
                                    statePc = 645;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 584. */
                                    {
                                        /* Sequential CFG blocks: 584, 586. */
                                        {
                                        }
                                        {
                                            if (this.field_C[var5].field_t == 7) {
                                                statePc = 668;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 587. */
                                                {
                                                    /* Sequential CFG blocks: 587, 589. */
                                                    {
                                                    }
                                                    {
                                                        if (!this.field_J) {
                                                            statePc = 618;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 590. */
                                                            {
                                                                /* Sequential CFG blocks: 590, 592. */
                                                                {
                                                                }
                                                                {
                                                                    if (this.field_C[var5].field_k) {
                                                                        statePc = 597;
                                                                    } else {
                                                                        statePc = 593;
                                                                    }
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_582) {
                        statePc = ((Object) stateCaught_582 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_582);
                        }
                        caughtException = stateCaught_582;
                        continue stateLoop;
                    }
                }
                case 593: {
                    try {
                        /* Sequential CFG blocks: 593, 595. */
                        {
                        }
                        {
                            stackIn_598_0 = 1;
                            statePc = 598;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_593) {
                        statePc = ((Object) stateCaught_593 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_593);
                        }
                        caughtException = stateCaught_593;
                        continue stateLoop;
                    }
                }
                case 597: {
                    try {
                        stackIn_598_0 = 0;
                        statePc = 598;
                        continue stateLoop;
                    } catch (Throwable stateCaught_597) {
                        statePc = ((Object) stateCaught_597 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_597);
                        }
                        caughtException = stateCaught_597;
                        continue stateLoop;
                    }
                }
                case 598: {
                    try {
                        if (stackIn_598_0 == 1) {
                            statePc = 618;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 599. */
                            {
                                if (this.field_q == null) {
                                    statePc = 618;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 600. */
                                    {
                                        /* Sequential CFG blocks: 600, 602. */
                                        {
                                        }
                                        {
                                            if (this.field_q.field_B == 1) {
                                                statePc = 612;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 603. */
                                                {
                                                    /* Sequential CFG blocks: 603, 605. */
                                                    {
                                                    }
                                                    {
                                                        if (this.field_q.field_S) {
                                                            /* Inlined CFG state: 610. */
                                                            {
                                                                stackIn_611_0 = 0;
                                                                statePc = 611;
                                                                continue stateLoop;
                                                            }
                                                        } else {
                                                            /* Inlined CFG state: 606. */
                                                            {
                                                                /* Sequential CFG blocks: 606, 608. */
                                                                {
                                                                }
                                                                {
                                                                    stackIn_611_0 = 1;
                                                                    statePc = 611;
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_598) {
                        statePc = ((Object) stateCaught_598 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_598);
                        }
                        caughtException = stateCaught_598;
                        continue stateLoop;
                    }
                }
                case 611: {
                    try {
                        if (stackIn_611_0 == 0) {
                            statePc = 618;
                        } else {
                            statePc = 612;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_611) {
                        statePc = ((Object) stateCaught_611 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_611);
                        }
                        caughtException = stateCaught_611;
                        continue stateLoop;
                    }
                }
                case 612: {
                    try {
                        if (this.field_C[var5].field_P <= 0) {
                            statePc = 618;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 613. */
                            {
                                /* Sequential CFG blocks: 613, 615. */
                                {
                                }
                                {
                                    if (this.field_h.a((byte) -93, this.field_q, this.field_C[var5])) {
                                        statePc = 621;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 616. */
                                        {
                                            statePc = 618;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_612) {
                        statePc = ((Object) stateCaught_612 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_612);
                        }
                        caughtException = stateCaught_612;
                        continue stateLoop;
                    }
                }
                case 618: {
                    try {
                        this.field_C[var5].field_p = 0;
                        if (var12 == 0) {
                            statePc = 668;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 619. */
                            {
                                statePc = 621;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_618) {
                        statePc = ((Object) stateCaught_618 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_618);
                        }
                        caughtException = stateCaught_618;
                        continue stateLoop;
                    }
                }
                case 621: {
                    try {
                        if (!this.field_J) {
                            statePc = 638;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 622. */
                            {
                                /* Sequential CFG blocks: 622, 624. */
                                {
                                }
                                {
                                    if (this.field_q == null) {
                                        statePc = 638;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 625. */
                                        {
                                            /* Sequential CFG blocks: 625, 627. */
                                            {
                                            }
                                            {
                                                if (this.field_q.field_d == 0) {
                                                    statePc = 633;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 628. */
                                                    {
                                                        /* Sequential CFG blocks: 628, 630. */
                                                        {
                                                        }
                                                        {
                                                            if (1 != this.field_q.field_d) {
                                                                statePc = 638;
                                                                continue stateLoop;
                                                            } else {
                                                                /* Inlined CFG state: 631. */
                                                                {
                                                                    statePc = 633;
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_621) {
                        statePc = ((Object) stateCaught_621 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_621);
                        }
                        caughtException = stateCaught_621;
                        continue stateLoop;
                    }
                }
                case 633: {
                    try {
                        if (this.field_q.field_B == 0) {
                            statePc = 638;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 634. */
                            {
                                /* Sequential CFG blocks: 634, 636. */
                                {
                                }
                                {
                                    this.field_q.field_X = this.field_q.field_F;
                                    this.field_q.field_n = this.field_q.field_H;
                                    this.field_q.field_r = null;
                                    statePc = 638;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_633) {
                        statePc = ((Object) stateCaught_633 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_633);
                        }
                        caughtException = stateCaught_633;
                        continue stateLoop;
                    }
                }
                case 638: {
                    try {
                        if (!this.field_C[var5].field_l) {
                            /* Inlined CFG state: 641. */
                            {
                                this.field_C[var5].field_l = true;
                                this.field_a = this.field_C[var5].field_F;
                                this.field_x = this.field_C[var5].field_H;
                                this.field_k = lg.field_c;
                                this.field_c = sj.field_b;
                                this.field_E = eg.field_p;
                                eg.field_p = this.field_C[var5].field_E;
                                this.field_K = ib.field_X;
                                if (this.field_C[var5].field_t < 1) {
                                    statePc = 644;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 642. */
                                    {
                                        this.field_K = p.field_d;
                                        statePc = 644;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 639. */
                            {
                                statePc = 644;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_638) {
                        statePc = ((Object) stateCaught_638 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_638);
                        }
                        caughtException = stateCaught_638;
                        continue stateLoop;
                    }
                }
                case 644: {
                    try {
                        this.field_C[var5].field_ib = true;
                        qd.$cfr$intArgs$a$e9dea5688aa5(26, 3);
                        if (var12 == 0) {
                            statePc = 668;
                        } else {
                            statePc = 645;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_644) {
                        statePc = ((Object) stateCaught_644 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_644);
                        }
                        caughtException = stateCaught_644;
                        continue stateLoop;
                    }
                }
                case 645: {
                    try {
                        if (0 < this.field_C[var5].field_P) {
                            statePc = 660;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 646. */
                            {
                                /* Sequential CFG blocks: 646, 648. */
                                {
                                }
                                {
                                    if (null != this.field_K) {
                                        statePc = 660;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 649. */
                                        {
                                            /* Sequential CFG blocks: 649, 651. */
                                            {
                                            }
                                            {
                                                param1.field_Y = false;
                                                dupTemp$3 = this.field_C[var5];
                                                dupTemp$3.field_p = dupTemp$3.field_p + 1;
                                                if (this.field_C[var5].field_p > 25) {
                                                    statePc = 656;
                                                } else {
                                                    statePc = 652;
                                                }
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_645) {
                        statePc = ((Object) stateCaught_645 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_645);
                        }
                        caughtException = stateCaught_645;
                        continue stateLoop;
                    }
                }
                case 652: {
                    try {
                        /* Sequential CFG blocks: 652, 654. */
                        {
                        }
                        {
                            statePc = 668;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_652) {
                        statePc = ((Object) stateCaught_652 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_652);
                        }
                        caughtException = stateCaught_652;
                        continue stateLoop;
                    }
                }
                case 656: {
                    try {
                        this.field_a = this.field_C[var5].field_F;
                        this.field_x = this.field_C[var5].field_H;
                        this.field_c = sj.field_b;
                        this.field_k = lg.field_c;
                        this.field_E = eg.field_p;
                        eg.field_p = this.field_C[var5].field_E;
                        this.field_K = this.field_C[var5].field_Z.b(1) + aa.field_r;
                        if (this.field_C[var5].field_T <= 0) {
                            statePc = 659;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 657. */
                            {
                                this.field_K = this.field_C[var5].field_Z.b(1) + d.field_O;
                                statePc = 659;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_656) {
                        statePc = ((Object) stateCaught_656 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_656);
                        }
                        caughtException = stateCaught_656;
                        continue stateLoop;
                    }
                }
                case 659: {
                    try {
                        this.field_C[var5].field_ib = true;
                        qd.$cfr$intArgs$a$e9dea5688aa5(126, 3);
                        if (var12 == 0) {
                            statePc = 668;
                        } else {
                            statePc = 660;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_659) {
                        statePc = ((Object) stateCaught_659 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_659);
                        }
                        caughtException = stateCaught_659;
                        continue stateLoop;
                    }
                }
                case 660: {
                    try {
                        if (this.field_C[var5].field_P > 0) {
                            statePc = 666;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 661. */
                            {
                                /* Sequential CFG blocks: 661, 663. */
                                {
                                }
                                {
                                    this.field_C[var5].field_p = 26;
                                    if (var12 == 0) {
                                        statePc = 668;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 664. */
                                        {
                                            statePc = 666;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_660) {
                        statePc = ((Object) stateCaught_660 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_660);
                        }
                        caughtException = stateCaught_660;
                        continue stateLoop;
                    }
                }
                case 666: {
                    try {
                        this.field_C[var5].field_p = 0;
                        statePc = 668;
                        continue stateLoop;
                    } catch (Throwable stateCaught_666) {
                        statePc = ((Object) stateCaught_666 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_666);
                        }
                        caughtException = stateCaught_666;
                        continue stateLoop;
                    }
                }
                case 668: {
                    try {
                        if (7 == this.field_C[var5].field_t) {
                            statePc = 685;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 669. */
                            {
                                if (this.field_C[var5].field_Z == null) {
                                    /* Inlined CFG state: 674. */
                                    {
                                        if (this.field_C[var5].field_d != 5) {
                                            statePc = 685;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 675. */
                                            {
                                                if (this.field_C[var5].field_S) {
                                                    /* Inlined CFG state: 680. */
                                                    {
                                                        stackIn_681_0 = 0;
                                                        statePc = 681;
                                                        continue stateLoop;
                                                    }
                                                } else {
                                                    /* Inlined CFG state: 676. */
                                                    {
                                                        /* Sequential CFG blocks: 676, 678. */
                                                        {
                                                        }
                                                        {
                                                            stackIn_681_0 = 1;
                                                            statePc = 681;
                                                            continue stateLoop;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 670. */
                                    {
                                        /* Sequential CFG blocks: 670, 672. */
                                        {
                                        }
                                        {
                                            statePc = 685;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_668) {
                        statePc = ((Object) stateCaught_668 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_668);
                        }
                        caughtException = stateCaught_668;
                        continue stateLoop;
                    }
                }
                case 681: {
                    try {
                        if (stackIn_681_0 == 1) {
                            /* Inlined CFG state: 684. */
                            {
                                this.field_C[var5].field_d = 6;
                                statePc = 685;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 682. */
                            {
                                statePc = 685;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_681) {
                        statePc = ((Object) stateCaught_681 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_681);
                        }
                        caughtException = stateCaught_681;
                        continue stateLoop;
                    }
                }
                case 685: {
                    try {
                        stackIn_686_0 = this.field_C[var5];
                        statePc = 686;
                        continue stateLoop;
                    } catch (Throwable stateCaught_685) {
                        statePc = ((Object) stateCaught_685 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_685);
                        }
                        caughtException = stateCaught_685;
                        continue stateLoop;
                    }
                }
                case 686: {
                    try {
                        if (stackIn_686_0.field_P > 0) {
                            /* Inlined CFG state: 689. */
                            {
                                if ((1 & this.field_h.a(112, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i) <= 0) {
                                    statePc = 701;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 690. */
                                    {
                                        if (this.field_h.a(-63, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_g % 4 == 0) {
                                            /* Inlined CFG state: 695. */
                                            {
                                                dupTemp$4 = this.field_C[var5].field_c;
                                                dupTemp$4.field_g = dupTemp$4.field_g + 3;
                                                this.field_C[var5].field_c.a(1, true, -114);
                                                if (24 <= this.field_C[var5].field_c.field_g) {
                                                    statePc = 699;
                                                } else {
                                                    statePc = 696;
                                                }
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 691. */
                                            {
                                                /* Sequential CFG blocks: 691, 693. */
                                                {
                                                }
                                                {
                                                    statePc = 701;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 687. */
                            {
                                statePc = 829;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_686) {
                        statePc = ((Object) stateCaught_686 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_686);
                        }
                        caughtException = stateCaught_686;
                        continue stateLoop;
                    }
                }
                case 696: {
                    try {
                        qd.$cfr$intArgs$a$e9dea5688aa5(125, 87);
                        if (var12 == 0) {
                            statePc = 701;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 697. */
                            {
                                statePc = 699;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_696) {
                        statePc = ((Object) stateCaught_696 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_696);
                        }
                        caughtException = stateCaught_696;
                        continue stateLoop;
                    }
                }
                case 699: {
                    try {
                        qd.$cfr$intArgs$a$e9dea5688aa5(84, 86);
                        statePc = 701;
                        continue stateLoop;
                    } catch (Throwable stateCaught_699) {
                        statePc = ((Object) stateCaught_699 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_699);
                        }
                        caughtException = stateCaught_699;
                        continue stateLoop;
                    }
                }
                case 701: {
                    try {
                        if ((this.field_h.a(param0 - 35, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i & 2) <= 0) {
                            statePc = 713;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 702. */
                            {
                                if (0 != this.field_h.a(-124, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_k % 4) {
                                    statePc = 713;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 703. */
                                    {
                                        /* Sequential CFG blocks: 703, 705. */
                                        {
                                        }
                                        {
                                            dupTemp$5 = this.field_C[var5].field_c;
                                            dupTemp$5.field_k = dupTemp$5.field_k + 3;
                                            this.field_C[var5].field_c.a(2, true, 81);
                                            if (this.field_C[var5].field_c.field_k >= 24) {
                                                statePc = 711;
                                            } else {
                                                statePc = 706;
                                            }
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_701) {
                        statePc = ((Object) stateCaught_701 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_701);
                        }
                        caughtException = stateCaught_701;
                        continue stateLoop;
                    }
                }
                case 706: {
                    try {
                        /* Sequential CFG blocks: 706, 708. */
                        {
                        }
                        {
                            qd.$cfr$intArgs$a$e9dea5688aa5(70, 87);
                            if (var12 == 0) {
                                statePc = 713;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 709. */
                                {
                                    statePc = 711;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_706) {
                        statePc = ((Object) stateCaught_706 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_706);
                        }
                        caughtException = stateCaught_706;
                        continue stateLoop;
                    }
                }
                case 711: {
                    try {
                        qd.$cfr$intArgs$a$e9dea5688aa5(54, 86);
                        statePc = 713;
                        continue stateLoop;
                    } catch (Throwable stateCaught_711) {
                        statePc = ((Object) stateCaught_711 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_711);
                        }
                        caughtException = stateCaught_711;
                        continue stateLoop;
                    }
                }
                case 713: {
                    try {
                        if ((4 & this.field_h.a(105, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i) <= 0) {
                            statePc = 725;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 714. */
                            {
                                if (this.field_h.a(127, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F + 1).field_g % 4 == 0) {
                                    /* Inlined CFG state: 719. */
                                    {
                                        dupTemp$6 = this.field_h.a(param0 ^ -112, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F + 1);
                                        dupTemp$6.field_g = dupTemp$6.field_g + 3;
                                        this.field_h.a(98, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F + 1).a(1, true, -111);
                                        if (this.field_h.a(-64, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F + 1).field_g < 24) {
                                            statePc = 723;
                                        } else {
                                            statePc = 720;
                                        }
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 715. */
                                    {
                                        /* Sequential CFG blocks: 715, 717. */
                                        {
                                        }
                                        {
                                            statePc = 725;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_713) {
                        statePc = ((Object) stateCaught_713 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_713);
                        }
                        caughtException = stateCaught_713;
                        continue stateLoop;
                    }
                }
                case 720: {
                    try {
                        qd.$cfr$intArgs$a$e9dea5688aa5(101, 86);
                        if (var12 == 0) {
                            statePc = 725;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 721. */
                            {
                                statePc = 723;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_720) {
                        statePc = ((Object) stateCaught_720 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_720);
                        }
                        caughtException = stateCaught_720;
                        continue stateLoop;
                    }
                }
                case 723: {
                    try {
                        qd.$cfr$intArgs$a$e9dea5688aa5(82, 87);
                        statePc = 725;
                        continue stateLoop;
                    } catch (Throwable stateCaught_723) {
                        statePc = ((Object) stateCaught_723 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_723);
                        }
                        caughtException = stateCaught_723;
                        continue stateLoop;
                    }
                }
                case 725: {
                    try {
                        if ((this.field_h.a(param0 ^ 72, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i & 8) <= 0) {
                            statePc = 737;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 726. */
                            {
                                if (this.field_h.a(param0 - 116, 1 + this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_k % 4 == 0) {
                                    /* Inlined CFG state: 731. */
                                    {
                                        dupTemp$7 = this.field_h.a(91, this.field_C[var5].field_H + 1, this.field_C[var5].field_E, this.field_C[var5].field_F);
                                        dupTemp$7.field_k = dupTemp$7.field_k + 3;
                                        this.field_h.a(86, 1 + this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).a(2, true, -113);
                                        if (this.field_h.a(param0 - 78, this.field_C[var5].field_H + 1, this.field_C[var5].field_E, this.field_C[var5].field_F).field_k >= 24) {
                                            statePc = 735;
                                        } else {
                                            statePc = 732;
                                        }
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 727. */
                                    {
                                        /* Sequential CFG blocks: 727, 729. */
                                        {
                                        }
                                        {
                                            statePc = 737;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_725) {
                        statePc = ((Object) stateCaught_725 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_725);
                        }
                        caughtException = stateCaught_725;
                        continue stateLoop;
                    }
                }
                case 732: {
                    try {
                        qd.$cfr$intArgs$a$e9dea5688aa5(36, 87);
                        if (var12 == 0) {
                            statePc = 737;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 733. */
                            {
                                statePc = 735;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_732) {
                        statePc = ((Object) stateCaught_732 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_732);
                        }
                        caughtException = stateCaught_732;
                        continue stateLoop;
                    }
                }
                case 735: {
                    try {
                        qd.$cfr$intArgs$a$e9dea5688aa5(116, 86);
                        statePc = 737;
                        continue stateLoop;
                    } catch (Throwable stateCaught_735) {
                        statePc = ((Object) stateCaught_735 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_735);
                        }
                        caughtException = stateCaught_735;
                        continue stateLoop;
                    }
                }
                case 737: {
                    try {
                        if (this.field_C[var5].field_C == 1) {
                            statePc = 786;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 738. */
                            {
                                if (this.field_C[var5].field_k) {
                                    /* Inlined CFG state: 743. */
                                    {
                                        this.field_C[var5].field_h = true;
                                        this.field_C[var5].field_i = this.field_C[var5].field_F;
                                        this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                        this.field_C[var5].field_R = this.field_C[var5].field_E;
                                        this.field_C[var5].field_k = false;
                                        statePc = 744;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 739. */
                                    {
                                        /* Sequential CFG blocks: 739, 741. */
                                        {
                                        }
                                        {
                                            statePc = 744;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_737) {
                        statePc = ((Object) stateCaught_737 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_737);
                        }
                        caughtException = stateCaught_737;
                        continue stateLoop;
                    }
                }
                case 744: {
                    try {
                        if (this.field_J) {
                            statePc = 750;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 745. */
                            {
                                if (!ok.field_i) {
                                    statePc = 750;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 746. */
                                    {
                                        /* Sequential CFG blocks: 746, 748. */
                                        {
                                        }
                                        {
                                            this.field_C[var5].a((byte) -46, false);
                                            statePc = 750;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_744) {
                        statePc = ((Object) stateCaught_744 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_744);
                        }
                        caughtException = stateCaught_744;
                        continue stateLoop;
                    }
                }
                case 750: {
                    try {
                        if (!this.field_J) {
                            statePc = 760;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 751. */
                            {
                                if (this.field_q != this.field_C[var5]) {
                                    statePc = 760;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 752. */
                                    {
                                        /* Sequential CFG blocks: 752, 754. */
                                        {
                                        }
                                        {
                                            if (ok.field_i) {
                                                /* Inlined CFG state: 759. */
                                                {
                                                    this.field_C[var5].a((byte) -51, true);
                                                    statePc = 760;
                                                    continue stateLoop;
                                                }
                                            } else {
                                                /* Inlined CFG state: 755. */
                                                {
                                                    /* Sequential CFG blocks: 755, 757. */
                                                    {
                                                    }
                                                    {
                                                        statePc = 760;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_750) {
                        statePc = ((Object) stateCaught_750 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_750);
                        }
                        caughtException = stateCaught_750;
                        continue stateLoop;
                    }
                }
                case 760: {
                    try {
                        this.field_C[var5].field_k = false;
                        var7 = 0;
                        statePc = 761;
                        continue stateLoop;
                    } catch (Throwable stateCaught_760) {
                        statePc = ((Object) stateCaught_760 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_760);
                        }
                        caughtException = stateCaught_760;
                        continue stateLoop;
                    }
                }
                case 761: {
                    try {
                        if (~this.field_C.length >= ~var7) {
                            statePc = 782;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 762. */
                            {
                                stackIn_865_0 = null;
                                stackIn_763_0 = stackIn_865_0;
                                stackIn_865_1 = this.field_C[var7];
                                stackIn_763_1 = stackIn_865_1;
                                if (var12 != 0) {
                                    statePc = 865;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 763. */
                                    {
                                        if (stackIn_763_0 == stackIn_763_1) {
                                            statePc = 781;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 764. */
                                            {
                                                /* Sequential CFG blocks: 764, 766. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var7].field_C != 1) {
                                                        statePc = 781;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 767. */
                                                        {
                                                            /* Sequential CFG blocks: 767, 769. */
                                                            {
                                                            }
                                                            {
                                                                if (this.field_C[var7].field_P <= 0) {
                                                                    statePc = 781;
                                                                } else {
                                                                    statePc = 770;
                                                                }
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_761) {
                        statePc = ((Object) stateCaught_761 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_761);
                        }
                        caughtException = stateCaught_761;
                        continue stateLoop;
                    }
                }
                case 770: {
                    try {
                        /* Sequential CFG blocks: 770, 772. */
                        {
                        }
                        {
                            if (this.field_h.a((byte) -93, this.field_C[var7], this.field_C[var5])) {
                                /* Inlined CFG state: 777. */
                                {
                                    this.field_C[var5].field_k = true;
                                    this.field_C[var5].field_h = true;
                                    this.field_C[var5].field_i = this.field_C[var5].field_F;
                                    this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                    this.field_C[var5].field_R = this.field_C[var5].field_E;
                                    statePc = 778;
                                    continue stateLoop;
                                }
                            } else {
                                /* Inlined CFG state: 773. */
                                {
                                    /* Sequential CFG blocks: 773, 775. */
                                    {
                                    }
                                    {
                                        statePc = 778;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_770) {
                        statePc = ((Object) stateCaught_770 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_770);
                        }
                        caughtException = stateCaught_770;
                        continue stateLoop;
                    }
                }
                case 778: {
                    try {
                        if (!this.field_C[var5].field_db) {
                            statePc = 781;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 779. */
                            {
                                this.field_C[var5].field_h = true;
                                this.field_C[var5].field_i = this.field_C[var5].field_F;
                                this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                this.field_C[var5].field_R = this.field_C[var5].field_E;
                                statePc = 781;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_778) {
                        statePc = ((Object) stateCaught_778 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_778);
                        }
                        caughtException = stateCaught_778;
                        continue stateLoop;
                    }
                }
                case 781: {
                    try {
                        var7++;
                        if (var12 == 0) {
                            statePc = 761;
                        } else {
                            statePc = 782;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_781) {
                        statePc = ((Object) stateCaught_781 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_781);
                        }
                        caughtException = stateCaught_781;
                        continue stateLoop;
                    }
                }
                case 782: {
                    try {
                        if (this.field_C[var5].field_k) {
                            /* Inlined CFG state: 785. */
                            {
                                this.field_C[var5].field_h = false;
                                if (var12 == 0) {
                                    statePc = 829;
                                } else {
                                    statePc = 786;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 783. */
                            {
                                statePc = 829;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_782) {
                        statePc = ((Object) stateCaught_782 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_782);
                        }
                        caughtException = stateCaught_782;
                        continue stateLoop;
                    }
                }
                case 786: {
                    try {
                        if (this.field_C[var5].field_k) {
                            statePc = 792;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 787. */
                            {
                                /* Sequential CFG blocks: 787, 789. */
                                {
                                }
                                {
                                    if (this.field_C[var5].field_t != 6) {
                                        statePc = 794;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 790. */
                                        {
                                            statePc = 792;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_786) {
                        statePc = ((Object) stateCaught_786 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_786);
                        }
                        caughtException = stateCaught_786;
                        continue stateLoop;
                    }
                }
                case 792: {
                    try {
                        this.field_C[var5].field_h = true;
                        this.field_C[var5].field_i = this.field_C[var5].field_F;
                        this.field_C[var5].field_gb = this.field_C[var5].field_H;
                        this.field_C[var5].field_R = this.field_C[var5].field_E;
                        this.field_C[var5].field_k = false;
                        statePc = 794;
                        continue stateLoop;
                    } catch (Throwable stateCaught_792) {
                        statePc = ((Object) stateCaught_792 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_792);
                        }
                        caughtException = stateCaught_792;
                        continue stateLoop;
                    }
                }
                case 794: {
                    try {
                        var7 = 0;
                        var8 = 0;
                        statePc = 795;
                        continue stateLoop;
                    } catch (Throwable stateCaught_794) {
                        statePc = ((Object) stateCaught_794 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_794);
                        }
                        caughtException = stateCaught_794;
                        continue stateLoop;
                    }
                }
                case 795: {
                    try {
                        if (this.field_C.length <= var8) {
                            statePc = 823;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 796. */
                            {
                                stackIn_865_0 = null;
                                stackIn_797_0 = stackIn_865_0;
                                stackIn_865_1 = this.field_C[var8];
                                stackIn_797_1 = stackIn_865_1;
                                if (var12 != 0) {
                                    statePc = 865;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 797. */
                                    {
                                        if (stackIn_797_0 == stackIn_797_1) {
                                            statePc = 822;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 798. */
                                            {
                                                /* Sequential CFG blocks: 798, 800. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var8].field_C != 0) {
                                                        statePc = 822;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 801. */
                                                        {
                                                            /* Sequential CFG blocks: 801, 803. */
                                                            {
                                                            }
                                                            {
                                                                if (this.field_C[var8].field_P > 0) {
                                                                    statePc = 808;
                                                                } else {
                                                                    statePc = 804;
                                                                }
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_795) {
                        statePc = ((Object) stateCaught_795 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_795);
                        }
                        caughtException = stateCaught_795;
                        continue stateLoop;
                    }
                }
                case 804: {
                    try {
                        /* Sequential CFG blocks: 804, 806. */
                        {
                        }
                        {
                            statePc = 822;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_804) {
                        statePc = ((Object) stateCaught_804 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_804);
                        }
                        caughtException = stateCaught_804;
                        continue stateLoop;
                    }
                }
                case 808: {
                    try {
                        if (!this.field_h.a((byte) -93, this.field_C[var8], this.field_C[var5])) {
                            statePc = 812;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 809. */
                            {
                                this.field_C[var5].field_k = true;
                                this.field_C[var5].field_h = true;
                                this.field_C[var5].field_i = this.field_C[var5].field_F;
                                this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                this.field_C[var5].field_R = this.field_C[var5].field_E;
                                if (var12 == 0) {
                                    statePc = 819;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 810. */
                                    {
                                        statePc = 812;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_808) {
                        statePc = ((Object) stateCaught_808 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_808);
                        }
                        caughtException = stateCaught_808;
                        continue stateLoop;
                    }
                }
                case 812: {
                    try {
                        if (!this.field_C[var5].field_h) {
                            statePc = 819;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 813. */
                            {
                                /* Sequential CFG blocks: 813, 815. */
                                {
                                }
                                {
                                    if (!this.field_h.a(param0 + 10057, this.field_C[var5], this.field_C[var8], true)) {
                                        statePc = 819;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 816. */
                                        {
                                            /* Sequential CFG blocks: 816, 818. */
                                            {
                                            }
                                            {
                                                var7 = 1;
                                                statePc = 819;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_812) {
                        statePc = ((Object) stateCaught_812 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_812);
                        }
                        caughtException = stateCaught_812;
                        continue stateLoop;
                    }
                }
                case 819: {
                    try {
                        if (!this.field_C[var5].field_db) {
                            statePc = 822;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 820. */
                            {
                                this.field_C[var5].field_h = true;
                                this.field_C[var5].field_i = this.field_C[var5].field_F;
                                this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                this.field_C[var5].field_R = this.field_C[var5].field_E;
                                statePc = 822;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_819) {
                        statePc = ((Object) stateCaught_819 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_819);
                        }
                        caughtException = stateCaught_819;
                        continue stateLoop;
                    }
                }
                case 822: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 795;
                        } else {
                            statePc = 823;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_822) {
                        statePc = ((Object) stateCaught_822 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_822);
                        }
                        caughtException = stateCaught_822;
                        continue stateLoop;
                    }
                }
                case 823: {
                    try {
                        if (this.field_C[var5].field_k) {
                            statePc = 827;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 824. */
                            {
                                if (var7 == 0) {
                                    statePc = 829;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 825. */
                                    {
                                        statePc = 827;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_823) {
                        statePc = ((Object) stateCaught_823 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_823);
                        }
                        caughtException = stateCaught_823;
                        continue stateLoop;
                    }
                }
                case 827: {
                    try {
                        this.field_C[var5].field_h = false;
                        statePc = 829;
                        continue stateLoop;
                    } catch (Throwable stateCaught_827) {
                        statePc = ((Object) stateCaught_827 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_827);
                        }
                        caughtException = stateCaught_827;
                        continue stateLoop;
                    }
                }
                case 829: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 572;
                        } else {
                            statePc = 830;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_829) {
                        statePc = ((Object) stateCaught_829 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_829);
                        }
                        caughtException = stateCaught_829;
                        continue stateLoop;
                    }
                }
                case 830: {
                    try {
                        stackIn_831_0 = null;
                        stackIn_831_1 = this;
                        statePc = 831;
                        continue stateLoop;
                    } catch (Throwable stateCaught_830) {
                        statePc = ((Object) stateCaught_830 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_830);
                        }
                        caughtException = stateCaught_830;
                        continue stateLoop;
                    }
                }
                case 831: {
                    try {
                        if (stackIn_831_0 == ((e) (this)).field_K) {
                            statePc = 841;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 832. */
                            {
                                if (le.field_q == null) {
                                    statePc = 841;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 833. */
                                    {
                                        /* Sequential CFG blocks: 833, 835. */
                                        {
                                        }
                                        {
                                            if ("" == le.field_q.field_o) {
                                                /* Inlined CFG state: 840. */
                                                {
                                                    this.field_K = null;
                                                    statePc = 841;
                                                    continue stateLoop;
                                                }
                                            } else {
                                                /* Inlined CFG state: 836. */
                                                {
                                                    /* Sequential CFG blocks: 836, 838. */
                                                    {
                                                    }
                                                    {
                                                        statePc = 841;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_831) {
                        statePc = ((Object) stateCaught_831 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_831);
                        }
                        caughtException = stateCaught_831;
                        continue stateLoop;
                    }
                }
                case 841: {
                    try {
                        ok.field_i = false;
                        if (param0 == -1) {
                            statePc = 844;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 842. */
                            {
                                this.field_s = 75;
                                statePc = 844;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_841) {
                        statePc = ((Object) stateCaught_841 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_841);
                        }
                        caughtException = stateCaught_841;
                        continue stateLoop;
                    }
                }
                case 844: {
                    try {
                        q.field_Ib = false;
                        if (!this.field_J) {
                            statePc = 847;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 845. */
                            {
                                q.field_Ib = true;
                                statePc = 847;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_844) {
                        statePc = ((Object) stateCaught_844 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_844);
                        }
                        caughtException = stateCaught_844;
                        continue stateLoop;
                    }
                }
                case 847: {
                    try {
                        var7 = 0;
                        var5 = 0;
                        statePc = 848;
                        continue stateLoop;
                    } catch (Throwable stateCaught_847) {
                        statePc = ((Object) stateCaught_847 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_847);
                        }
                        caughtException = stateCaught_847;
                        continue stateLoop;
                    }
                }
                case 848: {
                    try {
                        if (50 <= var5) {
                            statePc = 859;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 849. */
                            {
                                stackIn_864_0 = null;
                                stackIn_850_0 = stackIn_864_0;
                                stackIn_864_1 = this;
                                stackIn_850_1 = stackIn_864_1;
                                if (var12 != 0) {
                                    statePc = 864;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 850. */
                                    {
                                        if (stackIn_850_0 == ((e) (this)).field_F[var5]) {
                                            statePc = 858;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 851. */
                                            {
                                                /* Sequential CFG blocks: 851, 853. */
                                                {
                                                }
                                                {
                                                    if (null != this.field_F[var5].field_e) {
                                                        statePc = 857;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 854. */
                                                        {
                                                            /* Sequential CFG blocks: 854, 856. */
                                                            {
                                                            }
                                                            {
                                                                var7 = 1;
                                                                statePc = 857;
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_848) {
                        statePc = ((Object) stateCaught_848 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_848);
                        }
                        caughtException = stateCaught_848;
                        continue stateLoop;
                    }
                }
                case 857: {
                    try {
                        this.field_F[var5] = this.field_F[var5].a((byte) 11);
                        statePc = 858;
                        continue stateLoop;
                    } catch (Throwable stateCaught_857) {
                        statePc = ((Object) stateCaught_857 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_857);
                        }
                        caughtException = stateCaught_857;
                        continue stateLoop;
                    }
                }
                case 858: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 848;
                        } else {
                            statePc = 859;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_858) {
                        statePc = ((Object) stateCaught_858 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_858);
                        }
                        caughtException = stateCaught_858;
                        continue stateLoop;
                    }
                }
                case 859: {
                    try {
                        var5 = 0;
                        statePc = 860;
                        continue stateLoop;
                    } catch (Throwable stateCaught_859) {
                        statePc = ((Object) stateCaught_859 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_859);
                        }
                        caughtException = stateCaught_859;
                        continue stateLoop;
                    }
                }
                case 860: {
                    try {
                        if (~var5 <= ~this.field_C.length) {
                            statePc = 872;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 861. */
                            {
                                if (var12 != 0) {
                                    statePc = 874;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 862. */
                                    {
                                        stackIn_864_0 = null;
                                        stackIn_864_1 = this;
                                        statePc = 864;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_860) {
                        statePc = ((Object) stateCaught_860 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_860);
                        }
                        caughtException = stateCaught_860;
                        continue stateLoop;
                    }
                }
                case 864: {
                    try {
                        stackIn_865_0 = stackIn_864_0;
                        stackIn_865_1 = ((e) (this)).field_C[var5];
                        statePc = 865;
                        continue stateLoop;
                    } catch (Throwable stateCaught_864) {
                        statePc = ((Object) stateCaught_864 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_864);
                        }
                        caughtException = stateCaught_864;
                        continue stateLoop;
                    }
                }
                case 865: {
                    try {
                        if (stackIn_865_0 != stackIn_865_1) {
                            /* Inlined CFG state: 867. */
                            {
                                if (this.field_C[var5].field_S) {
                                    /* Inlined CFG state: 870. */
                                    {
                                        this.field_C[var5].a(var7 != 0, (byte) -127);
                                        var6 = 1;
                                        statePc = 871;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 868. */
                                    {
                                        statePc = 871;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 866. */
                            {
                                statePc = 871;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_865) {
                        statePc = ((Object) stateCaught_865 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_865);
                        }
                        caughtException = stateCaught_865;
                        continue stateLoop;
                    }
                }
                case 871: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 860;
                        } else {
                            statePc = 872;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_871) {
                        statePc = ((Object) stateCaught_871 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_871);
                        }
                        caughtException = stateCaught_871;
                        continue stateLoop;
                    }
                }
                case 872: {
                    try {
                        if (!li.field_a) {
                            statePc = 874;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 873. */
                            {
                                var6 = 1;
                                statePc = 874;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_872) {
                        statePc = ((Object) stateCaught_872 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_872);
                        }
                        caughtException = stateCaught_872;
                        continue stateLoop;
                    }
                }
                case 874: {
                    try {
                        if (this.field_w) {
                            /* Inlined CFG state: 877. */
                            {
                                this.field_h.c((byte) -96);
                                statePc = 878;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 875. */
                            {
                                statePc = 878;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_874) {
                        statePc = ((Object) stateCaught_874 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_874);
                        }
                        caughtException = stateCaught_874;
                        continue stateLoop;
                    }
                }
                case 878: {
                    try {
                        if (var6 != 0) {
                            /* Inlined CFG state: 881. */
                            {
                                var8 = 0;
                                statePc = 882;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 879. */
                            {
                                statePc = 894;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_878) {
                        statePc = ((Object) stateCaught_878 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_878);
                        }
                        caughtException = stateCaught_878;
                        continue stateLoop;
                    }
                }
                case 882: {
                    try {
                        if (var8 >= 12) {
                            statePc = 894;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 883. */
                            {
                                stackIn_909_0 = this.field_C[var8];
                                stackIn_884_0 = stackIn_909_0;
                                if (var12 != 0) {
                                    statePc = 909;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 884. */
                                    {
                                        if (stackIn_884_0 == null) {
                                            statePc = 893;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 885. */
                                            {
                                                /* Sequential CFG blocks: 885, 887. */
                                                {
                                                }
                                                {
                                                    if (this.field_C[var8].field_Z != null) {
                                                        /* Inlined CFG state: 892. */
                                                        {
                                                            this.field_C[var8].field_ob = false;
                                                            statePc = 893;
                                                            continue stateLoop;
                                                        }
                                                    } else {
                                                        /* Inlined CFG state: 888. */
                                                        {
                                                            /* Sequential CFG blocks: 888, 890. */
                                                            {
                                                            }
                                                            {
                                                                statePc = 893;
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_882) {
                        statePc = ((Object) stateCaught_882 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_882);
                        }
                        caughtException = stateCaught_882;
                        continue stateLoop;
                    }
                }
                case 893: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 882;
                        } else {
                            statePc = 894;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_893) {
                        statePc = ((Object) stateCaught_893 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_893);
                        }
                        caughtException = stateCaught_893;
                        continue stateLoop;
                    }
                }
                case 894: {
                    try {
                        if (var6 == 0) {
                            /* Inlined CFG state: 897. */
                            {
                                if (this.field_J) {
                                    statePc = 901;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 898. */
                                    {
                                        this.a(22341, param1, var7 != 0);
                                        if (var12 == 0) {
                                            statePc = 903;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 899. */
                                            {
                                                statePc = 901;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 895. */
                            {
                                statePc = 903;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_894) {
                        statePc = ((Object) stateCaught_894 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_894);
                        }
                        caughtException = stateCaught_894;
                        continue stateLoop;
                    }
                }
                case 901: {
                    try {
                        this.a(param1, true);
                        statePc = 903;
                        continue stateLoop;
                    } catch (Throwable stateCaught_901) {
                        statePc = ((Object) stateCaught_901 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_901);
                        }
                        caughtException = stateCaught_901;
                        continue stateLoop;
                    }
                }
                case 903: {
                    try {
                        if (0 > this.field_B) {
                            statePc = 924;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 904. */
                            {
                                if (this.field_B >= 16) {
                                    statePc = 924;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 905. */
                                    {
                                        /* Sequential CFG blocks: 905, 907. */
                                        {
                                        }
                                        {
                                            stackIn_909_0 = this.field_C[9];
                                            statePc = 909;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_903) {
                        statePc = ((Object) stateCaught_903 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_903);
                        }
                        caughtException = stateCaught_903;
                        continue stateLoop;
                    }
                }
                case 909: {
                    try {
                        if (stackIn_909_0.field_k) {
                            statePc = 922;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 910. */
                            {
                                if (this.field_C[10].field_k) {
                                    statePc = 922;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 911. */
                                    {
                                        /* Sequential CFG blocks: 911, 913. */
                                        {
                                        }
                                        {
                                            if (this.field_C[11].field_k) {
                                                statePc = 922;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 914. */
                                                {
                                                    /* Sequential CFG blocks: 914, 916. */
                                                    {
                                                    }
                                                    {
                                                        if (this.field_C[6].field_P <= 0) {
                                                            statePc = 922;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 917. */
                                                            {
                                                                /* Sequential CFG blocks: 917, 919. */
                                                                {
                                                                }
                                                                {
                                                                    if (this.field_C[7].field_P > 0) {
                                                                        statePc = 924;
                                                                    } else {
                                                                        statePc = 920;
                                                                    }
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_909) {
                        statePc = ((Object) stateCaught_909 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_909);
                        }
                        caughtException = stateCaught_909;
                        continue stateLoop;
                    }
                }
                case 920: {
                    try {
                        statePc = 922;
                        continue stateLoop;
                    } catch (Throwable stateCaught_920) {
                        statePc = ((Object) stateCaught_920 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_920);
                        }
                        caughtException = stateCaught_920;
                        continue stateLoop;
                    }
                }
                case 922: {
                    try {
                        this.field_B = 16;
                        statePc = 924;
                        continue stateLoop;
                    } catch (Throwable stateCaught_922) {
                        statePc = ((Object) stateCaught_922 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_922);
                        }
                        caughtException = stateCaught_922;
                        continue stateLoop;
                    }
                }
                case 924: {
                    try {
                        ha.field_o = false;
                        statePc = 931;
                        continue stateLoop;
                    } catch (Throwable stateCaught_924) {
                        statePc = ((Object) stateCaught_924 instanceof RuntimeException ? 926 : -1);
                        if (statePc == -1) {
                            throw e.<RuntimeException>$cfr$sneakyThrow(stateCaught_924);
                        }
                        caughtException = stateCaught_924;
                        continue stateLoop;
                    }
                }
                case 926: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_929_0 = (RuntimeException) (var3);
                    stackIn_927_0 = stackIn_929_0;
                    stackIn_929_1 = new StringBuilder().append("e.P(").append(param0).append(',');
                    stackIn_927_1 = stackIn_929_1;
                    if (param1 == null) {
                        statePc = 929;
                    } else {
                        statePc = 927;
                    }
                    continue stateLoop;
                }
                case 927: {
                    stackIn_930_0 = stackIn_927_0;
                    stackIn_930_1 = stackIn_927_1;
                    stackIn_930_2 = "{...}";
                    statePc = 930;
                    continue stateLoop;
                }
                case 929: {
                    stackIn_930_0 = stackIn_929_0;
                    stackIn_930_1 = stackIn_929_1;
                    stackIn_930_2 = "null";
                    statePc = 930;
                    continue stateLoop;
                }
                case 930: {
                    throw qk.a((Throwable) ((Object) stackIn_930_0), ((StringBuilder) (Object) stackIn_930_1).append(stackIn_930_2).append(')').toString());
                }
                case 931: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    e(Terraphoenix param0) {
        Terraphoenix stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        Terraphoenix stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        Terraphoenix stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        Terraphoenix stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        ga stackIn_306_0 = null;
        int stackIn_333_0 = 0;
        int stackIn_333_1 = 0;
        r stackIn_336_0 = null;
        int stackIn_455_0 = 0;
        r stackIn_528_0 = null;
        int stackIn_563_0 = 0;
        int stackIn_639_0 = 0;
        Object stackIn_767_0 = null;
        RuntimeException stackIn_772_0 = null;
        StringBuilder stackIn_772_1 = null;
        String stackIn_773_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
        dl var17_ref_dl = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dl var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        var24 = Terraphoenix.field_V;
        this.field_D = null;
        this.field_F = new gi[50];
        this.field_w = false;
        this.field_n = null;
        this.field_C = new r[100];
        try {
          System.gc();
          this.field_i = 1;
          le.field_q = null;
          this.b((byte) -3);
          this.field_f = 0;
          this.field_G = param0;
          this.field_z = 0;
          this.field_v = false;
          this.field_L = 0;
          ok.field_i = true;
          this.field_J = false;
          this.field_b = false;
          this.field_B = -1;
          eg.field_p = 0;
          li.field_a = false;
          this.field_r = false;
          this.field_A = false;
          this.field_e = new hk();
          var2_int = 0;
          var3 = 0;
          var4 = 0;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          var11 = 0;
          var12 = 0;
          var13 = 0;
          stackIn_4_0 = (Terraphoenix) (param0);
          stackIn_5_1 = !(param0.field_Bb <= 2);
          stackIn_4_0.field_Ab = stackIn_5_1;
          stackIn_8_0 = (Terraphoenix) (param0);
          stackIn_9_1 = !(param0.field_Bb <= 2);
          stackIn_8_0.field_H = stackIn_9_1;
          stackIn_12_0 = (Terraphoenix) (param0);
          stackIn_13_1 = !(param0.field_Bb <= 2);
          stackIn_12_0.field_E = stackIn_13_1;
          stackIn_16_0 = (Terraphoenix) (param0);
          stackIn_17_1 = !(param0.field_Bb <= 2);
          L4: {
            stackIn_16_0.field_Y = stackIn_17_1;
            var14 = 0;
            if (!param0.field_db) {
              L6: {
                L7: {
                  L8: {
                    L9: {
                      L10: {
                        L11: {
                          L12: {
                            L13: {
                              L14: {
                                L15: {
                                  L16: {
                                    L17: {
                                      L18: {
                                        var15 = param0.field_Bb;
                                        switch (var15) {
                                          case 1:
                                            break L18;
                                          case 2:
                                            break L17;
                                          default:
                                            if (3 == var15 &&
                                              var24 == 0) {
                                              break L16;
                                            }
                                            if (var15 == 4 &&
                                              var24 == 0) {
                                              break L15;
                                            }
                                            if (5 == var15 &&
                                              var24 == 0) {
                                              break L14;
                                            }
                                            if (var15 == 6 &&
                                              var24 == 0) {
                                              break L13;
                                            }
                                            if (7 == var15 &&
                                              var24 == 0) {
                                              break L12;
                                            }
                                            if (var15 == 8 &&
                                              var24 == 0) {
                                              break L11;
                                            }
                                            if (9 == var15 &&
                                              var24 == 0) {
                                              break L10;
                                            }
                                            if (var15 == 10 &&
                                              var24 == 0) {
                                              break L9;
                                            }
                                            switch (var15) {
                                              case 11:
                                                break L8;
                                              case 12:
                                                break L7;
                                              default:
                                                break L4;
                                              case 13:
                                                if (var24 == 0) {
                                                  break L6;
                                                }
                                                break;
                                            }
                                          case 0:
                                            this.field_B = 0;
                                            var2_int = 10;
                                            le.field_q = new ad(0);
                                            le.field_q.field_A = this;
                                            if (fa.field_a >= 1) {
                                              this.a(1, kl.field_d[76], -87);
                                              if (var24 != 0) {
                                                this.a(-1, ak.field_c, -32);
                                              }
                                            } else {
                                              this.a(-1, ak.field_c, -32);
                                            }
                                            if (2 == fa.field_a) {
                                              var2_int = 14;
                                            }
                                            this.field_J = true;
                                            if (var24 == 0) {
                                              break L4;
                                            }
                                            break;
                                        }
                                      }
                                      var2_int = 16;
                                      var6 = 4;
                                      this.field_J = false;
                                      if (fa.field_a != 2) {
                                        break L4;
                                      }
                                      var2_int = 20;
                                      if (var24 == 0) {
                                        break L4;
                                      }
                                    }
                                    var9 = 2;
                                    var2_int = 12;
                                    var8 = 2;
                                    this.field_J = true;
                                    if (fa.field_a != 2) {
                                      break L4;
                                    }
                                    var2_int = 20;
                                    if (var24 == 0) {
                                      break L4;
                                    }
                                  }
                                  var3 = 1;
                                  var2_int = 16;
                                  this.field_J = true;
                                  if (fa.field_a == 2) {
                                    var2_int = 20;
                                    var3 = 2;
                                  }
                                  this.field_i = 2;
                                  if (param0.field_ub != 2) {
                                    var10 = 2;
                                    if (var24 == 0) {
                                      break L4;
                                    }
                                  }
                                  var9 = 1;
                                  var8 = 1;
                                  if (var24 == 0) {
                                    break L4;
                                  }
                                }
                                var3 = 6;
                                this.field_z = 15;
                                var11 = 0;
                                var12 = 2;
                                this.field_J = false;
                                if (fa.field_a != 2) {
                                  break L4;
                                }
                                var12 = 4;
                                if (var24 == 0) {
                                  break L4;
                                }
                              }
                              var12 = 6;
                              var3 = 6;
                              var11 = 4;
                              if (fa.field_a == 2) {
                                var12 = 8;
                                var11 = 6;
                              }
                              this.field_J = true;
                              if (var24 == 0) {
                                break L4;
                              }
                            }
                            var3 = 6;
                            this.field_z = 10;
                            var11 = 4;
                            var13 = 4;
                            var12 = 4;
                            var8 = 3;
                            if (fa.field_a == 0) {
                              var11 = 2;
                            }
                            this.field_J = false;
                            if (fa.field_a != 2) {
                              break L4;
                            }
                            var12 = 8;
                            var13 = 6;
                            var11 = 6;
                            var3 = 4;
                            if (var24 == 0) {
                              break L4;
                            }
                          }
                          var13 = 6;
                          var3 = 4;
                          var12 = 8;
                          this.field_J = true;
                          var11 = 4;
                          if (2 != fa.field_a) {
                            break L4;
                          }
                          var13 = 8;
                          var3 = 2;
                          if (var24 == 0) {
                            break L4;
                          }
                        }
                        boolean decompiledFrameRemainder6 = true;
                        this.field_J = true;
                        this.field_i = 3;
                        if (1 == param0.field_vb) {
                          var13 = 4;
                          var3 = 4;
                          var12 = 2;
                          var4 = 1;
                          var8 = 10;
                          var9 = 2;
                          var5 = 4;
                          var14 = 6;
                          decompiledFrameRemainder6 = (var24 != 0);
                        }
                        if (decompiledFrameRemainder6) {
                          var9 = 2;
                          var8 = 6;
                          this.field_z = 5;
                          var12 = 6;
                          var3 = 4;
                          var13 = 4;
                          this.field_J = false;
                          var4 = 1;
                          var14 = 6;
                        }
                        dd.field_M = 7;
                        if (var24 == 0) {
                          break L4;
                        }
                      }
                      var13 = 6;
                      var14 = 6;
                      var12 = 6;
                      var3 = 18;
                      if (fa.field_a == 2) {
                        var12 = 12;
                        var3 = 12;
                      }
                      this.field_J = true;
                      var11 = 0;
                      if (var24 == 0) {
                        break L4;
                      }
                    }
                    this.field_i = 3;
                    boolean decompiledSharedTail0 = (param0.field_vb != 1);
                    if (!decompiledSharedTail0) {
                      var9 = 2;
                      var4 = 1;
                      var8 = 6;
                      var5 = 6;
                      var12 = 4;
                      this.field_z = 5;
                      this.field_J = false;
                      var13 = 4;
                      var14 = 6;
                      decompiledSharedTail0 = (var24 != 0);
                    }
                    if (decompiledSharedTail0) {
                      var5 = 10;
                      var13 = 4;
                      var12 = 0;
                      var14 = 6;
                      var4 = 1;
                      var9 = 2;
                      var8 = 10;
                    }
                    dd.field_M = 7;
                    this.field_J = true;
                    if (var24 == 0) {
                      break L4;
                    }
                  }
                  dd.field_M = 4;
                  this.field_i = 2;
                  var12 = 6;
                  var14 = 6;
                  var13 = 6;
                  var5 = 6;
                  this.field_J = true;
                  if (var24 == 0) {
                    break L4;
                  }
                }
                this.field_J = true;
                dd.field_M = 4;
                this.field_i = 3;
                var8 = 8;
                var5 = 2;
                var14 = 8;
                if (var24 == 0) {
                  break L4;
                }
              }
              var8 = 12;
              var5 = 4;
              this.field_J = true;
              dd.field_M = 4;
              this.field_i = 3;
              var14 = 12;
              if (var24 == 0) {
                break L4;
              }
            }
            boolean decompiledFrameRemainder5 = true;
            var15 = param0.field_Bb;
            if (var15 != 0 &&
              var15 != 1 &&
              var15 != 2) {
              boolean decompiledFrameRemainder4 = true;
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder1 = true;
              if ((3 != var15) &&
                (decompiledFrameRemainder1 = (var15 != 4 ||
                var24 != 0)) &&
                (decompiledFrameRemainder5 = (var15 != 5 ||
                var24 != 0)) &&
                (decompiledFrameRemainder2 = (6 != var15)) &&
                (decompiledFrameRemainder5 = (var15 != 7 ||
                var24 != 0)) &&
                (decompiledFrameRemainder3 = (var15 != 8 ||
                var24 != 0)) &&
                (decompiledFrameRemainder5 = (9 != var15 ||
                var24 != 0)) &&
                (decompiledFrameRemainder4 = (var15 != 10)) &&
                (decompiledFrameRemainder5 = (11 != var15 ||
                var24 != 0)) &&
                (decompiledFrameRemainder5 = (12 != var15 ||
                var24 != 0)) &&
                (decompiledFrameRemainder5 = (var15 == 13))) {
                decompiledFrameRemainder5 = (var24 != 0);
              }
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                if (qc.field_c < 4) {
                  var6 = -qc.field_c + 4;
                }
                var2_int = qc.field_c + 6;
                decompiledFrameRemainder5 = (var24 != 0);
              }
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2)) {
                if (4 > qc.field_c) {
                  var6 = 4 - qc.field_c;
                }
                var2_int = 8 + qc.field_c;
                decompiledFrameRemainder5 = (var24 != 0);
              }
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3)) {
                var2_int = qc.field_c + 10;
                decompiledFrameRemainder5 = (var24 != 0);
              }
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4)) {
                var2_int = 12 + qc.field_c;
                decompiledFrameRemainder5 = (var24 != 0);
              }
              if (decompiledFrameRemainder5) {
                var2_int = 14 + qc.field_c;
              }
            }
            this.field_i = 2;
            if (mb.b(0, 109)) {
              var7 = 88;
              var6 = 0;
              var2_int = 0;
            }
            this.field_J = true;
          }
          var16 = 0;
          this.field_u = false;
          ak.field_q = 0;
          var15 = 0;
          L57: while (true) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            L60: {
              if (var15 < 12) {
                stackIn_306_0 = param0.field_nb[var15];
                if (var24 != 0) {
                  while (true) {
                    if (stackIn_306_0 != null) {
                      this.field_C[var15].field_F = var15 / 3 % 2 + (2 * (var15 % 3) + (this.field_h.field_b - 9));
                      this.field_C[var15].field_H = this.field_h.field_e - 8 + var15 / 3;
                      this.field_C[var15].field_E = 0;
                      this.field_C[var15].field_U = 5;
                      var17_ref_dl = this.field_h.a(-121, this.field_C[var15].field_H, this.field_C[var15].field_E, this.field_C[var15].field_F);
                      var17_ref_dl.field_h = this.field_C[var15];
                      this.field_C[var15].field_c = var17_ref_dl;
                      this.field_q = this.field_C[var15];
                      lg.field_c = (this.field_q.field_F + this.field_q.field_H) * 16;
                      eg.field_p = this.field_q.field_E;
                      sj.field_b = (this.field_q.field_F - this.field_q.field_H) * 32;
                    }
                    while (true) {
                      var15++;
                      break L60;
                    }
                  }
                }
                if (stackIn_306_0 != null) {
                  this.field_C[ak.field_q] = new r(param0.field_nb[var15]);
                  ak.field_q = ak.field_q + 1;
                }
                var15++;
                if (var24 == 0) {
                  continue;
                }
              }
              this.field_h = new dk(this);
              if (param0.field_Bb == 0) {
                var15 = 0;
                this.field_C[var15].field_F = 3;
                this.field_C[var15].field_H = 4;
                this.field_C[var15].field_E = 0;
                this.field_C[var15].field_U = 2;
                var17_ref_dl = this.field_h.a(120, this.field_C[var15].field_H, this.field_C[var15].field_E, this.field_C[var15].field_F);
                var17_ref_dl.field_h = this.field_C[var15];
                this.field_C[var15].field_c = var17_ref_dl;
                this.field_q = this.field_C[var15];
                this.field_u = true;
                this.field_C[1] = null;
                this.field_C[2] = null;
                eg.field_p = this.field_q.field_E;
                this.field_C[3] = null;
                lg.field_c = (this.field_q.field_F + this.field_q.field_H) * 16;
                sj.field_b = (this.field_q.field_F - this.field_q.field_H) * 32;
              }
              boolean decompiledFrameCompleted1 = true;
              if (param0.field_Bb == 1) {
                var15 = 0;
                while (var15 < 12) {
                  if (var24 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (null != this.field_C[var15] &&
                    null != this.field_C[var15].field_Z) {
                    if (0 == var15) {
                      this.field_C[var15].field_F = 42;
                      this.field_C[var15].field_H = 31;
                    }
                    if (var15 == 1) {
                      this.field_C[var15].field_F = 41;
                      this.field_C[var15].field_H = 30;
                    }
                    if (var15 == 2) {
                      this.field_C[var15].field_F = 41;
                      this.field_C[var15].field_H = 28;
                    }
                    if (var15 == 3) {
                      this.field_C[var15].field_F = 42;
                      this.field_C[var15].field_H = 27;
                    }
                    if (var15 == 4) {
                      this.field_C[var15].field_F = 44;
                      this.field_C[var15].field_H = 31;
                    }
                    if (var15 == 5) {
                      this.field_C[var15].field_F = 45;
                      this.field_C[var15].field_H = 30;
                    }
                    if (6 == var15) {
                      this.field_C[var15].field_F = 45;
                      this.field_C[var15].field_H = 28;
                    }
                    if (var15 == 7) {
                      this.field_C[var15].field_F = 44;
                      this.field_C[var15].field_H = 27;
                    }
                    this.field_C[var15].field_U = 6;
                    this.field_C[var15].field_E = 0;
                    var17_ref_dl = this.field_h.a(-75, this.field_C[var15].field_H, this.field_C[var15].field_E, this.field_C[var15].field_F);
                    var17_ref_dl.field_h = this.field_C[var15];
                    var17_ref_dl.field_j = -1;
                    var17_ref_dl.field_v = 0;
                    this.field_C[var15].field_c = var17_ref_dl;
                    this.field_q = this.field_C[var15];
                    eg.field_p = this.field_q.field_E;
                    lg.field_c = (this.field_q.field_F + this.field_q.field_H) * 16;
                    sj.field_b = (-this.field_q.field_H + this.field_q.field_F) * 32;
                  }
                  var15++;
                }
                if (decompiledFrameCompleted1) {
                  this.field_u = true;
                }
              }
              decompiledFrameRemainder0 = !(param0.field_db);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = ((param0.field_Bb == 8 &&
                param0.field_vb == 1) ||
                (param0.field_Bb == 10 &&
                param0.field_vb == 2) ||
                (param0.field_Bb == 12 ||
                13 == param0.field_Bb)))) {
                var15 = 0;
                while (12 > var15) {
                  stackIn_336_0 = this.field_C[var15];
                  if (var24 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_336_0 != null) {
                    stackIn_306_0 = this.field_C[var15].field_Z;
                    if (stackIn_306_0 != null) {
                      this.field_C[var15].field_F = var15 / 3 % 2 + (2 * (var15 % 3) + (this.field_h.field_b - 9));
                      this.field_C[var15].field_H = this.field_h.field_e - 8 + var15 / 3;
                      this.field_C[var15].field_E = 0;
                      this.field_C[var15].field_U = 5;
                      var17_ref_dl = this.field_h.a(-121, this.field_C[var15].field_H, this.field_C[var15].field_E, this.field_C[var15].field_F);
                      var17_ref_dl.field_h = this.field_C[var15];
                      this.field_C[var15].field_c = var17_ref_dl;
                      this.field_q = this.field_C[var15];
                      lg.field_c = (this.field_q.field_F + this.field_q.field_H) * 16;
                      eg.field_p = this.field_q.field_E;
                      sj.field_b = (this.field_q.field_F - this.field_q.field_H) * 32;
                    }
                  }
                  var15++;
                }
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              this.field_u = true;
            }
            if (decompiledFrameCompleted0) {
              var16 = ak.field_q;
              var15 = 0;
              while (true) {
                if (var15 < var6) {
                  this.field_C[var16] = new r(7, param0.field_Bb);
                  stackIn_333_0 = ~param0.field_Bb;
                  stackIn_333_1 = -2;
                  if (var24 == 0) {
                    if (stackIn_333_0 == stackIn_333_1) {
                      if (var15 == 0) {
                        this.field_C[var16].field_F = 28;
                        this.field_C[var16].field_H = 37;
                        this.field_C[var16].field_U = 6;
                      }
                      if (1 == var15) {
                        this.field_C[var16].field_F = 42;
                        this.field_C[var16].field_H = 43;
                        this.field_C[var16].field_U = 4;
                      }
                      if (2 == var15) {
                        this.field_C[var16].field_F = 34;
                        this.field_C[var16].field_H = 19;
                        this.field_C[var16].field_U = 2;
                      }
                      if (var15 == 3) {
                        this.field_C[var16].field_F = 27;
                        this.field_C[var16].field_H = 21;
                        this.field_C[var16].field_U = 4;
                      }
                      this.field_C[var16].field_E = 0;
                      var17_ref_dl = this.field_h.a(-49, this.field_C[var16].field_H, this.field_C[var16].field_E, this.field_C[var16].field_F);
                      var17_ref_dl.field_h = this.field_C[var16];
                      this.field_C[var16].field_c = var17_ref_dl;
                    }
                    var16++;
                    ak.field_q = ak.field_q + 1;
                    var15++;
                    continue;
                  }
                } else {
                  stackIn_333_0 = -12;
                  stackIn_333_1 = ~param0.field_Bb;
                }
                break;
              }
              if (stackIn_333_0 != stackIn_333_1) {
                break L57;
              }
              stackIn_336_0 = this.field_C[0];
            }
            stackIn_336_0.field_s = true;
            break;
          }
          if (12 == param0.field_Bb) {
            this.field_C[0].field_s = true;
          }
          if (param0.field_Bb == 13) {
            this.field_C[0].field_s = true;
          }
          var15 = 0;
          do {
            if (var2_int <= var15) {
              var15 = 0;
              break;
            }
            this.field_C[var16] = new r(0, param0.field_Bb);
            var16++;
            var15++;
          } while (var24 == 0);
          do {
            if (var15 >= var3) {
              var15 = 0;
              break;
            }
            this.field_C[var16] = new r(1, param0.field_Bb);
            var16++;
            var15++;
          } while (var24 == 0);
          do {
            if (var12 <= var15) {
              var15 = 0;
              break;
            }
            this.field_C[var16] = new r(2, param0.field_Bb);
            var16++;
            var15++;
          } while (var24 == 0);
          do {
            if (var15 >= var13) {
              var15 = 0;
              break;
            }
            this.field_C[var16] = new r(3, param0.field_Bb);
            var16++;
            var15++;
          } while (var24 == 0);
          do {
            if (var15 >= var5) {
              var15 = 0;
              break;
            }
            this.field_C[var16] = new r(4, param0.field_Bb);
            var16++;
            var15++;
          } while (var24 == 0);
          do {
            if (var15 >= var14) {
              var15 = 0;
              break;
            }
            this.field_C[var16] = new r(5, param0.field_Bb);
            var16++;
            var15++;
          } while (var24 == 0);
          do {
            if (var4 <= var15) {
              var15 = 0;
              break;
            }
            this.field_C[var16] = new r(6, param0.field_Bb);
            var16++;
            var15++;
          } while (var24 == 0);
          do {
            if (var7 <= var15) {
              var15 = var16 - 1;
              break;
            }
            this.field_C[var16] = new r(9, param0.field_Bb);
            var16++;
            var15++;
          } while (var24 == 0);
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (!(var15 >= ak.field_q)))) {
            stackIn_455_0 = ~this.field_C[var15].field_t;
            if (var24 == 0) {
              if (stackIn_455_0 != -5 &&
                this.field_C[var15].field_t != 6) {
                if (var10 <= 0) {
                  if (var9 <= 0) {
                    if (0 < var8) {
                      var8--;
                      this.field_C[var15].field_z = 2;
                    }
                  } else {
                    this.field_C[var15].field_z = 3;
                    var9--;
                  }
                } else {
                  this.field_C[var15].field_z = 4;
                  var10--;
                }
                if (param0.field_Bb == 3 &&
                  this.field_C[var15].field_t == 1 &&
                  param0.field_ub == 2) {
                  this.field_C[var15].field_z = 2;
                }
                if (param0.field_Bb == 3 &&
                  this.field_C[var15].field_t == 1 &&
                  param0.field_ub == 1) {
                  this.field_C[var15].field_z = 1;
                }
              }
              var15--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_455_0 = 0;
          }
          var17 = stackIn_455_0;
          var15 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var15 >= this.field_C.length))) {
            stackIn_767_0 = null;
            if (var24 == 0) {
              if (stackIn_767_0 != this.field_C[var15] &&
                this.field_C[var15].field_Z == null &&
                this.field_C[var15].field_c == null) {
                var17 = 0;
                if (0 == param0.field_Bb) {
                  var17 = 2;
                }
                if (param0.field_Bb == 1 &&
                  this.field_C[var15].field_t == 0) {
                  var17 = 1;
                }
                if (param0.field_Bb == 11) {
                  var17 = 1;
                }
                if (this.field_C[var15].field_z == 0 &&
                  var11 > 0) {
                  var11--;
                  var17 = 1;
                }
                if (this.field_C[var15].field_t == 9) {
                  var17 = 1;
                }
                if (0 == var17) {
                  if (0 == this.field_C[var15].field_C) {
                    this.field_C[var15].field_z = 0;
                  }
                  if (this.field_C[var15].field_z == 0 &&
                    this.field_C[var15].field_t > 0 &&
                    this.field_C[var15].field_C == 1 && (param0.field_Bb == 4 ||
                    6 == param0.field_Bb ||
                    param0.field_Bb == 8 ||
                    param0.field_Bb == 10) && 50.0 > Math.random() * 100.0) {
                    this.field_C[var15].field_z = 1;
                  }
                  this.field_C[var15].field_U = (int)(8.0 * Math.random());
                  var23 = 0;
                  while (true) {
                    var18 = (int)(Math.random() * (double)this.field_h.field_b / 2.0) + this.field_h.field_b / 4;
                    var23++;
                    var19 = (int)(Math.random() * (double)this.field_h.field_e / 2.0) + this.field_h.field_e / 4;
                    if (this.field_C[var15].field_t >= 1 &&
                      6 >= this.field_C[var15].field_t) {
                      var18 = 2 + (int)(Math.random() * (double)(-4 + this.field_h.field_b));
                      var19 = (int)(Math.random() * (double)(-4 + this.field_h.field_e)) + 2;
                    }
                    if (9 == param0.field_Bb) {
                      var18 = 2 + (int)(Math.random() * (double)(-4 + this.field_h.field_b));
                      var19 = (int)(Math.random() * (double)(this.field_h.field_e - 4)) + 2;
                    }
                    var20 = 0;
                    stackIn_528_0 = this.field_C[var15];
                    if (stackIn_528_0.field_t != 0 &&
                      this.field_C[var15].field_t != 7 &&
                      9 != this.field_C[var15].field_t) {
                      var21 = this.field_h.a(-118, var19, var20, var18);
                      if (var21.field_C != null &&
                        this.field_C[var15].field_z >= 2) {
                        var20++;
                        var21 = this.field_h.a(-51, var19, var20, var18);
                      }
                      if (null != var21.field_C &&
                        3 <= this.field_C[var15].field_z) {
                        var20++;
                        var21 = this.field_h.a(-48, var19, var20, var18);
                      }
                      if (var21.field_C != null &&
                        this.field_C[var15].field_z == 4) {
                        var20++;
                        var21 = this.field_h.a(102, var19, var20, var18);
                      }
                      if (null != var21.field_C &&
                        this.field_C[var15].field_z == 4) {
                        var20++;
                        var21 = this.field_h.a(-63, var19, var20, var18);
                      }
                      stackIn_563_0 = (this.field_h.a(var18, false, var20, var19)) ? 0 : 1;
                      var22 = stackIn_563_0;
                      if ((this.field_C[var15].field_z - 1) > var21.field_r) {
                        var22 = 0;
                      }
                      if (4 != var21.field_b &&
                        var21.field_b != 14) {
                        var22 = 0;
                      }
                    } else {
                      var21 = this.field_h.a(124, var19, var20, var18);
                      if (var21.field_C != null &&
                        this.field_C[var15].field_z >= 2) {
                        var20++;
                        var21 = this.field_h.a(-32, var19, var20, var18);
                      }
                      if (var21.field_C != null &&
                        this.field_C[var15].field_z >= 3) {
                        var20++;
                        var21 = this.field_h.a(114, var19, var20, var18);
                      }
                      if (null != var21.field_C &&
                        this.field_C[var15].field_z == 4) {
                        var20++;
                        var21 = this.field_h.a(-36, var19, var20, var18);
                      }
                      if (null != var21.field_C &&
                        this.field_C[var15].field_z == 4) {
                        var20++;
                        var21 = this.field_h.a(-111, var19, var20, var18);
                      }
                      if (var23 > 1000 &&
                        this.field_C[var15].field_z == 4) {
                        this.field_C[var15].field_z = 3;
                      }
                      if (1250 < var23 &&
                        this.field_C[var15].field_z == 3) {
                        this.field_C[var15].field_z = 2;
                      }
                      if (var23 > 1500 &&
                        2 == this.field_C[var15].field_z) {
                        this.field_C[var15].field_z = 0;
                      }
                      if (var21.field_C != null &&
                        param0.field_db &&
                        Math.random() * 100.0 < 75.0) {
                        var20++;
                        var21 = this.field_h.a(88, var19, var20, var18);
                      }
                      if (var21.field_C != null &&
                        param0.field_db &&
                        75.0 > Math.random() * 100.0) {
                        var20++;
                        var21 = this.field_h.a(124, var19, var20, var18);
                      }
                      stackIn_639_0 = (this.field_h.a(var18, false, var20, var19)) ? 0 : 1;
                      var22 = stackIn_639_0;
                      if (param0.field_db &&
                        6 == var21.field_b) {
                        var22 = 0;
                      }
                      if (param0.field_db &&
                        12 == var21.field_b) {
                        var22 = 0;
                      }
                      if (1 < param0.field_Bb &&
                        var21.field_b == 0) {
                        var22 = 0;
                      }
                      if ((-1 + this.field_C[var15].field_z) > var21.field_r &&
                        this.field_C[var15].field_z < 4) {
                        var22 = 0;
                      }
                      if (this.field_C[var15].field_z > var21.field_r &&
                        this.field_C[var15].field_z == 4) {
                        var22 = 0;
                      }
                      if (var21.field_b == 3) {
                        var22 = 0;
                      }
                      if (var21.field_b == 5) {
                        var22 = 0;
                      }
                      if (8 == var21.field_b) {
                        var22 = 0;
                      }
                      if (-1 == var21.field_b) {
                        var22 = 0;
                      }
                    }
                    if (var22 == 0) {
                      continue;
                    }
                    this.field_C[var15].field_F = var18;
                    this.field_C[var15].field_H = var19;
                    this.field_C[var15].field_E = var20;
                    var21 = this.field_h.a(-119, var19, var20, var18);
                    var21.field_h = this.field_C[var15];
                    stackIn_528_0 = this.field_C[var15];
                    stackIn_528_0.field_c = var21;
                    break;
                  }
                }
                if (1 == var17) {
                  this.field_C[var15].field_U = (int)(8.0 * Math.random());
                  this.field_C[var15].field_z = 0;
                  L171: while (true) {
                    var20 = (int)(Math.random() * 4.0);
                    var18 = (int)(Math.random() * (double)(-6 + this.field_h.field_b)) + 3;
                    var19 = 3 + (int)(Math.random() * (double)(-6 + this.field_h.field_e));
                    if (param0.field_Bb == 1) {
                      var20 = 0;
                    }
                    if (0 == var20) {
                      var18 = (int)(Math.random() * 3.0 + 2.0);
                    }
                    if (1 != var20) {
                      while (true) {
                        if (var20 == 2) {
                          var19 = (int)(2.0 + Math.random() * 3.0);
                        }
                        if (3 == var20) {
                          var19 = this.field_h.field_e - (int)(3.0 * Math.random() + 2.0);
                        }
                        if (this.field_h.a(var18, false, 0, var19)) {
                          continue L171;
                        }
                        this.field_C[var15].field_F = var18;
                        this.field_C[var15].field_H = var19;
                        this.field_h.field_f[var18][var19].field_h = this.field_C[var15];
                        break L171;
                      }
                    }
                    while (true) {
                      var18 = this.field_h.field_b - (int)(3.0 * Math.random() + 2.0);
                      if (var20 == 2) {
                        var19 = (int)(2.0 + Math.random() * 3.0);
                      }
                      if (3 == var20) {
                        var19 = this.field_h.field_e - (int)(3.0 * Math.random() + 2.0);
                      }
                      if (this.field_h.a(var18, false, 0, var19)) {
                        continue L171;
                      }
                      this.field_C[var15].field_F = var18;
                      this.field_C[var15].field_H = var19;
                      this.field_h.field_f[var18][var19].field_h = this.field_C[var15];
                      break;
                    }
                    break;
                  }
                  this.field_C[var15].field_c = this.field_h.field_f[var18][var19];
                }
                if (2 == var17) {
                  var18 = 0;
                  var19 = 0;
                  var20 = 0;
                  if (~var15 == ~(0 + ak.field_q)) {
                    var19 = 16;
                    var20 = 0;
                    this.field_C[var15].field_nb = new oh(2);
                    var18 = 20;
                  }
                  if (ak.field_q + 1 == var15) {
                    this.field_C[var15].field_nb = new oh(2);
                    var19 = 20;
                    var18 = 19;
                    var20 = 0;
                  }
                  if (ak.field_q + 2 == var15) {
                    var20 = 0;
                    var18 = 26;
                    var19 = 21;
                    this.field_C[var15].field_nb = new oh(1);
                  }
                  if (~(ak.field_q + 3) == ~var15) {
                    var20 = 0;
                    var18 = 27;
                    this.field_C[var15].field_nb = new oh(1);
                    var19 = 18;
                  }
                  if (4 + ak.field_q == var15) {
                    var20 = 0;
                    var19 = 30;
                    this.field_C[var15].field_nb = new oh(0);
                    var18 = 28;
                  }
                  if (var15 == ak.field_q + 5) {
                    this.field_C[var15].field_nb = new oh(1);
                    var19 = 33;
                    var20 = 0;
                    var18 = 27;
                  }
                  if (var15 == ak.field_q + 6) {
                    var19 = 31;
                    this.field_C[var15].field_nb = new oh(1);
                    var20 = 0;
                    var18 = 29;
                  }
                  if (~(7 + ak.field_q) == ~var15) {
                    this.field_C[var15].field_nb = new oh(3);
                    var20 = 0;
                    var18 = 25;
                    var19 = 5;
                  }
                  if (var15 == ak.field_q + 8) {
                    var18 = 26;
                    var19 = 5;
                    this.field_C[var15].field_nb = new oh(1);
                    var20 = 0;
                  }
                  if (~var15 == ~(ak.field_q + 9)) {
                    this.field_C[var15].field_nb = new oh(3);
                    var20 = 0;
                    var18 = 27;
                    var19 = 5;
                  }
                  if (~var15 == ~(10 + ak.field_q)) {
                    var19 = 37;
                    var20 = 0;
                    var18 = 2;
                    this.field_C[var15].field_nb = new oh(2);
                  }
                  if (var15 == ak.field_q + 11) {
                    this.field_C[var15].field_nb = new oh(2);
                    var18 = 3;
                    var20 = 0;
                    var19 = 38;
                  }
                  if (~var15 == ~(ak.field_q + 12)) {
                    var18 = 29;
                    var19 = 2;
                    var20 = 0;
                    this.field_C[var15].field_nb = new oh(2);
                  }
                  if (13 + ak.field_q == var15) {
                    var20 = 0;
                    var18 = 29;
                    this.field_C[var15].field_nb = new oh(2);
                    var19 = 1;
                  }
                  this.field_C[var15].field_F = var18;
                  this.field_C[var15].field_H = var19;
                  this.field_C[var15].field_E = var20;
                  var21 = this.field_h.a(-125, var19, var20, var18);
                  var21.field_h = this.field_C[var15];
                  this.field_C[var15].field_c = var21;
                  this.field_C[var15].field_U = 6;
                }
              }
              var15++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_d = 0;
            if (this.field_J) {
              this.field_d = 1;
            }
            if (this.field_u) {
              this.c((byte) -116);
            }
            if (le.field_q == null) {
              return;
            }
            if (fa.field_a <= 0) {
              return;
            }
            le.field_q.c((byte) 51);
            this.field_B = -1;
            stackIn_767_0 = null;
          }
          le.field_q = (ad) (stackIn_767_0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_772_0 = var2;
          stackIn_772_1 = new StringBuilder().append("e.<init>(");
          if (param0 == null) {
            stackIn_773_2 = "null";
          } else {
            stackIn_773_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_772_0), ((StringBuilder) (Object) stackIn_772_1).append(stackIn_773_2).append(')').toString());
        }
    }

    static {
        field_t = new int[4];
        field_o = null;
        field_l = new rh(13, 0, 1, 0);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }

    private static int $cfr$dcmpl(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }
}
