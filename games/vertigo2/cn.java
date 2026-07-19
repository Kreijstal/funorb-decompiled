/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cn {
    private int field_l;
    private int field_b;
    private int field_u;
    private int field_f;
    private int field_i;
    static boolean field_v;
    private int field_x;
    static boolean field_r;
    private int field_m;
    private int field_c;
    private int field_w;
    int[] field_e;
    private int field_s;
    private int field_k;
    private int field_d;
    private int field_B;
    int field_q;
    private int field_j;
    boolean field_o;
    private int field_A;
    private int field_t;
    private int field_a;
    private int field_p;
    private int field_z;
    private int field_y;
    private int field_h;
    private int field_g;
    private int field_n;

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        this.field_i = 1;
        this.field_x = 1;
        this.field_f = param6;
        this.field_h = (param4 - param0) / 2 + param0;
        this.field_A = param6 - -((param1 + -param6) / 2);
        this.field_n = 30;
        this.field_g = param2 + (param5 - param2) / 2;
        this.field_o = true;
        this.field_y = this.field_u;
        if (param3) {
            this.field_b = -86;
        }
        this.field_b = param1;
    }

    final static String a(byte param0, String param1, char param2, String param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              var5 = param1.length();
              var6 = var4_int;
              var8 = 109 / ((param0 - -40) / 53);
              var7 = -1 + var5;
              if (var7 != 0) {
                var9_int = 0;
                L2: while (true) {
                  var9_int = param3.indexOf((int) param2, var9_int);
                  if (0 <= var9_int) {
                    var9_int++;
                    var6 = var6 + var7;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var9 = new StringBuilder(var6);
            var10 = 0;
            L3: while (true) {
              var11 = param3.indexOf((int) param2, var10);
              if (0 > var11) {
                discarded$3 = var9.append(param3.substring(var10));
                stackOut_10_0 = var9.toString();
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                discarded$4 = var9.append(param3.substring(var10, var11));
                discarded$5 = var9.append(param1);
                var10 = var11 + 1;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("cn.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    final int b(int param0) {
        if (param0 != 1) {
            return -2;
        }
        return this.field_x;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          var3 = -21 / ((param1 - -33) / 63);
          if (param0 != this.field_i) {
            this.field_x = this.field_i;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          this.field_i = param0;
          if (-1 != (param0 ^ -1)) {
            if (1 == param0) {
              this.field_d = 214;
              this.field_t = 550;
              break L1;
            } else {
              if (param0 != 2) {
                this.field_w = this.field_w + (param0 << 1190460033);
                this.field_t = this.field_w;
                break L1;
              } else {
                this.field_t = 400;
                this.field_d = 195;
                break L1;
              }
            }
          } else {
            this.field_t = 400;
            this.field_d = 239;
            break L1;
          }
        }
    }

    final int c(int param0) {
        if (param0 != -1870) {
            return 46;
        }
        return this.field_i;
    }

    final static void a(ed param0, int param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var5 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (param1 >= 113) {
                    break L1;
                  } else {
                    field_r = false;
                    break L1;
                  }
                }
                L2: {
                  if (null == as.field_d) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        as.field_d.a(-23669, 0L);
                        as.field_d.a(0, var6);
                        var3_int = 0;
                        L4: while (true) {
                          L5: {
                            if ((var3_int ^ -1) <= -25) {
                              break L5;
                            } else {
                              if (var6[var3_int] != 0) {
                                break L5;
                              } else {
                                var3_int++;
                                continue L4;
                              }
                            }
                          }
                          if (24 > var3_int) {
                            break L3;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L7: while (true) {
                          if (24 <= var4) {
                            break L6;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L7;
                          }
                        }
                      }
                    }
                    break L2;
                  }
                }
                param0.a(0, -10140, var2, 24);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) (runtimeException);
                stackOut_16_1 = new StringBuilder().append("cn.K(");
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L8;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L8;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            this.a(85, -89, -12, -107);
        }
        return this.field_l == this.field_q ? true : false;
    }

    private final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int discarded$1 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        L0: {
          if (param0 >= 77) {
            break L0;
          } else {
            discarded$1 = this.c(77);
            break L0;
          }
        }
        L1: {
          if (this.field_o) {
            var8 = param2;
            param2 = param3;
            param4 = param4 * 4;
            param3 = var8;
            param2 = param2 * 4;
            this.field_e[2] = param2;
            this.field_e[1] = this.field_f;
            this.field_e[0] = param4;
            param3 = -param3 + this.field_b;
            param2 = -param2 + this.field_g;
            param4 = this.field_h - param4;
            var9 = wg.a(124, param3 * param3 + param4 * param4 + param2 * param2);
            param2 = (param2 << -990061872) / var9;
            param3 = (param3 << -299678800) / var9;
            param4 = (param4 << -841369488) / var9;
            this.field_e[9] = param4;
            this.field_e[10] = param3;
            this.field_e[11] = param2;
            var10 = param2 * 16384 >> -2003517170;
            var11 = 0;
            var11 = var11 >> 2;
            var10 = var10 >> 2;
            var12 = -16384 * param4 >> 334474766;
            var12 = var12 >> 2;
            var9 = wg.a(92, var10 * var10 - (-(var11 * var11) + -(var12 * var12)));
            var11 = (var11 << 476767952) / var9;
            var12 = (var12 << 2044002224) / var9;
            var10 = (var10 << -1979766896) / var9;
            this.field_e[5] = var12;
            this.field_e[3] = var10;
            this.field_e[4] = var11;
            param3 = param3 >> 1;
            param2 = param2 >> 1;
            var12 = var12 >> 1;
            param4 = param4 >> 1;
            var10 = var10 >> 1;
            var11 = var11 >> 1;
            var13 = param3 * var12 - var11 * param2 >> -535230736;
            var14 = -(var12 * param4) + param2 * var10 >> -2113770192;
            var15 = param4 * var11 + -(param3 * var10) >> -1608657808;
            var9 = wg.a(123, var14 * var14 + (var13 * var13 + var15 * var15));
            var15 = (var15 << -1059464304) / var9;
            var13 = (var13 << 672870896) / var9;
            var14 = (var14 << -676993296) / var9;
            this.field_e[6] = var13;
            this.field_e[8] = var15;
            this.field_e[7] = var14;
            break L1;
          } else {
            L2: {
              param6 = param6 << 1;
              param1 = param1 << 1;
              var8 = 2047 & -param1;
              var9 = -param6 & 2047;
              var10 = 0;
              var11 = 0;
              var12 = param5;
              if (-1 != (param1 ^ -1)) {
                var13 = oo.field_j[param1];
                var14 = oo.field_h[param1];
                var15 = var14 * var11 - var12 * var13 >> -685694928;
                var12 = var11 * var13 - -(var14 * var12) >> -1218279824;
                var11 = var15;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param6 == 0) {
                break L3;
              } else {
                var13 = oo.field_j[param6];
                var14 = oo.field_h[param6];
                var15 = var10 * var14 + var13 * var12 >> -2015608688;
                var12 = var12 * var14 - var13 * var10 >> 1328051504;
                var10 = var15;
                break L3;
              }
            }
            var16 = oo.field_j[var9];
            var17 = oo.field_h[var9];
            var18 = oo.field_j[var8];
            var19 = oo.field_h[var8];
            var20 = (var16 >> 398675585) * (var18 >> -168559903) >> 1000636974;
            var21 = (var19 >> 139629409) * (var16 >> 32525473) >> 632240462;
            var22 = (var17 >> 1827762433) * (var18 >> 273685121) >> -1221954002;
            var23 = (var17 >> 488344545) * (var19 >> -1582137951) >> -421108274;
            var24 = -var10 + param4;
            var25 = -var11 + param3;
            var26 = param2 + -var12;
            this.field_e[0] = var24;
            this.field_e[1] = var25;
            this.field_e[9] = -var21;
            this.field_e[4] = 0;
            this.field_e[10] = var18;
            this.field_e[5] = var16 >> -237113215;
            this.field_e[8] = -var22 >> 364405825;
            this.field_e[11] = var23;
            this.field_e[2] = var26;
            this.field_e[6] = var20 >> -578678175;
            this.field_e[7] = var19 >> 1540448353;
            this.field_e[3] = var17 >> 64937761;
            break L1;
          }
        }
    }

    final void d(int param0) {
        this.field_t = param0;
        this.field_u = 214;
        this.field_w = this.field_t / 4;
        this.field_z = this.field_k;
        this.field_c = 214;
    }

    final void a(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        if (this.field_o) {
            this.a((byte) 82, 0, this.field_A, this.field_s, this.field_a, this.field_w, 4 * this.field_n);
        } else {
            this.a((byte) 92, 4 * this.field_c, param3, param0, param1, this.field_w, 4 * this.field_z);
        }
        if (param2 != 12257) {
            discarded$0 = cn.b(false);
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return gd.field_j.field_hc == ao.field_N ? true : false;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Vertigo2.field_L ? 1 : 0;
          this.field_j = this.field_j + 3;
          if (!this.field_o) {
            break L0;
          } else {
            L1: {
              this.field_d = 204;
              this.field_t = 50;
              if (this.field_y >= this.field_d) {
                if (this.field_d >= this.field_y) {
                  break L1;
                } else {
                  this.field_y = this.field_y - 1;
                  break L1;
                }
              } else {
                this.field_y = this.field_y + 1;
                break L1;
              }
            }
            L2: {
              if (this.field_b - this.field_B > this.field_f + this.field_m) {
                break L2;
              } else {
                this.field_B = this.field_B - 240;
                this.field_m = this.field_m - 240;
                break L2;
              }
            }
            L3: {
              if (this.field_w >= this.field_t) {
                if (this.field_t < this.field_w) {
                  this.field_w = this.field_w - 5;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                this.field_w = this.field_w + 5;
                break L3;
              }
            }
            L4: {
              L5: {
                L6: {
                  if (this.field_A <= this.field_b) {
                    break L6;
                  } else {
                    if (-1 > (this.field_p ^ -1)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (this.field_A >= this.field_f + this.field_m) {
                  break L4;
                } else {
                  if (0 <= this.field_p) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              this.field_p = this.field_p * -1;
              break L4;
            }
            L7: {
              var2 = 1;
              if (this.field_b >= this.field_A) {
                break L7;
              } else {
                if (this.field_p >= 0) {
                  break L7;
                } else {
                  var2 = 3;
                  break L7;
                }
              }
            }
            L8: {
              if (this.field_A >= this.field_f - -this.field_m) {
                break L8;
              } else {
                if (-1 > (this.field_p ^ -1)) {
                  var2 = 3;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            this.field_A = this.field_A + this.field_p * var2;
            this.field_a = (oo.field_h[this.field_j % 2048] * 640 / 2 >> 1213050544) - -160;
            this.field_s = (oo.field_j[this.field_j % 2048] * 640 / 2 >> -618066128) + 160;
            break L0;
          }
        }
        L9: {
          var2 = this.field_w + -this.field_t;
          if (-26 < (var2 * var2 ^ -1)) {
            this.field_w = this.field_t;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          var3 = 5;
          var4 = (double)(var2 * var2 / 50000);
          if (-50001 > (var2 * var2 ^ -1)) {
            var3 = (int)(5.0 * Math.sqrt(var4 * 8.0));
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if ((this.field_z % 64 ^ -1) == param0) {
            this.field_l = this.field_q;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (this.field_t > this.field_w) {
            this.field_w = this.field_w + var3;
            break L12;
          } else {
            if (this.field_w > this.field_t) {
              this.field_w = this.field_w - var3;
              break L12;
            } else {
              break L12;
            }
          }
        }
        L13: {
          if (this.field_c >= this.field_d) {
            if (this.field_d >= this.field_c) {
              this.field_x = this.field_i;
              break L13;
            } else {
              this.field_c = this.field_c - 1;
              break L13;
            }
          } else {
            this.field_c = this.field_c + 1;
            break L13;
          }
        }
        L14: {
          L15: {
            L16: {
              this.field_k = this.field_l * 64;
              var6 = -this.field_z + this.field_k;
              var7 = 4;
              if (0 >= var6) {
                break L16;
              } else {
                if (-129 < (var6 ^ -1)) {
                  break L15;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if (-128 <= var6) {
                break L17;
              } else {
                if (var6 <= -256) {
                  break L17;
                } else {
                  break L15;
                }
              }
            }
            if (this.field_k != this.field_z) {
              if (16 <= var6 * var6) {
                this.field_z = this.field_z - var7 & 255;
                break L14;
              } else {
                this.field_z = this.field_k;
                break L14;
              }
            } else {
              break L14;
            }
          }
          this.field_z = 255 & var7 + this.field_z;
          break L14;
        }
    }

    cn() {
        this.field_i = 0;
        this.field_x = 0;
        this.field_u = 0;
        this.field_k = 0;
        this.field_e = new int[12];
        this.field_t = 550;
        this.field_p = 3;
        this.field_B = 720;
        this.field_w = 275;
        this.field_d = 428;
        this.field_z = 125;
        this.field_c = 255;
        this.field_t = 550;
        this.field_m = 720;
    }

    static {
    }
}
