/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gt extends k {
    private int field_u;
    private int field_t;
    private int field_q;
    static java.util.zip.CRC32 field_l;
    private int field_p;
    private int field_n;
    static kv field_s;
    static String field_r;
    private int field_m;
    private int field_o;
    private int field_w;
    private int field_k;
    private int field_v;

    public static void d(int param0) {
        field_l = null;
        int var1 = -120 / ((-48 - param0) / 58);
        field_s = null;
        field_r = null;
    }

    public gt() {
        super(0, true);
        this.field_t = 1024;
        this.field_p = 2048;
        this.field_u = 1024;
        this.field_n = 1024;
        this.field_m = 409;
        this.field_o = 1024;
        this.field_w = 0;
        this.field_k = 819;
        this.field_v = 0;
    }

    final int[] a(int param0, int param1) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
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
        int var39;
        int[][] var40;
        int[] var42;
        int[] var43;
        int[] var44;
        int[] var45;
        int[][] var46;
        int[][] var47;
        int[][] var48;
        int[] var53;
        int[] var54;
        int var28Lifetime1;
        int var31Lifetime1;
        int[] var26Lifetime1;
        var38 = BachelorFridge.field_y;
        if (param1 != 0) {
          this.field_p = 43;
        }
        var3 = this.field_j.a(param0, -1);
        if (this.field_j.field_m) {
          var47 = this.field_j.a(false);
          var40 = var47;
          var4 = var40;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 1;
          var11 = 1;
          var12 = 0;
          var13 = 0;
          var14 = this.field_n * hh.field_d >> 12;
          var15 = hh.field_d * this.field_p >> 12;
          var16 = this.field_m * bi.field_g >> 12;
          var17 = this.field_k * bi.field_g >> 12;
          if (var17 <= 1) {
            return var47[param0];
          }
          this.field_q = hh.field_d / 8 * this.field_t >> 12;
          var18 = hh.field_d / var14 + 1;
          var19 = new int[var18][3];
          var48 = new int[var18][3];
          var20 = var48;
          var21 = new Random((long)this.field_w);
          while (true) {
            var23 = kla.a(-var14 + var15, var21, -2147483648) + var14;
            var24 = kla.a(-var16 + var17, var21, -2147483648) + var16;
            var25 = var8 + var23;
            if (hh.field_d < var25) {
              var23 = -var8 + hh.field_d;
              var25 = hh.field_d;
            }
            L4: {
              if (var11 == 0) {
                var26_int = var9;
                var54 = var48[var9];
                var28 = 0;
                var29_int = var25 + var5;
                if (var29_int < 0) {
                  var29_int = var29_int + hh.field_d;
                }
                if (hh.field_d < var29_int) {
                  var29_int = var29_int - hh.field_d;
                }
                while (true) {
                  var53 = var48[var26_int];
                  if (var53[0] <= var29_int &&
                    var29_int <= var53[1]) {
                    var22 = var54[2];
                    if (var26_int != var9) {
                      var30 = var8 + var5;
                      if (var30 < 0) {
                        var30 = var30 + hh.field_d;
                      }
                      if (hh.field_d < var30) {
                        var30 = var30 - hh.field_d;
                      }
                      for (var31 = 1; var31 <= var28; var31++) {
                        var42 = var20[(var9 + var31) % var12];
                        var22 = Math.max(var22, var42[2]);
                      }
                      var39 = 0;
                      var31Lifetime1 = var39;
                      while (var39 <= var28) {
                        var43 = var20[(var9 + var39) % var12];
                        var33 = var43[2];
                        if (var33 != var22) {
                          var36 = var43[0];
                          var37 = var43[1];
                          if (var29_int > var30) {
                            var34 = Math.max(var30, var36);
                            var35 = Math.min(var29_int, var37);
                          } else {
                            if (var36 != 0) {
                              var34 = Math.max(var30, var36);
                              var35 = hh.field_d;
                            } else {
                              var34 = 0;
                              var35 = Math.min(var29_int, var37);
                            }
                          }
                          this.a(var4, var7 + var34, -1, var21, -var34 + var35, -var33 + var22, var33);
                        }
                        var39++;
                      }
                    }
                    var9 = var26_int;
                    break L4;
                  }
                  var28++;
                  var26_int++;
                  stackIn_20_0 = var12;
                  stackIn_20_1 = var26_int;
                  if (stackIn_20_0 > stackIn_20_1) {
                    continue;
                  }
                  var26_int = 0;
                }
              }
              var22 = 0;
            }
            if (var24 + var22 <= bi.field_g) {
              var10 = 0;
            } else {
              var24 = bi.field_g - var22;
            }
            if (hh.field_d != var25) {
              incrementValue$1 = var13;
              var13++;
              var44 = var19[incrementValue$1];
              var26 = var44;
              var44[0] = var8;
              var26[2] = var24 + var22;
              var44[1] = var25;
              this.a(var47, var6 + var8, -1, var21, var23, var24, var22);
              var8 = var25;
              continue;
            }
            this.a(var47, var8 + var6, -1, var21, var23, var24, var22);
            if (var10 != 0) {
              break;
            }
            var10 = 1;
            incrementValue$0 = var13;
            var13++;
            var45 = var19[incrementValue$0];
            var26Lifetime1 = var45;
            var45[1] = var25;
            var45[0] = var8;
            var26Lifetime1[2] = var24 + var22;
            var27 = var20;
            var46 = var19;
            var19 = var27;
            var12 = var13;
            var13 = 0;
            var7 = var6;
            var6 = kla.a(hh.field_d, var21, param1 + -2147483648);
            var5 = var6 - var7;
            var8 = 0;
            var28Lifetime1 = var5;
            if (var28Lifetime1 < 0) {
              var28Lifetime1 = var28Lifetime1 + hh.field_d;
            }
            if (hh.field_d < var28Lifetime1) {
              var28Lifetime1 = var28Lifetime1 - hh.field_d;
            }
            var9 = 0;
            var11 = 0;
            while (true) {
              var29 = var46[var9];
              if (var29[0] <= var28Lifetime1 &&
                var28Lifetime1 <= var29[1]) {
                break;
              }
              var9++;
              stackIn_62_0 = ~var9;
              stackIn_62_1 = ~var12;
              if (stackIn_62_0 > stackIn_62_1) {
                continue;
              }
              var9 = 0;
            }
          }
        }
        return var3;
    }

    private final void a(int[][] param0, int param1, int param2, Random param3, int param4, int param5, int param6) {
        int var17 = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int[] stackIn_29_0;
        int stackIn_29_1;
        int[] stackIn_29_2;
        int stackIn_29_3;
        int stackIn_30_4;
        int[] stackIn_35_0;
        int stackIn_35_1;
        int[] stackIn_35_2;
        int stackIn_35_3;
        int stackIn_35_4;
        int[] stackIn_45_0;
        int stackIn_45_1;
        int[] stackIn_45_2;
        int stackIn_45_3;
        int stackIn_46_4;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
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
        var23 = BachelorFridge.field_y;
        try {
          if (~this.field_u < param2) {
            stackIn_4_0 = 4096 - kla.a(this.field_u, param3, -2147483648);
          } else {
            stackIn_4_0 = 4096;
          }
          var8_int = stackIn_4_0;
          var9 = this.field_q * this.field_o >> 12;
          stackIn_6_0 = this.field_q;
          if (0 >= var9) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = kla.a(var9, param3, -2147483648);
          }
          var10 = stackIn_6_0 - stackIn_7_1;
          if (hh.field_d <= param1) {
            param1 = param1 - hh.field_d;
          }
          if (var10 <= 0) {
            if (hh.field_d >= param1 + param4) {
              for (var11 = 0; var11 < param5; var11++) {
                bl.a(param0[param6 + var11], param1, param4, var8_int);
              }
              return;
            }
            var11Lifetime2 = hh.field_d - param1;
            for (var12 = 0; var12 < param5; var12++) {
              var13 = param0[param6 + var12];
              bl.a(var13, param1, var11Lifetime2, var8_int);
              bl.a(var13, 0, param4 - var11Lifetime2, var8_int);
            }
            return;
          }
          if (param5 > 0 &&
            param4 > 0) {
            var11Lifetime1 = param4 / 2;
            var12Lifetime1 = param5 / 2;
            stackIn_17_0 = (var11Lifetime1 < var10) ? var11Lifetime1 : var10;
            var13_int = stackIn_17_0;
            stackIn_20_0 = (var12Lifetime1 >= var10) ? var10 : var12Lifetime1;
            var14 = stackIn_20_0;
            var15 = param1 + var13_int;
            var16 = -(var13_int * 2) + param4;
            for (var17 = 0; param5 > var17; var17++) {
              boolean decompiledFrameRemainder0 = true;
              var18 = param0[param6 + var17];
              if (var14 > var17) {
                var19 = var17 * var8_int / var14;
                if (this.field_v == 0) {
                  for (var20 = 0; var13_int > var20; var20++) {
                    var21 = var8_int * var20 / var13_int;
                    stackIn_35_0 = var18;
                    stackIn_35_1 = dda.a(wp.field_r, param1 + var20);
                    stackIn_35_2 = var18;
                    stackIn_35_3 = dda.a(wp.field_r, -1 + param4 + (param1 - var20));
                    stackIn_35_4 = var19 * var21 >> 12;
                    stackIn_35_2[stackIn_35_3] = stackIn_35_4;
                    stackIn_35_0[stackIn_35_1] = stackIn_35_4;
                  }
                } else {
                  for (var20 = 0; var20 < var13_int; var20++) {
                    var21 = var20 * var8_int / var13_int;
                    stackIn_29_0 = var18;
                    stackIn_29_1 = dda.a(var20 + param1, wp.field_r);
                    stackIn_29_2 = var18;
                    stackIn_29_3 = dda.a(-1 - var20 + (param4 + param1), wp.field_r);
                    if (var21 >= var19) {
                      stackIn_30_4 = var19;
                    } else {
                      stackIn_30_4 = var21;
                    }
                    stackIn_29_2[stackIn_29_3] = stackIn_30_4;
                    stackIn_29_0[stackIn_29_1] = stackIn_30_4;
                  }
                }
                if (var16 + var15 > hh.field_d) {
                  var20 = -var15 + hh.field_d;
                  bl.a(var18, var15, var20, var19);
                  bl.a(var18, 0, -var20 + var16, var19);
                } else {
                  bl.a(var18, var15, var16, var19);
                }
              } else {
                var19 = param5 - var17 - 1;
                if (var14 <= var19) {
                  for (var20 = 0; var13_int > var20; var20++) {
                    dupTemp$0 = dda.a(-var20 + param1 - (-param4 + 1), wp.field_r);
                    var18[dupTemp$0] = var8_int * var20 / var13_int;
                    var18[dda.a(var20 + param1, wp.field_r)] = var8_int * var20 / var13_int;
                  }
                  if (var16 + var15 <= hh.field_d) {
                    bl.a(var18, var15, var16, var8_int);
                  } else {
                    var20 = -var15 + hh.field_d;
                    bl.a(var18, var15, var20, var8_int);
                    bl.a(var18, 0, -var20 + var16, var8_int);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var20 = var19 * var8_int / var14;
                  if (this.field_v == 0) {
                    for (var21 = 0; var21 < var13_int; var21++) {
                      var22 = var21 * var8_int / var13_int;
                      dupTemp$1 = dda.a(wp.field_r, -var21 + param1 + param4 - 1);
                      var18[dupTemp$1] = var22 * var20 >> 12;
                      var18[dda.a(wp.field_r, param1 + var21)] = var22 * var20 >> 12;
                    }
                  } else {
                    for (var21 = 0; var13_int > var21; var21++) {
                      var22 = var21 * var8_int / var13_int;
                      stackIn_45_0 = var18;
                      stackIn_45_1 = dda.a(wp.field_r, param1 + var21);
                      stackIn_45_2 = var18;
                      stackIn_45_3 = dda.a(wp.field_r, -1 + param4 + (param1 - var21));
                      if (var22 >= var20) {
                        stackIn_46_4 = var20;
                      } else {
                        stackIn_46_4 = var22;
                      }
                      stackIn_45_2[stackIn_45_3] = stackIn_46_4;
                      stackIn_45_0[stackIn_45_1] = stackIn_46_4;
                    }
                  }
                  if (hh.field_d >= var15 + var16) {
                    bl.a(var18, var15, var16, var20);
                  } else {
                    var21 = -var15 + hh.field_d;
                    bl.a(var18, var15, var21, var20);
                    bl.a(var18, 0, -var21 + var16, var20);
                  }
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_70_0 = var8;
          stackIn_70_1 = new StringBuilder().append("gt.F(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(byte param0, lu param1, int param2) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          var4_int = param2;
          if (0 != var4_int) {
            if (var4_int == 1) {
              this.field_n = param1.e((byte) 56);
            } else {
              if (var4_int != 2) {
                if (var4_int == 3) {
                  this.field_m = param1.e((byte) 82);
                } else {
                  if (4 != var4_int) {
                    if (var4_int == 5) {
                      this.field_t = param1.e((byte) 80);
                    } else {
                      if (var4_int != 6) {
                        if (var4_int == 7) {
                          this.field_o = param1.e((byte) 104);
                        } else {
                          if (var4_int == 8) {
                            this.field_u = param1.e((byte) 106);
                          }
                        }
                      } else {
                        this.field_v = param1.b(16711935);
                      }
                    }
                  } else {
                    this.field_k = param1.e((byte) 84);
                  }
                }
              } else {
                this.field_p = param1.e((byte) 64);
              }
            }
          } else {
            this.field_w = param1.b(param0 ^ -16711866);
          }
          if (param0 != -71) {
            this.field_k = -21;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("gt.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(int param0, byte[] param1, byte param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          var12 = new char[param3];
          var11 = var12;
          var4 = var11;
          var5 = 0;
          if (param2 != 104) {
            var10 = (byte[]) null;
            gt.a(15, (byte[]) null, (byte) 43, 15);
          }
          for (var6 = 0; var6 < param3; var6++) {
            var7 = 255 & param1[var6 + param0];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = on.field_s[var7 - 128];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_17_0 = new String(var12, 0, var5);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("gt.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(byte param0) {
        if (param0 != -68) {
          field_s = (kv) null;
        }
    }

    static {
        field_r = "Accept draw";
        field_l = new java.util.zip.CRC32();
    }
}
