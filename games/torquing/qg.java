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
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.a(param4 ^ -256, param2);
          var6 = param1.a(param3, -112, var5_int);
          if (param4 == 255) {
            stackIn_4_0 = gd.a(param1, var5_int, param0, var6, param4 ^ 237);
            return stackIn_4_0;
          }
          stackIn_2_0 = (vn) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("qg.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(double param0, double[] param1, int param2, double param3, boolean param4) {
        boolean stackIn_16_0 = false;
        gg[] stackIn_16_1 = null;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
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
          if (param4) {
            field_v = (String) null;
          }
          if (param2 != 3) {
            if (1 == param2) {
              var9 = 2500.0;
              if (!(param3 < var9)) {
                var8 = (int)(0.5 + 100.0 * Math.sqrt(param3 / var9));
                var7_int = 96;
              } else {
                var7_int = (int)(0.5 + 96.0 * param3 / var9);
                var8 = 100;
              }
              if (null != ie.field_b) {
                var11 = ap.b(ie.field_b.field_P.field_g, 0, param1, 0);
                if (var11 > 200.0) {
                  var7_int = (int)((double)(var7_int * 200) / var11);
                }
              }
              if (var7_int > 16) {
                stackIn_16_0 = true;
                stackIn_16_1 = th.field_F;
                if (0.0 == param0) {
                  stackIn_17_2 = 25;
                } else {
                  stackIn_17_2 = 26;
                }
                ip.a(stackIn_16_0, nj.a(stackIn_16_1[stackIn_17_2], var8, var7_int));
              }
              if (0.0 == param0 &&
                var8 > 150) {
                fq.a(false, 100, th.field_F[14], var7_int);
              }
            }
          } else {
            th.a(100, th.field_F[28]);
          }
          if (0 != qd.field_d &&
            2 == param2) {
            return;
          }
          qd.field_d = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("qg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int[] a(byte param0, int param1) {
        int var14 = 0;
        int var8 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int stackIn_9_0 = 0;
        byte[] stackIn_9_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_14_0 = 0;
        byte[] stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        double stackIn_39_0 = 0.0;
        int stackIn_40_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_1 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var18Lifetime1;
        var19 = Torquing.field_u;
        if (param0 < 86) {
          qg.d(72);
        }
        var3 = this.field_l.a(param1, 25657);
        if (this.field_l.field_b) {
          var4 = 2048 + dp.field_a[param1] * this.field_w;
          var5 = var4 >> 12;
          var6 = 1 + var5;
          for (var14 = 0; var14 < ci.field_c; var14++) {
            gq.field_b = 2147483647;
            gp.field_K = 2147483647;
            ln.field_F = 2147483647;
            hl.field_a = 2147483647;
            var15 = q.field_b[var14] * this.field_D + 2048;
            var16 = var15 >> 12;
            var17 = var16 + 1;
            for (var8 = var5 - 1; var6 >= var8; var8++) {
              stackIn_9_0 = 255;
              stackIn_9_1 = this.field_u;
              if (this.field_w <= var8) {
                stackIn_10_2 = var8 - this.field_w;
              } else {
                stackIn_10_2 = var8;
              }
              var12 = stackIn_9_0 & stackIn_9_1[stackIn_10_2 & 255];
              for (var7 = var16 - 1; var17 >= var7; var7++) {
                stackIn_14_0 = 255;
                stackIn_14_1 = this.field_u;
                stackIn_14_2 = 255;
                if (var7 >= this.field_D) {
                  stackIn_15_3 = var7 - this.field_D;
                } else {
                  stackIn_15_3 = var7;
                }
                var13 = (stackIn_14_0 & stackIn_14_1[stackIn_14_2 & stackIn_15_3 + var12]) * 2;
                incrementValue$0 = var13;
                var13++;
                var9 = -(var7 << 12) + (-this.field_B[incrementValue$0] + var15);
                var10 = -(var8 << 12) - this.field_B[var13] + var4;
                var18 = this.field_y;
                if (var18 == 1) {
                  var11 = var10 * var10 + var9 * var9 >> 12;
                } else {
                  if (3 != var18) {
                    if (var18 != 4) {
                      if (var18 == 5) {
                        var9 = var9 * var9;
                        var10 = var10 * var10;
                        var11 = (int)(Math.sqrt(Math.sqrt((double)((float)(var10 + var9) / 16777216.0f))) * 4096.0);
                      } else {
                        if (2 != var18) {
                          var11 = (int)(4096.0 * Math.sqrt((double)((float)(var10 * var10 + var9 * var9) / 16777216.0f)));
                        } else {
                          if (var10 >= 0) {
                            stackIn_45_0 = var10;
                          } else {
                            stackIn_45_0 = -var10;
                          }
                          if (var9 < 0) {
                            stackIn_48_1 = -var9;
                          } else {
                            stackIn_48_1 = var9;
                          }
                          var11 = stackIn_45_0 + stackIn_48_1;
                        }
                      }
                    } else {
                      if (var9 < 0) {
                        stackIn_37_0 = -var9;
                      } else {
                        stackIn_37_0 = var9;
                      }
                      var9 = (int)(Math.sqrt((double)((float)stackIn_37_0 / 4096.0f)) * 4096.0);
                      stackIn_39_0 = 4096.0;
                      if (0 > var10) {
                        stackIn_40_1 = -var10;
                      } else {
                        stackIn_40_1 = var10;
                      }
                      var10 = (int)(stackIn_39_0 * Math.sqrt((double)((float)stackIn_40_1 / 4096.0f)));
                      var11 = var10 + var9;
                      var11 = var11 * var11 >> 12;
                    }
                  } else {
                    if (var9 >= 0) {
                      stackIn_27_0 = var9;
                    } else {
                      stackIn_27_0 = -var9;
                    }
                    var9 = stackIn_27_0;
                    if (var10 >= 0) {
                      stackIn_30_0 = var10;
                    } else {
                      stackIn_30_0 = -var10;
                    }
                    var10 = stackIn_30_0;
                    stackIn_33_0 = (var9 > var10) ? var9 : var10;
                    var11 = stackIn_33_0;
                  }
                }
                if (var11 < hl.field_a) {
                  gp.field_K = gq.field_b;
                  gq.field_b = ln.field_F;
                  ln.field_F = hl.field_a;
                  hl.field_a = var11;
                } else {
                  if (var11 < ln.field_F) {
                    gp.field_K = gq.field_b;
                    gq.field_b = ln.field_F;
                    ln.field_F = var11;
                  } else {
                    if (var11 >= gq.field_b) {
                      if (var11 < gp.field_K) {
                        gp.field_K = var11;
                      }
                    } else {
                      gp.field_K = gq.field_b;
                      gq.field_b = var11;
                    }
                  }
                }
              }
            }
            var18Lifetime1 = this.field_t;
            if (var18Lifetime1 != 0) {
              if (var18Lifetime1 == 1) {
                var3[var14] = ln.field_F;
              } else {
                if (var18Lifetime1 != 3) {
                  if (var18Lifetime1 == 4) {
                    var3[var14] = gp.field_K;
                  } else {
                    if (var18Lifetime1 == 2) {
                      var3[var14] = ln.field_F - hl.field_a;
                    }
                  }
                } else {
                  var3[var14] = gq.field_b;
                }
              }
            } else {
              var3[var14] = hl.field_a;
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
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          if (param1 != 35) {
            this.field_u = (byte[]) null;
          }
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int != 1) {
              if (2 != var4_int) {
                if (var4_int != 3) {
                  if (4 != var4_int) {
                    if (var4_int != 5) {
                      if (var4_int == 6) {
                        this.field_w = param0.i((byte) -101);
                      }
                    } else {
                      this.field_D = param0.i((byte) -101);
                    }
                  } else {
                    this.field_y = param0.i((byte) -101);
                  }
                } else {
                  this.field_t = param0.i((byte) -101);
                }
              } else {
                this.field_s = param0.i(7088);
              }
            } else {
              this.field_x = param0.i((byte) -101);
            }
          } else {
            dupTemp$0 = param0.i((byte) -101);
            this.field_w = dupTemp$0;
            this.field_D = dupTemp$0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("qg.H(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
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
        if (this.field_s > 0) {
          for (var3 = 0; var3 < 512; var3++) {
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
