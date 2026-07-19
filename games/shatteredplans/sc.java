/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends ka {
    private ln field_r;
    static String field_p;
    private ln[] field_t;
    static boolean field_q;
    private int field_s;

    final int a(int param0, int param1, fs param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_r) {
                break L1;
              } else {
                if (this.field_r.field_y == param2) {
                  stackOut_3_0 = 4;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                field_q = true;
                break L2;
              }
            }
            stackOut_7_0 = super.a(param0, param1 + 0, param2);
            stackIn_8_0 = stackOut_7_0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("sc.UA(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_8_0;
        }
    }

    public final void a(byte param0) {
        int incrementValue$1 = 0;
        int var2 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        ln[] var8 = null;
        ln var9 = null;
        ln[] var10 = null;
        ln var11 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var8 = this.field_g.field_g.field_e;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var8.length) {
            this.field_t = new ln[var2];
            var2 = 0;
            var10 = this.field_g.field_g.field_e;
            var7 = 0;
            var4 = var7;
            L1: while (true) {
              if (var10.length <= var7) {
                super.a(param0);
                return;
              } else {
                var11 = var10[var7];
                if (var11.field_L >= 1) {
                  if (var11.field_y != this.field_n) {
                    incrementValue$1 = var2;
                    var2++;
                    this.field_t[incrementValue$1] = var11;
                    var7++;
                    continue L1;
                  } else {
                    var7++;
                    continue L1;
                  }
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          } else {
            var9 = var8[var4];
            if ((var9.field_L ^ -1) <= -2) {
              if (this.field_n != var9.field_y) {
                var2++;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final int b(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        fb var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 41) {
                break L1;
              } else {
                var5 = (fb) null;
                sc.a(-12, false, (fb) null, -124);
                break L1;
              }
            }
            L2: {
              if (param0.field_R != null) {
                stackOut_4_0 = param0.field_R.field_r;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var3_int = stackIn_5_0;
              var4 = this.a(-5, param0) + 2 * (param0.field_x + var3_int);
              if (var4 != 0) {
                stackOut_7_0 = var4;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("sc.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final int c(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = super.c(param0, param1);
            var4 = param0.field_p;
            var5 = 2147483647;
            var6 = this.field_t;
            var7 = 0;
            L1: while (true) {
              if (var6.length <= var7) {
                L2: {
                  if (this.field_s <= var5) {
                    break L2;
                  } else {
                    var3_int += 1000;
                    break L2;
                  }
                }
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var8 = var6[var7];
                var9 = this.field_g.field_g.field_c[var4][var8.field_p];
                if (var5 > var9) {
                  var5 = var9;
                  var7++;
                  continue L1;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("sc.NA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void f(byte param0) {
        field_p = null;
        if (param0 != 97) {
            sc.f((byte) -65);
        }
    }

    final static void a(int param0, boolean param1, fb param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        sg[] var9 = null;
        String var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        sg var18 = null;
        int var18_int = 0;
        int var19 = 0;
        Object var19_ref = null;
        String var19_ref_String = null;
        Object var20 = null;
        String var20_ref = null;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        int var23_int = 0;
        String var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        Object var26 = null;
        String var26_ref = null;
        int var27 = 0;
        int var28 = 0;
        sg var29 = null;
        sg var30 = null;
        sg[] var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        sg stackIn_22_0 = null;
        sg stackIn_23_0 = null;
        sg stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        sg stackIn_29_0 = null;
        sg stackIn_30_0 = null;
        sg stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        sg stackIn_69_0 = null;
        sg stackIn_70_0 = null;
        sg stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        sg stackIn_74_0 = null;
        sg stackIn_75_0 = null;
        sg stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        sg stackIn_79_0 = null;
        boolean stackIn_79_1 = false;
        sg stackIn_87_0 = null;
        sg stackIn_88_0 = null;
        sg stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        sg stackIn_92_0 = null;
        sg stackIn_93_0 = null;
        sg stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        sg stackIn_98_0 = null;
        boolean stackIn_98_1 = false;
        sg stackIn_99_0 = null;
        boolean stackIn_99_1 = false;
        sg stackIn_100_0 = null;
        boolean stackIn_100_1 = false;
        int stackIn_100_2 = 0;
        sg stackIn_102_0 = null;
        sg stackIn_103_0 = null;
        sg stackIn_104_0 = null;
        sg stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_109_0 = 0;
        sg stackIn_121_0 = null;
        sg stackIn_122_0 = null;
        sg stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        sg stackIn_126_0 = null;
        sg stackIn_127_0 = null;
        sg stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        sg stackIn_130_0 = null;
        sg stackIn_131_0 = null;
        sg stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        sg stackIn_134_0 = null;
        sg stackIn_135_0 = null;
        sg stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        String stackIn_152_0 = null;
        sg stackIn_155_0 = null;
        sg stackIn_156_0 = null;
        sg stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        sg stackIn_158_0 = null;
        sg stackIn_159_0 = null;
        sg stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_166_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_225_0 = 0;
        sg stackIn_323_0 = null;
        sg stackIn_324_0 = null;
        sg stackIn_325_0 = null;
        sg stackIn_326_0 = null;
        int stackIn_326_1 = 0;
        sg stackIn_331_0 = null;
        boolean stackIn_331_1 = false;
        sg stackIn_332_0 = null;
        boolean stackIn_332_1 = false;
        sg stackIn_333_0 = null;
        boolean stackIn_333_1 = false;
        int stackIn_333_2 = 0;
        sg stackIn_335_0 = null;
        sg stackIn_336_0 = null;
        sg stackIn_337_0 = null;
        int stackIn_337_1 = 0;
        sg stackIn_339_0 = null;
        sg stackIn_340_0 = null;
        sg stackIn_341_0 = null;
        sg stackIn_342_0 = null;
        int stackIn_342_1 = 0;
        RuntimeException stackIn_350_0 = null;
        StringBuilder stackIn_350_1 = null;
        RuntimeException stackIn_351_0 = null;
        StringBuilder stackIn_351_1 = null;
        RuntimeException stackIn_352_0 = null;
        StringBuilder stackIn_352_1 = null;
        String stackIn_352_2 = null;
        Throwable caughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        sg stackOut_21_0 = null;
        sg stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        sg stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        sg stackOut_28_0 = null;
        sg stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        sg stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        sg stackOut_68_0 = null;
        sg stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        sg stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        sg stackOut_73_0 = null;
        sg stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        sg stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        sg stackOut_78_0 = null;
        boolean stackOut_78_1 = false;
        sg stackOut_79_0 = null;
        boolean stackOut_79_1 = false;
        int stackOut_79_2 = 0;
        sg stackOut_86_0 = null;
        sg stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        sg stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        sg stackOut_91_0 = null;
        sg stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        sg stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        sg stackOut_97_0 = null;
        boolean stackOut_97_1 = false;
        sg stackOut_98_0 = null;
        boolean stackOut_98_1 = false;
        int stackOut_98_2 = 0;
        sg stackOut_99_0 = null;
        boolean stackOut_99_1 = false;
        int stackOut_99_2 = 0;
        sg stackOut_101_0 = null;
        sg stackOut_102_0 = null;
        sg stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        sg stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_108_0 = 0;
        sg stackOut_120_0 = null;
        sg stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        sg stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        sg stackOut_125_0 = null;
        sg stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        sg stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        sg stackOut_129_0 = null;
        sg stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        sg stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        sg stackOut_133_0 = null;
        sg stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        sg stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        String stackOut_150_0 = null;
        Object stackOut_151_0 = null;
        sg stackOut_154_0 = null;
        sg stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        sg stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        sg stackOut_157_0 = null;
        sg stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        sg stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int stackOut_164_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_224_0 = 0;
        sg stackOut_322_0 = null;
        sg stackOut_323_0 = null;
        sg stackOut_324_0 = null;
        int stackOut_324_1 = 0;
        sg stackOut_325_0 = null;
        int stackOut_325_1 = 0;
        sg stackOut_330_0 = null;
        boolean stackOut_330_1 = false;
        sg stackOut_331_0 = null;
        boolean stackOut_331_1 = false;
        int stackOut_331_2 = 0;
        sg stackOut_332_0 = null;
        boolean stackOut_332_1 = false;
        int stackOut_332_2 = 0;
        sg stackOut_334_0 = null;
        sg stackOut_335_0 = null;
        int stackOut_335_1 = 0;
        sg stackOut_336_0 = null;
        int stackOut_336_1 = 0;
        sg stackOut_338_0 = null;
        sg stackOut_339_0 = null;
        sg stackOut_340_0 = null;
        int stackOut_340_1 = 0;
        sg stackOut_341_0 = null;
        int stackOut_341_1 = 0;
        RuntimeException stackOut_349_0 = null;
        StringBuilder stackOut_349_1 = null;
        RuntimeException stackOut_350_0 = null;
        StringBuilder stackOut_350_1 = null;
        String stackOut_350_2 = null;
        RuntimeException stackOut_351_0 = null;
        StringBuilder stackOut_351_1 = null;
        String stackOut_351_2 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (!param1) {
                        statePc = 6;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (k.field_i) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var4_int = stackIn_5_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 6: {
                    if (ip.a((byte) -92)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 0;
                    stackIn_12_0 = stackOut_7_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 8: {
                    if (!param2.field_Ab) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 0;
                    stackIn_12_0 = stackOut_9_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var4_int = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var5 = -12 / ((param0 - -47) / 49);
                    var6 = 0;
                    if (param1) {
                        statePc = 37;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((var7 ^ -1) <= -6) {
                        statePc = 32;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var4_int == 0) {
                        statePc = 21;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (fk.field_p[0][1 + var7].field_rb == 0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (param2.field_nc != var7) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    param2.field_nc = var7;
                    var6 = 1;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = fk.field_p[0][1 + var7];
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var4_int == 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackOut_22_0 = (sg) ((Object) stackIn_22_0);
                    stackOut_22_1 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackOut_23_0 = (sg) ((Object) stackIn_23_0);
                    stackOut_23_1 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_24_0.field_s = stackIn_24_1 != 0;
                    if (ns.field_pb) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var7 == 3) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    fk.field_p[0][var7 + 1].field_s = false;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = fk.field_p[0][1 + var7];
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (param2.field_nc != var7) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = (sg) ((Object) stackIn_29_0);
                    stackOut_29_1 = 1;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (sg) ((Object) stackIn_30_0);
                    stackOut_30_1 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_31_0.field_bb = stackIn_31_1 != 0;
                    var7++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 32: {
                    if (fk.field_p[0][2].field_v) {
                        statePc = 34;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (!ip.a((byte) -126)) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    dn.field_k = po.field_c;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    dn.field_k = re.a(ef.field_b, 4371, new String[]{np.field_a.field_Xb});
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if ((nl.field_a.length ^ -1) > -3) {
                        statePc = 106;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (param1) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackOut_39_0 = 0;
                    stackIn_44_0 = stackOut_39_0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 40: {
                    if (0 != (ih.field_d ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackOut_41_0 = 0;
                    stackIn_44_0 = stackOut_41_0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 42: {
                    stackOut_42_0 = 1;
                    stackIn_44_0 = stackOut_42_0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var7 = stackIn_44_0;
                    if (var7 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var8 = ih.field_d;
                    var9_int = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var9_int >= id.field_c.length) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    id.field_c[var9_int] = (byte) 0;
                    var9_int++;
                    statePc = 46;
                    continue stateLoop;
                }
                case 48: {
                    id.field_c[var8 / 8] = (byte)ee.a((int) id.field_c[var8 / 8], 1 << var8 % 8);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (param1) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackOut_50_0 = 0;
                    stackIn_52_0 = stackOut_50_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    stackOut_51_0 = -1;
                    stackIn_52_0 = stackOut_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var8 = stackIn_52_0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (var8 >= nl.field_a.length) {
                        statePc = 106;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var7 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = 0;
                    stackIn_60_0 = stackOut_55_0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 56: {
                    if (var8 != ih.field_d) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackOut_57_0 = 0;
                    stackIn_60_0 = stackOut_57_0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = 1;
                    stackIn_60_0 = stackOut_58_0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var9_int = stackIn_60_0;
                    if (var4_int == 0) {
                        statePc = 85;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (0 == fk.field_p[1][1 + var8].field_rb) {
                        statePc = 85;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (param1) {
                        statePc = 66;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var10 = nl.field_a[var8];
                    if (var10 != param2.field_Eb) {
                        statePc = 65;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var6 = 1;
                    param2.field_Eb = var10;
                    statePc = 85;
                    continue stateLoop;
                }
                case 66: {
                    if (var7 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (param1) {
                        statePc = 72;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var10 = nl.field_a[var8];
                    stackOut_68_0 = fk.field_p[1][var8 - -1];
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_69_0 = stackOut_68_0;
                    if (var10 != param2.field_Eb) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = (sg) ((Object) stackIn_69_0);
                    stackOut_69_1 = 1;
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_71_1 = stackOut_69_1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackOut_70_0 = (sg) ((Object) stackIn_70_0);
                    stackOut_70_1 = 0;
                    stackIn_71_0 = stackOut_70_0;
                    stackIn_71_1 = stackOut_70_1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_71_0.field_bb = stackIn_71_1 != 0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 72: {
                    if (-1 == var8) {
                        statePc = 77;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackOut_73_0 = fk.field_p[1][var8 + 1];
                    stackIn_75_0 = stackOut_73_0;
                    stackIn_74_0 = stackOut_73_0;
                    if (-1 == (id.field_c[var8 / 8] & 1 << (var8 & 7) ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackOut_74_0 = (sg) ((Object) stackIn_74_0);
                    stackOut_74_1 = 1;
                    stackIn_76_0 = stackOut_74_0;
                    stackIn_76_1 = stackOut_74_1;
                    statePc = 76;
                    continue stateLoop;
                }
                case 75: {
                    stackOut_75_0 = (sg) ((Object) stackIn_75_0);
                    stackOut_75_1 = 0;
                    stackIn_76_0 = stackOut_75_0;
                    stackIn_76_1 = stackOut_75_1;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_76_0.field_bb = stackIn_76_1 != 0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 77: {
                    fk.field_p[1][1 + var8].field_bb = true;
                    var10 = 0;
                    if (var10 >= nl.field_a.length) {
                        statePc = 101;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackOut_78_0 = fk.field_p[1][1 + var8];
                    stackOut_78_1 = fk.field_p[1][1 + var8].field_bb;
                    stackIn_99_0 = stackOut_78_0;
                    stackIn_99_1 = stackOut_78_1;
                    stackIn_79_0 = stackOut_78_0;
                    stackIn_79_1 = stackOut_78_1;
                    if (-1 != (id.field_c[var10 / 8] & 1 << (var10 & 7) ^ -1)) {
                        statePc = 99;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackOut_79_0 = (sg) ((Object) stackIn_79_0);
                    stackOut_79_1 = stackIn_79_1;
                    stackOut_79_2 = 1;
                    stackIn_100_0 = stackOut_79_0;
                    stackIn_100_1 = stackOut_79_1;
                    stackIn_100_2 = stackOut_79_2;
                    statePc = 100;
                    continue stateLoop;
                }
                case 80: {
                    if (var8 == -1) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    id.field_c[var8 / 8] = (byte)nc.a((int) id.field_c[var8 / 8], 1 << we.a(7, var8));
                    statePc = 85;
                    continue stateLoop;
                }
                case 82: {
                    var10 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (id.field_c.length <= var10) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    id.field_c[var10] = (byte) 0;
                    var10++;
                    statePc = 83;
                    continue stateLoop;
                }
                case 85: {
                    if (param1) {
                        statePc = 90;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var10 = nl.field_a[var8];
                    stackOut_86_0 = fk.field_p[1][var8 - -1];
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_87_0 = stackOut_86_0;
                    if (var10 != param2.field_Eb) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackOut_87_0 = (sg) ((Object) stackIn_87_0);
                    stackOut_87_1 = 1;
                    stackIn_89_0 = stackOut_87_0;
                    stackIn_89_1 = stackOut_87_1;
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackOut_88_0 = (sg) ((Object) stackIn_88_0);
                    stackOut_88_1 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    stackIn_89_0.field_bb = stackIn_89_1 != 0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 90: {
                    if (-1 == var8) {
                        statePc = 95;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackOut_91_0 = fk.field_p[1][var8 + 1];
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_92_0 = stackOut_91_0;
                    if (-1 == (id.field_c[var8 / 8] & 1 << (var8 & 7) ^ -1)) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackOut_92_0 = (sg) ((Object) stackIn_92_0);
                    stackOut_92_1 = 1;
                    stackIn_94_0 = stackOut_92_0;
                    stackIn_94_1 = stackOut_92_1;
                    statePc = 94;
                    continue stateLoop;
                }
                case 93: {
                    stackOut_93_0 = (sg) ((Object) stackIn_93_0);
                    stackOut_93_1 = 0;
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    stackIn_94_0.field_bb = stackIn_94_1 != 0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 95: {
                    fk.field_p[1][1 + var8].field_bb = true;
                    var10 = 0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (var10 >= nl.field_a.length) {
                        statePc = 101;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackOut_97_0 = fk.field_p[1][1 + var8];
                    stackOut_97_1 = fk.field_p[1][1 + var8].field_bb;
                    stackIn_99_0 = stackOut_97_0;
                    stackIn_99_1 = stackOut_97_1;
                    stackIn_98_0 = stackOut_97_0;
                    stackIn_98_1 = stackOut_97_1;
                    if (-1 != (id.field_c[var10 / 8] & 1 << (var10 & 7) ^ -1)) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    stackOut_98_0 = (sg) ((Object) stackIn_98_0);
                    stackOut_98_1 = stackIn_98_1;
                    stackOut_98_2 = 1;
                    stackIn_100_0 = stackOut_98_0;
                    stackIn_100_1 = stackOut_98_1;
                    stackIn_100_2 = stackOut_98_2;
                    statePc = 100;
                    continue stateLoop;
                }
                case 99: {
                    stackOut_99_0 = (sg) ((Object) stackIn_99_0);
                    stackOut_99_1 = stackIn_99_1;
                    stackOut_99_2 = 0;
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    stackIn_100_2 = stackOut_99_2;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    stackIn_100_0.field_bb = stackIn_100_1 & stackIn_100_2 != 0;
                    var10++;
                    statePc = 96;
                    continue stateLoop;
                }
                case 101: {
                    stackOut_101_0 = fk.field_p[1][var8 + 1];
                    stackIn_104_0 = stackOut_101_0;
                    stackIn_102_0 = stackOut_101_0;
                    if (var4_int == 0) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = (sg) ((Object) stackIn_102_0);
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_103_0 = stackOut_102_0;
                    if (var9_int != 0) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackOut_103_0 = (sg) ((Object) stackIn_103_0);
                    stackOut_103_1 = 1;
                    stackIn_105_0 = stackOut_103_0;
                    stackIn_105_1 = stackOut_103_1;
                    statePc = 105;
                    continue stateLoop;
                }
                case 104: {
                    stackOut_104_0 = (sg) ((Object) stackIn_104_0);
                    stackOut_104_1 = 0;
                    stackIn_105_0 = stackOut_104_0;
                    stackIn_105_1 = stackOut_104_1;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    stackIn_105_0.field_s = stackIn_105_1 != 0;
                    var8++;
                    statePc = 53;
                    continue stateLoop;
                }
                case 106: {
                    if (!param1) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackOut_107_0 = 0;
                    stackIn_109_0 = stackOut_107_0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 108: {
                    stackOut_108_0 = 1;
                    stackIn_109_0 = stackOut_108_0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    var7 = stackIn_109_0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if (3 <= var7) {
                        statePc = 138;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var29 = fk.field_p[2][var7];
                    if (var4_int == 0) {
                        statePc = 120;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (var29.field_rb == 0) {
                        statePc = 120;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (!param1) {
                        statePc = 117;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (var7 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    rj.field_q = rj.field_q ^ var7;
                    statePc = 120;
                    continue stateLoop;
                }
                case 116: {
                    rj.field_q = 0;
                    statePc = 120;
                    continue stateLoop;
                }
                case 117: {
                    if (var7 != param2.field_Fb) {
                        statePc = 119;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var6 = 1;
                    param2.field_Fb = var7;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    stackOut_120_0 = (sg) (var29);
                    stackIn_122_0 = stackOut_120_0;
                    stackIn_121_0 = stackOut_120_0;
                    if (var4_int == 0) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    stackOut_121_0 = (sg) ((Object) stackIn_121_0);
                    stackOut_121_1 = 1;
                    stackIn_123_0 = stackOut_121_0;
                    stackIn_123_1 = stackOut_121_1;
                    statePc = 123;
                    continue stateLoop;
                }
                case 122: {
                    stackOut_122_0 = (sg) ((Object) stackIn_122_0);
                    stackOut_122_1 = 0;
                    stackIn_123_0 = stackOut_122_0;
                    stackIn_123_1 = stackOut_122_1;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    stackIn_123_0.field_s = stackIn_123_1 != 0;
                    if (!param1) {
                        statePc = 133;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (0 == var7) {
                        statePc = 129;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackOut_125_0 = (sg) (var29);
                    stackIn_127_0 = stackOut_125_0;
                    stackIn_126_0 = stackOut_125_0;
                    if (0 == (var7 & rj.field_q)) {
                        statePc = 127;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    stackOut_126_0 = (sg) ((Object) stackIn_126_0);
                    stackOut_126_1 = 1;
                    stackIn_128_0 = stackOut_126_0;
                    stackIn_128_1 = stackOut_126_1;
                    statePc = 128;
                    continue stateLoop;
                }
                case 127: {
                    stackOut_127_0 = (sg) ((Object) stackIn_127_0);
                    stackOut_127_1 = 0;
                    stackIn_128_0 = stackOut_127_0;
                    stackIn_128_1 = stackOut_127_1;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    stackIn_128_0.field_bb = stackIn_128_1 != 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 129: {
                    stackOut_129_0 = (sg) (var29);
                    stackIn_131_0 = stackOut_129_0;
                    stackIn_130_0 = stackOut_129_0;
                    if (0 != rj.field_q) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackOut_130_0 = (sg) ((Object) stackIn_130_0);
                    stackOut_130_1 = 1;
                    stackIn_132_0 = stackOut_130_0;
                    stackIn_132_1 = stackOut_130_1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackOut_131_0 = (sg) ((Object) stackIn_131_0);
                    stackOut_131_1 = 0;
                    stackIn_132_0 = stackOut_131_0;
                    stackIn_132_1 = stackOut_131_1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    stackIn_132_0.field_bb = stackIn_132_1 != 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 133: {
                    stackOut_133_0 = (sg) (var29);
                    stackIn_135_0 = stackOut_133_0;
                    stackIn_134_0 = stackOut_133_0;
                    if (0 == (var7 & param2.field_Fb)) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackOut_134_0 = (sg) ((Object) stackIn_134_0);
                    stackOut_134_1 = 1;
                    stackIn_136_0 = stackOut_134_0;
                    stackIn_136_1 = stackOut_134_1;
                    statePc = 136;
                    continue stateLoop;
                }
                case 135: {
                    stackOut_135_0 = (sg) ((Object) stackIn_135_0);
                    stackOut_135_1 = 0;
                    stackIn_136_0 = stackOut_135_0;
                    stackIn_136_1 = stackOut_135_1;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    stackIn_136_0.field_bb = stackIn_136_1 != 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    var7++;
                    statePc = 110;
                    continue stateLoop;
                }
                case 138: {
                    if (!param1) {
                        statePc = 161;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (mg.field_A <= 1) {
                        statePc = 161;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var7 = 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (var7 >= 1 + mg.field_A) {
                        statePc = 161;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var30 = fk.field_p[3][var7];
                    if (var4_int == 0) {
                        statePc = 146;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (var30.field_rb != 0) {
                        statePc = 145;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 145: {
                    qj.field_b = var7;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (!var30.field_v) {
                        statePc = 154;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (-1 > (var7 ^ -1)) {
                        statePc = 149;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (null == ec.field_v) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    stackOut_150_0 = ec.field_v[-1 + var7];
                    stackIn_152_0 = stackOut_150_0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 151: {
                    stackOut_151_0 = null;
                    stackIn_152_0 = (String) ((Object) stackOut_151_0);
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    var9_ref = stackIn_152_0;
                    if (var9_ref == null) {
                        statePc = 154;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    dn.field_k = var9_ref;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    stackOut_154_0 = (sg) (var30);
                    stackIn_156_0 = stackOut_154_0;
                    stackIn_155_0 = stackOut_154_0;
                    if (var4_int == 0) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackOut_155_0 = (sg) ((Object) stackIn_155_0);
                    stackOut_155_1 = 1;
                    stackIn_157_0 = stackOut_155_0;
                    stackIn_157_1 = stackOut_155_1;
                    statePc = 157;
                    continue stateLoop;
                }
                case 156: {
                    stackOut_156_0 = (sg) ((Object) stackIn_156_0);
                    stackOut_156_1 = 0;
                    stackIn_157_0 = stackOut_156_0;
                    stackIn_157_1 = stackOut_156_1;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    stackIn_157_0.field_s = stackIn_157_1 != 0;
                    stackOut_157_0 = (sg) (var30);
                    stackIn_159_0 = stackOut_157_0;
                    stackIn_158_0 = stackOut_157_0;
                    if (qj.field_b != var7) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    stackOut_158_0 = (sg) ((Object) stackIn_158_0);
                    stackOut_158_1 = 1;
                    stackIn_160_0 = stackOut_158_0;
                    stackIn_160_1 = stackOut_158_1;
                    statePc = 160;
                    continue stateLoop;
                }
                case 159: {
                    stackOut_159_0 = (sg) ((Object) stackIn_159_0);
                    stackOut_159_1 = 0;
                    stackIn_160_0 = stackOut_159_0;
                    stackIn_160_1 = stackOut_159_1;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    stackIn_160_0.field_bb = stackIn_160_1 != 0;
                    var7++;
                    statePc = 141;
                    continue stateLoop;
                }
                case 161: {
                    var7 = 0;
                    var8 = 0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (em.field_k <= var8) {
                        statePc = 344;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var31 = fk.field_p[var8 + 4];
                    var9 = var31;
                    if (!param1) {
                        statePc = 165;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    stackOut_164_0 = -1;
                    stackIn_166_0 = stackOut_164_0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 165: {
                    stackOut_165_0 = 0;
                    stackIn_166_0 = stackOut_165_0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    var10 = stackIn_166_0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (-1 + var31.length <= var10) {
                        statePc = 343;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    if (var4_int == 0) {
                        statePc = 213;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 213;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (ji.field_D == null) {
                        statePc = 175;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (null == ji.field_D[var8]) {
                        statePc = 175;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (((vr.field_m ^ -1) & ji.field_D[var8][var10] ^ -1) < -1) {
                        statePc = 174;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var15 = 1;
                    var16 = db.a(107, ji.field_D[var8][var10] & (vr.field_m ^ -1));
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (td.field_E == null) {
                        statePc = 181;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (td.field_E[var8] != null) {
                        statePc = 178;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (0 < es.field_m) {
                        statePc = 181;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (!td.field_E[var8][var10]) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var11 = 1;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (null == ci.field_h) {
                        statePc = 192;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (null != ci.field_h[var8]) {
                        statePc = 184;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var17 = ci.field_h[var8][var10];
                    if (var17 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (hm.field_o) {
                        statePc = 189;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if ((es.field_m ^ -1) >= -1) {
                        statePc = 188;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var11 = 1;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (-1 <= (var17 ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (var17 <= a.field_j) {
                        statePc = 192;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var13 = 1;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (pg.field_A == null) {
                        statePc = 202;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (null == pg.field_A[var8]) {
                        statePc = 202;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var17 = pg.field_A[var8][var10];
                    if (-1 <= (var17 ^ -1)) {
                        statePc = 197;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (var17 <= bh.field_h) {
                        statePc = 197;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var12 = 1;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (var17 == 0) {
                        statePc = 202;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (hm.field_o) {
                        statePc = 202;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (es.field_m <= 0) {
                        statePc = 201;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var11 = 1;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    if (param1) {
                        statePc = 204;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    stackOut_203_0 = 0;
                    stackIn_212_0 = stackOut_203_0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 204: {
                    if (nr.field_q != null) {
                        statePc = 206;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    stackOut_205_0 = 0;
                    stackIn_212_0 = stackOut_205_0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 206: {
                    if (null != nr.field_q[var8]) {
                        statePc = 208;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    stackOut_207_0 = 0;
                    stackIn_212_0 = stackOut_207_0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 208: {
                    if (!nr.field_q[var8][var10]) {
                        statePc = 210;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    stackOut_209_0 = 1;
                    stackIn_212_0 = stackOut_209_0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 210: {
                    stackOut_210_0 = 0;
                    stackIn_212_0 = stackOut_210_0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    var14 = stackIn_212_0;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (bs.field_b < 2) {
                        statePc = 217;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if (di.field_p[12]) {
                        statePc = 216;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var15 = 0;
                    var12 = 0;
                    var14 = 0;
                    var13 = 0;
                    var11 = 0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (var11 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (var12 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (var13 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (var14 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (var15 == 0) {
                        statePc = 224;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    stackOut_222_0 = 1;
                    stackIn_225_0 = stackOut_222_0;
                    statePc = 225;
                    continue stateLoop;
                }
                case 223: {
                    stackOut_223_0 = 1;
                    stackIn_225_0 = stackOut_223_0;
                    statePc = 225;
                    continue stateLoop;
                }
                case 224: {
                    stackOut_224_0 = 0;
                    stackIn_225_0 = stackOut_224_0;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    var17 = stackIn_225_0;
                    wg.field_d = true;
                    if (var17 != 0) {
                        statePc = 244;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (var10 < 0) {
                        statePc = 244;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (null == pe.field_D) {
                        statePc = 244;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (!param1) {
                        statePc = 231;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (!k.field_i) {
                        statePc = 231;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 231: {
                    wg.field_d = false;
                    if (lr.field_c == null) {
                        statePc = 233;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 233: {
                    lr.field_c = new byte[em.field_k];
                    ek.field_F = new boolean[em.field_k];
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    qd.field_h = false;
                    var18_int = 0;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    if (var18_int >= var8) {
                        statePc = 237;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    ek.field_F[var18_int] = false;
                    var18_int++;
                    statePc = 235;
                    continue stateLoop;
                }
                case 237: {
                    js.a(-1, 1, param2, var8, 0, param1, var10, -1);
                    if ((bs.field_b ^ -1) > -3) {
                        statePc = 241;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (di.field_p[12]) {
                        statePc = 240;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 240: {
                    wg.field_d = true;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (!wg.field_d) {
                        statePc = 243;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var17 = 1;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    var18 = var9[var10 - -1];
                    if (var4_int == 0) {
                        statePc = 257;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (-1 != (var18.field_rb ^ -1)) {
                        statePc = 247;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (param1) {
                        statePc = 252;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (var17 != 0) {
                        statePc = 257;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if ((byte)var10 != param2.field_dc[var8]) {
                        statePc = 251;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var6 = 1;
                    param2.field_dc[var8] = (byte)var10;
                    statePc = 257;
                    continue stateLoop;
                }
                case 252: {
                    if (var10 != -1) {
                        statePc = 256;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var19 = var7;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    if (var19 >= var31.length + (var7 - 1)) {
                        statePc = 257;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    qj.field_f[var19 / 8] = (byte)we.a((int) qj.field_f[var19 / 8], 1 << we.a(var19, 7) ^ -1);
                    var19++;
                    statePc = 254;
                    continue stateLoop;
                }
                case 256: {
                    qj.field_f[(var10 - -var7) / 8] = (byte)nc.a((int) qj.field_f[(var10 + var7) / 8], 1 << we.a(var10 + var7, 7));
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (!param1) {
                        statePc = 260;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (var17 == 0) {
                        statePc = 260;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    qj.field_f[(var10 - -var7) / 8] = (byte)we.a((int) qj.field_f[(var10 + var7) / 8], 1 << we.a(7, var7 + var10) ^ -1);
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    if ((var10 ^ -1) > -1) {
                        statePc = 321;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (var18.field_v) {
                        statePc = 263;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (wa.field_d == null) {
                        statePc = 267;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (wa.field_d[var8] == null) {
                        statePc = 266;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var19_ref_String = wa.field_d[var8][var10];
                    statePc = 268;
                    continue stateLoop;
                }
                case 266: {
                    var19_ref_String = null;
                    statePc = 268;
                    continue stateLoop;
                }
                case 267: {
                    var19_ref_String = null;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if (ei.field_f == null) {
                        statePc = 272;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (ei.field_f[var8] == null) {
                        statePc = 271;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    var20_ref = ei.field_f[var8][var10];
                    statePc = 273;
                    continue stateLoop;
                }
                case 271: {
                    var20_ref = null;
                    statePc = 273;
                    continue stateLoop;
                }
                case 272: {
                    var20_ref = null;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    var21 = null;
                    if (var20_ref == null) {
                        statePc = 276;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (var20_ref.equals(var19_ref_String)) {
                        statePc = 276;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var21 = var20_ref;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    var22 = null;
                    if (var14 == 0) {
                        statePc = 278;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    var22 = qh.field_D;
                    statePc = 297;
                    continue stateLoop;
                }
                case 278: {
                    if (var11 != 0) {
                        statePc = 296;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    if (var12 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var23_int = -bh.field_h + pg.field_A[var8][var10];
                    if (var23_int != 1) {
                        statePc = 282;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var22 = ip.field_g;
                    statePc = 283;
                    continue stateLoop;
                }
                case 282: {
                    var22 = re.a(nc.field_n, 4371, new String[]{Integer.toString(var23_int)});
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    if (var13 == 0) {
                        statePc = 287;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var32 = re.a(dh.field_d, 4371, new String[]{Integer.toString(a.field_j), Integer.toString(ci.field_h[var8][var10])});
                    var23_ref = var32;
                    var26_ref = var23_ref;
                    var23_ref = var26_ref;
                    var22 = var23_ref;
                    var26_ref = var32;
                    var23_ref = var26_ref;
                    if (var22 == null) {
                        statePc = 286;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var22 = (String) (var22) + "<br>" + var32;
                    statePc = 287;
                    continue stateLoop;
                }
                case 286: {
                    var22 = var32;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    if (var15 == 0) {
                        statePc = 297;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    var23_ref = ar.field_e;
                    if (0 >= var16) {
                        statePc = 293;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (null == qa.field_s) {
                        statePc = 293;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if (var16 > qa.field_s.length) {
                        statePc = 293;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (qa.field_s[var16 + -1] == null) {
                        statePc = 293;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var23_ref = qa.field_s[-1 + var16][0];
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (var22 != null) {
                        statePc = 295;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var22 = var23_ref;
                    statePc = 297;
                    continue stateLoop;
                }
                case 295: {
                    var22 = (String) (var22) + "<br>" + var23_ref;
                    statePc = 297;
                    continue stateLoop;
                }
                case 296: {
                    var22 = vd.field_r;
                    var23_ref = (String) (var22);
                    var26_ref = var23_ref;
                    var23_ref = var26_ref;
                    var22 = var23_ref;
                    var26_ref = (String) (var22);
                    var23_ref = var26_ref;
                    var26_ref = var23_ref;
                    var23_ref = var26_ref;
                    var22 = var23_ref;
                    var23_ref = var26_ref;
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    if (var4_int == 0) {
                        statePc = 314;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (!wg.field_d) {
                        statePc = 300;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var23_ref = null;
                    var24 = 0;
                    if (qd.field_h) {
                        statePc = 302;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 302: {
                    var23_ref = "</col>" + wl.field_b + "<col=A00000>";
                    var26_ref = var23_ref;
                    var23_ref = var26_ref;
                    var26_ref = var23_ref;
                    var23_ref = var26_ref;
                    var22 = var23_ref;
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    var25 = 0;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    if (var8 <= var25) {
                        statePc = 311;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    if (ek.field_F[var25]) {
                        statePc = 307;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    var25++;
                    statePc = 304;
                    continue stateLoop;
                }
                case 307: {
                    var26_ref = "</col>" + gm.field_l[var25] + "<col=A00000>";
                    var23_ref = var26_ref;
                    var22 = var23_ref;
                    var23_ref = var26_ref;
                    if (var23_ref == null) {
                        statePc = 309;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    var23_ref = var23_ref + ", " + var26_ref;
                    var24 = 1;
                    statePc = 310;
                    continue stateLoop;
                }
                case 309: {
                    var23_ref = var26_ref;
                    var22 = var23_ref;
                    var22 = var23_ref;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    var25++;
                    statePc = 304;
                    continue stateLoop;
                }
                case 311: {
                    if (var24 == 0) {
                        statePc = 313;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    var22 = mp.field_d + var23_ref;
                    statePc = 314;
                    continue stateLoop;
                }
                case 313: {
                    var22 = re.a(n.field_q, 4371, new String[]{var23_ref});
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    if (var22 != null) {
                        statePc = 316;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 316: {
                    var22 = "<col=A00000>" + (String) (var22);
                    var33 = qr.a((String) (var22), (byte) -125, "<br><col=A00000>", "<br>");
                    if (var21 == null) {
                        statePc = 318;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var21 = (String) (var21) + "<br>" + var33;
                    statePc = 319;
                    continue stateLoop;
                }
                case 318: {
                    var21 = var33;
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    if (var21 == null) {
                        statePc = 321;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    dn.field_k = (String) (var21);
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    if (param1) {
                        statePc = 327;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    stackOut_322_0 = (sg) (var18);
                    stackIn_325_0 = stackOut_322_0;
                    stackIn_323_0 = stackOut_322_0;
                    if (!wg.field_d) {
                        statePc = 325;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    stackOut_323_0 = (sg) ((Object) stackIn_323_0);
                    stackIn_325_0 = stackOut_323_0;
                    stackIn_324_0 = stackOut_323_0;
                    if (param2.field_dc[var8] != (byte)var10) {
                        statePc = 325;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    stackOut_324_0 = (sg) ((Object) stackIn_324_0);
                    stackOut_324_1 = 1;
                    stackIn_326_0 = stackOut_324_0;
                    stackIn_326_1 = stackOut_324_1;
                    statePc = 326;
                    continue stateLoop;
                }
                case 325: {
                    stackOut_325_0 = (sg) ((Object) stackIn_325_0);
                    stackOut_325_1 = 0;
                    stackIn_326_0 = stackOut_325_0;
                    stackIn_326_1 = stackOut_325_1;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    stackIn_326_0.field_bb = stackIn_326_1 != 0;
                    statePc = 338;
                    continue stateLoop;
                }
                case 327: {
                    if (0 != (var10 ^ -1)) {
                        statePc = 334;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    var18.field_bb = true;
                    var28 = var7;
                    var19 = var28;
                    statePc = 329;
                    continue stateLoop;
                }
                case 329: {
                    if (var28 >= -1 + (var31.length + var7)) {
                        statePc = 338;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    stackOut_330_0 = (sg) (var18);
                    stackOut_330_1 = var18.field_bb;
                    stackIn_332_0 = stackOut_330_0;
                    stackIn_332_1 = stackOut_330_1;
                    stackIn_331_0 = stackOut_330_0;
                    stackIn_331_1 = stackOut_330_1;
                    if (-1 != (qj.field_f[var28 / 8] & 1 << (var28 & 7) ^ -1)) {
                        statePc = 332;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    stackOut_331_0 = (sg) ((Object) stackIn_331_0);
                    stackOut_331_1 = stackIn_331_1;
                    stackOut_331_2 = 1;
                    stackIn_333_0 = stackOut_331_0;
                    stackIn_333_1 = stackOut_331_1;
                    stackIn_333_2 = stackOut_331_2;
                    statePc = 333;
                    continue stateLoop;
                }
                case 332: {
                    stackOut_332_0 = (sg) ((Object) stackIn_332_0);
                    stackOut_332_1 = stackIn_332_1;
                    stackOut_332_2 = 0;
                    stackIn_333_0 = stackOut_332_0;
                    stackIn_333_1 = stackOut_332_1;
                    stackIn_333_2 = stackOut_332_2;
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    stackIn_333_0.field_bb = stackIn_333_1 & stackIn_333_2 != 0;
                    var28++;
                    statePc = 329;
                    continue stateLoop;
                }
                case 334: {
                    stackOut_334_0 = (sg) (var18);
                    stackIn_336_0 = stackOut_334_0;
                    stackIn_335_0 = stackOut_334_0;
                    if ((qj.field_f[(var7 + var10) / 8] & 1 << (7 & var10 + var7)) == 0) {
                        statePc = 336;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    stackOut_335_0 = (sg) ((Object) stackIn_335_0);
                    stackOut_335_1 = 1;
                    stackIn_337_0 = stackOut_335_0;
                    stackIn_337_1 = stackOut_335_1;
                    statePc = 337;
                    continue stateLoop;
                }
                case 336: {
                    stackOut_336_0 = (sg) ((Object) stackIn_336_0);
                    stackOut_336_1 = 0;
                    stackIn_337_0 = stackOut_336_0;
                    stackIn_337_1 = stackOut_336_1;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    stackIn_337_0.field_bb = stackIn_337_1 != 0;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    stackOut_338_0 = (sg) (var18);
                    stackIn_341_0 = stackOut_338_0;
                    stackIn_339_0 = stackOut_338_0;
                    if (var4_int == 0) {
                        statePc = 341;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    stackOut_339_0 = (sg) ((Object) stackIn_339_0);
                    stackIn_341_0 = stackOut_339_0;
                    stackIn_340_0 = stackOut_339_0;
                    if (var17 != 0) {
                        statePc = 341;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    stackOut_340_0 = (sg) ((Object) stackIn_340_0);
                    stackOut_340_1 = 1;
                    stackIn_342_0 = stackOut_340_0;
                    stackIn_342_1 = stackOut_340_1;
                    statePc = 342;
                    continue stateLoop;
                }
                case 341: {
                    stackOut_341_0 = (sg) ((Object) stackIn_341_0);
                    stackOut_341_1 = 0;
                    stackIn_342_0 = stackOut_341_0;
                    stackIn_342_1 = stackOut_341_1;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    stackIn_342_0.field_s = stackIn_342_1 != 0;
                    var10++;
                    statePc = 167;
                    continue stateLoop;
                }
                case 343: {
                    var7 = var7 + (ks.field_e[var8] & 255);
                    var8++;
                    statePc = 162;
                    continue stateLoop;
                }
                case 344: {
                    if (var6 == 0) {
                        statePc = 353;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (!param1) {
                        statePc = 347;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 347: {
                    ti.a(param3, 0);
                    statePc = 353;
                    continue stateLoop;
                }
                case 353: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int[] b(int param0) {
        int var2 = 10 % ((param0 - -48) / 61);
        return new int[]{14, 16};
    }

    sc(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 4);
        this.field_r = null;
        this.field_t = null;
    }

    final void e(byte param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ln var14 = null;
        ln[] var15 = null;
        ln var16 = null;
        ln[] var17 = null;
        ln var18 = null;
        L0: {
          var12 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 101) {
            break L0;
          } else {
            this.field_r = (ln) null;
            break L0;
          }
        }
        var2 = null;
        var3 = 0;
        var4 = 0;
        L1: while (true) {
          if (var4 >= this.field_o) {
            if (var2 == null) {
              return;
            } else {
              var4 = ((ln) (var2)).field_p;
              var5 = null;
              var6 = 2147483647;
              var15 = this.field_t;
              var8 = 0;
              L2: while (true) {
                if (var8 >= var15.length) {
                  L3: {
                    if (var5 == null) {
                      var17 = this.field_t;
                      var13 = 0;
                      var8 = var13;
                      L4: while (true) {
                        if (var13 >= var17.length) {
                          break L3;
                        } else {
                          var18 = var17[var13];
                          var5 = var18;
                          var5 = var18;
                          var10 = var18.field_p;
                          if (null != this.field_r) {
                            if (this.field_r.field_R != var18.field_R) {
                              if ((this.field_g.field_g.field_c[var4][var10] ^ -1) < -3) {
                                var11 = hs.field_i[var10];
                                if (var6 > var11) {
                                  var5 = var18;
                                  var6 = var11;
                                  var13++;
                                  continue L4;
                                } else {
                                  var13++;
                                  continue L4;
                                }
                              } else {
                                var13++;
                                continue L4;
                              }
                            } else {
                              var13++;
                              continue L4;
                            }
                          } else {
                            var13++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (var5 != null) {
                      var7 = new qm(3, this.field_n, (ln) (var2), (ln) (var5));
                      lh.field_G.a((byte) -113, var7);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                } else {
                  L6: {
                    var16 = var15[var8];
                    var5 = var16;
                    var18 = var16;
                    var5 = var18;
                    var10 = var16.field_p;
                    if (this.field_r == null) {
                      break L6;
                    } else {
                      if (this.field_r.field_R == var16.field_R) {
                        break L6;
                      } else {
                        var8++;
                        continue L2;
                      }
                    }
                  }
                  if ((this.field_g.field_g.field_c[var4][var10] ^ -1) < -3) {
                    var11 = hs.field_i[var10];
                    if (var11 < var6) {
                      var5 = var16;
                      var6 = var11;
                      var8++;
                      continue L2;
                    } else {
                      var8++;
                      continue L2;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var14 = this.field_g.field_g.field_e[var4];
            var2 = var14;
            var2 = var14;
            if (var14.field_y == this.field_n) {
              L7: {
                var6 = oe.field_i[var4];
                if (!var14.field_u) {
                  break L7;
                } else {
                  var6 = var6 * 2 - -5;
                  break L7;
                }
              }
              if (var6 > var3) {
                var2 = var14;
                var3 = var6;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void b(boolean param0) {
        Object var2 = null;
        int var3 = 0;
        int var4_int = 0;
        qm var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = null;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= this.field_o) {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.a((byte) 23);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var4 = new qm(2, this.field_n, (ln) (var2));
                lh.field_G.a((byte) -113, var4);
                break L2;
              }
            }
            return;
          } else {
            var5 = hs.field_i[var4_int];
            if (var5 != 0) {
              L3: {
                var6 = this.field_g.field_g.field_e[var4_int];
                var2 = var6;
                var2 = var6;
                stackOut_4_0 = var6.field_x ^ -1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!var6.field_u) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 10;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 5;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              if (stackIn_7_0 <= (stackIn_7_1 ^ -1)) {
                L4: {
                  if (null == var6.field_y) {
                    if (-1 != (var6.field_L ^ -1)) {
                      break L4;
                    } else {
                      var4_int++;
                      continue L0;
                    }
                  } else {
                    var7 = this.field_g.field_D[var6.field_y.field_x];
                    var8 = this.field_g.field_D[this.field_n.field_x];
                    if (var7 <= var6.field_x * 4) {
                      break L4;
                    } else {
                      if (var8 <= 2 * var6.field_x) {
                        break L4;
                      } else {
                        var4_int++;
                        continue L0;
                      }
                    }
                  }
                }
                var7 = cb.field_o[var4_int];
                var8 = var5 * (var7 * var7);
                if (var3 < var8) {
                  var2 = var6;
                  var3 = var8;
                  var4_int++;
                  continue L0;
                } else {
                  var4_int++;
                  continue L0;
                }
              } else {
                var4_int++;
                continue L0;
              }
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, sd param1, byte param2) {
        ln var4 = null;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            this.field_r = null;
            this.field_s = 2147483647;
            var4 = param1.j(18229);
            while (var4 != null) {
                var5 = var4.field_p;
                var6 = this.field_t;
                for (var7 = 0; var6.length > var7; var7++) {
                    var8 = var6[var7];
                    var9 = this.field_g.field_g.field_c[var5][var8.field_p];
                    if (var9 < this.field_s) {
                        this.field_s = var9;
                        this.field_r = var8;
                    }
                }
                var4 = param1.h(-23410);
            }
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "sc.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_q = false;
        field_p = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
