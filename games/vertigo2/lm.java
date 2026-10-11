/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lm extends ji {
    private int field_z;
    private int field_E;
    static cr field_F;
    private int field_C;
    private int field_L;
    private int field_A;
    private int field_K;
    static String field_H;
    private int field_D;
    private int field_y;
    static boolean field_G;
    private int field_J;
    private int field_I;

    public lm() {
        super(0, true);
        this.field_z = 0;
        this.field_L = 819;
        this.field_E = 0;
        this.field_C = 409;
        this.field_A = 1024;
        this.field_D = 1024;
        this.field_J = 1024;
        this.field_I = 1024;
        this.field_y = 2048;
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            return;
          }
          var4_int = param1;
          if (0 != var4_int) {
            if (var4_int == 1) {
              this.field_D = param2.a((byte) -11);
            } else {
              if (var4_int != 2) {
                if (var4_int != 3) {
                  if (var4_int == 4) {
                    this.field_L = param2.a((byte) -11);
                  } else {
                    if (5 == var4_int) {
                      this.field_A = param2.a((byte) -11);
                    } else {
                      if (var4_int != 6) {
                        if (var4_int != 7) {
                          if (var4_int == 8) {
                            this.field_J = param2.a((byte) -11);
                          }
                        } else {
                          this.field_I = param2.a((byte) -11);
                        }
                      } else {
                        this.field_z = param2.h(-11);
                      }
                    }
                  }
                } else {
                  this.field_C = param2.a((byte) -11);
                }
              } else {
                this.field_y = param2.a((byte) -11);
              }
            }
          } else {
            this.field_E = param2.h(-11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("lm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static boolean a(r param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -78 / ((param1 - 64) / 52);
          stackIn_1_0 = param0.a((byte) -112);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("lm.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        r var9;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (hm.field_F < 0) {
          return;
        }
        var3 = -135 + param2;
        var4 = param1 - 35;
        var5 = 256;
        if (hm.field_F < 75) {
          var5 = (hm.field_F << 8) / 75;
        }
        if (hm.field_F > 200) {
          var5 = (250 - hm.field_F << 8) / 50;
        }
        lq.a(n.field_a, (byte) -94);
        oo.c();
        bi.c();
        bq.h(-125);
        if (256 > var5) {
          bi.b(0, 0, bi.field_e, bi.field_j, 0, 256 - var5);
        }
        ln.d(-28558);
        if (150 > hm.field_F) {
          n.field_a.b(var3, var4);
        } else {
          qn.field_r.c(15 + var3, var4 + 10, var5);
        }
        var6 = -125 + hm.field_F;
        if (var6 > 0 &&
          var6 < 50) {
          if (var6 < 20) {
            var7 = var6 * 256 / 20;
            pl.field_h.d(var3, var4, var7);
          } else {
            if (var6 >= 30) {
              var7 = (-(var6 * 256) + 12800) / 20;
              pl.field_h.d(var3, var4, var7);
            } else {
              pl.field_h.d(var3, var4, 256);
            }
          }
        }
        var6Lifetime1 = -140 + hm.field_F;
        if (param0 != 115) {
          var9 = (r) null;
          lm.a((String) null, -5, (String) null, (r) null);
        }
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          lr.field_O.c(var3 + 15, 10 + var4, var7Lifetime1 * var5 >> 8);
        }
        return;
    }

    final static er[] a(String param0, int param1, String param2, r param3) {
        er[] var4 = null;
        RuntimeException var4_ref = null;
        er[] var5 = null;
        er[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 23109) {
            field_G = false;
          }
          var5 = gk.a(param3, param0, param2, true);
          var4 = var5;
          var5[1].field_x = var5[1].field_y;
          var5[3].field_B = var5[3].field_t;
          var5[5].field_B = var5[5].field_t;
          var5[7].field_x = var5[7].field_y;
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("lm.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_H = null;
        int var1 = -76 / ((param0 + 12) / 44);
        field_F = null;
    }

    final int[] c(int param0, int param1) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int[] var3;
        int[][] var4;
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
        int[][] var19;
        int[][] var20;
        Random var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26_int;
        int[] var26;
        int[][] var27;
        int var28;
        int var29_int;
        int[] var29;
        int var30;
        int var31;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int[][] var39;
        int[] var41;
        int[] var42;
        int[] var43;
        int[] var44;
        int[][] var45;
        int[][] var46;
        int[][] var47;
        int[] var52;
        int[] var53;
        int var28Lifetime1;
        int var31Lifetime1;
        int[] var26Lifetime1;
        var38 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 91) {
          return (int[]) null;
        }
        var3 = this.field_x.a(param0, (byte) 105);
        if (this.field_x.field_i) {
          var46 = this.field_x.a(100);
          var39 = var46;
          var4 = var39;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 1;
          var11 = 1;
          var12 = 0;
          var13 = 0;
          var14 = this.field_D * we.field_M >> 12;
          var15 = this.field_y * we.field_M >> 12;
          var16 = aa.field_Vb * this.field_C >> 12;
          var17 = aa.field_Vb * this.field_L >> 12;
          if (var17 <= 1) {
            return var46[param0];
          }
          this.field_K = we.field_M / 8 * this.field_A >> 12;
          var18 = 1 + we.field_M / var14;
          var19 = new int[var18][3];
          var47 = new int[var18][3];
          var20 = var47;
          var21 = new Random((long)this.field_E);
          while (true) {
            var23 = mj.a(-128, var21, var15 - var14) + var14;
            var24 = var16 + mj.a(-103, var21, -var16 + var17);
            var25 = var23 + var8;
            if (var25 > we.field_M) {
              var23 = we.field_M - var8;
              var25 = we.field_M;
            }
            L3: {
              if (var11 == 0) {
                var26_int = var9;
                var52 = var47[var9];
                var28 = 0;
                var29_int = var5 + var25;
                if (var29_int < 0) {
                  var29_int = var29_int + we.field_M;
                }
                if (we.field_M < var29_int) {
                  var29_int = var29_int - we.field_M;
                }
                var22 = var52[2];
                while (true) {
                  var53 = var47[var26_int];
                  if (var29_int >= var53[0] &&
                    var29_int <= var53[1]) {
                    if (var26_int != var9) {
                      var30 = var5 + var8;
                      if (0 > var30) {
                        var30 = var30 + we.field_M;
                      }
                      if (var30 > we.field_M) {
                        var30 = var30 - we.field_M;
                      }
                      for (var31 = 1; var31 <= var28; var31++) {
                        var41 = var20[(var31 + var9) % var12];
                        var22 = Math.max(var22, var41[2]);
                      }
                      for (var31Lifetime1 = 0; var31Lifetime1 <= var28; var31Lifetime1++) {
                        var42 = var20[(var9 + var31Lifetime1) % var12];
                        var33 = var42[2];
                        if (~var22 != ~var33) {
                          var36 = var42[0];
                          var37 = var42[1];
                          if (var30 < var29_int) {
                            var34 = Math.max(var30, var36);
                            var35 = Math.min(var29_int, var37);
                          } else {
                            if (var36 == 0) {
                              var34 = 0;
                              var35 = Math.min(var29_int, var37);
                            } else {
                              var34 = Math.max(var30, var36);
                              var35 = we.field_M;
                            }
                          }
                          this.a(var22 - var33, (byte) -35, var21, var33, var4, var35 - var34, var34 + var7);
                        }
                      }
                    }
                    var9 = var26_int;
                    break L3;
                  }
                  var26_int++;
                  stackIn_22_0 = ~var26_int;
                  stackIn_22_1 = ~var12;
                  if (stackIn_22_0 <= stackIn_22_1) {
                    var26_int = 0;
                  }
                  var28++;
                }
              }
              var22 = 0;
            }
            if (aa.field_Vb < var22 + var24) {
              var24 = aa.field_Vb - var22;
            } else {
              var10 = 0;
            }
            if (var25 != we.field_M) {
              incrementValue$1 = var13;
              var13++;
              var43 = var19[incrementValue$1];
              var26 = var43;
              var26[2] = var22 + var24;
              var43[0] = var8;
              var43[1] = var25;
              this.a(var24, (byte) -35, var21, var22, var4, var23, var8 + var6);
              var8 = var25;
              continue;
            }
            this.a(var24, (byte) -35, var21, var22, var4, var23, var8 + var6);
            if (var10 != 0) {
              break;
            }
            var10 = 1;
            incrementValue$0 = var13;
            var13++;
            var44 = var19[incrementValue$0];
            var26Lifetime1 = var44;
            var44[1] = var25;
            var26Lifetime1[2] = var24 + var22;
            var44[0] = var8;
            var27 = var20;
            var45 = var19;
            var19 = var27;
            var12 = var13;
            var13 = 0;
            var7 = var6;
            var6 = mj.a(-102, var21, we.field_M);
            var5 = -var7 + var6;
            var8 = 0;
            var28Lifetime1 = var5;
            if (var28Lifetime1 < 0) {
              var28Lifetime1 = var28Lifetime1 + we.field_M;
            }
            if (we.field_M < var28Lifetime1) {
              var28Lifetime1 = var28Lifetime1 - we.field_M;
            }
            var9 = 0;
            while (true) {
              var29 = var45[var9];
              if (var28Lifetime1 >= var29[0] &&
                var28Lifetime1 <= var29[1]) {
                var11 = 0;
                break;
              }
              var9++;
              stackIn_66_0 = var9;
              stackIn_66_1 = var12;
              if (stackIn_66_0 < stackIn_66_1) {
                continue;
              }
              var9 = 0;
            }
          }
        }
        return var3;
    }

    final void a(int param0) {
        if (param0 > -98) {
          r var3 = (r) null;
          lm.a((r) null, (byte) 122);
        }
    }

    private final void a(int param0, byte param1, Random param2, int param3, int[][] param4, int param5, int param6) {
        int var17 = 0;
        int dupTemp$1 = 0;
        int dupTemp$0 = 0;
        int dupTemp$2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int[] stackIn_31_0;
        int stackIn_31_1;
        int[] stackIn_31_2;
        int stackIn_31_3;
        int stackIn_32_4;
        int[] stackIn_46_0;
        int stackIn_46_1;
        int[] stackIn_46_2;
        int stackIn_46_3;
        int stackIn_47_4;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var11Lifetime2;
        var23 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != -35) {
            return;
          }
          if (this.field_J > 0) {
            stackIn_6_0 = -mj.a(-121, param2, this.field_J) + 4096;
          } else {
            stackIn_6_0 = 4096;
          }
          var8_int = stackIn_6_0;
          var9 = this.field_K * this.field_I >> 12;
          stackIn_8_0 = this.field_K;
          if (0 >= var9) {
            stackIn_9_1 = 0;
          } else {
            stackIn_9_1 = mj.a(-104, param2, var9);
          }
          var10 = stackIn_8_0 - stackIn_9_1;
          if (param6 >= we.field_M) {
            param6 = param6 - we.field_M;
          }
          if (var10 <= 0) {
            if (param6 + param5 <= we.field_M) {
              for (var11 = 0; var11 < param0; var11++) {
                qq.a(param4[param3 + var11], param6, param5, var8_int);
              }
              return;
            }
            var11Lifetime2 = -param6 + we.field_M;
            for (var12 = 0; var12 < param0; var12++) {
              var13 = param4[param3 + var12];
              qq.a(var13, param6, var11Lifetime2, var8_int);
              qq.a(var13, 0, param5 - var11Lifetime2, var8_int);
            }
            return;
          }
          if (param0 > 0 &&
            0 < param5) {
            var11Lifetime1 = param5 / 2;
            var12Lifetime1 = param0 / 2;
            stackIn_20_0 = (var10 <= var11Lifetime1) ? var10 : var11Lifetime1;
            var13_int = stackIn_20_0;
            stackIn_23_0 = (var10 <= var12Lifetime1) ? var10 : var12Lifetime1;
            var14 = stackIn_23_0;
            var15 = var13_int + param6;
            var16 = param5 - var13_int * 2;
            for (var17 = 0; var17 < param0; var17++) {
              boolean decompiledFrameRemainder0 = true;
              var18 = param4[var17 + param3];
              if (var14 <= var17) {
                var19 = param0 - var17 - 1;
                if (var19 >= var14) {
                  for (var20 = 0; var20 < var13_int; var20++) {
                    dupTemp$1 = b.a(rm.field_z, param6 + param5 - (var20 + 1));
                    var18[dupTemp$1] = var8_int * var20 / var13_int;
                    var18[b.a(rm.field_z, param6 + var20)] = var8_int * var20 / var13_int;
                  }
                  if (we.field_M >= var15 + var16) {
                    qq.a(var18, var15, var16, var8_int);
                  } else {
                    var20 = we.field_M - var15;
                    qq.a(var18, var15, var20, var8_int);
                    qq.a(var18, 0, var16 - var20, var8_int);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var20 = var19 * var8_int / var14;
                  if (this.field_z == 0) {
                    for (var21 = 0; var21 < var13_int; var21++) {
                      var22 = var8_int * var21 / var13_int;
                      dupTemp$0 = b.a(-1 + (-var21 + (param5 + param6)), rm.field_z);
                      var18[dupTemp$0] = var22 * var20 >> 12;
                      var18[b.a(var21 + param6, rm.field_z)] = var22 * var20 >> 12;
                    }
                  } else {
                    for (var21 = 0; var21 < var13_int; var21++) {
                      var22 = var8_int * var21 / var13_int;
                      stackIn_46_0 = var18;
                      stackIn_46_1 = b.a(var21 + param6, rm.field_z);
                      stackIn_46_2 = var18;
                      stackIn_46_3 = b.a(rm.field_z, -1 + (-var21 + (param5 + param6)));
                      if (var22 >= var20) {
                        stackIn_47_4 = var20;
                      } else {
                        stackIn_47_4 = var22;
                      }
                      stackIn_46_2[stackIn_46_3] = stackIn_47_4;
                      stackIn_46_0[stackIn_46_1] = stackIn_47_4;
                    }
                  }
                  if (var15 + var16 > we.field_M) {
                    var21 = -var15 + we.field_M;
                    qq.a(var18, var15, var21, var20);
                    qq.a(var18, 0, -var21 + var16, var20);
                  } else {
                    qq.a(var18, var15, var16, var20);
                  }
                }
              } else {
                var19 = var8_int * var17 / var14;
                if (this.field_z == 0) {
                  for (var20 = 0; var13_int > var20; var20++) {
                    var21 = var8_int * var20 / var13_int;
                    dupTemp$2 = b.a(-1 + (-var20 + (param5 + param6)), rm.field_z);
                    var18[dupTemp$2] = var19 * var21 >> 12;
                    var18[b.a(param6 + var20, rm.field_z)] = var19 * var21 >> 12;
                  }
                } else {
                  for (var20 = 0; var20 < var13_int; var20++) {
                    var21 = var8_int * var20 / var13_int;
                    stackIn_31_0 = var18;
                    stackIn_31_1 = b.a(rm.field_z, param6 + var20);
                    stackIn_31_2 = var18;
                    stackIn_31_3 = b.a(-1 + (param5 + (param6 - var20)), rm.field_z);
                    if (var19 <= var21) {
                      stackIn_32_4 = var19;
                    } else {
                      stackIn_32_4 = var21;
                    }
                    stackIn_31_2[stackIn_31_3] = stackIn_32_4;
                    stackIn_31_0[stackIn_31_1] = stackIn_32_4;
                  }
                }
                if (we.field_M >= var16 + var15) {
                  qq.a(var18, var15, var16, var19);
                } else {
                  var20 = we.field_M - var15;
                  qq.a(var18, var15, var20, var19);
                  qq.a(var18, 0, -var20 + var16, var19);
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_71_0 = var8;
          stackIn_71_1 = new StringBuilder().append("lm.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
    }
}
