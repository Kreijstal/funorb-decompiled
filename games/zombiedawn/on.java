/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static java.awt.Image field_i;
    int[] field_b;
    int field_k;
    boolean field_e;
    private int[] field_l;
    int[][] field_p;
    int field_o;
    private boolean field_d;
    int field_j;
    int field_a;
    int field_s;
    static String field_n;
    int[] field_m;
    int field_c;
    int[][] field_h;
    int field_r;
    static vo field_g;
    int[][] field_t;
    int[][] field_f;
    static int field_q;

    final void a(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        va var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          if (!param1 &&
            !this.field_e) {
            return;
          }
          this.field_e = false;
          qk.n((byte) 96);
          var3_int = param0;
          while (this.field_h.length > var3_int) {
            if (var7 != 0) {
              return;
            }
            var4 = 0;
            while (this.field_h[0].length > var4) {
              var5 = (127 & this.field_f[var3_int][var4]) >> 0;
              var6 = ub.a(127, var5);
              if (var6 != null) {
                this.field_h[var3_int][var4] = hi.a(eg.a(this.field_h[var3_int][var4], -128), var6.field_g);
                this.field_e = true;
              }
              var4++;
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "on.N(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        try {
          this.a(this.field_f, (byte) -39);
          this.a(108, this.field_f);
          this.field_k = this.field_f[param0].length;
          this.field_r = this.field_f.length;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "on.J(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_g = null;
          field_n = null;
          if (param0 != 122) {
            on.b(-118);
          }
          field_i = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "on.L(" + param0 + ')');
        }
    }

    private final int c(int param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_239_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_283_0 = 0;
        int stackIn_335_0 = 0;
        int stackIn_601_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var13 = ZombieDawn.field_J;
        try {
          if (!this.field_d) {
            stackIn_3_0 = this.b((byte) -61, param0, param1);
            return stackIn_3_0;
          }
          var4_int = this.a(param0, param1, 1);
          var4_int = var4_int & -67108865;
          var5 = (var4_int & 65408) >> 7;
          if ((var4_int & 33554432) != 0 &&
            0 == var5) {
            var4_int = var4_int & -65409;
            if (!this.b(1 + param0, param1, -1777127001) &&
              !this.d(1 + param0, 1, param1)) {
              stackIn_247_0 = 1;
            } else {
              stackIn_247_0 = 0;
            }
            var6 = stackIn_247_0;
            var7 = (this.a(param0, param1 - 1, 1) & 33488896) >> 16;
            var8 = this.b(param0, 3 + param1, -1777127001) ? 1 : 0;
            if (param2 > -34) {
              stackIn_249_0 = -64;
              return stackIn_249_0;
            }
            boolean decompiledFrameRemainder6 = true;
            if (this.b(param0, param1 - 1, -1777127001) && (var7 == 0 ||
              64 < var7)) {
              stackIn_260_0 = 1;
              decompiledFrameRemainder6 = false;
            }
            else {
              stackIn_260_0 = 0;
            }
            boolean decompiledFrameRemainder5 = true;
            var9 = stackIn_260_0;
            if ((this.b(param0 - 1, param1, -1777127001) ||
              !this.d(-1 + param0, 1, param1)) && (this.b(-1 + param0, param1 + 1, -1777127001) ||
              this.b(param0 - 1, param1 + 2, -1777127001))) {
              stackIn_273_0 = 1;
              decompiledFrameRemainder5 = false;
            }
            else {
              stackIn_273_0 = 0;
            }
            boolean decompiledFrameRemainder4 = true;
            var10 = stackIn_273_0;
            if (this.b(1 + param0, param1, -1777127001) && (this.b(1 + param0, 1 + param1, -1777127001) ||
              this.b(param0 + 1, 2 + param1, -1777127001))) {
              stackIn_283_0 = 1;
              decompiledFrameRemainder4 = false;
            }
            else {
              stackIn_283_0 = 0;
            }
            boolean decompiledFrameRemainder1 = true;
            var11 = stackIn_283_0;
            if (!this.d(param0, 1, param1) ||
              var6 != 0) {
              if (!this.d(param0, 1, param1) ||
                var6 == 0) {
                if (this.b(param0, 1 + param1, -1777127001)) {
                  if (this.b(1 + param0, param1, -1777127001) &&
                    this.b(-1 + param0, param1, -1777127001)) {
                    var4_int = var4_int | this.a(5, -113);
                    decompiledFrameRemainder1 = (var13 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (!this.b(1 + param0, param1, -1777127001)) {
                      if (this.b(-1 + param0, param1, -1777127001)) {
                        var4_int = var4_int | this.a(3, 71);
                        decompiledFrameRemainder1 = (var13 != 0);
                      }
                      if (decompiledFrameRemainder1) {
                        var4_int = var4_int | this.a(1, -124);
                        decompiledFrameRemainder1 = (var13 != 0);
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      var4_int = var4_int | this.a(7, 125);
                      decompiledFrameRemainder1 = (var13 != 0);
                    }
                  }
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = !(!this.b(param0, 2 + param1, -1777127001)))) {
                  if (this.b(1 + param0, param1, -1777127001) &&
                    this.b(param0 - 1, param1, -1777127001)) {
                    var4_int = var4_int | this.a(6, -99);
                    decompiledFrameRemainder1 = (var13 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (!this.b(param0 + 1, param1, -1777127001)) {
                      if (!this.b(-1 + param0, param1, -1777127001)) {
                        var4_int = var4_int | this.a(2, -54);
                        decompiledFrameRemainder1 = (var13 != 0);
                      }
                      if (decompiledFrameRemainder1) {
                        var4_int = var4_int | this.a(4, -76);
                        decompiledFrameRemainder1 = (var13 != 0);
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      var4_int = var4_int | this.a(8, -17);
                      decompiledFrameRemainder1 = (var13 != 0);
                    }
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                var11 = var11 != 0 | this.b(param0 + 1, 1 + param1, -1777127001) ? 1 : 0;
                var10 = var10 != 0 | this.b(param0 - 1, 1 + param1, -1777127001) ? 1 : 0;
                stackIn_335_0 = (this.b(param0 + 1, param1 + 1, -1777127001)) ? 128 : 0;
                boolean decompiledFrameRemainder0 = true;
                var12 = stackIn_335_0;
                if (var8 != 0 ||
                  var9 != 0 ||
                  var10 == 0 ||
                  var11 == 0) {
                  if (var8 == 0 &&
                    var9 == 0 &&
                    var10 == 0 &&
                    var11 != 0) {
                    var4_int = var4_int | this.a(28, 86) - var12;
                  }
                  if (var8 != 0 ||
                    var9 != 0 ||
                    var10 != 0 ||
                    var11 == 0 || var13 != 0) {
                    if (var8 != 0 ||
                      var11 != 0 ||
                      var9 == 0 ||
                      var10 == 0) {
                      if (var8 != 0 ||
                        var11 != 0 ||
                        var9 == 0 ||
                        var10 != 0) {
                        if ((var8 != 0 ||
                          var11 != 0 ||
                          var9 != 0 ||
                          var10 == 0) &&
                          (decompiledFrameRemainder0 = (var8 != 0)) &&
                          (decompiledFrameRemainder0 = !(this.b(1 + param0, param1, -1777127001)))) {
                          var4_int = var4_int | (786432 | this.a(1, -41));
                        }
                        if ((decompiledFrameRemainder0) && (var8 == 0 &&
                          var11 == 0 &&
                          var9 == 0 &&
                          var10 != 0 || var13 != 0)) {
                          var4_int = var4_int | -var12 + this.a(26, 86);
                          if (var13 != 0) {
                            var4_int = var4_int | this.a(28, 110) - var12;
                            var4_int = var4_int | -var12 + this.a(26, -62);
                            var4_int = var4_int | this.a(26, -100) - var12;
                          }
                        }
                      } else {
                        var4_int = var4_int | this.a(28, 110) - var12;
                        if (var13 != 0) {
                          var4_int = var4_int | -var12 + this.a(26, -62);
                          var4_int = var4_int | this.a(26, -100) - var12;
                        }
                      }
                    } else {
                      var4_int = var4_int | -var12 + this.a(26, -62);
                      if (var13 != 0) {
                        var4_int = var4_int | this.a(26, -100) - var12;
                      }
                    }
                  }} else {
                  var4_int = var4_int | this.a(26, -100) - var12;
                }
                decompiledFrameRemainder1 = (var13 != 0);
              }
            }
            if (decompiledFrameRemainder1) {
              if (var8 != 0 &&
                var9 != 0 &&
                var10 != 0 &&
                var11 != 0) {
                var4_int = var4_int | this.a(9, -42);
              }
              if (var8 != 0 &&
                var9 != 0 &&
                var10 != 0 &&
                var11 == 0) {
                var4_int = var4_int | this.a(10, 82);
              }
              if (var8 != 0 &&
                var9 != 0 &&
                var10 == 0 &&
                var11 != 0) {
                var4_int = var4_int | this.a(11, -76);
              }
              if (var8 != 0 &&
                var9 != 0 &&
                var10 == 0 &&
                var11 == 0) {
                var4_int = var4_int | this.a(18, 123);
              }
              if (var8 != 0 &&
                var9 == 0 &&
                var10 != 0 &&
                var11 != 0) {
                var4_int = var4_int | this.a(12, 117);
              }
              if (var8 != 0 &&
                var9 == 0 &&
                var10 != 0 &&
                var11 == 0) {
                var4_int = var4_int | this.a(14, 71);
              }
              if (var8 != 0 &&
                var9 == 0 &&
                var10 == 0 &&
                var11 != 0) {
                var4_int = var4_int | this.a(15, -16);
              }
              if (var8 != 0 &&
                var9 == 0 &&
                var10 == 0 &&
                var11 == 0) {
                var4_int = var4_int | this.a(21, -9);
              }
              if (var8 == 0 &&
                var9 != 0 &&
                var10 != 0 &&
                var11 != 0) {
                var4_int = var4_int | this.a(19, -54);
              }
              if (var8 == 0 &&
                var9 != 0 &&
                var10 != 0 &&
                var11 == 0) {
                var4_int = var4_int | this.a(16, 107);
              }
              if (var8 == 0 &&
                var9 != 0 &&
                var10 == 0 &&
                var11 != 0) {
                var4_int = var4_int | this.a(17, -21);
              }
              if (var8 == 0 &&
                var9 != 0 &&
                var10 == 0 &&
                var11 == 0) {
                var4_int = var4_int | this.a(20, 115);
              }
              if (var8 == 0 &&
                var9 == 0 &&
                var10 != 0 &&
                var11 != 0) {
                var4_int = var4_int | this.a(19, -78);
              }
              if (var8 == 0 &&
                var9 == 0 &&
                var10 != 0 &&
                var11 == 0) {
                var4_int = var4_int | this.a(22, 117);
              }
              if (var8 == 0 &&
                var9 == 0 &&
                var10 == 0 &&
                var11 != 0) {
                var4_int = var4_int | this.a(23, 88);
              }
              if (var8 == 0 &&
                var9 == 0 &&
                var10 == 0 &&
                var11 == 0) {
                var4_int = var4_int | this.a(24, -68);
              }
            }
            if ((var4_int & 65408) == 0) {
              var4_int = var4_int | this.a(24, -69);
            }
            stackIn_601_0 = var4_int;
            return stackIn_601_0;
          }
          boolean decompiledFrameRemainder3 = true;
          var6Lifetime1 = this.b(param0, param1 + 3, -1777127001) ? 1 : 0;
          var7Lifetime1 = this.b(param0, param1 - 1, -1777127001) ? 1 : 0;
          if ((this.b(-1 + param0, param1, -1777127001) &&
            (this.b(-1 + param0, param1 + 1, -1777127001) ||
            this.b(param0 - 1, param1 + 2, -1777127001)) ||
            !this.d(-1 + param0, 1, param1)) && this.a(param0 - 1, (byte) -121, param1)) {
            stackIn_24_0 = 1;
            decompiledFrameRemainder3 = false;
          }
          else {
            stackIn_24_0 = 0;
          }
          boolean decompiledFrameRemainder2 = true;
          var8Lifetime1 = stackIn_24_0;
          if (this.b(1 + param0, param1, -1777127001) &&
            this.a(1 + param0, (byte) -89, param1) && (this.b(param0 + 1, param1 + 1, -1777127001) ||
            this.b(1 + param0, 2 + param1, -1777127001))) {
            stackIn_37_0 = 1;
            decompiledFrameRemainder2 = false;
          }
          else {
            stackIn_37_0 = 0;
          }
          var9Lifetime1 = stackIn_37_0;
          if (!this.b(param0 + 1, param1, -1777127001) &&
            !this.d(param0 + 1, 1, param1)) {
            stackIn_44_0 = 1;
          } else {
            stackIn_44_0 = 0;
          }
          var10Lifetime1 = stackIn_44_0;
          if (this.d(param0, 1, param1) &&
            var10Lifetime1 == 0) {
            if (var6Lifetime1 != 0 &&
              var7Lifetime1 != 0 &&
              var8Lifetime1 != 0 &&
              var9Lifetime1 != 0) {
              var4_int = var4_int | 589824;
            }
            if (var6Lifetime1 != 0 &&
              var7Lifetime1 != 0 &&
              var8Lifetime1 != 0 &&
              var9Lifetime1 == 0) {
              var4_int = var4_int | 655360;
            }
            if (var6Lifetime1 != 0 &&
              var7Lifetime1 != 0 &&
              var8Lifetime1 == 0 &&
              var9Lifetime1 != 0) {
              var4_int = var4_int | 720896;
            }
            if (var6Lifetime1 != 0 &&
              var7Lifetime1 != 0 &&
              var8Lifetime1 == 0 &&
              var9Lifetime1 == 0) {
              var4_int = var4_int | 1179648;
            }
            if (var6Lifetime1 != 0 &&
              var7Lifetime1 == 0 &&
              var8Lifetime1 != 0 &&
              var9Lifetime1 != 0) {
              var4_int = var4_int | 786432;
            }
            if (var6Lifetime1 != 0 &&
              var7Lifetime1 == 0 &&
              var8Lifetime1 != 0 &&
              var9Lifetime1 == 0) {
              var4_int = var4_int | 917504;
            }
            if (var6Lifetime1 != 0 &&
              var7Lifetime1 == 0 &&
              var8Lifetime1 == 0 &&
              var9Lifetime1 != 0) {
              var4_int = var4_int | 983040;
            }
            if (var6Lifetime1 != 0 &&
              var7Lifetime1 == 0 &&
              var8Lifetime1 == 0 &&
              var9Lifetime1 == 0) {
              var4_int = var4_int | 1376256;
            }
            if (var6Lifetime1 == 0 &&
              var7Lifetime1 != 0 &&
              var8Lifetime1 != 0 &&
              var9Lifetime1 != 0) {
              var4_int = var4_int | 851968;
            }
            if (var6Lifetime1 == 0 &&
              var7Lifetime1 != 0 &&
              var8Lifetime1 != 0 &&
              var9Lifetime1 == 0) {
              var4_int = var4_int | 1048576;
            }
            if (var6Lifetime1 == 0 &&
              var7Lifetime1 != 0 &&
              var8Lifetime1 == 0 &&
              var9Lifetime1 != 0) {
              var4_int = var4_int | 1114112;
            }
            if (var6Lifetime1 == 0 &&
              var7Lifetime1 != 0 &&
              var8Lifetime1 == 0 &&
              var9Lifetime1 == 0) {
              var4_int = var4_int | 1310720;
            }
            if (var6Lifetime1 == 0 &&
              var7Lifetime1 == 0 &&
              var8Lifetime1 != 0 &&
              var9Lifetime1 != 0) {
              var4_int = var4_int | 1245184;
            }
            if (var6Lifetime1 == 0 &&
              var7Lifetime1 == 0 &&
              var8Lifetime1 != 0 &&
              var9Lifetime1 == 0) {
              var4_int = var4_int | 1441792;
            }
            if (var6Lifetime1 == 0 &&
              var7Lifetime1 == 0 &&
              var8Lifetime1 == 0 &&
              var9Lifetime1 != 0) {
              var4_int = var4_int | 1507328;
            }
            if (var6Lifetime1 == 0 &&
              var7Lifetime1 == 0 &&
              var8Lifetime1 == 0 &&
              var9Lifetime1 == 0) {
              var4_int = var4_int | 1572864;
            }
          }
          stackIn_239_0 = var4_int;
          return stackIn_239_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int[][] param0, byte param1) {
        int[] dupTemp$0 = null;
        int dupTemp$1 = 0;
        int[] arrayValue$2 = null;
        int[] dupTemp$3 = null;
        int dupTemp$4 = 0;
        int[] arrayValue$5 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int[] stackIn_17_0;
        int stackIn_17_1;
        int[] stackIn_17_2;
        int stackIn_17_3;
        int stackIn_18_4 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = ZombieDawn.field_J;
        try {
          if (param1 != -39) {
            return;
          }
          var3_int = 0;
          while (true) {
            stackIn_5_0 = ~param0.length;
            stackIn_5_1 = ~var3_int;
            if (stackIn_5_0 < stackIn_5_1) {
              stackIn_21_0 = 0;
              if (var6 == 0) {
                var4 = stackIn_21_0;
                while (var4 < param0[0].length) {
                  stackIn_5_0 = -1;
                  stackIn_5_1 = ~(param0[var3_int][var4] & 33554432);
                  stackIn_14_0 = (stackIn_5_0 != stackIn_5_1) ? 0 : 1;
                  var5 = stackIn_14_0;
                  stackIn_17_0 = this.field_t[var3_int];
                  stackIn_17_1 = var4;
                  stackIn_17_2 = this.field_p[var3_int];
                  stackIn_17_3 = var4;
                  if (var5 == 0) {
                    stackIn_18_4 = 0;
                  } else {
                    stackIn_18_4 = 1;
                  }
                  stackIn_17_2[stackIn_17_3] = stackIn_18_4;
                  stackIn_17_0[stackIn_17_1] = stackIn_18_4;
                  var4++;
                }
                var3_int++;
                continue;
              }
            } else {
              stackIn_21_0 = 0;
            }
            var3_int = stackIn_21_0;
            L8: while (true) {
              stackIn_23_0 = var3_int;
              stackIn_23_1 = param0.length;
              if (stackIn_23_0 < stackIn_23_1) {
                if (var6 != 0) {
                  return;
                }
                var4Lifetime1 = 1;
                while (var4Lifetime1 < param0[0].length - 1) {
                  stackIn_23_0 = -2;
                  stackIn_23_1 = ~(this.field_p[var3_int][var4Lifetime1] & 1);
                  if (stackIn_23_0 == stackIn_23_1) {
                    dupTemp$0 = this.field_p[var3_int];
                    dupTemp$1 = hi.a(this.field_p[var3_int][var4Lifetime1 + 1], 2);
                    arrayValue$2 = this.field_t[var3_int];
                    dupTemp$0[1 + var4Lifetime1] = dupTemp$1;
                    arrayValue$2[1 + var4Lifetime1] = dupTemp$1;
                    dupTemp$3 = this.field_p[var3_int];
                    dupTemp$4 = hi.a(this.field_p[var3_int][-1 + var4Lifetime1], 4);
                    arrayValue$5 = this.field_t[var3_int];
                    dupTemp$3[var4Lifetime1 - 1] = dupTemp$4;
                    arrayValue$5[var4Lifetime1 - 1] = dupTemp$4;
                  }
                  var4Lifetime1++;
                }
                var3_int++;
                continue L8;
              }
              break;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("on.V(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    private final fb a(int param0, int param1, int param2, int param3, int param4) {
        kd stackIn_2_0 = null;
        oo stackIn_22_0 = null;
        gb stackIn_28_0 = null;
        boolean stackIn_33_0 = false;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        boolean stackIn_37_3;
        Object stackIn_40_0 = null;
        Object stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        gb var8 = null;
        ah var8_ref = null;
        try {
          var6_int = param2 & -25165825;
          var7 = null;
          if (param3 == 0) {
            stackIn_2_0 = new kd(param0, param1, 3 & param2, param2 >> 2 & 3);
            return (fb) ((Object) stackIn_2_0);
          }
          if (param3 != 1) {
            if (2 == param3) {
              stackIn_33_0 = !((param2 & 1073741824) <= 0);
              stackIn_36_1 = param1;
              stackIn_36_2 = param0;
              stackIn_37_3 = !((536870912 & param2) <= 0);
              var7 = co.a(stackIn_33_0, stackIn_36_1, stackIn_36_2, stackIn_37_3, var6_int & -1610612737, -19653);
              ((id) (var7)).field_E = param2 >> 23 & 3;
            } else {
              if (param3 == 3) {
                var6_int = var6_int & -134217729;
                var8 = new gb(param0, param1, var6_int);
                if (0 != (134217728 & param2)) {
                  var8.field_C = true;
                }
                stackIn_28_0 = var8;
                return (fb) ((Object) stackIn_28_0);
              }
              if (param3 == 4) {
                stackIn_22_0 = new oo(param0, param1, param2);
                return (fb) ((Object) stackIn_22_0);
              }
            }
          } else {
            var6_int = -67108865 & var6_int & -134217729;
            var8_ref = eo.a(60, param0, var6_int, param1);
            if ((param2 & 67108864) != 0) {
              var8_ref.field_ib = true;
            }
            var7 = var8_ref;
            if ((134217728 & param2) != 0) {
              var8_ref.field_C = true;
            }
          }
          if (var7 != null) {
            ((fb) (var7)).field_z = (param2 & 25165824) >> 23;
            stackIn_40_0 = var7;
            return (fb) (stackIn_40_0);
          }
          if (param4 != 1) {
            this.a(116, (int[][]) null);
          }
          stackIn_45_0 = null;
          return (fb) (stackIn_45_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var6), "on.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -43) {
            return true;
          }
          var4_int = (33488896 & this.a(param0, param2, 1)) >> 16;
          stackIn_10_0 = !(var4_int <= 64) || (var4_int == 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            this.field_s = -75;
          }
          stackIn_10_0 = (!this.a((byte) -113, param0, 1 + param2)) && (!this.a((byte) -115, param0, 2 + param2));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int[][] param1) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_34_0 = 0;
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
        var9 = ZombieDawn.field_J;
        try {
          var3_int = 0;
          while (true) {
            stackIn_3_0 = ~param1.length;
            stackIn_3_1 = ~var3_int;
            if (stackIn_3_0 < stackIn_3_1) {
              stackIn_34_0 = 0;
              if (var9 == 0) {
                var4 = stackIn_34_0;
                while (param1[0].length > var4) {
                  var5 = this.c(var4, var3_int, -35);
                  var6 = var5 >> 7 & 511;
                  var7 = 511 & var5 >> 16;
                  stackIn_3_0 = ~(-2147483648 & var5);
                  stackIn_3_1 = -1;
                  if (stackIn_3_0 != stackIn_3_1 && (var6 >= 9 &&
                    var6 <= 32 ||
                    var7 >= 9 &&
                    var7 <= 32 ||
                    (this.c(var4, 1 + var3_int, -65) & 65408) >> 7 == 16)) {
                    var5 = var5 | 67108864;
                  }
                  var8 = this.a(false, var3_int, var4);
                  var5 = var5 & -128;
                  if ((65408 & var8) != 0) {
                    var5 = var5 & -65409;
                  }
                  var5 = var5 | var8;
                  this.field_h[var3_int][var4] = var5;
                  var4++;
                }
                var3_int++;
                continue;
              }
            } else {
              stackIn_34_0 = param0;
            }
            if (stackIn_34_0 < 92) {
              on.a((byte) 51, (ib) null);
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("on.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    private final int c(byte param0, int param1, int param2) {
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (param0 != 41) {
            this.a(-47, false);
          }
          var4_int = 511 & this.a(param2, param1, 1) >> 7;
          if (8 == this.field_a ||
            this.field_a == 7 ||
            this.field_a == 5) {
            if (param2 < 0) {
              stackIn_16_0 = -1;
              return stackIn_16_0;
            }
            if (param1 < 0) {
              stackIn_21_0 = -1;
              return stackIn_21_0;
            }
            if (this.field_f.length <= param1) {
              stackIn_24_0 = -1;
              return stackIn_24_0;
            }
            if (this.field_f[0].length <= param2) {
              stackIn_29_0 = -1;
              return stackIn_29_0;
            }
            var5 = 511 & this.field_h[param1][param2] >> 7;
            if (0 < var5) {
              var4_int = var5;
            }
            if (73 <= var4_int &&
              var4_int <= 100) {
              stackIn_41_0 = 1;
              return stackIn_41_0;
            }
            if (this.field_a == 8 ||
              this.field_a == 7) {
              if (var4_int >= 145 &&
                var4_int <= 173) {
                stackIn_55_0 = 2;
                return stackIn_55_0;
              }
              if (217 <= var4_int &&
                var4_int <= 246) {
                stackIn_63_0 = 3;
                return stackIn_63_0;
              }
            }
          }
          if (var4_int > 64) {
            stackIn_68_0 = -1;
            return stackIn_68_0;
          }
          stackIn_66_0 = 0;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1777127001) {
            discarded$1 = this.c((byte) 82, 60, -52);
          }
          stackIn_10_0 = ((33554432 & this.a(param0, param1, 1)) == 0) || !((this.a(param0, param1, 1) >> 7 & 511) <= 64);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (cj.a((byte) 15, param1)) {
            return false;
          }
          if (tb.a(-10723, param1)) {
            return false;
          }
          if (tk.a((byte) 84, param1)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (param0 > -7) {
            return true;
          }
          if (lf.a(param2, param1, -7235)) {
            return false;
          }
          if (ic.a(param1, param2, 0)) {
            return false;
          }
          if (t.a(param1, (byte) 125, param2)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("on.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((33554432 & this.a(param1, param2, 1)) == 0) {
            return true;
          }
          if (param0 >= -78) {
            discarded$1 = this.c((byte) 79, -18, -85);
          }
          stackIn_10_0 = (this.c((byte) 41, param2, param1) == -1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean b(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        Throwable var3 = null;
        boolean stackIn_5_0 = false;
        Throwable decompiledCaughtException = null;
        try {
          var1_ref = ea.field_c;
          synchronized (var1_ref) {
            var2 = -66 / ((param0 - 42) / 59);
            if (~wb.field_y == ~he.field_e) {
              return false;
            }
            kg.field_i = vd.field_b[he.field_e];
            lc.field_c = gg.field_a[he.field_e];
            he.field_e = he.field_e + 1 & 127;
            stackIn_5_0 = true;
          }
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref2), "on.A(" + param0 + ')');
        }
    }

    private final boolean d(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            on.a((byte) 71, (String) null, (String) null);
          }
          stackIn_10_0 = (!this.b(param0, param2 + 1, -1777127001)) && (!this.b(param0, param2 + 2, -1777127001));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(boolean param0, int param1, int param2) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_423_0 = 0;
        int stackIn_427_0 = 0;
        int stackIn_431_0 = 0;
        int stackIn_435_0 = 0;
        int stackIn_540_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var6Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        var14 = ZombieDawn.field_J;
        try {
          if (param0) {
            stackIn_3_0 = 34;
            return stackIn_3_0;
          }
          boolean decompiledFrameRemainder2 = true;
          var4_int = this.a(param2, param1, 1) & 127;
          var5 = this.a(param2, param1, 1) & 65408;
          if (this.field_a == 6) {
            stackIn_11_0 = ((127 & this.a(param2 - 1, param1 - 1, 1)) != 1) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_15_0 = ((this.a(param2 + 1, param1 - 1, 1) & 127) != 1) ? 0 : 1;
            var7_int = stackIn_15_0;
            stackIn_19_0 = ((127 & this.a(1 + param2, 1 + param1, 1)) != 1) ? 0 : 1;
            var8_int = stackIn_19_0;
            stackIn_23_0 = ((127 & this.a(-1 + param2, 1 + param1, 1)) != 1) ? 0 : 1;
            var9 = stackIn_23_0;
            stackIn_27_0 = ((127 & this.a(param2, -1 + param1, 1)) != 1) ? 0 : 1;
            var10 = stackIn_27_0;
            stackIn_31_0 = ((this.a(param2 + 1, param1, 1) & 127) != 1) ? 0 : 1;
            var11 = stackIn_31_0;
            stackIn_35_0 = (1 != (127 & this.a(param2, param1 + 1, 1))) ? 0 : 1;
            var12 = stackIn_35_0;
            stackIn_39_0 = ((127 & this.a(-1 + param2, param1, 1)) != 1) ? 0 : 1;
            boolean decompiledFrameRemainder1 = true;
            var13 = stackIn_39_0;
            if (var4_int == 0) {
              if (var10 == 0 ||
                var12 != 0 ||
                var13 != 0 ||
                var11 != 0) {
                if (var10 == 0 &&
                  var12 != 0 &&
                  var13 == 0 &&
                  var11 == 0) {
                  var4_int = 41;
                  decompiledFrameRemainder1 = (var14 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (var10 == 0 &&
                    var12 == 0 &&
                    var13 != 0 &&
                    var11 == 0) {
                    var4_int = 32;
                    decompiledFrameRemainder1 = (var14 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (var10 == 0 &&
                      var12 == 0 &&
                      var13 == 0 &&
                      var11 != 0) {
                      var4_int = 34;
                      decompiledFrameRemainder1 = (var14 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      if (var10 != 0 ||
                        var12 == 0 ||
                        var13 != 0 ||
                        var11 == 0) {
                        if (var10 != 0 &&
                          var12 == 0 &&
                          var13 == 0 &&
                          var11 != 0) {
                          var4_int = 26;
                          decompiledFrameRemainder1 = (var14 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          if (var10 != 0 ||
                            var12 == 0 ||
                            var13 == 0 ||
                            var11 != 0) {
                            if (var10 == 0 ||
                              var12 != 0 ||
                              var13 == 0 ||
                              var11 != 0) {
                              if (var10 != 0 &&
                                var12 != 0 &&
                                var13 == 0 &&
                                var11 != 0) {
                                var4_int = 31;
                                decompiledFrameRemainder1 = (var14 != 0);
                              }
                              if (decompiledFrameRemainder1) {
                                if (var10 == 0 ||
                                  var12 != 0 ||
                                  var13 == 0 ||
                                  var11 == 0) {
                                  if (var10 != 0 &&
                                    var12 != 0 &&
                                    var13 != 0 &&
                                    var11 == 0) {
                                    var4_int = 39;
                                    decompiledFrameRemainder1 = (var14 != 0);
                                  }
                                  if (decompiledFrameRemainder1) {
                                    if (var10 == 0 &&
                                      var12 != 0 &&
                                      var13 != 0 &&
                                      var11 != 0) {
                                      var4_int = 38;
                                      decompiledFrameRemainder1 = (var14 != 0);
                                    }
                                    if (decompiledFrameRemainder1) {
                                      if (var10 == 0 ||
                                        var12 == 0 ||
                                        var13 != 0 ||
                                        var11 != 0) {
                                        if ((var10 != 0 ||
                                          var12 != 0 ||
                                          var13 == 0 ||
                                          var11 == 0) &&
                                          (decompiledFrameRemainder1 = (var10 == 0)) &&
                                          (decompiledFrameRemainder1 = (var12 == 0)) &&
                                          (decompiledFrameRemainder1 = (var13 == 0)) &&
                                          (decompiledFrameRemainder1 = (var11 == 0))) {
                                          if (var6 == 0) {
                                            if (var7_int != 0) {
                                              var4_int = 43;
                                              decompiledFrameRemainder1 = (var14 != 0);
                                            }
                                            if (decompiledFrameRemainder1) {
                                              if ((var8_int == 0) &&
                                                (decompiledFrameRemainder1 = (var9 != 0))) {
                                                var4_int = 29;
                                                decompiledFrameRemainder1 = (var14 != 0);
                                              }
                                              if (decompiledFrameRemainder1) {
                                                var4_int = 27;
                                                decompiledFrameRemainder1 = (var14 != 0);
                                              }
                                            }
                                          }
                                          if (decompiledFrameRemainder1) {
                                            var4_int = 45;
                                            decompiledFrameRemainder1 = (var14 != 0);
                                          }
                                        }
                                        if (decompiledFrameRemainder1) {
                                          var4_int = 46;
                                          decompiledFrameRemainder1 = (var14 != 0);
                                        }
                                      }
                                      if (decompiledFrameRemainder1) {
                                        var4_int = 47;
                                        decompiledFrameRemainder1 = (var14 != 0);
                                      }
                                    }
                                  }
                                }
                                if (decompiledFrameRemainder1) {
                                  var4_int = 30;
                                  decompiledFrameRemainder1 = (var14 != 0);
                                }
                              }
                            }
                            if (decompiledFrameRemainder1) {
                              var4_int = 24;
                              decompiledFrameRemainder1 = (var14 != 0);
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            var4_int = 40;
                            decompiledFrameRemainder1 = (var14 != 0);
                          }
                        }
                      }
                      if (decompiledFrameRemainder1) {
                        var4_int = 42;
                        decompiledFrameRemainder1 = (var14 != 0);
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                var4_int = 25;
                decompiledFrameRemainder1 = (var14 != 0);
              }
            }
            if ((decompiledFrameRemainder1) && ((var4_int >= 48 ||
              8 == var4_int) && var5 == 0)) {
              boolean decompiledFrameRemainder0 = true;
              var5 = 334;
              if (var10 == 0 ||
                var12 != 0 ||
                var13 != 0 ||
                var11 != 0) {
                if (var10 != 0 ||
                  var12 == 0 ||
                  var13 != 0 ||
                  var11 != 0) {
                  if (var10 != 0 ||
                    var12 != 0 ||
                    var13 == 0 ||
                    var11 != 0) {
                    if (var10 != 0 ||
                      var12 != 0 ||
                      var13 != 0 ||
                      var11 == 0) {
                      if (var10 == 0 &&
                        var12 != 0 &&
                        var13 == 0 &&
                        var11 != 0) {
                        var5 += 42;
                        decompiledFrameRemainder0 = (var14 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (var10 != 0 &&
                          var12 == 0 &&
                          var13 == 0 &&
                          var11 != 0) {
                          var5 += 26;
                          decompiledFrameRemainder0 = (var14 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (var10 == 0 &&
                            var12 != 0 &&
                            var13 != 0 &&
                            var11 == 0) {
                            var5 += 40;
                            decompiledFrameRemainder0 = (var14 != 0);
                          }
                          if (decompiledFrameRemainder0) {
                            if (var10 != 0 &&
                              var12 == 0 &&
                              var13 != 0 &&
                              var11 == 0) {
                              var5 += 24;
                              decompiledFrameRemainder0 = (var14 != 0);
                            }
                            if ((decompiledFrameRemainder0) &&
                              (decompiledFrameRemainder0 = (var10 == 0)) &&
                              (decompiledFrameRemainder0 = (var12 == 0)) &&
                              (decompiledFrameRemainder0 = (var13 == 0)) &&
                              (decompiledFrameRemainder0 = (var11 == 0))) {
                              if (var6 != 0) {
                                var5 = 437;
                                decompiledFrameRemainder0 = (var14 != 0);
                              }
                              if (decompiledFrameRemainder0) {
                                if (var7_int != 0) {
                                  var5 = 436;
                                  decompiledFrameRemainder0 = (var14 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  if (var8_int != 0) {
                                    var4_int = 428;
                                    decompiledFrameRemainder0 = (var14 != 0);
                                  }
                                  if ((decompiledFrameRemainder0) &&
                                    (decompiledFrameRemainder0 = (var9 != 0))) {
                                    var4_int = 429;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if ((decompiledFrameRemainder0) && (var10 == 0 &&
                      var12 == 0 &&
                      var13 == 0 &&
                      var11 != 0 || var14 != 0)) {
                      var5 += 34;
                      if (var14 != 0) {
                        var5 += 32;
                        var5 += 41;
                        var5 += 25;
                      }
                    }
                  } else {
                    var5 += 32;
                    if (var14 != 0) {
                      var5 += 41;
                      var5 += 25;
                    }
                  }
                } else {
                  var5 += 41;
                  if (var14 != 0) {
                    var5 += 25;
                  }
                }
              } else {
                var5 += 25;
              }
              if (var5 != 334) {
                var4_int = var5 << 7 | -65409 & var4_int;
              }
            }
            decompiledFrameRemainder2 = (var14 != 0);
          }
          if ((decompiledFrameRemainder2) && (8 == this.field_a &&
            var4_int == 55)) {
            var6Lifetime1 = 55;
            var7 = new int[]{52, 43, 57, 59};
            var8 = new int[]{51, 35, 58, 56};
            stackIn_423_0 = (var6Lifetime1 == (127 & this.a(param2, param1 - 1, 1))) ? 0 : 1;
            var9Lifetime1 = stackIn_423_0;
            stackIn_427_0 = (~(this.a(1 + param2, param1, 1) & 127) == ~var6Lifetime1) ? 0 : 1;
            var10Lifetime1 = stackIn_427_0;
            stackIn_431_0 = (~var6Lifetime1 == ~(this.a(param2, param1 + 1, 1) & 127)) ? 0 : 1;
            var11Lifetime1 = stackIn_431_0;
            stackIn_435_0 = (var6Lifetime1 == (127 & this.a(param2 - 1, param1, 1))) ? 0 : 1;
            var12Lifetime1 = stackIn_435_0;
            discarded$0 = this.a(param2 - 1, -1 + param1, 1);
            discarded$1 = this.a(param2 + 1, param1 - 1, 1);
            discarded$2 = this.a(1 + param2, param1 + 1, 1);
            discarded$3 = this.a(-1 + param2, 1 + param1, 1);
            if (var9Lifetime1 != 0 &&
              var11Lifetime1 == 0 &&
              var12Lifetime1 == 0 &&
              var10Lifetime1 == 0) {
              var4_int = var7[0];
            }
            if (var9Lifetime1 == 0 ||
              var11Lifetime1 != 0 ||
              var12Lifetime1 != 0 ||
              var10Lifetime1 != 0 || var14 != 0) {
              if (var9Lifetime1 != 0 ||
                var11Lifetime1 == 0 ||
                var12Lifetime1 != 0 ||
                var10Lifetime1 != 0) {
                if (var9Lifetime1 != 0 ||
                  var11Lifetime1 != 0 ||
                  var12Lifetime1 == 0 ||
                  var10Lifetime1 != 0) {
                  if (var9Lifetime1 != 0 ||
                    var11Lifetime1 != 0 ||
                    var12Lifetime1 != 0 ||
                    var10Lifetime1 == 0) {
                    if (var9Lifetime1 != 0 &&
                      var11Lifetime1 == 0 &&
                      var12Lifetime1 != 0 &&
                      var10Lifetime1 == 0) {
                      var4_int = var8[0];
                    }
                    if (var9Lifetime1 == 0 ||
                      var11Lifetime1 != 0 ||
                      var12Lifetime1 == 0 ||
                      var10Lifetime1 != 0 || var14 != 0) {
                      if (var9Lifetime1 != 0 ||
                        var11Lifetime1 == 0 ||
                        var12Lifetime1 == 0 ||
                        var10Lifetime1 != 0) {
                        if (var9Lifetime1 == 0 &&
                          var11Lifetime1 != 0 &&
                          var12Lifetime1 == 0 &&
                          var10Lifetime1 != 0) {
                          var4_int = var8[2];
                          decompiledFrameRemainder2 = (var14 != 0);
                        }
                        if ((decompiledFrameRemainder2) &&
                          (decompiledFrameRemainder2 = (var9Lifetime1 != 0)) &&
                          (decompiledFrameRemainder2 = (var11Lifetime1 == 0)) &&
                          (decompiledFrameRemainder2 = (var12Lifetime1 == 0)) &&
                          (decompiledFrameRemainder2 = (var10Lifetime1 != 0))) {
                          var4_int = var8[1];
                        }
                      }
                      if ((decompiledFrameRemainder2) && (var9Lifetime1 == 0 &&
                        var11Lifetime1 != 0 &&
                        var12Lifetime1 != 0 &&
                        var10Lifetime1 == 0 || var14 != 0)) {
                        var4_int = var8[3];
                        if (var14 != 0) {
                          var4_int = var7[1];
                          var4_int = var7[3];
                          var4_int = var7[2];
                        }
                      }
                    }} else {
                    var4_int = var7[1];
                    if (var14 != 0) {
                      var4_int = var7[3];
                      var4_int = var7[2];
                    }
                  }
                } else {
                  var4_int = var7[3];
                  if (var14 != 0) {
                    var4_int = var7[2];
                  }
                }
              } else {
                var4_int = var7[2];
              }
            }}
          stackIn_540_0 = var4_int;
          return stackIn_540_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, ib param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          cf.field_eb.insertElementAt(param1, 0);
          var2_int = -29 / ((param0 + 47) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("on.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final vo b(byte param0) {
        vo var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        vo stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          if (param0 != 106) {
            field_i = (java.awt.Image) null;
          }
          var2 = new vo();
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 >= this.field_l.length))) {
            var4 = this.field_l[var3];
            var5 = this.field_l[var3 + 1];
            var6 = this.field_l[2 + var3];
            var7 = this.field_l[3 + var3];
            stackIn_11_0 = var2;
            if (var8 == 0) {
              ((vo) (Object) stackIn_11_0).a(0, this.a(var6, var7, var5, var4, 1));
              var3 += 4;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = var2;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "on.G(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = -34 % ((30 - param1) / 39);
          stackIn_1_0 = param0 << 7;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "on.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
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
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var11Lifetime3;
        int var12Lifetime3;
        var13 = ZombieDawn.field_J;
        try {
          var5_int = param0 + param2;
          var6 = param4 + param1;
          if (bi.field_g >= param2) {
            stackIn_5_0 = bi.field_g;
          } else {
            stackIn_5_0 = param2;
          }
          var7 = stackIn_5_0;
          if (bi.field_l >= param4) {
            stackIn_9_0 = bi.field_l;
          } else {
            stackIn_9_0 = param4;
          }
          var8 = stackIn_9_0;
          if (var5_int < bi.field_b) {
            stackIn_13_0 = var5_int;
          } else {
            stackIn_13_0 = bi.field_b;
          }
          var9 = stackIn_13_0;
          if (var6 < bi.field_d) {
            stackIn_17_0 = var6;
          } else {
            stackIn_17_0 = bi.field_d;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          var10 = stackIn_17_0;
          if (param2 >= bi.field_g &&
            param2 < bi.field_b) {
            var11 = var8 * bi.field_f + param2;
            var12 = var10 + 1 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              bi.field_c[var11] = 16777215;
              var11 = var11 + bi.field_f * 2;
              if (var13 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) && (bi.field_l <= param4 &&
            bi.field_d > var6)) {
            var11Lifetime3 = var7 + param4 * bi.field_f;
            var12Lifetime3 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                break;
              }
              bi.field_c[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
              if (var13 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted0) &&
            (param3 <= 21)) {
            on.a((byte) 52, (ib) null);
          }
          if (var5_int >= bi.field_g &&
            bi.field_b > var5_int) {
            var11Lifetime1 = bi.field_f * ((1 & -param2 + var5_int) + var8) + var5_int;
            var12Lifetime1 = var10 + (1 - var8) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              bi.field_c[var11Lifetime1] = 16777215;
              var11Lifetime1 = var11Lifetime1 + 2 * bi.field_f;
              if (var13 != 0) {
                return;
              }
            }
          }
          if (bi.field_l <= param4 &&
            bi.field_d > var6) {
            var11Lifetime2 = (1 & -param4 + var6) + var7 + bi.field_f * var6;
            var12Lifetime2 = 1 - (-var9 + var7) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              bi.field_c[var11Lifetime2] = 16777215;
              var11Lifetime2 += 2;
              if (var13 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "on.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 0 &&
            param0 < this.field_f[0].length &&
            param1 >= 0 &&
            param1 < this.field_f.length) {
            if (param2 == 1) {
              stackIn_18_0 = this.field_f[param1][param0];
              return stackIn_18_0;
            }
            stackIn_16_0 = 32;
            return stackIn_16_0;
          }
          stackIn_13_0 = 0;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4) {
        boolean discarded$0 = false;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_3 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_29_3;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_37_2 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_44_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          stackIn_3_0 = this.field_p[param2];
          stackIn_3_1 = param4;
          if (param0) {
            stackIn_4_2 = 1;
          } else {
            stackIn_4_2 = 0;
          }
          stackIn_3_0[stackIn_3_1] = hi.a(stackIn_4_2, eg.a(14, this.field_p[param2][param4]));
          if (param1 != 14365) {
            discarded$0 = this.a((byte) 91, 88, -54);
          }
          if (!param3) {
            stackIn_13_0 = this.field_t[param2];
            stackIn_13_1 = param4;
            if (!param0) {
              stackIn_14_2 = 0;
            } else {
              stackIn_14_2 = 1;
            }
            stackIn_13_0[stackIn_13_1] = hi.a(stackIn_14_2, eg.a(14, this.field_t[param2][param4]));
          }
          if (this.field_p[param2].length > (1 + param4)) {
            stackIn_21_0 = this.field_p[param2];
            stackIn_21_1 = 1 + param4;
            stackIn_21_2 = eg.a(-3, this.field_p[param2][param4 + 1]);
            if (!param0) {
              stackIn_22_3 = 0;
            } else {
              stackIn_22_3 = 2;
            }
            stackIn_21_0[stackIn_21_1] = hi.a(stackIn_21_2, stackIn_22_3);
            if (!param3) {
              stackIn_28_0 = this.field_t[param2];
              stackIn_28_1 = param4 + 1;
              stackIn_28_2 = eg.a(this.field_t[param2][1 + param4], -3);
              if (!param0) {
                stackIn_29_3 = 0;
              } else {
                stackIn_29_3 = 2;
              }
              stackIn_28_0[stackIn_28_1] = hi.a(stackIn_28_2, stackIn_29_3);
            }
          }
          if (param4 - 1 > 0) {
            stackIn_36_0 = this.field_p[param2];
            stackIn_36_1 = -1 + param4;
            if (param0) {
              stackIn_37_2 = 4;
            } else {
              stackIn_37_2 = 0;
            }
            stackIn_36_0[stackIn_36_1] = hi.a(stackIn_37_2, eg.a(-5, this.field_p[param2][-1 + param4]));
            if (!param3) {
              stackIn_43_0 = this.field_t[param2];
              stackIn_43_1 = param4 - 1;
              if (param0) {
                stackIn_44_2 = 4;
              } else {
                stackIn_44_2 = 0;
              }
              stackIn_43_0[stackIn_43_1] = hi.a(stackIn_44_2, eg.a(-5, this.field_t[param2][-1 + param4]));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var6), "on.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    on(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8, boolean param9) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        this.field_d = false;
        try {
          this.field_l = param1;
          this.field_a = param2;
          this.field_b = param5;
          this.field_c = param7;
          this.field_s = param3;
          this.field_o = param8;
          this.field_f = param0;
          this.field_m = param6;
          this.field_j = param4;
          this.field_h = new int[param0.length][param0[0].length];
          this.field_p = new int[param0.length][param0[0].length];
          this.field_t = new int[param0.length][param0[0].length];
          this.field_d = param9;
          this.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("on.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    private final int b(byte param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_325_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ZombieDawn.field_J;
        try {
          var4_int = this.a(param1, param2, 1);
          var4_int = var4_int & -67108865;
          var5 = var4_int >> 7 & 511;
          if (0 != (33554432 & var4_int) &&
            var5 == 0) {
            var4_int = var4_int & -65409;
            if (this.field_a == 6) {
              var4_int = var4_int | this.a(511, -66);
              stackIn_11_0 = var4_int;
              return stackIn_11_0;
            }
            if (!this.a((byte) -92, 1 + param1, param2) &&
              !this.a(1 + param1, true, param2)) {
              stackIn_19_0 = 1;
            } else {
              stackIn_19_0 = 0;
            }
            var6 = stackIn_19_0;
            var7 = this.a((byte) -116, param1, param2 + 3) ? 1 : 0;
            var8 = this.a((byte) -109, param1, param2 - 1) ? 1 : 0;
            if (!this.a((byte) -113, param1 - 1, param2) &&
              this.a(param1 - 1, true, param2)) {
              stackIn_26_0 = 0;
            } else {
              stackIn_26_0 = 1;
            }
            var9 = stackIn_26_0;
            if (param0 != -61) {
              stackIn_28_0 = 82;
              return stackIn_28_0;
            }
            var10 = this.a((byte) -128, param1 + 1, param2) ? 1 : 0;
            var11 = 0;
            if (var9 == 0) {
              var11 = this.c((byte) 41, param2, -1 + param1) * 72;
            }
            if ((var9 != 0 ||
              var13 != 0) &&
              var8 == 0) {
              var11 = 72 * this.c((byte) 41, param2 - 1, param1);
            }
            boolean decompiledFrameRemainder0 = true;
            if (!this.a(param1, true, param2) ||
              var6 != 0) {
              if (this.a(param1, true, param2) &&
                var6 != 0) {
                stackIn_51_0 = var10;
                if (!this.a((byte) -94, 1 + param1, 2 + param2) &&
                  !this.a((byte) -98, param1 + 1, param2 + 1)) {
                  stackIn_54_1 = 0;
                } else {
                  stackIn_54_1 = 1;
                }
                var10 = stackIn_51_0 | stackIn_54_1;
                stackIn_58_0 = var9;
                if (!this.a((byte) -85, param1 - 1, 2 + param2) &&
                  !this.a((byte) -110, -1 + param1, param2 + 1)) {
                  stackIn_61_1 = 0;
                } else {
                  stackIn_61_1 = 1;
                }
                var9 = stackIn_58_0 | stackIn_61_1;
                stackIn_65_0 = (this.a((byte) -111, 1 + param1, param2 + 1)) ? 128 : 0;
                var12 = stackIn_65_0;
                if (var7 == 0 &&
                  var8 == 0 &&
                  var9 != 0 &&
                  var10 != 0) {
                  var4_int = var4_int | this.a(var11 + 26, 102) - var12;
                }
                if (var7 == 0 &&
                  var8 == 0 &&
                  var9 == 0 &&
                  var10 != 0) {
                  var4_int = var4_int | -var12 + this.a(28 + var11, 89);
                }
                decompiledFrameRemainder0 = (var13 != 0);
              }
              if (decompiledFrameRemainder0) {
                if ((!this.a((byte) -95, param1, 1 + param2)) &&
                  (decompiledFrameRemainder0 = !(!this.a((byte) -93, param1, param2 + 2)))) {
                  if (this.a((byte) -122, param1 + 1, param2) &&
                    this.a((byte) -119, param1 - 1, param2)) {
                    var4_int = var4_int | this.a(6 + var11, -99);
                    decompiledFrameRemainder0 = (var13 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (this.a((byte) -102, param1 + 1, param2)) {
                      var4_int = var4_int | this.a(var11 + 8, 91);
                      decompiledFrameRemainder0 = (var13 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (this.a((byte) -127, -1 + param1, param2)) {
                        var4_int = var4_int | this.a(4 + var11, -93);
                        decompiledFrameRemainder0 = (var13 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        var4_int = var4_int | this.a(var11 + 2, param0 - 8);
                        decompiledFrameRemainder0 = (var13 != 0);
                      }
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (this.a((byte) -128, param1 + 1, param2) &&
                    this.a((byte) -94, param1 - 1, param2)) {
                    var4_int = var4_int | this.a(var11 + 5, 74);
                    decompiledFrameRemainder0 = (var13 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (!this.a((byte) -79, 1 + param1, param2)) {
                      if (this.a((byte) -96, param1 - 1, param2)) {
                        var4_int = var4_int | this.a(var11 + 3, param0 + 165);
                        decompiledFrameRemainder0 = (var13 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        var4_int = var4_int | this.a(1 + var11, param0 ^ -113);
                        decompiledFrameRemainder0 = (var13 != 0);
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var4_int = var4_int | this.a(var11 + 7, -75);
                      decompiledFrameRemainder0 = (var13 != 0);
                    }
                  }
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (var7 != 0 &&
                var8 != 0 &&
                var9 != 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(var11 + 9, 84);
              }
              if (var7 != 0 &&
                var8 != 0 &&
                var9 != 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(10 + var11, -11);
              }
              if (var7 != 0 &&
                var8 != 0 &&
                var9 == 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(11 + var11, 98);
              }
              if (var7 != 0 &&
                var8 != 0 &&
                var9 == 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(var11 + 18, param0 + 176);
              }
              if (var7 != 0 &&
                var8 == 0 &&
                var9 != 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(12 + var11, -30);
              }
              if (var7 != 0 &&
                var8 == 0 &&
                var9 != 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(14 + var11, -32);
              }
              if (var7 != 0 &&
                var8 == 0 &&
                var9 == 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(15 + var11, -12);
              }
              if (var7 != 0 &&
                var8 == 0 &&
                var9 == 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(21 + var11, -15);
              }
              if (var7 == 0 &&
                var8 != 0 &&
                var9 != 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(var11 + 13, 123);
              }
              if (var7 == 0 &&
                var8 != 0 &&
                var9 != 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(16 + var11, 71);
              }
              if (var7 == 0 &&
                var8 != 0 &&
                var9 == 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(var11 + 17, param0 + 5);
              }
              if (var7 == 0 &&
                var8 != 0 &&
                var9 == 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(var11 + 20, 120);
              }
              if (var7 == 0 &&
                var8 == 0 &&
                var9 != 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(19 + var11, 113);
              }
              if (var7 == 0 &&
                var8 == 0 &&
                var9 != 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(var11 + 22, -17);
              }
              if (var7 == 0 &&
                var8 == 0 &&
                var9 == 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(23 + var11, -85);
              }
              if (var7 == 0 &&
                var8 == 0 &&
                var9 == 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(24 + var11, param0 + 148);
              }
            }
            if ((var4_int & 65408) == 0) {
              var4_int = var4_int | this.a(24 + var11, 80);
            }
            stackIn_325_0 = var4_int;
            return stackIn_325_0;
          }
          stackIn_6_0 = var4_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "on.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_n = "OK";
        field_g = new vo();
    }
}
