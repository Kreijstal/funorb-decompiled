/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wsa extends ci {
    private int field_n;
    private int field_u;
    private int field_m;
    private int field_t;
    private int field_o;
    private int field_r;
    static su field_v;
    private int field_s;
    private int field_p;
    private int field_q;

    final int[][] b(int param0, int param1) {
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
        var12 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          L0: {
            var20 = this.field_h.a(param0, (byte) 109);
            var15 = var20;
            var13 = var15;
            var3 = var13;
            if (!this.field_h.field_f) {
              break L0;
            } else {
              var28 = this.a(param0, 0, -1);
              var30 = var28[0];
              var31 = var28[1];
              var29 = var28[2];
              var8 = var20[0];
              var9 = var20[1];
              var10 = var20[2];
              var11 = 0;
              L1: while (true) {
                if (var11 >= ns.field_g) {
                  break L0;
                } else {
                  this.b(2, var29[var11], var30[var11], var31[var11]);
                  this.field_m = this.field_m + this.field_o;
                  this.field_n = this.field_n + this.field_s;
                  this.field_p = this.field_p + this.field_u;
                  L2: while (true) {
                    if (-1 >= (this.field_m ^ -1)) {
                      L3: {
                        if (this.field_n < 0) {
                          this.field_n = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: while (true) {
                        if (this.field_m <= 4096) {
                          L5: {
                            if (-1 < (this.field_p ^ -1)) {
                              this.field_p = 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (this.field_n > 4096) {
                              this.field_n = 4096;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if (-4097 <= (this.field_p ^ -1)) {
                              break L7;
                            } else {
                              this.field_p = 4096;
                              break L7;
                            }
                          }
                          this.a(this.field_n, 27261, this.field_m, this.field_p);
                          var8[var11] = this.field_t;
                          var9[var11] = this.field_r;
                          var10[var11] = this.field_q;
                          var11++;
                          continue L1;
                        } else {
                          this.field_m = this.field_m - 4096;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_m = this.field_m + 4096;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    public wsa() {
        super(1, false);
        this.field_u = 0;
        this.field_o = 0;
        this.field_s = 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_5_0 = 0;
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
          var14 = TombRacer.field_G ? 1 : 0;
          if (param1 == 27261) {
            break L0;
          } else {
            wsa.c(81);
            break L0;
          }
        }
        L1: {
          if ((param3 ^ -1) >= -2049) {
            stackIn_5_0 = (param0 + 4096) * param3 >> -1518231540;
            break L1;
          } else {
            stackIn_5_0 = param0 + (param3 + -(param0 * param3 >> -434583892));
            break L1;
          }
        }
        L2: {
          var5 = stackIn_5_0;
          if (0 < var5) {
            param2 = param2 * 6;
            var6 = param3 + (param3 - var5);
            var7 = (var5 + -var6 << 936974060) / var5;
            var8 = param2 >> -2008380468;
            var9 = -(var8 << 2060287660) + param2;
            var10 = var5;
            var10 = var7 * var10 >> -1868965940;
            var10 = var9 * var10 >> 140021196;
            var11 = var6 + var10;
            var12 = var5 + -var10;
            var13 = var8;
            if (0 != var13) {
              if (-2 != (var13 ^ -1)) {
                if (var13 != 2) {
                  if ((var13 ^ -1) == -4) {
                    this.field_q = var5;
                    this.field_r = var12;
                    this.field_t = var6;
                    break L2;
                  } else {
                    if (4 == var13) {
                      this.field_r = var6;
                      this.field_t = var11;
                      this.field_q = var5;
                      break L2;
                    } else {
                      if (-6 != (var13 ^ -1)) {
                        break L2;
                      } else {
                        this.field_r = var6;
                        this.field_q = var12;
                        this.field_t = var5;
                        break L2;
                      }
                    }
                  }
                } else {
                  this.field_r = var5;
                  this.field_t = var6;
                  this.field_q = var11;
                  break L2;
                }
              } else {
                this.field_q = var6;
                this.field_t = var12;
                this.field_r = var5;
                break L2;
              }
            } else {
              this.field_r = var11;
              this.field_q = var6;
              this.field_t = var5;
              break L2;
            }
          } else {
            this.field_q = param3;
            this.field_r = param3;
            this.field_t = param3;
            break L2;
          }
        }
    }

    public static void c(int param0) {
        if (param0 >= -27) {
            field_v = (su) null;
        }
        field_v = null;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (param3 >= param2) {
            stackIn_3_0 = param3;
            break L0;
          } else {
            stackIn_3_0 = param2;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param3 <= param2) {
            stackIn_6_0 = param3;
            break L1;
          } else {
            stackIn_6_0 = param2;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 > var5) {
            stackIn_9_0 = param1;
            break L2;
          } else {
            stackIn_9_0 = var5;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_9_0;
          if (var6 > param1) {
            stackIn_12_0 = param1;
            break L3;
          } else {
            stackIn_12_0 = var6;
            break L3;
          }
        }
        L4: {
          var6 = stackIn_12_0;
          this.field_p = (var6 + var5) / param0;
          var7 = var5 + -var6;
          if ((this.field_p ^ -1) >= -1) {
            this.field_n = 0;
            break L4;
          } else {
            if (-4097 >= (this.field_p ^ -1)) {
              this.field_n = 0;
              break L4;
            } else {
              L5: {
                stackIn_16_0 = this;

                stackIn_16_1 = var7 << 438361676;

                if (-2049 > (this.field_p ^ -1)) {
                  stackIn_17_0 = this;
                  stackIn_17_1 = stackIn_16_1;
                  stackIn_17_2 = 8192 + -(this.field_p * 2);
                  break L5;
                } else {
                  stackIn_17_0 = this;
                  stackIn_17_1 = stackIn_16_1;
                  stackIn_17_2 = 2 * this.field_p;
                  break L5;
                }
              }
              ((wsa) (this)).field_n = stackIn_17_1 / stackIn_17_2;
              break L4;
            }
          }
        }
        L6: {
          if (var7 <= 0) {
            this.field_m = 0;
            break L6;
          } else {
            L7: {
              var8 = (-param2 + var5 << 1407528556) / var7;
              var9 = (-param3 + var5 << 664757452) / var7;
              var10 = (-param1 + var5 << 1419796652) / var7;
              if (var5 == param2) {
                L8: {
                  stackIn_33_0 = this;

                  if (var6 == param3) {
                    stackIn_34_0 = this;
                    stackIn_34_1 = 20480 - -var10;
                    break L8;
                  } else {
                    stackIn_34_0 = this;
                    stackIn_34_1 = -var9 + 4096;
                    break L8;
                  }
                }
                ((wsa) (this)).field_m = stackIn_34_1;
                break L7;
              } else {
                if (param3 == var5) {
                  L9: {
                    stackIn_29_0 = this;

                    if (param1 == var6) {
                      stackIn_30_0 = this;
                      stackIn_30_1 = var8 + 4096;
                      break L9;
                    } else {
                      stackIn_30_0 = this;
                      stackIn_30_1 = -var10 + 12288;
                      break L9;
                    }
                  }
                  ((wsa) (this)).field_m = stackIn_30_1;
                  break L7;
                } else {
                  L10: {
                    stackIn_25_0 = this;

                    if (param2 == var6) {
                      stackIn_26_0 = this;
                      stackIn_26_1 = 12288 + var9;
                      break L10;
                    } else {
                      stackIn_26_0 = this;
                      stackIn_26_1 = 20480 + -var8;
                      break L10;
                    }
                  }
                  ((wsa) (this)).field_m = stackIn_26_1;
                  break L7;
                }
              }
            }
            this.field_m = this.field_m / 6;
            break L6;
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                var4_int = param2;
                if (-1 == (var4_int ^ -1)) {
                  this.field_o = param1.b(false);
                  break L1;
                } else {
                  if (-2 != (var4_int ^ -1)) {
                    if (var4_int != 2) {
                      break L1;
                    } else {
                      this.field_u = (param1.c((byte) 44) << -148049876) / 100;
                      break L1;
                    }
                  } else {
                    this.field_s = (param1.c((byte) 36) << -1344103348) / 100;
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("wsa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_1 = 0;
        int var7;
        L0: {
          var5 = 15 & param3;
          if (-9 < (var5 ^ -1)) {
            stackIn_3_0 = param1;
            break L0;
          } else {
            stackIn_3_0 = param0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (var5 >= 4) {
            L2: {
              if (12 == var5) {
                break L2;
              } else {
                if (-15 != (var5 ^ -1)) {
                  stackIn_10_0 = param4;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            stackIn_10_0 = param1;
            break L1;
          } else {
            stackIn_10_0 = param0;
            break L1;
          }
        }
        var7 = stackIn_10_0;
        if (param2 == 0) {
          L3: {
            if (-1 != (1 & var5 ^ -1)) {
              stackIn_15_0 = -var6;
              break L3;
            } else {
              stackIn_15_0 = var6;
              break L3;
            }
          }
          L4: {


            if ((var5 & 2) == 0) {

              stackIn_18_1 = var7;
              break L4;
            } else {

              stackIn_18_1 = -var7;
              break L4;
            }
          }
          return stackIn_15_0 - -stackIn_18_1;
        } else {
          return -13;
        }
    }

    static {
        field_v = new su(11, 0, 1, 2);
    }
}
