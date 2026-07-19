/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends pj {
    private hj field_G;
    private int field_A;
    static String field_C;
    private int field_y;
    static int[] field_B;
    private int field_K;
    private hj[] field_E;
    private int field_H;
    int field_J;
    private hj field_F;
    boolean field_z;
    private hj field_L;
    private int field_x;
    private int field_D;

    dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -21701087 & 8355711, (16711422 & param6) >> -1972298943);
    }

    private final void a(int param0, int param1, int param2, hj param3) {
        hj discarded$1 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_m + param2;
              id.a(-this.field_L.field_o + var5_int, param2 + this.field_L.field_o, this.field_r + param1, param1, 734);
              var6 = param2 + -this.field_A;
              if (param0 > 100) {
                break L1;
              } else {
                discarded$1 = this.i(114);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var6 >= var5_int) {
                  oc.g((byte) -105);
                  break L3;
                } else {
                  param3.c(var6, param1);
                  var6 = var6 + param3.field_o;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              L4: {
                if (this.field_L.field_o + param2 < ul.field_i) {
                  break L4;
                } else {
                  de.a(-128, this.field_G);
                  param3.c(-this.field_A, 0);
                  param3.c(-this.field_A + 2 * this.field_D, 0);
                  this.field_F.e(0, 0);
                  oc.g((byte) -105);
                  this.field_G.c(param2, param1);
                  break L4;
                }
              }
              if (ul.field_e >= -this.field_L.field_o + var5_int) {
                de.a(-127, this.field_G);
                var7 = this.field_A + this.field_m + -this.field_L.field_o;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (this.field_D * 2 >= var7) {
                        break L7;
                      } else {
                        var7 = var7 - 2 * this.field_D;
                        if (var8 != 0) {
                          break L6;
                        } else {
                          if (var8 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    param3.c(-var7, 0);
                    param3.c(-var7 + 2 * this.field_D, 0);
                    this.field_L.e(0, 0);
                    oc.g((byte) -105);
                    break L6;
                  }
                  this.field_G.c(var5_int + -this.field_L.field_o, param1);
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("dg.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 113) {
            dg.a((byte) -26);
            field_C = null;
            field_B = null;
            return;
        }
        field_C = null;
        field_B = null;
    }

    private final hj i(int param0) {
        int var2 = 0;
        hj var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        var9 = OrbDefence.field_D ? 1 : 0;
        var2 = this.field_r >> 368752481;
        var3 = new hj(var2, this.field_r);
        if (param0 < 33) {
          return (hj) null;
        } else {
          de.a(-125, var3);
          var4 = 0;
          L0: while (true) {
            stackOut_2_0 = var4;
            stackIn_3_0 = stackOut_2_0;
            L1: while (true) {
              L2: {
                L3: {
                  if (stackIn_3_0 >= this.field_r) {
                    break L3;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_17_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var5 = stackIn_5_0;
                      L4: while (true) {
                        if (var5 >= var2) {
                          var4++;
                          if (var9 == 0) {
                            continue L0;
                          } else {
                            break L3;
                          }
                        } else {
                          var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_r));
                          var8 = 1;
                          stackOut_7_0 = (1.0 < var6 ? -1 : (1.0 == var6 ? 0 : 1));
                          stackIn_3_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (var9 != 0) {
                            continue L1;
                          } else {
                            L5: {
                              if (stackIn_8_0 > 0) {
                                L6: {
                                  var6 = Math.sqrt(-var6 + 1.0);
                                  if (var6 >= 1.0) {
                                    stackOut_12_0 = 255;
                                    stackIn_13_0 = stackOut_12_0;
                                    break L6;
                                  } else {
                                    stackOut_11_0 = (int)(255.0 * var6);
                                    stackIn_13_0 = stackOut_11_0;
                                    break L6;
                                  }
                                }
                                var8 = stackIn_13_0;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            ul.a(var5, var4, var8 << 200392840 | var8 | var8 << 1723690512);
                            var5++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_16_0 = -105;
                stackIn_17_0 = stackOut_16_0;
                break L2;
              }
              oc.g((byte) stackIn_17_0);
              return var3;
            }
          }
        }
    }

    private final hj a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hj var15 = null;
        hj var16 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        var13 = OrbDefence.field_D ? 1 : 0;
        if (param1 != -45) {
          this.field_J = 82;
          var15 = new hj(2 * this.field_D, this.field_r);
          de.a(-127, var15);
          var5 = this.field_r >> 110509729;
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var6 >= this.field_r) {
                  break L2;
                } else {
                  var7 = (var6 >> 1059469665) * (2 * this.field_D + -1) % (this.field_D * 2);
                  var8 = 16711935 & param0;
                  var9 = param0 & 65280;
                  var10 = var6 - var5;
                  var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
                  stackOut_15_0 = var11;
                  stackIn_24_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var13 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_16_0 < 256) {
                        stackOut_18_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 1637544392;
                        stackIn_19_0 = stackOut_18_0;
                        break L3;
                      } else {
                        stackOut_17_0 = var9 | var8;
                        stackIn_19_0 = stackOut_17_0;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_19_0;
                      ul.d(var7, var6, this.field_D, var12);
                      ul.d(-(this.field_D * 2) + var7, var6, this.field_D, var12);
                      var8 = 16711935 & param2;
                      var9 = 65280 & param2;
                      if (256 <= var11) {
                        stackOut_21_0 = var9 | var8;
                        stackIn_22_0 = stackOut_21_0;
                        break L4;
                      } else {
                        stackOut_20_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> -1927424632;
                        stackIn_22_0 = stackOut_20_0;
                        break L4;
                      }
                    }
                    var12 = stackIn_22_0;
                    ul.d(this.field_D + var7, var6, this.field_D, var12);
                    ul.d(var7 + -this.field_D, var6, this.field_D, var12);
                    var6++;
                    if (var13 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_23_0 = -105;
              stackIn_24_0 = stackOut_23_0;
              break L1;
            }
            oc.g((byte) stackIn_24_0);
            return var15;
          }
        } else {
          var16 = new hj(2 * this.field_D, this.field_r);
          de.a(-127, var16);
          var5 = this.field_r >> 110509729;
          var6 = 0;
          L5: while (true) {
            L6: {
              L7: {
                if (var6 >= this.field_r) {
                  break L7;
                } else {
                  var7 = (var6 >> 1059469665) * (2 * this.field_D + -1) % (this.field_D * 2);
                  var8 = 16711935 & param0;
                  var9 = param0 & 65280;
                  var10 = var6 - var5;
                  var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
                  stackOut_3_0 = var11;
                  stackIn_12_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var13 != 0) {
                    break L6;
                  } else {
                    L8: {
                      if (stackIn_4_0 < 256) {
                        stackOut_6_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 1637544392;
                        stackIn_7_0 = stackOut_6_0;
                        break L8;
                      } else {
                        stackOut_5_0 = var9 | var8;
                        stackIn_7_0 = stackOut_5_0;
                        break L8;
                      }
                    }
                    L9: {
                      var12 = stackIn_7_0;
                      ul.d(var7, var6, this.field_D, var12);
                      ul.d(-(this.field_D * 2) + var7, var6, this.field_D, var12);
                      var8 = 16711935 & param2;
                      var9 = 65280 & param2;
                      if (256 <= var11) {
                        stackOut_9_0 = var9 | var8;
                        stackIn_10_0 = stackOut_9_0;
                        break L9;
                      } else {
                        stackOut_8_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> -1927424632;
                        stackIn_10_0 = stackOut_8_0;
                        break L9;
                      }
                    }
                    var12 = stackIn_10_0;
                    ul.d(this.field_D + var7, var6, this.field_D, var12);
                    ul.d(var7 + -this.field_D, var6, this.field_D, var12);
                    var6++;
                    if (var13 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              stackOut_11_0 = -105;
              stackIn_12_0 = stackOut_11_0;
              break L6;
            }
            oc.g((byte) stackIn_12_0);
            return var16;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.c(false);
    }

    final void a(int param0, int param1, int param2) {
        this.field_y = param1;
        this.field_H = param2 >> 1279763073 & 8355711;
        this.field_x = param2;
        this.field_K = (param1 & param0) >> -1024194527;
        this.c(false);
    }

    private final void c(boolean param0) {
        this.field_E = new hj[]{this.a(this.field_y, (byte) -45, this.field_x), this.a(this.field_K, (byte) -45, this.field_H)};
        this.field_L = this.i(90);
        if (param0) {
          this.field_y = -26;
          this.field_F = this.field_L.b();
          this.field_G = new hj(this.field_r >> -103743775, this.field_r);
          return;
        } else {
          this.field_F = this.field_L.b();
          this.field_G = new hj(this.field_r >> -103743775, this.field_r);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (0 == param1) {
          var5 = this.field_s + param3;
          var6 = param0 - -this.field_n;
          this.a(121, var6, var5, this.field_E[0]);
          if (param2 != 1048575) {
            return;
          } else {
            L0: {
              if (this.field_J < 65536) {
                id.a(var5 + this.field_m, (this.field_m * this.field_J >> -1169100496) + var5, var6 - -this.field_r, var6, 734);
                this.a(111, var6, var5, this.field_E[1]);
                oc.g((byte) -105);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_z) {
                break L1;
              } else {
                this.field_A = this.field_A + 1;
                if (this.field_A <= this.field_D * 2) {
                  break L1;
                } else {
                  this.field_A = this.field_A - 2 * this.field_D;
                  break L1;
                }
              }
            }
            if (param0 == -77) {
              break L0;
            } else {
              this.field_z = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("dg.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_H = param8;
        this.field_K = param7;
        this.field_x = param6;
        this.field_y = param5;
        this.field_D = param4;
        this.a(param0, param1, param3, (byte) -90, param2);
    }

    static {
        field_C = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_B = new int[8192];
    }
}
