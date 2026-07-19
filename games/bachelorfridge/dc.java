/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends k {
    private int field_n;
    private short[] field_q;
    static String field_u;
    static qia field_k;
    static kv[] field_y;
    private boolean field_l;
    private short[] field_p;
    private byte[] field_s;
    private int field_x;
    private int field_v;
    static po field_r;
    private int field_t;
    private int field_w;
    static String field_o;
    static String field_m;

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (param0 >= 123) {
            break L0;
          } else {
            this.field_w = -41;
            break L0;
          }
        }
        L1: {
          if (-1 > (this.field_t ^ -1)) {
            this.field_q = new short[this.field_n];
            this.field_p = new short[this.field_n];
            var2 = 0;
            L2: while (true) {
              if (this.field_n <= var2) {
                break L1;
              } else {
                this.field_q[var2] = (short)(int)(4096.0 * Math.pow((double)((float)this.field_t / 4096.0f), (double)var2));
                this.field_p[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                continue L2;
              }
            }
          } else {
            if (this.field_q == null) {
              break L1;
            } else {
              if (this.field_q.length == this.field_n) {
                this.field_p = new short[this.field_n];
                var2 = 0;
                L3: while (true) {
                  if (this.field_n <= var2) {
                    break L1;
                  } else {
                    this.field_p[var2] = (short)(int)Math.pow(2.0, (double)var2);
                    var2++;
                    continue L3;
                  }
                }
              } else {
                break L1;
              }
            }
          }
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
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        L0: {
          var18 = BachelorFridge.field_y;
          var13 = param0 >> -846689940;
          var12 = 1 + var13;
          var13 = var13 & 255;
          param0 = param0 & 4095;
          if (param1 <= var12) {
            var12 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var10 = -4096 + param5;
          var12 = var12 & 255;
          var11 = -4096 + param0;
          var14 = this.field_s[param4 + var13] & 3;
          var15 = pja.field_g[param0];
          if (param6 <= (var14 ^ -1)) {
            L2: {
              if (var14 != 0) {
                stackOut_10_0 = -param0 + param5;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                stackOut_9_0 = param5 + param0;
                stackIn_11_0 = stackOut_9_0;
                break L2;
              }
            }
            var8 = stackIn_11_0;
            break L1;
          } else {
            L3: {
              if (2 != var14) {
                stackOut_6_0 = -param5 + -param0;
                stackIn_7_0 = stackOut_6_0;
                break L3;
              } else {
                stackOut_5_0 = param0 + -param5;
                stackIn_7_0 = stackOut_5_0;
                break L3;
              }
            }
            var8 = stackIn_7_0;
            break L1;
          }
        }
        L4: {
          var14 = 3 & this.field_s[var12 - -param4];
          if (var14 <= 1) {
            L5: {
              if (var14 != 0) {
                stackOut_19_0 = param5 - var11;
                stackIn_20_0 = stackOut_19_0;
                break L5;
              } else {
                stackOut_18_0 = param5 + var11;
                stackIn_20_0 = stackOut_18_0;
                break L5;
              }
            }
            var9 = stackIn_20_0;
            break L4;
          } else {
            L6: {
              if ((var14 ^ -1) != -3) {
                stackOut_15_0 = -var11 - param5;
                stackIn_16_0 = stackOut_15_0;
                break L6;
              } else {
                stackOut_14_0 = -param5 + var11;
                stackIn_16_0 = stackOut_14_0;
                break L6;
              }
            }
            var9 = stackIn_16_0;
            break L4;
          }
        }
        L7: {
          var14 = this.field_s[param3 + var13] & 3;
          var16 = ((var9 + -var8) * var15 >> -1675284564) + var8;
          if (1 >= var14) {
            L8: {
              if (0 != var14) {
                stackOut_28_0 = -param0 + var10;
                stackIn_29_0 = stackOut_28_0;
                break L8;
              } else {
                stackOut_27_0 = param0 + var10;
                stackIn_29_0 = stackOut_27_0;
                break L8;
              }
            }
            var8 = stackIn_29_0;
            break L7;
          } else {
            L9: {
              if (var14 == 2) {
                stackOut_24_0 = -var10 + param0;
                stackIn_25_0 = stackOut_24_0;
                break L9;
              } else {
                stackOut_23_0 = -var10 + -param0;
                stackIn_25_0 = stackOut_23_0;
                break L9;
              }
            }
            var8 = stackIn_25_0;
            break L7;
          }
        }
        L10: {
          var14 = this.field_s[var12 - -param3] & 3;
          if (var14 <= 1) {
            L11: {
              if (var14 == 0) {
                stackOut_37_0 = var10 + var11;
                stackIn_38_0 = stackOut_37_0;
                break L11;
              } else {
                stackOut_36_0 = -var11 + var10;
                stackIn_38_0 = stackOut_36_0;
                break L11;
              }
            }
            var9 = stackIn_38_0;
            break L10;
          } else {
            L12: {
              if (var14 == 2) {
                stackOut_33_0 = -var10 + var11;
                stackIn_34_0 = stackOut_33_0;
                break L12;
              } else {
                stackOut_32_0 = -var10 + -var11;
                stackIn_34_0 = stackOut_32_0;
                break L12;
              }
            }
            var9 = stackIn_34_0;
            break L10;
          }
        }
        var17 = var8 - -(var15 * (var9 - var8) >> -1554506804);
        return var16 - -((var17 - var16) * param2 >> 559415052);
    }

    final void d(byte param0) {
        int discarded$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          this.field_s = rba.a(this.field_v, -123);
          this.d(param0 ^ -61);
          if (param0 == -68) {
            break L0;
          } else {
            discarded$2 = this.a(-16, -33, -101, 0, 61, 126, 106);
            break L0;
          }
        }
        var2 = this.field_n + -1;
        L1: while (true) {
          L2: {
            if (-2 < (var2 ^ -1)) {
              break L2;
            } else {
              var3 = this.field_q[var2];
              if (8 < var3) {
                break L2;
              } else {
                if (7 >= (var3 ^ -1)) {
                  this.field_n = this.field_n - 1;
                  var2--;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, int[] param1, int param2) {
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
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5 = tj.field_f[param2] * this.field_x;
              if (-2 != (this.field_n ^ -1)) {
                L2: {
                  L3: {
                    var9 = this.field_q[0];
                    if (var9 > 8) {
                      break L3;
                    } else {
                      if (var9 >= -8) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var8 = this.field_p[0] << -636852116;
                    var13 = var8 * this.field_x >> -2024477268;
                    var11 = var5 * var8 >> -178683988;
                    var12 = this.field_w * var8 >> 394667532;
                    var15 = var11 >> 1580070572;
                    var16 = var15 + 1;
                    var11 = var11 & 4095;
                    if (var16 >= var13) {
                      var16 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var14 = pja.field_g[var11];
                  var18 = this.field_s[var16 & 255] & 255;
                  var17 = this.field_s[var15 & 255] & 255;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= hh.field_d) {
                      break L2;
                    } else {
                      var4_int = this.field_w * jq.field_k[var10];
                      var6 = this.a(var4_int * var8 >> 242239020, var12, var14, var18, var17, var11, -2);
                      param1[var10] = var9 * var6 >> -965353140;
                      var10++;
                      continue L5;
                    }
                  }
                }
                var7 = 1;
                L6: while (true) {
                  if (this.field_n <= var7) {
                    break L1;
                  } else {
                    L7: {
                      L8: {
                        var9 = this.field_q[var7];
                        if (var9 > 8) {
                          break L8;
                        } else {
                          if (7 < (var9 ^ -1)) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        var8 = this.field_p[var7] << 1723766668;
                        var11 = var8 * var5 >> 973850412;
                        var12 = var8 * this.field_w >> 869754316;
                        var13 = var8 * this.field_x >> 325516684;
                        var15 = var11 >> -1363227060;
                        var16 = 1 + var15;
                        var11 = var11 & 4095;
                        if (var13 <= var16) {
                          var16 = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        var17 = this.field_s[var15 & 255] & 255;
                        var18 = 255 & this.field_s[var16 & 255];
                        var14 = pja.field_g[var11];
                        if (!this.field_l) {
                          break L10;
                        } else {
                          if (-1 + this.field_n != var7) {
                            break L10;
                          } else {
                            var10 = 0;
                            L11: while (true) {
                              if (var10 >= hh.field_d) {
                                break L7;
                              } else {
                                var4_int = this.field_w * jq.field_k[var10];
                                var6 = this.a(var4_int * var8 >> 2052760524, var12, var14, var18, var17, var11, -2);
                                var6 = (var9 * var6 >> -108303156) + param1[var10];
                                param1[var10] = 2048 + (var6 >> -998053087);
                                var10++;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L12: while (true) {
                        if (var10 >= hh.field_d) {
                          break L7;
                        } else {
                          var4_int = this.field_w * jq.field_k[var10];
                          var6 = this.a(var8 * var4_int >> 567739244, var12, var14, var18, var17, var11, -2);
                          param1[var10] = param1[var10] + (var9 * var6 >> 1277031180);
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
                  var8 = this.field_p[0] << -1903413940;
                  var9 = this.field_q[0];
                  var13 = var8 * this.field_x >> 814541772;
                  var12 = this.field_w * var8 >> 1926039724;
                  var11 = var8 * var5 >> -668885044;
                  var15 = var11 >> 601073740;
                  var16 = 1 + var15;
                  var11 = var11 & 4095;
                  if (var16 < var13) {
                    break L13;
                  } else {
                    var16 = 0;
                    break L13;
                  }
                }
                var18 = 255 & this.field_s[var16 & 255];
                var14 = pja.field_g[var11];
                var17 = this.field_s[255 & var15] & 255;
                if (this.field_l) {
                  var10 = 0;
                  L14: while (true) {
                    if (var10 >= hh.field_d) {
                      break L1;
                    } else {
                      var4_int = this.field_w * jq.field_k[var10];
                      var6 = this.a(var8 * var4_int >> 1419073260, var12, var14, var18, var17, var11, -2);
                      var6 = var9 * var6 >> -892290260;
                      param1[var10] = 2048 + (var6 >> 2067010241);
                      var10++;
                      continue L14;
                    }
                  }
                } else {
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= hh.field_d) {
                      break L1;
                    } else {
                      var4_int = jq.field_k[var10] * this.field_w;
                      var6 = this.a(var4_int * var8 >> 1750281036, var12, var14, var18, var17, var11, param0 + -257);
                      param1[var10] = var9 * var6 >> 78326796;
                      var10++;
                      continue L15;
                    }
                  }
                }
              }
            }
            L16: {
              if (param0 == 255) {
                break L16;
              } else {
                this.field_w = -73;
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
            stackOut_40_1 = new StringBuilder().append("dc.D(").append(param0).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param2 + ')');
        }
    }

    final int[] a(int param0, int param1) {
        int[] var4 = this.field_j.a(param0, param1 ^ -1);
        int[] var3 = var4;
        if (this.field_j.field_m) {
            this.a(255, var4, param0);
        }
        if (param1 != 0) {
            this.field_l = false;
        }
        return var4;
    }

    public static void b(boolean param0) {
        field_o = null;
        field_r = null;
        field_m = null;
        field_y = null;
        if (!param0) {
            return;
        }
        field_u = null;
        field_k = null;
    }

    final void a(byte param0, lu param1, int param2) {
        int dupTemp$1 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -71) {
                break L1;
              } else {
                this.field_n = -61;
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
                  if (-2 != (param1.b(16711935) ^ -1)) {
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
                ((dc) (this)).field_l = stackIn_18_1 != 0;
                break L2;
              } else {
                if (1 != var4_int) {
                  if ((var4_int ^ -1) == -3) {
                    this.field_t = param1.c((byte) -85);
                    if (0 <= this.field_t) {
                      break L2;
                    } else {
                      this.field_q = new short[this.field_n];
                      var4_int = 0;
                      L4: while (true) {
                        if (this.field_n <= var4_int) {
                          break L2;
                        } else {
                          this.field_q[var4_int] = (short)param1.c((byte) -85);
                          var4_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    if (var4_int != 3) {
                      if (-5 != (var4_int ^ -1)) {
                        if ((var4_int ^ -1) != -6) {
                          if ((var4_int ^ -1) == -7) {
                            this.field_x = param1.b(16711935);
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          this.field_w = param1.b(16711935);
                          break L2;
                        }
                      } else {
                        this.field_v = param1.b(param0 + 16712006);
                        break L2;
                      }
                    } else {
                      dupTemp$1 = param1.b(16711935);
                      this.field_x = dupTemp$1;
                      this.field_w = dupTemp$1;
                      break L2;
                    }
                  }
                } else {
                  this.field_n = param1.b(16711935);
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
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("dc.E(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
    }

    public dc() {
        super(0, true);
        this.field_n = 4;
        this.field_s = new byte[512];
        this.field_x = 4;
        this.field_l = true;
        this.field_v = 0;
        this.field_t = 1638;
        this.field_w = 4;
    }

    static {
        field_u = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_k = new qia();
        field_o = "***Failed!***";
    }
}
