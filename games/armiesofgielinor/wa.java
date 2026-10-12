/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends ik {
    static String field_h;
    static String field_e;
    int field_f;
    int field_g;

    private final void a(int param0, ha param1) {
        jd var5 = null;
        try {
          var5 = param1.c(this.field_f, true, this.field_g);
          jd var3 = var5;
          if (param0 != 0) {
            ha var4 = (ha) null;
            this.b((byte) 119, (ha) null);
          }
          var5.field_P = uc.field_d[this.field_c][5];
          var5.field_o = uc.field_d[this.field_c][6];
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "wa.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, vh param1) {
        try {
          param1.b(true, this.field_c);
          param1.b(1, this.field_g);
          param1.b(1, this.field_f);
          if (param0 != -11637) {
            field_e = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "wa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(byte param0, ha param1) {
        int var4 = 0;
        jd var5 = null;
        jd var6 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0 >= -100) {
            this.field_f = 58;
          }
          var5 = param1.c(this.field_f, true, this.field_g);
          var6 = var5;
          if (uc.field_d[this.field_c][6] == 7) {
            var5.field_I = true;
          }
          if (uc.field_d[this.field_c][6] == 16) {
            if (var6.field_cb > 0) {
              var6.field_cb = var6.field_cb - 1;
            } else {
              if (34 != var6.field_N ||
                !var6.field_W) {
                var6.field_s = false;
              }
              if (74 != var6.field_N) {
                var6.field_B = 1;
              } else {
                var6.field_B = 2;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("wa.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void a(boolean param0, ha param1) {
        int var3_int = 0;
        int var4 = 0;
        ha var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (!param0) {
            var5 = (ha) null;
            this.a((ha) null, false);
          }
          var3_int = uc.field_d[this.field_c][5];
          if (var3_int != 0) {
            if (var3_int != 64) {
              this.b(true, param1);
            } else {
              this.c((byte) 78, param1);
            }
          } else {
            this.d((byte) -106, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wa.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void b(int param0, ha param1) {
        jd var5 = null;
        try {
          if (param0 <= 80) {
            ha var4 = (ha) null;
            this.a((ha) null, 28);
          }
          var5 = param1.c(this.field_f, true, this.field_g);
          jd var3 = var5;
          var5.field_r = uc.field_d[this.field_c][6] | uc.field_d[this.field_c][5] << 5;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "wa.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(byte param0, ha param1) {
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0 != 78) {
            field_h = (String) null;
          }
          var3_int = uc.field_d[this.field_c][7];
          for (var4 = this.field_g - var3_int; var4 <= var3_int + this.field_g; var4++) {
            for (var5 = -var3_int + this.field_f; this.field_f + var3_int >= var5; var5++) {
              var6 = param1.c(var5, true, var4);
              if (var6 != null) {
                for (var7 = 0; uc.field_d[this.field_c][6] > var7; var7++) {
                  param1.field_l.a(750, new st(var6, 6));
                }
                for (var7Lifetime1 = 0; uc.field_d[this.field_c][6] < var7Lifetime1; var7Lifetime1--) {
                  param1.field_l.a(750, new st(var6, 4));
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("wa.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void b(boolean param0, ha param1) {
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jd var6 = null;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var3_int = uc.field_d[this.field_c][7];
          if (!param0) {
            this.field_g = -123;
          }
          for (var4 = this.field_g - var3_int; var3_int + this.field_g >= var4; var4++) {
            for (var5 = this.field_f - var3_int; var3_int + this.field_f >= var5; var5++) {
              var6 = param1.c(var5, true, var4);
              if (var6 != null) {
                if (uc.field_d[this.field_c][6] <= 0) {
                  for (var7 = 0; var7 > uc.field_d[this.field_c][6]; var7--) {
                    param1.field_l.a(750, new st(var6, 1));
                  }
                } else {
                  param1.field_l.a(750, new nw(var6, param1.a(var6, (byte) -128, uc.field_d[this.field_c][5], uc.field_d[this.field_c][6]), false));
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("wa.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0, ok param1) {
        try {
          bd.a((byte) 111, new fj(param1));
          if (param0 < 8) {
            field_h = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "wa.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, int param1, ha param2) {
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ne var7_ref_ne = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var4_intLifetime1Lifetime1;
        int var5Lifetime1Lifetime1;
        int var6Lifetime1Lifetime1;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (uc.field_d[this.field_c][5] == 5) {
            var4_int = uc.field_d[this.field_c][7];
            for (var5 = this.field_g - var4_int; var4_int + this.field_g >= var5; var5++) {
              if (var5 >= 0) {
                if (param2.field_v <= var5) {
                  break;
                }
                for (var6 = -var4_int + this.field_f; var6 <= this.field_f + var4_int; var6++) {
                  if (var6 >= 0) {
                    if (var6 >= param2.field_db) {
                      break;
                    }
                    var7_ref_ne = param2.field_Eb[var5 + param2.field_v * var6];
                    var7_ref_ne.b(true, param2.o(param1, -1));
                  }
                }
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (uc.field_d[this.field_c][5] == 6) {
            var4_intLifetime1 = uc.field_d[this.field_c][7];
            for (var5Lifetime1 = this.field_g - var4_intLifetime1; this.field_g + var4_intLifetime1 >= var5Lifetime1; var5Lifetime1++) {
              if (0 <= var5Lifetime1) {
                if (param2.field_v <= var5Lifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                for (var6Lifetime1 = this.field_f - var4_intLifetime1; this.field_f + var4_intLifetime1 >= var6Lifetime1; var6Lifetime1++) {
                  if (var6Lifetime1 >= 0) {
                    if (param2.field_db <= var6Lifetime1) {
                      break;
                    }
                    param2.a((byte) 86, param1, var6Lifetime1, var5Lifetime1);
                  }
                }
              }
            }
            decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0) &&
            (uc.field_d[this.field_c][5] == 3)) {
            var4_intLifetime1Lifetime1 = uc.field_d[this.field_c][7];
            for (var5Lifetime1Lifetime1 = -var4_intLifetime1Lifetime1 + this.field_g; var4_intLifetime1Lifetime1 + this.field_g >= var5Lifetime1Lifetime1; var5Lifetime1Lifetime1++) {
              for (var6Lifetime1Lifetime1 = this.field_f - var4_intLifetime1Lifetime1; var4_intLifetime1Lifetime1 + this.field_f >= var6Lifetime1Lifetime1; var6Lifetime1Lifetime1++) {
                param2.b(var5Lifetime1Lifetime1, true, uc.field_d[this.field_c][6], param1, var6Lifetime1Lifetime1);
              }
            }
          }
          if (uc.field_d[this.field_c][5] == 4) {
            var4_intLifetime2 = param2.a(this.field_f, 2056, this.field_g);
            var5Lifetime2 = param2.g(this.field_f, -85, this.field_g);
            var6Lifetime2 = this.field_g;
            var7 = this.field_f;
            var8 = 0;
            var9 = 0;
            var10 = var4_intLifetime2;
            if (1 != var10) {
              if (2 == var10) {
                var8Lifetime1 = 0;
                var9Lifetime1 = 1;
              } else {
                if (var10 == 3) {
                  var9Lifetime1 = 0;
                  var8Lifetime1 = -1;
                } else {
                  if (var10 != 0) {
                    return;
                  }
                  var9Lifetime1 = 0;
                  var8Lifetime1 = 1;
                }
              }
            } else {
              var9Lifetime1 = -1;
              var8Lifetime1 = 0;
            }
            while (param2.g(var7, -85, var6Lifetime2) == var5Lifetime2) {
              param2.b(var6Lifetime2, true, 10, param1, var7);
              var7 = var7 + var9Lifetime1;
              var6Lifetime2 = var6Lifetime2 + var8Lifetime1;
            }
            param2.b(var6Lifetime2, true, 1, param1, var7);
            param2.b(this.field_g - var8Lifetime1, true, 1, param1, this.field_f - var9Lifetime1);
          }
          if (param0 != -100) {
            return;
          }
          if (uc.field_d[this.field_c][5] == 7) {
            param2.field_Eb[this.field_f * param2.field_v + this.field_g].field_a = -1;
            param2.f(-2);
            param2.b(param0 ^ -98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_63_0 = var4;
          stackIn_63_1 = new StringBuilder().append("wa.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(')').toString());
        }
    }

    final static int a(bv param0, int param1, int param2) {
        RuntimeException var3 = null;
        bv var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            var4 = (bv) null;
            wa.a((bv) null, 11, -12);
          }
          stackIn_3_0 = (param0.g(param2 - 102, param1) ^ 1 << param1 - 1) - (1 << param1 - 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wa.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, ha param1, int param2) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (uc.field_d[this.field_c][3] == 0) {
            var4 = param1.c(this.field_f, true, this.field_g);
            if (var4 != null) {
              var4.field_D = true;
            }
          }
          var4_int = uc.field_d[this.field_c][4];
          if (param2 != 26123) {
            return;
          }
          var5 = var4_int;
          if (var5 != 4) {
            if (var5 != 6) {
              if (var5 != 0) {
                if (var5 != 1) {
                  if (var5 == 3) {
                    this.b((byte) 51, param1);
                  } else {
                    if (var5 == 2) {
                      this.a(param1, true);
                    }
                  }
                } else {
                  this.b(95, param1);
                }
              } else {
                this.a(0, param1);
              }
            } else {
              this.a((byte) -100, param0, param1);
            }
          } else {
            this.a(true, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("wa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 != 25365) {
          return -57;
        }
        return 4;
    }

    final static void a(int param0, int param1, aj param2) {
        try {
          if (param1 != 1) {
            ok var4 = (ok) null;
            wa.a(-25, (ok) null);
          }
          oj.field_r.a((byte) -119, (tc) (param2));
          wr.a((byte) -57, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "wa.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(byte param0, ha param1) {
        jd var3 = null;
        jd var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = param1.c(this.field_f, true, this.field_g);
          var3 = var4;
          if (param0 != 51) {
            field_h = (String) null;
          }
          if (var3 != null) {
            var4.field_ab = uc.field_d[this.field_c][5];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("wa.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(byte param0, ha param1) {
        try {
          if (param0 != -37) {
            this.field_g = 12;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "wa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(ha param0, boolean param1) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        jd var4 = null;
        jd var5 = null;
        try {
          var4 = param0.c(this.field_f, param1, this.field_g);
          var5 = var4;
          if (115 == this.field_c &&
            var5.field_N == 63 ||
            119 == this.field_c &&
            43 == var5.field_N ||
            this.field_c == 118 &&
            var5.field_N == 59 ||
            this.field_c == 116 &&
            var5.field_N == 58 ||
            this.field_c == 117 &&
            var5.field_N == 53) {
            var5.field_F = true;
            param0.a(this.field_f, this.field_g, 0, 3);
          }
          if (this.field_c == 120) {
            var4.field_C = true;
          }
          if (19 == uc.field_d[this.field_c][5]) {
            var5.field_bb = true;
          }
          if (uc.field_d[this.field_c][5] == 21) {
            var4.field_cb = var4.field_cb + uc.field_d[this.field_c][6];
            var5.field_s = true;
            var5.field_B = 0;
            if (var5.field_cb <= 100) {
              return;
            }
            var5.field_cb = 100;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("wa.P(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_h = null;
        field_e = null;
        if (param0 != 6) {
          field_h = (String) null;
        }
    }

    wa(int param0, int param1, int param2) {
        super(param0);
        this.field_f = param2;
        this.field_g = param1;
    }

    final void a(ha param0, int param1) {
        try {
          if (param1 != -1700635440) {
            field_h = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "wa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_h = "(<%0> players want to join)";
    }
}
