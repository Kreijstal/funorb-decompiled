/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qg extends am {
    static String field_v;
    static int field_A;
    private int field_x;
    private int field_D;
    private int field_y;
    private short[] field_B;
    static gh field_C;
    static int field_z;
    private int field_t;
    private int field_s;
    private byte[] field_u;
    private int field_w;

    final static void d(int param0) {
        vo.field_a[61] = 27;
        vo.field_a[59] = 57;
        vo.field_a[93] = 43;
        vo.field_a[520] = 59;
        vo.field_a[222] = 58;
        vo.field_a[192] = 28;
        vo.field_a[92] = 74;
        vo.field_a[46] = 72;
        vo.field_a[44] = 71;
        vo.field_a[45] = 26;
        vo.field_a[47] = 73;
        vo.field_a[91] = 42;
        if (param0 > -45) {
            String var2 = (String) null;
            qg.a((la) null, (la) null, (String) null, (String) null, 100);
        }
    }

    final static vn a(la param0, la param1, String param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        vn stackIn_2_0 = null;
        vn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param1.a(param4 ^ -256, param2);
            var6 = param1.a(param3, -112, var5_int);
            if (param4 == 255) {
              stackIn_4_0 = gd.a(param1, var5_int, param0, var6, param4 ^ 237);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (vn) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("qg.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(double param0, double[] param1, int param2, double param3, boolean param4) {
        int stackIn_16_0 = 0;
        gg[] stackIn_16_1 = null;
        int stackIn_17_0 = 0;
        gg[] stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        var13 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            L2: {
              if (param2 != 3) {
                if (1 != param2) {
                  break L2;
                } else {
                  L3: {
                    var9 = 2500.0;
                    if (param3 >= var9) {
                      var8 = (int)(0.5 + 100.0 * Math.sqrt(param3 / var9));
                      var7_int = 96;
                      break L3;
                    } else {
                      var7_int = (int)(0.5 + 96.0 * param3 / var9);
                      var8 = 100;
                      break L3;
                    }
                  }
                  L4: {
                    if (null != ie.field_b) {
                      var11 = ap.b(ie.field_b.field_P.field_g, 0, param1, 0);
                      if (var11 <= 200.0) {
                        break L4;
                      } else {
                        var7_int = (int)((double)(var7_int * 200) / var11);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var7_int <= 16) {
                      break L5;
                    } else {
                      L6: {
                        stackIn_16_0 = 1;

                        stackIn_16_1 = th.field_F;

                        if (0.0 == param0) {
                          stackIn_17_0 = stackIn_16_0;
                          stackIn_17_1 = (gg[]) ((Object) stackIn_16_1);
                          stackIn_17_2 = 25;
                          break L6;
                        } else {
                          stackIn_17_0 = stackIn_16_0;
                          stackIn_17_1 = (gg[]) ((Object) stackIn_16_1);
                          stackIn_17_2 = 26;
                          break L6;
                        }
                      }
                      ip.a(stackIn_17_0 != 0, nj.a(stackIn_17_1[stackIn_17_2], var8, var7_int));
                      break L5;
                    }
                  }
                  if (0.0 != param0) {
                    break L2;
                  } else {
                    if (-151 > (var8 ^ -1)) {
                      fq.a(false, 100, th.field_F[14], var7_int);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                th.a(100, th.field_F[28]);
                break L2;
              }
            }
            L7: {
              L8: {
                if (0 == qd.field_d) {
                  break L8;
                } else {
                  if (2 != param2) {
                    break L8;
                  } else {
                    break L7;
                  }
                }
              }
              qd.field_d = param2;
              break L7;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var7);

            stackIn_29_1 = new StringBuilder().append("qg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int[] a(byte param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_9_0 = 0;
        byte[] stackIn_9_1 = null;
        int stackIn_10_0 = 0;
        byte[] stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_14_0 = 0;
        byte[] stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_15_0 = 0;
        byte[] stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        double stackIn_39_0 = 0.0;
        double stackIn_40_0 = 0.0;
        int stackIn_40_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_1 = 0;
        int[] var3;
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
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        L0: {
          var19 = Torquing.field_u;
          if (param0 >= 86) {
            break L0;
          } else {
            qg.d(72);
            break L0;
          }
        }
        L1: {
          var3 = this.field_l.a(param1, 25657);
          if (!this.field_l.field_b) {
            break L1;
          } else {
            var4 = 2048 - -(dp.field_a[param1] * this.field_w);
            var5 = var4 >> 1439259884;
            var6 = 1 + var5;
            var14 = 0;
            L2: while (true) {
              if (var14 >= ci.field_c) {
                break L1;
              } else {
                gq.field_b = 2147483647;
                gp.field_K = 2147483647;
                ln.field_F = 2147483647;
                hl.field_a = 2147483647;
                var15 = q.field_b[var14] * this.field_D + 2048;
                var16 = var15 >> -1172010644;
                var17 = var16 - -1;
                var8 = var5 - 1;
                L3: while (true) {
                  if (var6 < var8) {
                    var18 = this.field_t;
                    if (var18 != 0) {
                      if (-2 == (var18 ^ -1)) {
                        var3[var14] = ln.field_F;
                        var14++;
                        continue L2;
                      } else {
                        if (-4 != (var18 ^ -1)) {
                          if (var18 == 4) {
                            var3[var14] = gp.field_K;
                            var14++;
                            continue L2;
                          } else {
                            if (-3 == (var18 ^ -1)) {
                              var3[var14] = ln.field_F + -hl.field_a;
                              var14++;
                              continue L2;
                            } else {
                              var14++;
                              continue L2;
                            }
                          }
                        } else {
                          var3[var14] = gq.field_b;
                          var14++;
                          continue L2;
                        }
                      }
                    } else {
                      var3[var14] = hl.field_a;
                      var14++;
                      continue L2;
                    }
                  } else {
                    L4: {
                      stackIn_9_0 = 255;

                      stackIn_9_1 = this.field_u;

                      if (this.field_w <= var8) {
                        stackIn_10_0 = stackIn_9_0;
                        stackIn_10_1 = (byte[]) ((Object) stackIn_9_1);
                        stackIn_10_2 = var8 - this.field_w;
                        break L4;
                      } else {
                        stackIn_10_0 = stackIn_9_0;
                        stackIn_10_1 = (byte[]) ((Object) stackIn_9_1);
                        stackIn_10_2 = var8;
                        break L4;
                      }
                    }
                    var12 = stackIn_10_0 & stackIn_10_1[stackIn_10_2 & 255];
                    var7 = var16 + -1;
                    L5: while (true) {
                      if (var17 < var7) {
                        var8++;
                        continue L3;
                      } else {
                        L6: {
                          stackIn_14_0 = 255;

                          stackIn_14_1 = this.field_u;

                          stackIn_14_2 = 255;

                          if (var7 >= this.field_D) {
                            stackIn_15_0 = stackIn_14_0;
                            stackIn_15_1 = (byte[]) ((Object) stackIn_14_1);
                            stackIn_15_2 = stackIn_14_2;
                            stackIn_15_3 = var7 + -this.field_D;
                            break L6;
                          } else {
                            stackIn_15_0 = stackIn_14_0;
                            stackIn_15_1 = (byte[]) ((Object) stackIn_14_1);
                            stackIn_15_2 = stackIn_14_2;
                            stackIn_15_3 = var7;
                            break L6;
                          }
                        }
                        L7: {
                          var13 = (stackIn_15_0 & stackIn_15_1[stackIn_15_2 & stackIn_15_3 + var12]) * 2;
                          incrementValue$0 = var13;
                          var13++;
                          var9 = -(var7 << 1373435212) + (-this.field_B[incrementValue$0] + var15);
                          var10 = -(var8 << -468475924) - this.field_B[var13] + var4;
                          var18 = this.field_y;
                          if (-2 == (var18 ^ -1)) {
                            var11 = var10 * var10 + var9 * var9 >> -363281524;
                            break L7;
                          } else {
                            if (3 != var18) {
                              if (-5 != (var18 ^ -1)) {
                                if (var18 == 5) {
                                  var9 = var9 * var9;
                                  var10 = var10 * var10;
                                  var11 = (int)(Math.sqrt(Math.sqrt((double)((float)(var10 + var9) / 16777216.0f))) * 4096.0);
                                  break L7;
                                } else {
                                  if (2 != var18) {
                                    var11 = (int)(4096.0 * Math.sqrt((double)((float)(var10 * var10 + var9 * var9) / 16777216.0f)));
                                    break L7;
                                  } else {
                                    L8: {
                                      if ((var10 ^ -1) <= -1) {
                                        stackIn_45_0 = var10;
                                        break L8;
                                      } else {
                                        stackIn_45_0 = -var10;
                                        break L8;
                                      }
                                    }
                                    L9: {


                                      if (var9 < 0) {

                                        stackIn_48_1 = -var9;
                                        break L9;
                                      } else {

                                        stackIn_48_1 = var9;
                                        break L9;
                                      }
                                    }
                                    var11 = stackIn_45_0 + stackIn_48_1;
                                    break L7;
                                  }
                                }
                              } else {
                                L10: {
                                  if (var9 < 0) {
                                    stackIn_37_0 = -var9;
                                    break L10;
                                  } else {
                                    stackIn_37_0 = var9;
                                    break L10;
                                  }
                                }
                                L11: {
                                  var9 = (int)(Math.sqrt((double)((float)stackIn_37_0 / 4096.0f)) * 4096.0);
                                  stackIn_39_0 = 4096.0;

                                  if (0 > var10) {
                                    stackIn_40_0 = stackIn_39_0;
                                    stackIn_40_1 = -var10;
                                    break L11;
                                  } else {
                                    stackIn_40_0 = stackIn_39_0;
                                    stackIn_40_1 = var10;
                                    break L11;
                                  }
                                }
                                var10 = (int)(stackIn_40_0 * Math.sqrt((double)((float)stackIn_40_1 / 4096.0f)));
                                var11 = var10 + var9;
                                var11 = var11 * var11 >> -1256393812;
                                break L7;
                              }
                            } else {
                              L12: {
                                if ((var9 ^ -1) <= -1) {
                                  stackIn_27_0 = var9;
                                  break L12;
                                } else {
                                  stackIn_27_0 = -var9;
                                  break L12;
                                }
                              }
                              L13: {
                                var9 = stackIn_27_0;
                                if (-1 >= (var10 ^ -1)) {
                                  stackIn_30_0 = var10;
                                  break L13;
                                } else {
                                  stackIn_30_0 = -var10;
                                  break L13;
                                }
                              }
                              L14: {
                                var10 = stackIn_30_0;
                                if (var9 > var10) {
                                  stackIn_33_0 = var9;
                                  break L14;
                                } else {
                                  stackIn_33_0 = var10;
                                  break L14;
                                }
                              }
                              var11 = stackIn_33_0;
                              break L7;
                            }
                          }
                        }
                        if (var11 < hl.field_a) {
                          gp.field_K = gq.field_b;
                          gq.field_b = ln.field_F;
                          ln.field_F = hl.field_a;
                          hl.field_a = var11;
                          var7++;
                          continue L5;
                        } else {
                          if (var11 < ln.field_F) {
                            gp.field_K = gq.field_b;
                            gq.field_b = ln.field_F;
                            ln.field_F = var11;
                            var7++;
                            continue L5;
                          } else {
                            if (var11 >= gq.field_b) {
                              if (var11 < gp.field_K) {
                                gp.field_K = var11;
                                var7++;
                                continue L5;
                              } else {
                                var7++;
                                continue L5;
                              }
                            } else {
                              gp.field_K = gq.field_b;
                              gq.field_b = var11;
                              var7++;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    final void a(fj param0, int param1, int param2) {
        int dupTemp$0 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 == 35) {
                break L1;
              } else {
                this.field_u = (byte[]) null;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (var4_int != 0) {
                if (-2 != (var4_int ^ -1)) {
                  if (2 != var4_int) {
                    if ((var4_int ^ -1) != -4) {
                      if (4 != var4_int) {
                        if (var4_int != 5) {
                          if (var4_int != 6) {
                            break L2;
                          } else {
                            this.field_w = param0.i((byte) -101);
                            break L2;
                          }
                        } else {
                          this.field_D = param0.i((byte) -101);
                          break L2;
                        }
                      } else {
                        this.field_y = param0.i((byte) -101);
                        break L2;
                      }
                    } else {
                      this.field_t = param0.i((byte) -101);
                      break L2;
                    }
                  } else {
                    this.field_s = param0.i(7088);
                    break L2;
                  }
                } else {
                  this.field_x = param0.i((byte) -101);
                  break L2;
                }
              } else {
                dupTemp$0 = param0.i((byte) -101);
                this.field_w = dupTemp$0;
                this.field_D = dupTemp$0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("qg.H(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L3;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0) {
        int var3 = 0;
        int var4 = Torquing.field_u;
        if (param0 <= 12) {
            this.b(-97);
        }
        Random var5 = new Random((long)this.field_x);
        Random var2 = var5;
        this.field_B = new short[512];
        if ((this.field_s ^ -1) < -1) {
            for (var3 = 0; -513 < (var3 ^ -1); var3++) {
                this.field_B[var3] = (short)va.a(this.field_s, (byte) 120, var5);
            }
        }
    }

    public static void c(int param0) {
        field_C = null;
        if (param0 != -1172010644) {
            field_v = (String) null;
        }
        field_v = null;
    }

    public qg() {
        super(0, true);
        this.field_B = new short[512];
        this.field_y = 1;
        this.field_D = 5;
        this.field_u = new byte[512];
        this.field_x = 0;
        this.field_t = 2;
        this.field_s = 2048;
        this.field_w = 5;
    }

    final void a(byte param0) {
        this.field_u = i.b(10758, this.field_x);
        this.b(117);
        if (param0 <= 123) {
            field_z = 44;
        }
    }

    static {
        field_v = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_z = 100;
    }
}
