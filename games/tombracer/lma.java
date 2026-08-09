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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-1 == (this.field_y ^ -1)) {
              L1: {
                if (-1 == (param0.field_a ^ -1)) {
                  break L1;
                } else {
                  if (-4 == (param0.field_a ^ -1)) {
                    break L1;
                  } else {
                    if ((param0.field_a ^ -1) == -5) {
                      break L1;
                    } else {
                      stackIn_7_0 = 0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              L2: {
                if (param1 == -94) {
                  break L2;
                } else {
                  var4 = (uw) null;
                  this.a((byte) -105, 15, (uw) null);
                  break L2;
                }
              }
              stackIn_11_0 = this.a(40).e(true).a(100, 0);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("lma.H(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
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
        L0: {
          super.d(param0 ^ 0);
          if (param0 == -1) {
            break L0;
          } else {
            var5 = (fh) null;
            discarded$1 = this.b((fh) null, (byte) 19);
            break L0;
          }
        }
        var6 = (w) ((Object) this.a(param0 + 58).field_G);
        if (var6 != null) {
          L1: {
            if (this.field_h instanceof fsa) {
              L2: {
                L3: {
                  var3 = (fsa) ((Object) this.field_h);
                  var4 = var3.d(param0 + 51, false) ? 1 : 0;
                  if (this.field_o != null) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      this.field_o = var6.a(new fm(17, this.b((byte) -105), this.c((byte) 94), this.e((byte) -114)), -58);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_o == null) {
                  break L2;
                } else {
                  if (var4 == 0) {
                    var6.a(new fm(18, this.b((byte) 101), this.c((byte) 109), this.e((byte) -89)), -58);
                    this.field_o.a(14, var6);
                    this.field_o = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (this.field_o != null) {
                this.field_o.a(this.b((byte) -93), var6.field_c, -128, var6.field_h, this.c((byte) 110));
                break L1;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
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
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        fh var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 76) {
                break L1;
              } else {
                var6 = (fh) null;
                discarded$0 = this.b((fh) null, (byte) -30);
                break L1;
              }
            }
            L2: {
              if (this.field_y == 0) {
                L3: {
                  var4 = param0.field_a;
                  if (var4 != 0) {
                    if ((var4 ^ -1) == -2) {
                      var3_int = 4;
                      break L2;
                    } else {
                      if (2 != var4) {
                        if ((var4 ^ -1) != -4) {
                          if (-5 != (var4 ^ -1)) {
                            if (5 != var4) {
                              if ((var4 ^ -1) != -7) {
                                if (var4 != 7) {
                                  if (var4 == 8) {
                                    var3_int = 19;
                                    break L2;
                                  } else {
                                    if (var4 != 9) {
                                      if (-11 != (var4 ^ -1)) {
                                        if (11 == var4) {
                                          var3_int = 12;
                                          break L2;
                                        } else {
                                          if (-13 == (var4 ^ -1)) {
                                            var3_int = 13;
                                            break L2;
                                          } else {
                                            break L3;
                                          }
                                        }
                                      } else {
                                        var3_int = 16;
                                        break L2;
                                      }
                                    } else {
                                      var3_int = 18;
                                      break L2;
                                    }
                                  }
                                } else {
                                  var3_int = 17;
                                  break L2;
                                }
                              } else {
                                var3_int = 15;
                                break L2;
                              }
                            } else {
                              var3_int = 14;
                              break L2;
                            }
                          } else {
                            var3_int = 10;
                            break L2;
                          }
                        } else {
                          var3_int = 8;
                          break L2;
                        }
                      } else {
                        var3_int = 6;
                        break L2;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (75 > param0.field_d) {
                  var3_int = 0;
                  break L2;
                } else {
                  var3_int = 2;
                  break L2;
                }
              } else {
                var3_int = 8;
                break L2;
              }
            }
            stackIn_44_0 = ta.field_ub[param0.field_p + var3_int];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var3);

            stackIn_47_1 = new StringBuilder().append("lma.R(");

            if (param0 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L4;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param1 + ')');
        }
        return stackIn_44_0;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param3.field_a ^ -1) == param2) {
                break L1;
              } else {
                if (1 == param3.field_a) {
                  break L1;
                } else {
                  if (param3.field_a == 2) {
                    break L1;
                  } else {
                    stackIn_4_0 = 0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            stackIn_6_0 = (param0 / 2097152 + param1 / 2097152) % 2;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("lma.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        kh var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_x != null) {
                var4_int = 0;
                L2: while (true) {
                  if (this.field_q <= var4_int) {
                    break L1;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= this.field_w) {
                        var4_int++;
                        continue L2;
                      } else {
                        param2.a((byte) 88, param1, this.field_x[var4_int][var5]);
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (param0 >= 50) {
                break L4;
              } else {
                var7 = (kh) null;
                this.a(101, (la) null, (kh) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("lma.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 > 119) {
                break L1;
              } else {
                this.field_m = -87;
                break L1;
              }
            }
            L2: {
              super.a(127, param1, param2);
              if (17 <= param1.field_E) {
                L3: {
                  this.field_y = param2.b((byte) 44, 4);
                  stackIn_6_0 = this;

                  if ((param2.b((byte) 44, 1) ^ -1) != -2) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L3;
                  }
                }
                ((lma) (this)).field_p = stackIn_7_1 != 0;
                break L2;
              } else {
                this.field_p = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("lma.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        fh var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.h(109);
        if (!(this.field_x != null)) {
            return;
        }
        for (var2 = 0; this.field_q > var2; var2++) {
            for (var3 = 0; this.field_w > var3; var3++) {
                var4 = this.field_x[var2][var3];
                var5 = bl.field_c[var4.field_a];
                var4.field_o = dfa.a(-var4.field_o + var5, 2048, -73);
                var4.field_l = -var4.field_l;
                var4.field_i = sw.a(var4.field_i, 6);
                if ((var4.field_a ^ -1) == -12 || -13 == (var4.field_a ^ -1)) {
                    var4.field_a = 12;
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
        if (!(!(this.field_h instanceof fsa))) {
            return true;
        }
        if (param0 != 10) {
            return true;
        }
        return false;
    }

    private final void j(int param0) {
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
        int var11;
        int var12;
        int var13;
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
        var5 = this.field_h.c(param0 + -2097273);
        var6 = this.field_h.a((byte) 55);
        this.field_v = this.field_h.d(3) - var5 / 2;
        this.field_A = this.field_v - -var5;
        this.field_u = this.field_h.e(9648) + -(var6 / 2);
        this.field_m = var6 + this.field_u;
        var7 = this.k(10) ? 1 : 0;
        var8 = this.field_h.d(3);
        var9 = this.field_h.e(9648);
        this.field_w = (-this.field_u + this.field_m) / 2097152;
        this.field_q = (-this.field_v + this.field_A) / param0;
        this.field_x = new fh[this.field_q][this.field_w];
        var10 = 1048576 + this.field_u;
        var11 = 0;
        L0: while (true) {
          if (var11 >= this.field_w) {
            return;
          } else {
            var12 = 1048576 + this.field_v;
            var13 = 0;
            L1: while (true) {
              if (var13 >= this.field_q) {
                var10 = var10 + 2097152;
                var11++;
                continue L0;
              } else {
                L2: {
                  var14 = new fh();
                  this.field_x[var13][var11] = var14;
                  if ((var13 ^ -1) >= -1) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    stackIn_7_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  var15 = stackIn_7_0;
                  if (var13 >= -1 + this.field_q) {
                    stackIn_10_0 = 0;
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  var16 = stackIn_10_0;
                  if (var11 <= 0) {
                    stackIn_13_0 = 0;
                    break L4;
                  } else {
                    stackIn_13_0 = 1;
                    break L4;
                  }
                }
                L5: {
                  var17 = stackIn_13_0;
                  if (var11 >= -1 + this.field_w) {
                    stackIn_16_0 = 0;
                    break L5;
                  } else {
                    stackIn_16_0 = 1;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var18 = stackIn_16_0;
                    if ((var12 ^ -1) > -1) {
                      break L7;
                    } else {
                      if (var12 <= var3) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var16 = 1;
                  var15 = 1;
                  break L6;
                }
                L8: {
                  L9: {
                    if (var10 < 0) {
                      break L9;
                    } else {
                      if (var4 < var10) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var17 = 1;
                  var18 = 1;
                  break L8;
                }
                L10: {
                  var19 = var15;
                  var20 = var16;
                  var21 = var17;
                  var22 = var18;
                  var23 = za.a(1048576, (byte) 62, -1048576 + var3, var12);
                  var24 = za.a(1048576, (byte) 96, var4 - 1048576, var10);
                  if (var7 == 0) {
                    L11: {
                      if (!this.field_p) {
                        break L11;
                      } else {
                        L12: {
                          if (var22 == 0) {
                            if (var10 > -2097152 + var4) {
                              stackIn_33_0 = 1;
                              break L12;
                            } else {
                              stackIn_33_0 = 0;
                              break L12;
                            }
                          } else {
                            stackIn_33_0 = 1;
                            break L12;
                          }
                        }
                        L13: {
                          var22 = stackIn_33_0;
                          if (var19 == 0) {
                            if ((var12 ^ -1) > -2097153) {
                              stackIn_39_0 = 1;
                              break L13;
                            } else {
                              stackIn_39_0 = 0;
                              break L13;
                            }
                          } else {
                            stackIn_39_0 = 1;
                            break L13;
                          }
                        }
                        L14: {
                          var19 = stackIn_39_0;
                          if (var21 != 0) {
                            stackIn_45_0 = 1;
                            break L14;
                          } else {
                            if (-2097153 < (var10 ^ -1)) {
                              stackIn_45_0 = 1;
                              break L14;
                            } else {
                              stackIn_45_0 = 0;
                              break L14;
                            }
                          }
                        }
                        L15: {
                          var21 = stackIn_45_0;
                          if (var20 == 0) {
                            if (var3 + -2097152 < var12) {
                              stackIn_51_0 = 1;
                              break L15;
                            } else {
                              stackIn_51_0 = 0;
                              break L15;
                            }
                          } else {
                            stackIn_51_0 = 1;
                            break L15;
                          }
                        }
                        var20 = stackIn_51_0;
                        break L11;
                      }
                    }
                    L16: {
                      if (var19 == 0) {
                        if (var38.a(var23 - 2097152, 2097152, var24, 2097152, true, 0, (byte) 102)) {
                          stackIn_58_0 = 1;
                          break L16;
                        } else {
                          stackIn_58_0 = 0;
                          break L16;
                        }
                      } else {
                        stackIn_58_0 = 1;
                        break L16;
                      }
                    }
                    L17: {
                      var19 = stackIn_58_0;
                      if (var20 == 0) {
                        L18: {
                          if (var38.a(2097152 + var23, 2097152, var24, 2097152, true, 0, (byte) -99)) {
                            stackIn_66_0 = 1;
                            break L18;
                          } else {
                            stackIn_66_0 = 0;
                            break L18;
                          }
                        }
                        var20 = stackIn_66_0;
                        break L17;
                      } else {
                        stackIn_61_0 = 1;
                        var20 = stackIn_61_0;
                        break L17;
                      }
                    }
                    L19: {
                      if (var21 == 0) {
                        L20: {
                          if (var38.a(var23, 2097152, var24 + -2097152, 2097152, true, 0, (byte) -103)) {
                            stackIn_75_0 = 1;
                            break L20;
                          } else {
                            stackIn_75_0 = 0;
                            break L20;
                          }
                        }
                        var21 = stackIn_75_0;
                        break L19;
                      } else {
                        stackIn_70_0 = 1;
                        var21 = stackIn_70_0;
                        break L19;
                      }
                    }
                    if (var22 == 0) {
                      L21: {
                        if (var38.a(var23, 2097152, var24 - -2097152, 2097152, true, 0, (byte) 72)) {
                          stackIn_84_0 = 1;
                          break L21;
                        } else {
                          stackIn_84_0 = 0;
                          break L21;
                        }
                      }
                      var22 = stackIn_84_0;
                      break L10;
                    } else {
                      stackIn_79_0 = 1;
                      var22 = stackIn_79_0;
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                L22: {
                  if (this.field_z) {
                    var19 = 1;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (this.field_n) {
                    var22 = 1;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (this.field_t) {
                    var20 = 1;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (!this.field_s) {
                    break L25;
                  } else {
                    var21 = 1;
                    break L25;
                  }
                }
                L26: {
                  var25 = 0;
                  if (var19 != 0) {
                    var25++;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var20 == 0) {
                    break L27;
                  } else {
                    var25++;
                    break L27;
                  }
                }
                L28: {
                  if (var21 == 0) {
                    break L28;
                  } else {
                    var25++;
                    break L28;
                  }
                }
                L29: {
                  if (var22 != 0) {
                    var25++;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  var26 = 0;
                  var27 = 0;
                  if (-5 == (var25 ^ -1)) {
                    L31: {
                      L32: {
                        if (var15 == 0) {
                          break L32;
                        } else {
                          if (var17 == 0) {
                            break L32;
                          } else {
                            stackIn_152_0 = 1;
                            var28 = stackIn_152_0;
                            break L31;
                          }
                        }
                      }
                      L33: {
                        if (-2097153 >= (var12 ^ -1)) {
                          if (var10 >= 2097152) {
                            if (var38.a(var12 + -2097152, 2097152, -2097152 + var10, 2097152, true, 0, (byte) 72)) {
                              stackIn_162_0 = 1;
                              break L33;
                            } else {
                              stackIn_162_0 = 0;
                              break L33;
                            }
                          } else {
                            stackIn_162_0 = 1;
                            break L33;
                          }
                        } else {
                          stackIn_162_0 = 1;
                          break L33;
                        }
                      }
                      var28 = stackIn_162_0;
                      break L31;
                    }
                    L34: {
                      L35: {
                        if (var16 == 0) {
                          break L35;
                        } else {
                          if (var17 == 0) {
                            break L35;
                          } else {
                            stackIn_167_0 = 1;
                            var29 = stackIn_167_0;
                            break L34;
                          }
                        }
                      }
                      if (var12 <= var3 - 2097152) {
                        if (var10 >= 2097152) {
                          L36: {
                            if (var38.a(var12 + 2097152, 2097152, -2097152 + var10, 2097152, true, 0, (byte) 103)) {
                              stackIn_181_0 = 1;
                              break L36;
                            } else {
                              stackIn_181_0 = 0;
                              break L36;
                            }
                          }
                          var29 = stackIn_181_0;
                          break L34;
                        } else {
                          stackIn_176_0 = 1;
                          var29 = stackIn_176_0;
                          break L34;
                        }
                      } else {
                        stackIn_172_0 = 1;
                        var29 = stackIn_172_0;
                        break L34;
                      }
                    }
                    L37: {
                      L38: {
                        if (var15 == 0) {
                          break L38;
                        } else {
                          if (var18 == 0) {
                            break L38;
                          } else {
                            stackIn_186_0 = 1;
                            var30 = stackIn_186_0;
                            break L37;
                          }
                        }
                      }
                      L39: {
                        if ((var12 ^ -1) <= -2097153) {
                          if (-2097152 + var4 >= var10) {
                            if (var38.a(-2097152 + var12, 2097152, var10 - -2097152, 2097152, true, 0, (byte) -55)) {
                              stackIn_196_0 = 1;
                              break L39;
                            } else {
                              stackIn_196_0 = 0;
                              break L39;
                            }
                          } else {
                            stackIn_196_0 = 1;
                            break L39;
                          }
                        } else {
                          stackIn_196_0 = 1;
                          break L39;
                        }
                      }
                      var30 = stackIn_196_0;
                      break L37;
                    }
                    L40: {
                      L41: {
                        if (var16 == 0) {
                          break L41;
                        } else {
                          if (var18 == 0) {
                            break L41;
                          } else {
                            stackIn_209_0 = 1;
                            break L40;
                          }
                        }
                      }
                      if (-2097152 + var3 >= var12) {
                        if (var10 <= -2097152 + var4) {
                          if (var38.a(2097152 + var12, 2097152, var10 - -2097152, 2097152, true, 0, (byte) 55)) {
                            stackIn_209_0 = 1;
                            break L40;
                          } else {
                            stackIn_209_0 = 0;
                            break L40;
                          }
                        } else {
                          stackIn_209_0 = 1;
                          break L40;
                        }
                      } else {
                        stackIn_209_0 = 1;
                        break L40;
                      }
                    }
                    L42: {
                      var31 = stackIn_209_0;
                      if (var28 == 0) {
                        break L42;
                      } else {
                        if (var29 == 0) {
                          break L42;
                        } else {
                          if (var30 == 0) {
                            break L42;
                          } else {
                            if (var31 == 0) {
                              break L42;
                            } else {
                              var14.field_a = 5;
                              break L30;
                            }
                          }
                        }
                      }
                    }
                    L43: {
                      if (var28 != 0) {
                        if (var30 != 0) {
                          if (var29 != 0) {
                            var26 = 1024;
                            break L43;
                          } else {
                            var26 = 512;
                            break L43;
                          }
                        } else {
                          var26 = -512;
                          break L43;
                        }
                      } else {
                        var26 = 0;
                        break L43;
                      }
                    }
                    var14.field_a = 6;
                    break L30;
                  } else {
                    if (3 == var25) {
                      if (var21 != 0) {
                        if (var22 != 0) {
                          L44: {
                            if (var20 == 0) {
                              var26 = 512;
                              var27 = 2;
                              break L44;
                            } else {
                              var27 = 6;
                              var26 = -512;
                              break L44;
                            }
                          }
                          var14.field_a = 0;
                          break L30;
                        } else {
                          var26 = 1024;
                          var27 = 4;
                          var14.field_a = 0;
                          break L30;
                        }
                      } else {
                        var26 = 0;
                        var27 = 0;
                        var14.field_a = 0;
                        break L30;
                      }
                    } else {
                      if ((var25 ^ -1) != -3) {
                        if ((var25 ^ -1) == -2) {
                          if (var21 == 0) {
                            if (var22 == 0) {
                              L45: {
                                if (var20 == 0) {
                                  var27 = 2;
                                  var26 = 0;
                                  break L45;
                                } else {
                                  var26 = 1024;
                                  var27 = 6;
                                  break L45;
                                }
                              }
                              var14.field_a = 2;
                              break L30;
                            } else {
                              var27 = 0;
                              var26 = -512;
                              var14.field_a = 2;
                              break L30;
                            }
                          } else {
                            var27 = 4;
                            var26 = 512;
                            var14.field_a = 2;
                            break L30;
                          }
                        } else {
                          var14.field_a = 3;
                          break L30;
                        }
                      } else {
                        L46: {
                          if (var21 != 0) {
                            break L46;
                          } else {
                            if (var22 == 0) {
                              var27 = 0;
                              var14.field_a = 1;
                              var26 = 0;
                              break L30;
                            } else {
                              break L46;
                            }
                          }
                        }
                        L47: {
                          if (var19 != 0) {
                            break L47;
                          } else {
                            if (var20 != 0) {
                              break L47;
                            } else {
                              var14.field_a = 1;
                              var26 = -512;
                              var27 = 2;
                              break L30;
                            }
                          }
                        }
                        L48: {
                          L49: {
                            if (var19 != 0) {
                              break L49;
                            } else {
                              if (var21 == 0) {
                                var27 = 7;
                                var26 = -512;
                                break L48;
                              } else {
                                break L49;
                              }
                            }
                          }
                          L50: {
                            if (var19 != 0) {
                              break L50;
                            } else {
                              if (var22 != 0) {
                                break L50;
                              } else {
                                var26 = 1024;
                                var27 = 5;
                                var14.field_a = 4;
                                break L30;
                              }
                            }
                          }
                          L51: {
                            if (var20 != 0) {
                              break L51;
                            } else {
                              if (var21 != 0) {
                                break L51;
                              } else {
                                var27 = 1;
                                var26 = 0;
                                var14.field_a = 4;
                                break L30;
                              }
                            }
                          }
                          if (var20 != 0) {
                            break L48;
                          } else {
                            if (var22 != 0) {
                              break L48;
                            } else {
                              var27 = 3;
                              var26 = 512;
                              var14.field_a = 4;
                              break L30;
                            }
                          }
                        }
                        var14.field_a = 4;
                        break L30;
                      }
                    }
                  }
                }
                L52: {
                  if (!var38.a(-2097152 + var23, 2097152, var24, 2097152, false, 2, (byte) 98)) {
                    stackIn_225_0 = 0;
                    break L52;
                  } else {
                    stackIn_225_0 = 1;
                    break L52;
                  }
                }
                L53: {
                  var28 = stackIn_225_0;
                  if (!var38.a(var23 + 2097152, 2097152, var24, 2097152, false, 2, (byte) -108)) {
                    stackIn_228_0 = 0;
                    break L53;
                  } else {
                    stackIn_228_0 = 1;
                    break L53;
                  }
                }
                L54: {
                  var29 = stackIn_228_0;
                  if (!var38.a(var23, 2097152, var24 + -2097152, 2097152, false, 2, (byte) 118)) {
                    stackIn_231_0 = 0;
                    break L54;
                  } else {
                    stackIn_231_0 = 1;
                    break L54;
                  }
                }
                L55: {
                  var30 = stackIn_231_0;
                  if (!var38.a(var23, 2097152, 2097152 + var24, 2097152, false, 2, (byte) 116)) {
                    stackIn_234_0 = 0;
                    break L55;
                  } else {
                    stackIn_234_0 = 1;
                    break L55;
                  }
                }
                L56: {
                  var31 = stackIn_234_0;
                  if (var28 == 0) {
                    if (var29 == 0) {
                      L57: {
                        if (var30 != 0) {
                          stackIn_247_0 = 1;
                          break L57;
                        } else {
                          if (var31 == 0) {
                            stackIn_247_0 = 0;
                            break L57;
                          } else {
                            stackIn_247_0 = 1;
                            break L57;
                          }
                        }
                      }
                      var32 = stackIn_247_0;
                      break L56;
                    } else {
                      stackIn_241_0 = 1;
                      var32 = stackIn_241_0;
                      break L56;
                    }
                  } else {
                    stackIn_237_0 = 1;
                    var32 = stackIn_237_0;
                    break L56;
                  }
                }
                L58: {
                  if (var32 == 0) {
                    break L58;
                  } else {
                    if (4 == var14.field_a) {
                      L59: {
                        if (var28 != 0) {
                          if (var27 != 7) {
                            if (5 != var27) {
                              break L59;
                            } else {
                              var14.field_a = 12;
                              var26 = 1024;
                              break L59;
                            }
                          } else {
                            var26 = 0;
                            var14.field_a = 11;
                            break L59;
                          }
                        } else {
                          break L59;
                        }
                      }
                      if (var29 == 0) {
                        break L58;
                      } else {
                        if (-2 != (var27 ^ -1)) {
                          if (3 != var27) {
                            break L58;
                          } else {
                            var26 = 1024;
                            var14.field_a = 11;
                            break L58;
                          }
                        } else {
                          var26 = 0;
                          var14.field_a = 12;
                          break L58;
                        }
                      }
                    } else {
                      break L58;
                    }
                  }
                }
                L60: {
                  var14.field_o = dfa.a(var26 + bl.field_c[var14.field_a], 2048, 120);
                  var14.field_i = var27;
                  var14.field_f = var10 + -var9;
                  var14.field_l = var12 + -var8;
                  var14.field_g = (lma) (this);
                  if (this.field_y != 0) {
                    break L60;
                  } else {
                    var14.field_p = this.a(var10, var12, param0 + -2097153, var14);
                    var14.field_d = this.b(var14, (byte) -94);
                    break L60;
                  }
                }
                L61: {
                  if (var7 == 0) {
                    L62: {
                      if (var21 == 0) {
                        break L62;
                      } else {
                        if (var19 == 0) {
                          break L62;
                        } else {
                          stackIn_273_0 = 0;
                          break L61;
                        }
                      }
                    }
                    if (!var38.a(var23 - 2097152, 2097152, var24 + -2097152, 2097152, true, 0, (byte) 98)) {
                      stackIn_273_0 = 0;
                      break L61;
                    } else {
                      stackIn_273_0 = 1;
                      break L61;
                    }
                  } else {
                    stackIn_273_0 = 0;
                    break L61;
                  }
                }
                L63: {
                  var33 = stackIn_273_0;
                  if (var7 == 0) {
                    L64: {
                      if (var21 == 0) {
                        break L64;
                      } else {
                        if (var20 == 0) {
                          break L64;
                        } else {
                          stackIn_282_0 = 0;
                          break L63;
                        }
                      }
                    }
                    if (!var38.a(2097152 + var23, 2097152, -2097152 + var24, 2097152, true, 0, (byte) 79)) {
                      stackIn_282_0 = 0;
                      break L63;
                    } else {
                      stackIn_282_0 = 1;
                      break L63;
                    }
                  } else {
                    stackIn_282_0 = 0;
                    break L63;
                  }
                }
                L65: {
                  var34 = stackIn_282_0;
                  if (var7 == 0) {
                    L66: {
                      if (var22 == 0) {
                        break L66;
                      } else {
                        if (var19 == 0) {
                          break L66;
                        } else {
                          stackIn_291_0 = 0;
                          break L65;
                        }
                      }
                    }
                    if (!var38.a(var23 - 2097152, 2097152, 2097152 + var24, 2097152, true, 0, (byte) -88)) {
                      stackIn_291_0 = 0;
                      break L65;
                    } else {
                      stackIn_291_0 = 1;
                      break L65;
                    }
                  } else {
                    stackIn_291_0 = 0;
                    break L65;
                  }
                }
                L67: {
                  var35 = stackIn_291_0;
                  if (var7 == 0) {
                    L68: {
                      if (var22 == 0) {
                        break L68;
                      } else {
                        if (var20 == 0) {
                          break L68;
                        } else {
                          stackIn_300_0 = 0;
                          break L67;
                        }
                      }
                    }
                    if (!var38.a(var23 + 2097152, 2097152, 2097152 + var24, 2097152, true, 0, (byte) 117)) {
                      stackIn_300_0 = 0;
                      break L67;
                    } else {
                      stackIn_300_0 = 1;
                      break L67;
                    }
                  } else {
                    stackIn_300_0 = 0;
                    break L67;
                  }
                }
                var36 = stackIn_300_0;
                var12 = var12 + 2097152;
                var14.a(var33 != 0, (byte) 24, var34 != 0, var36 != 0, var35 != 0);
                var13++;
                continue L1;
              }
            }
          }
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
            int var3_int = -57 / ((param0 - -8) / 40);
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
        boolean[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        boolean[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int var2;
        la var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        fh var12;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        boolean[][] var23;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          if (param0 == 32166) {
            break L0;
          } else {
            this.l(-80);
            break L0;
          }
        }
        var2 = this.k(param0 ^ 32172) ? 1 : 0;
        var3 = this.a(param0 + -32121);
        var4 = 4194304;
        var5 = this.field_h.d(3);
        var6 = this.field_h.e(9648);
        var10 = 0;
        L1: while (true) {
          if (var10 >= this.field_q) {
            return;
          } else {
            var11 = 0;
            L2: while (true) {
              if (this.field_w <= var11) {
                var10++;
                continue L1;
              } else {
                var12 = this.field_x[var10][var11];
                if (-6 == (var12.field_a ^ -1)) {
                  L3: {
                    var8 = var12.field_f + var6;
                    var7 = var5 - -var12.field_l;
                    var9 = 0;
                    var23 = new boolean[5][5];
                    var14 = 0;
                    if (var2 != 0) {
                      var15 = 0;
                      L4: while (true) {
                        if ((var15 ^ -1) <= -6) {
                          break L3;
                        } else {
                          var16 = 0;
                          L5: while (true) {
                            if (5 <= var16) {
                              var15++;
                              continue L4;
                            } else {
                              L6: {
                                if (var15 == 0) {
                                  break L6;
                                } else {
                                  if (-1 == (var16 ^ -1)) {
                                    break L6;
                                  } else {
                                    if (var15 == 4) {
                                      break L6;
                                    } else {
                                      if (-5 == (var16 ^ -1)) {
                                        break L6;
                                      } else {
                                        var16++;
                                        continue L5;
                                      }
                                    }
                                  }
                                }
                              }
                              L7: {
                                L8: {
                                  var17 = var10 + (var15 - 2);
                                  var18 = var11 + (var16 + -2);
                                  stackIn_40_0 = var23[var15];

                                  stackIn_40_1 = var16;

                                  if (var17 < 0) {
                                    break L8;
                                  } else {
                                    stackIn_40_0 = (boolean[]) ((Object) stackIn_40_0);

                                    if (0 > var18) {
                                      break L8;
                                    } else {
                                      stackIn_40_0 = (boolean[]) ((Object) stackIn_40_0);

                                      if (this.field_q <= var17) {
                                        break L8;
                                      } else {
                                        stackIn_40_0 = (boolean[]) ((Object) stackIn_40_0);

                                        if (this.field_w <= var18) {
                                          break L8;
                                        } else {
                                          stackIn_41_0 = (boolean[]) ((Object) stackIn_40_0);
                                          stackIn_41_1 = stackIn_40_1;
                                          stackIn_41_2 = 1;
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackIn_41_0 = (boolean[]) ((Object) stackIn_40_0);
                                stackIn_41_1 = stackIn_40_1;
                                stackIn_41_2 = 0;
                                break L7;
                              }
                              stackIn_41_0[stackIn_41_1] = stackIn_41_2 != 0;
                              if (var23[var15][var16]) {
                                var14++;
                                var16++;
                                continue L5;
                              } else {
                                var16++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var15 = 0;
                      L9: while (true) {
                        if (-6 >= (var15 ^ -1)) {
                          var15 = 0;
                          L10: while (true) {
                            if (-4 >= (var15 ^ -1)) {
                              break L3;
                            } else {
                              L11: {
                                var16 = var15 - 1;
                                var23[0][1 + var15] = var3.a(-var4 + var7, 2097152, 2097152 * var16 + var8, 2097152, true, 0, (byte) -20);
                                if (var23[0][var15 - -1]) {
                                  var14++;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              var23[4][1 + var15] = var3.a(var7 + var4, 2097152, var8 - -(2097152 * var16), 2097152, true, 0, (byte) 88);
                              if (var23[4][var15 - -1]) {
                                var14++;
                                var15++;
                                continue L10;
                              } else {
                                var15++;
                                continue L10;
                              }
                            }
                          }
                        } else {
                          L12: {
                            var16 = -2 + var15;
                            var23[var15][0] = var3.a(var7 + 2097152 * var16, 2097152, -var4 + var8, 2097152, true, 0, (byte) -39);
                            if (!var23[var15][0]) {
                              break L12;
                            } else {
                              var14++;
                              break L12;
                            }
                          }
                          var23[var15][4] = var3.a(2097152 * var16 + var7, 2097152, var8 + var4, 2097152, true, 0, (byte) 91);
                          if (var23[var15][4]) {
                            var14++;
                            var15++;
                            continue L9;
                          } else {
                            var15++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (16 == var14) {
                      var12.field_a = 10;
                      break L13;
                    } else {
                      if (var14 != 15) {
                        if (11 <= var14) {
                          L14: {
                            if (!var23[1][0]) {
                              break L14;
                            } else {
                              if (!var23[2][0]) {
                                break L14;
                              } else {
                                if (var23[3][0]) {
                                  L15: {
                                    if (!var23[4][1]) {
                                      break L15;
                                    } else {
                                      if (!var23[4][2]) {
                                        break L15;
                                      } else {
                                        if (!var23[4][3]) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if (!var23[1][4]) {
                                              break L16;
                                            } else {
                                              if (!var23[2][4]) {
                                                break L16;
                                              } else {
                                                if (!var23[3][4]) {
                                                  break L16;
                                                } else {
                                                  L17: {
                                                    if (!var23[0][1]) {
                                                      break L17;
                                                    } else {
                                                      if (!var23[0][2]) {
                                                        break L17;
                                                      } else {
                                                        if (var23[0][3]) {
                                                          break L13;
                                                        } else {
                                                          break L17;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var12.field_a = 7;
                                                  var9 = -512;
                                                  break L13;
                                                }
                                              }
                                            }
                                          }
                                          var9 = 1024;
                                          var12.field_a = 7;
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                  var12.field_a = 7;
                                  var9 = 512;
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var12.field_a = 7;
                          var9 = 0;
                          break L13;
                        } else {
                          if (-6 >= (var14 ^ -1)) {
                            L18: {
                              if (var23[0][0]) {
                                break L18;
                              } else {
                                if (var23[1][0]) {
                                  break L18;
                                } else {
                                  if (var23[0][1]) {
                                    break L18;
                                  } else {
                                    var9 = 0;
                                    var12.field_a = 8;
                                    break L13;
                                  }
                                }
                              }
                            }
                            L19: {
                              if (var23[4][0]) {
                                break L19;
                              } else {
                                if (var23[3][0]) {
                                  break L19;
                                } else {
                                  if (var23[4][1]) {
                                    break L19;
                                  } else {
                                    var9 = 512;
                                    var12.field_a = 8;
                                    break L13;
                                  }
                                }
                              }
                            }
                            L20: {
                              if (var23[4][4]) {
                                break L20;
                              } else {
                                if (var23[4][3]) {
                                  break L20;
                                } else {
                                  if (var23[3][4]) {
                                    break L20;
                                  } else {
                                    var9 = 1024;
                                    var12.field_a = 8;
                                    break L13;
                                  }
                                }
                              }
                            }
                            if (var23[0][4]) {
                              break L13;
                            } else {
                              if (var23[1][4]) {
                                break L13;
                              } else {
                                if (var23[0][1]) {
                                  break L13;
                                } else {
                                  var12.field_a = 8;
                                  var9 = -512;
                                  break L13;
                                }
                              }
                            }
                          } else {
                            var12.field_o = var9 + bl.field_c[var12.field_a];
                            var12.field_d = 0;
                            var12.field_p = 0;
                            var11++;
                            continue L2;
                          }
                        }
                      } else {
                        if (var23[0][0]) {
                          if (!var23[4][0]) {
                            var12.field_a = 9;
                            var9 = -512;
                            break L13;
                          } else {
                            if (!var23[4][4]) {
                              var9 = 0;
                              var12.field_a = 9;
                              break L13;
                            } else {
                              if (var23[0][4]) {
                                break L13;
                              } else {
                                var9 = 512;
                                var12.field_a = 9;
                                break L13;
                              }
                            }
                          }
                        } else {
                          var12.field_a = 9;
                          var9 = 1024;
                          break L13;
                        }
                      }
                    }
                  }
                  var12.field_o = var9 + bl.field_c[var12.field_a];
                  var12.field_d = 0;
                  var12.field_p = 0;
                  var11++;
                  continue L2;
                } else {
                  var11++;
                  continue L2;
                }
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
