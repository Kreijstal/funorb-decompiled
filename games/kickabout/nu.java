/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nu {
    private boolean field_W;
    private boolean field_w;
    int field_I;
    int field_v;
    int field_c;
    static String field_M;
    tf field_E;
    private int field_U;
    boolean field_f;
    int field_O;
    static String field_D;
    static boolean field_j;
    String[] field_S;
    int field_u;
    private boolean field_T;
    boolean field_L;
    boolean field_e;
    boolean field_l;
    tj field_V;
    int[] field_d;
    boolean field_h;
    boolean field_y;
    oe field_n;
    up[][] field_b;
    la[] field_B;
    wr field_C;
    boolean field_A;
    it[] field_g;
    la[] field_x;
    boolean field_z;
    private p field_ab;
    int field_Z;
    private boolean[] field_F;
    int field_t;
    int[] field_r;
    private jc[] field_q;
    boolean field_p;
    boolean field_s;
    ua field_X;
    nl[][] field_P;
    int[][] field_i;
    int field_J;
    boolean field_Y;
    static String field_a;
    private ch field_N;
    int[] field_H;
    gt[] field_R;
    boolean field_G;
    int field_m;
    int[][] field_k;
    wl field_o;
    int[] field_Q;

    final void a(ml param0, int param1) {
        int stackIn_35_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        var5 = Kickabout.field_G;
        try {
          if (param1 != -5) {
            nu.b(false);
          }
          param0.p(-103);
          this.field_v = sk.a(param1 ^ -19886, 8, 0, 4, param0, 16) - 1;
          var3_int = 0;
          do {
            if (var3_int >= this.field_I) {
              if (this.field_u == 0) {
                this.field_n.b(param0, 4);
                this.field_n.a(param1 ^ 65, param0);
              }
              break;
            }
            this.field_R[var3_int].b(param0, param1 + 9);
            this.field_R[var3_int].c(param0, param1 ^ -6);
            var3_int++;
          } while (var5 == 0);
          if (2 == this.field_u) {
            this.field_C.b(param0, ~param1);
            this.field_C.c(param0, param1 + 7);
          }
          if (3 == this.field_u) {
            this.field_o.b(param0, 4);
            this.field_o.a(param0, false);
          }
          if (this.field_u == 4) {
            this.field_V.b(param0, 4);
            var3_int = 0;
            L8: while (true) {
              if (var3_int < 2) {
                stackIn_35_0 = 0;
                if (var5 != 0) {
                  break L8;
                }
                var4 = stackIn_35_0;
                while (5 > var4) {
                  this.field_P[var3_int][var4].b(param0, 4);
                  var4++;
                }
                var3_int++;
                continue;
              }
              this.field_X.b(param0, 4);
              stackIn_35_0 = 0;
              break;
            }
            var3_int = stackIn_35_0;
            L14: while (true) {
              if (var3_int < 2) {
                if (var5 != 0) {
                  break L14;
                }
                var4Lifetime1 = 0;
                while (var4Lifetime1 < 5) {
                  this.field_P[var3_int][var4Lifetime1].b(9, param0);
                  var4Lifetime1++;
                }
                var3_int++;
                continue;
              }
              this.field_V.c(param0, 17);
              this.field_X.a(param0, (byte) -65);
              this.field_J = param0.l(8, 59);
              break;
            }
            this.field_G = mu.a(param0, (byte) -39);
          }
          param0.l((byte) 115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_53_0 = var3;
          stackIn_53_1 = new StringBuilder().append("nu.C(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(byte param0, ki param1) {
        nl stackIn_63_0 = null;
        boolean stackIn_64_1 = false;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        nl var5 = null;
        try {
          if (this.field_u != 4) {
            return;
          }
          if (null != this.field_X &&
            this.field_X.field_m >= 40) {
            return;
          }
          if (this.field_O != -1 &&
            this.field_O < this.field_v) {
            return;
          }
          var3_int = param1.field_u;
          if (param0 <= 58) {
            this.a(95);
          }
          var4 = param1.field_v & 255;
          if (!this.field_R[var3_int].d(3511)) {
            return;
          }
          var5 = this.a((byte) 92, var3_int);
          if (var4 >= 1 &&
            var4 <= 5 &&
            !this.field_h) {
            this.field_R[var3_int].field_p = var4 - 1;
            this.field_R[var3_int].a((mo) (this.field_g[var3_int]), (byte) 84);
          }
          if (0 == var4 &&
            !this.field_A && (var5.field_N.c(var5.field_y, -73) ||
            !this.c(var3_int, -32)) && (0 == var5.field_C &&
            0 == var5.field_u)) {
            var5.a((mo) (this.field_g[var3_int]), (byte) 84);
            var5.a((byte) -31, 4);
            var5.field_C = var5.a((byte) -99);
          }
          if (var4 != 6 ||
            this.field_y) {
            if (var4 != 7) {
              return;
            }
            if (this.field_z) {
              return;
            }
          }
          if (var5.field_u == 0 &&
            this.c(var3_int, -126)) {
            var5.a((byte) -31, 1);
            stackIn_63_0 = var5;
            stackIn_64_1 = (var4 == 7);
            stackIn_63_0.field_O = stackIn_64_1;
            var5.field_L = var5.c((byte) -99);
            var5.a((mo) (this.field_g[var3_int]), (byte) 84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_69_0 = var3;
          stackIn_69_1 = new StringBuilder().append("nu.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
        }
    }

    final int c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4 = 0;
        int var3Lifetime1;
        var5 = Kickabout.field_G;
        try {
          var2_int = 0;
          if (this.field_u == 4) {
            var3 = 0;
            L2: while (true) {
              if (var3 < 2) {
                stackIn_16_0 = 0;
                if (var5 != 0) {
                  break L2;
                }
                var4 = stackIn_16_0;
                while (var4 < 5) {
                  var2_int = var2_int ^ this.field_P[var3][var4].b((byte) -65);
                  var4++;
                }
                var3++;
                continue;
              }
              var2_int = var2_int ^ this.field_X.c(0);
              stackIn_16_0 = var2_int ^ this.field_V.d(121);
              break;
            }
            var2_int = stackIn_16_0;
          }
          var3Lifetime1 = 71 % ((param0 - 16) / 38);
          stackIn_18_0 = var2_int;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "nu.Q(" + param0 + ')');
        }
    }

    final boolean a(int param0, boolean param1, long param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        up var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Kickabout.field_G;
        try {
          stackIn_5_0 = (param4 < 2) ? 0 : 1;
          var7_int = stackIn_5_0;
          if (param2 != 1272878999115L &&
            param2 != 1272878132285L) {
            stackIn_12_0 = 0;
          } else {
            stackIn_12_0 = 1;
          }
          var8 = stackIn_12_0;
          if (var8 == 0 && (var7_int == 0 ||
            param0 == 11)) {
            if (param1) {
              return true;
            }
            var9 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var9 >= 4))) {
              var10 = this.field_g[param3].field_p;
              stackIn_37_0 = param3;
              if (var13 == 0) {
                if (stackIn_37_0 == this.field_i[var10][var9]) {
                  var11 = this.field_P[var10][1 + var9].field_N;
                  var12 = this.field_P[var10][var9 + 1].field_y ? 1 : 0;
                  if (var11.a(true, param0, var12 != 0)) {
                    return true;
                  }
                }
                var9++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_37_0 = 0;
            }
            return stackIn_37_0 != 0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var7), "nu.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_g.length <= var3_int))) {
            stackIn_16_0 = this.field_g[var3_int].field_p;
            stackIn_16_1 = param1;
            if (var5 == 0) {
              if (stackIn_16_0 == stackIn_16_1 &&
                this.field_R[var3_int].d(3511)) {
                stackIn_13_0 = var3_int;
                return stackIn_13_0;
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_16_0 = 120;
            stackIn_16_1 = (param0 + 10) / 47;
          }
          var4 = stackIn_16_0 % stackIn_16_1;
          stackIn_17_0 = 0;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "nu.HA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, ki param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (0 != this.field_u) {
            return;
          }
          if (!this.field_R[param1.field_u].d(param0 + 3510)) {
            return;
          }
          if (param0 != 1) {
            nu.b(false);
          }
          this.field_n.a(param1.field_u, 11678, param1.field_v);
          this.field_n.a((mo) (this.field_g[param1.field_u]), (byte) 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("nu.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void b(int param0) {
        int fieldTemp$0 = 0;
        jc dupTemp$1 = null;
        jc dupTemp$2 = null;
        jc dupTemp$3 = null;
        jc dupTemp$4 = null;
        jc dupTemp$5 = null;
        jc dupTemp$6 = null;
        jc dupTemp$7 = null;
        jc dupTemp$8 = null;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_217_1 = 0;
        int stackIn_278_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_294_0 = 0;
        int stackIn_294_1 = 0;
        int stackIn_300_0 = 0;
        int stackIn_332_0 = 0;
        int stackIn_332_1 = 0;
        tj stackIn_351_0 = null;
        int stackIn_352_1 = 0;
        ch stackIn_355_0;
        int stackIn_355_1;
        int stackIn_355_2;
        nl stackIn_355_3;
        int stackIn_355_4;
        int stackIn_355_5;
        int stackIn_356_6 = 0;
        int stackIn_368_0 = 0;
        int stackIn_368_1 = 0;
        int stackIn_442_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        nl var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        nl var4_ref_nl = null;
        int var4 = 0;
        int var5_int = 0;
        nl var5 = null;
        int var6 = 0;
        nl var6_ref_nl = null;
        int var7 = 0;
        int var8_int = 0;
        nl var8 = null;
        int var9 = 0;
        long var10_long = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nl var13 = null;
        int var14 = 0;
        nl var4_ref_nlLifetime1;
        nl var4_ref_nlLifetime2;
        nl var6_ref_nlLifetime1;
        int stackIn_77_0Lifetime1;
        int stackIn_77_1Lifetime1;
        int stackIn_217_0Lifetime1;
        int stackIn_217_1Lifetime1;
        int stackIn_294_0Lifetime1;
        int stackIn_294_1Lifetime1;
        int stackIn_332_0Lifetime1;
        int stackIn_332_1Lifetime1;
        int stackIn_368_0Lifetime1;
        int stackIn_368_1Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var9Lifetime2;
        int var10Lifetime2;
        int stackIn_77_0Lifetime1Lifetime1;
        int stackIn_77_1Lifetime1Lifetime1;
        int stackIn_294_0Lifetime1Lifetime1;
        int stackIn_294_1Lifetime1Lifetime1;
        int var3Lifetime2Lifetime1;
        int var5_intLifetime1Lifetime1;
        int var5_intLifetime2Lifetime1;
        int var6Lifetime1Lifetime1;
        int var7Lifetime2Lifetime1;
        int var8_intLifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        var14 = Kickabout.field_G;
        try {
          if (-1 != this.field_O &&
            this.field_O < this.field_v) {
            return;
          }
          fieldTemp$0 = this.field_J - 1;
          this.field_J = this.field_J - 1;
          if (fieldTemp$0 <= 0) {
            this.field_J = 255;
          }
          if (param0 != 11660) {
            field_D = (String) null;
          }
          vl.a(this, (byte) -41);
          var2_int = 0;
          while (true) {
            stackIn_17_0 = -3;
            stackIn_17_1 = ~var2_int;
            if (stackIn_17_0 < stackIn_17_1) {
              stackIn_61_0 = 0;
              if (var14 == 0) {
                var3 = stackIn_61_0;
                while (var3 < 5) {
                  var4_ref_nl = this.field_P[var2_int][var3];
                  stackIn_17_0 = this.field_V.field_m;
                  stackIn_17_1 = var2_int;
                  if (stackIn_17_0 == stackIn_17_1 &&
                    ~var3 == ~this.field_V.field_s) {
                    stackIn_29_0 = 1;
                  } else {
                    stackIn_29_0 = 0;
                  }
                  var5_int = stackIn_29_0;
                  var6 = this.a((byte) 6, var2_int, var3);
                  if (-1 != var6 &&
                    this.field_R[var6].field_u) {
                    stackIn_36_0 = 1;
                  } else {
                    stackIn_36_0 = 0;
                  }
                  boolean decompiledFrameRemainder0 = true;
                  var7 = stackIn_36_0;
                  var4_ref_nl.a(2, this.field_x, var7 != 0, var5_int != 0);
                  if ((var2_int != 0 ||
                    !this.field_s) && (1 != var2_int ||
                    !this.field_p)) {
                    stackIn_49_0 = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    stackIn_49_0 = 1;
                  }
                  var8_int = stackIn_49_0;
                  if (var3 == 0) {
                    hv.a(true, this, var2_int);
                  } else {
                    if (var8_int == 0) {
                      jt.a(this, (byte) -127, var3, var2_int);
                    }
                  }
                  var3++;
                }
                var2_int++;
                continue;
              }
            } else {
              this.field_V.a((byte) -97, this.field_t, this.field_B);
              this.field_X.a(this.field_V, -123);
              stackIn_61_0 = -41;
            }
            if (stackIn_61_0 == ~this.field_X.field_m) {
              this.field_X.field_j[this.field_X.field_n] = this.field_X.field_j[this.field_X.field_n] + 1;
              this.field_V.field_m = -1;
              this.field_V.field_r = 205;
              this.field_P[-this.field_X.field_n + 1][0].field_o = 0;
              this.a(param0 ^ 11662);
            }
            boolean decompiledFrameCompleted6 = true;
            boolean decompiledFrameCompleted4 = true;
            L21: {
              boolean decompiledFrameCompleted5 = true;
              if (this.field_X.field_m >= 245) {
                this.a(-this.field_X.field_n + 1, 0);
                this.field_X.field_m = 0;
                var2_int = 0;
                while (!(var2_int >= this.field_X.field_j.length)) {
                  stackIn_77_0 = -100;
                  stackIn_77_1 = ~this.field_X.field_j[var2_int];
                  if (var14 == 0) {
                    if (stackIn_77_0 > stackIn_77_1) {
                      this.field_X.field_j[var2_int] = 99;
                    }
                    var2_int++;
                    continue;
                  }
                  if (stackIn_77_0 > stackIn_77_1) {
                    stackIn_192_0 = 0;
                    decompiledFrameCompleted6 = false;
                    break;
                  }
                  decompiledFrameCompleted5 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted6) &&
                (decompiledFrameCompleted5)) {
                var2_int = 0;
                while (true) {
                  stackIn_77_0Lifetime1 = 2;
                  stackIn_77_1Lifetime1 = var2_int;
                  if (stackIn_77_0Lifetime1 <= stackIn_77_1Lifetime1) {
                    break;
                  }
                  stackIn_192_0 = 0;
                  if (var14 != 0) {
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                  var3Lifetime1 = stackIn_192_0;
                  while (var3Lifetime1 < 5) {
                    var4_ref_nlLifetime1 = this.field_P[var2_int][var3Lifetime1];
                    stackIn_77_0Lifetime1Lifetime1 = var4_ref_nlLifetime1.field_u;
                    stackIn_77_1Lifetime1Lifetime1 = 2;
                    boolean decompiledFrameRemainder3 = true;
                    if (stackIn_77_0Lifetime1Lifetime1 == stackIn_77_1Lifetime1Lifetime1 &&
                      var4_ref_nlLifetime1.field_L == 20 &&
                      ~var2_int == ~this.field_V.field_m &&
                      ~var3Lifetime1 == ~this.field_V.field_s) {
                      if (var4_ref_nlLifetime1.field_z < 0) {
                        this.b(-var4_ref_nlLifetime1.field_z, (byte) -72);
                      } else {
                        var5_intLifetime1 = var4_ref_nlLifetime1.a(var4_ref_nlLifetime1.field_z, (byte) -68);
                        this.a(var5_intLifetime1, var4_ref_nlLifetime1.field_O, var4_ref_nlLifetime1.field_N.c(var4_ref_nlLifetime1.field_y, (byte) -62), var4_ref_nlLifetime1.field_x, (byte) -66, var4_ref_nlLifetime1.field_P);
                        this.field_V.a((mo) (var4_ref_nlLifetime1), (byte) 84);
                        var6_ref_nl = this.field_P[-var2_int + 1][0];
                        this.field_N.a(this, 32, this.field_v, var2_int, var4_ref_nlLifetime1, var5_intLifetime1, var6_ref_nl, this.field_V.field_o, var3Lifetime1);
                        var7Lifetime1 = this.a((byte) 6, var2_int, var3Lifetime1);
                        if (var7Lifetime1 != -1) {
                          if (!var4_ref_nlLifetime1.field_O) {
                            if (var5_intLifetime1 < 128) {
                              dupTemp$1 = this.field_q[var7Lifetime1];
                              dupTemp$1.field_i = dupTemp$1.field_i + 1;
                            } else {
                              dupTemp$2 = this.field_q[var7Lifetime1];
                              dupTemp$2.field_f = dupTemp$2.field_f + 1;
                            }
                            decompiledFrameRemainder3 = false;
                          }
                          else {
                            dupTemp$3 = this.field_q[var7Lifetime1];
                            dupTemp$3.field_q = dupTemp$3.field_q + 1;
                          }
                        }
                      }
                    }
                    boolean decompiledFrameRemainder2 = true;
                    if (0 != var4_ref_nlLifetime1.field_u &&
                      var4_ref_nlLifetime1.field_L <= 0) {
                      if (var2_int == this.field_V.field_m &&
                        ~var3Lifetime1 == ~this.field_V.field_s) {
                        stackIn_126_0 = 1;
                      } else {
                        stackIn_126_0 = 0;
                      }
                      var5_intLifetime1Lifetime1 = stackIn_126_0;
                      if (var4_ref_nlLifetime1.field_u != 2) {
                        if (var4_ref_nlLifetime1.field_u == 1) {
                          var4_ref_nlLifetime1.field_L = var4_ref_nlLifetime1.c((byte) -99);
                        } else {
                          if (var4_ref_nlLifetime1.field_u == 5) {
                            var4_ref_nlLifetime1.a((byte) -31, 6);
                          } else {
                            if (7 == var4_ref_nlLifetime1.field_u) {
                              var4_ref_nlLifetime1.a((byte) -31, 8);
                            } else {
                              if (var4_ref_nlLifetime1.field_u == 8) {
                                var4_ref_nlLifetime1.a((byte) -31, 9);
                              } else {
                                if (var4_ref_nlLifetime1.field_u != 3 ||
                                  var5_intLifetime1Lifetime1 != 0) {
                                  if (var4_ref_nlLifetime1.field_u != 12) {
                                    if (var4_ref_nlLifetime1.field_u != 13 ||
                                      0 != var4_ref_nlLifetime1.field_v) {
                                      if (var4_ref_nlLifetime1.field_u == 14) {
                                        var4_ref_nlLifetime1.field_L = 1;
                                      } else {
                                        var4_ref_nlLifetime1.a((byte) -31, 0);
                                      }
                                    } else {
                                      var4_ref_nlLifetime1.a((byte) -31, 10);
                                    }
                                  } else {
                                    var4_ref_nlLifetime1.a((byte) -31, 10);
                                    if ((var5_intLifetime1Lifetime1 == 0)) {
                                      var4_ref_nlLifetime1.field_L = var4_ref_nlLifetime1.field_L + 60;
                                    }
                                  }
                                } else {
                                  var4_ref_nlLifetime1.a((byte) -31, 10);
                                  var4_ref_nlLifetime1.field_L = var4_ref_nlLifetime1.field_L + 20;
                                }
                              }
                            }
                          }
                        }
                        decompiledFrameRemainder2 = false;
                      }
                      else {
                        var4_ref_nlLifetime1.a((byte) -31, 0);
                      }
                    }
                    var3Lifetime1++;
                  }
                  var2_int++;
                }
              }
            }
            if ((decompiledFrameCompleted6) &&
              (decompiledFrameCompleted4)) {
              stackIn_192_0 = 0;
            }
            var2_int = stackIn_192_0;
            while (this.field_I > var2_int) {
              if (var14 == 0) {
                if (this.field_R[var2_int].d(3511) &&
                  this.field_R[var2_int].field_p != 0 &&
                  !this.c(var2_int, -125)) {
                  this.a(73, this.field_R[var2_int], this.field_R[var2_int].field_p, var2_int);
                  this.field_R[var2_int].field_p = 0;
                }
                var2_int++;
                continue;
              }
              break;
            }
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            L73: {
              boolean decompiledFrameCompleted2 = true;
              boolean decompiledFrameCompleted3 = true;
              L75: {
                var2 = this.b((byte) -96);
                if (var2 != null) {
                  this.field_V.field_p = var2.field_w;
                  this.field_V.field_v = var2.field_v;
                  this.field_V.field_t = var2.field_M;
                  if (var14 == 0) {
                    break L75;
                  }
                }
                if (this.field_V.g(param0 ^ -11752)) {
                  var3Lifetime2 = this.field_V.e(10);
                  var4 = 0;
                  while (true) {
                    stackIn_217_0 = 2;
                    stackIn_217_1 = var4;
                    if (stackIn_217_0 <= stackIn_217_1) {
                      break;
                    }
                    stackIn_292_0 = 0;
                    if (var14 != 0) {
                      decompiledFrameCompleted3 = false;
                      break;
                    }
                    var5_intLifetime2 = stackIn_292_0;
                    while (var5_intLifetime2 < 5) {
                      var6_ref_nlLifetime1 = this.field_P[var4][var5_intLifetime2];
                      var7Lifetime2 = 900;
                      stackIn_217_0Lifetime1 = ~var5_intLifetime2;
                      stackIn_217_1Lifetime1 = -1;
                      if (stackIn_217_0Lifetime1 == stackIn_217_1Lifetime1) {
                        var8_intLifetime1 = -var6_ref_nlLifetime1.field_o + 20;
                        var7Lifetime2 = var8_intLifetime1 * var8_intLifetime1;
                      }
                      if (var3Lifetime2 <= (var7Lifetime2 << 16) &&
                        3 != var6_ref_nlLifetime1.field_u &&
                        var6_ref_nlLifetime1.field_u != 13 &&
                        var6_ref_nlLifetime1.field_u != 5 &&
                        var6_ref_nlLifetime1.field_u != 7 &&
                        var6_ref_nlLifetime1.field_u != 8 &&
                        var6_ref_nlLifetime1.field_u != 9) {
                        var8_intLifetime1 = var6_ref_nlLifetime1.f(-127) - this.field_V.a(true);
                        var9 = var6_ref_nlLifetime1.a(true) - this.field_V.c(879306160);
                        if (var9 * var9 + var8_intLifetime1 * var8_intLifetime1 < 1600) {
                          this.field_V.a((mo) (var6_ref_nlLifetime1), (byte) 84);
                          this.field_V.field_s = var5_intLifetime2;
                          this.field_V.field_i = 0;
                          this.field_V.field_m = var4;
                          if (0 != var5_intLifetime2) {
                            this.a(-115, this.field_V, var5_intLifetime2, this.b((byte) 107, var4));
                          }
                        }
                      }
                      var5_intLifetime2++;
                    }
                    var4++;
                  }
                }
              }
              if (decompiledFrameCompleted3) {
                if (null == var2) {
                  var3Lifetime2 = 0;
                  while (2 > var3Lifetime2) {
                    var4_ref_nlLifetime2 = this.field_P[var3Lifetime2][0];
                    stackIn_294_0 = ~var4_ref_nlLifetime2.field_u;
                    stackIn_294_1 = -3;
                    if (var14 == 0) {
                      if (stackIn_294_0 != stackIn_294_1 &&
                        var4_ref_nlLifetime2.field_u != 3) {
                        var5_intLifetime2Lifetime1 = this.field_V.a(true) - var4_ref_nlLifetime2.f(-102);
                        var6Lifetime1 = this.field_V.c(879306160) - var4_ref_nlLifetime2.a(true);
                        var7Lifetime2 = var6Lifetime1 * var6Lifetime1 + var5_intLifetime2Lifetime1 * var5_intLifetime2Lifetime1;
                        if (var7Lifetime2 < 784) {
                          var8_intLifetime1 = uv.b(var6Lifetime1, var5_intLifetime2Lifetime1, (byte) 2);
                          var9Lifetime2 = 511 & 693 * var4_ref_nlLifetime2.f(-99);
                          if (256 > var9Lifetime2) {
                            var9Lifetime2 -= 512;
                          }
                          var8_intLifetime1 = 8191 & var8_intLifetime1 - (-8192 - var9Lifetime2);
                          if (var4_ref_nlLifetime2.field_u == 5) {
                            stackIn_278_0 = (var3Lifetime2 == 0) ? 1024 : -1024;
                            var10 = stackIn_278_0;
                            if ((var4_ref_nlLifetime2.field_G & 2) != 0) {
                              var8_intLifetime1 = 8191 & -var10 + (8192 + var8_intLifetime1);
                            }
                            if (0 != (var4_ref_nlLifetime2.field_G & 8)) {
                              var8_intLifetime1 = 8191 & var10 + var8_intLifetime1 + 8192;
                            }
                          }
                          this.field_V.a((mo) (var4_ref_nlLifetime2), (byte) 84);
                          var10Lifetime2 = pc.a(this.field_V.e(3), -524289) >> 8;
                          this.field_V.field_q = (we.a(var8_intLifetime1, false) >> 8) * var10Lifetime2;
                          this.field_V.field_h = var10Lifetime2 * (ei.a(var8_intLifetime1, (byte) -23) >> 8);
                          this.field_V.a((byte) -78, this.field_t, this.field_B);
                          if (var4_ref_nlLifetime2.field_o < 15) {
                            var4_ref_nlLifetime2.field_o = var4_ref_nlLifetime2.field_o + 1;
                          }
                        }
                      }
                      var3Lifetime2++;
                      continue;
                    }
                    if (stackIn_294_0 >= stackIn_294_1) {
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                    stackIn_442_0 = 0;
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                }
                if ((decompiledFrameCompleted2) &&
                  (decompiledFrameCompleted1)) {
                  stackIn_292_0 = 0;
                }
              }
              if ((decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1)) {
                var3Lifetime2Lifetime1 = stackIn_292_0;
                while (true) {
                  stackIn_294_0Lifetime1 = -3;
                  stackIn_294_1Lifetime1 = ~var3Lifetime2Lifetime1;
                  if (stackIn_294_0Lifetime1 >= stackIn_294_1Lifetime1) {
                    break;
                  }
                  stackIn_442_0 = 0;
                  if (var14 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var4Lifetime1 = stackIn_442_0;
                  L123: while (true) {
                    stackIn_300_0 = -6;
                    if (stackIn_300_0 < ~var4Lifetime1) {
                      var5 = this.field_P[var3Lifetime2Lifetime1][var4Lifetime1];
                      stackIn_294_0Lifetime1Lifetime1 = -4;
                      stackIn_294_1Lifetime1Lifetime1 = ~var5.field_u;
                      if (stackIn_294_0Lifetime1Lifetime1 == stackIn_294_1Lifetime1Lifetime1 ||
                        var5.field_u == 13 ||
                        var14 != 0) {
                        if (this.field_V.field_m == -1 &&
                          Math.abs(-var5.field_v + this.field_V.field_v) >> 16 < 30 &&
                          this.field_V.field_r == 0) {
                          var6Lifetime1Lifetime1 = var5.f(param0 - 11776) - this.field_V.a(true);
                          var7Lifetime2Lifetime1 = var5.a(true) - this.field_V.c(879306160);
                          var8_intLifetime1Lifetime1 = var7Lifetime2Lifetime1 * var7Lifetime2Lifetime1 + var6Lifetime1Lifetime1 * var6Lifetime1Lifetime1;
                          if (var8_intLifetime1Lifetime1 < 1600) {
                            this.field_V.a((mo) (var5), (byte) 84);
                            var9Lifetime1 = (4 * var5.field_N.d(var5.field_y, 0) << 16) / 100 + 524288;
                            var10_long = (long)(var9Lifetime1 + Math.max(var5.field_q, pc.a(this.field_V.e(-127), -524289)));
                            this.field_V.field_r = 5;
                            this.field_V.field_h = (int)((long)var5.field_m * var10_long / (long)var5.field_q);
                            this.field_V.field_q = (int)(var10_long * (long)var5.field_k / (long)var5.field_q);
                            var12 = 0;
                            while (true) {
                              if (var12 < this.field_I) {
                                stackIn_332_0 = this.field_g[var12].field_p;
                                stackIn_332_1 = var3Lifetime2Lifetime1;
                                if (stackIn_332_0 == stackIn_332_1 &&
                                  ~this.field_R[var12].field_g == ~var4Lifetime1) {
                                  this.field_V.field_j = var12;
                                }
                                var12++;
                                continue;
                              }
                              var12 = this.a((byte) 6, var3Lifetime2Lifetime1, var4Lifetime1);
                              stackIn_332_0Lifetime1 = 13;
                              stackIn_332_1Lifetime1 = var5.field_u;
                              if (stackIn_332_0Lifetime1 == stackIn_332_1Lifetime1 &&
                                this.field_V.field_i == 2 &&
                                this.field_V.field_o != -1 &&
                                var12 != -1 &&
                                ~this.field_V.field_o != ~var12) {
                              }
                              if (var12 != -1) {
                                this.field_V.field_o = var12;
                              }
                              stackIn_351_0 = this.field_V;
                              if (var5.field_u == 13) {
                                stackIn_352_1 = 2;
                              } else {
                                stackIn_352_1 = 1;
                              }
                              stackIn_351_0.field_i = stackIn_352_1;
                              var13 = this.field_P[-var3Lifetime2Lifetime1 + 1][0];
                              stackIn_355_0 = this.field_N;
                              stackIn_355_1 = 35;
                              stackIn_355_2 = this.field_V.field_o;
                              stackIn_355_3 = var13;
                              stackIn_355_4 = var4Lifetime1;
                              stackIn_355_5 = this.field_v;
                              if (var5.field_u != 13) {
                                stackIn_356_6 = 2;
                              } else {
                                stackIn_356_6 = 3;
                              }
                              ((ch) (Object) stackIn_355_0).a((byte) stackIn_355_1, stackIn_355_2, stackIn_355_3, stackIn_355_4, stackIn_355_5, stackIn_356_6, var3Lifetime2Lifetime1, this, var5);
                              if (var5.field_F == -1) {
                                break;
                              }
                              if (var5.field_u == 13) {
                                dupTemp$4 = this.field_q[var5.field_F];
                                dupTemp$4.field_h = dupTemp$4.field_h + 1;
                                break;
                              }
                              dupTemp$5 = this.field_q[var5.field_F];
                              dupTemp$5.field_j = dupTemp$5.field_j + 1;
                              break;
                            }
                          }
                        }
                        if (var5.field_u == 3) {
                          var6Lifetime1Lifetime1 = 0;
                          while (true) {
                            stackIn_368_0 = 2;
                            stackIn_368_1 = var6Lifetime1Lifetime1;
                            if (stackIn_368_0 <= stackIn_368_1) {
                              break;
                            }
                            stackIn_300_0 = 0;
                            var7Lifetime2Lifetime1 = stackIn_300_0;
                            while (var7Lifetime2Lifetime1 < 5) {
                              stackIn_368_0Lifetime1 = var3Lifetime2Lifetime1;
                              stackIn_368_1Lifetime1 = var6Lifetime1Lifetime1;
                              boolean decompiledFrameRemainder1 = true;
                              if (stackIn_368_0Lifetime1 != stackIn_368_1Lifetime1 ||
                                var7Lifetime2Lifetime1 != var4Lifetime1 ||
                                var14 != 0) {
                                var8 = this.field_P[var6Lifetime1Lifetime1][var7Lifetime2Lifetime1];
                                if ((0 == var4Lifetime1 || (var3Lifetime2Lifetime1 != var6Lifetime1Lifetime1 ||
                                  !this.field_F[var6Lifetime1Lifetime1] ||
                                  var14 != 0)) && (0 == var4Lifetime1 || (var3Lifetime2Lifetime1 != var6Lifetime1Lifetime1 ||
                                  var5.field_N.b(false, var5.field_y))) && (0 == var4Lifetime1 || (var6Lifetime1Lifetime1 != var3Lifetime2Lifetime1 ||
                                  !var8.field_N.b(var8.field_y, (byte) -111)))) {
                                  var9Lifetime1Lifetime1 = var5.f(-122) - var8.f(-94);
                                  var10Lifetime1 = var5.a(true) - var8.a(true);
                                  if (var9Lifetime1Lifetime1 * var9Lifetime1Lifetime1 + var10Lifetime1 * var10Lifetime1 < 1600 &&
                                    4 != var8.field_J) {
                                    var8.a((byte) -31, 7);
                                    var8.field_L = var8.field_L + var5.field_N.a(var5.field_y, false);
                                    var8.a((mo) (var5), (byte) 84);
                                    if (var4Lifetime1 != 0) {
                                      var11 = var5.field_L;
                                      var5.a((byte) -31, 12);
                                      var5.field_L = var11;
                                    }
                                    var11Lifetime1 = this.a((byte) 6, var6Lifetime1Lifetime1, var7Lifetime2Lifetime1);
                                    if (var11Lifetime1 != -1) {
                                      dupTemp$6 = this.field_q[var11Lifetime1];
                                      dupTemp$6.field_a = dupTemp$6.field_a + 1;
                                    }
                                    if (~var6Lifetime1Lifetime1 != ~this.field_V.field_m ||
                                      this.field_V.field_s != var7Lifetime2Lifetime1) {
                                      if ((-1 != var5.field_F)) {
                                        dupTemp$7 = this.field_q[var5.field_F];
                                        dupTemp$7.field_c = dupTemp$7.field_c + 1;
                                      }
                                      decompiledFrameRemainder1 = false;
                                    }
                                    else {
                                      this.field_V.field_s = var4Lifetime1;
                                      this.field_V.field_m = var3Lifetime2Lifetime1;
                                      if (this.field_V.field_s != 0 &&
                                        this.a((byte) 6, var3Lifetime2Lifetime1, var4Lifetime1) == -1) {
                                        this.a(-127, this.field_V, var4Lifetime1, this.b((byte) 49, var3Lifetime2Lifetime1));
                                      }
                                      if (var5.field_F != -1) {
                                        dupTemp$8 = this.field_q[var5.field_F];
                                        dupTemp$8.field_m = dupTemp$8.field_m + 1;
                                      }
                                    }
                                  }
                                }}
                              var7Lifetime2Lifetime1++;
                            }
                            var6Lifetime1Lifetime1++;
                          }
                        }
                      }
                      var4Lifetime1++;
                      continue L123;
                    }
                    break;
                  }
                  var3Lifetime2Lifetime1++;
                }
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              stackIn_442_0 = 0;
            }
            if (stackIn_442_0 != ~this.field_V.field_m &&
              this.field_V.field_s != -1) {
            }
            if (null != this.b((byte) -96) &&
              this.a((byte) 6, this.field_V.field_m, this.field_V.field_s) != -1) {
              this.field_V.field_o = this.a((byte) 6, this.field_V.field_m, this.field_V.field_s);
            }
            if (this.field_ab != null) {
              this.field_ab.a(-27626, this);
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "nu.L(" + param0 + ')');
        }
    }

    final void a(nu param0, byte param1) {
        int stackIn_21_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        var5 = Kickabout.field_G;
        try {
          var3_int = 0;
          do {
            if (this.field_I <= var3_int) {
              var3_int = 0;
              break;
            }
            this.field_g[var3_int].a(param0.field_g[var3_int], false);
            var3_int++;
          } while (var5 == 0);
          L4: while (true) {
            if (var3_int < 2) {
              stackIn_21_0 = 0;
              if (var5 != 0) {
                break L4;
              }
              var4 = stackIn_21_0;
              while (var4 < 4) {
                this.field_i[var3_int][var4] = param0.field_i[var3_int][var4];
                this.field_k[var3_int][var4] = param0.field_k[var3_int][var4];
                this.field_b[var3_int][var4].a((byte) -89, param0.field_b[var3_int][var4]);
                var4++;
              }
              this.field_r[var3_int] = param0.field_r[var3_int];
              this.field_H[var3_int] = param0.field_H[var3_int];
              this.field_d[var3_int] = param0.field_d[var3_int];
              this.field_Q[var3_int] = param0.field_Q[var3_int];
              var3_int++;
              continue;
            }
            this.field_m = param0.field_m;
            this.field_Z = param0.field_Z;
            this.field_t = param0.field_t;
            stackIn_21_0 = this.field_u;
            break;
          }
          if (stackIn_21_0 != param0.field_u) {
            this.a(param0.field_u, (byte) -125);
          }
          this.field_v = param0.field_v;
          var3_int = 0;
          do {
            if (this.field_I <= var3_int) {
              if (0 == this.field_u) {
                this.field_n.a(param0.field_n, false);
              }
              break;
            }
            this.field_R[var3_int].a(param0.field_R[var3_int], false);
            var3_int++;
          } while (var5 == 0);
          if (this.field_u == 2) {
            this.field_C.a(param0.field_C, false);
          }
          if (this.field_u == 3) {
            this.field_o.a(param0.field_o, false);
          }
          if (param1 <= 42) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (this.field_u == 4) {
            var3_int = 0;
            while (2 > var3_int) {
              stackIn_65_0 = 0;
              if (var5 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              var4Lifetime1 = stackIn_65_0;
              while (var4Lifetime1 < 5) {
                this.field_P[var3_int][var4Lifetime1].a(param0.field_P[var3_int][var4Lifetime1], false);
                var4Lifetime1++;
              }
              var3_int++;
            }
            if (decompiledFrameCompleted1) {
              this.field_V.a(param0.field_V, false);
              this.field_X.a(param0.field_X, false);
              this.field_J = param0.field_J;
              this.field_G = param0.field_G;
            }
          }
          if (decompiledFrameCompleted1) {
            if (this.field_N != null) {
              this.field_N.a(-4, param0.field_N);
            }
            decompiledFrameRemainder0 = (this.field_q != null);
            if (decompiledFrameRemainder0) {
              stackIn_65_0 = 0;
            }
          }
          if (decompiledFrameRemainder0) {
            var3_int = stackIn_65_0;
            while (this.field_q.length > var3_int) {
              this.field_q[var3_int].a(true, param0.field_q[var3_int]);
              var3_int++;
              if (var5 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted0) &&
            (this.field_ab == null)) {
            return;
          }
          this.field_ab.a(120, param0.field_ab);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_79_0 = var3;
          stackIn_79_1 = new StringBuilder().append("nu.DA(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        RuntimeException runtimeException = null;
        dt[] var1 = null;
        int var2 = 0;
        dt var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (null != af.field_a &&
            nw.field_b.field_R[ek.field_G].d(3511)) {
            var1 = af.field_a;
            var2 = 0;
            if (param0) {
              nu.b(false);
            }
            while (var1.length > var2) {
              var3 = var1[var2];
              var3.a((byte) 10);
              var2++;
              if (var4 != 0) {
                return;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) runtimeException), "nu.BA(" + param0 + ')');
        }
    }

    private final void a(nl param0, byte param1) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        tj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var7Lifetime1;
        int var9Lifetime1;
        var12 = Kickabout.field_G;
        try {
          var3_int = param0.field_M;
          var4 = param0.field_w;
          var5 = new tj();
          var5.a(this.field_V, false);
          var8 = -3 / ((param1 + 30) / 33);
          var6 = 2147483647;
          var7 = 0;
          var7Lifetime1 = 0;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7Lifetime1 < param0.field_L) {
              var3_int = var3_int + param0.field_k;
              var4 = var4 + param0.field_m;
              var5.a((byte) -85, this.field_t, this.field_B);
              stackIn_12_0 = var7Lifetime1;
              stackIn_12_1 = 10;
              if (var12 != 0) {
                break L1;
              }
              if (stackIn_12_0 > stackIn_12_1) {
                var9 = -var3_int + var5.field_t >> 16;
                var10 = var5.field_p - var4 >> 16;
                var11 = var9 * var9 + var10 * var10;
                decompiledFrameRemainder0 = !(var6 <= var11);
                if (decompiledFrameRemainder0) {
                  var6 = var11;
                }
              }
              if (decompiledFrameRemainder0) {
                var7Lifetime1++;
                continue;
              }
            }
            stackIn_12_0 = -10001;
            stackIn_12_1 = ~var6;
            break;
          }
          if (stackIn_12_0 < stackIn_12_1 &&
            var7Lifetime1 > 1) {
            param0.field_B = (-param0.field_w + var5.field_p) / var7Lifetime1;
            param0.field_L = var7Lifetime1 + 1;
            param0.field_r = (var5.field_t - param0.field_M) / var7Lifetime1;
            param0.field_s = true;
            var9Lifetime1 = -param0.field_v + var5.field_v - 327680;
            if (var9Lifetime1 > 0 &&
              param0.field_v == 0) {
              param0.field_K = (var9Lifetime1 + (var7Lifetime1 * 26214 * var7Lifetime1 >> 1)) / var7Lifetime1;
              if (458752 < param0.field_K) {
                param0.field_K = 458752;
              }
              param0.a((byte) -31, 13);
              param0.field_L = (param0.field_K << 1) / 26214;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("nu.N(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(boolean param0, ki param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        nl var4 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_u != 4) {
            return;
          }
          if (this.field_X != null &&
            40 <= this.field_X.field_m) {
            return;
          }
          if (-1 != this.field_O &&
            this.field_v > this.field_O) {
            return;
          }
          if (!param0) {
            this.field_y = true;
          }
          var3_int = param1.field_u;
          if (this.field_R[var3_int].d(3511) &&
            !this.field_Y) {
            var4 = this.a((byte) -94, var3_int);
            var4.field_G = param1.field_v;
            var4.a((mo) (this.field_g[var3_int]), (byte) 84);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_25_0 = runtimeException;
          stackIn_25_1 = new StringBuilder().append("nu.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final void a(boolean param0, ki param1) {
        tj stackIn_23_0 = null;
        int stackIn_24_1 = 0;
        tj stackIn_31_0 = null;
        int stackIn_32_1 = 0;
        tj stackIn_39_0 = null;
        int stackIn_40_1 = 0;
        tj stackIn_47_0 = null;
        int stackIn_48_1 = 0;
        tj stackIn_58_0 = null;
        int stackIn_59_1 = 0;
        tj stackIn_66_0 = null;
        int stackIn_67_1 = 0;
        gt stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        boolean stackIn_83_1 = false;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        gt var4 = null;
        try {
          if (this.field_u != 4) {
            return;
          }
          var3_int = param1.field_v;
          var4 = this.field_R[param1.field_u];
          if (var3_int == 0) {
            var4.field_l = var4.field_l ^ 1;
          }
          if (var3_int == 1) {
            var4.field_l = var4.field_l ^ 2;
          }
          if (var3_int == 2) {
            var4.field_l = var4.field_l ^ 4;
          }
          if (var3_int == 3) {
            var4.field_l = var4.field_l ^ 8;
          }
          if (var3_int == 4) {
            stackIn_23_0 = this.field_V;
            if (this.field_V.field_l != 3) {
              stackIn_24_1 = 3;
            } else {
              stackIn_24_1 = mp.field_p[this.field_t];
            }
            stackIn_23_0.field_l = stackIn_24_1;
          }
          if (var3_int == 5) {
            stackIn_31_0 = this.field_V;
            if (this.field_V.field_l != 4) {
              stackIn_32_1 = 4;
            } else {
              stackIn_32_1 = mp.field_p[this.field_t];
            }
            stackIn_31_0.field_l = stackIn_32_1;
          }
          if (var3_int == 6) {
            stackIn_39_0 = this.field_V;
            if (this.field_V.field_l != 5) {
              stackIn_40_1 = 5;
            } else {
              stackIn_40_1 = mp.field_p[this.field_t];
            }
            stackIn_39_0.field_l = stackIn_40_1;
          }
          if (var3_int == 7) {
            stackIn_47_0 = this.field_V;
            if (this.field_V.field_l == 6) {
              stackIn_48_1 = mp.field_p[this.field_t];
            } else {
              stackIn_48_1 = 6;
            }
            stackIn_47_0.field_l = stackIn_48_1;
          }
          if (param0) {
            this.b((byte) -83);
          }
          if (var3_int == 8) {
            stackIn_58_0 = this.field_V;
            if (this.field_V.field_l != 7) {
              stackIn_59_1 = 7;
            } else {
              stackIn_59_1 = mp.field_p[this.field_t];
            }
            stackIn_58_0.field_l = stackIn_59_1;
          }
          if (9 == var3_int) {
            stackIn_66_0 = this.field_V;
            if (this.field_V.field_l != 8) {
              stackIn_67_1 = 8;
            } else {
              stackIn_67_1 = mp.field_p[this.field_t];
            }
            stackIn_66_0.field_l = stackIn_67_1;
          }
          if (var3_int == 11) {
            stackIn_74_0 = var4;
            stackIn_75_1 = !(var4.field_u);
            stackIn_74_0.field_u = stackIn_75_1;
          }
          if (var3_int == 10) {
            stackIn_83_1 = !(this.field_G);
            this.field_G = stackIn_83_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_88_0 = var3;
          stackIn_88_1 = new StringBuilder().append("nu.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(')').toString());
        }
    }

    nu(nu param0) {
        this(param0.field_S, param0.field_U, param0.field_c, param0.field_f, param0.field_e, param0.field_L, param0.field_T, param0.field_W, param0.field_w);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, (byte) 74);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("nu.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(nu param0, int param1, int param2, int param3) {
        int stackIn_39_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          this.field_v = param0.field_v;
          var5_int = 0;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var5_int < this.field_I) {
              this.field_R[var5_int].a(param0.field_R[var5_int], param1, param2, 117);
              var5_int++;
              if (var7 == 0) {
                continue;
              }
            } else {
              if (this.field_u != 0) {
                if (this.field_u != 2) {
                  if ((this.field_u != 3) &&
                    (decompiledFrameRemainder0 = (4 == this.field_u))) {
                    var5_int = 0;
                    while (var5_int < 2) {
                      stackIn_39_0 = 0;
                      if (var7 != 0) {
                        break L1;
                      }
                      var6 = stackIn_39_0;
                      while (var6 < 5) {
                        this.field_P[var5_int][var6].a(param0.field_P[var5_int][var6], param1, param2, 104);
                        var6++;
                      }
                      var5_int++;
                    }
                    this.field_V.a(param0.field_V, param1, param2, 68);
                    this.field_X.a(param0.field_X, param1, param2, 41);
                    this.field_G = param0.field_G;
                    decompiledFrameRemainder0 = (var7 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    this.field_o.a(param0.field_o, param1, param2, 72);
                    decompiledFrameRemainder0 = (var7 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.field_C.a(param0.field_C, param1, param2, 83);
                  decompiledFrameRemainder0 = (var7 != 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              this.field_n.a(param0.field_n, param1, param2, param3 + 61);
            }
            stackIn_39_0 = param3;
            break;
          }
          if (stackIn_39_0 != -6) {
            this.a(68, true, -108L, -124, 51);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_46_0 = var5;
          stackIn_46_1 = new StringBuilder().append("nu.LA(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final nl b(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        nl stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_V.field_m == -1) {
            stackIn_2_0 = null;
            return (nl) (stackIn_2_0);
          }
          if (param0 != -96) {
            this.a((nl) null, (byte) 6);
          }
          stackIn_7_0 = this.field_P[this.field_V.field_m][this.field_V.field_s];
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "nu.H(" + param0 + ')');
        }
    }

    final boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -4) {
            this.a((byte) 53, (ki) null);
          }
          stackIn_10_0 = (this.field_g[param0].field_p == this.field_V.field_m) && (~this.field_V.field_s == ~this.field_R[param0].field_g);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "nu.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0, ki param1) {
        gt stackIn_37_0 = null;
        boolean stackIn_38_1 = false;
        gt stackIn_44_0 = null;
        boolean stackIn_45_1 = false;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        try {
          var3_int = param1.field_u;
          if (param0 != 5) {
            return;
          }
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var4 = param1.field_v;
          if (var4 != 0) {
            if ((var4 != 2 ||
              var5 != 0) &&
              (decompiledFrameRemainder0 = (var4 != 3)) &&
              (decompiledFrameRemainder1 = (var4 != 1 ||
              var5 != 0)) &&
              (decompiledFrameRemainder2 = (var4 != 4))) {
              return;
            }
          } else {
            this.field_R[var3_int].field_v = true;
            if (this.field_u < 5) {
              this.field_R[var3_int].field_s = true;
            }
            this.field_R[var3_int].a((mo) (this.field_g[var3_int]), (byte) 84);
            this.field_R[var3_int].field_g = -1;
            this.b(10, var3_int);
            if (var5 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            if (!this.field_R[var3_int].d(3511)) {
              return;
            }
            stackIn_37_0 = this.field_R[var3_int];
            stackIn_38_1 = !(this.field_R[var3_int].field_q);
            stackIn_37_0.field_q = stackIn_38_1;
            if (var5 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            stackIn_44_0 = this.field_R[var3_int];
            stackIn_45_1 = !(this.field_R[var3_int].field_k);
            stackIn_44_0.field_k = stackIn_45_1;
            if (var5 == 0) {
              return;
            }
          }
          if (decompiledFrameRemainder2) {
            if (this.field_u >= 5) {
              return;
            }
            if (this.field_R[var3_int].field_s) {
              return;
            }
            this.b(10, var3_int);
            this.field_R[var3_int].a((mo) (this.field_g[var3_int]), (byte) 84);
            this.field_R[var3_int].field_s = true;
            this.field_R[var3_int].field_g = -1;
            this.field_q[var3_int].field_p = this.field_v;
            if (var5 == 0) {
              return;
            }
          }
          this.field_R[var3_int].a((mo) (this.field_g[var3_int]), (byte) 84);
          this.field_R[var3_int].field_i = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_61_0 = var3;
          stackIn_61_1 = new StringBuilder().append("nu.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_35_0 = 0;
        nl stackIn_46_0 = null;
        int stackIn_47_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        nl[] var4 = null;
        int var5 = 0;
        nl var6 = null;
        int var7 = 0;
        nl var6Lifetime1;
        int var5Lifetime1;
        var7 = Kickabout.field_G;
        try {
          if (this.field_p) {
            param0 = 0;
          }
          var3_int = 0;
          while (true) {
            stackIn_5_0 = var3_int;
            stackIn_5_1 = 2;
            if (stackIn_5_0 < stackIn_5_1) {
              stackIn_35_0 = 0;
              if (var7 == 0) {
                var4_int = stackIn_35_0;
                while (var4_int < 5) {
                  stackIn_5_0 = ~var3_int;
                  stackIn_5_1 = -2;
                  if (stackIn_5_0 == stackIn_5_1 &&
                    var4_int != 0) {
                    stackIn_17_0 = 1;
                  } else {
                    stackIn_17_0 = 0;
                  }
                  boolean decompiledFrameRemainder0 = true;
                  var5 = stackIn_17_0;
                  var6 = this.field_P[var3_int][var4_int];
                  if ((var5 != 0 ||
                    !this.field_s) && (var5 == 0 ||
                    !this.field_p)) {
                    var6.field_M = ts.a(var4_int, param0, var3_int, 448) << 16;
                    var6.field_w = cp.a((byte) 21, var4_int, var3_int, param0) << 16;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var6.field_M = sh.a(70, var4_int);
                    var6.field_w = fm.a((byte) -27, var3_int);
                  }
                  var4_int++;
                }
                var3_int++;
                continue;
              }
            } else {
              this.field_V.a(29360128, 0, (byte) 26, 44040192);
              this.field_V.field_m = -1;
              stackIn_35_0 = param1;
            }
            var3_int = stackIn_35_0;
            while (var3_int < 2) {
              var4 = this.field_P[var3_int];
              if (var7 != 0) {
                return;
              }
              var5Lifetime1 = 0;
              while (var5Lifetime1 < var4.length) {
                var6Lifetime1 = var4[var5Lifetime1];
                stackIn_46_0 = var6Lifetime1;
                if (var3_int != 0) {
                  stackIn_47_1 = 1;
                } else {
                  stackIn_47_1 = -1;
                }
                stackIn_46_0.field_n = stackIn_47_1;
                var6Lifetime1.field_G = 0;
                var6Lifetime1.field_j = 0;
                var5Lifetime1++;
              }
              var3_int++;
            }
            this.field_E.b(param1 + 22997);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "nu.R(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, ki param1) {
        jc dupTemp$0 = null;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        nl var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var8Lifetime1;
        try {
          if (this.field_u != 4) {
            return;
          }
          if (null != this.field_X &&
            this.field_X.field_m >= 40) {
            return;
          }
          if (-1 != this.field_O &&
            this.field_O < this.field_v) {
            return;
          }
          var3_int = param1.field_u;
          if (!this.field_R[var3_int].d(3511)) {
            return;
          }
          if (param0 != 60) {
            return;
          }
          var4 = this.c(var3_int, -126) ? 1 : 0;
          var5 = this.a((byte) -119, var3_int);
          var6 = param1.field_o;
          var7 = param1.field_p;
          if (var6 == 0 &&
            var7 == 0) {
            var6 = var5.field_j;
            var7 = var5.field_n;
          }
          var5.a((mo) (this.field_g[var3_int]), (byte) 84);
          if (var4 == 0 ||
            var5.field_u != 1) {
            if (var4 != 0) {
              return;
            }
            if (!var5.d((byte) 108)) {
              return;
            }
            if (this.field_l) {
              return;
            }
            var8 = uv.b(var7, var6, (byte) 2);
            var5.b(var8, param0 - 61);
            if (-1 == this.field_V.field_m) {
              this.a(var5, (byte) 115);
            }
            var5.field_F = var3_int;
            dupTemp$0 = this.field_q[var3_int];
            dupTemp$0.field_n = dupTemp$0.field_n + 1;
            if (Kickabout.field_G == 0) {
              return;
            }
          }
          var5.field_P = var7;
          var5.field_x = var6;
          var5.field_z = param1.field_v;
          var8Lifetime1 = var5.d(5339);
          var9 = uv.a(true, var7, var6);
          stackIn_41_0 = (pq.b(170, var8Lifetime1 ^ var9) <= 1) ? 0 : 1;
          var10 = stackIn_41_0;
          var5.field_h = var9;
          var5.a((byte) -31, 2);
          if (var10 != 0) {
            var5.field_L = var5.field_L + 16;
          }
          var11 = var5.a(var5.field_z, (byte) -68) - 128;
          if (var11 > 0) {
            var5.field_L = var5.field_L + (16 * var11 >> 7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_52_0 = var3;
          stackIn_52_1 = new StringBuilder().append("nu.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    private final String c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_25_0 = null;
        String stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_u == 0) {
            stackIn_4_0 = "TeamSelection";
            return stackIn_4_0;
          }
          var2_int = -3 / ((-57 - param0) / 49);
          if (this.field_u == 1) {
            stackIn_9_0 = "WaitForPlayers";
            return stackIn_9_0;
          }
          if (this.field_u == 2) {
            stackIn_12_0 = "Formation";
            return stackIn_12_0;
          }
          if (this.field_u == 3) {
            stackIn_15_0 = "LineUp";
            return stackIn_15_0;
          }
          if (this.field_u == 4) {
            stackIn_20_0 = "Playing";
            return stackIn_20_0;
          }
          if (this.field_u == 5) {
            stackIn_25_0 = "GameOver";
            return stackIn_25_0;
          }
          stackIn_27_0 = "Invalid[" + this.field_u + "]";
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "nu.IA(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (!param0) {
            field_j = true;
          }
          field_M = null;
          field_a = null;
          field_D = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "nu.CA(" + param0 + ')');
        }
    }

    final nl a(byte param0, int param1) {
        nl stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = 48 / ((param0 - 27) / 62);
          stackIn_1_0 = this.field_P[this.field_g[param1].field_p][this.field_R[param1].field_g];
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "nu.F(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var5 = Kickabout.field_G;
        try {
          if (param0 != 6) {
            stackIn_3_0 = 119;
            return stackIn_3_0;
          }
          var4_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4_int >= this.field_g.length))) {
            stackOut_6_0 = this.field_R[var4_int].d(3511);
            stackIn_20_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var5 == 0) {
              if (stackIn_7_0 &&
                param1 == this.field_g[var4_int].field_p &&
                param2 == this.field_R[var4_int].field_g) {
                stackIn_17_0 = var4_int;
                return stackIn_17_0;
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_20_0 = -1;
          }
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var4), "nu.W(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 10) {
            return;
          }
          if (this.field_u == 0) {
            this.field_n.a(false, param1);
            this.field_n.a((mo) (this.field_g[param1]), (byte) 84);
            if (Kickabout.field_G == 0) {
              return;
            }
          }
          if (2 != this.field_u &&
            4 == this.field_u &&
            this.c(param1, -78)) {
            this.field_V.field_m = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "nu.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, mo param1, int param2, int param3) {
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        nl var6 = null;
        int var7_int = 0;
        nl var7 = null;
        int var8 = 0;
        var8 = Kickabout.field_G;
        try {
          var5_int = this.field_g[param3].field_p;
          var6_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_I <= var6_int))) {
            stackIn_13_0 = var5_int;
            stackIn_13_1 = this.field_g[var6_int].field_p;
            if (var8 == 0) {
              if (stackIn_13_0 == stackIn_13_1 &&
                param2 == this.field_R[var6_int].field_g) {
                return;
              }
              var6_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = -103;
            stackIn_13_1 = (param0 + 39) / 48;
          }
          var7_int = stackIn_13_0 % stackIn_13_1;
          if (this.field_R[param3].field_g != -1) {
            this.a((byte) 118, param3).field_I = 6;
          }
          if (this.field_R[param3].field_g != -1) {
            var6 = this.field_P[var5_int][this.field_R[param3].field_g];
            var7 = this.field_P[var5_int][param2];
            var7.field_G = var6.field_G;
          }
          this.field_R[param3].field_g = param2;
          this.a((byte) 91, param3).a(param1, (byte) 84);
          this.field_R[param3].a(param1, (byte) 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("nu.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(ki param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (3 != this.field_u) {
            return;
          }
          if (!this.field_R[param0.field_u].d(3511)) {
            return;
          }
          this.field_o.a(param0.field_v, 0, param0.field_t, param0.field_s, param0.field_u);
          this.field_o.a((mo) (this.field_g[param0.field_u]), (byte) 84);
          if (param1 >= -8) {
            this.c(-30);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("nu.O(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0, byte param1) {
        long stackIn_15_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        nl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        long var10 = 0L;
        int var12_int = 0;
        long var12 = 0L;
        int var14 = 0;
        var14 = Kickabout.field_G;
        try {
          var3 = this.field_P[this.field_V.field_m][param0];
          var4 = var3.field_M;
          var5 = var3.field_w;
          if (this.field_V.field_m == 1 &&
            this.field_p) {
            var5 = 44040192;
            var4 = 29360128;
          }
          var6 = (var4 - this.field_V.field_t) * 3 >> 2;
          var7 = (var5 - this.field_V.field_p) * 3 >> 2;
          var8 = sg.field_d[this.field_t];
          var10 = var8;
          var12_int = 0;
          if (param1 != -72) {
            this.b((byte) -75, -73);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var12_int >= 70))) {
            stackIn_15_0 = var8 * var10 >> 16;
            if (var14 == 0) {
              var10 = stackIn_15_0;
              var12_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = (-var8 + 65536L << 16) / (-var10 + 65536L);
          }
          var12 = stackIn_15_0;
          this.field_V.field_h = (int)((long)var7 * var12 >> 16);
          this.field_V.field_n = 573440;
          this.field_V.field_q = (int)((long)var6 * var12 >> 16);
          this.field_V.field_r = 10;
          this.field_V.field_m = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3_ref), "nu.U(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1, boolean param2, int param3, byte param4, int param5) {
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          var7_int = (393216 * param0 >> 8) + 786432;
          stackIn_4_0 = (!param1) ? 227 : 700;
          var8 = stackIn_4_0;
          if (param4 > -6) {
            field_D = (String) null;
          }
          var9 = (var7_int >> 8) * we.a(var8, false) >> 8;
          var10 = (var7_int >> 8) * ei.a(var8, (byte) -23) >> 8;
          if (param2 &&
            !param1 &&
            param0 > 32) {
            var9 = var9 + ((var9 * 3 >> 1) + 1280 * param0);
            this.field_V.field_A = 25;
          }
          var11 = de.a(param5 * param5 + param3 * param3, (byte) 84);
          this.field_V.field_n = var10;
          if (var11 != 0) {
            this.field_V.field_q = param3 * var9 / var11;
            this.field_V.field_h = param5 * var9 / var11;
          }
          this.field_V.field_m = -1;
          if (param1) {
            this.field_V.field_r = 35;
            if (Kickabout.field_G == 0) {
              return;
            }
          }
          this.field_V.field_r = 20;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var7), "nu.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void d(int param0) {
        gt dupTemp$0 = null;
        nl dupTemp$1 = null;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        nl var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        try {
          if (this.field_v > 0) {
            this.field_v = this.field_v - 1;
          }
          if (this.field_u == 0) {
            this.field_n.field_b = this.field_n.field_b + 1;
          }
          if (this.field_u == 2) {
            this.field_C.field_b = this.field_C.field_b + 1;
          }
          if (this.field_u == 3) {
            this.field_o.field_b = this.field_o.field_b + 1;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_u == param0) {
            var2_int = 0;
            do {
              if (var2_int >= this.field_I) {
                this.field_V.field_b = this.field_V.field_b + 1;
                this.field_X.field_b = this.field_X.field_b + 1;
                break;
              }
              dupTemp$0 = this.field_R[var2_int];
              dupTemp$0.field_b = dupTemp$0.field_b + 1;
              var2_int++;
            } while (var4 == 0);
            var2_int = 0;
            while (2 > var2_int) {
              stackIn_36_0 = 0;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var3_int = stackIn_36_0;
              while (var3_int < 5) {
                dupTemp$1 = this.field_P[var2_int][var3_int];
                dupTemp$1.field_b = dupTemp$1.field_b + 1;
                var3_int++;
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_36_0 = ~this.field_u;
          }
          if (stackIn_36_0 == -5) {
            this.b(11660);
            var2_int = 0;
            while (var2_int < this.field_I) {
              if (var4 != 0) {
                return;
              }
              if (!this.field_R[var2_int].field_s &&
                this.field_g[var2_int].field_p >= 0 && (!(this.field_R[var2_int].field_g < 0) ||
                var4 != 0)) {
                var3 = this.a((byte) -39, var2_int);
                if (this.field_g[var2_int].field_p == 0 &&
                  var3.a(true) < 672) {
                }
                if (this.field_g[var2_int].field_p == 1 &&
                  var3.a(true) <= 672) {
                }
              }
              var2_int++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "nu.FA(" + param0 + ')');
        }
    }

    final static void a(int param0, long param1, int param2, int param3, boolean param4, String param5) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        ml stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          or.field_d.b(param3, (byte) 77);
          or.field_d.field_n = or.field_d.field_n + 1;
          var7_int = or.field_d.field_n;
          or.field_d.a(param1, -1781890008);
          or.field_d.a(14190, param5);
          or.field_d.a(118, param2);
          stackIn_3_0 = or.field_d;
          stackIn_3_1 = 114;
          if (param4) {
            stackIn_4_2 = 1;
          } else {
            stackIn_4_2 = 0;
          }
          ((ml) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2);
          if (param0 <= 101) {
            field_j = false;
          }
          or.field_d.c(62, or.field_d.field_n - var7_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("nu.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ki var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        try {
          var2 = (ki) (this.field_E.g(24009));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var2))) {
            var3 = var2.field_r;
            stackIn_59_0 = 2;
            stackIn_59_1 = var3;
            if (var4 == 0) {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            if (stackIn_59_0 != stackIn_59_1) {
                              switch (var3) {
                                case 0:
                                  break L9;
                                case 4:
                                  break L8;
                                case 3:
                                  break L7;
                                case 5:
                                  break L6;
                                case 6:
                                  break L5;
                                default:
                                  break L3;
                                case 7:
                                  break L4;
                                case 1:
                                  break;
                              }
                            } else {
                              this.a((byte) 60, var2);
                              break L3;
                            }
                            this.b((byte) 125, var2);
                            break L3;
                          }
                          this.b(true, var2);
                          break L3;
                        }
                        this.a(1, var2);
                        break L3;
                      }
                      this.b(26214, var2);
                      break L3;
                    }
                    this.a(var2, (byte) -34);
                    break L3;
                  }
                  this.c(5, var2);
                  break L3;
                }
                this.a(false, var2);
              }
              var2 = (ki) (this.field_E.c(33));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_59_0 = 69;
            stackIn_59_1 = (param0 - 70) / 48;
          }
          var3 = stackIn_59_0 % stackIn_59_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "nu.A(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0;
        boolean stackOut_22_0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        int var4Lifetime1Lifetime1;
        var7 = Kickabout.field_G;
        try {
          var2 = new int[]{3, 4, param0, 1};
          var3 = 0;
          while (true) {
            stackIn_3_0 = ~this.field_R.length;
            stackIn_3_1 = ~var3;
            if (stackIn_3_0 < stackIn_3_1) {
              stackOut_4_0 = this.field_R[var3].d(3511);
              stackIn_19_0 = stackOut_4_0 ? 1 : 0;
              stackIn_5_0 = stackOut_4_0;
              if (var7 == 0) {
                if (stackIn_5_0) {
                  var4 = this.field_g[var3].field_p;
                  var5 = 0;
                  while (4 > var5) {
                    var6 = var2[var5];
                    stackIn_3_0 = var3;
                    stackIn_3_1 = this.field_i[var4][var6 - 1];
                    if (stackIn_3_0 == stackIn_3_1) {
                      this.field_R[var3].field_g = var6;
                      break;
                    }
                    var5++;
                  }
                }
                var3++;
                continue;
              }
            } else {
              stackIn_19_0 = 0;
            }
            var3 = stackIn_19_0;
            while (true) {
              stackIn_21_0 = ~var3;
              stackIn_21_1 = -3;
              if (stackIn_21_0 > stackIn_21_1) {
                stackOut_22_0 = this.field_R[this.field_i[var3][2]].d(3511);
                stackIn_41_0 = stackOut_22_0 ? 1 : 0;
                stackIn_23_0 = stackOut_22_0;
                if (var7 == 0) {
                  if (!stackIn_23_0) {
                    var4Lifetime1 = 0;
                    while (var4Lifetime1 < this.field_I) {
                      stackIn_21_0 = ~var3;
                      stackIn_21_1 = ~this.field_g[var4Lifetime1].field_p;
                      if (stackIn_21_0 == stackIn_21_1 &&
                        this.field_R[var4Lifetime1].d(3511)) {
                        this.field_R[var4Lifetime1].field_g = 3;
                        break;
                      }
                      var4Lifetime1++;
                    }
                  }
                  var3++;
                  continue;
                }
              } else {
                stackIn_41_0 = 0;
              }
              var3 = stackIn_41_0;
              while (var3 < 2) {
                if (var7 != 0) {
                  return;
                }
                var4Lifetime1Lifetime1 = 1;
                while (var4Lifetime1Lifetime1 < 5) {
                  this.field_P[var3][var4Lifetime1Lifetime1].field_I = 0;
                  var4Lifetime1Lifetime1++;
                }
                var3++;
              }
              this.field_J = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "nu.M(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1) {
        jc stackIn_35_0 = null;
        boolean stackIn_36_1 = false;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        Object var6 = null;
        up var6_ref = null;
        int var7 = 0;
        int var3_intLifetime1;
        var7 = Kickabout.field_G;
        try {
          if (param1 > -49) {
            return;
          }
          this.field_u = param0;
          this.field_v = cv.field_a[this.field_u];
          if (this.field_u == 0) {
            this.field_n = new oe(this.field_R);
            if (var7 == 0) {
              return;
            }
          }
          if (this.field_u != 1) {
            if (this.field_u == 2) {
              this.field_C = new wr();
              if (var7 == 0) {
                return;
              }
            }
            if (3 != this.field_u) {
              if (this.field_u != 4) {
                return;
              }
              if (this.field_q != null) {
                var3_int = 0;
                while (this.field_g.length > var3_int) {
                  if (var7 != 0) {
                    break;
                  }
                  stackIn_35_0 = this.field_q[var3_int];
                  stackIn_36_1 = (this.field_g[var3_int].field_p == 0);
                  stackIn_35_0.field_o = stackIn_36_1;
                  var3_int++;
                }
              }
              this.field_v = this.field_O;
              if (0 < this.field_v) {
                this.field_v = this.field_v + 140;
              }
              this.field_V = new tj();
              this.field_P = new nl[2][5];
              var3_intLifetime1 = 0;
              while (true) {
                stackIn_44_0 = 2;
                stackIn_44_1 = var3_intLifetime1;
                if (stackIn_44_0 > stackIn_44_1) {
                  if (var7 == 0) {
                    var4 = 0;
                    while (var4 < 5) {
                      var5 = 1;
                      stackIn_44_0 = -1;
                      stackIn_44_1 = ~var4;
                      if (stackIn_44_0 > stackIn_44_1) {
                        var6_int = this.field_i[var3_intLifetime1][-1 + var4];
                        if (0 == (this.field_c & 1 << var6_int)) {
                          var5 = 0;
                        }
                      }
                      var6 = null;
                      if (var4 != 0) {
                        var6_ref = this.field_b[var3_intLifetime1][-1 + var4];
                      } else {
                        var6_ref = mv.b(false);
                      }
                      this.field_P[var3_intLifetime1][var4] = new nl();
                      this.field_P[var3_intLifetime1][var4].a(var5 != 0, var6_ref, 3);
                      if (var6_ref.a(var5 != 0, (byte) -111)) {
                        this.field_F[var3_intLifetime1] = true;
                      }
                      var4++;
                    }
                    var3_intLifetime1++;
                    continue;
                  }
                } else {
                  this.field_V.field_l = mp.field_p[this.field_t];
                  this.field_X = new ua();
                  this.a(1, 0);
                  this.a(2);
                }
                if (var7 == 0) {
                  return;
                }
                break;
              }
            }
            this.field_o = new wl(this.field_e, this.field_g, this.field_R, this.field_i, this.field_k, this.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "nu.EA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, ki param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (2 != this.field_u) {
            return;
          }
          if (param0 != 26214) {
            this.field_V = (tj) null;
          }
          var3_int = this.field_g[param1.field_u].field_p;
          if (~this.b((byte) 72, var3_int) != ~param1.field_u) {
            return;
          }
          this.field_C.a(var3_int, 1, param1.field_v);
          this.field_C.a((mo) (this.field_g[param1.field_u]), (byte) 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("nu.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(ki param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_E.a(param0, 3);
          if (param1 >= -114) {
            this.toString();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("nu.V(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        boolean stackIn_14_0 = false;
        int stackIn_42_0 = 0;
        StringBuilder stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        String stackIn_59_2 = null;
        String stackIn_67_2 = null;
        int stackIn_74_0 = 0;
        int stackIn_90_0 = 0;
        String stackIn_100_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        StringBuilder var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        ki var3_ref_ki = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_52_0Lifetime1;
        StringBuilder stackIn_52_1Lifetime1;
        int stackIn_52_2Lifetime1;
        int stackIn_52_3Lifetime1;
        var6 = Kickabout.field_G;
        try {
          var1 = new StringBuilder("CommonGame(players=" + this.field_I + ",timelimit=" + this.field_O + ") phase=" + this.c((byte) 59) + " phase_time=" + this.field_v + "\n");
          discarded$0 = var1.append("\tsurface=" + this.field_t + "\ttier=" + this.field_m + "\twinner=" + this.field_Z + "\tai_tick=" + this.field_J);
          if (this.field_G) {
            discarded$1 = var1.append("\tbigheadmode");
          }
          if (this.field_s) {
            discarded$2 = var1.append("\tdisable_local");
          }
          if (this.field_p) {
            discarded$3 = var1.append("\tdisable_opponent");
          }
          discarded$4 = var1.append("\n");
          var2 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2 >= this.field_S.length))) {
            discarded$5 = var1.append("\t" + var2 + " [" + this.field_g[var2].field_p + "]: " + this.field_S[var2] + "\t" + this.field_R[var2].field_g + " " + this.field_R[var2].field_p + " " + this.field_R[var2].field_l + "\t");
            stackOut_13_0 = this.field_R[var2].field_k;
            stackIn_42_0 = stackOut_13_0 ? 1 : 0;
            stackIn_14_0 = stackOut_13_0;
            if (var6 == 0) {
              if (stackIn_14_0) {
                discarded$6 = var1.append("offer_rematch\t");
              }
              if (this.field_R[var2].field_q) {
                discarded$7 = var1.append("offer_draw\t");
              }
              if (this.field_R[var2].field_s) {
                discarded$8 = var1.append("resigned\t");
              }
              if (this.field_R[var2].field_v) {
                discarded$9 = var1.append("departed\t");
              }
              if (!this.field_R[var2].field_i) {
                discarded$10 = var1.append("!loaded_pitch\t");
              }
              if (!this.field_R[var2].field_n) {
                discarded$11 = var1.append("!reward\t");
              }
              if (this.field_R[var2].field_u) {
                discarded$12 = var1.append("megamode\t");
              }
              discarded$13 = var1.append("\n");
              var2++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var2 = this.field_E.a(false);
            stackIn_42_0 = var2;
          }
          if (stackIn_42_0 > 0) {
            discarded$14 = var1.append("\tEnqueued moves: " + var2 + "\n");
            var3_ref_ki = (ki) (this.field_E.g(24009));
            while (null != var3_ref_ki) {
              discarded$15 = var1.append("\t\t" + var3_ref_ki + "\n");
              var3_ref_ki = (ki) (this.field_E.c(33));
              if (var6 == 0) {
                continue;
              }
              break;
            }
          }
          var3 = 0;
          L16: while (true) {
            if (var3 < 2) {
              discarded$16 = var1.append("\tteam " + var3 + ": kit=[" + this.field_H[var3] + "," + this.field_d[var3] + "," + this.field_Q[var3] + "]\tslot_owner=[");
              stackIn_74_0 = 0;
              if (var6 != 0) {
                break L16;
              }
              var4 = stackIn_74_0;
              L18: while (true) {
                if (var4 >= 4) {
                  while (true) {
                    discarded$17 = var1.append("]\tchosen_player_ids=[");
                    var4 = 0;
                    while (var4 < 4) {
                      stackIn_52_0 = var1;
                      stackIn_52_1 = new StringBuilder().append(this.field_k[var3][var4]);
                      stackIn_52_2 = var4;
                      stackIn_52_3 = 3;
                      if (stackIn_52_2 >= stackIn_52_3) {
                        stackIn_67_2 = "";
                      } else {
                        stackIn_67_2 = ",";
                      }
                      discarded$19 = ((StringBuilder) (Object) stackIn_52_0).append(((StringBuilder) (Object) stackIn_52_1).append(stackIn_67_2).toString());
                      var4++;
                    }
                    break L18;
                  }
                }
                stackIn_52_0Lifetime1 = var1;
                stackIn_52_1Lifetime1 = new StringBuilder().append(this.field_i[var3][var4]);
                stackIn_52_2Lifetime1 = -4;
                stackIn_52_3Lifetime1 = ~var4;
                while (true) {
                  if (stackIn_52_2Lifetime1 >= stackIn_52_3Lifetime1) {
                    stackIn_59_2 = "";
                  } else {
                    stackIn_59_2 = ",";
                  }
                  discarded$18 = ((StringBuilder) (Object) stackIn_52_0Lifetime1).append(((StringBuilder) (Object) stackIn_52_1Lifetime1).append(stackIn_59_2).toString());
                  var4++;
                  continue L18;
                }

              }
              discarded$20 = var1.append("]\tformation=" + this.field_r[var3]);
              if (this.field_F[var3]) {
                discarded$21 = var1.append("\tteam_immunity");
              }
              discarded$22 = var1.append("\n");
              var3++;
              continue;
            }
            stackIn_74_0 = -1;
            break;
          }
          if (stackIn_74_0 == ~this.field_u) {
            discarded$23 = var1.append("\t" + this.field_n);
          }
          if (this.field_u == 2) {
            discarded$24 = var1.append("\t" + this.field_C);
          }
          if (this.field_u == 3) {
            discarded$25 = var1.append("\t" + this.field_o);
          }
          if (this.field_u == 4) {
            discarded$26 = var1.append("\n\t" + this.field_X);
            discarded$27 = var1.append("\n\t" + this.field_V);
            var3 = 0;
            L35: do {
              stackIn_90_0 = 2;
              L37: while (true) {
                if (stackIn_90_0 <= var3) {
                  break L35;
                }
                var4 = 0;
                while (var4 < 5) {
                  discarded$28 = var1.append("\n\t" + var3 + "." + var4 + " " + this.field_P[var3][var4]);
                  var5 = this.a((byte) 6, var3, var4);
                  stackIn_90_0 = ~var5;
                  if (var6 != 0) {
                    continue L37;
                  }
                  if (stackIn_90_0 != 0) {
                    discarded$29 = var1.append("\n\t\tCTRL=\t" + this.field_S[var5]);
                  }
                  var4++;
                }
                break;
              }
              var3++;
            } while (var6 == 0);
          }
          stackIn_100_0 = var1.toString();
          return stackIn_100_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "nu.toString()");
        }
    }

    final void a(ml param0, int param1, int param2) {
        int stackIn_38_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_120_0 = 0;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        String stackIn_139_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime1Lifetime1;
        int var5Lifetime2Lifetime1;
        int var5Lifetime3Lifetime1;
        var7 = Kickabout.field_G;
        try {
          param0.p(param2 ^ -118);
          var4_int = 0;
          do {
            if (var4_int >= this.field_I) {
              this.field_u = param0.l(3, param2 ^ 58);
              break;
            }
            this.field_g[var4_int].field_h = param0.l(16, 59);
            this.field_g[var4_int].field_f = param0.l(3, 59);
            var4_int++;
          } while (var7 == 0);
          if (this.field_u > 0) {
            var4_int = 0;
            do {
              if (var4_int >= this.field_I) {
                var4_int = 0;
                break;
              }
              this.field_g[var4_int].field_p = param0.l(1, 59);
              var4_int++;
            } while (var7 == 0);
            do {
              if (var4_int >= 2) {
                this.field_t = param0.l(2, 59);
                break;
              }
              this.field_H[var4_int] = param0.l(5, 59);
              this.field_d[var4_int] = param0.l(5, param2 + 58);
              this.field_Q[var4_int] = param0.l(5, 59);
              var4_int++;
            } while (var7 == 0);
            this.field_m = param0.l(2, 59);
          }
          boolean decompiledFrameCompleted2 = true;
          if (2 < this.field_u) {
            var4_int = 0;
            while (var4_int < 2) {
              this.field_r[var4_int] = param0.l(3, 59);
              stackIn_38_0 = 0;
              if (var7 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
              var5 = stackIn_38_0;
              while (4 > var5) {
                this.field_i[var4_int][var5] = param0.l(3, ek.b(param2, 58));
                var5++;
              }
              var4_int++;
            }
          }
          if (decompiledFrameCompleted2) {
            stackIn_38_0 = 3;
          }
          boolean decompiledFrameCompleted1 = true;
          if (stackIn_38_0 < this.field_u) {
            var4_int = 0;
            L19: while (true) {
              if (var4_int < 2) {
                stackIn_51_0 = 0;
                if (var7 != 0) {
                  break L19;
                }
                var5Lifetime1 = stackIn_51_0;
                while (var5Lifetime1 < 4) {
                  this.field_k[var4_int][var5Lifetime1] = param0.l(4, 59) - 1;
                  var5Lifetime1++;
                }
                var4_int++;
                continue;
              }
              param0.l((byte) 121);
              stackIn_51_0 = 0;
              break;
            }
            var4_int = stackIn_51_0;
            while (var4_int < 2) {
              stackIn_64_0 = 0;
              if (var7 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              var5Lifetime1Lifetime1 = stackIn_64_0;
              while (var5Lifetime1Lifetime1 < 4) {
                this.field_b[var4_int][var5Lifetime1Lifetime1].a(param2 ^ 46, param0);
                var5Lifetime1Lifetime1++;
              }
              var4_int++;
            }
            if (decompiledFrameCompleted1) {
              param0.p(-116);
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_64_0 = 5;
          }
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_64_0 <= this.field_u) {
            this.field_Z = param0.l(3, 59) - 3;
            var4_int = 0;
            while (this.field_I > var4_int) {
              this.field_g[var4_int].field_l = mu.a(param0, (byte) -39);
              this.field_g[var4_int].field_i = mu.a(param0, (byte) -39);
              stackIn_85_0 = var4_int;
              stackIn_85_1 = param1;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_85_0 == stackIn_85_1) {
                var5Lifetime2 = param0.l(1, 59);
                if (var5Lifetime2 != 1) {
                }
                param0.l(7, 59);
                this.field_g[var4_int].field_g = param0.l(15, 59);
                var5Lifetime2Lifetime1 = param0.l(1, 59);
                this.field_g[var4_int].field_k = param0.l(6, 59);
                if (var5Lifetime2Lifetime1 == 1) {
                  this.field_g[var4_int].field_k = -this.field_g[var4_int].field_k;
                }
                var6 = 0;
                while (!(var6 >= this.field_g[var4_int].field_o.length)) {
                  this.field_g[var4_int].field_o[var6] = param0.l(8, 59);
                  var6++;
                }
              }
              var4_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            this.a(this.field_u, (byte) -124);
            stackIn_85_0 = param2;
            stackIn_85_1 = 1;
          }
          if (stackIn_85_0 != stackIn_85_1) {
            return;
          }
          this.field_v = -1 + sk.a(19881, 8, 0, 4, param0, 16);
          var4_int = 0;
          L38: while (true) {
            if (var4_int < this.field_I) {
              this.field_R[var4_int].b(param0, 4);
              this.field_R[var4_int].c(param0, param2 + 0);
              var4_int++;
              if (var7 == 0) {
                continue;
              }
            } else {
              if (this.field_u != 0) {
                break L38;
              }
              this.field_n.b(param0, 4);
            }
            this.field_n.a(74, param0);
            break;
          }
          if (this.field_u == 2) {
            this.field_C.b(param0, 4);
            this.field_C.c(param0, 2);
          }
          if (3 == this.field_u) {
            this.field_o.b(param0, 4);
            this.field_o.a(param0, false);
          }
          if (this.field_u == 4) {
            this.field_V.b(param0, 4);
            var4_int = 0;
            L45: while (true) {
              if (var4_int < 2) {
                stackIn_120_0 = 0;
                if (var7 != 0) {
                  break L45;
                }
                var5Lifetime3 = stackIn_120_0;
                while (var5Lifetime3 < 5) {
                  this.field_P[var4_int][var5Lifetime3].b(param0, 4);
                  var5Lifetime3++;
                }
                var4_int++;
                continue;
              }
              this.field_X.b(param0, param2 ^ 5);
              stackIn_120_0 = 0;
              break;
            }
            var4_int = stackIn_120_0;
            L51: while (true) {
              if (var4_int < 2) {
                if (var7 != 0) {
                  break L51;
                }
                var5Lifetime3Lifetime1 = 0;
                while (var5Lifetime3Lifetime1 < 5) {
                  this.field_P[var4_int][var5Lifetime3Lifetime1].a(param2 - 13919, param0);
                  var5Lifetime3Lifetime1++;
                }
                var4_int++;
                continue;
              }
              this.field_V.a(param0, (byte) -124);
              this.field_X.a(param0, (byte) -84);
              this.field_J = param0.l(8, 59);
              break;
            }
            this.field_G = mu.a(param0, (byte) -39);
          }
          param0.l((byte) 95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_138_0 = var4;
          stackIn_138_1 = new StringBuilder().append("nu.P(");
          if (param0 == null) {
            stackIn_139_2 = "null";
          } else {
            stackIn_139_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_138_0), ((StringBuilder) (Object) stackIn_138_1).append(stackIn_139_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    nu(String[] param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8) {
        it[] stackIn_9_0;
        int stackIn_9_1;
        it stackIn_9_2;
        it stackIn_9_3;
        int stackIn_9_4;
        it stackIn_10_2 = null;
        it stackIn_10_3 = null;
        boolean stackIn_10_5 = false;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var10_intLifetime1;
        int var10_intLifetime2;
        var12 = Kickabout.field_G;
        this.field_u = -1;
        this.field_E = new tf();
        this.field_l = false;
        this.field_A = false;
        this.field_h = false;
        this.field_z = false;
        this.field_p = false;
        this.field_Z = -2;
        this.field_s = false;
        this.field_B = vi.field_t;
        this.field_y = false;
        this.field_Y = false;
        this.field_G = false;
        this.field_x = wk.field_g;
        try {
          this.field_W = param7;
          this.field_S = param0;
          this.field_T = param6;
          this.field_e = param4;
          this.field_U = param1;
          this.field_f = param3;
          this.field_c = param2;
          this.field_w = param8;
          this.field_L = param5;
          this.field_I = this.field_S.length;
          this.field_O = op.field_z[this.field_U];
          this.field_g = new it[this.field_I];
          this.field_R = new gt[this.field_I];
          var10_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var10_int >= this.field_I))) {
            if (var12 == 0) {
              stackIn_9_0 = this.field_g;
              stackIn_9_1 = var10_int;
              stackIn_9_2 = null;
              stackIn_9_3 = null;
              stackIn_9_4 = var10_int;
              if (1 != qj.b(this.field_c >> var10_int, 1)) {
                stackIn_10_2 = null;
                stackIn_10_3 = null;
                stackIn_10_5 = false;
              } else {
                stackIn_10_2 = null;
                stackIn_10_3 = null;
                stackIn_10_5 = true;
              }
              stackIn_9_0[stackIn_9_1] = new it(stackIn_9_4, stackIn_10_5);
              this.field_R[var10_int] = new gt();
              var10_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_r = new int[2];
            this.field_b = new up[2][4];
            this.field_k = new int[2][4];
          }
          this.field_i = new int[2][4];
          var10_intLifetime1 = 0;
          L4: while (true) {
            if (var10_intLifetime1 < 2) {
              stackIn_24_0 = 0;
              if (var12 != 0) {
                break L4;
              }
              var11 = stackIn_24_0;
              while (var11 < 4) {
                this.field_b[var10_intLifetime1][var11] = new up();
                this.field_k[var10_intLifetime1][var11] = -1;
                var11++;
              }
              var10_intLifetime1++;
              continue L4;
            }
            this.field_d = new int[2];
            this.field_H = new int[2];
            this.field_F = new boolean[2];
            this.field_Q = new int[2];
            this.field_N = new ch();
            this.field_ab = new p(this.field_I);
            this.field_q = new jc[this.field_I];
            stackIn_24_0 = 0;
            break;
          }
          var10_intLifetime2 = stackIn_24_0;
          while (this.field_I > var10_intLifetime2) {
            this.field_q[var10_intLifetime2] = new jc();
            var10_intLifetime2++;
            if (var12 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_34_0 = var10;
          stackIn_34_1 = new StringBuilder().append("nu.<init>(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_D = "<%0> would need a rating of <%1> to play with the current options.";
        field_j = false;
        field_M = "Waiting for graphics";
        field_a = "away";
    }
}
