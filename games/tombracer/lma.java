/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lma extends dg {
    private int field_A;
    private int field_v;
    private int field_y;
    private boolean field_z;
    private int field_q;
    private int field_m;
    private int field_w;
    private boolean field_s;
    private fla field_o;
    private boolean field_n;
    static jea field_r;
    private boolean field_p;
    private int field_u;
    private boolean field_t;
    private fh[][] field_x;

    final void a(gr param0, gma param1, byte param2) {
        try {
          super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lma.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int m(byte param0) {
        if (param0 > -63) {
          this.field_q = 91;
        }
        if (this.k(10)) {
          return -1;
        }
        return 0;
    }

    private final int b(fh param0, byte param1) {
        RuntimeException var3 = null;
        uw var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y != 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param0.field_a != 0 &&
            param0.field_a != 3 &&
            param0.field_a != 4) {
            stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          if (param1 != -94) {
            var4 = (uw) null;
            this.a((byte) -105, 15, (uw) null);
          }
          stackIn_11_0 = this.a(40).e(true).a(100, 0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("lma.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    lma(int param0) {
        super(param0);
        this.field_p = true;
    }

    final void d(int param0) {
        int discarded$1 = 0;
        fsa var3;
        int var4;
        fh var5;
        w var6;
        super.d(param0 ^ 0);
        if (param0 != -1) {
          var5 = (fh) null;
          discarded$1 = this.b((fh) null, (byte) 19);
        }
        var6 = (w) (this.a(param0 + 58).field_G);
        if (var6 == null) {
          return;
        }
        if (this.field_h instanceof fsa) {
          var3 = (fsa) (this.field_h);
          var4 = var3.d(param0 + 51, false) ? 1 : 0;
          if (this.field_o == null &&
            var4 != 0) {
            this.field_o = var6.a(new fm(17, this.b((byte) -105), this.c((byte) 94), this.e((byte) -114)), -58);
          } else {
            if (this.field_o != null &&
              var4 == 0) {
              var6.a(new fm(18, this.b((byte) 101), this.c((byte) 109), this.e((byte) -89)), -58);
              this.field_o.a(14, var6);
              this.field_o = null;
            }
          }
          if (this.field_o != null) {
            this.field_o.a(this.b((byte) -93), var6.field_c, -128, var6.field_h, this.c((byte) 110));
          }
        }
    }

    final int f(byte param0) {
        if (this.k(10)) {
          return -1;
        }
        int var2 = 116 % ((param0 - 15) / 45);
        return 0;
    }

    final ka a(fh param0, byte param1) {
        int discarded$0 = 0;
        ka stackIn_44_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        fh var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != 76) {
            var6 = (fh) null;
            discarded$0 = this.b((fh) null, (byte) -30);
          }
          if (this.field_y == 0) {
            var4 = param0.field_a;
            switch (var4) {
              case 1:
                var3_int = 4;
                break;
              case 2:
                var3_int = 6;
                break;
              case 3:
                var3_int = 8;
                break;
              case 4:
                var3_int = 10;
                break;
              case 5:
                var3_int = 14;
                break;
              case 6:
                var3_int = 15;
                break;
              case 7:
                var3_int = 17;
                break;
              case 8:
                var3_int = 19;
                break;
              case 9:
                var3_int = 18;
                break;
              case 10:
                var3_int = 16;
                break;
              case 11:
                var3_int = 12;
                break;
              case 12:
                var3_int = 13;
                break;
              case 0:
              default:
                var3_int = (75 > param0.field_d) ? 0 : 2;
                break;
            }
          } else {
            var3_int = 8;
          }
          stackIn_44_0 = ta.field_ub[param0.field_p + var3_int];
          return stackIn_44_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_47_0 = var3;
          stackIn_47_1 = new StringBuilder().append("lma.R(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(uw param0, int param1) {
        try {
          super.a(param0, 115);
          if (param1 <= 82) {
            this.o((byte) 33);
          }
          this.field_x = (fh[][]) null;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lma.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, fh param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (~param3.field_a != param2 &&
            1 != param3.field_a &&
            param3.field_a != 2) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          stackIn_6_0 = (param0 / 2097152 + param1 / 2097152) % 2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("lma.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        kh var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_x != null) {
            for (var4_int = 0; this.field_q > var4_int; var4_int++) {
              for (var5 = 0; var5 < this.field_w; var5++) {
                param2.a((byte) 88, param1, this.field_x[var4_int][var5]);
              }
            }
          }
          if (param0 < 50) {
            var7 = (kh) null;
            this.a(101, (la) null, (kh) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("lma.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, la param1, kh param2) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 <= 119) {
            this.field_m = -87;
          }
          super.a(127, param1, param2);
          if (17 <= param1.field_E) {
            this.field_y = param2.b((byte) 44, 4);
            stackIn_7_1 = (param2.b((byte) 44, 1) == 1);
            this.field_p = stackIn_7_1;
          } else {
            this.field_p = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("lma.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        fh var4;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        super.h(109);
        if (this.field_x == null) {
          return;
        }
        for (var2 = 0; this.field_q > var2; var2++) {
          for (var3 = 0; this.field_w > var3; var3++) {
            var4 = this.field_x[var2][var3];
            var5 = bl.field_c[var4.field_a];
            var4.field_o = dfa.a(-var4.field_o + var5, 2048, -73);
            var4.field_l = -var4.field_l;
            var4.field_i = sw.a(var4.field_i, 6);
            if (var4.field_a == 11) {
              var4.field_a = 12;
            } else {
              if (var4.field_a == 12) {
                var4.field_a = 11;
              }
            }
            var4.a(0);
          }
        }
        if (param0 <= 0) {
          this.m((byte) 122);
        }
    }

    private final boolean k(int param0) {
        if (this.field_h.b(true)) {
          return true;
        }
        if (this.field_h instanceof fsa) {
          return true;
        }
        if (param0 != 10) {
          return true;
        }
        return false;
    }

    private final void j(int param0) {
        int var11 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_282_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_300_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        fh var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        la var38;
        var37 = TombRacer.field_G ? 1 : 0;
        var38 = this.field_h.f((byte) 68);
        var3 = var38.m((byte) -86);
        var4 = var38.s(param0 ^ 2097238);
        var5 = this.field_h.c(param0 - 2097273);
        var6 = this.field_h.a((byte) 55);
        this.field_v = this.field_h.d(3) - var5 / 2;
        this.field_A = this.field_v + var5;
        this.field_u = this.field_h.e(9648) - var6 / 2;
        this.field_m = var6 + this.field_u;
        var7 = this.k(10) ? 1 : 0;
        var8 = this.field_h.d(3);
        var9 = this.field_h.e(9648);
        this.field_w = (-this.field_u + this.field_m) / 2097152;
        this.field_q = (-this.field_v + this.field_A) / param0;
        this.field_x = new fh[this.field_q][this.field_w];
        var10 = 1048576 + this.field_u;
        for (var11 = 0; var11 < this.field_w; var11++) {
          var12 = 1048576 + this.field_v;
          for (var13 = 0; var13 < this.field_q; var13++) {
            var14 = new fh();
            this.field_x[var13][var11] = var14;
            stackIn_7_0 = (var13 <= 0) ? 0 : 1;
            var15 = stackIn_7_0;
            stackIn_10_0 = (var13 >= -1 + this.field_q) ? 0 : 1;
            var16 = stackIn_10_0;
            stackIn_13_0 = (var11 <= 0) ? 0 : 1;
            var17 = stackIn_13_0;
            stackIn_16_0 = (var11 >= -1 + this.field_w) ? 0 : 1;
            var18 = stackIn_16_0;
            if (var12 < 0 ||
              var12 > var3) {
              var16 = 1;
              var15 = 1;
            }
            if (var10 < 0 ||
              var4 < var10) {
              var17 = 1;
              var18 = 1;
            }
            var19 = var15;
            var20 = var16;
            var21 = var17;
            var22 = var18;
            var23 = za.$cfr$intArgs$a$c604db63f465(1048576, 62, -1048576 + var3, var12);
            var24 = za.$cfr$intArgs$a$c604db63f465(1048576, 96, var4 - 1048576, var10);
            if (var7 == 0) {
              if (this.field_p) {
                if (var22 == 0) {
                  stackIn_33_0 = (var10 > -2097152 + var4) ? 1 : 0;
                } else {
                  stackIn_33_0 = 1;
                }
                var22 = stackIn_33_0;
                if (var19 == 0) {
                  stackIn_39_0 = (var12 < 2097152) ? 1 : 0;
                } else {
                  stackIn_39_0 = 1;
                }
                var19 = stackIn_39_0;
                if (var21 != 0) {
                  stackIn_45_0 = 1;
                } else {
                  stackIn_45_0 = (var10 < 2097152) ? 1 : 0;
                }
                var21 = stackIn_45_0;
                if (var20 == 0) {
                  stackIn_51_0 = (var3 - 2097152 < var12) ? 1 : 0;
                } else {
                  stackIn_51_0 = 1;
                }
                var20 = stackIn_51_0;
              }
              if (var19 == 0) {
                stackIn_58_0 = (var38.a(var23 - 2097152, 2097152, var24, 2097152, true, 0, (byte) 102)) ? 1 : 0;
              } else {
                stackIn_58_0 = 1;
              }
              var19 = stackIn_58_0;
              if (var20 == 0) {
                stackIn_66_0 = (var38.a(2097152 + var23, 2097152, var24, 2097152, true, 0, (byte) -99)) ? 1 : 0;
                var20 = stackIn_66_0;
              } else {
                stackIn_61_0 = 1;
                var20 = stackIn_61_0;
              }
              if (var21 == 0) {
                stackIn_75_0 = (var38.a(var23, 2097152, var24 - 2097152, 2097152, true, 0, (byte) -103)) ? 1 : 0;
                var21 = stackIn_75_0;
              } else {
                stackIn_70_0 = 1;
                var21 = stackIn_70_0;
              }
              if (var22 == 0) {
                stackIn_84_0 = (var38.a(var23, 2097152, var24 + 2097152, 2097152, true, 0, (byte) 72)) ? 1 : 0;
                var22 = stackIn_84_0;
              } else {
                stackIn_79_0 = 1;
                var22 = stackIn_79_0;
              }
            }
            if (this.field_z) {
              var19 = 1;
            }
            if (this.field_n) {
              var22 = 1;
            }
            if (this.field_t) {
              var20 = 1;
            }
            if (this.field_s) {
              var21 = 1;
            }
            var25 = 0;
            if (var19 != 0) {
              var25++;
            }
            if (var20 != 0) {
              var25++;
            }
            if (var21 != 0) {
              var25++;
            }
            if (var22 != 0) {
              var25++;
            }
            var26 = 0;
            var27 = 0;
            switch (var25) {
              case 4:
                if (var15 != 0 &&
                  var17 != 0) {
                  stackIn_152_0 = 1;
                  var28 = stackIn_152_0;
                } else {
                  if (var12 >= 2097152) {
                    if (var10 >= 2097152) {
                      stackIn_162_0 = (var38.a(var12 - 2097152, 2097152, -2097152 + var10, 2097152, true, 0, (byte) 72)) ? 1 : 0;
                    } else {
                      stackIn_162_0 = 1;
                    }
                  } else {
                    stackIn_162_0 = 1;
                  }
                  var28 = stackIn_162_0;
                }
                if (var16 != 0 &&
                  var17 != 0) {
                  stackIn_167_0 = 1;
                  var29 = stackIn_167_0;
                } else {
                  if (var12 <= var3 - 2097152) {
                    if (var10 >= 2097152) {
                      stackIn_181_0 = (var38.a(var12 + 2097152, 2097152, -2097152 + var10, 2097152, true, 0, (byte) 103)) ? 1 : 0;
                      var29 = stackIn_181_0;
                    } else {
                      stackIn_176_0 = 1;
                      var29 = stackIn_176_0;
                    }
                  } else {
                    stackIn_172_0 = 1;
                    var29 = stackIn_172_0;
                  }
                }
                if (var15 != 0 &&
                  var18 != 0) {
                  stackIn_186_0 = 1;
                  var30 = stackIn_186_0;
                } else {
                  if (var12 >= 2097152) {
                    if (-2097152 + var4 >= var10) {
                      stackIn_196_0 = (var38.a(-2097152 + var12, 2097152, var10 + 2097152, 2097152, true, 0, (byte) -55)) ? 1 : 0;
                    } else {
                      stackIn_196_0 = 1;
                    }
                  } else {
                    stackIn_196_0 = 1;
                  }
                  var30 = stackIn_196_0;
                }
                if (var16 != 0 &&
                  var18 != 0) {
                  stackIn_209_0 = 1;
                } else {
                  if (-2097152 + var3 >= var12) {
                    if (var10 <= -2097152 + var4) {
                      stackIn_209_0 = (var38.a(2097152 + var12, 2097152, var10 + 2097152, 2097152, true, 0, (byte) 55)) ? 1 : 0;
                    } else {
                      stackIn_209_0 = 1;
                    }
                  } else {
                    stackIn_209_0 = 1;
                  }
                }
                var31 = stackIn_209_0;
                if (var28 != 0 &&
                  var29 != 0 &&
                  var30 != 0 &&
                  var31 != 0) {
                  var14.field_a = 5;
                } else {
                  if (var28 != 0) {
                    if (var30 != 0) {
                      var26 = (var29 != 0) ? 1024 : 512;
                    } else {
                      var26 = -512;
                    }
                  } else {
                    var26 = 0;
                  }
                  var14.field_a = 6;
                }
                break;
              case 3:
                if (var21 != 0) {
                  if (var22 != 0) {
                    if (var20 == 0) {
                      var26 = 512;
                      var27 = 2;
                    } else {
                      var27 = 6;
                      var26 = -512;
                    }
                    var14.field_a = 0;
                  } else {
                    var26 = 1024;
                    var27 = 4;
                    var14.field_a = 0;
                  }
                } else {
                  var26 = 0;
                  var27 = 0;
                  var14.field_a = 0;
                }
                break;
              case 1:
                if (var21 == 0) {
                  if (var22 == 0) {
                    if (var20 == 0) {
                      var27 = 2;
                      var26 = 0;
                    } else {
                      var26 = 1024;
                      var27 = 6;
                    }
                    var14.field_a = 2;
                  } else {
                    var27 = 0;
                    var26 = -512;
                    var14.field_a = 2;
                  }
                } else {
                  var27 = 4;
                  var26 = 512;
                  var14.field_a = 2;
                }
                break;
              default:
                var14.field_a = 3;
                break;
              case 2:
                if (var21 == 0 &&
                  var22 == 0) {
                  var27 = 0;
                  var14.field_a = 1;
                  var26 = 0;
                } else {
                  if (var19 == 0 &&
                    var20 == 0) {
                    var14.field_a = 1;
                    var26 = -512;
                    var27 = 2;
                  } else {
                    if (var19 == 0 &&
                      var21 == 0) {
                      var27 = 7;
                      var26 = -512;
                    } else {
                      if (var19 == 0 &&
                        var22 == 0) {
                        var26 = 1024;
                        var27 = 5;
                        var14.field_a = 4;
                        break;
                      }
                      if (var20 == 0 &&
                        var21 == 0) {
                        var27 = 1;
                        var26 = 0;
                        var14.field_a = 4;
                        break;
                      }
                      if (var20 == 0 &&
                        var22 == 0) {
                        var27 = 3;
                        var26 = 512;
                        var14.field_a = 4;
                        break;
                      }
                    }
                    var14.field_a = 4;
                  }
                }
                break;
            }
            stackIn_225_0 = (!var38.a(-2097152 + var23, 2097152, var24, 2097152, false, 2, (byte) 98)) ? 0 : 1;
            var28 = stackIn_225_0;
            stackIn_228_0 = (!var38.a(var23 + 2097152, 2097152, var24, 2097152, false, 2, (byte) -108)) ? 0 : 1;
            var29 = stackIn_228_0;
            stackIn_231_0 = (!var38.a(var23, 2097152, var24 - 2097152, 2097152, false, 2, (byte) 118)) ? 0 : 1;
            var30 = stackIn_231_0;
            stackIn_234_0 = (!var38.a(var23, 2097152, 2097152 + var24, 2097152, false, 2, (byte) 116)) ? 0 : 1;
            var31 = stackIn_234_0;
            if (var28 == 0) {
              if (var29 == 0) {
                if (var30 != 0) {
                  stackIn_247_0 = 1;
                } else {
                  stackIn_247_0 = (var31 == 0) ? 0 : 1;
                }
                var32 = stackIn_247_0;
              } else {
                stackIn_241_0 = 1;
                var32 = stackIn_241_0;
              }
            } else {
              stackIn_237_0 = 1;
              var32 = stackIn_237_0;
            }
            if (var32 != 0 &&
              4 == var14.field_a) {
              if (var28 != 0) {
                if (var27 != 7) {
                  if (5 == var27) {
                    var14.field_a = 12;
                    var26 = 1024;
                  }
                } else {
                  var26 = 0;
                  var14.field_a = 11;
                }
              }
              if (var29 != 0) {
                if (var27 != 1) {
                  if (3 == var27) {
                    var26 = 1024;
                    var14.field_a = 11;
                  }
                } else {
                  var26 = 0;
                  var14.field_a = 12;
                }
              }
            }
            var14.field_o = dfa.a(var26 + bl.field_c[var14.field_a], 2048, 120);
            var14.field_i = var27;
            var14.field_f = var10 - var9;
            var14.field_l = var12 - var8;
            var14.field_g = this;
            if (this.field_y == 0) {
              var14.field_p = this.a(var10, var12, param0 - 2097153, var14);
              var14.field_d = this.b(var14, (byte) -94);
            }
            if (var7 == 0) {
              if (var21 != 0 &&
                var19 != 0) {
                stackIn_273_0 = 0;
              } else {
                stackIn_273_0 = (!var38.a(var23 - 2097152, 2097152, var24 - 2097152, 2097152, true, 0, (byte) 98)) ? 0 : 1;
              }
            } else {
              stackIn_273_0 = 0;
            }
            var33 = stackIn_273_0;
            if (var7 == 0) {
              if (var21 != 0 &&
                var20 != 0) {
                stackIn_282_0 = 0;
              } else {
                stackIn_282_0 = (!var38.a(2097152 + var23, 2097152, -2097152 + var24, 2097152, true, 0, (byte) 79)) ? 0 : 1;
              }
            } else {
              stackIn_282_0 = 0;
            }
            var34 = stackIn_282_0;
            if (var7 == 0) {
              if (var22 != 0 &&
                var19 != 0) {
                stackIn_291_0 = 0;
              } else {
                stackIn_291_0 = (!var38.a(var23 - 2097152, 2097152, 2097152 + var24, 2097152, true, 0, (byte) -88)) ? 0 : 1;
              }
            } else {
              stackIn_291_0 = 0;
            }
            var35 = stackIn_291_0;
            if (var7 == 0) {
              if (var22 != 0 &&
                var20 != 0) {
                stackIn_300_0 = 0;
              } else {
                stackIn_300_0 = (!var38.a(var23 + 2097152, 2097152, 2097152 + var24, 2097152, true, 0, (byte) 117)) ? 0 : 1;
              }
            } else {
              stackIn_300_0 = 0;
            }
            var36 = stackIn_300_0;
            var12 = var12 + 2097152;
            var14.a(var33 != 0, (byte) 24, var34 != 0, var36 != 0, var35 != 0);
          }
          var10 = var10 + 2097152;
        }
    }

    final void a(int param0, uw param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 <= 40) {
            this.l(-14);
          }
          if (null != this.field_x) {
            for (var4_int = 0; var4_int < this.field_q; var4_int++) {
              for (var5 = 0; var5 < this.field_w; var5++) {
                param1.a(param0, this.field_x[var4_int][var5], (byte) -33);
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lma.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
          super.a((byte) 86, param1);
          int var3_int = -57 / ((param0 + 8) / 40);
          param1.a((byte) -19, this.field_y, 4);
          param1.a((byte) 111, !this.field_p ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lma.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, uw param1) {
        try {
          if (null == this.field_x) {
            this.j(2097152);
            if (hb.d(67)) {
              this.l(32166);
            }
          }
          super.b(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lma.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void l(int param0) {
        int var10 = 0;
        int var11 = 0;
        boolean[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        boolean stackIn_46_2 = false;
        int var2;
        la var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        fh var12;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        boolean[][] var23;
        var19 = TombRacer.field_G ? 1 : 0;
        if (param0 != 32166) {
          this.l(-80);
        }
        var2 = this.k(param0 ^ 32172) ? 1 : 0;
        var3 = this.a(param0 - 32121);
        var4 = 4194304;
        var5 = this.field_h.d(3);
        var6 = this.field_h.e(9648);
        for (var10 = 0; var10 < this.field_q; var10++) {
          for (var11 = 0; this.field_w > var11; var11++) {
            boolean decompiledFrameRemainder1 = true;
            var12 = this.field_x[var10][var11];
            if (var12.field_a == 5) {
              var8 = var12.field_f + var6;
              var7 = var5 + var12.field_l;
              var9 = 0;
              var23 = new boolean[5][5];
              var14 = 0;
              if (var2 == 0) {
                for (var15 = 0; var15 < 5; var15++) {
                  var16 = -2 + var15;
                  var23[var15][0] = var3.a(var7 + 2097152 * var16, 2097152, -var4 + var8, 2097152, true, 0, (byte) -39);
                  if (var23[var15][0]) {
                    var14++;
                  }
                  var23[var15][4] = var3.a(2097152 * var16 + var7, 2097152, var8 + var4, 2097152, true, 0, (byte) 91);
                  if (var23[var15][4]) {
                    var14++;
                  }
                }
                for (var15 = 0; var15 < 3; var15++) {
                  var16 = var15 - 1;
                  var23[0][1 + var15] = var3.a(-var4 + var7, 2097152, 2097152 * var16 + var8, 2097152, true, 0, (byte) -20);
                  if (var23[0][var15 + 1]) {
                    var14++;
                  }
                  var23[4][1 + var15] = var3.a(var7 + var4, 2097152, var8 + 2097152 * var16, 2097152, true, 0, (byte) 88);
                  if (var23[4][var15 + 1]) {
                    var14++;
                  }
                }
              } else {
                for (var15 = 0; var15 < 5; var15++) {
                  for (var16 = 0; 5 > var16; var16++) {
                    if (var15 == 0 ||
                      var16 == 0 ||
                      var15 == 4 ||
                      var16 == 4) {
                      var17 = var10 + (var15 - 2);
                      var18 = var11 + (var16 - 2);
                      stackIn_45_0 = var23[var15];
                      stackIn_45_1 = var16;
                      stackIn_46_2 = (var17 >= 0) && (0 <= var18) && (this.field_q > var17) && (this.field_w > var18);
                      stackIn_45_0[stackIn_45_1] = stackIn_46_2;
                      if (var23[var15][var16]) {
                        var14++;
                      }
                    }
                  }
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (16 == var14) {
                var12.field_a = 10;
              } else {
                if (var14 != 15) {
                  if (11 <= var14) {
                    if (var23[1][0] &&
                      var23[2][0] &&
                      var23[3][0]) {
                      if (var23[4][1] &&
                        var23[4][2] &&
                        var23[4][3]) {
                        if (var23[1][4] &&
                          var23[2][4] &&
                          var23[3][4]) {
                          if ((!(var23[0][1]) ||
                            !(var23[0][2]) ||
                            !(var23[0][3]))) {
                            var12.field_a = 7;
                            var9 = -512;
                          }
                        } else {
                          var9 = 1024;
                          var12.field_a = 7;
                        }
                      } else {
                        var12.field_a = 7;
                        var9 = 512;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var12.field_a = 7;
                      var9 = 0;
                    }
                  } else {
                    if (var14 < 5) {
                      var12.field_o = var9 + bl.field_c[var12.field_a];
                      var12.field_d = 0;
                      var12.field_p = 0;
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      if (!var23[0][0] &&
                        !var23[1][0] &&
                        !var23[0][1]) {
                        var9 = 0;
                        var12.field_a = 8;
                      } else {
                        if (!var23[4][0] &&
                          !var23[3][0] &&
                          !var23[4][1]) {
                          var9 = 512;
                          var12.field_a = 8;
                        } else {
                          if (!var23[4][4] &&
                            !var23[4][3] &&
                            !var23[3][4]) {
                            var9 = 1024;
                            var12.field_a = 8;
                          } else {
                            if (!var23[0][4] &&
                              !var23[1][4] &&
                              !var23[0][1]) {
                              var12.field_a = 8;
                              var9 = -512;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (var23[0][0]) {
                    if (!var23[4][0]) {
                      var12.field_a = 9;
                      var9 = -512;
                    } else {
                      if (!var23[4][4]) {
                        var9 = 0;
                        var12.field_a = 9;
                      } else {
                        if (!var23[0][4]) {
                          var9 = 512;
                          var12.field_a = 9;
                        }
                      }
                    }
                  } else {
                    var12.field_a = 9;
                    var9 = 1024;
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                var12.field_o = var9 + bl.field_c[var12.field_a];
                var12.field_d = 0;
                var12.field_p = 0;
              }
            }
          }
        }
    }

    final boolean o(byte param0) {
        int var2 = 66 % ((25 - param0) / 57);
        if (!(this.field_h instanceof fsa)) {
          return false;
        }
        return true;
    }

    lma(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    public static void n(byte param0) {
        field_r = null;
        int var1 = -22 % ((param0 - 6) / 42);
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
          int var6_int = 89 % ((-38 - param4) / 47);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lma.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int i(int param0) {
        if (param0 > -28) {
          this.field_u = -21;
        }
        return this.field_y;
    }

    static {
    }
}
