/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends am {
    static String field_y;
    private int field_D;
    private byte[] field_s;
    private int field_A;
    private boolean field_B;
    private int field_u;
    private int field_C;
    private short[] field_t;
    static cf field_v;
    private int field_z;
    private short[] field_x;
    static int field_w;

    final static void a(int param0, String param1, t param2) {
        try {
            hf.field_a = param1;
            if (param0 >= -43) {
                t var4 = (t) null;
                rj.a(87, (String) null, (t) null);
            }
            jd.field_D = param2;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "rj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var18 = Torquing.field_u;
          var13 = param1 >> 1069143884;
          var12 = var13 + 1;
          var13 = var13 & 255;
          if (param0 > var12) {
            break L0;
          } else {
            var12 = 0;
            break L0;
          }
        }
        L1: {
          param1 = param1 & 4095;
          var10 = param2 - param5;
          var12 = var12 & 255;
          var11 = -4096 + param1;
          var15 = cf.field_a[param1];
          var14 = this.field_s[param4 + var13] & 3;
          if (-2 <= (var14 ^ -1)) {
            L2: {
              if (0 == var14) {
                stackOut_9_0 = param1 + param2;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = param2 - param1;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            var8 = stackIn_10_0;
            break L1;
          } else {
            L3: {
              if (2 == var14) {
                stackOut_5_0 = param1 - param2;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = -param2 + -param1;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            var8 = stackIn_6_0;
            break L1;
          }
        }
        L4: {
          var14 = 3 & this.field_s[var12 + param4];
          if ((var14 ^ -1) >= -2) {
            L5: {
              if (var14 == 0) {
                stackOut_18_0 = var11 + param2;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = -var11 + param2;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var9 = stackIn_19_0;
            break L4;
          } else {
            L6: {
              if (var14 != 2) {
                stackOut_14_0 = -var11 + -param2;
                stackIn_15_0 = stackOut_14_0;
                break L6;
              } else {
                stackOut_13_0 = var11 - param2;
                stackIn_15_0 = stackOut_13_0;
                break L6;
              }
            }
            var9 = stackIn_15_0;
            break L4;
          }
        }
        L7: {
          var14 = this.field_s[var13 + param6] & 3;
          var16 = var8 - -((-var8 + var9) * var15 >> -1648429556);
          if (-2 <= (var14 ^ -1)) {
            L8: {
              if (0 != var14) {
                stackOut_27_0 = -param1 + var10;
                stackIn_28_0 = stackOut_27_0;
                break L8;
              } else {
                stackOut_26_0 = var10 + param1;
                stackIn_28_0 = stackOut_26_0;
                break L8;
              }
            }
            var8 = stackIn_28_0;
            break L7;
          } else {
            L9: {
              if (var14 == 2) {
                stackOut_23_0 = -var10 + param1;
                stackIn_24_0 = stackOut_23_0;
                break L9;
              } else {
                stackOut_22_0 = -param1 - var10;
                stackIn_24_0 = stackOut_22_0;
                break L9;
              }
            }
            var8 = stackIn_24_0;
            break L7;
          }
        }
        L10: {
          var14 = 3 & this.field_s[var12 + param6];
          if (-2 <= (var14 ^ -1)) {
            L11: {
              if (var14 != 0) {
                stackOut_36_0 = -var11 + var10;
                stackIn_37_0 = stackOut_36_0;
                break L11;
              } else {
                stackOut_35_0 = var11 - -var10;
                stackIn_37_0 = stackOut_35_0;
                break L11;
              }
            }
            var9 = stackIn_37_0;
            break L10;
          } else {
            L12: {
              if (var14 != 2) {
                stackOut_32_0 = -var10 + -var11;
                stackIn_33_0 = stackOut_32_0;
                break L12;
              } else {
                stackOut_31_0 = -var10 + var11;
                stackIn_33_0 = stackOut_31_0;
                break L12;
              }
            }
            var9 = stackIn_33_0;
            break L10;
          }
        }
        var17 = var8 - -((-var8 + var9) * var15 >> 366825740);
        return var16 - -(param3 * (-var16 + var17) >> 82724012);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Torquing.field_u;
          this.field_s = i.b(10758, this.field_A);
          if (param0 > 123) {
            break L0;
          } else {
            this.field_s = (byte[]) null;
            break L0;
          }
        }
        this.a(false);
        var2 = -1 + this.field_C;
        L1: while (true) {
          L2: {
            if (var2 < 1) {
              break L2;
            } else {
              var3 = this.field_x[var2];
              if (-9 > (var3 ^ -1)) {
                break L2;
              } else {
                if ((var3 ^ -1) > 7) {
                  break L2;
                } else {
                  this.field_C = this.field_C - 1;
                  var2--;
                  continue L1;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(boolean param0) {
        int[] discarded$2 = null;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Torquing.field_u;
          if (!param0) {
            break L0;
          } else {
            discarded$2 = this.a((byte) -6, 28);
            break L0;
          }
        }
        L1: {
          if (0 >= this.field_z) {
            if (this.field_x == null) {
              break L1;
            } else {
              if (this.field_x.length != this.field_C) {
                break L1;
              } else {
                this.field_t = new short[this.field_C];
                var2 = 0;
                L2: while (true) {
                  if (this.field_C <= var2) {
                    break L1;
                  } else {
                    this.field_t[var2] = (short)(int)Math.pow(2.0, (double)var2);
                    var2++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            this.field_t = new short[this.field_C];
            this.field_x = new short[this.field_C];
            var2 = 0;
            L3: while (true) {
              if (this.field_C <= var2) {
                break L1;
              } else {
                this.field_x[var2] = (short)(int)(Math.pow((double)((float)this.field_z / 4096.0f), (double)var2) * 4096.0);
                this.field_t[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                continue L3;
              }
            }
          }
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var4 = this.field_l.a(param1, 25657);
        int[] var3 = var4;
        if (param0 < 86) {
            return (int[]) null;
        }
        if (!(!this.field_l.field_b)) {
            this.a(true, var4, param1);
        }
        return var4;
    }

    final void a(fj param0, int param1, int param2) {
        int dupTemp$1 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 == 35) {
                break L1;
              } else {
                this.field_A = 54;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (0 == var4_int) {
                L3: {
                  stackOut_15_0 = this;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (-2 != (param0.i((byte) -101) ^ -1)) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L3;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L3;
                  }
                }
                ((rj) (this)).field_B = stackIn_18_1 != 0;
                break L2;
              } else {
                if (-2 != (var4_int ^ -1)) {
                  if (var4_int != 2) {
                    if (3 != var4_int) {
                      if (var4_int == 4) {
                        this.field_A = param0.i((byte) -101);
                        break L2;
                      } else {
                        if ((var4_int ^ -1) != -6) {
                          if (-7 != (var4_int ^ -1)) {
                            break L2;
                          } else {
                            this.field_u = param0.i((byte) -101);
                            break L2;
                          }
                        } else {
                          this.field_D = param0.i((byte) -101);
                          break L2;
                        }
                      }
                    } else {
                      dupTemp$1 = param0.i((byte) -101);
                      this.field_u = dupTemp$1;
                      this.field_D = dupTemp$1;
                      break L2;
                    }
                  } else {
                    this.field_z = param0.g(65536);
                    if (0 > this.field_z) {
                      this.field_x = new short[this.field_C];
                      var4_int = 0;
                      L4: while (true) {
                        if (var4_int >= this.field_C) {
                          break L2;
                        } else {
                          this.field_x[var4_int] = (short)param0.g(65536);
                          var4_int++;
                          continue L4;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  this.field_C = param0.i((byte) -101);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("rj.H(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void g(byte param0) {
        field_v = null;
        if (param0 > -101) {
            rj.g((byte) 114);
        }
        field_y = null;
    }

    public rj() {
        super(0, true);
        this.field_s = new byte[512];
        this.field_u = 4;
        this.field_D = 4;
        this.field_C = 4;
        this.field_B = true;
        this.field_z = 1638;
        this.field_A = 0;
    }

    private final void a(boolean param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var19 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var5 = dp.field_a[param2] * this.field_u;
              if (this.field_C != 1) {
                L2: {
                  L3: {
                    var9 = this.field_x[0];
                    if (8 < var9) {
                      break L3;
                    } else {
                      if ((var9 ^ -1) > 7) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    var8 = this.field_t[0] << 1551860972;
                    var13 = var8 * this.field_u >> 1593468972;
                    var11 = var5 * var8 >> -61702484;
                    var12 = var8 * this.field_D >> 1318340172;
                    var15 = var11 >> 871351404;
                    var16 = var15 + 1;
                    var11 = var11 & 4095;
                    if (var16 >= var13) {
                      var16 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var17 = this.field_s[var15 & 255] & 255;
                  var14 = cf.field_a[var11];
                  var18 = 255 & this.field_s[var16 & 255];
                  var10 = 0;
                  L5: while (true) {
                    if (ci.field_c <= var10) {
                      break L2;
                    } else {
                      var4_int = q.field_b[var10] * this.field_D;
                      var6 = this.a(var12, var4_int * var8 >> 941357612, var11, var14, var17, 4096, var18);
                      param1[var10] = var6 * var9 >> -752552724;
                      var10++;
                      continue L5;
                    }
                  }
                }
                var7 = 1;
                L6: while (true) {
                  if (var7 >= this.field_C) {
                    break L1;
                  } else {
                    L7: {
                      L8: {
                        var9 = this.field_x[var7];
                        if (var9 > 8) {
                          break L8;
                        } else {
                          if ((var9 ^ -1) <= 7) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        var8 = this.field_t[var7] << -1719506260;
                        var13 = this.field_u * var8 >> 1118324332;
                        var11 = var5 * var8 >> 509101196;
                        var12 = var8 * this.field_D >> -911271124;
                        var15 = var11 >> -116070292;
                        var16 = var15 - -1;
                        if (var13 > var16) {
                          break L9;
                        } else {
                          var16 = 0;
                          break L9;
                        }
                      }
                      L10: {
                        var11 = var11 & 4095;
                        var14 = cf.field_a[var11];
                        var18 = 255 & this.field_s[var16 & 255];
                        var17 = this.field_s[255 & var15] & 255;
                        if (!this.field_B) {
                          break L10;
                        } else {
                          if (var7 == this.field_C - 1) {
                            var10 = 0;
                            L11: while (true) {
                              if (ci.field_c <= var10) {
                                break L7;
                              } else {
                                var4_int = this.field_D * q.field_b[var10];
                                var6 = this.a(var12, var8 * var4_int >> 974318124, var11, var14, var17, 4096, var18);
                                var6 = param1[var10] + (var6 * var9 >> -342902516);
                                param1[var10] = 2048 + (var6 >> 889352417);
                                var10++;
                                continue L11;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      var10 = 0;
                      L12: while (true) {
                        if (var10 >= ci.field_c) {
                          break L7;
                        } else {
                          var4_int = this.field_D * q.field_b[var10];
                          var6 = this.a(var12, var4_int * var8 >> 755956076, var11, var14, var17, 4096, var18);
                          param1[var10] = param1[var10] + (var6 * var9 >> -1021260244);
                          var10++;
                          continue L12;
                        }
                      }
                    }
                    var7++;
                    continue L6;
                  }
                }
              } else {
                L13: {
                  var9 = this.field_x[0];
                  var8 = this.field_t[0] << 1167408300;
                  var12 = var8 * this.field_D >> -1252166804;
                  var11 = var8 * var5 >> -2022822292;
                  var13 = var8 * this.field_u >> 719883052;
                  var15 = var11 >> -1696196404;
                  var16 = 1 + var15;
                  var11 = var11 & 4095;
                  if (var13 > var16) {
                    break L13;
                  } else {
                    var16 = 0;
                    break L13;
                  }
                }
                var14 = cf.field_a[var11];
                var17 = this.field_s[var15 & 255] & 255;
                var18 = this.field_s[var16 & 255] & 255;
                if (this.field_B) {
                  var10 = 0;
                  L14: while (true) {
                    if (ci.field_c <= var10) {
                      break L1;
                    } else {
                      var4_int = this.field_D * q.field_b[var10];
                      var6 = this.a(var12, var4_int * var8 >> 765020204, var11, var14, var17, 4096, var18);
                      var6 = var9 * var6 >> -149182324;
                      param1[var10] = (var6 >> -1055456991) + 2048;
                      var10++;
                      continue L14;
                    }
                  }
                } else {
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= ci.field_c) {
                      break L1;
                    } else {
                      var4_int = this.field_D * q.field_b[var10];
                      var6 = this.a(var12, var4_int * var8 >> 1245642956, var11, var14, var17, 4096, var18);
                      param1[var10] = var6 * var9 >> -1184587604;
                      var10++;
                      continue L15;
                    }
                  }
                }
              }
            }
            L16: {
              if (param0) {
                break L16;
              } else {
                this.a((byte) -49);
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var4);
            stackOut_40_1 = new StringBuilder().append("rj.C(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L17;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L17;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param2 + ')');
        }
    }

    static {
        field_v = new cf(16);
    }
}
