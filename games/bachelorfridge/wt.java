/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt extends k {
    private int field_o;
    private int field_w;
    private int field_l;
    static kv field_q;
    private int field_t;
    private int field_v;
    private int field_p;
    static uq field_n;
    private int field_r;
    private int field_s;
    static int field_u;
    static be[] field_m;
    static sba field_k;
    private int field_x;

    public wt() {
        super(1, false);
        this.field_w = 0;
        this.field_l = 0;
        this.field_x = 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8;
        L0: {
          var8 = BachelorFridge.field_y;
          if (param1 == 1) {
            break L0;
          } else {
            wt.a(19, -118, 72, -6, 50, -27, -99);
            break L0;
          }
        }
        L1: {
          L2: {
            if (eo.field_l > param5) {
              break L2;
            } else {
              if (pw.field_x < param0) {
                break L2;
              } else {
                if (an.field_q > param3) {
                  break L2;
                } else {
                  if (param4 <= ha.field_n) {
                    if (-2 != (param2 ^ -1)) {
                      cma.a(param4, param6, param5, param0, param2, 64, param3);
                      break L1;
                    } else {
                      cv.a(param6, param1 + 28849, param4, param5, param0, param3);
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          if (1 == param2) {
            nha.a(param6, param4, param3, true, param5, param0);
            break L1;
          } else {
            faa.a(param6, param0, param5, 14040, param4, param3, param2);
            break L1;
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = BachelorFridge.field_y;
          if (param3 > param1) {
            stackIn_3_0 = param3;
            break L0;
          } else {
            stackIn_3_0 = param1;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        if (param2 >= 34) {
          L1: {
            if (var5 < param0) {
              stackIn_8_0 = param0;
              break L1;
            } else {
              stackIn_8_0 = var5;
              break L1;
            }
          }
          L2: {
            var5 = stackIn_8_0;
            if (param1 > param3) {
              stackIn_11_0 = param3;
              break L2;
            } else {
              stackIn_11_0 = param1;
              break L2;
            }
          }
          L3: {
            var6 = stackIn_11_0;
            if (var6 <= param0) {
              stackIn_14_0 = var6;
              break L3;
            } else {
              stackIn_14_0 = param0;
              break L3;
            }
          }
          L4: {
            L5: {
              var6 = stackIn_14_0;
              var7 = -var6 + var5;
              this.field_s = (var6 - -var5) / 2;
              if (0 >= this.field_s) {
                break L5;
              } else {
                if (this.field_s < 4096) {
                  L6: {
                    stackIn_20_0 = this;

                    stackIn_20_1 = var7 << 947193004;

                    if (this.field_s > 2048) {
                      stackIn_21_0 = this;
                      stackIn_21_1 = stackIn_20_1;
                      stackIn_21_2 = 8192 - 2 * this.field_s;
                      break L6;
                    } else {
                      stackIn_21_0 = this;
                      stackIn_21_1 = stackIn_20_1;
                      stackIn_21_2 = 2 * this.field_s;
                      break L6;
                    }
                  }
                  ((wt) (this)).field_v = stackIn_21_1 / stackIn_21_2;
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            this.field_v = 0;
            break L4;
          }
          L7: {
            if (var7 > 0) {
              L8: {
                var8 = (-param3 + var5 << 1513190188) / var7;
                var9 = (-param1 + var5 << -1815068692) / var7;
                var10 = (-param0 + var5 << -817945908) / var7;
                if (var5 != param3) {
                  if (param1 != var5) {
                    L9: {
                      stackIn_36_0 = this;

                      if (var6 != param3) {
                        stackIn_37_0 = this;
                        stackIn_37_1 = -var8 + 20480;
                        break L9;
                      } else {
                        stackIn_37_0 = this;
                        stackIn_37_1 = var9 + 12288;
                        break L9;
                      }
                    }
                    ((wt) (this)).field_o = stackIn_37_1;
                    break L8;
                  } else {
                    L10: {
                      stackIn_32_0 = this;

                      if (var6 == param0) {
                        stackIn_33_0 = this;
                        stackIn_33_1 = var8 + 4096;
                        break L10;
                      } else {
                        stackIn_33_0 = this;
                        stackIn_33_1 = -var10 + 12288;
                        break L10;
                      }
                    }
                    ((wt) (this)).field_o = stackIn_33_1;
                    break L8;
                  }
                } else {
                  L11: {
                    stackIn_27_0 = this;

                    if (var6 == param1) {
                      stackIn_28_0 = this;
                      stackIn_28_1 = var10 + 20480;
                      break L11;
                    } else {
                      stackIn_28_0 = this;
                      stackIn_28_1 = -var9 + 4096;
                      break L11;
                    }
                  }
                  ((wt) (this)).field_o = stackIn_28_1;
                  break L8;
                }
              }
              this.field_o = this.field_o / 6;
              break L7;
            } else {
              this.field_o = 0;
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_m = null;
        field_n = null;
        if (param0 != 19564) {
            return;
        }
        field_q = null;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if (-2 == (var4_int ^ -1)) {
                  this.field_w = (param1.b(true) << -292594420) / 100;
                  break L1;
                } else {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    this.field_l = (param1.b(true) << -746073012) / 100;
                    break L1;
                  }
                }
              } else {
                this.field_x = param1.c((byte) -85);
                break L1;
              }
            }
            L2: {
              if (param0 == -71) {
                break L2;
              } else {
                this.field_o = -52;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("wt.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        L0: {
          var14 = BachelorFridge.field_y;
          if (-2049 > (param1 ^ -1)) {
            stackIn_3_0 = -(param3 * param1 >> 1922136044) + (param3 + param1);
            break L0;
          } else {
            stackIn_3_0 = (4096 + param3) * param1 >> 313689132;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (-1 > (var5 ^ -1)) {
            param2 = param2 * 6;
            var6 = param1 + (param1 + -var5);
            var7 = (-var6 + var5 << 1032097644) / var5;
            var8 = param2 >> -1987751796;
            var9 = param2 + -(var8 << 2053629996);
            var10 = var5;
            var10 = var7 * var10 >> 552141964;
            var10 = var9 * var10 >> -2084117524;
            var11 = var10 + var6;
            var12 = -var10 + var5;
            var13 = var8;
            if (var13 == 0) {
              this.field_p = var5;
              this.field_r = var11;
              this.field_t = var6;
              break L1;
            } else {
              if ((var13 ^ -1) == -2) {
                this.field_p = var12;
                this.field_r = var5;
                this.field_t = var6;
                break L1;
              } else {
                if ((var13 ^ -1) != -3) {
                  if (var13 != 3) {
                    if (var13 == 4) {
                      this.field_p = var11;
                      this.field_r = var6;
                      this.field_t = var5;
                      break L1;
                    } else {
                      if (-6 != (var13 ^ -1)) {
                        break L1;
                      } else {
                        this.field_t = var12;
                        this.field_r = var6;
                        this.field_p = var5;
                        break L1;
                      }
                    }
                  } else {
                    this.field_t = var5;
                    this.field_p = var6;
                    this.field_r = var12;
                    break L1;
                  }
                } else {
                  this.field_p = var6;
                  this.field_r = var5;
                  this.field_t = var11;
                  break L1;
                }
              }
            }
          } else {
            this.field_t = param1;
            this.field_r = param1;
            this.field_p = param1;
            break L1;
          }
        }
        L2: {
          if (param0 == -6) {
            break L2;
          } else {
            field_m = (be[]) null;
            break L2;
          }
        }
    }

    final static void b(int param0, int param1) {
        pf var2 = sja.field_fb;
        var2.c(param1, (byte) 109);
        var2.d(1, 0);
        if (param0 != -22908) {
            field_m = (be[]) null;
        }
        var2.d(1, 0);
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[][] var28;
        int[] var29;
        int[] var30;
        int[] var31;
        L0: {
          var12 = BachelorFridge.field_y;
          if (!param0) {
            break L0;
          } else {
            wt.b(86, -47);
            break L0;
          }
        }
        L1: {
          var20 = this.field_h.a(param1, -858);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (!this.field_h.field_b) {
            break L1;
          } else {
            var28 = this.a((byte) -77, 0, param1);
            var31 = var28[0];
            var30 = var28[1];
            var29 = var28[2];
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            var11 = 0;
            L2: while (true) {
              if (var11 >= hh.field_d) {
                break L1;
              } else {
                this.a(var29[var11], var30[var11], (byte) 127, var31[var11]);
                this.field_v = this.field_v + this.field_w;
                this.field_o = this.field_o + this.field_x;
                this.field_s = this.field_s + this.field_l;
                L3: while (true) {
                  if (this.field_o >= 0) {
                    L4: while (true) {
                      if ((this.field_o ^ -1) >= -4097) {
                        L5: {
                          if ((this.field_v ^ -1) > -1) {
                            this.field_v = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (this.field_s < 0) {
                            this.field_s = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (-4097 <= (this.field_v ^ -1)) {
                            break L7;
                          } else {
                            this.field_v = 4096;
                            break L7;
                          }
                        }
                        L8: {
                          if (this.field_s > 4096) {
                            this.field_s = 4096;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        this.a(-6, this.field_s, this.field_o, this.field_v);
                        var8[var11] = this.field_p;
                        var9[var11] = this.field_r;
                        var10[var11] = this.field_t;
                        var11++;
                        continue L2;
                      } else {
                        this.field_o = this.field_o - 4096;
                        continue L4;
                      }
                    }
                  } else {
                    this.field_o = this.field_o + 4096;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    static {
        field_m = new be[6];
    }
}
