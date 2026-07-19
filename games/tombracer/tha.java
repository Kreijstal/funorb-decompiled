/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tha extends b implements tsa {
    static String field_A;
    static String field_B;
    private rj field_x;
    private rj field_z;
    private rj field_w;
    static String field_y;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_i - -param0;
        int var6 = param1 + this.field_n;
        int discarded$0 = mj.field_J.a(bb.field_q, var5 - -20, 20 + var6, -40 + this.field_m, -50 + this.field_p, 16777215, -1, 1, param2, mj.field_J.field_w);
        super.a(param0, param1, 0, param3);
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        double var1_double = 0.0;
        int var3 = 0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16_double = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double var18_double = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (cla.field_m == null) {
              L1: {
                cla.field_m = new int[65536];
                var1_double = 0.7 + (Math.random() * 0.03 - 0.015);
                var3 = 0;
                if (param0 == 906) {
                  break L1;
                } else {
                  field_y = (String) null;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  if (-65537 >= (var3 ^ -1)) {
                    break L3;
                  } else {
                    var4 = (double)(63 & var3 >> 606609290) / 64.0 + 0.0078125;
                    var6 = 0.0625 + (double)((var3 & 906) >> -1180551865) / 8.0;
                    var8 = (double)(127 & var3) / 128.0;
                    var10 = var8;
                    var12 = var8;
                    var14 = var8;
                    if (var26 == 0) {
                      L4: {
                        if (var6 != 0.0) {
                          L5: {
                            L6: {
                              if (var8 >= 0.5) {
                                break L6;
                              } else {
                                var16_double = (1.0 + var6) * var8;
                                if (var26 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var16_double = -(var8 * var6) + (var6 + var8);
                            break L5;
                          }
                          L7: {
                            var18_double = 2.0 * var8 - var16_double;
                            var20 = var4 + 0.3333333333333333;
                            if (var20 > 1.0) {
                              var20 = var20 - 1.0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            var22 = var4;
                            var24 = -0.3333333333333333 + var4;
                            if (var24 < 0.0) {
                              var24 = var24 + 1.0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            L10: {
                              if (1.0 <= var22 * 6.0) {
                                break L10;
                              } else {
                                var12 = var22 * (6.0 * (-var18_double + var16_double)) + var18_double;
                                if (var26 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (1.0 <= 2.0 * var22) {
                                break L11;
                              } else {
                                var12 = var16_double;
                                if (var26 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (2.0 <= 3.0 * var22) {
                                break L12;
                              } else {
                                var12 = var18_double + 6.0 * ((-var22 + 0.6666666666666666) * (var16_double - var18_double));
                                if (var26 == 0) {
                                  break L9;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var12 = var18_double;
                            break L9;
                          }
                          L13: {
                            L14: {
                              if (1.0 <= var20 * 6.0) {
                                break L14;
                              } else {
                                var10 = var18_double + (-var18_double + var16_double) * 6.0 * var20;
                                if (var26 == 0) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            L15: {
                              if (1.0 <= var20 * 2.0) {
                                break L15;
                              } else {
                                var10 = var16_double;
                                if (var26 == 0) {
                                  break L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L16: {
                              if (3.0 * var20 >= 2.0) {
                                break L16;
                              } else {
                                var10 = 6.0 * ((0.6666666666666666 - var20) * (-var18_double + var16_double)) + var18_double;
                                if (var26 == 0) {
                                  break L13;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var10 = var18_double;
                            break L13;
                          }
                          L17: {
                            if (1.0 <= var24 * 6.0) {
                              break L17;
                            } else {
                              var14 = (var16_double - var18_double) * 6.0 * var24 + var18_double;
                              if (var26 == 0) {
                                break L4;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            if (1.0 > var24 * 2.0) {
                              break L18;
                            } else {
                              L19: {
                                if (2.0 > 3.0 * var24) {
                                  break L19;
                                } else {
                                  var14 = var18_double;
                                  if (var26 == 0) {
                                    break L4;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              var14 = (-var18_double + var16_double) * (0.6666666666666666 - var24) * 6.0 + var18_double;
                              if (var26 == 0) {
                                break L4;
                              } else {
                                break L18;
                              }
                            }
                          }
                          var14 = var16_double;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var10 = Math.pow(var10, var1_double);
                      var12 = Math.pow(var12, var1_double);
                      var14 = Math.pow(var14, var1_double);
                      var16 = (int)(256.0 * var10);
                      var17 = (int)(var12 * 256.0);
                      var18 = (int)(var14 * 256.0);
                      var19 = (var17 << -2052617368) + (var16 << -871645136) - -var18;
                      cla.field_m[var3] = var19;
                      var3++;
                      if (var26 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "tha.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public tha() {
        super(0, 0, 476, 225, (isa) null);
        this.field_z = new rj(foa.field_a, (qc) null);
        this.field_w = new rj(kda.field_gd, (qc) null);
        this.field_x = new rj(fca.field_d, (qc) null);
        td var1 = new td();
        this.field_z.field_r = (isa) ((Object) var1);
        this.field_w.field_r = (isa) ((Object) var1);
        this.field_x.field_r = (isa) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> 1445643489;
        this.field_w.a((byte) -31, var4, 30, this.field_m + -var3 >> -969403679, -var2 + (this.field_p + -48));
        this.field_x.a((byte) -31, var4, 30, var4 + (-var3 + this.field_m >> -240427839) + var2, -var2 + this.field_p - 48);
        this.field_z.a((byte) -31, var3, 30, this.field_m - var3 >> 231575233, this.field_p + (-78 + -(var2 * 2)));
        this.field_w.field_h = (qc) (this);
        this.field_z.field_h = (qc) (this);
        this.field_z.field_q = hga.field_n;
        this.field_x.field_h = (qc) (this);
        this.field_x.field_q = tg.field_a;
        this.a(this.field_w, -1);
        this.a(this.field_z, -1);
        this.a(this.field_x, -1);
    }

    public static void c(int param0) {
        int var1 = -116 % ((43 - param0) / 38);
        field_y = null;
        field_B = null;
        field_A = null;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 >= 44) {
                break L1;
              } else {
                tha.a(-94);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2 != this.field_w) {
                  break L3;
                } else {
                  pn.f(-804227775);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (this.field_z == param2) {
                  break L4;
                } else {
                  if (this.field_x != param2) {
                    break L2;
                  } else {
                    aoa.b(true);
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              qfa.a((byte) 6);
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("tha.M(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param2 != 98) {
                if (param2 != 99) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = this.a(param1, (byte) -9);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = this.b(param1, (byte) -118);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("tha.P(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    static {
        field_B = "All games";
        field_y = "Machinegun";
        field_A = "You have died - but death is not the end. The room's traps will be reset and you'll start again from the entrance. You'll lose any treasure not yet banked.";
    }
}
