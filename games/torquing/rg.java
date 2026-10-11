/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rg extends am {
    private int field_B;
    static la field_v;
    private int field_A;
    private int field_s;
    private int field_w;
    private int field_y;
    private int field_z;
    private int field_u;
    private int field_x;
    static String field_C;
    private int field_D;
    private int field_t;

    final int[] a(byte param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
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
        fj var39;
        int[][] var40;
        int[] var42;
        int[] var43;
        int[] var44;
        int[][] var45;
        int[] var46;
        int[][] var47;
        int[][] var48;
        int[] var53;
        int[] var54;
        int var28Lifetime1;
        int var31Lifetime1;
        int[] var26Lifetime1;
        int[][] var48Lifetime1;
        var38 = Torquing.field_u;
        var3 = this.field_l.a(param1, 25657);
        if (param0 < 86) {
          var39 = (fj) null;
          this.a((fj) null, 116, -30);
        }
        if (this.field_l.field_b) {
          var47 = this.field_l.a(0);
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
          var14 = ci.field_c * this.field_y >> 12;
          var15 = this.field_t * ci.field_c >> 12;
          var16 = um.field_o * this.field_A >> 12;
          var17 = um.field_o * this.field_D >> 12;
          if (var17 <= 1) {
            return var47[param1];
          }
          this.field_s = ci.field_c / 8 * this.field_w >> 12;
          var18 = 1 + ci.field_c / var14;
          var19 = new int[var18][3];
          var48 = new int[var18][3];
          var20 = var48;
          var21 = new Random((long)this.field_B);
          while (true) {
            var23 = va.a(-var14 + var15, (byte) 126, var21) + var14;
            var24 = va.a(-var16 + var17, (byte) 125, var21) + var16;
            var25 = var8 + var23;
            if (var25 > ci.field_c) {
              var23 = ci.field_c - var8;
              var25 = ci.field_c;
            }
            L4: {
              if (var11 == 0) {
                var48Lifetime1 = var20;
                var26_int = var9;
                var53 = var48Lifetime1[var9];
                var28 = 0;
                var29_int = var5 + var25;
                if (var29_int < 0) {
                  var29_int = var29_int + ci.field_c;
                }
                if (var29_int > ci.field_c) {
                  var29_int = var29_int - ci.field_c;
                }
                var22 = var53[2];
                while (true) {
                  var54 = var48Lifetime1[var26_int];
                  if (var29_int >= var54[0] &&
                    var29_int <= var54[1]) {
                    if (var26_int != var9) {
                      var30 = var5 + var8;
                      if (0 > var30) {
                        var30 = var30 + ci.field_c;
                      }
                      if (var30 > ci.field_c) {
                        var30 = var30 - ci.field_c;
                      }
                      for (var31 = 1; var28 >= var31; var31++) {
                        var42 = var20[(var9 + var31) % var12];
                        var22 = Math.max(var22, var42[2]);
                      }
                      for (var31Lifetime1 = 0; var31Lifetime1 <= var28; var31Lifetime1++) {
                        var43 = var20[(var9 + var31Lifetime1) % var12];
                        var33 = var43[2];
                        if (var33 != var22) {
                          var36 = var43[0];
                          var37 = var43[1];
                          if (var29_int <= var30) {
                            if (var36 == 0) {
                              var34 = 0;
                              var35 = Math.min(var29_int, var37);
                            } else {
                              var34 = Math.max(var30, var36);
                              var35 = ci.field_c;
                            }
                          } else {
                            var34 = Math.max(var30, var36);
                            var35 = Math.min(var29_int, var37);
                          }
                          this.a(var21, var34 + var7, var33, -82, var4, var35 - var34, var22 - var33);
                        }
                      }
                    }
                    var9 = var26_int;
                    break L4;
                  }
                  var28++;
                  var26_int++;
                  stackIn_23_0 = var12;
                  stackIn_23_1 = var26_int;
                  if (stackIn_23_0 > stackIn_23_1) {
                    continue;
                  }
                  var26_int = 0;
                }
              }
              var22 = 0;
            }
            if (um.field_o < var24 + var22) {
              var24 = um.field_o - var22;
            } else {
              var10 = 0;
            }
            if (var25 != ci.field_c) {
              incrementValue$0 = var13;
              var13++;
              var46 = var19[incrementValue$0];
              var26 = var46;
              var26[2] = var24 + var22;
              var46[0] = var8;
              var46[1] = var25;
              this.a(var21, var8 + var6, var22, -84, var47, var23, var24);
              var8 = var25;
              continue;
            }
            this.a(var21, var6 + var8, var22, 116, var47, var23, var24);
            if (var10 != 0) {
              break;
            }
            var10 = 1;
            incrementValue$1 = var13;
            var13++;
            var44 = var19[incrementValue$1];
            var26Lifetime1 = var44;
            var44[1] = var25;
            var44[0] = var8;
            var26Lifetime1[2] = var24 + var22;
            var27 = var20;
            var45 = var19;
            var19 = var27;
            var12 = var13;
            var13 = 0;
            var7 = var6;
            var6 = va.a(ci.field_c, (byte) 125, var21);
            var8 = 0;
            var5 = var6 - var7;
            var28Lifetime1 = var5;
            if (0 > var28Lifetime1) {
              var28Lifetime1 = var28Lifetime1 + ci.field_c;
            }
            if (var28Lifetime1 > ci.field_c) {
              var28Lifetime1 = var28Lifetime1 - ci.field_c;
            }
            var9 = 0;
            while (true) {
              var29 = var45[var9];
              if (var29[0] <= var28Lifetime1 &&
                var28Lifetime1 <= var29[1]) {
                var11 = 0;
                break;
              }
              var9++;
              stackIn_64_0 = ~var12;
              stackIn_64_1 = ~var9;
              if (stackIn_64_0 < stackIn_64_1) {
                continue;
              }
              var9 = 0;
            }
          }
        }
        return var3;
    }

    private final void a(Random param0, int param1, int param2, int param3, int[][] param4, int param5, int param6) {
        int var17 = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int[] stackIn_36_0;
        int stackIn_36_1;
        int[] stackIn_36_2;
        int stackIn_36_3;
        int stackIn_37_4;
        int[] stackIn_50_0;
        int stackIn_50_1;
        int[] stackIn_50_2;
        int stackIn_50_3;
        int stackIn_51_4;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
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
        var23 = Torquing.field_u;
        try {
          if (this.field_u > 0) {
            stackIn_4_0 = -va.a(this.field_u, (byte) 125, param0) + 4096;
          } else {
            stackIn_4_0 = 4096;
          }
          var8_int = stackIn_4_0;
          var9 = this.field_s * this.field_z >> 12;
          stackIn_6_0 = this.field_s;
          if (0 < var9) {
            stackIn_7_1 = va.a(var9, (byte) 125, param0);
          } else {
            stackIn_7_1 = 0;
          }
          var10 = stackIn_6_0 - stackIn_7_1;
          if (ci.field_c <= param1) {
            param1 = param1 - ci.field_c;
          }
          if (var10 <= 0) {
            if (ci.field_c >= param5 + param1) {
              for (var11 = 0; param6 > var11; var11++) {
                dk.a(param4[param2 + var11], param1, param5, var8_int);
              }
            } else {
              var11 = -param1 + ci.field_c;
              for (var12 = 0; param6 > var12; var12++) {
                var13_ref_int__ = param4[var12 + param2];
                dk.a(var13_ref_int__, param1, var11, var8_int);
                dk.a(var13_ref_int__, 0, -var11 + param5, var8_int);
              }
            }
          } else if (param6 > 0 &&
            param5 > 0) {
            var11 = param5 / 2;
            var12 = param6 / 2;
            stackIn_25_0 = (var10 > var11) ? var11 : var10;
            var13 = stackIn_25_0;
            stackIn_28_0 = (var12 >= var10) ? var10 : var12;
            var14 = stackIn_28_0;
            var15 = param1 + var13;
            var16 = -(var13 * 2) + param5;
            for (var17 = 0; var17 < param6; var17++) {
              boolean decompiledFrameRemainder0 = true;
              var18 = param4[var17 + param2];
              if (var14 <= var17) {
                var19 = param6 + (-var17 - 1);
                if (var19 >= var14) {
                  for (var20 = 0; var20 < var13; var20++) {
                    dupTemp$0 = ie.a(-1 + (param1 + param5) - var20, jh.field_A);
                    var18[dupTemp$0] = var8_int * var20 / var13;
                    var18[ie.a(jh.field_A, var20 + param1)] = var8_int * var20 / var13;
                  }
                  if (var16 + var15 <= ci.field_c) {
                    dk.a(var18, var15, var16, var8_int);
                  } else {
                    var20 = -var15 + ci.field_c;
                    dk.a(var18, var15, var20, var8_int);
                    dk.a(var18, 0, var16 - var20, var8_int);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var20 = var8_int * var19 / var14;
                  if (0 == this.field_x) {
                    for (var21 = 0; var13 > var21; var21++) {
                      var22 = var8_int * var21 / var13;
                      dupTemp$1 = ie.a(jh.field_A, -1 + param1 - (-param5 + var21));
                      var18[dupTemp$1] = var20 * var22 >> 12;
                      var18[ie.a(jh.field_A, var21 + param1)] = var20 * var22 >> 12;
                    }
                  } else {
                    for (var21 = 0; var21 < var13; var21++) {
                      var22 = var21 * var8_int / var13;
                      stackIn_50_0 = var18;
                      stackIn_50_1 = ie.a(var21 + param1, jh.field_A);
                      stackIn_50_2 = var18;
                      stackIn_50_3 = ie.a(-var21 + (param1 + param5 - 1), jh.field_A);
                      if (var22 >= var20) {
                        stackIn_51_4 = var20;
                      } else {
                        stackIn_51_4 = var22;
                      }
                      stackIn_50_2[stackIn_50_3] = stackIn_51_4;
                      stackIn_50_0[stackIn_50_1] = stackIn_51_4;
                    }
                  }
                  if (ci.field_c >= var16 + var15) {
                    dk.a(var18, var15, var16, var20);
                  } else {
                    var21 = ci.field_c - var15;
                    dk.a(var18, var15, var21, var20);
                    dk.a(var18, 0, -var21 + var16, var20);
                  }
                }
              } else {
                var19 = var8_int * var17 / var14;
                if (0 == this.field_x) {
                  for (var20 = 0; var13 > var20; var20++) {
                    var21 = var8_int * var20 / var13;
                    dupTemp$2 = ie.a(param1 + (param5 - var20 - 1), jh.field_A);
                    var18[dupTemp$2] = var21 * var19 >> 12;
                    var18[ie.a(jh.field_A, param1 + var20)] = var21 * var19 >> 12;
                  }
                } else {
                  for (var20 = 0; var20 < var13; var20++) {
                    var21 = var20 * var8_int / var13;
                    stackIn_36_0 = var18;
                    stackIn_36_1 = ie.a(param1 + var20, jh.field_A);
                    stackIn_36_2 = var18;
                    stackIn_36_3 = ie.a(-1 + (param1 + param5) - var20, jh.field_A);
                    if (var21 >= var19) {
                      stackIn_37_4 = var19;
                    } else {
                      stackIn_37_4 = var21;
                    }
                    stackIn_36_2[stackIn_36_3] = stackIn_37_4;
                    stackIn_36_0[stackIn_36_1] = stackIn_37_4;
                  }
                }
                if (ci.field_c < var16 + var15) {
                  var20 = -var15 + ci.field_c;
                  dk.a(var18, var15, var20, var19);
                  dk.a(var18, 0, var16 - var20, var19);
                } else {
                  dk.a(var18, var15, var16, var19);
                }
              }
            }
          } else {
            return;
          }
          var11Lifetime1 = 33 / ((70 - param3) / 45);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_69_0 = var8;
          stackIn_69_1 = new StringBuilder().append("rg.A(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public rg() {
        super(0, true);
        this.field_B = 0;
        this.field_A = 409;
        this.field_z = 1024;
        this.field_w = 1024;
        this.field_x = 0;
        this.field_u = 1024;
        this.field_D = 819;
        this.field_t = 2048;
        this.field_y = 1024;
    }

    final void a(byte param0) {
        if (param0 < 123) {
          rg.b(114);
        }
    }

    final void a(fj param0, int param1, int param2) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = Torquing.field_u;
        try {
          if (param1 != 35) {
            return;
          }
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_y = param0.i(param1 + 7053);
            } else {
              if (var4_int == 2) {
                this.field_t = param0.i(7088);
              } else {
                if (var4_int == 3) {
                  this.field_A = param0.i(param1 + 7053);
                } else {
                  if (var4_int != 4) {
                    if (var4_int != 5) {
                      if (var4_int != 6) {
                        if (var4_int == 7) {
                          this.field_z = param0.i(7088);
                        } else {
                          if (8 == var4_int) {
                            this.field_u = param0.i(7088);
                          }
                        }
                      } else {
                        this.field_x = param0.i((byte) -101);
                      }
                    } else {
                      this.field_w = param0.i(7088);
                    }
                  } else {
                    this.field_D = param0.i(7088);
                  }
                }
              }
            }
          } else {
            this.field_B = param0.i((byte) -101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("rg.H(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static uh a(boolean param0) {
        if (!param0) {
          return (uh) null;
        }
        return tn.field_l;
    }

    public static void b(int param0) {
        field_C = null;
        if (param0 != 31635) {
          field_C = (String) null;
        }
        field_v = null;
    }

    final static void a(int param0, int param1, of param2, int param3, byte param4, int param5, int param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        jb stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        jb var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        of var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = Torquing.field_u;
        try {
          var45 = param2;
          if (var45.field_i != null &&
            var45.field_M > 1) {
            var61 = var45.field_i;
            rk.a(var61, a.field_f, 0, (byte) -122, 0);
          } else {
            mc.c(1559487076);
          }
          var55 = new int[param2.field_C];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param2.field_C];
          var63 = m.field_c;
          var62 = pm.field_s;
          var64 = tm.field_e;
          for (var13 = 0; param2.field_C > var13; var13++) {
            var14 = var62[var13] * param7 + (var63[var13] * param0 + param3 * var64[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_15_0 = 128;
            } else {
              if (var14 >= 128) {
                stackIn_15_0 = 256;
              } else {
                stackIn_15_0 = var14 + 128;
              }
            }
            var14Lifetime2 = stackIn_15_0;
            var15 = param1 * var64[var13] + param5 * var62[var13] + var63[var13] * param6 >> 8;
            stackIn_17_0 = id.field_c;
            if (var15 >= 0) {
              stackIn_18_1 = var15;
            } else {
              stackIn_18_1 = -var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime2 = (256 - var15Lifetime2) * var14Lifetime2 >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          if (param4 < 120) {
            field_v = (la) null;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (var44 < ui.field_k) {
            var14Lifetime1 = mn.field_bb[var44];
            var15Lifetime1 = param2.field_G[var14Lifetime1];
            var16 = param2.field_r[var14Lifetime1];
            var17 = param2.field_I[var14Lifetime1];
            if (param2.field_O[var14Lifetime1] < m.field_c.length) {
              stackIn_26_0 = param2.field_O[var14Lifetime1];
            } else {
              stackIn_26_0 = -1;
            }
            var18 = stackIn_26_0;
            if (m.field_c.length > param2.field_J[var14Lifetime1]) {
              stackIn_29_0 = param2.field_J[var14Lifetime1];
            } else {
              stackIn_29_0 = -1;
            }
            var19 = stackIn_29_0;
            if (m.field_c.length <= param2.field_F[var14Lifetime1]) {
              stackIn_32_0 = -1;
            } else {
              stackIn_32_0 = param2.field_F[var14Lifetime1];
            }
            var20 = stackIn_32_0;
            if (null != ha.field_d &&
              param2.field_c != null &&
              param2.field_c.length > var14Lifetime1 &&
              param2.field_c[var14Lifetime1] != -1 &&
              ha.field_d.length > param2.field_c[var14Lifetime1]) {
              stackIn_39_0 = ha.field_d[param2.field_c[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = kh.field_m[var15Lifetime1];
            var23 = u.field_w[var15Lifetime1];
            var24 = kh.field_m[var16];
            var25 = u.field_w[var16];
            var26 = kh.field_m[var17];
            var27 = u.field_w[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 != null) {
                stackIn_49_0 = var21.field_a;
              } else {
                stackIn_49_0 = 8355711;
              }
              var30 = stackIn_49_0;
              var31 = 16711935 & var30;
              var32 = 65280 & var30;
              var33 = (var28 * var31 & -16711919) >>> 8 | (var32 * var28 & 16711700) >>> 8;
              var33 = var33 + var29 * 65793;
              te.a(var22, 8355711 & var33 >> 1, -87, var23, var24, var27, var25, var26);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 == null) {
                stackIn_45_0 = 8355711;
              } else {
                stackIn_45_0 = var21.field_a;
              }
              var34 = stackIn_45_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = (var28 * var36 & 16711735) >>> 8 | var28 * var35 >>> 8 & -738262785;
              var38 = var35 * var29 >>> 8 & -922812161 | (16711930 & var29 * var36) >>> 8;
              var39 = var36 * var30 >>> 8 & -1828651264 | var35 * var30 >>> 8 & 2080309503;
              var37 = var37 + var31 * 65793;
              var38 = var38 + var32 * 65793;
              var39 = var39 + 65793 * var33;
              th.a(var22, var39 >> 16, (65465 & var38) >> 8, 255 & var37, var38 >> 16, var37 >> 16, var39 & 255, var23, 255 & var38, (var37 & 65328) >> 8, -25, var24, var39 >> 8 & 255, var25, var26, var27);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("rg.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_C = "Checking";
    }
}
