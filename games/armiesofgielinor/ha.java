/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha {
    int field_db;
    int field_O;
    private int[] field_M;
    int[] field_zb;
    int field_ib;
    static String field_nb;
    int[][] field_a;
    private int field_Db;
    boolean field_X;
    private int field_ab;
    boolean field_kb;
    private int[] field_yb;
    boolean field_eb;
    float field_bb;
    int field_R;
    int[] field_h;
    int field_D;
    int field_gb;
    om field_K;
    int field_Q;
    int[] field_m;
    ln[] field_T;
    private boolean field_Fb;
    static String field_q;
    at field_l;
    go[] field_w;
    private int field_A;
    boolean field_L;
    int[] field_H;
    int field_xb;
    int[] field_fb;
    int field_e;
    private int[] field_Y;
    int field_Gb;
    boolean field_qb;
    boolean field_Cb;
    private int[] field_N;
    ne[] field_Eb;
    at field_k;
    vh field_Z;
    int[] field_S;
    boolean field_Ab;
    int field_cb;
    int field_hb;
    int field_W;
    int field_tb;
    at[] field_t;
    private int[] field_d;
    int field_C;
    int field_sb;
    private int[] field_n;
    int field_i;
    boolean field_o;
    int[] field_ub;
    boolean field_J;
    int field_u;
    boolean field_x;
    private int[] field_g;
    private int[] field_U;
    int[] field_rb;
    boolean field_b;
    int[] field_G;
    int[] field_p;
    String[] field_lb;
    boolean field_V;
    int field_v;
    boolean field_wb;
    int[][] field_z;
    int[][] field_B;
    boolean field_Bb;
    boolean field_f;
    ul field_j;
    private int field_I;
    int[][] field_c;
    private tt field_P;
    private int field_vb;
    int[][] field_E;
    int field_jb;
    int[] field_s;
    int[] field_ob;
    private int[] field_y;
    static String field_pb;
    boolean field_r;
    int[] field_mb;
    boolean field_F;

    final go d(int param0, int param1) {
        if (~param0 > param1) {
          return null;
        }
        if (param0 > this.field_yb.length) {
          return null;
        }
        return this.field_w[this.field_yb[param0]];
    }

    final void a(int param0, jd param1) {
        RuntimeException runtimeException = null;
        tc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (this.field_t.length <= param1.field_O) {
            return;
          }
          this.field_t[param1.field_O].a((byte) -119, (tc) (param1));
          if (param0 != 8288) {
            this.l(-73, -26);
          }
          var3 = this.field_k.e((byte) 96);
          while (var3 != null) {
            if (var4 != 0) {
              return;
            }
            if (var3 instanceof mm) {
              ((mm) ((Object) var3)).a(param1, (byte) -2);
            }
            var3 = this.field_k.a((byte) 123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ha.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(jd param0, int param1) {
        int var3_int = 0;
        try {
          if (param1 >= -87) {
            this.field_cb = -63;
          }
          if (param0 != null) {
            var3_int = this.b(31, param0.field_w, param0.field_J, param0.field_O);
            param0.field_v = (16 & var3_int) != 0 ? true : false;
            param0.field_Z = (4 & var3_int) != 0 ? true : false;
            param0.field_eb = (var3_int & 8) != 0 ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ha.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, jd param4, boolean param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -16) {
            this.field_w = (go[]) null;
          }
          stackIn_3_0 = pj.a(this.field_v, this.field_Eb, param5, param2, param3, this.field_db, this.o(param3, param1 ^ 15), param4, param0, false, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ha.VD(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(int param0, byte[] param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length >= 6) {
            var3_int = param0 * 12 + 6;
            stackIn_8_0 = ((128 & param1[var3_int]) == 0) ? 0 : 1;
            var5 = stackIn_8_0;
            if (var5 != 0) {
              var3_int++;
              var3_int++;
              var4 = param1[var3_int] & 255;
            }
            if (var5 == 0 ||
              ArmiesOfGielinor.field_M) {
              var3_int++;
              var4 = 255 & param1[var3_int];
            }
            if (param2) {
              field_nb = (String) null;
            }
            stackIn_14_0 = var4 / param0 + 1;
            return stackIn_14_0;
          }
          stackIn_4_0 = 0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ha.GC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(byte param0, int param1, int param2, int param3) {
        this.field_Eb[param2 + param3 * this.field_v].field_h = param1;
        this.field_Eb[param3 * this.field_v + param2].field_b = true;
        int var5 = 96 % ((59 - param0) / 34);
    }

    final at a(boolean param0, boolean param1, int param2) {
        boolean stackIn_36_0 = false;
        boolean stackIn_60_0 = false;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        Object var4 = null;
        jd var5_ref_jd = null;
        int var5 = 0;
        int var6_int = 0;
        jd var6 = null;
        ne var7 = null;
        int var8 = 0;
        jd var5_ref_jdLifetime1;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = null;
        if (this.field_b) {
          var4 = new at();
        }
        this.g((byte) -15);
        if (param0) {
          return (at) (var4);
        }
        var5_ref_jd = (jd) (this.field_t[this.field_gb].e((byte) 116));
        if (param2 != 0) {
          this.field_o = false;
        }
        L3: while (true) {
          boolean decompiledFrameCompleted0 = true;
          if (var5_ref_jd != null) {
            stackIn_36_0 = var5_ref_jd.i(-21428);
            if (var8 == 0) {
              if (stackIn_36_0 &&
                !var5_ref_jd.t(param2 + 26440)) {
                var6_int = var5_ref_jd.field_J + var5_ref_jd.field_w * this.field_v;
                if (var5_ref_jd.field_J >= 0 &&
                  this.field_Eb.length > var5_ref_jd.field_J &&
                  var5_ref_jd.field_w >= 0 &&
                  var5_ref_jd.field_w < this.field_Eb.length) {
                  var7 = this.field_Eb[var6_int];
                  if (var7.a(false) && (!(var7.field_a >= 0) ||
                    !this.c(var7.field_a, -16985, this.field_gb))) {
                    var7.field_m = var7.field_m - var5_ref_jd.g((byte) 122);
                    if (var7.field_m <= 0 &&
                      this.field_b) {
                      if (!param1) {
                        this.field_l.a((byte) -119, (tc) (new qq(0, var5_ref_jd.field_J, var5_ref_jd.field_w, var5_ref_jd.field_O)));
                      } else {
                        ((at) (var4)).a((byte) -119, (tc) (new ss(var5_ref_jd.field_J, var5_ref_jd.field_w, 0, this.field_gb)));
                      }
                    }
                  }
                }
              }
              var5_ref_jd = (jd) (this.field_t[this.field_gb].a((byte) 123));
              continue;
            }
          } else {
            var5_ref_jd = (jd) (this.field_t[this.field_gb].e((byte) 102));
            while (var5_ref_jd != null) {
              var5_ref_jd.n((byte) -42);
              var5_ref_jd = (jd) (this.field_t[this.field_gb].a((byte) 123));
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_36_0 = param1;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (!stackIn_36_0)) {
            break L3;
          }
          this.h((byte) 108);
          break;
        }
        var5_ref_jdLifetime1 = (jd) (this.field_t[this.field_gb].d((byte) -81));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var5_ref_jdLifetime1 == null))) {
          stackIn_60_0 = var5_ref_jdLifetime1.field_S;
          if (var8 == 0) {
            if (!stackIn_60_0) {
              if (param1) {
                if (var5_ref_jdLifetime1.t(26440)) {
                  ((at) (var4)).a((byte) -119, (tc) (new il(var5_ref_jdLifetime1.field_J, var5_ref_jdLifetime1.field_w, var5_ref_jdLifetime1, this.field_Eb[var5_ref_jdLifetime1.field_w * this.field_v + var5_ref_jdLifetime1.field_J])));
                }
                if (var5_ref_jdLifetime1.e((byte) 79) &&
                  this.field_H[var5_ref_jdLifetime1.field_O] < 10) {
                  ((at) (var4)).a((byte) -119, (tc) (new pl(var5_ref_jdLifetime1.field_O, var5_ref_jdLifetime1, 0)));
                }
                if (var5_ref_jdLifetime1.field_N == 10 &&
                  this.field_Eb[var5_ref_jdLifetime1.field_J + var5_ref_jdLifetime1.field_w * this.field_v].c(93) &&
                  var5_ref_jdLifetime1.field_t == 19) {
                  ((at) (var4)).a((byte) -119, (tc) (new dk(var5_ref_jdLifetime1.field_O, this.field_W)));
                }
              }
              var5_ref_jdLifetime1.k(-1);
              if (param1) {
                this.h((byte) 108);
                this.d(this.field_gb, this.field_t[this.field_gb].b(false), 91, 13);
                this.d(this.field_gb, this.field_ob[this.field_gb], param2 ^ 82, 12);
              }
            }
            var5_ref_jdLifetime1 = (jd) (this.field_t[this.field_gb].b((byte) 100));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_60_0 = param1;
        }
        if (stackIn_60_0) {
          var5 = 0;
          var6 = (jd) (this.field_t[this.field_gb].e((byte) 102));
          while (true) {
            if (var6 != null) {
              stackIn_69_0 = ~var6.field_N;
              stackIn_69_1 = -21;
              if (var8 == 0) {
                if (stackIn_69_0 == stackIn_69_1) {
                  var5++;
                }
                var6 = (jd) (this.field_t[this.field_gb].a((byte) 123));
                continue;
              }
            } else {
              stackIn_69_0 = ~var5;
              stackIn_69_1 = -26;
            }
            if (stackIn_69_0 > stackIn_69_1) {
              break;
            }
            ((at) (var4)).a((byte) -119, (tc) (new kj(this.field_gb, this.field_W)));
            break;
          }
        }
        return (at) (var4);
    }

    final void b(int param0, int param1, boolean param2) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        Object stackIn_65_0 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        int var9 = 0;
        int[] var10 = null;
        jd var11 = null;
        jd var12 = null;
        Object stackIn_65_0Lifetime1;
        int stackIn_18_0Lifetime1;
        int stackIn_18_1Lifetime1;
        int stackIn_36_0Lifetime1;
        int stackIn_36_1Lifetime1;
        int var7Lifetime1;
        int var5Lifetime1;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_e = this.field_e | 1 << param1;
        var4 = 0;
        while (true) {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameRemainder1 = true;
          if (var4 < this.field_W) {
            stackIn_61_0 = this.field_n[var4];
            stackIn_61_1 = param1;
            decompiledFrameRemainder0 = (var9 == 0);
            if ((decompiledFrameRemainder0) && (stackIn_61_0 != stackIn_61_1 ||
              var9 != 0)) {
              if (this.field_n[var4] < 0) {
                this.field_n[var4] = param1;
                if (this.field_wb) {
                  var5 = 0;
                  var6 = 0;
                  while (var6 < this.field_W) {
                    stackIn_18_0 = ~param1;
                    stackIn_18_1 = ~var6;
                    if (stackIn_18_0 != stackIn_18_1 &&
                      this.c(var6, -16985, param1) &&
                      0 == (this.field_e & 1 << var6)) {
                      var5++;
                    }
                    var6++;
                  }
                  stackIn_18_0Lifetime1 = ~var5;
                  stackIn_18_1Lifetime1 = -1;
                  boolean decompiledFrameCompleted0 = true;
                  if (stackIn_18_0Lifetime1 < stackIn_18_1Lifetime1 &&
                    !param2) {
                    var10 = new int[var5];
                    var5 = 0;
                    var7 = 0;
                    while (this.field_W > var7) {
                      stackIn_36_0 = ~var7;
                      stackIn_36_1 = ~param1;
                      if (stackIn_36_0 != stackIn_36_1 &&
                        this.c(var7, param0 - 26986, param1) &&
                        (1 << var7 & this.field_e) == 0) {
                        var10[var5] = var7;
                        var5++;
                      }
                      var7++;
                    }
                    var5 = 0;
                    var7Lifetime1 = 0;
                    while (true) {
                      stackIn_36_0Lifetime1 = ~this.field_Eb.length;
                      stackIn_36_1Lifetime1 = ~var7Lifetime1;
                      if (stackIn_36_0Lifetime1 >= stackIn_36_1Lifetime1) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      var8 = this.field_Eb[var7Lifetime1].field_c;
                      stackIn_65_0 = null;
                      if (stackIn_65_0 != var8 &&
                        param1 == var8.field_O) {
                        this.field_l.a((byte) -119, (tc) (new as(var8, var10[var5 % var10.length], false)));
                        var5++;
                      }
                      var7Lifetime1++;
                    }
                  }
                  if (decompiledFrameCompleted0) {
                    var11 = (jd) (this.field_t[param1].e((byte) 87));
                    while (var11 != null) {
                      this.field_l.a((byte) -119, (tc) (new hp(var11, true)));
                      var11 = (jd) (this.field_t[param1].a((byte) 123));
                    }
                  }
                } else {
                  var5Lifetime1 = 0;
                  while (this.field_db * this.field_v > var5Lifetime1) {
                    stackIn_61_0 = param1;
                    stackIn_61_1 = this.field_Eb[var5Lifetime1].field_a;
                    if (stackIn_61_0 == stackIn_61_1) {
                      this.field_Eb[var5Lifetime1].field_a = -1;
                      if (11 == this.field_Eb[var5Lifetime1].field_h) {
                        this.field_Eb[var5Lifetime1].field_h = 0;
                      }
                    }
                    var5Lifetime1++;
                  }
                  if ((null != this.field_K)) {
                    var12 = (jd) (this.field_t[param1].e((byte) 87));
                    while (var12 != null) {
                      this.field_l.a((byte) -119, (tc) (new hp(var12, true)));
                      var12 = (jd) (this.field_t[param1].a((byte) 123));
                    }
                  }
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                var4++;
                continue;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_61_0 = param0;
            stackIn_61_1 = 10001;
          }
          if (stackIn_61_0 != stackIn_61_1) {
            return;
          }
          if (!this.e((byte) -42)) {
            stackIn_65_0Lifetime1 = null;
            if (stackIn_65_0Lifetime1 == this.field_K) {
              return;
            }
            if (~this.field_K.field_w != ~param1) {
              return;
            }
          }
          break;
        }
        if (this.field_b) {
          this.field_qb = true;
        }
        return;
    }

    final at b(boolean param0, boolean param1, int param2) {
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        boolean stackIn_49_1 = false;
        at stackIn_50_0 = null;
        int var4 = 0;
        int var5_int = 0;
        at var5 = null;
        jd var6 = null;
        int var7 = 0;
        jd var8 = null;
        jd var6Lifetime1;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_X) {
          throw new IllegalStateException();
        }
        if (param2 != 30156) {
          return (at) null;
        }
        var4 = this.field_gb;
        var8 = (jd) (this.field_t[this.field_gb].e((byte) 94));
        do {
          if (var8 == null) {
            this.field_mb[this.field_gb] = this.field_mb[this.field_gb] + 1;
            break;
          }
          var8.m((byte) -36);
          var8 = (jd) (this.field_t[this.field_gb].a((byte) 123));
        } while (var7 == 0);
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameCompleted2 = true;
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameCompleted1 = true;
        if (param0) {
          this.a(true);
          this.field_gb = (this.field_gb + 1) % this.field_W;
          while (~this.field_gb != ~var4) {
            stackIn_42_0 = -1;
            stackIn_42_1 = ~(1 << this.field_gb & this.field_e);
            if (var7 != 0) {
              decompiledFrameCompleted2 = false;
              break;
            }
            if (stackIn_42_0 == stackIn_42_1) {
              decompiledFrameCompleted1 = false;
              break;
            }
            this.field_gb = (this.field_gb + 1) % this.field_W;
          }
          if (decompiledFrameCompleted2) {
            decompiledFrameRemainder0 = !(decompiledFrameCompleted1);
          }
        }
        if ((decompiledFrameRemainder0) &&
          (decompiledFrameCompleted2) &&
          (decompiledFrameCompleted1)) {
          var5_int = this.field_gb + 1;
          while (var5_int != this.field_gb) {
            stackIn_50_0 = this.field_t[(this.field_gb + 1) % this.field_W];
            if (var7 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            var6 = (jd) (((at) (Object) stackIn_50_0).e((byte) 119));
            while (var6 != null) {
              var6.n((byte) -42);
              var6 = (jd) (this.field_t[(1 + this.field_gb) % this.field_W].a((byte) 123));
            }
            var6Lifetime1 = (jd) (this.field_t[(this.field_gb + 1) % this.field_W].e((byte) 95));
            while (var6Lifetime1 != null) {
              var6Lifetime1.m((byte) -36);
              var6Lifetime1 = (jd) (this.field_t[(1 + this.field_gb) % this.field_W].a((byte) 123));
            }
            var5_int = (1 + var5_int) % this.field_W;
          }
        }
        if ((decompiledFrameCompleted2) &&
          (decompiledFrameCompleted0)) {
          this.field_Gb = this.field_Gb + 1;
          this.a(this.field_gb, (byte) -102);
          if (param0 && (var4 == this.field_gb ||
            this.e((byte) -42))) {
            this.field_qb = true;
            return null;
          }
          decompiledFrameRemainder1 = (param0);
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder1 = !(!this.i(0)))) {
            stackIn_42_0 = ~var4;
            stackIn_42_1 = ~this.field_gb;
          }
        }
        if ((decompiledFrameRemainder1) && (decompiledFrameCompleted0) && (stackIn_42_0 < stackIn_42_1 ||
          this.c((byte) 103))) {
          this.field_qb = true;
          return null;
        }
        if (decompiledFrameCompleted0) {
          stackIn_49_1 = !(var4 >= 0);
          stackIn_50_0 = this.a(stackIn_49_1, param1, param2 - 30156);
        }
        var5 = stackIn_50_0;
        return var5;
    }

    private final void a(int param0, byte param1) {
        int var3;
        var3 = 124 % ((37 - param1) / 34);
        if ((this.field_sb < 0 ||
          ~this.field_sb != ~param0) && this.field_sb >= 0) {
          this.field_Fb = false;
          if (ArmiesOfGielinor.field_M) {
            this.field_Fb = true;
          }
        } else {
          this.field_Fb = true;
        }
        if (0 < this.field_Gb) {
        }
    }

    final jd c(int param0, boolean param1, int param2) {
        boolean discarded$0 = false;
        if (param2 < 0) {
          return null;
        }
        if (param0 < 0) {
          return null;
        }
        if (param2 >= this.field_v) {
          return null;
        }
        if (this.field_db <= param0) {
          return null;
        }
        ne var4 = this.field_Eb[param2 + param0 * this.field_v];
        if (!param1) {
          discarded$0 = this.a((int[]) null, -58, 5, -34);
        }
        return var4.field_c;
    }

    private final boolean a(int[] param0, int param1, int param2, int param3) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
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
        try {
          var5_int = param0[param3];
          if (param2 != -24107) {
            this.field_E = (int[][]) null;
          }
          var6 = param0[param1];
          if (var6 < var5_int) {
            return true;
          }
          if (~var6 == ~var5_int) {
            var7 = this.i(param3, -12710);
            var8 = this.i(param1, param2 + 11397);
            if (var8 >= var7) {
              if (~var8 != ~var7) {
                return false;
              }
              var9 = this.b((byte) 31, param3);
              var10 = this.b((byte) 31, param1);
              if (var10 < var9) {
                return true;
              }
              if (~var9 == ~var10) {
                var11 = this.field_H[param3];
                var12 = this.field_H[param1];
                if (var11 > var12) {
                  return true;
                }
                if (var11 == var12 &&
                  param1 > param3) {
                  return true;
                }
              }
            }
            if (!(var8 >= var7) ||
              ArmiesOfGielinor.field_M) {
              return true;
            }}
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ha.BD(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        jd var11 = null;
        int var12 = 0;
        jd var13_ref_jd = null;
        int var13 = 0;
        ne var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var12Lifetime1;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 == 74) {
          this.field_Bb = true;
          if (this.field_b &&
            this.field_N[9] < 0) {
            this.field_N[9] = param5;
          }
        }
        var8 = 0;
        var9 = bw.field_m[param2][4] + param6;
        if (this.c(param3, true, param1) != null) {
          this.c(param3, true, param1).d(param4 ^ 91);
        }
        var10 = param4;
        if (param2 == 74) {
          var10 = 2;
        }
        var11 = new jd(param1, param3, param2, param5, var9, var9, var10, 0, 0, this, 0, 0, -1, false, 0);
        this.a(8288, var11);
        if (var11.g(0) != 4) {
        }
        if (re.a(0, (byte) -98) &&
          this.field_b) {
          if (param2 != 19 &&
            param2 != 21 &&
            param2 != 20 &&
            0 != param2) {
            this.field_Db = this.field_Db | 1 << param5;
          }
          if ((param2 == 19 ||
            param2 == 21 ||
            param2 == 20 ||
            0 == param2 || var16 != 0) && ((1 << param5 & this.field_Db) == 0 &&
            0 == (1 << param5 & this.field_I))) {
            var12 = 0;
            if (param2 == 19) {
              var12 = var12 | 1;
            }
            if (param2 != 19 ||
              var16 != 0) {
              if (param2 != 21) {
                if (20 == param2) {
                  var12 = var12 | 4;
                  if (var16 != 0) {
                    var12 = var12 | 2;
                  }
                }
              } else {
                var12 = var12 | 2;
              }
            }
            var13_ref_jd = (jd) (this.field_t[param5].e((byte) 89));
            while (true) {
              if (var13_ref_jd != null) {
                stackIn_40_0 = 19;
                stackIn_40_1 = var13_ref_jd.field_N;
                if (var16 == 0) {
                  if (stackIn_40_0 != stackIn_40_1) {
                    if (var13_ref_jd.field_N != 21) {
                      if (var13_ref_jd.field_N == 20) {
                        var12 = var12 | 4;
                      }
                    } else {
                      var12 = var12 | 2;
                    }
                  } else {
                    var12 = var12 | 1;
                  }
                  var13_ref_jd = (jd) (this.field_t[param5].a((byte) 123));
                  continue;
                }
              } else {
                stackIn_40_0 = -8;
                stackIn_40_1 = ~var12;
              }
              if (stackIn_40_0 != stackIn_40_1) {
                break;
              }
              this.field_I = this.field_I | 1 << param5;
              break;
            }
          }}
        if (param2 == 58) {
          var8 = ps.field_C[1];
        }
        if (param2 == 63) {
          var8 = ps.field_C[0];
        }
        if (param2 == 59 ||
          param2 == 53 ||
          param2 == 43) {
          var8 = 1;
        }
        if (var8 > 0) {
          this.a(param3, param1, 0, 3);
        }
        if (param0) {
          return;
        }
        this.field_H[param5] = this.field_H[param5] - bw.field_m[param2][8];
        if (this.field_b) {
          this.field_ub[param5] = this.field_ub[param5] + bw.field_m[param2][8];
          this.d(param5, this.field_ub[param5], 106, 10);
        }
        boolean decompiledFrameRemainder0 = true;
        var12Lifetime1 = bw.field_m[param2][2];
        var13 = bw.field_m[param2][1];
        var14 = this.field_Eb[this.field_v * param3 + param1];
        if ((var13 == -1) &&
          (decompiledFrameRemainder0 = (var12Lifetime1 == this.field_E[param5][6])) &&
          (decompiledFrameRemainder0 = !(this.field_E[param5][6] >= 5))) {
          this.b(6, param5, 1, (byte) 92);
        }
        if ((decompiledFrameRemainder0) &&
          (var13 != -1 ||
          var16 != 0)) {
          boolean decompiledFrameCompleted0 = true;
          this.field_U[param5] = oe.c(this.field_U[param5], 1 << var13);
          if (7 == var14.field_h &&
            var12Lifetime1 == this.field_E[param5][var13]) {
            var15 = 0;
            while (6 > var15) {
              stackIn_76_0 = ~var15;
              stackIn_76_1 = ~var13;
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_76_0 == stackIn_76_1 &&
                5 > this.field_E[param5][var15]) {
                this.b(var15, param5, 1, (byte) 92);
              }
              var15++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_76_0 = 11;
            stackIn_76_1 = var14.field_h;
          }
          if (stackIn_76_0 == stackIn_76_1 &&
            ~var13 == ~var14.field_g &&
            ~var12Lifetime1 == ~var14.field_j &&
            var14.field_j < 5) {
            var14.field_j = var14.field_j + 1;
          }
        }
        if (this.field_b) {
          this.field_Y[param5] = this.field_Y[param5] + 1;
          this.d(param5, this.field_t[param5].b(false), param4 ^ 104, 13);
          this.d(param5, this.field_Y[param5], 119, 5);
        }
    }

    private final boolean i(int param0) {
        int var2;
        int var3;
        int stackIn_14_0 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!this.field_V) {
          return false;
        }
        var2 = param0;
        while (var2 < this.field_tb) {
          stackIn_14_0 = var2;
          if (var3 != 0) {
            return stackIn_14_0 != 0;
          }
          if (stackIn_14_0 < 0) {
            return false;
          }
          if (var2 >= this.field_fb.length) {
            return false;
          }
          if (this.i(var2, param0 - 12710) >= this.field_xb) {
            return true;
          }
          var2++;
        }
        return this.c((byte) 51);
    }

    private final int f(byte param0) {
        int var2;
        int var3;
        int var4;
        if (this.field_s != null &&
          this.field_s.length == 3) {
          if (param0 > -65) {
            return 72;
          }
          var2 = 2 * this.field_O / 3;
          var3 = 50 * this.field_s[0] * var2;
          var3 = var3 + 75 * var2 * this.field_s[1];
          var3 = var3 + this.field_s[2] * var2 * 25;
          if (this.field_O <= 1) {
            return 0;
          }
          var4 = var3 / this.field_tb;
          var4 = var4 / 500 * 500 + 500;
          return var4;
        }
        return 0;
    }

    final boolean a(int param0, int param1, int param2, jd param3) {
        ne var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 0 &&
            param0 >= 0 &&
            param2 < this.field_v) {
            if (this.field_db < param0) {
              return false;
            }
            if (param1 != -26633) {
              this.field_N = (int[]) null;
            }
            var5 = this.field_Eb[param2 + this.field_v * param0];
            if (null == var5.field_c) {
              return false;
            }
            if (!this.c(var5.field_c.field_O, -16985, param3.field_O)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("ha.JD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(int param0, ne param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != param1.field_c &&
            param1.c(-32)) {
            param1.i(param0 + 114);
            if (param1.field_c.field_t < 99) {
              this.field_l.a((byte) -119, (tc) (new st(param1.field_c, 4)));
            }
          }
          if (param0 != -100) {
            this.field_t = (at[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ha.AE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        do {
          if (var2 >= this.field_S.length) {
            var2 = -74 % ((39 - param0) / 49);
            break;
          }
          this.field_S[var2] = this.field_fb[var2];
          var2++;
        } while (var5 == 0);
        if (this.field_gb >= 0) {
          var3 = 0;
          while (true) {
            if (var3 >= this.field_v) {
              return;
            }
            if (var5 != 0) {
              return;
            }
            var4 = 0;
            while (var4 < this.field_db) {
              this.field_Eb[var3 + this.field_v * var4].a(var4, var3, this.field_gb, 0);
              var4++;
            }
            var3++;
          }
        }
        return;
    }

    final static int b(int param0, int param1, int param2) {
        if (param2 != -4) {
          field_q = (String) null;
        }
        int var3 = param0;
        if (nv.c(0, param1) &&
          param0 == 3) {
          var3 = 3;
        }
        return var3;
    }

    final void b(int param0, boolean param1, int param2, int param3, int param4) {
        ne stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        ne var6;
        int var7;
        int var8;
        ne var9;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param4 < 0) {
          return;
        }
        if (param4 < this.field_db &&
          param0 >= 0 &&
          this.field_v > param0) {
          var9 = this.field_Eb[param0 + this.field_v * param4];
          var6 = var9;
          stackIn_8_0 = var6;
          stackIn_9_1 = (!param1) ? false : true;
          L4: {
            L5: {
              L6: {
                L7: {
                  boolean decompiledFrameRemainder1 = true;
                  boolean decompiledFrameRemainder0 = true;
                  stackIn_8_0.field_b = stackIn_9_1;
                  var7 = param2;
                  if (((14 != var7 ||
                    var8 != 0) && (var7 != 9 ||
                    var8 != 0)) &&
                    (decompiledFrameRemainder0 = (var7 != 4)) &&
                    (decompiledFrameRemainder1 = (3 != var7 ||
                    var8 != 0))) {
                    switch (var7) {
                      case 5:
                        break L7;
                      case 0:
                        break L6;
                      case 1:
                        break L5;
                      case 10:
                        break L4;
                      default:
                        return;
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    if (8 != var9.field_h) {
                      return;
                    }
                    if (!this.c(var9.field_a, -16985, param3)) {
                      return;
                    }
                    var7 = var9.e(10);
                    var6.field_h = param2;
                    var9.field_m = var9.field_m + (-var7 + var9.e(10));
                    this.f(-2);
                    this.b(2);
                    return;
                  }
                  if (decompiledFrameRemainder1) {
                    if (var9.field_h != 1) {
                      if (var9.field_h != 0 &&
                        var9.field_h != 3 &&
                        5 != var9.field_h) {
                        return;
                      }
                      var6.field_h = 4;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    var6.field_h = 10;
                    if (var8 == 0) {
                      return;
                    }
                  }
                  if (var9.field_h != 0) {
                    return;
                  }
                  var6.field_h = 3;
                  if (var8 == 0) {
                    return;
                  }
                }
                if (var9.field_h != 0 &&
                  var9.field_h != 3) {
                  return;
                }
                var6.field_h = 5;
                if (var8 == 0) {
                  return;
                }
              }
              if (var9.field_h == 2) {
                var6.field_h = 0;
                if (var8 == 0) {
                  return;
                }
              }
              if (12 != var9.field_h) {
                return;
              }
              var6.field_h = 13;
              if (var8 == 0) {
                return;
              }
            }
            if (var9.field_h != 0 &&
              var9.field_h != 3 &&
              var9.field_h != 5) {
              return;
            }
            var6.field_h = 1;
            if (var8 == 0) {
              return;
            }
          }
          if (var9.field_h == 6 ||
            4 == var9.field_h) {
            var6.field_h = 10;
          }
          if (var9.field_h != 5) {
            return;
          }
          var6.field_h = 1;
          return;
        }
    }

    final boolean b(int param0, boolean param1) {
        if (this.field_f) {
          return false;
        }
        if (!this.field_P.a((byte) -88, param0)) {
          return false;
        }
        if (!param1) {
          this.field_vb = 102;
        }
        this.b(10001, param0, false);
        return true;
    }

    final at f(int param0, int param1) {
        if (null == this.field_t) {
          return null;
        }
        if (0 > param0) {
          return null;
        }
        if (param0 >= this.field_t.length) {
          return null;
        }
        if (param1 != 0) {
          this.field_fb = (int[]) null;
        }
        return this.field_t[param0];
    }

    private final void b(int[] param0, int param1, int param2, int param3) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var5_int = 0;
          if (param1 != 12534) {
            this.a((vh) null, (byte) -4);
          }
          do {
            if (this.field_tb <= var5_int) {
              var5_int = -3;
              break;
            }
            param0[var5_int] = 0;
            var5_int++;
          } while (var10 == 0);
          L4: while (true) {
            stackIn_10_0 = ~var5_int;
            stackIn_10_1 = -4;
            if (stackIn_10_0 >= stackIn_10_1) {
              if (var10 != 0) {
                return;
              }
              var6 = -3;
              while (3 >= var6) {
                var7 = Math.abs(var5_int) + Math.abs(var6);
                stackIn_10_0 = -1;
                stackIn_10_1 = ~(param3 + var5_int);
                if (stackIn_10_0 >= stackIn_10_1 &&
                  (param3 + var5_int) < this.field_v &&
                  var6 + param2 >= 0 &&
                  (var6 + param2) < this.field_db) {
                  var8 = this.field_Eb[this.field_v * (param2 + var6) + param3 + var5_int].field_c;
                  if (var8 != null ||
                    var10 != 0) {
                    var9 = this.o(var8.field_O, param1 - 12535);
                    if (var8.field_N == 59) {
                      stackIn_26_0 = (!var8.field_F) ? 0 : 1;
                      if (stackIn_26_0 + ps.field_C[2] >= var7) {
                        param0[var9] = oe.c(param0[var9], 4);
                      }
                    }
                    if (var8.field_N == 53) {
                      stackIn_31_0 = ~var7;
                      if (var8.field_F) {
                        stackIn_32_1 = 1;
                      } else {
                        stackIn_32_1 = 0;
                      }
                      if (stackIn_31_0 >= ~(stackIn_32_1 + ps.field_C[3])) {
                        param0[var9] = oe.c(param0[var9], 8);
                      }
                    }
                    if (var8.field_N == 43) {
                      stackIn_38_0 = var7;
                      if (!var8.field_F) {
                        stackIn_39_1 = 0;
                      } else {
                        stackIn_39_1 = 1;
                      }
                      if (stackIn_38_0 <= stackIn_39_1 + ps.field_C[4] &&
                        0 < var7) {
                        param0[var9] = oe.c(param0[var9], 16);
                      }
                    }
                    if (var8.field_N == 63) {
                      stackIn_45_0 = ps.field_C[0];
                      if (var8.field_F) {
                        stackIn_46_1 = 1;
                      } else {
                        stackIn_46_1 = 0;
                      }
                      if ((stackIn_45_0 + stackIn_46_1) >= var7) {
                        param0[var9] = oe.c(param0[var9], 1);
                      }
                    }
                    if (58 == var8.field_N) {
                      stackIn_51_0 = ps.field_C[1];
                      if (!var8.field_F) {
                        stackIn_52_1 = 0;
                      } else {
                        stackIn_52_1 = 1;
                      }
                      if ((stackIn_51_0 + stackIn_52_1) >= var7) {
                        param0[var9] = oe.c(param0[var9], 2);
                      }
                    }
                  }
                }
                var6++;
              }
              var5_int++;
              continue L4;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_59_0 = var5;
          stackIn_59_1 = new StringBuilder().append("ha.LA(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        jd var8;
        var8 = this.c(param3, true, param2);
        if (param0 >= -117) {
          this.field_mb = (int[]) null;
        }
        if (var8 != null &&
          this.c(var8.field_O, -16985, param4) && (!var8.a(23072) ||
          param1)) {
          var8.field_Y = var8.field_Y + param5;
          if (this.field_b) {
            this.field_ob[param4] = this.field_ob[param4] + param5;
          }
          if (var8.field_t < var8.field_Y) {
            var8.field_Y = var8.field_t;
          }
        }
    }

    final void a(byte param0, ik param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_f &&
            param2 > -1) {
            stackIn_4_0 = 1;
          } else {
            stackIn_4_0 = 0;
          }
          var5_int = stackIn_4_0;
          if (this.field_K != null &&
            ~param3 != ~this.field_K.field_w) {
            var5_int = 0;
          }
          if (param0 != -49) {
            this.b(-42, true, -106, -92, 114);
          }
          if (var5_int != 0) {
            this.field_B[param3][param2] = -1;
            this.field_m[param3] = this.field_m[param3] - uc.field_d[param1.field_c][0];
          }
          this.field_J = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ha.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean h(int param0) {
        int var2 = this.field_Fb ? 1 : 0;
        this.field_Fb = false;
        if (param0 != -293) {
          this.field_ib = 1;
        }
        return var2 != 0;
    }

    final void b(int param0, int param1, int param2, byte param3) {
        int[] dupTemp$1 = null;
        if (param1 >= 0) {
          if (param1 >= this.field_E.length) {
            return;
          }
          if (param0 >= 0) {
            if (param0 >= this.field_E[param1].length) {
              return;
            }
            dupTemp$1 = this.field_E[param1];
            dupTemp$1[param0] = dupTemp$1[param0] + param2;
            if (this.field_E[param1][param0] > 5) {
              this.field_E[param1][param0] = 5;
            }
            if (param3 != 92) {
              return;
            }
            if (param0 == -1) {
              return;
            }
            if (this.field_E[param1][param0] > this.field_E[param1][6]) {
              this.field_E[param1][6] = this.field_E[param1][param0];
            }
            return;
          }
        }
    }

    final String[] e(int param0) {
        if (param0 != 26524) {
          this.field_qb = true;
        }
        return this.field_P.a(param0 ^ 26524);
    }

    private final void a(int param0, vh param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          var3_int = param1.k(param0 + 30531);
          var4 = param1.k(0);
          var5 = param1.k(0);
          var6 = 7 & var3_int;
          if (param0 != -30531) {
            this.a(103, false, (int[]) null);
          }
          var7 = (var3_int & 31) >> 3;
          this.field_l.a((byte) -119, (tc) (new qq(var7, var4, var5, var6)));
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ha.GD(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, gn param1, int param2) {
        int stackIn_9_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          param1.a(new String[]{this.e(param0, param2 + 3395), ": "}, (byte) -124);
          param1.a(0, 2);
          var4_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4_int >= this.field_c[param0].length))) {
            var5 = this.field_c[param0][var4_int];
            stackIn_9_0 = var5;
            if (var6 == 0) {
              if (stackIn_9_0 >= 0) {
                param1.a(new String[]{"god: ", wf.field_q[var5 + 1], " level: ", Integer.toString(this.field_E[param0][var5])}, (byte) -57);
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            param1.a(new String[]{"mana: ", Integer.toString(this.field_H[param0]), ", collected: ", Integer.toString(this.field_fb[this.field_yb[param0]])}, (byte) -49);
            param1.a(new String[]{"turns: ", Integer.toString(this.field_mb[param0])}, (byte) -102);
            stackIn_9_0 = ~lf.field_i[this.field_Q];
          }
          if (stackIn_9_0 != -1) {
            param1.a(new String[]{"rune cap remaining: ", Integer.toString(this.field_m[param0])}, (byte) -62);
          }
          param1.a(0, -2);
          if (param2 != -3396) {
            this.a(91, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ha.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(jd param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.a(param0.field_J + param0.field_w * this.field_v, -4, param0);
          if (~(param2 | hh.field_e[param0.field_P]) == ~hh.field_e[param0.field_P]) {
            var5_int = var5_int - param0.field_o * 10;
          }
          if (param1 > -111) {
            this.field_eb = false;
          }
          stackIn_5_0 = var5_int * param3 / 100;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ha.L(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(int param0, byte param1) {
        int var3;
        int var4;
        int stackIn_17_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 != -26) {
          return false;
        }
        var3 = 0;
        while ((this.field_v * this.field_db) > var3) {
          stackIn_17_0 = ~this.field_Eb[var3].field_a;
          if (var4 != 0) {
            return stackIn_17_0 != 0;
          }
          if (stackIn_17_0 == ~param0 ||
            null == this.field_K &&
            this.c(this.field_Eb[var3].field_a, -16985, param0)) {
            if (this.field_Eb[var3].field_h == 7) {
              return true;
            }
            if (this.field_Eb[var3].field_h == 11 &&
              this.field_E[param0][this.field_Eb[var3].field_g] > 0) {
              return true;
            }
          }
          var3++;
        }
        return false;
    }

    final boolean a(int param0, boolean param1) {
        jd var3_ref_jd = null;
        int var3 = 0;
        jd var4 = null;
        int var5 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_18_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_34_0 = 0;
        boolean stackOut_24_0;
        int stackIn_18_0Lifetime1;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param1) {
          return false;
        }
        var3_ref_jd = (jd) (this.field_t[param0].e((byte) 116));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3_ref_jd == null))) {
          stackIn_13_0 = var3_ref_jd.i(-21428);
          if (var5 == 0) {
            if ((stackIn_13_0 ||
              var3_ref_jd.k((byte) 116)) &&
              !var3_ref_jd.field_S) {
              return true;
            }
            var3_ref_jd = (jd) (this.field_t[param0].a((byte) 123));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_13_0 = this.field_wb;
        }
        if (stackIn_13_0) {
          if (null != this.field_K) {
            return false;
          }
          var3 = 0;
          while (true) {
            stackIn_18_0 = this.field_W;
            if (stackIn_18_0 <= var3) {
              break;
            }
            stackIn_34_0 = var3;
            if (var5 != 0) {
              return stackIn_34_0 != 0;
            }
            if (stackIn_34_0 != param0 &&
              this.c(var3, -16985, param0)) {
              var4 = (jd) (this.field_t[var3].e((byte) 99));
              while (var4 != null) {
                stackOut_24_0 = var4.i(-21428);
                stackIn_18_0Lifetime1 = stackOut_24_0 ? 1 : 0;
                stackIn_25_0 = stackOut_24_0;
                if ((stackIn_25_0 ||
                  var4.k((byte) 90)) &&
                  !var4.field_S) {
                  return true;
                }
                var4 = (jd) (this.field_t[var3].a((byte) 123));
              }
            }
            var3++;
          }
        }
        return false;
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4) {
        ne var6;
        if (0 <= param2 &&
          0 <= param3 &&
          this.field_v > param2 &&
          this.field_db > param3) {
          var6 = this.field_Eb[param2 + this.field_v * param3];
          if (null == var6.field_c) {
            return false;
          }
          if (param0 < ~param4) {
            return true;
          }
          if (this.c(var6.field_c.field_O, -16985, param4)) {
            return true;
          }
          return param1;
        }
        return false;
    }

    final int[] a(int param0, byte param1, int param2, int param3) {
        int[] var5 = null;
        ne var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        boolean decompiledFrameCompleted0 = true;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var9 = new int[7];
        var5 = var9;
        var6 = this.field_Eb[param2 + param0 * this.field_v];
        if (7 == var6.field_h &&
          this.c(var6.field_a, -16985, param3)) {
          var7 = 0;
          while (var7 < 7) {
            var9[var7] = this.field_E[param3][var7];
            var7++;
            if (var8 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) && (var6.field_h == 11 &&
          this.c(var6.field_a, -16985, param3) &&
          var9[var6.field_g] < var6.field_j)) {
          var9[var6.field_g] = var6.field_j;
        }
        if (param1 >= 8) {
          return var9;
        }
        return (int[]) null;
    }

    final int a(boolean param0, int param1) {
        int stackIn_21_0 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        jd var6 = null;
        int var7 = 0;
        ne var8_ref_ne = null;
        int var8 = 0;
        int var9 = 0;
        int var5Lifetime1;
        int var7Lifetime1;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = this.field_jb;
        if (this.field_Bb) {
          var3 = var3 ^ 313485252;
        }
        var3 = var3 ^ this.field_cb * 137;
        var3 = var3 ^ 783246 * this.field_hb;
        var3 = var3 ^ this.field_Q * 545542;
        if (param1 >= 0) {
          var3 = var3 ^ this.n(param1, -111) * (7 * param1 + 11);
        }
        var4 = param1;
        if (0 > var4) {
          var4 = 0;
        }
        if (!param0) {
          this.field_ib = -38;
        }
        var5 = 0;
        L4: while (true) {
          if (this.field_v > var5) {
            stackIn_21_0 = 0;
            if (var9 != 0) {
              break L4;
            }
            var6_int = stackIn_21_0;
            while (this.field_db > var6_int) {
              var7 = this.field_v * var6_int + var5;
              var8_ref_ne = this.field_Eb[var7];
              var3 = var3 ^ this.a((byte) 103, var4, var8_ref_ne) * (var7 * 3 + 351);
              var6_int++;
            }
            var5++;
            continue L4;
          }
          stackIn_21_0 = 0;
          break;
        }
        var5Lifetime1 = stackIn_21_0;
        L10: while (var5Lifetime1 < this.field_W) {
          var6 = (jd) (this.field_t[var5Lifetime1].e((byte) 101));
          while (true) {
            if (var6 != null) {
              var7Lifetime1 = var6.field_J;
              var8 = var6.field_w;
              var3 = var3 ^ this.b(-125, var6) * (var7Lifetime1 + 372) * (var8 + 723);
              var6 = (jd) (this.field_t[var5Lifetime1].a((byte) 123));
              if (var9 == 0) {
                continue;
              }
            } else {
              var5Lifetime1++;
            }
            break;
          }
          if (var9 == 0) {
            continue L10;
          }
          break;
        }
        return var3;
    }

    final void g(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -36 % ((-50 - param1) / 62);
        var4 = 0;
        while (this.field_W > var4) {
          if (var5 == 0) {
            if ((this.field_e & 1 << var4) != (1 << var4 & param0)) {
              this.b(10001, var4, false);
            }
            var4++;
            continue;
          }
          break;
        }
        this.field_e = param0;
        return;
    }

    final void c(int param0, int param1, int param2, byte param3) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int[] dupTemp$3 = null;
        int[] dupTemp$4 = null;
        int[] dupTemp$5 = null;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        jd var10;
        ne var11;
        int var7Lifetime1;
        int var7Lifetime2;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-1 < param2) {
          var10 = this.c(param0, true, param1);
          if (var10 != null &&
            1 == var10.field_ab) {
            var10.field_ab = 0;
          }
        }
        boolean decompiledFrameRemainder2 = true;
        var11 = this.field_Eb[param1 + param0 * this.field_v];
        var6 = var11.field_a;
        if (var6 > -1) {
          boolean decompiledFrameRemainder1 = true;
          var7 = var11.field_h;
          if (var7 == 7 &&
            var9 == 0) {
            dupTemp$0 = this.field_z[this.field_yb[var6]];
            dupTemp$0[0] = dupTemp$0[0] - 1;
            decompiledFrameRemainder2 = false;
          } else {
            if (var7 != 14 && (var7 != 9 ||
              var9 != 0)) {
              decompiledFrameRemainder1 = (var7 != 8);
              decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            dupTemp$1 = this.field_z[this.field_yb[var6]];
            dupTemp$1[1] = dupTemp$1[1] - 1;
            decompiledFrameRemainder2 = (var9 != 0);
          }
          if (decompiledFrameRemainder2) {
            dupTemp$2 = this.field_z[this.field_yb[var6]];
            dupTemp$2[2] = dupTemp$2[2] - 1;
          }
        }
        L6: {
          L7: {
            L8: {
              var11.a(-104, param2);
              var7Lifetime1 = var11.field_h;
              if (var7Lifetime1 != 7) {
                if (var7Lifetime1 == 14) {
                  break L8;
                }
                if (var7Lifetime1 == 9 &&
                  var9 == 0) {
                  break L8;
                }
                if (var7Lifetime1 != 8) {
                  break L6;
                }
                if (var9 == 0) {
                  break L7;
                }
              }
              dupTemp$3 = this.field_z[this.field_yb[param2]];
              dupTemp$3[0] = dupTemp$3[0] + 1;
              if (var9 == 0) {
                break L6;
              }
            }
            dupTemp$4 = this.field_z[this.field_yb[param2]];
            dupTemp$4[1] = dupTemp$4[1] + 1;
            if (var9 == 0) {
              break L6;
            }
          }
          dupTemp$5 = this.field_z[this.field_yb[param2]];
          dupTemp$5[2] = dupTemp$5[2] + 1;
        }
        if (param3 != -115) {
          this.field_U = (int[]) null;
        }
        if (this.field_b &&
          !this.field_wb) {
          this.d(param2, this.field_z[this.field_yb[param2]][1] + (this.field_z[this.field_yb[param2]][0] + this.field_z[this.field_yb[param2]][2]), 102, 0);
          var7Lifetime2 = -1 + this.field_W;
          var8 = 0;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (this.field_n[var8] > -1) {
              stackIn_43_0 = ~this.field_W;
              stackIn_43_1 = ~var8;
              decompiledFrameRemainder0 = (var9 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_43_0 < stackIn_43_1)) {
                var7Lifetime2--;
                var8++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_43_0 = var7Lifetime2;
              stackIn_43_1 = -1;
            }
            if (stackIn_43_0 > stackIn_43_1 &&
              ~this.field_p[var7Lifetime2] == ~var6) {
              this.field_y[param2] = this.field_y[param2] + 1;
              this.d(param2, this.field_y[param2], 104, 15);
            }
            if (~this.field_p[0] != ~var6) {
              break;
            }
            this.field_M[param2] = this.field_M[param2] + 1;
            this.d(param2, this.field_M[param2], param3 ^ -18, 14);
            break;
          }
        }
        if (var11.k(12)) {
          this.b(param3 + 10116, var6, false);
          var11.d((byte) 61);
        }
        if (this.field_K != null &&
          var6 != -1) {
          this.b(var6, true);
        }
        this.a(1);
    }

    final void g(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 != -9513) {
          this.b(-46, 97, true);
        }
        var5 = 0;
        while (var5 < this.field_W &&
          var7 == 0) {
          var6 = 0;
          while (var6 < 6) {
            this.field_E[var5][param1] = 1;
            this.field_E[var5][param2] = 1;
            this.field_E[var5][param0] = 1;
            this.field_c[var5][0] = param1;
            this.field_c[var5][1] = param2;
            this.field_c[var5][2] = param0;
            var6++;
          }
          var5++;
        }
        return;
    }

    private final void j(int param0) {
        if (param0 != 7) {
          this.field_Bb = true;
          return;
        }
    }

    final int[] a(jd param0, int param1, byte param2, int param3, jd param4, int param5, int param6) {
        int[] stackIn_7_0 = null;
        int[] stackIn_16_0 = null;
        int stackIn_20_0 = 0;
        int[] stackIn_80_0 = null;
        int[] stackIn_97_0 = null;
        int[] stackIn_108_0 = null;
        int[] stackIn_133_0 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_137_2 = null;
        StringBuilder stackIn_139_1 = null;
        String stackIn_140_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd var8 = null;
        RuntimeException var8_ref = null;
        jd var9 = null;
        int[] var10 = null;
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
        jd var23 = null;
        int var19Lifetime1;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var23 = param4;
          var8 = var23;
          if (param2 > -119) {
            this.field_u = 42;
          }
          var9 = param0;
          var10 = new int[]{0, 0, 0};
          if (var8 != null &&
            var9 != null) {
            var11 = var23.field_N;
            if (var11 == 34 &&
              var23.field_W) {
              var11 = 75;
            }
            if (!var23.j((byte) 80) &&
              var9.x(-96)) {
              stackIn_16_0 = var10;
              return stackIn_16_0;
            }
            var12 = Math.abs(param5) + Math.abs(param3);
            var13 = 32;
            var14 = 32;
            var15 = 0;
            var16 = 0;
            stackIn_20_0 = (var12 != 1) ? 0 : 1;
            boolean decompiledFrameRemainder1 = true;
            var17 = stackIn_20_0;
            if (var17 == 0) {
              if (34 != var23.field_N ||
                !var23.field_W) {
                if (var23.field_N != 81 &&
                  var23.field_N != 4 &&
                  var23.field_N != 74) {
                  if (var23.g(0) != 3) {
                    var13 = 2;
                    decompiledFrameRemainder1 = (var23.j(20640) == 1);
                    if (decompiledFrameRemainder1) {
                      var15 = var23.d(0, 80);
                      decompiledFrameRemainder1 = (var22 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    if (var23.j(20640) == 2) {
                      var15 = var23.d(0, 58);
                    }
                    var13 = 4;
                    decompiledFrameRemainder1 = (var22 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  var13 = 8;
                  decompiledFrameRemainder1 = (var23.j(20640) == 3);
                  if (decompiledFrameRemainder1) {
                    var15 = var23.d(0, 106);
                    decompiledFrameRemainder1 = (var22 != 0);
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                var13 = 8;
                decompiledFrameRemainder1 = (var23.j(20640) == 3);
                if (decompiledFrameRemainder1) {
                  var15 = var23.d(0, 118);
                }
              }
            }
            if ((decompiledFrameRemainder1) &&
              (var17 != 0 ||
              var22 != 0)) {
              if (var23.field_N == 34 &&
                var23.field_W) {
                var13 = 8;
                decompiledFrameRemainder1 = (var23.j(20640) == 3);
                if (decompiledFrameRemainder1) {
                  var15 = var23.d(0, 55);
                  decompiledFrameRemainder1 = (var22 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                if (var23.x(-126)) {
                  if (var23.j(20640) == 4) {
                    var15 = var23.d(0, -95);
                  }
                  var13 = 16;
                  decompiledFrameRemainder1 = (var22 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (var23.g(0) == 3) {
                    var13 = 4;
                    if (var23.j(20640) == 2) {
                      var15 = var23.d(0, -102);
                      if (var22 != 0) {
                        var13 = 1;
                        if (0 == var23.j(20640)) {
                          var15 = var23.d(0, -93);
                        }
                      }
                    }
                  } else {
                    var13 = 1;
                    if (0 == var23.j(20640)) {
                      var15 = var23.d(0, -93);
                    }
                  }
                }
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (var17 != 0) {
              if (var9.field_N != 34 ||
                !var9.field_W) {
                if (var9.x(-109)) {
                  var14 = 16;
                  decompiledFrameRemainder0 = (var9.j(20640) == 4);
                  if (decompiledFrameRemainder0) {
                    var16 = var9.d(0, 122);
                    decompiledFrameRemainder0 = (var22 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (3 == var9.g(0)) {
                    if (var9.j(20640) == 2) {
                      var16 = var9.d(0, 69);
                    }
                    var14 = 4;
                    if (var22 != 0) {
                      if (var9.j(20640) == 0) {
                        var16 = var9.d(0, -123);
                      }
                      var14 = 1;
                      if (var9.j(20640) == 3) {
                        var16 = var9.d(0, 116);
                      }
                      var14 = 8;
                    }
                  } else {
                    if (var9.j(20640) == 0) {
                      var16 = var9.d(0, -123);
                    }
                    var14 = 1;
                    if (var22 != 0) {
                      if (var9.j(20640) == 3) {
                        var16 = var9.d(0, 116);
                      }
                      var14 = 8;
                    }
                  }
                }
              } else {
                if (var9.j(20640) == 3) {
                  var16 = var9.d(0, 116);
                }
                var14 = 8;
              }
            }
            if (var11 >= 0 &&
              bw.field_m.length > var11) {
              var18 = param4.B(3257);
              var19 = param4.l((byte) -79);
              if (param4.field_N != 81 &&
                4 != param4.field_N &&
                param4.field_N != 74 ||
                param4.j(20640) != 3) {
                if (param4.g(0) != 3 ||
                  param4.j(20640) != 2) {
                  if ((param4.g(0) == 2) &&
                    (1 == param4.j(20640))) {
                    var18 = var18 + param4.d(1, 117);
                    if (var22 != 0) {
                      var18 = var18 + param4.d(1, -124);
                      var18 = var18 + param4.d(1, -87);
                    }
                  }
                } else {
                  var18 = var18 + param4.d(1, -124);
                  if (var22 != 0) {
                    var18 = var18 + param4.d(1, -87);
                  }
                }
              } else {
                var18 = var18 + param4.d(1, -87);
              }
              if (var12 > var18) {
                stackIn_97_0 = var10;
                return stackIn_97_0;
              }
              var20 = 0;
              var21 = 0;
              if (var12 >= var19) {
                var20 = this.a(var9, (byte) -123, var13, this.a(param1, 0, param6, var9, var23, (byte) -128) + var15);
                if (var20 == 0) {
                  var20 = 1;
                }
                if (255 < var20) {
                  var20 = 255;
                }
                var10[0] = var20;
              }
              if ((var12 < var19 ||
                var22 != 0) &&
                var12 > 1) {
                stackIn_108_0 = var10;
                return stackIn_108_0;
              }
              if (var17 != 0 && (!(var20 >= var9.field_A + var9.field_Y) ||
                param0.field_P == 7 ||
                8 == param0.field_P)) {
                var19Lifetime1 = bw.field_m[var9.field_N][6];
                if (var19Lifetime1 > 1) {
                  var21 = this.a(var8, (byte) -123, var14, this.a(param1 + param3, var20, param6 + param5, var23, var9, (byte) -128) * 3 / 20 + var16);
                }
                if (var19Lifetime1 <= 1 ||
                  var22 != 0) {
                  var21 = this.a(var8, (byte) -125, var14, this.a(param1 + param3, var20, param5 + param6, var23, var9, (byte) -128) + var16);
                  if (var21 == 0) {
                    var21 = 1;
                  }
                }
                if (var21 > 255) {
                  var21 = 255;
                }
                var10[1] = var21;
              }
              if (var23.field_A + var23.field_Y <= var21 &&
                param4.field_P != 7 &&
                param4.field_P != 8) {
                var10[2] = oe.c(var10[2], 1);
              }
              if (var20 >= var9.field_Y + var9.field_A &&
                7 != param0.field_P &&
                param0.field_P != 8) {
                var10[2] = oe.c(var10[2], 2);
              }
              stackIn_133_0 = var10;
              return stackIn_133_0;
            }
            stackIn_80_0 = var10;
            return stackIn_80_0;
          }
          stackIn_7_0 = var10;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_136_0 = var8_ref;
          stackIn_136_1 = new StringBuilder().append("ha.EC(");
          if (param0 == null) {
            stackIn_137_2 = "null";
          } else {
            stackIn_137_2 = "{...}";
          }
          stackIn_139_1 = ((StringBuilder) (Object) stackIn_136_1).append(stackIn_137_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_140_2 = "null";
          } else {
            stackIn_140_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_136_0), ((StringBuilder) (Object) stackIn_139_1).append(stackIn_140_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void a(boolean param0, jd param1, gn param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          param2.a(new String[]{"unit type: ", dn.field_Pb[param1.field_N].toLowerCase(), " at ", ci.c(param1.field_J, 0, param1.field_w)}, (byte) -120);
          param2.a(0, 2);
          param2.a(new String[]{"owner: ", this.e(param1.field_O, -1)}, (byte) -120);
          if (param1.field_I) {
            param2.a((byte) 19, "poisoned");
          }
          if (param1.field_W) {
            param2.a((byte) 19, "deployed");
          }
          if (param1.field_s) {
            param2.a((byte) 19, "moved");
          }
          if (param1.field_D) {
            param2.a((byte) 19, "trinket used");
          }
          param2.a((byte) 19, "attacksleft: " + param1.field_B);
          if (param1.field_A != 0) {
            param2.a(new String[]{"bonus: ", Integer.toString(param1.field_A)}, (byte) -54);
          }
          param2.a(new String[]{"strength: ", Integer.toString(param1.field_Y), "/", Integer.toString(param1.field_t)}, (byte) -105);
          param2.a(0, -2);
          if (param0) {
            this.a(-59, (byte) 114, 16, 49);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ha.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final boolean b(int param0, int param1) {
        boolean stackIn_7_0 = false;
        if (param0 != -1) {
          this.a(56, (String) null, (oj) null);
        }
        stackIn_7_0 = ((this.field_e & 1 << param1) != 0) || ((this.field_u & 1 << param1) != 0);
        return stackIn_7_0;
    }

    final int a(int param0, int param1, boolean param2) {
        int var4 = -1;
        if (param1 >= 0) {
          var4 = this.o(param1, -1);
        }
        if (!param2) {
          this.field_hb = -93;
        }
        return this.field_Eb[param0].a((byte) 97, param1, var4);
    }

    private final int a(int param0, int param1, int param2, jd param3, jd param4, byte param5) {
        int discarded$0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        try {
          if (param3.field_P == 7 ||
            param3.field_P == 8) {
            param1 = 0;
          }
          var7_int = fk.field_d[param4.g(0)][param3.g(0)];
          if (param5 > -127) {
            discarded$0 = this.a((byte) -69, -60, (ne) null);
          }
          if ((this.b(31, param0, param2, param4.field_O) & 16) != 0) {
            var7_int = 90;
          }
          if (param4.n(116) &&
            param3.x(-121)) {
            var7_int = 90;
          }
          var8 = var7_int * (param4.field_A + (param4.field_Y - param1)) / 100;
          stackIn_15_0 = (var8 <= 0) ? 0 : var8;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("ha.VC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, vh param2, int param3) {
        int var5_int = 0;
        jd var6 = null;
        if (param1 >= -22) {
          return;
        }
        try {
          var5_int = param2.k(0);
          var6 = mb.a(var5_int, 0, param3, param0, param2, this, -102, true);
          this.field_t[var6.field_O].a((byte) -119, (tc) (var6));
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ha.WD(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String j(int param0, int param1) {
        int stackIn_21_0 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ne var8 = null;
        int var9 = 0;
        gn var10 = null;
        jd var11 = null;
        gn var12 = null;
        int var5Lifetime1;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var10 = new gn();
        var12 = var10;
        var10.a(new String[]{"seed: ", Integer.toString(this.field_jb, 16)}, (byte) -116);
        var10.a(new String[]{"size: ", Integer.toString(this.field_cb), ", theme: ", Integer.toString(this.field_hb)}, (byte) -103);
        if (this.field_Bb) {
          var12.a((byte) 19, "kbd summoned");
        }
        if (param0 >= 0) {
          this.a(param0, var12, param1 - 3148);
        }
        var4 = param0;
        if (var4 < 0) {
          var4 = 0;
        }
        var5 = 0;
        if (param1 != -248) {
          return (String) null;
        }
        L3: while (true) {
          if (var5 < this.field_v) {
            stackIn_21_0 = 0;
            if (var9 != 0) {
              break L3;
            }
            var6 = stackIn_21_0;
            while (this.field_db > var6) {
              var7 = var6 * this.field_v + var5;
              var8 = this.field_Eb[var7];
              this.a(var4, var8, (byte) -40, var6, var12, var5);
              var6++;
            }
            var5++;
            continue L3;
          }
          stackIn_21_0 = 0;
          break;
        }
        var5Lifetime1 = stackIn_21_0;
        L9: while (this.field_W > var5Lifetime1) {
          var11 = (jd) (this.field_t[var5Lifetime1].e((byte) 124));
          while (true) {
            if (var11 != null) {
              this.a(false, var11, var10);
              var11 = (jd) (this.field_t[var5Lifetime1].a((byte) 123));
              if (var9 == 0) {
                continue;
              }
            } else {
              var5Lifetime1++;
            }
            break;
          }
          if (var9 == 0) {
            continue L9;
          }
          break;
        }
        return var12.c(1024);
    }

    private final void b(vh param0, byte param1) {
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var3_int = param0.k(param1 ^ -84) & 31;
          if (var3_int == 13) {
            this.field_l.a((byte) -119, (tc) (new rl(param0.k(0))));
            return;
          }
          if (var3_int == 14) {
            this.field_l.a((byte) -119, (tc) (new vp(3, param0.k(0), this.field_sb)));
            return;
          }
          if (param1 != -84) {
            this.a(-22, (jd) null);
          }
          if (var3_int == 5) {
            var4 = param0.k(0);
            var5 = 15 & var4;
            if (var5 == 15) {
              var5 = -1;
            }
            this.field_l.a((byte) -119, (tc) (new pj(bo.a(-1, param0, 4368051), var5, var4 >> 4)));
          }
          L5: {
            L6: {
              L7: {
                L8: {
                  L9: {
                    L10: {
                      boolean decompiledFrameRemainder0 = true;
                      var4Lifetime1 = param0.k(0);
                      var5Lifetime1 = param0.k(param1 ^ -84);
                      var6 = var3_int;
                      if ((var6 != 1) &&
                        (decompiledFrameRemainder0 = (var6 != 11))) {
                        if (17 == var6 &&
                          var7 == 0) {
                          break L10;
                        }
                        if (var6 == 16) {
                          break L9;
                        }
                        if (2 == var6 &&
                          var7 == 0) {
                          break L8;
                        }
                        if (var6 == 7 &&
                          var7 == 0) {
                          break L7;
                        }
                        if (var6 == 8 &&
                          var7 == 0) {
                          break L6;
                        }
                        if (15 != var6) {
                          return;
                        }
                        if (var7 == 0) {
                          break L5;
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        this.field_l.a((byte) -119, (tc) (new q(var4Lifetime1, var5Lifetime1)));
                        if (var7 == 0) {
                          return;
                        }
                      }
                      this.field_l.a((byte) -119, (tc) (new ec(var4Lifetime1, var5Lifetime1, param0.e((byte) -104), true)));
                      if (var7 == 0) {
                        return;
                      }
                    }
                    this.field_l.a((byte) -119, (tc) (new ec(var4Lifetime1, var5Lifetime1, param0.e((byte) -104), false)));
                    if (var7 == 0) {
                      return;
                    }
                  }
                  this.a(var4Lifetime1, -47, param0, var5Lifetime1);
                  if (var7 == 0) {
                    return;
                  }
                }
                this.field_l.a((byte) -119, (tc) (new hp(var4Lifetime1, var5Lifetime1)));
                if (var7 == 0) {
                  return;
                }
              }
              this.field_l.a((byte) -119, (tc) (new tr(var4Lifetime1, var5Lifetime1, 0)));
              if (var7 == 0) {
                return;
              }
            }
            this.field_l.a((byte) -119, (tc) (new tr(var4Lifetime1, var5Lifetime1, param0.k(0))));
            if (var7 == 0) {
              return;
            }
          }
          this.field_l.a((byte) -119, (tc) (new kf(var4Lifetime1, var5Lifetime1, param0.k(0), param0.k(param1 ^ -84), param0.k(0), param0.k(0))));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_49_0 = var3;
          stackIn_49_1 = new StringBuilder().append("ha.LC(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(')').toString());
        }
    }

    final int h(int param0, int param1) {
        if (param1 != 0) {
          return -38;
        }
        if (!this.field_wb) {
          return -1;
        }
        return this.field_w[this.field_yb[param0]].c(16648);
    }

    final void a(int param0, String param1, oj param2) {
        String var4 = null;
        try {
          var4 = param2.a((byte) -8, false);
          if (param0 != 0) {
            this.field_D = -23;
          }
          this.j(7);
          var4 = param1 + "\n" + var4;
          this.field_l.b(param0 ^ 98);
          ik.a("Dropping conection: turn: " + this.field_Gb + ", player: " + this.field_gb + "\n" + var4, (byte) 40);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ha.JC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0, int param1) {
        if (!this.field_wb) {
          return -1;
        }
        if (param0 != -9650) {
          return 126;
        }
        return this.field_w[param1].c(16648);
    }

    private final void a(vh param0, int param1) {
        at stackIn_5_0;
        int stackIn_5_1;
        ag stackIn_5_2;
        ag stackIn_5_3;
        int stackIn_5_4;
        int stackIn_5_5;
        int stackIn_5_6;
        int stackIn_5_7;
        int stackIn_5_8;
        int stackIn_5_9;
        int stackIn_5_10;
        ag stackIn_6_2 = null;
        ag stackIn_6_3 = null;
        boolean stackIn_6_11 = false;
        boolean stackIn_9_12 = false;
        int stackIn_11_13;
        int stackIn_11_14;
        boolean stackIn_12_15 = false;
        boolean stackIn_15_16;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
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
        ag stackIn_6_2Lifetime1;
        ag stackIn_6_2Lifetime2;
        ag stackIn_6_2Lifetime3;
        ag stackIn_6_3Lifetime1;
        ag stackIn_6_3Lifetime2;
        ag stackIn_6_3Lifetime3;
        try {
          var3_int = param0.k(0);
          var4 = param0.k(0);
          var5 = param0.k(0);
          var6 = param0.k(~param1);
          var7 = param0.e((byte) -104);
          var8 = var7 >> 8;
          var9 = 255 & var7;
          var8 = (var8 ^ 128) - 128;
          var9 = (var9 ^ 128) - 128;
          var10 = param0.k(0);
          var11 = param0.k(0);
          var12 = param0.k(0);
          var13 = param0.k(0);
          if (param1 > ~(4 & var3_int)) {
            this.field_l.a((byte) -119, (tc) (new md(var5, var6, var8, var9, var10)));
            if (!ArmiesOfGielinor.field_M) {
              return;
            }
          }
          stackIn_5_0 = this.field_l;
          stackIn_5_1 = -119;
          stackIn_5_2 = null;
          stackIn_5_3 = null;
          stackIn_5_4 = var4;
          stackIn_5_5 = var5;
          stackIn_5_6 = var6;
          stackIn_5_7 = var8;
          stackIn_5_8 = var9;
          stackIn_5_9 = var10;
          stackIn_5_10 = var11;
          if ((var3_int & 1) <= 0) {
            stackIn_6_2 = null;
            stackIn_6_3 = null;
            stackIn_6_11 = false;
          } else {
            stackIn_6_2 = null;
            stackIn_6_3 = null;
            stackIn_6_11 = true;
          }
          if ((var3_int & 2) <= 0) {
            stackIn_6_2Lifetime1 = null;
            stackIn_6_3Lifetime1 = null;
            stackIn_9_12 = false;
          } else {
            stackIn_6_2Lifetime1 = null;
            stackIn_6_3Lifetime1 = null;
            stackIn_9_12 = true;
          }
          stackIn_11_13 = 7 & var12;
          stackIn_11_14 = (var12 & 127) >> 4;
          if ((8 & var12) == 0) {
            stackIn_6_2Lifetime2 = null;
            stackIn_6_3Lifetime2 = null;
            stackIn_12_15 = false;
          } else {
            stackIn_6_2Lifetime2 = null;
            stackIn_6_3Lifetime2 = null;
            stackIn_12_15 = true;
          }
          if ((var12 & 128) == 0) {
            stackIn_6_2Lifetime3 = null;
            stackIn_6_3Lifetime3 = null;
            stackIn_15_16 = false;
          } else {
            stackIn_6_2Lifetime3 = null;
            stackIn_6_3Lifetime3 = null;
            stackIn_15_16 = true;
          }
          ((at) (Object) stackIn_5_0).a((byte) stackIn_5_1, (tc) (new ag(stackIn_5_4, stackIn_5_5, stackIn_5_6, stackIn_5_7, stackIn_5_8, stackIn_5_9, stackIn_5_10, stackIn_6_11, stackIn_9_12, stackIn_11_13, stackIn_11_14, stackIn_12_15, stackIn_15_16, var13)));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("ha.ND(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (~eb.a((byte) -95, 85 & this.field_e) == ~(this.field_W / this.field_tb)) {
          return false;
        }
        if (~eb.a((byte) -97, this.field_e & 170) == ~(this.field_W / this.field_tb)) {
          return true;
        }
        var2 = this.i(0, -12710);
        if (param0 <= 68) {
          this.field_t = (at[]) null;
        }
        boolean decompiledFrameRemainder1 = true;
        var3 = this.i(1, -12710);
        if (var2 <= var3) {
          boolean decompiledFrameRemainder0 = true;
          if (var3 == var2) {
            boolean decompiledFrameCompleted0 = true;
            var4 = this.b((byte) 31, 0);
            var5 = this.b((byte) 31, 1);
            if (var5 >= var4) {
              if (~var4 == ~var5) {
                var6 = 0;
                var7 = 0;
                var8 = 0;
                while (true) {
                  if (this.field_W > var8) {
                    var7 = var7 + this.field_H[var8 + 1];
                    var6 = var6 + this.field_H[var8];
                    var8 += 2;
                    if (var9 == 0) {
                      continue;
                    }
                  } else {
                    if (var7 < var6) {
                      return true;
                    }
                  }
                  if (var6 == var7) {
                    return true;
                  }
                  if (var9 == 0) {
                    break;
                  }
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                decompiledFrameRemainder0 = (var9 != 0);
                decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              return true;
            }
          }
          if (decompiledFrameRemainder1) {
            return false;
          }
        }
        return true;
    }

    private final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param1 >= -126) {
            stackIn_3_0 = -8;
            return stackIn_3_0;
          }
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_W <= var3_int))) {
            stackOut_6_0 = vr.a(11987, this.field_lb[var3_int], param0);
            stackIn_13_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var4 == 0) {
              if (stackIn_7_0) {
                stackIn_10_0 = var3_int;
                return stackIn_10_0;
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = -1;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ha.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final int d(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        boolean stackOut_4_0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        var5 = 0;
        if (param2 != 6) {
          return 58;
        }
        var6 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var6 >= this.field_W))) {
          stackOut_4_0 = this.c(var6, param2 ^ -16991, param0);
          stackIn_11_0 = stackOut_4_0 ? 1 : 0;
          stackIn_5_0 = stackOut_4_0;
          if (var7 == 0) {
            if (stackIn_5_0) {
              var4++;
              if (0 == (this.field_e & 1 << var6)) {
                var5++;
              }
            }
            var6++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_11_0 = 0;
        }
        if (stackIn_11_0 == var5) {
          return 0;
        }
        if (this.field_K == null) {
          return param1 * var4 / var5;
        }
        if (~this.field_K.field_w == ~param0) {
          param1 = (int)((float)param1 * this.field_bb);
        }
        return param1;
    }

    final void b(int param0, vh param1) {
        boolean stackIn_10_1 = false;
        int stackIn_13_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_98_0;
        int stackIn_98_1;
        int stackIn_98_2;
        int stackIn_98_3;
        vh stackIn_98_4;
        Object stackIn_98_5;
        int stackIn_98_6;
        boolean stackIn_99_7 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
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
        ne var10_ref_ne = null;
        int var11 = 0;
        jd var12 = null;
        int var13 = 0;
        int stackIn_94_0Lifetime1;
        int stackIn_94_1Lifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var7Lifetime2;
        int var9Lifetime2;
        int var11Lifetime2;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          this.field_jb = param1.i(param0 + 1);
          this.field_O = param1.e((byte) -104);
          this.field_T = new ln[this.field_W];
          var3_int = 0;
          do {
            if (var3_int >= this.field_W) {
              var3_int = param1.k(param0 ^ 0);
              break;
            }
            this.field_T[var3_int] = new ln();
            tb.a(this.field_T[var3_int].field_a, param1, false, this.field_T[var3_int].field_b);
            var3_int++;
          } while (var13 == 0);
          stackIn_10_1 = !((var3_int & 1) <= 0);
          this.field_Bb = stackIn_10_1;
          this.field_hb = (56 & var3_int) >> 3;
          this.field_cb = (6 & var3_int) >> 1;
          stackIn_13_0 = ((var3_int & 128) == 0) ? 0 : 1;
          var4 = stackIn_13_0;
          var5 = 0;
          if (var4 != 0) {
            var5 = param1.k(0);
          }
          this.field_Gb = param1.k(param0 ^ 0);
          this.field_gb = param1.k(param0 + 0);
          this.l(param0 + 0, 0);
          var6 = this.field_Eb.length - 1;
          L7: while (true) {
            if (var6 >= 0) {
              this.field_Eb[var6].i(14);
              var6--;
              if (var13 == 0) {
                continue;
              }
            } else {
              if (this.field_sb <= -1) {
                var6 = 0;
                while (this.field_W > var6) {
                  this.field_mb[var6] = param1.e((byte) -104);
                  var6++;
                  if (var13 != 0) {
                    break L7;
                  }
                }
                if (var13 == 0) {
                  break L7;
                }
              }
              this.field_E[this.field_sb][6] = param1.k(0);
            }
            var6 = 0;
            while (true) {
              if (this.field_c[this.field_sb].length > var6) {
                var7 = param1.k(param0 ^ 0);
                this.field_c[this.field_sb][var6] = var7 >> 4;
                stackIn_38_0 = ~this.field_c[this.field_sb][var6];
                stackIn_38_1 = -8;
                if (var13 == 0) {
                  if (stackIn_38_0 <= stackIn_38_1) {
                    this.field_c[this.field_sb][var6] = -1;
                  } else {
                    this.field_E[this.field_sb][this.field_c[this.field_sb][var6]] = rn.a(15, var7);
                    this.field_D = this.field_D + 1;
                    if (var6 == 2) {
                      this.field_Cb = true;
                    }
                  }
                  var6++;
                  continue;
                }
              } else {
                this.field_H[this.field_sb] = param1.i(1);
                this.field_mb[this.field_sb] = param1.e((byte) -104);
                this.field_Q = param1.k(0);
                stackIn_38_0 = -1;
                stackIn_38_1 = ~this.field_Q;
              }
              boolean decompiledFrameCompleted0 = true;
              if (stackIn_38_0 != stackIn_38_1) {
                if (this.field_B == null) {
                  this.field_B = new int[this.field_W][5];
                }
                var6 = 0;
                while (var6 < 5) {
                  var7Lifetime2 = param1.e((byte) -104);
                  stackIn_50_0 = 65535;
                  stackIn_50_1 = var7Lifetime2;
                  if (var13 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_50_0 == stackIn_50_1) {
                    var7Lifetime2 = -1;
                  }
                  this.field_B[this.field_sb][var6] = var7Lifetime2;
                  var6++;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_50_0 = -1;
                stackIn_50_1 = ~lf.field_i[this.field_Q];
              }
              if (stackIn_50_0 == stackIn_50_1) {
                break;
              }
              this.field_m[this.field_sb] = param1.e((byte) -104);
              break;
            }
            break;
          }
          var6 = 0;
          do {
            if (var6 >= this.field_tb) {
              var6 = 0;
              break;
            }
            this.field_fb[var6] = param1.e((byte) -104);
            var6++;
          } while (var13 == 0);
          L26: while (true) {
            if (var6 < this.field_W) {
              while (true) {
                stackIn_69_0 = ~this.field_t[var6].b(false);
                if (var13 != 0) {
                  break L26;
                }
                if (stackIn_69_0 < -1) {
                  ((jd) (this.field_t[var6].e((byte) 121))).e(-98);
                  continue;
                }
                break;
              }
              var6++;
              continue L26;
            }
            var6 = param1.e((byte) -104);
            stackIn_69_0 = 0;
            break;
          }
          var7Lifetime1 = stackIn_69_0;
          var8 = 0;
          L34: while (true) {
            if (var6 > var8) {
              stackIn_94_0 = ~(this.field_v * this.field_db);
              stackIn_94_1 = ~var7Lifetime1;
              if (var13 != 0) {
                if (stackIn_94_0 <= stackIn_94_1) {
                  break L34;
                }
                var9 = param1.k(0);
                var10 = param1.k(0);
                var11 = param1.k(0);
                return;
              }
              if (stackIn_94_0 < stackIn_94_1) {
                var9Lifetime2 = param1.k(0);
                if ((var9Lifetime2 & 128) != 0) {
                  var7Lifetime1 = var7Lifetime1 + (127 & var9Lifetime2);
                  continue;
                }
                var10_ref_ne = this.field_Eb[var7Lifetime1];
                if (0 >= (1 & var9Lifetime2)) {
                  var10_ref_ne.i(14);
                }
                if (0 < (1 & var9Lifetime2) ||
                  var13 != 0) {
                  var10_ref_ne.a(param0 + 63);
                }
                if ((var9Lifetime2 & 2) > 0) {
                  var10_ref_ne.field_h = param1.k(0);
                  var10_ref_ne.field_b = true;
                  if (var10_ref_ne.field_h == 11) {
                    var11Lifetime2 = param1.k(0);
                    var10_ref_ne.field_g = var11Lifetime2 >> 4 & 15;
                    var10_ref_ne.field_j = var11Lifetime2 & 15;
                  }
                }
                if ((16 & var9Lifetime2) > 0) {
                  var10_ref_ne.field_a = param1.k(0);
                }
                if ((var9Lifetime2 & 4) > 0) {
                  var10_ref_ne.field_m = param1.k(0);
                }
                if ((64 & var9Lifetime2) > 0) {
                  var11Lifetime2 = param1.k(0);
                  var10_ref_ne.b(true, var11Lifetime2);
                }
                var7Lifetime1++;
                var8++;
                continue;
              }
            }
            var6 = param1.e((byte) -104);
            var8 = param0;
            while (true) {
              stackIn_94_0Lifetime1 = ~var8;
              stackIn_94_1Lifetime1 = ~var6;
              if (stackIn_94_0Lifetime1 <= stackIn_94_1Lifetime1) {
                break;
              }
              var9Lifetime1 = param1.k(0);
              var10Lifetime1 = param1.k(0);
              var11Lifetime1 = param1.k(0);
              if (var13 != 0) {
                return;
              }
              stackIn_98_0 = var11Lifetime1 & 127;
              stackIn_98_1 = var5;
              stackIn_98_2 = var10Lifetime1;
              stackIn_98_3 = var9Lifetime1;
              stackIn_98_4 = (vh) (param1);
              stackIn_98_5 = this;
              stackIn_98_6 = -94;
              stackIn_99_7 = ((128 & var11Lifetime1) != 0);
              var12 = mb.a(stackIn_98_0, stackIn_98_1, stackIn_98_2, stackIn_98_3, stackIn_98_4, this, stackIn_98_6, stackIn_99_7);
              this.field_t[var12.field_O].a((byte) -119, (tc) (var12));
              var8++;
            }
            break;
          }
          this.k(-29673);
          this.f(-2);
          this.field_xb = this.f((byte) -82);
          this.b(param0 ^ 2);
          this.a(0, 0, param0 + 0, -1);
          fl.a(this, -118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("ha.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = this.a((byte) 78);
        var3 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 >= this.field_W))) {
          stackIn_7_0 = 0;
          stackIn_7_1 = var2 & 1 << var3;
          if (var4 == 0) {
            if (stackIn_7_0 != stackIn_7_1) {
              this.b(var3, param0);
            }
            var3++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_7_0 = param0 ? 1 : 0;
          stackIn_7_1 = 1;
        }
        if (stackIn_7_0 != stackIn_7_1) {
          this.field_R = 57;
        }
        return;
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        if (param0 > -1 && -1 < param2 && param0 < this.field_v &&
          this.field_db > param2) {
          this.field_Eb[param0 + param2 * this.field_v].b(true, param3);
        }
        if (param1) {
          this.field_kb = true;
        }
    }

    final void f(int param0, int param1, int param2, int param3) {
        jd var5 = this.c(param3, true, param0);
        if (var5 != null &&
          this.c(var5.field_O, -16985, param1)) {
          var5.field_A = 5;
        }
        if (param2 < 117) {
          this.field_Cb = true;
        }
    }

    final int g(int param0) {
        if (param0 == ~this.field_A) {
          return -1;
        }
        return 3 - this.field_A;
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int[] var7;
        int var8;
        int var9;
        int var10;
        int[] var11;
        int[] var12;
        if (param1 != 255) {
          this.a(30, (gn) null, -50);
        }
        var6 = 0;
        var12 = this.a(param3, (byte) 118, param4, param0);
        var11 = var12;
        var7 = var11;
        var8 = bw.field_m[param2][1];
        var9 = b.a(false, param2);
        if (param2 != 74 &&
          param2 >= 8 &&
          0 == (1 << var9 & this.field_a[param0][var8 + 1])) {
          return 4;
        }
        if (!this.f(bw.field_m[param2][8], this.field_H[param0], 0)) {
          var6 = var6 | 1;
        }
        if (bw.field_m[param2][1] == -1) {
          var10 = var12[6];
          if (ArmiesOfGielinor.field_M) {
            var10 = var7[bw.field_m[param2][1]];
          }
        } else {
          var10 = var7[bw.field_m[param2][1]];
        }
        if (!this.a(var10, true, bw.field_m[param2][2])) {
          var6 = var6 | 2;
        }
        return var6;
    }

    final int e(int param0, int param1, int param2) {
        if (this.field_K != null) {
          if (uc.field_d[param2][4] == 4 &&
            0 != uc.field_d[param2][3]) {
            return -this.field_mb[param1] + 1;
          }
          return 0;
        }
        int var4 = -66 % ((param0 + 19) / 35);
        if (this.field_mb[param1] < uc.field_d[param2][1]) {
          return uc.field_d[param2][1] - this.field_mb[param1];
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        L0: {
          boolean decompiledFrameCompleted0 = true;
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param2 > param3) {
            var5 = 0;
            while (this.field_v > var5) {
              if (var11 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var6 = 0;
              while (var6 < this.field_db) {
                this.b(this.field_Eb[var6 * this.field_v + var5].field_k, 12534, var6, var5);
                if (null != this.field_Eb[var5 + var6 * this.field_v].field_c) {
                  this.field_Eb[var5 + var6 * this.field_v].field_c.a((byte) -17);
                }
                var6++;
              }
              var5++;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (param2 <= param3 ||
            var11 != 0)) {
            var5Lifetime1 = param1 - param3;
            var6Lifetime1 = param3 + param1;
            var7 = param0 - param3;
            var8 = param0 + param3;
            if (var5Lifetime1 < 0) {
              var5Lifetime1 = 0;
            }
            if (0 > var7) {
              var7 = 0;
            }
            if (this.field_v <= var6Lifetime1) {
              var6Lifetime1 = -1 + this.field_v;
            }
            if (this.field_db <= var8) {
              var8 = this.field_db - 1;
            }
            var9 = var5Lifetime1;
            while (var6Lifetime1 >= var9) {
              if (var11 != 0) {
                break;
              }
              var10 = var7;
              while (var10 <= var8) {
                this.b(this.field_Eb[var10 * this.field_v + var9].field_k, 12534, var10, var9);
                if (this.field_Eb[var9 + var10 * this.field_v].field_c != null) {
                  this.field_Eb[this.field_v * var10 + var9].field_c.a((byte) 55);
                }
                var10++;
              }
              var9++;
            }
          }
        }
    }

    private final void h(byte param0) {
        oj var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        while (this.field_l.b(false) > 0) {
          var2 = (oj) (this.field_l.a(0));
          var2.a(this, -26661);
          if (var3 != 0) {
            return;
          }
        }
        if (param0 == 108) {
        }
    }

    private final int[] d(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_16_0 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = new int[this.field_W];
        var3 = 0;
        if (param0 != 10326) {
          this.field_Ab = false;
        }
        do {
          if (var3 >= this.field_W) {
            var3 = 0;
            break;
          }
          var2[var3] = this.field_W;
          var3++;
        } while (var5 == 0);
        while (this.field_W > var3) {
          stackIn_16_0 = this.field_n;
          if (var5 != 0) {
            return stackIn_16_0;
          }
          var4 = stackIn_16_0[var3];
          if (var4 != -1 ||
            var5 != 0) {
            var2[var4] = var3;
            var3++;
            continue;
          }
          break;
        }
        return var2;
    }

    final int a(int param0, int param1, int param2, byte param3) {
        int discarded$0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_51_0 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        ne var11 = null;
        ne var12 = null;
        ne var13 = null;
        ne var14 = null;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 > -32) {
          discarded$0 = this.a((String) null, 89);
        }
        var5 = 1;
        while (var5 != 0) {
          var5 = 0;
          stackIn_51_0 = -this.field_ab;
          if (var10 != 0) {
            return stackIn_51_0;
          }
          var6 = stackIn_51_0;
          L3: while (true) {
            stackIn_7_0 = var6;
            stackIn_7_1 = this.field_ab;
            if (stackIn_7_0 < stackIn_7_1) {
              var7 = param2 + var6;
              var8 = param0 + this.field_ab;
              stackIn_7_0 = var7;
              stackIn_7_1 = -1;
              if (stackIn_7_0 > stackIn_7_1 &&
                this.field_v > var7 &&
                var8 > -1 &&
                this.field_db > var8) {
                var5 = 1;
                var11 = this.field_Eb[var7 + this.field_v * var8];
                if (this.c(var11.field_a, -16985, param1) &&
                  var11.field_c == null &&
                  !var11.field_l &&
                  var11.a(false)) {
                  return var7 + var8 * this.field_v;
                }
              }
              var7Lifetime1 = this.field_ab + param2;
              var8Lifetime1 = var6 + param0;
              if (var7Lifetime1 > -1 &&
                this.field_v > var7Lifetime1 &&
                -1 < var8Lifetime1 &&
                var8Lifetime1 < this.field_db) {
                var5 = 1;
                var12 = this.field_Eb[var8Lifetime1 * this.field_v + var7Lifetime1];
                if (this.c(var12.field_a, -16985, param1) &&
                  var12.field_c == null &&
                  !var12.field_l &&
                  var12.a(false)) {
                  return this.field_v * var8Lifetime1 + var7Lifetime1;
                }
              }
              var7Lifetime2 = -var6 + param2;
              var8Lifetime2 = param0 - this.field_ab;
              if (var7Lifetime2 > -1 &&
                this.field_v > var7Lifetime2 &&
                var8Lifetime2 > -1 &&
                var8Lifetime2 < this.field_db) {
                var5 = 1;
                var13 = this.field_Eb[var8Lifetime2 * this.field_v + var7Lifetime2];
                if (this.c(var13.field_a, -16985, param1) &&
                  null == var13.field_c &&
                  !var13.field_l &&
                  var13.a(false)) {
                  return var7Lifetime2 + var8Lifetime2 * this.field_v;
                }
              }
              var7Lifetime3 = param2 - this.field_ab;
              var8Lifetime3 = -var6 + param0;
              if (var7Lifetime3 > -1 &&
                this.field_v > var7Lifetime3 &&
                var8Lifetime3 > -1 &&
                var8Lifetime3 < this.field_db) {
                var5 = 1;
                var14 = this.field_Eb[var7Lifetime3 + this.field_v * var8Lifetime3];
                if (this.c(var14.field_a, -16985, param1) &&
                  var14.field_c == null &&
                  !var14.field_l &&
                  var14.a(false)) {
                  return var8Lifetime3 * this.field_v + var7Lifetime3;
                }
              }
              var6++;
              continue L3;
            }
            break;
          }
          this.field_ab = this.field_ab + 1;
        }
        return -1;
    }

    final void a(vh param0, int param1, int param2) {
        int stackIn_9_0 = 0;
        int stackIn_16_2 = 0;
        vh stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_113_0 = 0;
        jd stackIn_129_0 = null;
        jd stackIn_130_0 = null;
        jd stackIn_134_0 = null;
        jd stackIn_134_1 = null;
        vh stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        int stackIn_140_2 = 0;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        String stackIn_149_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ne var9_ref_ne = null;
        int var9 = 0;
        jd var10 = null;
        int var11 = 0;
        int var12 = 0;
        ne var13 = null;
        jd stackIn_129_0Lifetime1;
        jd stackIn_130_0Lifetime1;
        jd stackIn_134_0Lifetime1;
        jd stackIn_134_1Lifetime1;
        jd var10Lifetime1;
        int stackIn_99_0Lifetime1;
        int stackIn_99_1Lifetime1;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var4_int = 0;
          param0.a((byte) -58, this.field_jb);
          param0.b(true, this.field_O);
          var5 = 0;
          L1: while (true) {
            if (var5 < this.field_W) {
              ir.a(this.field_T[var5].field_a, (byte) 100, param0, this.field_T[var5].field_b);
              var5++;
              if (var12 == 0) {
                continue;
              }
            } else {
              if (!this.field_Bb) {
                stackIn_9_0 = 0;
                break L1;
              }
            }
            stackIn_9_0 = 1;
            break;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          var5Lifetime1 = stackIn_9_0 | this.field_cb << 1 | this.field_hb << 3 | 128;
          param0.b(1, var5Lifetime1);
          param0.b(param1 + 25772, 1);
          param0.b(1, this.field_Gb);
          param0.b(1, this.field_gb);
          if (param2 > -1) {
            param0.b(1, this.field_E[param2][6]);
            var6 = 0;
            L8: while (true) {
              if (var6 < this.field_c[param2].length) {
                stackIn_21_0 = (vh) (param0);
                stackIn_21_1 = param1 + 25772;
                stackIn_21_2 = 0;
                if (var12 == 0) {
                  if (stackIn_21_2 <= this.field_c[param2][var6]) {
                    stackIn_16_2 = this.field_E[param2][this.field_c[param2][var6]];
                  } else {
                    stackIn_16_2 = 0;
                  }
                  ((vh) (Object) stackIn_21_0).b(stackIn_21_1, stackIn_16_2 | this.field_c[param2][var6] << 4);
                  var6++;
                  continue;
                }
              } else {
                if (this.field_H[param2] < 1) {
                  param0.a((byte) -104, 0);
                  if (var12 == 0) {
                    break L8;
                  }
                }
                stackIn_21_0 = (vh) (param0);
                stackIn_21_1 = -107;
                stackIn_21_2 = this.field_H[param2];
              }
              ((vh) (Object) stackIn_21_0).a((byte) stackIn_21_1, stackIn_21_2);
              break;
            }
            boolean decompiledFrameCompleted1 = true;
            param0.b(true, this.field_mb[param2]);
            param0.b(1, this.field_Q);
            if (this.field_Q != 0) {
              var6 = 0;
              while (var6 < 5) {
                param0.b(true, this.field_B[param2][var6]);
                var6++;
                if (var12 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameRemainder0 = (lf.field_i[this.field_Q] != 0))) {
              param0.b(true, this.field_m[param2]);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (!(param2 > -1) ||
            var12 != 0)) {
            var6 = 0;
            while (var6 < this.field_W) {
              param0.b(true, this.field_mb[var6]);
              var6++;
              if (var12 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            var6 = 0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6 >= this.field_tb))) {
            stackIn_48_0 = -2;
            if (var12 == 0) {
              if (stackIn_48_0 < ~this.field_fb[var6]) {
                param0.b(true, 0);
              } else {
                param0.b(true, this.field_fb[var6]);
              }
              var6++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var6 = 0;
            stackIn_48_0 = 0;
          }
          var7 = stackIn_48_0;
          while (true) {
            stackIn_50_0 = this.field_v;
            stackIn_50_1 = var7;
            if (stackIn_50_0 > stackIn_50_1) {
              stackIn_67_0 = 0;
              if (var12 == 0) {
                var8 = stackIn_67_0;
                while (this.field_v > var8) {
                  var9_ref_ne = this.field_Eb[var7 + this.field_v * var8];
                  stackIn_50_0 = 0;
                  stackIn_50_1 = ~var9_ref_ne.field_a;
                  if (stackIn_50_0 > stackIn_50_1 ||
                    var9_ref_ne.field_b ||
                    null != var9_ref_ne.field_c &&
                    var9_ref_ne.l(param1 ^ 25770) ||
                    (var9_ref_ne.c(67) ||
                    var9_ref_ne.c((byte) -79))) {
                    var6++;
                  }
                  var8++;
                }
                var7++;
                continue;
              }
            } else {
              stackIn_67_0 = param1;
            }
            if (stackIn_67_0 != -25771) {
              this.a(89, (String) null, (oj) null);
            }
            if (var4_int != 0) {
              var6 = this.field_db * this.field_v;
            }
            param0.b(true, var6);
            var7 = 0;
            var6 = 0;
            var8Lifetime1 = 0;
            while (true) {
              if (var8Lifetime1 >= this.field_db * this.field_v) {
                var8Lifetime1 = param2;
                stackIn_113_0 = 0;
                break;
              }
              stackIn_113_0 = var4_int;
              if (var12 == 0) {
                stackIn_78_0 = (stackIn_113_0 == 0) ? 0 : 2;
                var9 = stackIn_78_0;
                var13 = this.field_Eb[var8Lifetime1];
                if (var13.c(param1 ^ 25807)) {
                  var9 = var9 | 1;
                }
                if (var13.field_b) {
                  var9 = var9 | 2;
                }
                if (var13.field_a > -1) {
                  var9 = var9 | 16;
                }
                if (null != var13.field_c &&
                  var13.l(-1)) {
                  var9 = var9 | 4;
                }
                if (var13.c((byte) -79)) {
                  var9 = var9 | 64;
                }
                if (var9 > 0) {
                  while (true) {
                    if (var8Lifetime1 > var7) {
                      stackIn_99_0 = var8Lifetime1 - var7;
                      stackIn_99_1 = 127;
                      if (stackIn_99_0 <= stackIn_99_1) {
                        stackIn_97_0 = -var7 + var8Lifetime1;
                      } else {
                        stackIn_97_0 = 127;
                      }
                      var11 = stackIn_97_0;
                      var7 = var7 + var11;
                      param0.b(1, var11 | 128);
                      continue;
                    }
                    param0.b(1, var9);
                    stackIn_99_0Lifetime1 = 0;
                    stackIn_99_1Lifetime1 = var9 & 2;
                    if (stackIn_99_0Lifetime1 < stackIn_99_1Lifetime1) {
                      param0.b(1, var13.field_h);
                      if (var13.field_h == 11) {
                        param0.b(1, var13.field_g << 4 | var13.field_j);
                      }
                    }
                    if ((var9 & 16) > 0) {
                      param0.b(1, var13.field_a);
                    }
                    if ((var9 & 8) <= 0) {
                    }
                    if ((4 & var9) > 0) {
                      param0.b(1, var13.field_m);
                    }
                    var7++;
                    if (0 >= (var9 & 64)) {
                      break;
                    }
                    param0.b(param1 + 25772, var13.field_a);
                    break;
                  }
                }
                var8Lifetime1++;
                continue;
              }
              break;
            }
            var9Lifetime1 = stackIn_113_0;
            L53: while (true) {
              if (var9Lifetime1 < this.field_W) {
                stackIn_129_0 = (jd) (this.field_t[var9Lifetime1].e((byte) 119));
                if (var12 == 0) {
                  var10 = stackIn_129_0;
                  while (var10 != null) {
                    stackIn_134_0 = var10;
                    stackIn_134_1 = this.field_Eb[var10.field_J + var10.field_w * this.field_v].field_c;
                    if (stackIn_134_0 == stackIn_134_1 ||
                      ~var8Lifetime1 == ~var9Lifetime1) {
                      var6++;
                    }
                    var10 = (jd) (this.field_t[var9Lifetime1].a((byte) 123));
                  }
                  var9Lifetime1++;
                  continue;
                } else {
                  while (true) {
                    var10 = stackIn_129_0;
                    while (var10 != null) {
                      stackIn_130_0 = this.field_Eb[var10.field_J + this.field_v * var10.field_w].field_c;
                      var10 = stackIn_130_0;
                    }
                    var9Lifetime1++;
                    break L53;
                  }
                }
              }
              param0.b(true, var6);
              var9Lifetime1 = 0;
              while (var9Lifetime1 < this.field_W) {
                if (var12 != 0) {
                  break;
                }
                stackIn_129_0Lifetime1 = (jd) (this.field_t[var9Lifetime1].e((byte) 114));
                var10Lifetime1 = stackIn_129_0Lifetime1;
                while (var10Lifetime1 != null) {
                  stackIn_130_0Lifetime1 = this.field_Eb[var10Lifetime1.field_J + this.field_v * var10Lifetime1.field_w].field_c;
                  stackIn_134_0Lifetime1 = stackIn_130_0Lifetime1;
                  stackIn_134_1Lifetime1 = var10Lifetime1;
                  if (stackIn_134_0Lifetime1 == stackIn_134_1Lifetime1 ||
                    ~var8Lifetime1 == ~var9Lifetime1) {
                    param0.b(1, var10Lifetime1.field_J);
                    param0.b(1, var10Lifetime1.field_w);
                    stackIn_139_0 = (vh) (param0);
                    stackIn_139_1 = param1 + 25772;
                    if (var10Lifetime1 == this.field_Eb[this.field_v * var10Lifetime1.field_w + var10Lifetime1.field_J].field_c) {
                      stackIn_140_2 = 0;
                    } else {
                      stackIn_140_2 = 128;
                    }
                    ((vh) (Object) stackIn_139_0).b(stackIn_139_1, stackIn_140_2 | var10Lifetime1.field_N);
                    fu.a(29712, var10Lifetime1, param0);
                  }
                  var10Lifetime1 = (jd) (this.field_t[var9Lifetime1].a((byte) 123));
                }
                var9Lifetime1++;
              }
              break;
            }
            this.b(param1 + 25773);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_148_0 = var4;
          stackIn_148_1 = new StringBuilder().append("ha.TD(");
          if (param0 == null) {
            stackIn_149_2 = "null";
          } else {
            stackIn_149_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_148_0), ((StringBuilder) (Object) stackIn_148_1).append(stackIn_149_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int[] param2) {
        RuntimeException runtimeException = null;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_R = param0;
          if (param0 == 1) {
            this.field_gb = param2[0];
          }
          if (param0 != 1 ||
            ArmiesOfGielinor.field_M) {
            this.field_gb = -1;
          }
          stackIn_7_1 = (param1);
          this.field_X = stackIn_7_1;
          this.field_p = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("ha.HB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final oj b(boolean param0) {
        if (0 == this.field_l.b(param0)) {
          return null;
        }
        oj var2 = (oj) (this.field_l.e((byte) 118));
        if (var2 == null) {
          return null;
        }
        return var2;
    }

    final void a(byte param0, int param1, int param2, ne[] param3) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        jd stackIn_53_0;
        jd stackIn_53_1;
        int stackIn_53_2;
        int stackIn_53_3;
        int stackIn_53_4;
        int stackIn_53_5;
        int stackIn_53_6;
        int stackIn_53_7;
        jd stackIn_54_0 = null;
        jd stackIn_54_1 = null;
        int stackIn_54_8 = 0;
        int stackIn_91_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jd var9_ref_jd = null;
        int var9 = 0;
        jd var10_ref_jd = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jd var17 = null;
        vh var18 = null;
        ik var19 = null;
        int var20 = 0;
        ne var21 = null;
        jd var22 = null;
        at var23 = null;
        bb var24 = null;
        ne var25 = null;
        jd var26 = null;
        int[] var30 = null;
        int var6Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param3 == null) {
            return;
          }
          var5_int = param1 * param2;
          if (param3.length != var5_int) {
            return;
          }
          this.field_j = new ul(this, param3, param1, param2);
          this.field_Eb = param3;
          this.field_db = param2;
          this.field_v = param1;
          var6 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_t.length <= var6))) {
            var23 = this.field_t[var6];
            if (var20 == 0) {
              if (var23 != null &&
                var23.b(false) != 0) {
                var24 = new bb(var23);
                var9_ref_jd = (jd) (var24.c(50));
                while (var9_ref_jd != null) {
                  var10_ref_jd = (jd) (var24.b(50));
                  var9_ref_jd.d(70);
                  var9_ref_jd = var10_ref_jd;
                }
              }
              var6++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (param0 >= -69)) {
            this.a(83, -46, -45, (byte) -10);
          }
          var6Lifetime1 = 0;
          while (var6Lifetime1 < this.field_Eb.length) {
            var21 = this.field_Eb[var6Lifetime1];
            var25 = var21;
            if (var20 != 0) {
              return;
            }
            boolean decompiledFrameRemainder3 = true;
            if (var25 != null) {
              var22 = var25.field_c;
              var26 = var22;
              if (var26 != null) {
                var9 = var26.field_O;
                var10 = var26.field_J;
                var11 = var26.field_w;
                var12 = var26.field_N;
                var21.field_c = null;
                var30 = bw.field_m[var12];
                decompiledFrameRemainder3 = !(var9 < 0);
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder3 = !(this.field_W <= var9))) {
                  if (0 != var12) {
                    stackIn_34_0 = var30[4];
                  } else {
                    stackIn_34_0 = 10;
                  }
                  var14 = stackIn_34_0;
                  if (0 != var12) {
                    stackIn_37_0 = var30[4];
                  } else {
                    stackIn_37_0 = 10;
                  }
                  var15 = stackIn_37_0;
                  if ((16 & var26.field_V) != 0) {
                    var15 = var26.field_Y;
                    if (var14 < var15) {
                      var14 = var15;
                    }
                  }
                  stackIn_45_0 = (75 != var12) ? 0 : 1;
                  var16 = stackIn_45_0;
                  if (var16 != 0) {
                    var12 = 34;
                  }
                  if (var12 == 4 &&
                    this.field_hb == 2) {
                    var12 = 81;
                  }
                  stackIn_53_0 = null;
                  stackIn_53_1 = null;
                  stackIn_53_2 = var10;
                  stackIn_53_3 = var11;
                  stackIn_53_4 = var12;
                  stackIn_53_5 = var9;
                  stackIn_53_6 = var14;
                  stackIn_53_7 = var15;
                  if (var12 != 0) {
                    stackIn_54_0 = null;
                    stackIn_54_1 = null;
                    stackIn_54_8 = 0;
                  } else {
                    stackIn_54_0 = null;
                    stackIn_54_1 = null;
                    stackIn_54_8 = 8;
                  }
                  var17 = new jd(stackIn_53_2, stackIn_53_3, stackIn_53_4, stackIn_53_5, stackIn_53_6, stackIn_53_7, stackIn_54_8 | 1, 0, 0, this, 0, 0, -1, false, 0);
                  if (var17.p(-43)) {
                    this.a(var11, var10, 0, 3);
                  }
                  if (var16 != 0) {
                    var17.z(10);
                    var17.field_W = true;
                  }
                  var17.field_H = var26.field_H;
                  var17.field_V = var26.field_V;
                  var17.field_E = var26.field_E;
                  if (var26.field_K != null) {
                    var17.field_K = var26.field_K;
                  }
                  if (var26.c(false) &&
                    this.field_K != null) {
                    this.field_V = false;
                  }
                  if (var26.field_q >= 0) {
                    if (uc.field_d[var22.field_q][4] == 5) {
                      throw new IllegalStateException("");
                    }
                    var18 = new vh(4);
                    var18.b(true, var26.field_q);
                    var18.b(1, var26.field_J);
                    var18.b(1, var26.field_w);
                    var18.field_q = 0;
                    var19 = bo.a(var26.field_O, var18, 4368051);
                    if (var19 != null) {
                      var19.a(var26.field_O, this, 26123);
                    }
                  }
                  var21.field_c = var17;
                  this.field_t[var9].a((byte) -119, (tc) (var17));
                }
              }
              if ((decompiledFrameRemainder3) &&
                (var25.field_a > -1)) {
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder2 = true;
                boolean decompiledFrameRemainder0 = true;
                var10Lifetime1 = var25.field_h;
                if (var10Lifetime1 != 11 ||
                  var20 != 0) {
                  if ((7 != var10Lifetime1) &&
                    (decompiledFrameRemainder0 = (var10Lifetime1 != 14 ||
                    var20 != 0)) &&
                    (decompiledFrameRemainder0 = (var10Lifetime1 != 9 ||
                    var20 != 0))) {
                    decompiledFrameRemainder1 = (var10Lifetime1 == 8);
                    decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
                  }
                } else {
                  if (this.field_K != null &&
                    ~this.field_K.field_w != ~var25.field_a) {
                    stackIn_91_0 = 1;
                  } else {
                    stackIn_91_0 = 0;
                  }
                  var9Lifetime1 = stackIn_91_0;
                  if (var9Lifetime1 != 0) {
                    var21.field_j = this.field_E[var21.field_a][var21.field_g];
                  }
                }
                if ((decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  dupTemp$0 = this.field_z[this.o(var21.field_a, -1)];
                  dupTemp$0[0] = dupTemp$0[0] + 1;
                  decompiledFrameRemainder3 = false;
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  dupTemp$1 = this.field_z[this.o(var21.field_a, -1)];
                  dupTemp$1[1] = dupTemp$1[1] + 1;
                  decompiledFrameRemainder3 = false;
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder1)) {
                  dupTemp$2 = this.field_z[this.o(var21.field_a, -1)];
                  dupTemp$2[2] = dupTemp$2[2] + 1;
                  decompiledFrameRemainder3 = false;
                }
                if ((decompiledFrameRemainder3) &&
                  (!var25.e((byte) -122))) {
                  var25.field_a = -1;
                }
              }
            }
            var6Lifetime1++;
          }
          this.k(-29673);
          this.f(-2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("ha.OB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
    }

    private final void a(int param0, ne param1, byte param2, int param3, gn param4, int param5) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (!this.a(param0, param1, param2 ^ -88)) {
            return;
          }
          if (!param1.field_b &&
            !param1.c(param2 - 35) &&
            !param1.c((byte) -79) &&
            -1 == param1.field_a) {
            return;
          }
          param4.a(new String[]{"cell at ", ci.c(param5, 0, param3), ": "}, (byte) -95);
          param4.a(0, 2);
          if (param1.field_b) {
            param4.a(new String[]{"changed type: ", Integer.toString(param1.field_h)}, (byte) -106);
          }
          if (param1.c(125)) {
            param4.a((byte) 19, "bones");
          }
          if (param1.c((byte) -79)) {
            param4.a(new String[]{"fort: owner: ", this.e(param1.b((byte) -54), -1)}, (byte) -57);
          }
          if (param1.field_a != -1) {
            param4.a(new String[]{"owner: ", this.e(param1.field_a, param2 ^ 39)}, (byte) -93);
          }
          param4.a(0, -2);
          if (param2 != -40) {
            this.a((byte) -3, (vh) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("ha.FC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param5).append(')').toString());
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != -2) {
          this.field_d = (int[]) null;
        }
        this.field_s[1] = 0;
        this.field_s[2] = 0;
        this.field_s[0] = 0;
        if (null == this.field_Eb) {
          return;
        }
        var2 = 0;
        while (var2 < this.field_Eb.length) {
          var3 = this.field_Eb[var2].field_h;
          if (var4 == 0) {
            switch ((var4 == 0
              || var3 == 7
              || var3 == 8
              ) ? var3 : -1) {
              case 7:
                this.field_s[0] = this.field_s[0] + 1;
                {
                  break;
                }
              case 14:
              case 9:
                this.field_s[1] = this.field_s[1] + 1;
                {
                  break;
                }
              case 8:
                this.field_s[2] = this.field_s[2] + 1;
              default:
                break;
            }
            var2++;
            continue;
          }
          break;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int[] var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int[] var10Lifetime1;
        int[] var10Lifetime1Lifetime1;
        var12 = this.a(param0, (byte) 37, param3, param4);
        var11 = var12;
        var10 = var11;
        var6 = var10;
        var7 = bw.field_m[param2][1];
        var8 = b.a(false, param2);
        if (param2 != 74 &&
          param2 >= 8 &&
          0 == (this.field_a[param4][1 + var7] & 1 << var8)) {
          return false;
        }
        if (this.f(bw.field_m[param2][8], this.field_H[param4], 0)) {
          var10Lifetime1 = var6;
          if (-1 == bw.field_m[param2][1]) {
            var9 = var12[6];
            if (ArmiesOfGielinor.field_M) {
              var10Lifetime1Lifetime1 = var6;
              var9 = var10Lifetime1Lifetime1[bw.field_m[param2][1]];
            }
          } else {
            var10Lifetime1Lifetime1 = var6;
            var9 = var10Lifetime1Lifetime1[bw.field_m[param2][1]];
          }
          if (this.a(var9, true, bw.field_m[param2][2])) {
            return true;
          }
        }
        if (param1 == -26813) {
          return false;
        }
        this.field_xb = 58;
        return false;
    }

    private final int b(byte param0, int param1) {
        if (param0 != 31) {
          return -126;
        }
        return this.field_z[param1][0] * 10 - (-(5 * this.field_z[param1][1]) - 2 * this.field_z[param1][2]);
    }

    private final boolean a(int param0, ne param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 94 % ((-56 - param2) / 50);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ha.TB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(jd param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 14336) {
            stackIn_4_0 = pj.a(this.field_v, this.field_Eb, param3, param4, param6, this.field_db, this.o(param6, -1), param0, param5, param1, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = 112;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ha.HC(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, vh param1, byte param2) {
        try {
          if (param2 > -71) {
            this.field_W = 26;
          }
          if (this.field_Z == null) {
            param0 -= 2;
            this.field_Z = new vh(param1.e((byte) -104));
          }
          param1.a(0, param0, this.field_Z.field_q, this.field_Z.field_o);
          this.field_Z.field_q = this.field_Z.field_q + param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ha.AC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(int param0, int param1, int param2, int param3) {
        int var5 = -1;
        if (param3 >= 0) {
          var5 = this.o(param3, param0 ^ -32);
        }
        if (param0 != 31) {
          this.c(-23, -102);
        }
        return this.field_Eb[param2 + this.field_v * param1].a((byte) 97, param3, var5);
    }

    private final void a(vh param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          param0.k(0);
          if (!param1) {
            this.f(-120);
          }
          var3_int = param0.k(0);
          var4 = param0.k(0);
          var5 = param0.k(0);
          var6 = param0.k(0);
          var7 = 31 & var4;
          var7 = (16 ^ var7) - 16;
          this.field_l.a((byte) -119, (tc) (new mb(var3_int, var5, var6, var7, var4 >> 5)));
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ha.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int b(int param0, jd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1.field_O;
          if (param1.field_I) {
            var3_int = var3_int ^ 5637;
          }
          if (param1.field_W) {
            var3_int = var3_int ^ 757314;
          }
          var3_int = var3_int ^ 12643 * param1.field_B;
          if (param1.field_s) {
            var3_int = var3_int ^ 76756163;
          }
          if (param1.field_D) {
            var3_int = var3_int ^ 847523;
          }
          var3_int = var3_int ^ 38 * param1.field_J;
          var3_int = var3_int ^ param1.field_w * 391;
          var3_int = var3_int ^ param1.field_A * 874;
          var3_int = var3_int ^ 23874 * param1.field_N;
          var3_int = var3_int ^ param1.field_Y * 584668;
          var3_int = var3_int ^ 445235 * param1.field_t;
          if (param0 >= -6) {
            this.field_rb = (int[]) null;
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ha.TC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void e(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        if (param0 != 14) {
          discarded$0 = this.a(-18, (ne) null, 8);
        }
        jd var5 = this.c(param3, true, param1);
        if (var5 != null &&
          this.c(var5.field_O, -16985, param2)) {
          var5.field_I = false;
        }
    }

    final int a(byte param0, int param1, int param2) {
        if (param0 != 11) {
          this.a((byte) 47, 3, 37, -46);
        }
        return 0;
    }

    final void d(int param0, int param1, int param2, int param3) {
        if (!this.field_b) {
          return;
        }
        if (param2 < 68) {
          return;
        }
        if (this.field_d[param3] < param1) {
          this.field_d[param3] = param1;
          this.field_N[param3] = param0;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int var5 = 0;
        jd var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_gb > -1) {
          var6 = (jd) (this.field_t[this.field_gb].e((byte) 91));
          while (true) {
            if (var6 != null) {
              var6.m((byte) -36);
              var6 = (jd) (this.field_t[this.field_gb].a((byte) 123));
              if (var5 == 0) {
                continue;
              }
            } else {
              this.field_mb[this.field_gb] = this.field_mb[this.field_gb] + 1;
              this.field_gb = param1;
              this.field_Gb = param2;
              this.a(false, false, 0);
              this.a(1);
            }
            break;
          }
          if (var5 != 0) {
            this.field_gb = param1;
            this.field_Gb = param2;
          }
        } else {
          this.field_gb = param1;
          this.field_Gb = param2;
        }
        this.a(param1, (byte) 111);
        if (param0) {
          return;
        }
        this.field_n = (int[]) null;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, int param8, int param9) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_84_0 = 0;
        at stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        nw stackIn_112_2 = null;
        nw stackIn_112_3 = null;
        jd stackIn_112_4 = null;
        int stackIn_112_5 = 0;
        nw stackIn_114_2;
        nw stackIn_114_3;
        nw stackIn_115_2;
        nw stackIn_115_3;
        boolean stackIn_115_6;
        at stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        nw stackIn_119_2 = null;
        nw stackIn_119_3 = null;
        jd stackIn_119_4 = null;
        int stackIn_119_5 = 0;
        nw stackIn_121_2;
        nw stackIn_121_3;
        nw stackIn_122_2 = null;
        nw stackIn_122_3 = null;
        boolean stackIn_122_6 = false;
        int stackIn_130_0 = 0;
        int stackIn_136_0 = 0;
        jd var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        jd var20 = null;
        jd var21 = null;
        nw stackIn_112_2Lifetime1;
        nw stackIn_112_3Lifetime1;
        nw stackIn_114_2Lifetime1;
        nw stackIn_114_3Lifetime1;
        nw stackIn_115_2Lifetime1;
        nw stackIn_115_3Lifetime1;
        nw stackIn_119_2Lifetime1;
        nw stackIn_119_3Lifetime1;
        nw stackIn_121_2Lifetime1;
        nw stackIn_121_3Lifetime1;
        nw stackIn_122_2Lifetime1;
        nw stackIn_122_3Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        var19 = ArmiesOfGielinor.field_M ? 1 : 0;
        var20 = this.c(param0, true, param3);
        var21 = var20;
        var12 = this.c(param0 + param4, true, param1 + param3);
        var13 = Math.abs(param1) + Math.abs(param4);
        if (var12 != null &&
          var21 != null) {
          var14 = 0;
          var15 = 0;
          stackIn_7_0 = (var13 != 1) ? 0 : 1;
          boolean decompiledFrameRemainder2 = true;
          var16 = stackIn_7_0;
          if (var16 != 0) {
            if (var21.g(0) == 4) {
              if (var21.j(20640) == 4 &&
                (var21.d(2, 122) & 1) == 1) {
                stackIn_13_0 = 1;
              } else {
                stackIn_13_0 = 0;
              }
              var14 = stackIn_13_0;
              decompiledFrameRemainder2 = (var19 != 0);
            }
            if (decompiledFrameRemainder2) {
              if (var21.g(0) == 3) {
                if (2 == var21.j(20640) &&
                  (var21.d(2, -90) & 1) == 1) {
                  stackIn_19_0 = 1;
                } else {
                  stackIn_19_0 = 0;
                }
                var14 = stackIn_19_0;
                decompiledFrameRemainder2 = (var19 != 0);
              }
              if (decompiledFrameRemainder2) {
                if (var21.field_N == 34 &&
                  var21.field_W) {
                  if (var21.j(20640) == 3 &&
                    (1 & var21.d(2, -97)) == 1) {
                    stackIn_26_0 = 1;
                  } else {
                    stackIn_26_0 = 0;
                  }
                  var14 = stackIn_26_0;
                  decompiledFrameRemainder2 = (var19 != 0);
                }
                if (decompiledFrameRemainder2) {
                  if (var21.j(20640) == 0 &&
                    (1 & var21.d(2, 121)) == 1) {
                    stackIn_31_0 = 1;
                  } else {
                    stackIn_31_0 = 0;
                  }
                  var14 = stackIn_31_0;
                }
              }
            }
          }
          if ((decompiledFrameRemainder2) &&
            (var16 == 0 ||
            var19 != 0)) {
            if (34 == var21.field_N &&
              var21.field_W) {
              if (var21.j(20640) == 3 &&
                1 == (1 & var21.d(2, 99))) {
                stackIn_38_0 = 1;
              } else {
                stackIn_38_0 = 0;
              }
              var14 = stackIn_38_0;
              decompiledFrameRemainder2 = (var19 != 0);
            }
            if (decompiledFrameRemainder2) {
              if (var21.field_N == 81 ||
                var21.field_N == 4 ||
                74 == var21.field_N) {
                if (3 == var21.j(20640) &&
                  1 == (var21.d(2, -112) & 1)) {
                  stackIn_47_0 = 1;
                } else {
                  stackIn_47_0 = 0;
                }
                var14 = stackIn_47_0;
                decompiledFrameRemainder2 = (var19 != 0);
              }
              if (decompiledFrameRemainder2) {
                boolean decompiledSharedTail0 = (3 != var21.g(0));
                if (!decompiledSharedTail0) {
                  if (var21.j(20640) == 2 &&
                    (var21.d(2, -123) & 1) == 1) {
                    stackIn_53_0 = 1;
                  } else {
                    stackIn_53_0 = 0;
                  }
                  var14 = stackIn_53_0;
                  decompiledSharedTail0 = (var19 != 0);
                }
                if (decompiledSharedTail0) {
                  if (1 == var21.j(20640) &&
                    (1 & var21.d(2, 116)) == 1) {
                    stackIn_58_0 = 1;
                  } else {
                    stackIn_58_0 = 0;
                  }
                  var14 = stackIn_58_0;
                }
              }
            }
          }
          boolean decompiledFrameRemainder1 = true;
          var17 = -37 / ((35 - param5) / 34);
          if (var16 != 0) {
            if (4 == var12.g(0)) {
              if (4 == var12.j(20640) &&
                1 == (var12.d(2, -117) & 1)) {
                stackIn_65_0 = 1;
              } else {
                stackIn_65_0 = 0;
              }
              var15 = stackIn_65_0;
              decompiledFrameRemainder1 = (var19 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (var12.g(0) != 3) {
                if (var12.field_N != 34 ||
                  !var12.field_W) {
                  if (var12.j(20640) == 0 &&
                    (1 & var12.d(2, -94)) == 1) {
                    stackIn_74_0 = 1;
                  } else {
                    stackIn_74_0 = 0;
                  }
                  var15 = stackIn_74_0;
                  if (var19 != 0) {
                    if (var12.j(20640) == 3 &&
                      1 == (var12.d(2, -114) & 1)) {
                      stackIn_79_0 = 1;
                    } else {
                      stackIn_79_0 = 0;
                    }
                    var15 = stackIn_79_0;
                    if (var12.j(20640) == 2 &&
                      1 == (1 & var12.d(2, 117))) {
                      stackIn_84_0 = 1;
                    } else {
                      stackIn_84_0 = 0;
                    }
                    var15 = stackIn_84_0;
                  }
                } else {
                  if (var12.j(20640) == 3 &&
                    1 == (var12.d(2, -114) & 1)) {
                    stackIn_79_0 = 1;
                  } else {
                    stackIn_79_0 = 0;
                  }
                  var15 = stackIn_79_0;
                  if (var19 != 0) {
                    if (var12.j(20640) == 2 &&
                      1 == (1 & var12.d(2, 117))) {
                      stackIn_84_0 = 1;
                    } else {
                      stackIn_84_0 = 0;
                    }
                    var15 = stackIn_84_0;
                  }
                }
              } else {
                if (var12.j(20640) == 2 &&
                  1 == (1 & var12.d(2, 117))) {
                  stackIn_84_0 = 1;
                } else {
                  stackIn_84_0 = 0;
                }
                var15 = stackIn_84_0;
              }
            }
          }
          if (param2 &&
            var12.field_t < 99 &&
            var21.r(-40)) {
            this.field_l.a(750, new st(var12, 4));
          }
          if (param6 &&
            var21.field_t < 99 &&
            var12.r(-40)) {
            this.field_l.a(750, new st(var21, 4));
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (var16 != 0 &&
            var12.field_C) {
            var18 = 0;
            while (var18 < param8) {
              this.field_l.a(750, new st(var12, 1));
              var18++;
              if (var19 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) && (var16 != 0 &&
            var21.field_C)) {
            var18Lifetime2 = 0;
            while (var18Lifetime2 < param7) {
              this.field_l.a(750, new st(var21, 1));
              var18Lifetime2++;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            L47: {
              L48: {
                stackIn_112_0 = this.field_l;
                stackIn_112_1 = 750;
                stackIn_112_2 = null;
                stackIn_112_3 = null;
                stackIn_112_4 = var21;
                stackIn_112_5 = param8;
                if (!var12.y(-113)) {
                  stackIn_114_2 = null;
                  stackIn_114_3 = null;
                  if (var15 == 0) {
                    break L48;
                  }
                  stackIn_112_2Lifetime1 = null;
                  stackIn_112_3Lifetime1 = null;
                }
                stackIn_114_2Lifetime1 = null;
                stackIn_114_3Lifetime1 = null;
                if (param8 > 0) {
                  stackIn_115_2 = null;
                  stackIn_115_3 = null;
                  stackIn_115_6 = true;
                  break L47;
                }
              }
              stackIn_115_2Lifetime1 = null;
              stackIn_115_3Lifetime1 = null;
              stackIn_115_6 = false;
            }
            ((at) (Object) stackIn_112_0).a(stackIn_112_1, new nw(stackIn_112_4, stackIn_112_5, stackIn_115_6));
          }
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder0 = true;
          stackIn_119_0 = this.field_l;
          stackIn_119_1 = 750;
          stackIn_119_2 = null;
          stackIn_119_3 = null;
          stackIn_119_4 = var12;
          stackIn_119_5 = param7;
          if (!var21.y(-119)) {
            stackIn_121_2 = null;
            stackIn_121_3 = null;
            decompiledFrameRemainder0 = (var14 != 0);
            if (decompiledFrameRemainder0) {
              stackIn_119_2Lifetime1 = null;
              stackIn_119_3Lifetime1 = null;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_121_2Lifetime1 = null;
            stackIn_121_3Lifetime1 = null;
            if (param7 > 0) {
              stackIn_122_2 = null;
              stackIn_122_3 = null;
              stackIn_122_6 = true;
              decompiledFrameRemainder3 = false;
            }
          }
          if (decompiledFrameRemainder3) {
            stackIn_122_2Lifetime1 = null;
            stackIn_122_3Lifetime1 = null;
            stackIn_122_6 = false;
          }
          ((at) (Object) stackIn_119_0).a(stackIn_119_1, new nw(stackIn_119_4, stackIn_119_5, stackIn_122_6));
          var21.field_B = var21.field_B - 1;
          if (this.field_b) {
            var12.field_M = var12.field_M + 1;
            var21.field_m = var21.field_m + 1;
            this.d(var21.field_O, var21.field_m, 112, 7);
            this.d(var12.field_O, var12.field_M, 79, 6);
            var18Lifetime1 = 0;
            if (param2) {
              this.field_g[var12.field_O] = this.field_g[var12.field_O] + 1;
              this.d(var12.field_O, this.field_g[var12.field_O], 120, 4);
              if (var21.field_E == 10 &&
                11 == var12.field_E) {
                stackIn_130_0 = 1;
              } else {
                stackIn_130_0 = 0;
              }
              var18Lifetime1 = stackIn_130_0;
            }
            if (param6) {
              this.field_g[var20.field_O] = this.field_g[var20.field_O] + 1;
              this.d(var21.field_O, this.field_g[var20.field_O], 91, 4);
              if (var12.field_E == 10 &&
                var21.field_E == 11) {
                stackIn_136_0 = 1;
              } else {
                stackIn_136_0 = 0;
              }
              var18Lifetime1 = stackIn_136_0;
            }
            if (var18Lifetime1 != 0 &&
              this.field_K != null &&
              this.field_K.field_G.field_r == 2) {
              if (this.field_K.field_v != 5) {
                return;
              }
              rd.field_j.a(50, (byte) 30, 205);
            }
          }
          return;
        }
        boolean discarded$0 = this.a(var21, param1, param7, param2, param0, -1, param4, var12, param3, param8, param9, param6, 0);
    }

    final void l(int param0, int param1) {
        int dupTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        RuntimeException stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        RuntimeException stackIn_8_1 = null;
        String stackIn_8_2 = null;
        lo var3;
        int var4_int;
        ne[] var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != param1) {
          this.field_cb = 0;
        }
        if (this.field_cb >= 0 &&
          hs.field_G.length > this.field_cb) {
          dupTemp$0 = hs.field_G[this.field_cb];
          this.field_v = dupTemp$0;
          this.field_db = dupTemp$0;
          if ((0 > this.field_cb ||
            2 < this.field_cb) && param1 == 0) {
            rn.a(-118, this);
            if (var6 == 0) {
              return;
            }
          }
          L5: {
            if (param1 != 0) {
              var3 = ew.field_e.a((byte) 59, param1 - 1);
              if (var6 == 0) {
                break L5;
              }
            }
            if (null == this.field_K) {
              var4_int = ew.field_e.a(param0 + 0, this.field_cb, this.field_hb, this.field_W);
              if (var4_int <= 0) {
                throw new RuntimeException((String) null);
              }
              var5 = this.field_jb % var4_int;
              var3 = ew.field_e.a(this.field_W, 4136, this.field_cb, this.field_hb, var5);
              if (var3 == null) {
                throw new RuntimeException((String) null);
              }
              if (var6 != 0) {
                var3 = this.field_K.a(-114);
              }
            } else {
              var3 = this.field_K.a(-114);
            }
          }
          var4 = var3.a(param0 - 95, this);
          this.a((byte) -104, var3.field_l, var3.field_n, var4);
          return;
        }
        stackIn_7_0 = null;
        stackIn_7_1 = null;
        if (!this.field_x) {
          stackIn_8_0 = null;
          stackIn_8_1 = null;
          stackIn_8_2 = null;
        } else {
          stackIn_8_0 = null;
          stackIn_8_1 = null;
          stackIn_8_2 = "That's not a valid map size: " + this.field_cb;
        }
        throw new RuntimeException(stackIn_8_2);
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -64) {
            stackIn_2_0 = -101;
            return stackIn_2_0;
          }
          var3_int = this.o(this.field_sb, param1 ^ 63);
          if (var3_int < 0) {
            var4 = this.a(param0, -128);
            var3_int = this.o(var4, -1);
            if (var3_int < 0) {
              var3_int = 2;
            }
          }
          stackIn_9_0 = op.field_c[0][var3_int];
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ha.OC(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
          this.a(127, (jd) null);
        }
        int var4 = param2 <= param0 ? 1 : 0;
        return var4 != 0;
    }

    private final boolean a(jd param0, int param1, int param2, boolean param3, int param4, int param5, int param6, jd param7, int param8, int param9, int param10, boolean param11, int param12) {
        StringBuilder stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        StringBuilder stackIn_5_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var14 = null;
        String var15 = null;
        String var16 = null;
        try {
          stackIn_2_0 = new StringBuilder().append("applycombat: ").append(param12).append(", player: ").append(this.field_gb).append(", turn: ").append(this.field_Gb).append(", att: ");
          if (param0 == null) {
            stackIn_3_1 = -1;
          } else {
            stackIn_3_1 = param0.field_N;
          }
          stackIn_5_0 = ((StringBuilder) (Object) stackIn_2_0).append(stackIn_3_1).append(", def: ");
          if (param7 != null) {
            stackIn_6_1 = param7.field_N;
          } else {
            stackIn_6_1 = -1;
          }
          var16 = ((StringBuilder) (Object) stackIn_5_0).append(stackIn_6_1).toString();
          if (param5 != -1) {
            return false;
          }
          var15 = "\ncx: " + param8 + ", cy: " + param4 + ", ax: " + param1 + ", ay: " + param6 + ", adam: " + param2 + ", ddam: " + param9 + ", creature: " + param10 + ", attdie: " + param3 + ", defdie: " + param11;
          if (this.field_F) {
            af.a((Throwable) null, 115, var16 + var15);
            return true;
          }
          this.field_o = true;
          System.out.println(var16 + var15);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_16_0 = var14;
          stackIn_16_1 = new StringBuilder().append("ha.JA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final int k(int param0, int param1) {
        float stackIn_5_0 = 0.0f;
        float var3;
        int var4;
        if (this.field_K != null &&
          this.field_K.field_w == param1) {
          stackIn_5_0 = this.field_bb;
        } else {
          stackIn_5_0 = 1.0f;
        }
        var3 = stackIn_5_0;
        var4 = (int)((float)(this.field_z[this.field_yb[param1]][2] * 25) * var3) + ((int)(var3 * (float)(this.field_z[this.field_yb[param1]][1] * 75)) + (int)(var3 * (float)(50 * this.field_z[this.field_yb[param1]][0])));
        if (param0 <= -95) {
          return var4;
        }
        return 115;
    }

    final int g(int param0, int param1, int param2) {
        int var4;
        if (param2 >= 0 &&
          param0 >= 0 &&
          param2 < this.field_v &&
          this.field_v > param0) {
          if (param1 > -28) {
            this.field_Fb = false;
          }
          var4 = this.field_Eb[param2 + this.field_v * param0].field_h;
          if (6 == var4) {
            var4 = 4;
          }
          return var4;
        }
        return -1;
    }

    final boolean c(int param0, int param1, int param2) {
        boolean stackIn_11_0 = false;
        if (param1 != -16985) {
          this.field_o = false;
        }
        if (param0 != -1 &&
          param2 != -1 &&
          param0 != 255) {
          if (param2 == 255) {
            return false;
          }
          stackIn_11_0 = (this.field_yb[param2] == this.field_yb[param0]);
          return stackIn_11_0;
        }
        return false;
    }

    private final void a(byte param0, vh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var4 = -72 % ((-9 - param0) / 57);
          var3_int = param1.e((byte) -104) & 8191;
          var5 = param1.k(0);
          var6 = param1.k(0);
          var13 = new int[var3_int];
          var12 = var13;
          var7 = var12;
          var8 = 0;
          L0: while (true) {
            stackIn_3_0 = var3_int;
            if (stackIn_3_0 > 0) {
              var9 = param1.k(0);
              if (var11 != 0) {
                return;
              }
              var10 = 0;
              while (var10 < 4) {
                stackIn_3_0 = var3_int;
                if (stackIn_3_0 > 0) {
                  var7[var8] = rn.a(3, var9);
                  var9 = var9 >> 2;
                  var8++;
                  var3_int--;
                  var10++;
                  continue;
                }
                break;
              }
              continue L0;
            }
            break;
          }
          this.field_l.a((byte) -119, (tc) (new kr(var5, var6, var13)));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ha.MD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final boolean f(int param0, int param1, int param2) {
        int var4 = param1 >= param0 ? 1 : 0;
        if (param2 != 0) {
          this.e(73, 49, -89);
        }
        return var4 != 0;
    }

    private final int b(byte param0) {
        int var2 = 1 + this.field_vb;
        if (this.field_cb < 0 ||
          hs.field_G.length <= this.field_cb) {
          return var2 * nr.field_a[0];
        }
        int var3 = nr.field_a[this.field_cb] * var2;
        if (this.field_K != null) {
          var3 = 9999;
        }
        if (param0 != 32) {
          this.field_Db = -41;
        }
        return var3;
    }

    final String e(int param0, int param1) {
        if (-1 > param0) {
          return "id: " + param0;
        }
        if (param1 < ~param0) {
          return "none";
        }
        return this.field_lb[param0];
    }

    final void a(vh param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var3_int = param0.field_o[param0.field_q];
          var4 = (var3_int & 237) >> 5;
          switch ((var5 == 0
            || var4 == 3
            || var4 == 5
            || var4 == 6
            ) ? var4 : -1) {
            case 0:
              this.a((byte) 91, param0);
              if (var5 == 0) {
                break;
              }
            case 1:
              this.a(param0, true);
              if (var5 == 0) {
                break;
              }
            case 3:
              this.a(param0, -1);
              if (var5 == 0) {
                break;
              }
            case 5:
              this.a(-30531, param0);
              if (var5 == 0) {
                break;
              }
            case 6:
              this.b(param0, (byte) -84);
            default:
              break;
          }
          if (param1 >= -50) {
            this.a(true, 103, -100, 43, -48, -87, -117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("ha.SA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param3 != 0) {
          return -22;
        }
        return 0;
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_22_0 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!this.field_V) {
          return false;
        }
        if (param0 < 45) {
          this.a(-102, (jd) null);
        }
        var2 = 0;
        while (this.field_W > var2) {
          stackIn_22_0 = 0;
          if (var3 != 0) {
            return stackIn_22_0 != 0;
          }
          if (stackIn_22_0 > var2) {
            return false;
          }
          if (var2 >= this.field_mb.length) {
            return false;
          }
          if (0 == (1 << var2 & this.field_e) ||
            var3 != 0) {
            if (this.field_mb[var2] > this.field_O) {
              return true;
            }
            if (this.field_mb[var2] < this.field_O) {
              return false;
            }
          }
          var2++;
        }
        return true;
    }

    final int a(int param0, int param1, jd param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_Eb[param0].c((byte) -79) &&
            this.c(this.field_Eb[param0].b((byte) -88), -16985, param2.field_O)) {
            stackIn_4_0 = 60;
            return stackIn_4_0;
          }
          if (0 != (8 & this.b(31, param2.field_w, param2.field_J, param2.field_O))) {
            stackIn_7_0 = 100;
            return stackIn_7_0;
          }
          stackIn_11_0 = (bw.field_m[param2.field_N][1] != 2) ? 0 : 1;
          var4_int = stackIn_11_0;
          if (var4_int != 0 &&
            this.field_Eb[param0].field_h == 3) {
            param0 = 70;
            if (ArmiesOfGielinor.field_M) {
              param0 = ri.field_c[this.field_Eb[param0].field_h];
            }
          } else {
            param0 = ri.field_c[this.field_Eb[param0].field_h];
          }
          if (param1 != -4) {
            this.field_Bb = false;
          }
          stackIn_18_0 = param0;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ha.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void k(int param0) {
        boolean stackIn_39_0 = false;
        int stackIn_46_0 = 0;
        boolean stackIn_49_0 = false;
        int stackIn_66_0 = 0;
        int stackIn_76_0 = 0;
        boolean stackIn_88_0 = false;
        boolean stackOut_38_0;
        boolean stackOut_48_0;
        boolean stackOut_87_0;
        int var2 = 0;
        int var3 = 0;
        boolean[] var4 = null;
        boolean[] var5 = null;
        Vector[] var6 = null;
        int var7_int = 0;
        boolean[] var7 = null;
        ne var8_ref_ne = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        jd var12 = null;
        jd[] var13 = null;
        jd var14 = null;
        jd[] var15 = null;
        int stackIn_76_0Lifetime1;
        int var10Lifetime1;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_P = new tt(this.field_W);
        var2 = 0;
        var3 = 0;
        var4 = new boolean[this.field_W];
        var5 = new boolean[this.field_W];
        var6 = new Vector[this.field_W];
        var7_int = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var7_int >= this.field_Eb.length))) {
          var8_ref_ne = this.field_Eb[var7_int];
          if (var11 == 0) {
            if (var8_ref_ne != null) {
              var12 = var8_ref_ne.field_c;
              var14 = var12;
              if (var14 != null) {
                if (var14.c(false) &&
                  var14.field_O != -1) {
                  if (null == var6[var12.field_O]) {
                    var6[var12.field_O] = new Vector();
                  }
                  var6[var12.field_O].addElement(var14);
                }
                if (var14.field_N == 7 &&
                  0 <= var14.field_O) {
                  var3 = 1;
                  var4[var12.field_O] = true;
                }
                if ((var14.i(-21428) ||
                  var14.k((byte) 93)) && var14.field_O >= 0) {
                  var5[var12.field_O] = true;
                }
              }
              if (var8_ref_ne.d(-58)) {
                if (var8_ref_ne.field_a >= 0) {
                  var4[var8_ref_ne.field_a] = true;
                }
                var3 = 1;
              }
              if (var8_ref_ne.e((byte) -128)) {
                var2 = 1;
              }
            }
            var7_int++;
            continue;
          }
          break;
        }
        if ((decompiledNaturalLoopExit0) &&
          (param0 != -29673)) {
          this.a(23, (gn) null, 119);
        }
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted3 = true;
        boolean decompiledFrameCompleted2 = true;
        L15: {
          boolean decompiledFrameRemainder0 = true;
          var7 = new boolean[this.field_W];
          if (var3 == 0) {
            var8 = 0;
            while (this.field_W > var8) {
              var7[var8] = true;
              var8++;
              if (var11 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
            decompiledFrameRemainder0 = !(decompiledFrameCompleted3);
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted3)) {
            var8 = 0;
            while (true) {
              if (this.field_W > var8) {
                stackOut_38_0 = var5[var8];
                stackIn_46_0 = stackOut_38_0 ? 1 : 0;
                stackIn_39_0 = stackOut_38_0;
                if (var11 == 0) {
                  if (!stackIn_39_0) {
                    if (!var4[var8]) {
                      var7[var8] = true;
                    }
                  } else {
                    var4[var8] = true;
                  }
                  var8++;
                  continue;
                }
              } else {
                stackIn_46_0 = 0;
              }
              var8 = stackIn_46_0;
              while (var8 < this.field_W) {
                stackOut_48_0 = var4[var8];
                stackIn_66_0 = stackOut_48_0 ? 1 : 0;
                stackIn_49_0 = stackOut_48_0;
                if (var11 != 0) {
                  break L15;
                }
                if (stackIn_49_0) {
                  this.field_P.a(new up(var8, this), (byte) 91, var8);
                }
                var8++;
              }
              this.field_eb = true;
              if (var11 == 0) {
                break;
              }
              var8 = 0;
              if (this.field_W <= var8) {
                break;
              }
              var7[var8] = true;
              var8++;
              decompiledFrameCompleted2 = false;
              break;
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2)) {
            stackIn_66_0 = var2;
          }
        }
        if ((decompiledFrameCompleted3) &&
          (decompiledFrameCompleted2) &&
          (stackIn_66_0 == 0)) {
          var8 = 0;
          while (this.field_W > var8) {
            if (var11 != 0) {
              decompiledFrameCompleted1 = false;
              break;
            }
            if (null != var6[var8]) {
              var7[var8] = true;
              this.field_P.b(244, var8);
            }
            var8++;
          }
          if (decompiledFrameCompleted1) {
            decompiledFrameRemainder1 = (var11 != 0);
          }
        }
        if ((decompiledFrameRemainder1) &&
          (decompiledFrameCompleted1)) {
          var8 = 0;
          while (true) {
            stackIn_76_0 = ~var8;
            if (stackIn_76_0 <= ~this.field_W) {
              break;
            }
            if (var11 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (null != var6[var8]) {
              var13 = new jd[var6[var8].size()];
              var15 = var13;
              var10 = 0;
              while (var10 < var6[var8].size()) {
                var13[var10] = (jd) (var6[var8].elementAt(var10));
                var10++;
              }
              this.field_P.a(new gm(var8, var15), (byte) 85, var8);
              var7[var8] = true;
              this.field_P.a((byte) 43);
              var10Lifetime1 = 0;
              while (this.field_W > var10Lifetime1) {
                stackOut_87_0 = this.c(var8, -16985, var10Lifetime1);
                stackIn_76_0Lifetime1 = stackOut_87_0 ? 1 : 0;
                stackIn_88_0 = stackOut_87_0;
                if (stackIn_88_0 &&
                  ~var10Lifetime1 != ~var8) {
                  var7[var10Lifetime1] = true;
                }
                var10Lifetime1++;
              }
            }
            var8++;
          }
        }
        if (decompiledFrameCompleted0) {
          var8 = 0;
        }
        while (var8 < this.field_W) {
          if (var11 == 0) {
            if (var7[var8]) {
              this.field_P.a(new mc(var8, this), (byte) 99, var8);
            }
            var8++;
            continue;
          }
          break;
        }
        return;
    }

    private final int n(int param0, int param1) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 0;
        if (param1 >= -60) {
          this.a(53, (byte) 105, 32, 124);
        }
        var4 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var4 >= this.field_c[param0].length))) {
          var5 = this.field_c[param0][var4];
          stackIn_10_0 = ~var5;
          stackIn_10_1 = -1;
          if (var6 == 0) {
            if (stackIn_10_0 <= stackIn_10_1) {
              var3 = var3 ^ (17232 + 312 * var5) * this.field_E[param0][var5];
            }
            var4++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = ~this.field_H[param0];
          stackIn_10_1 = -2;
        }
        if (stackIn_10_0 <= stackIn_10_1) {
          var3 = var3 ^ this.field_H[param0] * 88357;
        }
        if (this.field_fb[this.field_yb[param0]] >= 1) {
          var3 = var3 ^ this.field_fb[this.field_yb[param0]] * 12473;
        }
        var3 = var3 ^ 7563 * this.field_mb[param0];
        if (lf.field_i[this.field_Q] != 0) {
          var3 = var3 ^ 7317 * this.field_m[param0];
        }
        return var3;
    }

    final int o(int param0, int param1) {
        if (param1 < ~param0) {
          return -1;
        }
        return this.field_yb[param0];
    }

    final int i(int param0, int param1) {
        int var3;
        if (null == this.field_fb) {
          return 0;
        }
        if (param0 < 0) {
          return 0;
        }
        if (param0 >= this.field_W) {
          return 0;
        }
        var3 = 25 * param0;
        var3 = var3 + this.field_fb[this.field_yb[param0]];
        if (var3 > this.field_xb) {
          var3 = this.field_xb;
        }
        if (param1 != -12710) {
          this.field_A = -76;
        }
        return var3;
    }

    public static void c(int param0) {
        field_pb = null;
        field_nb = null;
        field_q = null;
        if (param0 != -1) {
          field_nb = (String) null;
        }
    }

    final void b(int param0) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        do {
          if (var2 >= this.field_z.length) {
            if (param0 != 2) {
              this.a(-11, (String) null, (oj) null);
            }
            break;
          }
          this.field_z[var2][0] = 0;
          this.field_z[var2][1] = 0;
          this.field_z[var2][2] = 0;
          var2++;
        } while (var5 == 0);
        if (null == this.field_Eb) {
          return;
        }
        var6 = 0;
        var2 = var6;
        while (this.field_Eb.length > var6) {
          var3 = this.o(this.field_Eb[var6].field_a, -1);
          if (var5 != 0) {
            return;
          }
          boolean decompiledFrameRemainder2 = true;
          if (var3 > -1) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            var4 = this.field_Eb[var6].field_h;
            if ((7 != var4) &&
              (decompiledFrameRemainder0 = (var4 != 14 ||
              var5 != 0)) &&
              (decompiledFrameRemainder0 = (9 != var4 ||
              var5 != 0))) {
              decompiledFrameRemainder1 = (var4 != 8);
              decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              dupTemp$0 = this.field_z[var3];
              dupTemp$0[0] = dupTemp$0[0] + 1;
              decompiledFrameRemainder2 = false;
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              dupTemp$1 = this.field_z[var3];
              dupTemp$1[1] = dupTemp$1[1] + 1;
              decompiledFrameRemainder2 = false;
            }
            if (decompiledFrameRemainder2) {
              dupTemp$2 = this.field_z[var3];
              dupTemp$2[2] = dupTemp$2[2] + 1;
            }
          }
          var6++;
        }
        this.a(1);
        return;
    }

    final int a(byte param0) {
        if (param0 != 78) {
          this.f(84, -63);
        }
        return ~this.field_e & (1 << this.field_W) - 1;
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        var4 = 0;
        var5 = this.g(param0, param1 - 2101, param2);
        if (var5 == 4 ||
          5 == var5) {
          if (~this.g(param0 - 1, param1 - 2139, param2) != ~var5) {
            var4 = var4 | 2;
          }
          if (~var5 != ~this.g(param0, -37, param2 + 1)) {
            var4 = var4 | 1;
          }
          if (~var5 != ~this.g(param0, -43, -1 + param2)) {
            var4 = var4 | 8;
          }
          if (~var5 != ~this.g(1 + param0, -63, param2)) {
            var4 = var4 | 4;
          }
        }
        if (var4 == 6) {
          return 1;
        }
        if (var4 == 9) {
          return 0;
        }
        if (var4 == 2) {
          return 2;
        }
        if (param1 != 2056) {
          return -23;
        }
        if (var4 == 4) {
          return 1;
        }
        if (var4 == 1) {
          return 3;
        }
        if (var4 != 8) {
          return -1;
        }
        return 0;
    }

    private final boolean e(byte param0) {
        int var2 = 0;
        go[] var3 = null;
        int var4 = 0;
        go var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_20_0 = false;
        boolean stackIn_24_0 = false;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != -42) {
          return true;
        }
        if (!this.field_wb) {
          stackIn_24_0 = (eb.a((byte) -125, this.a((byte) 78)) == 1);
          return stackIn_24_0;
        }
        var2 = 0;
        var3 = this.field_w;
        var4 = 0;
        while (true) {
          stackIn_5_0 = var4;
          stackIn_5_1 = var3.length;
          boolean decompiledFrameRemainder0 = true;
          if (stackIn_5_0 < stackIn_5_1) {
            var5 = var3[var4];
            var6 = var5.field_a;
            stackIn_17_0 = 0;
            decompiledFrameRemainder0 = (var9 == 0);
            if (decompiledFrameRemainder0) {
              var7 = stackIn_17_0;
              while (var6.length > var7) {
                var8 = var6[var7];
                stackIn_5_0 = ~(this.field_e & 1 << var8);
                stackIn_5_1 = -1;
                if (stackIn_5_0 == stackIn_5_1) {
                  var2++;
                } else {
                  var7++;
                  continue;
                }
                break;
              }
              var4++;
              continue;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_17_0 = 1;
          }
          stackIn_20_0 = (stackIn_17_0 == var2);
          return stackIn_20_0;
        }
    }

    final void a(byte param0, int param1) {
        int var4 = -71 % ((param0 + 15) / 37);
        go var3 = this.d(param1, -1);
        if (var3 != null) {
          var3.a(3, this);
        }
    }

    private final int a(byte param0, int param1, ne param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 0;
          if (!this.a(param1, param2, 115)) {
            var4_int = var4_int ^ param2.field_h;
            stackIn_2_0 = var4_int;
            return stackIn_2_0;
          }
          var4_int = var4_int ^ param2.field_h * 47;
          if (param2.c(-120)) {
            var4_int = var4_int ^ 234;
          }
          if (param2.c((byte) -79)) {
            var4_int = var4_int ^ 2823;
            var4_int = var4_int ^ param2.b((byte) -71) * 75;
          }
          if (param0 != 103) {
            this.c(-105, 88);
          }
          var4_int = var4_int ^ 7657 * param2.field_a;
          stackIn_12_0 = var4_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ha.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean m(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_11_0 = false;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!this.field_P.a(param1, -96)) {
          return false;
        }
        var3 = param0;
        while (var3 < this.field_W) {
          stackIn_11_0 = this.c(var3, param0 ^ -16985, param1);
          if (var4 != 0) {
            return stackIn_11_0;
          }
          if (!stackIn_11_0 ||
            var4 != 0) {
            this.b(10001, var3, true);
          }
          var3++;
        }
        return true;
    }

    final int c(int param0, int param1, int param2, int param3) {
        int var6;
        ne var7;
        if (0 > param3) {
          return 0;
        }
        if (param0 >= 0 &&
          0 <= param2 &&
          param0 < this.field_v) {
          if (param2 >= this.field_db) {
            return 0;
          }
          var7 = this.field_Eb[this.field_v * param2 + param0];
          if (var7.field_c != null) {
            return 0;
          }
          var6 = this.c(param3, -16985, var7.field_a) ? 1 : 0;
          if (var6 != 0 &&
            7 == var7.field_h) {
            return 65535;
          }
          if (param1 != -27300) {
            this.a(41, 1, 42, (byte) 14);
          }
          if (var6 != 0 &&
            var7.field_h == 11) {
            return 1 << var7.field_g;
          }
          return 0;
        }
        return 0;
    }

    final void a(int param0, int param1) {
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = param0;
        while (this.field_W > var3) {
          if (var4 == 0) {
            if (~(this.field_u & 1 << var3) != ~(1 << var3 & param1)) {
              this.b(10001, var3, false);
            }
            var3++;
            continue;
          }
          break;
        }
        this.field_u = param1;
        return;
    }

    final boolean a(jd param0, int param1, int param2, int param3) {
        ne var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 0 &&
            param2 >= 0 &&
            param1 < this.field_v &&
            param2 <= this.field_db) {
            if (param3 >= -117) {
              return false;
            }
            var5 = this.field_Eb[param2 * this.field_v + param1];
            if (null == var5.field_c) {
              return true;
            }
            if (param0.field_N == 51) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_19_0 = var5_ref;
          stackIn_19_1 = new StringBuilder().append("ha.W(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        ne[] var6;
        int var7;
        ne var8;
        jd var9;
        int var10;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == this.field_K) {
          return false;
        }
        if (param1) {
          this.field_A = 0;
          return false;
        }
        var4 = 0;
        var5 = 0;
        if (param2 != -1) {
          return false;
        }
        var6 = this.field_Eb;
        var7 = 0;
        while (true) {
          if (var6.length <= var7) {
            if (var5 == 0 &&
              var4 != 0) {
              this.field_A = this.field_A + 1;
              stackIn_24_0 = -4;
              stackIn_24_1 = ~this.field_A;
            } else {
              this.field_A = 0;
              return false;
            }
            break;
          }
          var8 = var6[var7];
          stackIn_24_0 = var8.field_a;
          stackIn_24_1 = param0;
          if (var10 == 0) {
            if (stackIn_24_0 == stackIn_24_1 && (7 == var8.field_h ||
              11 == var8.field_h)) {
              var4 = 1;
              var9 = var8.field_c;
              if (var9 == null ||
                this.c(var9.field_O, -16985, param0)) {
                var5 = 1;
              }
            }
            var7++;
            continue;
          }
          break;
        }
        if (stackIn_24_0 >= stackIn_24_1) {
          return true;
        }
        return false;
    }

    final void a(int param0) {
        int discarded$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        boolean stackIn_67_0 = false;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        boolean stackOut_7_0;
        boolean stackOut_66_0;
        int var2_int = 0;
        int[] var2 = null;
        go[] var3_ref_go__ = null;
        int var3 = 0;
        int var4 = 0;
        go var5_ref_go = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int stackIn_71_0Lifetime1;
        int var2_intLifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_wb) {
          if (this.field_K != null &&
            this.field_qb) {
            var2_int = 0;
            var3_ref_go__ = this.field_w;
            var4 = 0;
            while (true) {
              stackIn_6_0 = var4;
              stackIn_6_1 = var3_ref_go__.length;
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              if (stackIn_6_0 < stackIn_6_1) {
                var5_ref_go = var3_ref_go__[var4];
                stackOut_7_0 = var5_ref_go.a(this.field_K.field_w, (byte) -100);
                stackIn_19_0 = stackOut_7_0 ? 1 : 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledFrameRemainder0 = (var9 == 0);
                if (decompiledFrameRemainder0) {
                  if (!stackIn_8_0) {
                    var16 = var5_ref_go.field_a;
                    var7 = 0;
                    while (var7 < var16.length) {
                      var8 = var16[var7];
                      stackIn_6_0 = -1;
                      stackIn_6_1 = ~(this.field_e & 1 << var8);
                      if (stackIn_6_0 == stackIn_6_1) {
                        var2_int = 1;
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                      var7++;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    var4++;
                    continue;
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                this.field_R = 1;
                stackIn_19_0 = var2_int;
              }
              if (stackIn_19_0 == 0) {
                this.field_p[0] = 0;
                this.field_p[1] = 1;
                if (var9 == 0) {
                  return;
                }
              }
              this.field_p[0] = 1;
              this.field_p[1] = 0;
              return;
            }
          }
          if (!this.d((byte) 125)) {
            this.field_p[1] = 0;
            this.field_p[0] = 1;
            if (var9 != 0) {
              this.field_p[1] = 1;
              this.field_p[0] = 0;
            }
          } else {
            this.field_p[1] = 1;
            this.field_p[0] = 0;
          }
          var2_intLifetime1 = 0;
          var4 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var4 >= this.field_tb))) {
            stackIn_34_0 = ~this.field_xb;
            if (var9 == 0) {
              if (stackIn_34_0 >= ~this.field_fb[var4]) {
                var2_intLifetime1++;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_34_0 = 0;
          }
          var3 = stackIn_34_0;
          var4 = 0;
          while (true) {
            if (var4 >= this.field_W) {
              this.field_R = var2_intLifetime1;
              stackIn_42_0 = -1;
              stackIn_42_1 = ~this.field_R;
              break;
            }
            stackIn_42_0 = this.field_mb[var4];
            stackIn_42_1 = this.field_O;
            if (var9 == 0) {
              if (stackIn_42_0 >= stackIn_42_1) {
                var3 = 1;
              }
              var4++;
              continue;
            }
            break;
          }
          if (stackIn_42_0 == stackIn_42_1 &&
            var3 != 0) {
            this.field_R = 1;
          }
          if (0 != this.field_R) {
            return;
          }
          if (this.e((byte) -42)) {
            this.field_R = 1;
          }
          return;
        }
        if (this.field_X &&
          !this.field_b) {
          return;
        }
        var14 = this.d(10326);
        var12 = var14;
        var10 = var12;
        var2 = var10;
        var3 = 0;
        do {
          if (this.field_W <= var3) {
            var3 = 0;
            break;
          }
          this.field_p[var3] = var3;
          var3++;
        } while (var9 == 0);
        L26: while (true) {
          if (-1 + this.field_W > var3) {
            var4 = var3;
            stackIn_73_0 = 1 + var3;
            if (var9 != 0) {
              break L26;
            }
            var5 = stackIn_73_0;
            while (this.field_W > var5) {
              stackOut_66_0 = this.a(var14, this.field_p[var4], -24107, this.field_p[var5]);
              stackIn_71_0 = stackOut_66_0 ? 1 : 0;
              stackIn_67_0 = stackOut_66_0;
              if (stackIn_67_0) {
                var4 = var5;
              }
              var5++;
            }
            stackIn_71_0Lifetime1 = this.field_p[var3];
            var5Lifetime3 = stackIn_71_0Lifetime1;
            this.field_p[var3] = this.field_p[var4];
            this.field_p[var4] = var5Lifetime3;
            var3++;
            continue L26;
          }
          var3 = 0;
          var4 = 0;
          stackIn_73_0 = 0;
          break;
        }
        var5Lifetime1 = stackIn_73_0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (this.field_W <= var5Lifetime1))) {
          stackIn_85_0 = ~(1 << var5Lifetime1 & this.field_e);
          stackIn_85_1 = -1;
          if (var9 == 0) {
            if (stackIn_85_0 == stackIn_85_1) {
              if (this.field_fb[var5Lifetime1] >= this.field_xb) {
                var3++;
              }
              if (this.field_mb[var5Lifetime1] >= this.field_O) {
                var4 = 1;
              }
            }
            var5Lifetime1++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_85_0 = param0;
          stackIn_85_1 = 1;
        }
        if (stackIn_85_0 != stackIn_85_1) {
          discarded$0 = this.f((byte) 28);
        }
        boolean decompiledFrameCompleted0 = true;
        this.field_R = var3;
        if (this.field_R == 0 &&
          var4 != 0) {
          var5Lifetime2 = -1;
          var6 = 0;
          while (var6 < this.field_W) {
            stackIn_100_0 = ~this.field_fb[var6];
            stackIn_100_1 = ~var5Lifetime2;
            if (var9 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_100_0 != stackIn_100_1) {
              if (var5Lifetime2 < this.field_fb[var6]) {
                this.field_R = 1;
                var5Lifetime2 = this.field_fb[var6];
              }
            } else {
              this.field_R = this.field_R + 1;
            }
            var6++;
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_100_0 = 0;
          stackIn_100_1 = this.field_R;
        }
        if ((stackIn_100_0 != stackIn_100_1 ||
          !this.e((byte) -42)) &&
          this.field_K == null) {
          return;
        }
        this.field_R = 1;
        return;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        this.a(param1, false, param0, param3);
        this.a(param1, false, 1 + param0, param3);
        this.a(1 + param1, false, param0, param3);
        if (param2 != -13) {
          return;
        }
        this.a(1 + param1, false, 1 + param0, param3);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ne var5;
        ne var6;
        if (param0 <= 19) {
          return;
        }
        if (0 > param3) {
          return;
        }
        if (param2 >= 0 &&
          param3 < this.field_v &&
          this.field_db > param2) {
          var6 = this.field_Eb[this.field_v * param2 + param3];
          var5 = var6;
          if (null != var6.field_c) {
            if (var6.field_c.field_N != 20) {
              return;
            }
            if (!this.c(var6.field_c.field_O, -16985, param1)) {
              return;
            }
            var6.field_c.field_Y = var6.field_c.field_t;
            if (!ArmiesOfGielinor.field_M) {
              return;
            }
          }
          if (!var6.c(89)) {
            return;
          }
          var5.field_c = new jd(param3, param2, 20, param1, 15, 15, 1, 0, 0, this, 0, 0, -1, false, 0);
          var6.i(14);
          this.a(8288, var6.field_c);
          return;
        }
    }

    ha(int param0, String[] param1, int param2, int[][] param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, boolean param10, int[][] param11, int param12, int param13, int param14, om param15) {
        int[] array$2 = null;
        int[] array$3 = null;
        int incrementValue$4 = 0;
        int[] array$6 = null;
        int incrementValue$7 = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        int stackIn_10_1 = 0;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_2 = false;
        boolean stackIn_35_1 = false;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        boolean stackIn_57_1 = false;
        boolean stackIn_60_1 = false;
        int stackIn_91_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackIn_179_0 = 0;
        int stackIn_179_1 = 0;
        int stackIn_192_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_220_0 = 0;
        RuntimeException stackIn_226_0 = null;
        StringBuilder stackIn_226_1 = null;
        String stackIn_227_2 = null;
        StringBuilder stackIn_229_1 = null;
        String stackIn_230_2 = null;
        StringBuilder stackIn_232_1 = null;
        String stackIn_233_2 = null;
        StringBuilder stackIn_235_1 = null;
        String stackIn_236_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        int[] var17 = null;
        RuntimeException var17_ref = null;
        int var18 = 0;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var21_ref_int__ = null;
        int var22 = 0;
        int var23 = 0;
        String var23_ref_String = null;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        sd var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var17Lifetime1;
        int stackIn_145_0Lifetime1;
        int stackIn_168_0Lifetime1;
        int stackIn_168_1Lifetime1;
        int stackIn_179_0Lifetime1;
        int stackIn_179_1Lifetime1;
        int stackIn_204_0Lifetime1;
        int stackIn_215_0Lifetime1;
        int stackIn_215_1Lifetime1;
        int var19Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var20Lifetime1;
        int var19Lifetime2;
        int stackIn_168_0Lifetime1Lifetime1;
        int stackIn_168_1Lifetime1Lifetime1;
        int var19Lifetime1Lifetime1;
        int var21Lifetime1Lifetime1;
        var25 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_ab = 1;
        this.field_R = 0;
        this.field_eb = false;
        this.field_bb = 1.0f;
        this.field_Z = null;
        this.field_Cb = false;
        this.field_D = 0;
        this.field_J = false;
        this.field_o = false;
        this.field_V = true;
        this.field_Bb = false;
        this.field_T = null;
        this.field_A = 0;
        this.field_r = true;
        this.field_qb = false;
        try {
          this.field_k = new at();
          stackIn_4_1 = (param5);
          this.field_Ab = stackIn_4_1;
          stackIn_7_1 = (param10);
          this.field_wb = stackIn_7_1;
          this.field_W = param1.length;
          this.field_K = param15;
          this.field_cb = param7;
          this.field_vb = param8;
          if (this.field_wb) {
            stackIn_10_1 = 2;
          } else {
            stackIn_10_1 = this.field_W;
          }
          this.field_tb = stackIn_10_1;
          this.field_hb = param9;
          this.field_Q = param12;
          stackIn_13_1 = !(param13 <= 0);
          this.field_L = stackIn_13_1;
          stackIn_16_2 = (this.field_K == null);
          this.field_V = stackIn_16_2;
          this.field_r = stackIn_16_2;
          this.field_P = new tt(this.field_W);
          if (this.field_cb < 0) {
            this.field_cb = 0;
          }
          if (this.field_K == null) {
            if (2 < this.field_W &&
              1 > this.field_cb) {
              this.field_cb = 1;
            }
            if (this.field_W > 4 &&
              2 > this.field_cb) {
              this.field_cb = 2;
            }
            if (this.field_W > 6 &&
              this.field_cb < 3) {
              this.field_cb = 3;
            }
            this.field_kb = false;
            if ((!(this.field_W >= 4)) &&
              (!(this.field_cb <= 2)) &&
              (this.field_cb != 4)) {
              this.field_cb = 2;
              if (var25 != 0) {
                stackIn_35_1 = (mh.a(this.field_K.field_G.field_r, -126, this.field_K.field_v) == 0);
                this.field_kb = stackIn_35_1;
              }
            }
          } else {
            stackIn_35_1 = (mh.a(this.field_K.field_G.field_r, -126, this.field_K.field_v) == 0);
            this.field_kb = stackIn_35_1;
          }
          boolean decompiledFrameCompleted5 = true;
          boolean decompiledFrameRemainder0 = true;
          this.field_jb = ns.a(false, 2147483647, li.field_n);
          this.field_w = new go[this.field_tb];
          this.field_yb = new int[this.field_W];
          this.field_ib = param0;
          if (!this.field_wb ||
            null != this.field_K) {
            var17_int = 0;
            while (var17_int < this.field_W) {
              this.field_w[var17_int] = new go(param1[var17_int], new int[]{var17_int});
              this.field_yb[var17_int] = var17_int;
              var17_int++;
              if (var25 != 0) {
                decompiledFrameCompleted5 = false;
                break;
              }
            }
            if (decompiledFrameCompleted5) {
              decompiledFrameRemainder0 = (var25 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted5)) {
            var31 = new int[this.field_W / 2];
            var26 = var31;
            var17 = var26;
            var18 = 0;
            var32 = new int[this.field_W / 2];
            var27 = var32;
            var19_ref_int__ = var27;
            var20 = 0;
            var21 = 0;
            while (true) {
              if (var21 < this.field_W) {
                stackIn_51_0 = ~(var21 & 1);
                stackIn_51_1 = -1;
                if (var25 == 0) {
                  if (stackIn_51_0 == stackIn_51_1) {
                    var17[var18++] = var21;
                    this.field_yb[var21] = 0;
                  } else {
                    var19_ref_int__[var20++] = var21;
                    this.field_yb[var21] = 1;
                  }
                  var21++;
                  continue;
                }
              } else {
                stackIn_51_0 = var20;
                stackIn_51_1 = var18;
              }
              break;
            }
            if (stackIn_51_0 != stackIn_51_1) {
              throw new IllegalStateException("");
            }
            this.field_w[0] = new go(om.field_p, var31);
            this.field_w[1] = new go(vj.field_n, var32);
          }
          if (decompiledFrameCompleted5) {
            this.field_l = new at();
            this.field_c = new int[this.field_W][3];
            this.field_E = new int[this.field_W][7];
            this.field_lb = param1;
            this.field_gb = param2;
            this.field_n = new int[this.field_W];
            this.field_H = new int[this.field_W];
            this.field_db = 0;
            stackIn_57_1 = (param6);
            this.field_x = stackIn_57_1;
            this.field_fb = new int[this.field_tb];
            this.field_m = new int[this.field_W];
            this.field_p = new int[this.field_tb];
            this.field_t = new at[this.field_W];
            this.field_sb = param4;
            this.field_a = param3;
            this.field_v = 0;
            stackIn_60_1 = (param5);
            this.field_b = stackIn_60_1;
            this.field_S = new int[this.field_tb];
            this.field_z = new int[this.field_tb][3];
            this.field_mb = new int[this.field_W];
            this.field_s = new int[3];
            this.field_U = new int[this.field_W];
          }
          boolean decompiledFrameCompleted1 = true;
          if (this.field_b) {
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameCompleted3 = true;
            L29: {
              if (param11 == null) {
                this.field_B = (int[][]) null;
                if (var25 == 0) {
                  break L29;
                }
              }
              if (param11.length != 1) {
                this.field_B = new int[this.field_W][];
                var17_int = 0;
                while (var17_int < this.field_W) {
                  var18Lifetime1 = param11[var17_int].length;
                  stackIn_92_0 = var18Lifetime1;
                  stackIn_92_1 = 5;
                  if (var25 != 0) {
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                  if (stackIn_92_0 < stackIn_92_1) {
                    var18Lifetime1 = 5;
                  }
                  array$2 = new int[var18Lifetime1];
                  this.field_B[var17_int] = array$2;
                  var19 = 0;
                  while (param11[var17_int].length > var19) {
                    this.field_B[var17_int][var19] = param11[var17_int][var19];
                    var19++;
                  }
                  var19Lifetime2 = param11[var17_int].length;
                  while (var18Lifetime1 > var19Lifetime2) {
                    this.field_B[var17_int][var19Lifetime2] = -1;
                    var19Lifetime2++;
                  }
                  var17_int++;
                }
                if ((decompiledFrameCompleted4) &&
                  (var25 == 0)) {
                  break L29;
                }
              }
              if (decompiledFrameCompleted4) {
                this.field_B = new int[this.field_W][5];
                var17_int = 0;
                while (this.field_W > var17_int) {
                  stackIn_91_0 = 0;
                  if (var25 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  var18Lifetime1 = stackIn_91_0;
                  while (var18Lifetime1 < 5) {
                    this.field_B[var17_int][var18Lifetime1] = param11[0][var18Lifetime1];
                    var18Lifetime1++;
                  }
                  var17_int++;
                }
              }
            }
            if ((decompiledFrameCompleted4) &&
              (decompiledFrameCompleted3)) {
              stackIn_91_0 = ~param3.length;
            }
            if (decompiledFrameCompleted4) {
              stackIn_92_0 = stackIn_91_0;
              stackIn_92_1 = -2;
            }
            boolean decompiledFrameCompleted2 = true;
            if (stackIn_92_0 != stackIn_92_1) {
              this.field_a = param3;
            }
            if (stackIn_92_0 == stackIn_92_1 ||
              var25 != 0) {
              this.field_a = new int[this.field_W][];
              var17_int = 0;
              while (var17_int < this.field_W) {
                this.field_a[var17_int] = param3[0];
                var17_int++;
                if (var25 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted2) {
              this.field_d = new int[16];
              this.field_N = new int[16];
            }
            var17_int = 0;
            while (true) {
              if (var17_int < 16) {
                this.field_N[var17_int] = -1;
                var17_int++;
                if (var25 == 0) {
                  continue;
                }
              } else {
                this.field_d[15] = 2;
                this.field_d[12] = 30;
                this.field_d[4] = 5;
                this.field_d[10] = 500;
                this.field_Y = new int[this.field_W];
                this.field_M = new int[this.field_W];
                this.field_g = new int[this.field_W];
                this.field_h = new int[this.field_W];
                this.field_d[14] = 2;
                this.field_d[5] = 5;
                this.field_d[8] = 5;
                this.field_ob = new int[this.field_W];
                this.field_d[7] = 3;
                this.field_d[6] = 3;
                this.field_d[11] = 30;
                this.field_ub = new int[this.field_W];
                this.field_d[0] = 1;
                this.field_zb = new int[this.field_W];
                this.field_y = new int[this.field_W];
                this.field_d[13] = 10;
              }
              break;
            }
            var17_int = 0;
            while (var17_int < this.field_W) {
              this.field_ub[var17_int] = 0;
              this.field_g[var17_int] = 0;
              this.field_h[var17_int] = 0;
              this.field_Y[var17_int] = 0;
              this.field_zb[var17_int] = 0;
              this.field_ob[var17_int] = 0;
              this.field_M[var17_int] = 0;
              this.field_y[var17_int] = 0;
              var17_int++;
              if (var25 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted1) &&
              (var25 != 0)) {
              this.field_a = new int[this.field_W][];
              if (0 <= param4 &&
                param4 < this.field_a.length) {
                this.field_a[param4] = param3[0];
              }
            }
          } else {
            this.field_a = new int[this.field_W][];
            if (0 <= param4 &&
              param4 < this.field_a.length) {
              this.field_a[param4] = param3[0];
            }
          }
          var17_int = 0;
          do {
            if (var17_int >= this.field_tb) {
              var17_int = 0;
              break;
            }
            this.field_z[var17_int][0] = 0;
            this.field_z[var17_int][1] = 0;
            this.field_z[var17_int][2] = 0;
            this.field_p[var17_int] = var17_int;
            this.field_fb[var17_int] = 0;
            var17_int++;
          } while (var25 == 0);
          while (true) {
            stackIn_118_0 = this.field_W;
            stackIn_118_1 = var17_int;
            L59: {
              boolean decompiledFrameCompleted0 = true;
              if (stackIn_118_0 > stackIn_118_1) {
                this.field_n[var17_int] = -1;
                this.field_t[var17_int] = new at();
                stackIn_220_0 = 0;
                if (var25 != 0) {
                  break L59;
                }
                if (stackIn_220_0 != var17_int) {
                  this.field_H[var17_int] = 200;
                } else {
                  this.field_H[var17_int] = 150;
                }
                this.field_mb[var17_int] = 0;
                var18Lifetime2 = 0;
                L65: while (true) {
                  if (var18Lifetime2 < this.field_E[var17_int].length) {
                    this.field_E[var17_int][var18Lifetime2] = 0;
                    var18Lifetime2++;
                    continue;
                  }
                  if (!this.field_b &&
                    var17_int != this.field_sb || (this.field_a[var17_int][4] != 0 ||
                    0 != this.field_a[var17_int][5] ||
                    0 != this.field_a[var17_int][6])) {
                    if (!this.field_L) {
                      var18Lifetime2 = 0;
                      while (var18Lifetime2 < 3) {
                        this.field_c[var17_int][var18Lifetime2] = -1;
                        var18Lifetime2++;
                      }
                      break L65;
                    }
                    var18Lifetime2 = 4;
                    var19Lifetime1 = 4;
                    while (this.field_a[var17_int].length > var19Lifetime1) {
                      stackIn_145_0 = this.field_a[var17_int][var19Lifetime1];
                      if (stackIn_145_0 != 0) {
                        var18Lifetime2++;
                      }
                      var19Lifetime1++;
                    }
                    array$3 = new int[var18Lifetime2];
                    this.field_c[var17_int] = array$3;
                    var19Lifetime1 = 0;
                    stackIn_145_0Lifetime1 = 0;
                    var20Lifetime1 = stackIn_145_0Lifetime1;
                    while (this.field_a[var17_int].length > var20Lifetime1) {
                      stackIn_118_0 = 0;
                      stackIn_118_1 = this.field_a[var17_int][var20Lifetime1];
                      if (stackIn_118_0 != stackIn_118_1) {
                        incrementValue$4 = var19Lifetime1;
                        var19Lifetime1++;
                        this.field_c[var17_int][incrementValue$4] = var20Lifetime1;
                      }
                      var20Lifetime1++;
                    }
                    break L65;
                  }
                  var18Lifetime2 = 0;
                  while (var18Lifetime2 < 3) {
                    this.field_c[var17_int][var18Lifetime2] = var18Lifetime2;
                    this.field_E[var17_int][this.field_c[var17_int][var18Lifetime2]] = 1;
                    var18Lifetime2++;
                  }
                  break;
                }
                this.field_E[var17_int][6] = 1;
                this.field_m[var17_int] = lf.field_i[this.field_Q];
                var17_int++;
                continue;
              }
              if (null != this.field_K) {
                L82: {
                  L83: {
                    var33 = this.field_K.a((byte) -46);
                    var28 = var33;
                    var17Lifetime1 = var28;
                    if (var17Lifetime1 != null) {
                      this.field_tb = 0;
                      this.field_wb = true;
                      var18Lifetime2 = 0;
                      L85: while (true) {
                        if (var18Lifetime2 < var33.length) {
                          stackIn_168_0 = var33[var18Lifetime2];
                          stackIn_168_1 = this.field_tb;
                          if (var25 != 0) {
                            if (stackIn_168_0 <= stackIn_168_1) {
                              break L83;
                            }
                            var19Lifetime1Lifetime1 = 0;
                            var20Lifetime1 = 0;
                            stackIn_192_0 = 0;
                            break L82;
                          } else {
                            if (stackIn_168_0 > stackIn_168_1) {
                              this.field_tb = var33[var18Lifetime2];
                            }
                            var18Lifetime2++;
                            continue;
                          }
                        }
                        this.field_tb = this.field_tb + 1;
                        this.field_w = new go[this.field_tb];
                        var18Lifetime2 = 0;
                        while (true) {
                          stackIn_168_0Lifetime1 = ~var18Lifetime2;
                          stackIn_168_1Lifetime1 = ~this.field_tb;
                          if (stackIn_168_0Lifetime1 <= stackIn_168_1Lifetime1) {
                            break L83;
                          }
                          var19Lifetime1Lifetime1 = 0;
                          var20Lifetime1 = 0;
                          stackIn_192_0 = 0;
                          if (var25 != 0) {
                            break L82;
                          }
                          var21Lifetime1 = stackIn_192_0;
                          while (var21Lifetime1 < var33.length) {
                            stackIn_179_0 = var33[var21Lifetime1];
                            stackIn_179_1 = var18Lifetime2;
                            if (stackIn_179_0 == stackIn_179_1) {
                              if (~var21Lifetime1 == ~this.field_K.field_w) {
                                var19Lifetime1Lifetime1 = 1;
                              }
                              var20Lifetime1++;
                            }
                            var21Lifetime1++;
                          }
                          stackIn_179_0Lifetime1 = ~var20Lifetime1;
                          stackIn_179_1Lifetime1 = -1;
                          if (stackIn_179_0Lifetime1 == stackIn_179_1Lifetime1) {
                            break L85;
                          }
                          var34 = new int[var20Lifetime1];
                          var29 = var34;
                          var21_ref_int__ = var29;
                          var22 = 0;
                          var23 = 0;
                          while (var23 < var33.length) {
                            stackIn_168_0Lifetime1Lifetime1 = var33[var23];
                            stackIn_168_1Lifetime1Lifetime1 = var18Lifetime2;
                            if (stackIn_168_0Lifetime1Lifetime1 == stackIn_168_1Lifetime1Lifetime1) {
                              var21_ref_int__[var22++] = var23;
                              this.field_yb[var23] = var18Lifetime2;
                            }
                            var23++;
                          }
                          if (var19Lifetime1Lifetime1 != 0) {
                            var23_ref_String = param1[this.field_K.field_w];
                          } else {
                            var23_ref_String = param1[var34[0]];
                          }
                          this.field_w[var18Lifetime2] = new go(var23_ref_String, var34);
                          var18Lifetime2++;
                        }

                      }
                      throw new IllegalStateException("");
                    }
                  }
                  stackIn_192_0 = 0;
                }
                var18Lifetime2 = stackIn_192_0;
                while (var18Lifetime2 < this.field_W) {
                  stackIn_220_0 = ~this.field_K.field_w;
                  if (var25 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_220_0 == ~var18Lifetime2) {
                    this.field_c[var18Lifetime2] = new int[]{this.field_K.field_G.field_s};
                  } else {
                    var30 = this.field_K.field_G.field_q[this.field_K.field_B[var18Lifetime2]];
                    var20Lifetime1 = 0;
                    var21Lifetime1Lifetime1 = 1;
                    while (var21Lifetime1Lifetime1 < this.field_a[var18Lifetime2].length) {
                      stackIn_204_0 = this.field_a[var18Lifetime2][var21Lifetime1Lifetime1];
                      if (stackIn_204_0 != 0) {
                        var20Lifetime1++;
                      }
                      var21Lifetime1Lifetime1++;
                    }
                    array$6 = new int[var20Lifetime1];
                    this.field_c[var18Lifetime2] = array$6;
                    var21Lifetime1Lifetime1 = 0;
                    stackIn_204_0Lifetime1 = 0;
                    var22Lifetime1 = stackIn_204_0Lifetime1;
                    var23Lifetime1 = 1;
                    while (var23Lifetime1 < this.field_a[var18Lifetime2].length) {
                      var24 = var30.field_t[var23Lifetime1 - 1];
                      stackIn_215_0 = ~this.field_a[var18Lifetime2][var23Lifetime1];
                      stackIn_215_1 = -1;
                      if (stackIn_215_0 == stackIn_215_1) {
                        if (var22Lifetime1 < var24) {
                          var22Lifetime1 = var24;
                        }
                      } else {
                        this.field_E[var18Lifetime2][-1 + var23Lifetime1] = var24;
                        if (this.field_E[var18Lifetime2][-1 + var23Lifetime1] > this.field_E[var18Lifetime2][0]) {
                          this.field_E[var18Lifetime2][0] = this.field_E[var18Lifetime2][var23Lifetime1 - 1];
                        }
                        incrementValue$7 = var21Lifetime1Lifetime1;
                        var21Lifetime1Lifetime1++;
                        this.field_c[var18Lifetime2][incrementValue$7] = var23Lifetime1 - 1;
                      }
                      var23Lifetime1++;
                    }
                    stackIn_215_0Lifetime1 = ~var22Lifetime1;
                    stackIn_215_1Lifetime1 = -1;
                    if (stackIn_215_0Lifetime1 < stackIn_215_1Lifetime1) {
                      this.field_E[var18Lifetime2][6] = var22Lifetime1;
                    }
                  }
                  var18Lifetime2++;
                }
                if (decompiledFrameCompleted0) {
                  this.field_Cb = true;
                  this.field_D = 3;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_220_0 = this.field_b ? 1 : 0;
              }
            }
            if (stackIn_220_0 != 0) {
              this.field_jb = ns.a(false, 2147483647, li.field_n);
              this.l(0, 0);
            }
            this.field_O = this.b((byte) 32);
            this.f(-2);
            this.field_xb = this.f((byte) -80);
            this.field_F = false;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17_ref = decompiledCaughtException;
          stackIn_226_0 = var17_ref;
          stackIn_226_1 = new StringBuilder().append("ha.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_227_2 = "null";
          } else {
            stackIn_227_2 = "{...}";
          }
          stackIn_229_1 = ((StringBuilder) (Object) stackIn_226_1).append(stackIn_227_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_230_2 = "null";
          } else {
            stackIn_230_2 = "{...}";
          }
          stackIn_232_1 = ((StringBuilder) (Object) stackIn_229_1).append(stackIn_230_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_233_2 = "null";
          } else {
            stackIn_233_2 = "{...}";
          }
          stackIn_235_1 = ((StringBuilder) (Object) stackIn_232_1).append(stackIn_233_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_236_2 = "null";
          } else {
            stackIn_236_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_226_0), ((StringBuilder) (Object) stackIn_235_1).append(stackIn_236_2).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = ia.a(param2, '_', 3, "");
          if (param1 != -26) {
            return true;
          }
          var3 = nf.a(true, param2);
          stackIn_8_0 = (param0.indexOf(param2) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ha.ID(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_q = "AnimationEvent";
        field_nb = "Loading graphics";
        field_pb = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
