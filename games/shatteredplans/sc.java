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
              if (null == ((sc) this).field_r) {
                break L1;
              } else {
                if (((sc) this).field_r.field_y == param2) {
                  stackOut_3_0 = 4;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
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
            stackOut_7_0 = super.a(param0, param1, param2);
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("sc.UA(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    public final void a(byte param0) {
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
        var8 = ((sc) this).field_g.field_g.field_e;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var8.length) {
            ((sc) this).field_t = new ln[var2];
            var2 = 0;
            var10 = ((sc) this).field_g.field_g.field_e;
            var7 = 0;
            var4 = var7;
            L1: while (true) {
              if (var10.length <= var7) {
                super.a(param0);
                return;
              } else {
                var11 = var10[var7];
                if (var11.field_L >= 1) {
                  if (var11.field_y != ((sc) this).field_n) {
                    int incrementValue$1 = var2;
                    var2++;
                    ((sc) this).field_t[incrementValue$1] = var11;
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
            if (var9.field_L >= 1) {
              if (((sc) this).field_n != var9.field_y) {
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
        Object var5 = null;
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
                var5 = null;
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
              var4 = ((sc) this).a(-5, param0) + 2 * (param0.field_x + var3_int);
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("sc.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
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
            var6 = ((sc) this).field_t;
            var7 = 0;
            L1: while (true) {
              if (var6.length <= var7) {
                L2: {
                  if (((sc) this).field_s <= var5) {
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
                L3: {
                  var8 = var6[var7];
                  var9 = ((sc) this).field_g.field_g.field_c[var4][var8.field_p];
                  if (var5 <= var9) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("sc.NA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
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
        int stackIn_10_0 = 0;
        sg stackIn_20_0 = null;
        sg stackIn_21_0 = null;
        sg stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        sg stackIn_27_0 = null;
        sg stackIn_28_0 = null;
        sg stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        sg stackIn_63_0 = null;
        sg stackIn_64_0 = null;
        sg stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        sg stackIn_68_0 = null;
        sg stackIn_69_0 = null;
        sg stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        sg stackIn_73_0 = null;
        boolean stackIn_73_1 = false;
        sg stackIn_81_0 = null;
        sg stackIn_82_0 = null;
        sg stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        sg stackIn_86_0 = null;
        sg stackIn_87_0 = null;
        sg stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        sg stackIn_92_0 = null;
        boolean stackIn_92_1 = false;
        sg stackIn_93_0 = null;
        boolean stackIn_93_1 = false;
        sg stackIn_94_0 = null;
        boolean stackIn_94_1 = false;
        int stackIn_94_2 = 0;
        sg stackIn_96_0 = null;
        sg stackIn_97_0 = null;
        sg stackIn_98_0 = null;
        sg stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_103_0 = 0;
        sg stackIn_115_0 = null;
        sg stackIn_116_0 = null;
        sg stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        sg stackIn_120_0 = null;
        sg stackIn_121_0 = null;
        sg stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        sg stackIn_124_0 = null;
        sg stackIn_125_0 = null;
        sg stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        sg stackIn_128_0 = null;
        sg stackIn_129_0 = null;
        sg stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        String stackIn_146_0 = null;
        sg stackIn_149_0 = null;
        sg stackIn_150_0 = null;
        sg stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        sg stackIn_152_0 = null;
        sg stackIn_153_0 = null;
        sg stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_215_0 = 0;
        sg stackIn_312_0 = null;
        sg stackIn_313_0 = null;
        sg stackIn_314_0 = null;
        sg stackIn_315_0 = null;
        int stackIn_315_1 = 0;
        sg stackIn_320_0 = null;
        boolean stackIn_320_1 = false;
        sg stackIn_321_0 = null;
        boolean stackIn_321_1 = false;
        sg stackIn_322_0 = null;
        boolean stackIn_322_1 = false;
        int stackIn_322_2 = 0;
        sg stackIn_324_0 = null;
        sg stackIn_325_0 = null;
        sg stackIn_326_0 = null;
        int stackIn_326_1 = 0;
        sg stackIn_328_0 = null;
        sg stackIn_329_0 = null;
        sg stackIn_330_0 = null;
        sg stackIn_331_0 = null;
        int stackIn_331_1 = 0;
        RuntimeException stackIn_339_0 = null;
        StringBuilder stackIn_339_1 = null;
        RuntimeException stackIn_340_0 = null;
        StringBuilder stackIn_340_1 = null;
        RuntimeException stackIn_341_0 = null;
        StringBuilder stackIn_341_1 = null;
        String stackIn_341_2 = null;
        Throwable caughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        sg stackOut_19_0 = null;
        sg stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        sg stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        sg stackOut_26_0 = null;
        sg stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        sg stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_53_0 = 0;
        sg stackOut_62_0 = null;
        sg stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        sg stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        sg stackOut_67_0 = null;
        sg stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        sg stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        sg stackOut_72_0 = null;
        boolean stackOut_72_1 = false;
        sg stackOut_73_0 = null;
        boolean stackOut_73_1 = false;
        int stackOut_73_2 = 0;
        sg stackOut_80_0 = null;
        sg stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        sg stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        sg stackOut_85_0 = null;
        sg stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        sg stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        sg stackOut_91_0 = null;
        boolean stackOut_91_1 = false;
        sg stackOut_92_0 = null;
        boolean stackOut_92_1 = false;
        int stackOut_92_2 = 0;
        sg stackOut_93_0 = null;
        boolean stackOut_93_1 = false;
        int stackOut_93_2 = 0;
        sg stackOut_95_0 = null;
        sg stackOut_96_0 = null;
        sg stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        sg stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_102_0 = 0;
        sg stackOut_114_0 = null;
        sg stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        sg stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        sg stackOut_119_0 = null;
        sg stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        sg stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        sg stackOut_123_0 = null;
        sg stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        sg stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        sg stackOut_127_0 = null;
        sg stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        sg stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        String stackOut_144_0 = null;
        Object stackOut_145_0 = null;
        sg stackOut_148_0 = null;
        sg stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        sg stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        sg stackOut_151_0 = null;
        sg stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        sg stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_214_0 = 0;
        sg stackOut_311_0 = null;
        sg stackOut_312_0 = null;
        sg stackOut_313_0 = null;
        int stackOut_313_1 = 0;
        sg stackOut_314_0 = null;
        int stackOut_314_1 = 0;
        sg stackOut_319_0 = null;
        boolean stackOut_319_1 = false;
        sg stackOut_320_0 = null;
        boolean stackOut_320_1 = false;
        int stackOut_320_2 = 0;
        sg stackOut_321_0 = null;
        boolean stackOut_321_1 = false;
        int stackOut_321_2 = 0;
        sg stackOut_323_0 = null;
        sg stackOut_324_0 = null;
        int stackOut_324_1 = 0;
        sg stackOut_325_0 = null;
        int stackOut_325_1 = 0;
        sg stackOut_327_0 = null;
        sg stackOut_328_0 = null;
        sg stackOut_329_0 = null;
        int stackOut_329_1 = 0;
        sg stackOut_330_0 = null;
        int stackOut_330_1 = 0;
        RuntimeException stackOut_338_0 = null;
        StringBuilder stackOut_338_1 = null;
        RuntimeException stackOut_339_0 = null;
        StringBuilder stackOut_339_1 = null;
        String stackOut_339_2 = null;
        RuntimeException stackOut_340_0 = null;
        StringBuilder stackOut_340_1 = null;
        String stackOut_340_2 = null;
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
                    statePc = 11;
                    continue stateLoop;
                }
                case 6: {
                    if (!ip.a((byte) -92)) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param2.field_Ab) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var4_int = stackIn_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var5 = -12 / ((param0 - -47) / 49);
                    var6 = 0;
                    if (param1) {
                        statePc = 35;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var7 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var7 >= 5) {
                        statePc = 30;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var4_int == 0) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (fk.field_p[0][1 + var7].field_rb == 0) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (param2.field_nc != var7) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    param2.field_nc = var7;
                    var6 = 1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = fk.field_p[0][1 + var7];
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (var4_int == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = (sg) (Object) stackIn_20_0;
                    stackOut_20_1 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = (sg) (Object) stackIn_21_0;
                    stackOut_21_1 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_22_0.field_s = stackIn_22_1 != 0;
                    if (ns.field_pb) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var7 == 3) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    fk.field_p[0][var7 + 1].field_s = false;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = fk.field_p[0][1 + var7];
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (param2.field_nc != var7) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = (sg) (Object) stackIn_27_0;
                    stackOut_27_1 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = (sg) (Object) stackIn_28_0;
                    stackOut_28_1 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_29_0.field_bb = stackIn_29_1 != 0;
                    var7++;
                    statePc = 13;
                    continue stateLoop;
                }
                case 30: {
                    if (fk.field_p[0][2].field_v) {
                        statePc = 32;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (!ip.a((byte) -126)) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    dn.field_k = po.field_c;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    dn.field_k = re.a(ef.field_b, 4371, new String[1]);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (nl.field_a.length < 2) {
                        statePc = 100;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!param1) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (ih.field_d == -1) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackOut_38_0 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var7 = stackIn_40_0;
                    if (var7 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var8 = ih.field_d;
                    var9_int = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (var9_int >= id.field_c.length) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    id.field_c[var9_int] = (byte) 0;
                    var9_int++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 44: {
                    id.field_c[var8 / 8] = (byte)ee.a((int) id.field_c[var8 / 8], 1 << var8 % 8);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (param1) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackOut_46_0 = 0;
                    stackIn_48_0 = stackOut_46_0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackOut_47_0 = -1;
                    stackIn_48_0 = stackOut_47_0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var8 = stackIn_48_0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (~var8 <= ~nl.field_a.length) {
                        statePc = 100;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var7 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (~var8 == ~ih.field_d) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    stackOut_52_0 = 1;
                    stackIn_54_0 = stackOut_52_0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 53: {
                    stackOut_53_0 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var9_int = stackIn_54_0;
                    if (var4_int == 0) {
                        statePc = 79;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (0 == fk.field_p[1][1 + var8].field_rb) {
                        statePc = 79;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (param1) {
                        statePc = 60;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var10 = nl.field_a[var8];
                    if (var10 != param2.field_Eb) {
                        statePc = 59;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var6 = 1;
                    param2.field_Eb = var10;
                    statePc = 79;
                    continue stateLoop;
                }
                case 60: {
                    if (var7 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (param1) {
                        statePc = 66;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var10 = nl.field_a[var8];
                    stackOut_62_0 = fk.field_p[1][var8 - -1];
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_63_0 = stackOut_62_0;
                    if (~var10 != ~param2.field_Eb) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackOut_63_0 = (sg) (Object) stackIn_63_0;
                    stackOut_63_1 = 1;
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_65_1 = stackOut_63_1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackOut_64_0 = (sg) (Object) stackIn_64_0;
                    stackOut_64_1 = 0;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_65_0.field_bb = stackIn_65_1 != 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 66: {
                    if (-1 == var8) {
                        statePc = 71;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = fk.field_p[1][var8 + 1];
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_68_0 = stackOut_67_0;
                    if ((id.field_c[var8 / 8] & 1 << (var8 & 7)) == 0) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackOut_68_0 = (sg) (Object) stackIn_68_0;
                    stackOut_68_1 = 1;
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_70_1 = stackOut_68_1;
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = (sg) (Object) stackIn_69_0;
                    stackOut_69_1 = 0;
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_70_0.field_bb = stackIn_70_1 != 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 71: {
                    fk.field_p[1][1 + var8].field_bb = true;
                    var10 = 0;
                    if (var10 >= nl.field_a.length) {
                        statePc = 95;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackOut_72_0 = fk.field_p[1][1 + var8];
                    stackOut_72_1 = fk.field_p[1][1 + var8].field_bb;
                    stackIn_93_0 = stackOut_72_0;
                    stackIn_93_1 = stackOut_72_1;
                    stackIn_73_0 = stackOut_72_0;
                    stackIn_73_1 = stackOut_72_1;
                    if ((id.field_c[var10 / 8] & 1 << (var10 & 7)) != 0) {
                        statePc = 93;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackOut_73_0 = (sg) (Object) stackIn_73_0;
                    stackOut_73_1 = stackIn_73_1;
                    stackOut_73_2 = 1;
                    stackIn_94_0 = stackOut_73_0;
                    stackIn_94_1 = stackOut_73_1;
                    stackIn_94_2 = stackOut_73_2;
                    statePc = 94;
                    continue stateLoop;
                }
                case 74: {
                    if (var8 == -1) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    id.field_c[var8 / 8] = (byte)nc.a((int) id.field_c[var8 / 8], 1 << we.a(7, var8));
                    statePc = 79;
                    continue stateLoop;
                }
                case 76: {
                    var10 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (~id.field_c.length >= ~var10) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    id.field_c[var10] = (byte) 0;
                    var10++;
                    statePc = 77;
                    continue stateLoop;
                }
                case 79: {
                    if (param1) {
                        statePc = 84;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var10 = nl.field_a[var8];
                    stackOut_80_0 = fk.field_p[1][var8 - -1];
                    stackIn_82_0 = stackOut_80_0;
                    stackIn_81_0 = stackOut_80_0;
                    if (~var10 != ~param2.field_Eb) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackOut_81_0 = (sg) (Object) stackIn_81_0;
                    stackOut_81_1 = 1;
                    stackIn_83_0 = stackOut_81_0;
                    stackIn_83_1 = stackOut_81_1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackOut_82_0 = (sg) (Object) stackIn_82_0;
                    stackOut_82_1 = 0;
                    stackIn_83_0 = stackOut_82_0;
                    stackIn_83_1 = stackOut_82_1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    stackIn_83_0.field_bb = stackIn_83_1 != 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 84: {
                    if (-1 == var8) {
                        statePc = 89;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackOut_85_0 = fk.field_p[1][var8 + 1];
                    stackIn_87_0 = stackOut_85_0;
                    stackIn_86_0 = stackOut_85_0;
                    if ((id.field_c[var8 / 8] & 1 << (var8 & 7)) == 0) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackOut_86_0 = (sg) (Object) stackIn_86_0;
                    stackOut_86_1 = 1;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    statePc = 88;
                    continue stateLoop;
                }
                case 87: {
                    stackOut_87_0 = (sg) (Object) stackIn_87_0;
                    stackOut_87_1 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_88_0.field_bb = stackIn_88_1 != 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 89: {
                    fk.field_p[1][1 + var8].field_bb = true;
                    var10 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (var10 >= nl.field_a.length) {
                        statePc = 95;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackOut_91_0 = fk.field_p[1][1 + var8];
                    stackOut_91_1 = fk.field_p[1][1 + var8].field_bb;
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_93_1 = stackOut_91_1;
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    if ((id.field_c[var10 / 8] & 1 << (var10 & 7)) != 0) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackOut_92_0 = (sg) (Object) stackIn_92_0;
                    stackOut_92_1 = stackIn_92_1;
                    stackOut_92_2 = 1;
                    stackIn_94_0 = stackOut_92_0;
                    stackIn_94_1 = stackOut_92_1;
                    stackIn_94_2 = stackOut_92_2;
                    statePc = 94;
                    continue stateLoop;
                }
                case 93: {
                    stackOut_93_0 = (sg) (Object) stackIn_93_0;
                    stackOut_93_1 = stackIn_93_1;
                    stackOut_93_2 = 0;
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    stackIn_94_2 = stackOut_93_2;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    stackIn_94_0.field_bb = stackIn_94_1 & stackIn_94_2 != 0;
                    var10++;
                    statePc = 90;
                    continue stateLoop;
                }
                case 95: {
                    stackOut_95_0 = fk.field_p[1][var8 + 1];
                    stackIn_98_0 = stackOut_95_0;
                    stackIn_96_0 = stackOut_95_0;
                    if (var4_int == 0) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackOut_96_0 = (sg) (Object) stackIn_96_0;
                    stackIn_98_0 = stackOut_96_0;
                    stackIn_97_0 = stackOut_96_0;
                    if (var9_int != 0) {
                        statePc = 98;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackOut_97_0 = (sg) (Object) stackIn_97_0;
                    stackOut_97_1 = 1;
                    stackIn_99_0 = stackOut_97_0;
                    stackIn_99_1 = stackOut_97_1;
                    statePc = 99;
                    continue stateLoop;
                }
                case 98: {
                    stackOut_98_0 = (sg) (Object) stackIn_98_0;
                    stackOut_98_1 = 0;
                    stackIn_99_0 = stackOut_98_0;
                    stackIn_99_1 = stackOut_98_1;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    stackIn_99_0.field_s = stackIn_99_1 != 0;
                    var8++;
                    statePc = 49;
                    continue stateLoop;
                }
                case 100: {
                    if (!param1) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackOut_101_0 = 0;
                    stackIn_103_0 = stackOut_101_0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = 1;
                    stackIn_103_0 = stackOut_102_0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    var7 = stackIn_103_0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (3 <= var7) {
                        statePc = 132;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var29 = fk.field_p[2][var7];
                    if (var4_int == 0) {
                        statePc = 114;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (var29.field_rb == 0) {
                        statePc = 114;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (!param1) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var7 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    rj.field_q = rj.field_q ^ var7;
                    statePc = 114;
                    continue stateLoop;
                }
                case 110: {
                    rj.field_q = 0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 111: {
                    if (~var7 != ~param2.field_Fb) {
                        statePc = 113;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var6 = 1;
                    param2.field_Fb = var7;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    stackOut_114_0 = (sg) var29;
                    stackIn_116_0 = stackOut_114_0;
                    stackIn_115_0 = stackOut_114_0;
                    if (var4_int == 0) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackOut_115_0 = (sg) (Object) stackIn_115_0;
                    stackOut_115_1 = 1;
                    stackIn_117_0 = stackOut_115_0;
                    stackIn_117_1 = stackOut_115_1;
                    statePc = 117;
                    continue stateLoop;
                }
                case 116: {
                    stackOut_116_0 = (sg) (Object) stackIn_116_0;
                    stackOut_116_1 = 0;
                    stackIn_117_0 = stackOut_116_0;
                    stackIn_117_1 = stackOut_116_1;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    stackIn_117_0.field_s = stackIn_117_1 != 0;
                    if (!param1) {
                        statePc = 127;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (0 == var7) {
                        statePc = 123;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackOut_119_0 = (sg) var29;
                    stackIn_121_0 = stackOut_119_0;
                    stackIn_120_0 = stackOut_119_0;
                    if (0 == (var7 & rj.field_q)) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackOut_120_0 = (sg) (Object) stackIn_120_0;
                    stackOut_120_1 = 1;
                    stackIn_122_0 = stackOut_120_0;
                    stackIn_122_1 = stackOut_120_1;
                    statePc = 122;
                    continue stateLoop;
                }
                case 121: {
                    stackOut_121_0 = (sg) (Object) stackIn_121_0;
                    stackOut_121_1 = 0;
                    stackIn_122_0 = stackOut_121_0;
                    stackIn_122_1 = stackOut_121_1;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    stackIn_122_0.field_bb = stackIn_122_1 != 0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 123: {
                    stackOut_123_0 = (sg) var29;
                    stackIn_125_0 = stackOut_123_0;
                    stackIn_124_0 = stackOut_123_0;
                    if (0 != rj.field_q) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    stackOut_124_0 = (sg) (Object) stackIn_124_0;
                    stackOut_124_1 = 1;
                    stackIn_126_0 = stackOut_124_0;
                    stackIn_126_1 = stackOut_124_1;
                    statePc = 126;
                    continue stateLoop;
                }
                case 125: {
                    stackOut_125_0 = (sg) (Object) stackIn_125_0;
                    stackOut_125_1 = 0;
                    stackIn_126_0 = stackOut_125_0;
                    stackIn_126_1 = stackOut_125_1;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    stackIn_126_0.field_bb = stackIn_126_1 != 0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 127: {
                    stackOut_127_0 = (sg) var29;
                    stackIn_129_0 = stackOut_127_0;
                    stackIn_128_0 = stackOut_127_0;
                    if (0 == (var7 & param2.field_Fb)) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackOut_128_0 = (sg) (Object) stackIn_128_0;
                    stackOut_128_1 = 1;
                    stackIn_130_0 = stackOut_128_0;
                    stackIn_130_1 = stackOut_128_1;
                    statePc = 130;
                    continue stateLoop;
                }
                case 129: {
                    stackOut_129_0 = (sg) (Object) stackIn_129_0;
                    stackOut_129_1 = 0;
                    stackIn_130_0 = stackOut_129_0;
                    stackIn_130_1 = stackOut_129_1;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    stackIn_130_0.field_bb = stackIn_130_1 != 0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var7++;
                    statePc = 104;
                    continue stateLoop;
                }
                case 132: {
                    if (!param1) {
                        statePc = 155;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (mg.field_A <= 1) {
                        statePc = 155;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var7 = 0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if (var7 >= 1 + mg.field_A) {
                        statePc = 155;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var30 = fk.field_p[3][var7];
                    if (var4_int == 0) {
                        statePc = 140;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (var30.field_rb != 0) {
                        statePc = 139;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 139: {
                    qj.field_b = var7;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (!var30.field_v) {
                        statePc = 148;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (var7 > 0) {
                        statePc = 143;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (null == ec.field_v) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    stackOut_144_0 = ec.field_v[-1 + var7];
                    stackIn_146_0 = stackOut_144_0;
                    statePc = 146;
                    continue stateLoop;
                }
                case 145: {
                    stackOut_145_0 = null;
                    stackIn_146_0 = (String) (Object) stackOut_145_0;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    var9_ref = stackIn_146_0;
                    if (var9_ref == null) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    dn.field_k = var9_ref;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    stackOut_148_0 = (sg) var30;
                    stackIn_150_0 = stackOut_148_0;
                    stackIn_149_0 = stackOut_148_0;
                    if (var4_int == 0) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    stackOut_149_0 = (sg) (Object) stackIn_149_0;
                    stackOut_149_1 = 1;
                    stackIn_151_0 = stackOut_149_0;
                    stackIn_151_1 = stackOut_149_1;
                    statePc = 151;
                    continue stateLoop;
                }
                case 150: {
                    stackOut_150_0 = (sg) (Object) stackIn_150_0;
                    stackOut_150_1 = 0;
                    stackIn_151_0 = stackOut_150_0;
                    stackIn_151_1 = stackOut_150_1;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    stackIn_151_0.field_s = stackIn_151_1 != 0;
                    stackOut_151_0 = (sg) var30;
                    stackIn_153_0 = stackOut_151_0;
                    stackIn_152_0 = stackOut_151_0;
                    if (qj.field_b != var7) {
                        statePc = 153;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    stackOut_152_0 = (sg) (Object) stackIn_152_0;
                    stackOut_152_1 = 1;
                    stackIn_154_0 = stackOut_152_0;
                    stackIn_154_1 = stackOut_152_1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 153: {
                    stackOut_153_0 = (sg) (Object) stackIn_153_0;
                    stackOut_153_1 = 0;
                    stackIn_154_0 = stackOut_153_0;
                    stackIn_154_1 = stackOut_153_1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    stackIn_154_0.field_bb = stackIn_154_1 != 0;
                    var7++;
                    statePc = 135;
                    continue stateLoop;
                }
                case 155: {
                    var7 = 0;
                    var8 = 0;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (em.field_k <= var8) {
                        statePc = 333;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var31 = fk.field_p[var8 + 4];
                    var9 = var31;
                    if (!param1) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    stackOut_158_0 = -1;
                    stackIn_160_0 = stackOut_158_0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 159: {
                    stackOut_159_0 = 0;
                    stackIn_160_0 = stackOut_159_0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    var10 = stackIn_160_0;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (~(-1 + var31.length) >= ~var10) {
                        statePc = 332;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    if (var4_int == 0) {
                        statePc = 203;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (var10 < 0) {
                        statePc = 203;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (ji.field_D == null) {
                        statePc = 169;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (null == ji.field_D[var8]) {
                        statePc = 169;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if ((~vr.field_m & ji.field_D[var8][var10]) > 0) {
                        statePc = 168;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var15 = 1;
                    var16 = db.a(107, ji.field_D[var8][var10] & ~vr.field_m);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (td.field_E == null) {
                        statePc = 175;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (td.field_E[var8] != null) {
                        statePc = 172;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (0 < es.field_m) {
                        statePc = 175;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (!td.field_E[var8][var10]) {
                        statePc = 175;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var11 = 1;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (null == ci.field_h) {
                        statePc = 186;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (null != ci.field_h[var8]) {
                        statePc = 178;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var17 = ci.field_h[var8][var10];
                    if (var17 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (hm.field_o) {
                        statePc = 183;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (es.field_m <= 0) {
                        statePc = 182;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var11 = 1;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    if (var17 <= 0) {
                        statePc = 186;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (~var17 >= ~a.field_j) {
                        statePc = 186;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var13 = 1;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (pg.field_A == null) {
                        statePc = 196;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (null == pg.field_A[var8]) {
                        statePc = 196;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var17 = pg.field_A[var8][var10];
                    if (var17 <= 0) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (var17 <= bh.field_h) {
                        statePc = 191;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var12 = 1;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (var17 == 0) {
                        statePc = 196;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (hm.field_o) {
                        statePc = 196;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (es.field_m <= 0) {
                        statePc = 195;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var11 = 1;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (!param1) {
                        statePc = 201;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (nr.field_q == null) {
                        statePc = 201;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (null == nr.field_q[var8]) {
                        statePc = 201;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (!nr.field_q[var8][var10]) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    stackOut_200_0 = 1;
                    stackIn_202_0 = stackOut_200_0;
                    statePc = 202;
                    continue stateLoop;
                }
                case 201: {
                    stackOut_201_0 = 0;
                    stackIn_202_0 = stackOut_201_0;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    var14 = stackIn_202_0;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (bs.field_b < 2) {
                        statePc = 207;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if (di.field_p[12]) {
                        statePc = 206;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var15 = 0;
                    var12 = 0;
                    var14 = 0;
                    var13 = 0;
                    var11 = 0;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (var11 != 0) {
                        statePc = 213;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (var12 != 0) {
                        statePc = 213;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (var13 != 0) {
                        statePc = 213;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (var14 != 0) {
                        statePc = 213;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if (var15 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    stackOut_213_0 = 1;
                    stackIn_215_0 = stackOut_213_0;
                    statePc = 215;
                    continue stateLoop;
                }
                case 214: {
                    stackOut_214_0 = 0;
                    stackIn_215_0 = stackOut_214_0;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    var17 = stackIn_215_0;
                    wg.field_d = true;
                    if (var17 != 0) {
                        statePc = 234;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (var10 < 0) {
                        statePc = 234;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (null == pe.field_D) {
                        statePc = 234;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (!param1) {
                        statePc = 221;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (!k.field_i) {
                        statePc = 221;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 221: {
                    wg.field_d = false;
                    if (lr.field_c == null) {
                        statePc = 223;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 223: {
                    lr.field_c = new byte[em.field_k];
                    ek.field_F = new boolean[em.field_k];
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    qd.field_h = false;
                    var18_int = 0;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    if (var18_int >= var8) {
                        statePc = 227;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    ek.field_F[var18_int] = false;
                    var18_int++;
                    statePc = 225;
                    continue stateLoop;
                }
                case 227: {
                    js.a(-1, 1, param2, var8, 0, param1, var10, -1);
                    if (bs.field_b < 2) {
                        statePc = 231;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (di.field_p[12]) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    wg.field_d = true;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (!wg.field_d) {
                        statePc = 233;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var17 = 1;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    var18 = var9[var10 - -1];
                    if (var4_int == 0) {
                        statePc = 247;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (var18.field_rb != 0) {
                        statePc = 237;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (param1) {
                        statePc = 242;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (var17 != 0) {
                        statePc = 247;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (~(byte)var10 != ~param2.field_dc[var8]) {
                        statePc = 241;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 241: {
                    var6 = 1;
                    param2.field_dc[var8] = (byte)var10;
                    statePc = 247;
                    continue stateLoop;
                }
                case 242: {
                    if (var10 != -1) {
                        statePc = 246;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var19 = var7;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    if (var19 >= var31.length + (var7 - 1)) {
                        statePc = 247;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    qj.field_f[var19 / 8] = (byte)we.a((int) qj.field_f[var19 / 8], ~(1 << we.a(var19, 7)));
                    var19++;
                    statePc = 244;
                    continue stateLoop;
                }
                case 246: {
                    qj.field_f[(var10 - -var7) / 8] = (byte)nc.a((int) qj.field_f[(var10 + var7) / 8], 1 << we.a(var10 + var7, 7));
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    if (!param1) {
                        statePc = 250;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (var17 == 0) {
                        statePc = 250;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    qj.field_f[(var10 - -var7) / 8] = (byte)we.a((int) qj.field_f[(var10 + var7) / 8], ~(1 << we.a(7, var7 + var10)));
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (var10 < 0) {
                        statePc = 310;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (var18.field_v) {
                        statePc = 253;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (wa.field_d == null) {
                        statePc = 257;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (wa.field_d[var8] == null) {
                        statePc = 256;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var19_ref_String = wa.field_d[var8][var10];
                    statePc = 258;
                    continue stateLoop;
                }
                case 256: {
                    var19_ref_String = null;
                    statePc = 258;
                    continue stateLoop;
                }
                case 257: {
                    var19_ref_String = null;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if (ei.field_f == null) {
                        statePc = 262;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (ei.field_f[var8] == null) {
                        statePc = 261;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var20_ref = ei.field_f[var8][var10];
                    statePc = 263;
                    continue stateLoop;
                }
                case 261: {
                    var20_ref = null;
                    statePc = 263;
                    continue stateLoop;
                }
                case 262: {
                    var20_ref = null;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    var21 = null;
                    if (var20_ref == null) {
                        statePc = 266;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (var20_ref.equals((Object) (Object) var19_ref_String)) {
                        statePc = 266;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var21 = (Object) (Object) var20_ref;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    var22 = null;
                    if (var14 == 0) {
                        statePc = 268;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var22 = (Object) (Object) qh.field_D;
                    statePc = 287;
                    continue stateLoop;
                }
                case 268: {
                    if (var11 != 0) {
                        statePc = 286;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (var12 == 0) {
                        statePc = 273;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    var23_int = -bh.field_h + pg.field_A[var8][var10];
                    if (var23_int != 1) {
                        statePc = 272;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var22 = (Object) (Object) ip.field_g;
                    statePc = 273;
                    continue stateLoop;
                }
                case 272: {
                    var22 = (Object) (Object) re.a(nc.field_n, 4371, new String[1]);
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    if (var13 == 0) {
                        statePc = 277;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    var32 = re.a(dh.field_d, 4371, new String[2]);
                    var23_ref = var32;
                    var26_ref = var23_ref;
                    var23_ref = var26_ref;
                    var22 = (Object) (Object) var23_ref;
                    var26_ref = var32;
                    var23_ref = var26_ref;
                    if (var22 == null) {
                        statePc = 276;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var22 = (Object) (Object) (var22 + "<br>" + var32);
                    statePc = 277;
                    continue stateLoop;
                }
                case 276: {
                    var22 = (Object) (Object) var32;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    if (var15 == 0) {
                        statePc = 287;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    var23_ref = ar.field_e;
                    if (0 >= var16) {
                        statePc = 283;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    if (null == qa.field_s) {
                        statePc = 283;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (~var16 < ~qa.field_s.length) {
                        statePc = 283;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (qa.field_s[var16 + -1] == null) {
                        statePc = 283;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    var23_ref = qa.field_s[-1 + var16][0];
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    if (var22 != null) {
                        statePc = 285;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var22 = (Object) (Object) var23_ref;
                    statePc = 287;
                    continue stateLoop;
                }
                case 285: {
                    var22 = (Object) (Object) (var22 + "<br>" + var23_ref);
                    statePc = 287;
                    continue stateLoop;
                }
                case 286: {
                    var22 = (Object) (Object) vd.field_r;
                    var23_ref = (String) var22;
                    var26_ref = var23_ref;
                    var23_ref = var26_ref;
                    var22 = (Object) (Object) var23_ref;
                    var26_ref = (String) var22;
                    var23_ref = var26_ref;
                    var26_ref = var23_ref;
                    var23_ref = var26_ref;
                    var22 = (Object) (Object) var23_ref;
                    var23_ref = var26_ref;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    if (var4_int == 0) {
                        statePc = 303;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (!wg.field_d) {
                        statePc = 290;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var23_ref = null;
                    var24 = 0;
                    if (qd.field_h) {
                        statePc = 292;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var23_ref = "</col>" + wl.field_b + "<col=A00000>";
                    var26_ref = var23_ref;
                    var23_ref = var26_ref;
                    var26_ref = var23_ref;
                    var23_ref = var26_ref;
                    var22 = (Object) (Object) var23_ref;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    var25 = 0;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    if (var8 <= var25) {
                        statePc = 300;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (!ek.field_F[var25]) {
                        statePc = 299;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var26_ref = "</col>" + gm.field_l[var25] + "<col=A00000>";
                    var23_ref = var26_ref;
                    var22 = (Object) (Object) var23_ref;
                    var23_ref = var26_ref;
                    if (var23_ref == null) {
                        statePc = 298;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    var23_ref = var23_ref + ", " + var26_ref;
                    var24 = 1;
                    statePc = 299;
                    continue stateLoop;
                }
                case 298: {
                    var23_ref = var26_ref;
                    var22 = (Object) (Object) var23_ref;
                    var22 = (Object) (Object) var23_ref;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    var25++;
                    statePc = 294;
                    continue stateLoop;
                }
                case 300: {
                    if (var24 == 0) {
                        statePc = 302;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var22 = (Object) (Object) (mp.field_d + var23_ref);
                    statePc = 303;
                    continue stateLoop;
                }
                case 302: {
                    var22 = (Object) (Object) re.a(n.field_q, 4371, new String[1]);
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    if (var22 != null) {
                        statePc = 305;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var22 = (Object) (Object) ("<col=A00000>" + var22);
                    var33 = qr.a((String) var22, (byte) -125, "<br><col=A00000>", "<br>");
                    if (var21 == null) {
                        statePc = 307;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    var21 = (Object) (Object) (var21 + "<br>" + var33);
                    statePc = 308;
                    continue stateLoop;
                }
                case 307: {
                    var21 = (Object) (Object) var33;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    if (var21 == null) {
                        statePc = 310;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    dn.field_k = (String) var21;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    if (param1) {
                        statePc = 316;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    stackOut_311_0 = (sg) var18;
                    stackIn_314_0 = stackOut_311_0;
                    stackIn_312_0 = stackOut_311_0;
                    if (!wg.field_d) {
                        statePc = 314;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    stackOut_312_0 = (sg) (Object) stackIn_312_0;
                    stackIn_314_0 = stackOut_312_0;
                    stackIn_313_0 = stackOut_312_0;
                    if (~param2.field_dc[var8] != ~(byte)var10) {
                        statePc = 314;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    stackOut_313_0 = (sg) (Object) stackIn_313_0;
                    stackOut_313_1 = 1;
                    stackIn_315_0 = stackOut_313_0;
                    stackIn_315_1 = stackOut_313_1;
                    statePc = 315;
                    continue stateLoop;
                }
                case 314: {
                    stackOut_314_0 = (sg) (Object) stackIn_314_0;
                    stackOut_314_1 = 0;
                    stackIn_315_0 = stackOut_314_0;
                    stackIn_315_1 = stackOut_314_1;
                    statePc = 315;
                    continue stateLoop;
                }
                case 315: {
                    stackIn_315_0.field_bb = stackIn_315_1 != 0;
                    statePc = 327;
                    continue stateLoop;
                }
                case 316: {
                    if (var10 != -1) {
                        statePc = 323;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var18.field_bb = true;
                    var28 = var7;
                    var19 = var28;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (~var28 <= ~(-1 + (var31.length + var7))) {
                        statePc = 327;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    stackOut_319_0 = (sg) var18;
                    stackOut_319_1 = var18.field_bb;
                    stackIn_321_0 = stackOut_319_0;
                    stackIn_321_1 = stackOut_319_1;
                    stackIn_320_0 = stackOut_319_0;
                    stackIn_320_1 = stackOut_319_1;
                    if ((qj.field_f[var28 / 8] & 1 << (var28 & 7)) != 0) {
                        statePc = 321;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    stackOut_320_0 = (sg) (Object) stackIn_320_0;
                    stackOut_320_1 = stackIn_320_1;
                    stackOut_320_2 = 1;
                    stackIn_322_0 = stackOut_320_0;
                    stackIn_322_1 = stackOut_320_1;
                    stackIn_322_2 = stackOut_320_2;
                    statePc = 322;
                    continue stateLoop;
                }
                case 321: {
                    stackOut_321_0 = (sg) (Object) stackIn_321_0;
                    stackOut_321_1 = stackIn_321_1;
                    stackOut_321_2 = 0;
                    stackIn_322_0 = stackOut_321_0;
                    stackIn_322_1 = stackOut_321_1;
                    stackIn_322_2 = stackOut_321_2;
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    stackIn_322_0.field_bb = stackIn_322_1 & stackIn_322_2 != 0;
                    var28++;
                    statePc = 318;
                    continue stateLoop;
                }
                case 323: {
                    stackOut_323_0 = (sg) var18;
                    stackIn_325_0 = stackOut_323_0;
                    stackIn_324_0 = stackOut_323_0;
                    if ((qj.field_f[(var7 + var10) / 8] & 1 << (7 & var10 + var7)) == 0) {
                        statePc = 325;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    stackOut_324_0 = (sg) (Object) stackIn_324_0;
                    stackOut_324_1 = 1;
                    stackIn_326_0 = stackOut_324_0;
                    stackIn_326_1 = stackOut_324_1;
                    statePc = 326;
                    continue stateLoop;
                }
                case 325: {
                    stackOut_325_0 = (sg) (Object) stackIn_325_0;
                    stackOut_325_1 = 0;
                    stackIn_326_0 = stackOut_325_0;
                    stackIn_326_1 = stackOut_325_1;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    stackIn_326_0.field_bb = stackIn_326_1 != 0;
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    stackOut_327_0 = (sg) var18;
                    stackIn_330_0 = stackOut_327_0;
                    stackIn_328_0 = stackOut_327_0;
                    if (var4_int == 0) {
                        statePc = 330;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    stackOut_328_0 = (sg) (Object) stackIn_328_0;
                    stackIn_330_0 = stackOut_328_0;
                    stackIn_329_0 = stackOut_328_0;
                    if (var17 != 0) {
                        statePc = 330;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    stackOut_329_0 = (sg) (Object) stackIn_329_0;
                    stackOut_329_1 = 1;
                    stackIn_331_0 = stackOut_329_0;
                    stackIn_331_1 = stackOut_329_1;
                    statePc = 331;
                    continue stateLoop;
                }
                case 330: {
                    stackOut_330_0 = (sg) (Object) stackIn_330_0;
                    stackOut_330_1 = 0;
                    stackIn_331_0 = stackOut_330_0;
                    stackIn_331_1 = stackOut_330_1;
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    stackIn_331_0.field_s = stackIn_331_1 != 0;
                    var10++;
                    statePc = 161;
                    continue stateLoop;
                }
                case 332: {
                    var7 = var7 + (ks.field_e[var8] & 255);
                    var8++;
                    statePc = 156;
                    continue stateLoop;
                }
                case 333: {
                    if (var6 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if (!param1) {
                        statePc = 336;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 336: {
                    ti.a(param3, 0);
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
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
        ((sc) this).field_r = null;
        ((sc) this).field_t = null;
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
            ((sc) this).field_r = null;
            break L0;
          }
        }
        var2 = null;
        var3 = 0;
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((sc) this).field_o) {
            if (var2 == null) {
              return;
            } else {
              var4 = ((ln) var2).field_p;
              var5 = null;
              var6 = 2147483647;
              var15 = ((sc) this).field_t;
              var8 = 0;
              L2: while (true) {
                if (var8 >= var15.length) {
                  L3: {
                    if (var5 == null) {
                      var17 = ((sc) this).field_t;
                      var13 = 0;
                      var8 = var13;
                      L4: while (true) {
                        if (var13 >= var17.length) {
                          break L3;
                        } else {
                          var18 = var17[var13];
                          var5 = (Object) (Object) var18;
                          var5 = (Object) (Object) var18;
                          var10 = var18.field_p;
                          if (null != ((sc) this).field_r) {
                            if (((sc) this).field_r.field_R != var18.field_R) {
                              if (((sc) this).field_g.field_g.field_c[var4][var10] > 2) {
                                var11 = hs.field_i[var10];
                                if (var6 > var11) {
                                  var5 = (Object) (Object) var18;
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
                      var7 = new qm(3, ((sc) this).field_n, (ln) var2, (ln) var5);
                      lh.field_G.a((byte) -113, (oh) (Object) var7);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                } else {
                  L6: {
                    var16 = var15[var8];
                    var5 = (Object) (Object) var16;
                    var18 = var16;
                    var5 = (Object) (Object) var18;
                    var10 = var16.field_p;
                    if (((sc) this).field_r == null) {
                      break L6;
                    } else {
                      if (((sc) this).field_r.field_R == var16.field_R) {
                        break L6;
                      } else {
                        var8++;
                        continue L2;
                      }
                    }
                  }
                  if (((sc) this).field_g.field_g.field_c[var4][var10] > 2) {
                    var11 = hs.field_i[var10];
                    if (var11 < var6) {
                      var5 = (Object) (Object) var16;
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
            var14 = ((sc) this).field_g.field_g.field_e[var4];
            var2 = (Object) (Object) var14;
            var2 = (Object) (Object) var14;
            if (var14.field_y == ((sc) this).field_n) {
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
                var2 = (Object) (Object) var14;
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
          if (var4_int >= ((sc) this).field_o) {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((sc) this).a((byte) 23);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var4 = new qm(2, ((sc) this).field_n, (ln) var2);
                lh.field_G.a((byte) -113, (oh) (Object) var4);
                break L2;
              }
            }
            return;
          } else {
            var5 = hs.field_i[var4_int];
            if (var5 != 0) {
              L3: {
                var6 = ((sc) this).field_g.field_g.field_e[var4_int];
                var2 = (Object) (Object) var6;
                var2 = (Object) (Object) var6;
                stackOut_4_0 = ~var6.field_x;
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
              if (stackIn_7_0 <= ~stackIn_7_1) {
                L4: {
                  if (null == var6.field_y) {
                    if (var6.field_L != 0) {
                      break L4;
                    } else {
                      var4_int++;
                      continue L0;
                    }
                  } else {
                    var7 = ((sc) this).field_g.field_D[var6.field_y.field_x];
                    var8 = ((sc) this).field_g.field_D[((sc) this).field_n.field_x];
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
                  var2 = (Object) (Object) var6;
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
            ((sc) this).field_r = null;
            ((sc) this).field_s = 2147483647;
            var4 = param1.j(18229);
            while (var4 != null) {
                var5 = var4.field_p;
                var6 = ((sc) this).field_t;
                for (var7 = 0; var6.length > var7; var7++) {
                    var8 = var6[var7];
                    var9 = ((sc) this).field_g.field_g.field_c[var5][var8.field_p];
                    if (var9 < ((sc) this).field_s) {
                        ((sc) this).field_s = var9;
                        ((sc) this).field_r = var8;
                    }
                }
                var4 = param1.h(-23410);
            }
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "sc.JA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = false;
        field_p = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
