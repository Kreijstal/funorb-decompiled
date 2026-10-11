/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class iia extends ci {
    static String field_q;
    private int field_u;
    private int field_p;
    private int field_w;
    static int[] field_v;
    private int field_y;
    private int field_s;
    private int field_x;
    private int field_m;
    private int field_n;
    private int field_o;
    static jea field_r;
    private int field_t;

    private final void a(int param0, int param1, int[][] param2, byte param3, int param4, int param5, Random param6) {
        int var17 = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int[] stackIn_41_0;
        int stackIn_41_1;
        int[] stackIn_41_2;
        int stackIn_41_3;
        int stackIn_42_4;
        int[] stackIn_52_0;
        int stackIn_52_1;
        int[] stackIn_52_2;
        int stackIn_52_3;
        int stackIn_53_4;
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
        int var13 = 0;
        int[] var13_ref_int__ = null;
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
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_m <= 0) {
            stackIn_4_0 = 4096;
          } else {
            stackIn_4_0 = 4096 - jqa.a(this.field_m, param6, 66);
          }
          var8_int = stackIn_4_0;
          var9 = this.field_u * this.field_o >> 12;
          stackIn_6_0 = this.field_o;
          if (var9 > 0) {
            stackIn_7_1 = jqa.a(var9, param6, 83);
          } else {
            stackIn_7_1 = 0;
          }
          var10 = stackIn_6_0 - stackIn_7_1;
          if (param3 > -30) {
            this.field_y = -123;
          }
          if (ns.field_g <= param1) {
            param1 = param1 - ns.field_g;
          }
          if (0 >= var10) {
            if (ns.field_g >= param1 + param4) {
              for (var11 = 0; var11 < param0; var11++) {
                lua.a(param2[param5 + var11], param1, param4, var8_int);
              }
              return;
            }
            var11Lifetime2 = -param1 + ns.field_g;
            for (var12 = 0; param0 > var12; var12++) {
              var13_ref_int__ = param2[var12 + param5];
              lua.a(var13_ref_int__, param1, var11Lifetime2, var8_int);
              lua.a(var13_ref_int__, 0, param4 - var11Lifetime2, var8_int);
            }
            return;
          }
          if (param0 > 0 &&
            param4 > 0) {
            var11Lifetime1 = param4 / 2;
            var12Lifetime1 = param0 / 2;
            stackIn_27_0 = (var11Lifetime1 < var10) ? var11Lifetime1 : var10;
            var13 = stackIn_27_0;
            stackIn_30_0 = (var12Lifetime1 < var10) ? var12Lifetime1 : var10;
            var14 = stackIn_30_0;
            var15 = param1 + var13;
            var16 = -(2 * var13) + param4;
            for (var17 = 0; var17 < param0; var17++) {
              boolean decompiledFrameRemainder0 = true;
              var18 = param2[var17 + param5];
              if (var14 <= var17) {
                var19 = -var17 + param0 - 1;
                if (var14 <= var19) {
                  for (var20 = 0; var13 > var20; var20++) {
                    dupTemp$0 = sea.c(una.field_b, -var20 + param4 + param1 - 1);
                    var18[dupTemp$0] = var8_int * var20 / var13;
                    var18[sea.c(una.field_b, param1 + var20)] = var8_int * var20 / var13;
                  }
                  if (var16 + var15 <= ns.field_g) {
                    lua.a(var18, var15, var16, var8_int);
                  } else {
                    var20 = ns.field_g - var15;
                    lua.a(var18, var15, var20, var8_int);
                    lua.a(var18, 0, -var20 + var16, var8_int);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var20 = var8_int * var19 / var14;
                  if (this.field_t == 0) {
                    for (var21 = 0; var21 < var13; var21++) {
                      var22 = var21 * var8_int / var13;
                      dupTemp$1 = sea.c(una.field_b, -1 + param4 + param1 - var21);
                      var18[dupTemp$1] = var20 * var22 >> 12;
                      var18[sea.c(var21 + param1, una.field_b)] = var20 * var22 >> 12;
                    }
                  } else {
                    for (var21 = 0; var13 > var21; var21++) {
                      var22 = var8_int * var21 / var13;
                      stackIn_52_0 = var18;
                      stackIn_52_1 = sea.c(param1 + var21, una.field_b);
                      stackIn_52_2 = var18;
                      stackIn_52_3 = sea.c(-1 - var21 + param1 + param4, una.field_b);
                      if (var22 < var20) {
                        stackIn_53_4 = var22;
                      } else {
                        stackIn_53_4 = var20;
                      }
                      stackIn_52_2[stackIn_52_3] = stackIn_53_4;
                      stackIn_52_0[stackIn_52_1] = stackIn_53_4;
                    }
                  }
                  if (var16 + var15 > ns.field_g) {
                    var21 = -var15 + ns.field_g;
                    lua.a(var18, var15, var21, var20);
                    lua.a(var18, 0, -var21 + var16, var20);
                  } else {
                    lua.a(var18, var15, var16, var20);
                  }
                }
              } else {
                var19 = var17 * var8_int / var14;
                if (this.field_t == 0) {
                  for (var20 = 0; var13 > var20; var20++) {
                    var21 = var8_int * var20 / var13;
                    dupTemp$2 = sea.c(-var20 + (param4 + (param1 - 1)), una.field_b);
                    var18[dupTemp$2] = var21 * var19 >> 12;
                    var18[sea.c(var20 + param1, una.field_b)] = var21 * var19 >> 12;
                  }
                } else {
                  for (var20 = 0; var20 < var13; var20++) {
                    var21 = var8_int * var20 / var13;
                    stackIn_41_0 = var18;
                    stackIn_41_1 = sea.c(var20 + param1, una.field_b);
                    stackIn_41_2 = var18;
                    stackIn_41_3 = sea.c(-var20 + (param1 + param4 - 1), una.field_b);
                    if (var21 < var19) {
                      stackIn_42_4 = var21;
                    } else {
                      stackIn_42_4 = var19;
                    }
                    stackIn_41_2[stackIn_41_3] = stackIn_42_4;
                    stackIn_41_0[stackIn_41_1] = stackIn_42_4;
                  }
                }
                if (ns.field_g >= var15 + var16) {
                  lua.a(var18, var15, var16, var19);
                } else {
                  var20 = -var15 + ns.field_g;
                  lua.a(var18, var15, var20, var19);
                  lua.a(var18, 0, var16 - var20, var19);
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
          stackIn_70_1 = new StringBuilder().append("iia.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final static int d(int param0, int param1) {
        int var2_int = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 != 22972) {
            stackIn_2_0 = -94;
            return stackIn_2_0;
          }
          for (var2_int = 1; 1 << var2_int <= param0; var2_int++) {
          }
          stackIn_7_0 = var2_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "iia.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int d(int param0, int param1, int param2) {
        if (param2 != 2) {
          return 39;
        }
        if (param0 >= param1) {
          return param0;
        }
        return param1;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 107) {
            this.field_y = 101;
          }
          var4_int = param2;
          if (var4_int != 0) {
            if (1 == var4_int) {
              this.field_p = param1.d(param0 ^ 21);
            } else {
              if (2 != var4_int) {
                if (var4_int != 3) {
                  if (4 == var4_int) {
                    this.field_w = param1.d(126);
                  } else {
                    if (5 == var4_int) {
                      this.field_n = param1.d(122);
                    } else {
                      if (var4_int == 6) {
                        this.field_t = param1.h(255);
                      } else {
                        if (var4_int == 7) {
                          this.field_u = param1.d(125);
                        } else {
                          if (8 == var4_int) {
                            this.field_m = param1.d(126);
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.field_y = param1.d(param0 ^ 22);
                }
              } else {
                this.field_s = param1.d(124);
              }
            }
          } else {
            this.field_x = param1.h(255);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("iia.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
        }
    }

    public iia() {
        super(0, true);
        this.field_s = 2048;
        this.field_p = 1024;
        this.field_x = 0;
        this.field_w = 819;
        this.field_y = 409;
        this.field_n = 1024;
        this.field_m = 1024;
        this.field_t = 0;
        this.field_u = 1024;
    }

    final void b(byte param0) {
        if (param0 != 116) {
          this.field_t = 123;
        }
    }

    final int[] c(int param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
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
        int[][] var44;
        int[] var45;
        int[][] var46;
        int[][] var47;
        int[] var52;
        int[] var53;
        int var28Lifetime1;
        int var31Lifetime1;
        int[] var26Lifetime1;
        var38 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          return (int[]) null;
        }
        var3 = this.field_i.a((byte) 120, param1);
        if (this.field_i.field_d) {
          var46 = this.field_i.a(param0 ^ 1);
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
          var14 = this.field_p * ns.field_g >> 12;
          var15 = ns.field_g * this.field_s >> 12;
          var16 = qda.field_i * this.field_y >> 12;
          var17 = this.field_w * qda.field_i >> 12;
          if (var17 <= 1) {
            return var46[param1];
          }
          this.field_o = ns.field_g / 8 * this.field_n >> 12;
          var18 = ns.field_g / var14 + 1;
          var19 = new int[var18][3];
          var47 = new int[var18][3];
          var20 = var47;
          var21 = new Random((long)this.field_x);
          while (true) {
            var23 = var14 + jqa.a(-var14 + var15, var21, 126);
            var24 = var16 + jqa.a(-var16 + var17, var21, 96);
            var25 = var8 + var23;
            if (ns.field_g < var25) {
              var25 = ns.field_g;
              var23 = ns.field_g - var8;
            }
            L3: {
              if (var11 == 0) {
                var26_int = var9;
                var53 = var47[var9];
                var28 = 0;
                var29_int = var5 + var25;
                if (0 > var29_int) {
                  var29_int = var29_int + ns.field_g;
                }
                if (ns.field_g < var29_int) {
                  var29_int = var29_int - ns.field_g;
                }
                while (true) {
                  var52 = var47[var26_int];
                  if (var29_int >= var52[0] &&
                    var52[1] >= var29_int) {
                    var22 = var53[2];
                    if (var9 != var26_int) {
                      var30 = var5 + var8;
                      if (var30 < 0) {
                        var30 = var30 + ns.field_g;
                      }
                      if (ns.field_g < var30) {
                        var30 = var30 - ns.field_g;
                      }
                      for (var31 = 1; var31 <= var28; var31++) {
                        var41 = var20[(var9 + var31) % var12];
                        var22 = Math.max(var22, var41[2]);
                      }
                      for (var31Lifetime1 = 0; var31Lifetime1 <= var28; var31Lifetime1++) {
                        var42 = var20[(var9 + var31Lifetime1) % var12];
                        var33 = var42[2];
                        if (~var33 != ~var22) {
                          var36 = var42[0];
                          var37 = var42[1];
                          if (var30 >= var29_int) {
                            if (var36 == 0) {
                              var34 = 0;
                              var35 = Math.min(var29_int, var37);
                            } else {
                              var34 = Math.max(var30, var36);
                              var35 = ns.field_g;
                            }
                          } else {
                            var34 = Math.max(var30, var36);
                            var35 = Math.min(var29_int, var37);
                          }
                          this.a(-var33 + var22, var7 + var34, var4, (byte) -86, -var34 + var35, var33, var21);
                        }
                      }
                    }
                    var9 = var26_int;
                    break L3;
                  }
                  var28++;
                  var26_int++;
                  stackIn_21_0 = var26_int;
                  stackIn_21_1 = var12;
                  if (stackIn_21_0 < stackIn_21_1) {
                    continue;
                  }
                  var26_int = 0;
                }
              }
              var22 = 0;
            }
            if (var24 + var22 > qda.field_i) {
              var24 = qda.field_i - var22;
            } else {
              var10 = 0;
            }
            if (ns.field_g != var25) {
              incrementValue$0 = var13;
              var13++;
              var45 = var19[incrementValue$0];
              var26 = var45;
              var45[0] = var8;
              var45[1] = var25;
              var26[2] = var22 + var24;
              this.a(var24, var8 + var6, var46, (byte) -99, var23, var22, var21);
              var8 = var25;
              continue;
            }
            this.a(var24, var8 + var6, var46, (byte) -81, var23, var22, var21);
            if (var10 != 0) {
              break;
            }
            var10 = 1;
            incrementValue$1 = var13;
            var13++;
            var43 = var19[incrementValue$1];
            var26Lifetime1 = var43;
            var26Lifetime1[2] = var22 + var24;
            var43[0] = var8;
            var43[1] = var25;
            var27 = var20;
            var44 = var19;
            var19 = var27;
            var12 = var13;
            var7 = var6;
            var13 = 0;
            var6 = jqa.a(ns.field_g, var21, 71);
            var5 = var6 - var7;
            var8 = 0;
            var28Lifetime1 = var5;
            if (var28Lifetime1 < 0) {
              var28Lifetime1 = var28Lifetime1 + ns.field_g;
            }
            if (ns.field_g < var28Lifetime1) {
              var28Lifetime1 = var28Lifetime1 - ns.field_g;
            }
            var9 = 0;
            var11 = 0;
            while (true) {
              var29 = var44[var9];
              if (var28Lifetime1 >= var29[0] &&
                var28Lifetime1 <= var29[1]) {
                break;
              }
              var9++;
              stackIn_63_0 = ~var9;
              stackIn_63_1 = ~var12;
              if (stackIn_63_0 > stackIn_63_1) {
                continue;
              }
              var9 = 0;
            }
          }
        }
        return var3;
    }

    public static void c(int param0) {
        field_r = null;
        if (param0 != -1) {
          return;
        }
        field_q = null;
        field_v = null;
    }

    static {
        field_q = "You cannot add yourself!";
        field_v = new int[8192];
    }
}
