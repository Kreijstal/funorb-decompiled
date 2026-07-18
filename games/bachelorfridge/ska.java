/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ska extends k {
    private int field_l;
    static kv field_k;

    public static void e() {
        field_k = null;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if (var4_int != 1) {
                  break L1;
                } else {
                  L2: {
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (param1.b(param0 ^ -16711866) != 1) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L2;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L2;
                    }
                  }
                  ((ska) this).field_f = stackIn_9_1 != 0;
                  break L1;
                }
              } else {
                ((ska) this).field_l = param1.b(16711935);
                break L1;
              }
            }
            L3: {
              if (param0 == -71) {
                break L3;
              } else {
                int[] discarded$1 = ((ska) this).a(-58, -67);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ska.E(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var21 = 0;
        int var22 = 0;
        int[][] var23 = null;
        int[][] var24 = null;
        int[][] var33 = null;
        int[][] var42 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int[] stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int[] stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int[] stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        int[] stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int[] stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int[] stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int[] stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int[] stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int[] stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int[] stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int[] stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int[] stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int[] stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        int[] stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int[] stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int[] stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_108_2 = 0;
        int[] stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int[] stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int[] stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int[] stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int[] stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int[] stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int[] stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int[] stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int[] stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int[] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int[] stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int[] stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int[] stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int[] stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int[] stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int[] stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int[] stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int[] stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int[] stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int[] stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int[] stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int[] stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        int[] stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int[] stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int[] stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int[] stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int[] stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int[] stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int[] stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        int[] stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int[] stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        int stackOut_107_2 = 0;
        int[] stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_106_2 = 0;
        int[] stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        int[] stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        int[] stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        int[] stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int[] stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int[] stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        var22 = BachelorFridge.field_y;
        if (!param0) {
          L0: {
            var51 = ((ska) this).field_h.a(param1, -858);
            var42 = var51;
            var33 = var42;
            var24 = var33;
            var23 = var24;
            var3 = var23;
            if (!((ska) this).field_h.field_b) {
              break L0;
            } else {
              var52 = ((ska) this).a((byte) -94, 0, param1);
              var53 = ((ska) this).a((byte) -126, 1, param1);
              var12 = var51[0];
              var13 = var51[1];
              var14 = var51[2];
              var55 = var52[0];
              var56 = var52[1];
              var58 = var52[2];
              var54 = var53[0];
              var57 = var53[1];
              var59 = var53[2];
              var21 = ((ska) this).field_l;
              if (var21 == 1) {
                var12 = var51[0];
                var13 = var51[1];
                var14 = var51[2];
                var54 = var53[0];
                var55 = var52[0];
                var56 = var52[1];
                var57 = var53[1];
                var58 = var52[2];
                var59 = var53[2];
                var21 = 0;
                L1: while (true) {
                  if (var21 >= hh.field_d) {
                    break L0;
                  } else {
                    var12[var21] = var54[var21] + var55[var21];
                    var13[var21] = var56[var21] + var57[var21];
                    var14[var21] = var58[var21] + var59[var21];
                    var21++;
                    continue L1;
                  }
                }
              } else {
                if (var21 == 2) {
                  var12 = var51[0];
                  var13 = var51[1];
                  var14 = var51[2];
                  var54 = var53[0];
                  var55 = var52[0];
                  var56 = var52[1];
                  var57 = var53[1];
                  var58 = var52[2];
                  var59 = var53[2];
                  var21 = 0;
                  L2: while (true) {
                    if (~var21 <= ~hh.field_d) {
                      break L0;
                    } else {
                      var12[var21] = -var54[var21] + var55[var21];
                      var13[var21] = -var57[var21] + var56[var21];
                      var14[var21] = -var59[var21] + var58[var21];
                      var21++;
                      continue L2;
                    }
                  }
                } else {
                  if (var21 != 3) {
                    if (var21 != 4) {
                      if (var21 == 5) {
                        var12 = var51[0];
                        var13 = var51[1];
                        var14 = var51[2];
                        var54 = var53[0];
                        var55 = var52[0];
                        var56 = var52[1];
                        var57 = var53[1];
                        var58 = var52[2];
                        var59 = var53[2];
                        var21 = 0;
                        L3: while (true) {
                          if (hh.field_d <= var21) {
                            break L0;
                          } else {
                            var12[var21] = 4096 + -((4096 - var55[var21]) * (-var54[var21] + 4096) >> 12);
                            var13[var21] = 4096 - ((-var57[var21] + 4096) * (4096 + -var56[var21]) >> 12);
                            var14[var21] = 4096 + -((-var59[var21] + 4096) * (-var58[var21] + 4096) >> 12);
                            var21++;
                            continue L3;
                          }
                        }
                      } else {
                        if (6 == var21) {
                          var12 = var51[0];
                          var13 = var51[1];
                          var14 = var51[2];
                          var54 = var53[0];
                          var55 = var52[0];
                          var56 = var52[1];
                          var57 = var53[1];
                          var58 = var52[2];
                          var59 = var53[2];
                          var21 = 0;
                          L4: while (true) {
                            if (hh.field_d <= var21) {
                              break L0;
                            } else {
                              L5: {
                                var9 = var59[var21];
                                var8 = var57[var21];
                                var7 = var54[var21];
                                stackOut_45_0 = (int[]) var12;
                                stackOut_45_1 = var21;
                                stackIn_47_0 = stackOut_45_0;
                                stackIn_47_1 = stackOut_45_1;
                                stackIn_46_0 = stackOut_45_0;
                                stackIn_46_1 = stackOut_45_1;
                                if (var7 >= 2048) {
                                  stackOut_47_0 = (int[]) (Object) stackIn_47_0;
                                  stackOut_47_1 = stackIn_47_1;
                                  stackOut_47_2 = 4096 + -((4096 - var7) * (4096 - var55[var21]) >> 11);
                                  stackIn_48_0 = stackOut_47_0;
                                  stackIn_48_1 = stackOut_47_1;
                                  stackIn_48_2 = stackOut_47_2;
                                  break L5;
                                } else {
                                  stackOut_46_0 = (int[]) (Object) stackIn_46_0;
                                  stackOut_46_1 = stackIn_46_1;
                                  stackOut_46_2 = var7 * var55[var21] >> 11;
                                  stackIn_48_0 = stackOut_46_0;
                                  stackIn_48_1 = stackOut_46_1;
                                  stackIn_48_2 = stackOut_46_2;
                                  break L5;
                                }
                              }
                              L6: {
                                stackIn_48_0[stackIn_48_1] = stackIn_48_2;
                                stackOut_48_0 = (int[]) var13;
                                stackOut_48_1 = var21;
                                stackIn_50_0 = stackOut_48_0;
                                stackIn_50_1 = stackOut_48_1;
                                stackIn_49_0 = stackOut_48_0;
                                stackIn_49_1 = stackOut_48_1;
                                if (var8 < 2048) {
                                  stackOut_50_0 = (int[]) (Object) stackIn_50_0;
                                  stackOut_50_1 = stackIn_50_1;
                                  stackOut_50_2 = var8 * var56[var21] >> 11;
                                  stackIn_51_0 = stackOut_50_0;
                                  stackIn_51_1 = stackOut_50_1;
                                  stackIn_51_2 = stackOut_50_2;
                                  break L6;
                                } else {
                                  stackOut_49_0 = (int[]) (Object) stackIn_49_0;
                                  stackOut_49_1 = stackIn_49_1;
                                  stackOut_49_2 = 4096 - ((4096 - var56[var21]) * (4096 + -var8) >> 11);
                                  stackIn_51_0 = stackOut_49_0;
                                  stackIn_51_1 = stackOut_49_1;
                                  stackIn_51_2 = stackOut_49_2;
                                  break L6;
                                }
                              }
                              L7: {
                                stackIn_51_0[stackIn_51_1] = stackIn_51_2;
                                stackOut_51_0 = (int[]) var14;
                                stackOut_51_1 = var21;
                                stackIn_53_0 = stackOut_51_0;
                                stackIn_53_1 = stackOut_51_1;
                                stackIn_52_0 = stackOut_51_0;
                                stackIn_52_1 = stackOut_51_1;
                                if (var9 >= 2048) {
                                  stackOut_53_0 = (int[]) (Object) stackIn_53_0;
                                  stackOut_53_1 = stackIn_53_1;
                                  stackOut_53_2 = 4096 + -((4096 - var58[var21]) * (4096 + -var9) >> 11);
                                  stackIn_54_0 = stackOut_53_0;
                                  stackIn_54_1 = stackOut_53_1;
                                  stackIn_54_2 = stackOut_53_2;
                                  break L7;
                                } else {
                                  stackOut_52_0 = (int[]) (Object) stackIn_52_0;
                                  stackOut_52_1 = stackIn_52_1;
                                  stackOut_52_2 = var9 * var58[var21] >> 11;
                                  stackIn_54_0 = stackOut_52_0;
                                  stackIn_54_1 = stackOut_52_1;
                                  stackIn_54_2 = stackOut_52_2;
                                  break L7;
                                }
                              }
                              stackIn_54_0[stackIn_54_1] = stackIn_54_2;
                              var21++;
                              continue L4;
                            }
                          }
                        } else {
                          if (var21 == 7) {
                            var12 = var51[0];
                            var13 = var51[1];
                            var14 = var51[2];
                            var54 = var53[0];
                            var55 = var52[0];
                            var56 = var52[1];
                            var57 = var53[1];
                            var58 = var52[2];
                            var59 = var53[2];
                            var21 = 0;
                            L8: while (true) {
                              if (~var21 <= ~hh.field_d) {
                                break L0;
                              } else {
                                L9: {
                                  var5 = var56[var21];
                                  var4 = var55[var21];
                                  var6 = var58[var21];
                                  stackOut_57_0 = (int[]) var12;
                                  stackOut_57_1 = var21;
                                  stackIn_59_0 = stackOut_57_0;
                                  stackIn_59_1 = stackOut_57_1;
                                  stackIn_58_0 = stackOut_57_0;
                                  stackIn_58_1 = stackOut_57_1;
                                  if (var4 == 4096) {
                                    stackOut_59_0 = (int[]) (Object) stackIn_59_0;
                                    stackOut_59_1 = stackIn_59_1;
                                    stackOut_59_2 = 4096;
                                    stackIn_60_0 = stackOut_59_0;
                                    stackIn_60_1 = stackOut_59_1;
                                    stackIn_60_2 = stackOut_59_2;
                                    break L9;
                                  } else {
                                    stackOut_58_0 = (int[]) (Object) stackIn_58_0;
                                    stackOut_58_1 = stackIn_58_1;
                                    stackOut_58_2 = (var54[var21] << 12) / (4096 - var4);
                                    stackIn_60_0 = stackOut_58_0;
                                    stackIn_60_1 = stackOut_58_1;
                                    stackIn_60_2 = stackOut_58_2;
                                    break L9;
                                  }
                                }
                                L10: {
                                  stackIn_60_0[stackIn_60_1] = stackIn_60_2;
                                  stackOut_60_0 = (int[]) var13;
                                  stackOut_60_1 = var21;
                                  stackIn_62_0 = stackOut_60_0;
                                  stackIn_62_1 = stackOut_60_1;
                                  stackIn_61_0 = stackOut_60_0;
                                  stackIn_61_1 = stackOut_60_1;
                                  if (var5 != 4096) {
                                    stackOut_62_0 = (int[]) (Object) stackIn_62_0;
                                    stackOut_62_1 = stackIn_62_1;
                                    stackOut_62_2 = (var57[var21] << 12) / (4096 - var5);
                                    stackIn_63_0 = stackOut_62_0;
                                    stackIn_63_1 = stackOut_62_1;
                                    stackIn_63_2 = stackOut_62_2;
                                    break L10;
                                  } else {
                                    stackOut_61_0 = (int[]) (Object) stackIn_61_0;
                                    stackOut_61_1 = stackIn_61_1;
                                    stackOut_61_2 = 4096;
                                    stackIn_63_0 = stackOut_61_0;
                                    stackIn_63_1 = stackOut_61_1;
                                    stackIn_63_2 = stackOut_61_2;
                                    break L10;
                                  }
                                }
                                L11: {
                                  stackIn_63_0[stackIn_63_1] = stackIn_63_2;
                                  stackOut_63_0 = (int[]) var14;
                                  stackOut_63_1 = var21;
                                  stackIn_65_0 = stackOut_63_0;
                                  stackIn_65_1 = stackOut_63_1;
                                  stackIn_64_0 = stackOut_63_0;
                                  stackIn_64_1 = stackOut_63_1;
                                  if (var6 == 4096) {
                                    stackOut_65_0 = (int[]) (Object) stackIn_65_0;
                                    stackOut_65_1 = stackIn_65_1;
                                    stackOut_65_2 = 4096;
                                    stackIn_66_0 = stackOut_65_0;
                                    stackIn_66_1 = stackOut_65_1;
                                    stackIn_66_2 = stackOut_65_2;
                                    break L11;
                                  } else {
                                    stackOut_64_0 = (int[]) (Object) stackIn_64_0;
                                    stackOut_64_1 = stackIn_64_1;
                                    stackOut_64_2 = (var59[var21] << 12) / (-var6 + 4096);
                                    stackIn_66_0 = stackOut_64_0;
                                    stackIn_66_1 = stackOut_64_1;
                                    stackIn_66_2 = stackOut_64_2;
                                    break L11;
                                  }
                                }
                                stackIn_66_0[stackIn_66_1] = stackIn_66_2;
                                var21++;
                                continue L8;
                              }
                            }
                          } else {
                            if (var21 == 8) {
                              var12 = var51[0];
                              var13 = var51[1];
                              var14 = var51[2];
                              var54 = var53[0];
                              var55 = var52[0];
                              var56 = var52[1];
                              var57 = var53[1];
                              var58 = var52[2];
                              var59 = var53[2];
                              var21 = 0;
                              L12: while (true) {
                                if (hh.field_d <= var21) {
                                  break L0;
                                } else {
                                  L13: {
                                    var4 = var55[var21];
                                    var6 = var58[var21];
                                    var5 = var56[var21];
                                    stackOut_69_0 = (int[]) var12;
                                    stackOut_69_1 = var21;
                                    stackIn_71_0 = stackOut_69_0;
                                    stackIn_71_1 = stackOut_69_1;
                                    stackIn_70_0 = stackOut_69_0;
                                    stackIn_70_1 = stackOut_69_1;
                                    if (0 == var4) {
                                      stackOut_71_0 = (int[]) (Object) stackIn_71_0;
                                      stackOut_71_1 = stackIn_71_1;
                                      stackOut_71_2 = 0;
                                      stackIn_72_0 = stackOut_71_0;
                                      stackIn_72_1 = stackOut_71_1;
                                      stackIn_72_2 = stackOut_71_2;
                                      break L13;
                                    } else {
                                      stackOut_70_0 = (int[]) (Object) stackIn_70_0;
                                      stackOut_70_1 = stackIn_70_1;
                                      stackOut_70_2 = -((-var54[var21] + 4096 << 12) / var4) + 4096;
                                      stackIn_72_0 = stackOut_70_0;
                                      stackIn_72_1 = stackOut_70_1;
                                      stackIn_72_2 = stackOut_70_2;
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    stackIn_72_0[stackIn_72_1] = stackIn_72_2;
                                    stackOut_72_0 = (int[]) var13;
                                    stackOut_72_1 = var21;
                                    stackIn_74_0 = stackOut_72_0;
                                    stackIn_74_1 = stackOut_72_1;
                                    stackIn_73_0 = stackOut_72_0;
                                    stackIn_73_1 = stackOut_72_1;
                                    if (var5 == 0) {
                                      stackOut_74_0 = (int[]) (Object) stackIn_74_0;
                                      stackOut_74_1 = stackIn_74_1;
                                      stackOut_74_2 = 0;
                                      stackIn_75_0 = stackOut_74_0;
                                      stackIn_75_1 = stackOut_74_1;
                                      stackIn_75_2 = stackOut_74_2;
                                      break L14;
                                    } else {
                                      stackOut_73_0 = (int[]) (Object) stackIn_73_0;
                                      stackOut_73_1 = stackIn_73_1;
                                      stackOut_73_2 = -((4096 + -var57[var21] << 12) / var5) + 4096;
                                      stackIn_75_0 = stackOut_73_0;
                                      stackIn_75_1 = stackOut_73_1;
                                      stackIn_75_2 = stackOut_73_2;
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                    stackOut_75_0 = (int[]) var14;
                                    stackOut_75_1 = var21;
                                    stackIn_77_0 = stackOut_75_0;
                                    stackIn_77_1 = stackOut_75_1;
                                    stackIn_76_0 = stackOut_75_0;
                                    stackIn_76_1 = stackOut_75_1;
                                    if (var6 != 0) {
                                      stackOut_77_0 = (int[]) (Object) stackIn_77_0;
                                      stackOut_77_1 = stackIn_77_1;
                                      stackOut_77_2 = -((4096 + -var59[var21] << 12) / var6) + 4096;
                                      stackIn_78_0 = stackOut_77_0;
                                      stackIn_78_1 = stackOut_77_1;
                                      stackIn_78_2 = stackOut_77_2;
                                      break L15;
                                    } else {
                                      stackOut_76_0 = (int[]) (Object) stackIn_76_0;
                                      stackOut_76_1 = stackIn_76_1;
                                      stackOut_76_2 = 0;
                                      stackIn_78_0 = stackOut_76_0;
                                      stackIn_78_1 = stackOut_76_1;
                                      stackIn_78_2 = stackOut_76_2;
                                      break L15;
                                    }
                                  }
                                  stackIn_78_0[stackIn_78_1] = stackIn_78_2;
                                  var21++;
                                  continue L12;
                                }
                              }
                            } else {
                              if (var21 == 9) {
                                var12 = var51[0];
                                var13 = var51[1];
                                var14 = var51[2];
                                var54 = var53[0];
                                var55 = var52[0];
                                var56 = var52[1];
                                var57 = var53[1];
                                var58 = var52[2];
                                var59 = var53[2];
                                var21 = 0;
                                L16: while (true) {
                                  if (~var21 <= ~hh.field_d) {
                                    break L0;
                                  } else {
                                    L17: {
                                      var6 = var58[var21];
                                      var8 = var57[var21];
                                      var9 = var59[var21];
                                      var4 = var55[var21];
                                      var5 = var56[var21];
                                      var7 = var54[var21];
                                      stackOut_81_0 = (int[]) var12;
                                      stackOut_81_1 = var21;
                                      stackIn_83_0 = stackOut_81_0;
                                      stackIn_83_1 = stackOut_81_1;
                                      stackIn_82_0 = stackOut_81_0;
                                      stackIn_82_1 = stackOut_81_1;
                                      if (~var7 < ~var4) {
                                        stackOut_83_0 = (int[]) (Object) stackIn_83_0;
                                        stackOut_83_1 = stackIn_83_1;
                                        stackOut_83_2 = var4;
                                        stackIn_84_0 = stackOut_83_0;
                                        stackIn_84_1 = stackOut_83_1;
                                        stackIn_84_2 = stackOut_83_2;
                                        break L17;
                                      } else {
                                        stackOut_82_0 = (int[]) (Object) stackIn_82_0;
                                        stackOut_82_1 = stackIn_82_1;
                                        stackOut_82_2 = var7;
                                        stackIn_84_0 = stackOut_82_0;
                                        stackIn_84_1 = stackOut_82_1;
                                        stackIn_84_2 = stackOut_82_2;
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      stackIn_84_0[stackIn_84_1] = stackIn_84_2;
                                      stackOut_84_0 = (int[]) var13;
                                      stackOut_84_1 = var21;
                                      stackIn_86_0 = stackOut_84_0;
                                      stackIn_86_1 = stackOut_84_1;
                                      stackIn_85_0 = stackOut_84_0;
                                      stackIn_85_1 = stackOut_84_1;
                                      if (var8 > var5) {
                                        stackOut_86_0 = (int[]) (Object) stackIn_86_0;
                                        stackOut_86_1 = stackIn_86_1;
                                        stackOut_86_2 = var5;
                                        stackIn_87_0 = stackOut_86_0;
                                        stackIn_87_1 = stackOut_86_1;
                                        stackIn_87_2 = stackOut_86_2;
                                        break L18;
                                      } else {
                                        stackOut_85_0 = (int[]) (Object) stackIn_85_0;
                                        stackOut_85_1 = stackIn_85_1;
                                        stackOut_85_2 = var8;
                                        stackIn_87_0 = stackOut_85_0;
                                        stackIn_87_1 = stackOut_85_1;
                                        stackIn_87_2 = stackOut_85_2;
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      stackIn_87_0[stackIn_87_1] = stackIn_87_2;
                                      stackOut_87_0 = (int[]) var14;
                                      stackOut_87_1 = var21;
                                      stackIn_89_0 = stackOut_87_0;
                                      stackIn_89_1 = stackOut_87_1;
                                      stackIn_88_0 = stackOut_87_0;
                                      stackIn_88_1 = stackOut_87_1;
                                      if (var6 < var9) {
                                        stackOut_89_0 = (int[]) (Object) stackIn_89_0;
                                        stackOut_89_1 = stackIn_89_1;
                                        stackOut_89_2 = var6;
                                        stackIn_90_0 = stackOut_89_0;
                                        stackIn_90_1 = stackOut_89_1;
                                        stackIn_90_2 = stackOut_89_2;
                                        break L19;
                                      } else {
                                        stackOut_88_0 = (int[]) (Object) stackIn_88_0;
                                        stackOut_88_1 = stackIn_88_1;
                                        stackOut_88_2 = var9;
                                        stackIn_90_0 = stackOut_88_0;
                                        stackIn_90_1 = stackOut_88_1;
                                        stackIn_90_2 = stackOut_88_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_90_0[stackIn_90_1] = stackIn_90_2;
                                    var21++;
                                    continue L16;
                                  }
                                }
                              } else {
                                if (10 == var21) {
                                  var12 = var51[0];
                                  var13 = var51[1];
                                  var14 = var51[2];
                                  var54 = var53[0];
                                  var55 = var52[0];
                                  var56 = var52[1];
                                  var57 = var53[1];
                                  var58 = var52[2];
                                  var59 = var53[2];
                                  var21 = 0;
                                  L20: while (true) {
                                    if (~hh.field_d >= ~var21) {
                                      break L0;
                                    } else {
                                      L21: {
                                        var4 = var55[var21];
                                        var5 = var56[var21];
                                        var6 = var58[var21];
                                        var8 = var57[var21];
                                        var7 = var54[var21];
                                        var9 = var59[var21];
                                        stackOut_93_0 = (int[]) var12;
                                        stackOut_93_1 = var21;
                                        stackIn_95_0 = stackOut_93_0;
                                        stackIn_95_1 = stackOut_93_1;
                                        stackIn_94_0 = stackOut_93_0;
                                        stackIn_94_1 = stackOut_93_1;
                                        if (~var7 > ~var4) {
                                          stackOut_95_0 = (int[]) (Object) stackIn_95_0;
                                          stackOut_95_1 = stackIn_95_1;
                                          stackOut_95_2 = var4;
                                          stackIn_96_0 = stackOut_95_0;
                                          stackIn_96_1 = stackOut_95_1;
                                          stackIn_96_2 = stackOut_95_2;
                                          break L21;
                                        } else {
                                          stackOut_94_0 = (int[]) (Object) stackIn_94_0;
                                          stackOut_94_1 = stackIn_94_1;
                                          stackOut_94_2 = var7;
                                          stackIn_96_0 = stackOut_94_0;
                                          stackIn_96_1 = stackOut_94_1;
                                          stackIn_96_2 = stackOut_94_2;
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        stackIn_96_0[stackIn_96_1] = stackIn_96_2;
                                        stackOut_96_0 = (int[]) var13;
                                        stackOut_96_1 = var21;
                                        stackIn_98_0 = stackOut_96_0;
                                        stackIn_98_1 = stackOut_96_1;
                                        stackIn_97_0 = stackOut_96_0;
                                        stackIn_97_1 = stackOut_96_1;
                                        if (~var5 < ~var8) {
                                          stackOut_98_0 = (int[]) (Object) stackIn_98_0;
                                          stackOut_98_1 = stackIn_98_1;
                                          stackOut_98_2 = var5;
                                          stackIn_99_0 = stackOut_98_0;
                                          stackIn_99_1 = stackOut_98_1;
                                          stackIn_99_2 = stackOut_98_2;
                                          break L22;
                                        } else {
                                          stackOut_97_0 = (int[]) (Object) stackIn_97_0;
                                          stackOut_97_1 = stackIn_97_1;
                                          stackOut_97_2 = var8;
                                          stackIn_99_0 = stackOut_97_0;
                                          stackIn_99_1 = stackOut_97_1;
                                          stackIn_99_2 = stackOut_97_2;
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        stackIn_99_0[stackIn_99_1] = stackIn_99_2;
                                        stackOut_99_0 = (int[]) var14;
                                        stackOut_99_1 = var21;
                                        stackIn_101_0 = stackOut_99_0;
                                        stackIn_101_1 = stackOut_99_1;
                                        stackIn_100_0 = stackOut_99_0;
                                        stackIn_100_1 = stackOut_99_1;
                                        if (~var9 <= ~var6) {
                                          stackOut_101_0 = (int[]) (Object) stackIn_101_0;
                                          stackOut_101_1 = stackIn_101_1;
                                          stackOut_101_2 = var9;
                                          stackIn_102_0 = stackOut_101_0;
                                          stackIn_102_1 = stackOut_101_1;
                                          stackIn_102_2 = stackOut_101_2;
                                          break L23;
                                        } else {
                                          stackOut_100_0 = (int[]) (Object) stackIn_100_0;
                                          stackOut_100_1 = stackIn_100_1;
                                          stackOut_100_2 = var6;
                                          stackIn_102_0 = stackOut_100_0;
                                          stackIn_102_1 = stackOut_100_1;
                                          stackIn_102_2 = stackOut_100_2;
                                          break L23;
                                        }
                                      }
                                      stackIn_102_0[stackIn_102_1] = stackIn_102_2;
                                      var21++;
                                      continue L20;
                                    }
                                  }
                                } else {
                                  if (var21 != 11) {
                                    if (12 != var21) {
                                      break L0;
                                    } else {
                                      var12 = var51[0];
                                      var13 = var51[1];
                                      var14 = var51[2];
                                      var54 = var53[0];
                                      var55 = var52[0];
                                      var56 = var52[1];
                                      var57 = var53[1];
                                      var58 = var52[2];
                                      var59 = var53[2];
                                      var21 = 0;
                                      L24: while (true) {
                                        if (~hh.field_d >= ~var21) {
                                          break L0;
                                        } else {
                                          var4 = var55[var21];
                                          var5 = var56[var21];
                                          var6 = var58[var21];
                                          var8 = var57[var21];
                                          var7 = var54[var21];
                                          var9 = var59[var21];
                                          var12[var21] = -(var7 * var4 >> 11) + var4 + var7;
                                          var13[var21] = var5 - -var8 + -(var5 * var8 >> 11);
                                          var14[var21] = -(var6 * var9 >> 11) + var9 + var6;
                                          var21++;
                                          continue L24;
                                        }
                                      }
                                    }
                                  } else {
                                    var12 = var51[0];
                                    var13 = var51[1];
                                    var14 = var51[2];
                                    var54 = var53[0];
                                    var55 = var52[0];
                                    var56 = var52[1];
                                    var57 = var53[1];
                                    var58 = var52[2];
                                    var59 = var53[2];
                                    var21 = 0;
                                    L25: while (true) {
                                      if (var21 >= hh.field_d) {
                                        break L0;
                                      } else {
                                        L26: {
                                          var9 = var59[var21];
                                          var8 = var57[var21];
                                          var6 = var58[var21];
                                          var4 = var55[var21];
                                          var5 = var56[var21];
                                          var7 = var54[var21];
                                          stackOut_105_0 = (int[]) var12;
                                          stackOut_105_1 = var21;
                                          stackIn_107_0 = stackOut_105_0;
                                          stackIn_107_1 = stackOut_105_1;
                                          stackIn_106_0 = stackOut_105_0;
                                          stackIn_106_1 = stackOut_105_1;
                                          if (var7 >= var4) {
                                            stackOut_107_0 = (int[]) (Object) stackIn_107_0;
                                            stackOut_107_1 = stackIn_107_1;
                                            stackOut_107_2 = -var4 + var7;
                                            stackIn_108_0 = stackOut_107_0;
                                            stackIn_108_1 = stackOut_107_1;
                                            stackIn_108_2 = stackOut_107_2;
                                            break L26;
                                          } else {
                                            stackOut_106_0 = (int[]) (Object) stackIn_106_0;
                                            stackOut_106_1 = stackIn_106_1;
                                            stackOut_106_2 = var4 - var7;
                                            stackIn_108_0 = stackOut_106_0;
                                            stackIn_108_1 = stackOut_106_1;
                                            stackIn_108_2 = stackOut_106_2;
                                            break L26;
                                          }
                                        }
                                        L27: {
                                          stackIn_108_0[stackIn_108_1] = stackIn_108_2;
                                          stackOut_108_0 = (int[]) var13;
                                          stackOut_108_1 = var21;
                                          stackIn_110_0 = stackOut_108_0;
                                          stackIn_110_1 = stackOut_108_1;
                                          stackIn_109_0 = stackOut_108_0;
                                          stackIn_109_1 = stackOut_108_1;
                                          if (~var8 > ~var5) {
                                            stackOut_110_0 = (int[]) (Object) stackIn_110_0;
                                            stackOut_110_1 = stackIn_110_1;
                                            stackOut_110_2 = var5 + -var8;
                                            stackIn_111_0 = stackOut_110_0;
                                            stackIn_111_1 = stackOut_110_1;
                                            stackIn_111_2 = stackOut_110_2;
                                            break L27;
                                          } else {
                                            stackOut_109_0 = (int[]) (Object) stackIn_109_0;
                                            stackOut_109_1 = stackIn_109_1;
                                            stackOut_109_2 = var8 - var5;
                                            stackIn_111_0 = stackOut_109_0;
                                            stackIn_111_1 = stackOut_109_1;
                                            stackIn_111_2 = stackOut_109_2;
                                            break L27;
                                          }
                                        }
                                        L28: {
                                          stackIn_111_0[stackIn_111_1] = stackIn_111_2;
                                          stackOut_111_0 = (int[]) var14;
                                          stackOut_111_1 = var21;
                                          stackIn_113_0 = stackOut_111_0;
                                          stackIn_113_1 = stackOut_111_1;
                                          stackIn_112_0 = stackOut_111_0;
                                          stackIn_112_1 = stackOut_111_1;
                                          if (~var6 < ~var9) {
                                            stackOut_113_0 = (int[]) (Object) stackIn_113_0;
                                            stackOut_113_1 = stackIn_113_1;
                                            stackOut_113_2 = -var9 + var6;
                                            stackIn_114_0 = stackOut_113_0;
                                            stackIn_114_1 = stackOut_113_1;
                                            stackIn_114_2 = stackOut_113_2;
                                            break L28;
                                          } else {
                                            stackOut_112_0 = (int[]) (Object) stackIn_112_0;
                                            stackOut_112_1 = stackIn_112_1;
                                            stackOut_112_2 = -var6 + var9;
                                            stackIn_114_0 = stackOut_112_0;
                                            stackIn_114_1 = stackOut_112_1;
                                            stackIn_114_2 = stackOut_112_2;
                                            break L28;
                                          }
                                        }
                                        stackIn_114_0[stackIn_114_1] = stackIn_114_2;
                                        var21++;
                                        continue L25;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var12 = var51[0];
                      var13 = var51[1];
                      var14 = var51[2];
                      var54 = var53[0];
                      var55 = var52[0];
                      var56 = var52[1];
                      var57 = var53[1];
                      var58 = var52[2];
                      var59 = var53[2];
                      var21 = 0;
                      L29: while (true) {
                        if (hh.field_d <= var21) {
                          break L0;
                        } else {
                          L30: {
                            var7 = var54[var21];
                            var9 = var59[var21];
                            var8 = var57[var21];
                            stackOut_30_0 = (int[]) var12;
                            stackOut_30_1 = var21;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_32_1 = stackOut_30_1;
                            stackIn_31_0 = stackOut_30_0;
                            stackIn_31_1 = stackOut_30_1;
                            if (var7 == 0) {
                              stackOut_32_0 = (int[]) (Object) stackIn_32_0;
                              stackOut_32_1 = stackIn_32_1;
                              stackOut_32_2 = 4096;
                              stackIn_33_0 = stackOut_32_0;
                              stackIn_33_1 = stackOut_32_1;
                              stackIn_33_2 = stackOut_32_2;
                              break L30;
                            } else {
                              stackOut_31_0 = (int[]) (Object) stackIn_31_0;
                              stackOut_31_1 = stackIn_31_1;
                              stackOut_31_2 = (var55[var21] << 12) / var7;
                              stackIn_33_0 = stackOut_31_0;
                              stackIn_33_1 = stackOut_31_1;
                              stackIn_33_2 = stackOut_31_2;
                              break L30;
                            }
                          }
                          L31: {
                            stackIn_33_0[stackIn_33_1] = stackIn_33_2;
                            stackOut_33_0 = (int[]) var13;
                            stackOut_33_1 = var21;
                            stackIn_35_0 = stackOut_33_0;
                            stackIn_35_1 = stackOut_33_1;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            if (0 != var8) {
                              stackOut_35_0 = (int[]) (Object) stackIn_35_0;
                              stackOut_35_1 = stackIn_35_1;
                              stackOut_35_2 = (var56[var21] << 12) / var8;
                              stackIn_36_0 = stackOut_35_0;
                              stackIn_36_1 = stackOut_35_1;
                              stackIn_36_2 = stackOut_35_2;
                              break L31;
                            } else {
                              stackOut_34_0 = (int[]) (Object) stackIn_34_0;
                              stackOut_34_1 = stackIn_34_1;
                              stackOut_34_2 = 4096;
                              stackIn_36_0 = stackOut_34_0;
                              stackIn_36_1 = stackOut_34_1;
                              stackIn_36_2 = stackOut_34_2;
                              break L31;
                            }
                          }
                          L32: {
                            stackIn_36_0[stackIn_36_1] = stackIn_36_2;
                            stackOut_36_0 = (int[]) var14;
                            stackOut_36_1 = var21;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            if (var9 != 0) {
                              stackOut_38_0 = (int[]) (Object) stackIn_38_0;
                              stackOut_38_1 = stackIn_38_1;
                              stackOut_38_2 = (var58[var21] << 12) / var9;
                              stackIn_39_0 = stackOut_38_0;
                              stackIn_39_1 = stackOut_38_1;
                              stackIn_39_2 = stackOut_38_2;
                              break L32;
                            } else {
                              stackOut_37_0 = (int[]) (Object) stackIn_37_0;
                              stackOut_37_1 = stackIn_37_1;
                              stackOut_37_2 = 4096;
                              stackIn_39_0 = stackOut_37_0;
                              stackIn_39_1 = stackOut_37_1;
                              stackIn_39_2 = stackOut_37_2;
                              break L32;
                            }
                          }
                          stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                          var21++;
                          continue L29;
                        }
                      }
                    }
                  } else {
                    var12 = var51[0];
                    var13 = var51[1];
                    var14 = var51[2];
                    var54 = var53[0];
                    var55 = var52[0];
                    var56 = var52[1];
                    var57 = var53[1];
                    var58 = var52[2];
                    var59 = var53[2];
                    var21 = 0;
                    L33: while (true) {
                      if (~hh.field_d >= ~var21) {
                        break L0;
                      } else {
                        var12[var21] = var55[var21] * var54[var21] >> 12;
                        var13[var21] = var56[var21] * var57[var21] >> 12;
                        var14[var21] = var58[var21] * var59[var21] >> 12;
                        var21++;
                        continue L33;
                      }
                    }
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int[] var11 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int[] stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int[] stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int[] stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int[] stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int[] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int[] stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int[] stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int[] stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        int[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int[] stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int[] stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int[] stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            var10 = null;
            ((ska) this).a((byte) -21, (lu) null, -72);
            break L0;
          }
        }
        L1: {
          var11 = ((ska) this).field_j.a(param0, ~param1);
          var3 = var11;
          if (!((ska) this).field_j.field_m) {
            break L1;
          } else {
            var19 = ((ska) this).a(0, param0, (byte) 110);
            var18 = ((ska) this).a(1, param0, (byte) 126);
            var8 = ((ska) this).field_l;
            if (var8 != 1) {
              if (var8 != 2) {
                if (3 == var8) {
                  var8 = 0;
                  L2: while (true) {
                    if (hh.field_d <= var8) {
                      break L1;
                    } else {
                      var3[var8] = var18[var8] * var19[var8] >> 12;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  if (var8 != 4) {
                    if (var8 != 5) {
                      if (var8 != 6) {
                        if (var8 != 7) {
                          if (var8 != 8) {
                            if (var8 == 9) {
                              var8 = 0;
                              L3: while (true) {
                                if (~var8 <= ~hh.field_d) {
                                  break L1;
                                } else {
                                  L4: {
                                    var5 = var18[var8];
                                    var4 = var19[var8];
                                    stackOut_62_0 = (int[]) var3;
                                    stackOut_62_1 = var8;
                                    stackIn_64_0 = stackOut_62_0;
                                    stackIn_64_1 = stackOut_62_1;
                                    stackIn_63_0 = stackOut_62_0;
                                    stackIn_63_1 = stackOut_62_1;
                                    if (~var5 >= ~var4) {
                                      stackOut_64_0 = (int[]) (Object) stackIn_64_0;
                                      stackOut_64_1 = stackIn_64_1;
                                      stackOut_64_2 = var5;
                                      stackIn_65_0 = stackOut_64_0;
                                      stackIn_65_1 = stackOut_64_1;
                                      stackIn_65_2 = stackOut_64_2;
                                      break L4;
                                    } else {
                                      stackOut_63_0 = (int[]) (Object) stackIn_63_0;
                                      stackOut_63_1 = stackIn_63_1;
                                      stackOut_63_2 = var4;
                                      stackIn_65_0 = stackOut_63_0;
                                      stackIn_65_1 = stackOut_63_1;
                                      stackIn_65_2 = stackOut_63_2;
                                      break L4;
                                    }
                                  }
                                  stackIn_65_0[stackIn_65_1] = stackIn_65_2;
                                  var8++;
                                  continue L3;
                                }
                              }
                            } else {
                              if (10 == var8) {
                                var8 = 0;
                                L5: while (true) {
                                  if (~hh.field_d >= ~var8) {
                                    break L1;
                                  } else {
                                    L6: {
                                      var5 = var18[var8];
                                      var4 = var19[var8];
                                      stackOut_68_0 = (int[]) var3;
                                      stackOut_68_1 = var8;
                                      stackIn_70_0 = stackOut_68_0;
                                      stackIn_70_1 = stackOut_68_1;
                                      stackIn_69_0 = stackOut_68_0;
                                      stackIn_69_1 = stackOut_68_1;
                                      if (var4 > var5) {
                                        stackOut_70_0 = (int[]) (Object) stackIn_70_0;
                                        stackOut_70_1 = stackIn_70_1;
                                        stackOut_70_2 = var4;
                                        stackIn_71_0 = stackOut_70_0;
                                        stackIn_71_1 = stackOut_70_1;
                                        stackIn_71_2 = stackOut_70_2;
                                        break L6;
                                      } else {
                                        stackOut_69_0 = (int[]) (Object) stackIn_69_0;
                                        stackOut_69_1 = stackIn_69_1;
                                        stackOut_69_2 = var5;
                                        stackIn_71_0 = stackOut_69_0;
                                        stackIn_71_1 = stackOut_69_1;
                                        stackIn_71_2 = stackOut_69_2;
                                        break L6;
                                      }
                                    }
                                    stackIn_71_0[stackIn_71_1] = stackIn_71_2;
                                    var8++;
                                    continue L5;
                                  }
                                }
                              } else {
                                if (var8 != 11) {
                                  if (var8 == 12) {
                                    var8 = 0;
                                    L7: while (true) {
                                      if (var8 >= hh.field_d) {
                                        break L1;
                                      } else {
                                        var5 = var18[var8];
                                        var4 = var19[var8];
                                        var3[var8] = -(var4 * var5 >> 11) + var5 + var4;
                                        var8++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  var8 = 0;
                                  L8: while (true) {
                                    if (var8 >= hh.field_d) {
                                      break L1;
                                    } else {
                                      L9: {
                                        var4 = var19[var8];
                                        var5 = var18[var8];
                                        stackOut_74_0 = (int[]) var3;
                                        stackOut_74_1 = var8;
                                        stackIn_76_0 = stackOut_74_0;
                                        stackIn_76_1 = stackOut_74_1;
                                        stackIn_75_0 = stackOut_74_0;
                                        stackIn_75_1 = stackOut_74_1;
                                        if (~var5 > ~var4) {
                                          stackOut_76_0 = (int[]) (Object) stackIn_76_0;
                                          stackOut_76_1 = stackIn_76_1;
                                          stackOut_76_2 = var4 - var5;
                                          stackIn_77_0 = stackOut_76_0;
                                          stackIn_77_1 = stackOut_76_1;
                                          stackIn_77_2 = stackOut_76_2;
                                          break L9;
                                        } else {
                                          stackOut_75_0 = (int[]) (Object) stackIn_75_0;
                                          stackOut_75_1 = stackIn_75_1;
                                          stackOut_75_2 = -var4 + var5;
                                          stackIn_77_0 = stackOut_75_0;
                                          stackIn_77_1 = stackOut_75_1;
                                          stackIn_77_2 = stackOut_75_2;
                                          break L9;
                                        }
                                      }
                                      stackIn_77_0[stackIn_77_1] = stackIn_77_2;
                                      var8++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var8 = 0;
                            L10: while (true) {
                              if (~var8 <= ~hh.field_d) {
                                break L1;
                              } else {
                                L11: {
                                  var4 = var19[var8];
                                  stackOut_56_0 = (int[]) var3;
                                  stackOut_56_1 = var8;
                                  stackIn_58_0 = stackOut_56_0;
                                  stackIn_58_1 = stackOut_56_1;
                                  stackIn_57_0 = stackOut_56_0;
                                  stackIn_57_1 = stackOut_56_1;
                                  if (var4 == 0) {
                                    stackOut_58_0 = (int[]) (Object) stackIn_58_0;
                                    stackOut_58_1 = stackIn_58_1;
                                    stackOut_58_2 = 0;
                                    stackIn_59_0 = stackOut_58_0;
                                    stackIn_59_1 = stackOut_58_1;
                                    stackIn_59_2 = stackOut_58_2;
                                    break L11;
                                  } else {
                                    stackOut_57_0 = (int[]) (Object) stackIn_57_0;
                                    stackOut_57_1 = stackIn_57_1;
                                    stackOut_57_2 = 4096 - (4096 + -var18[var8] << 12) / var4;
                                    stackIn_59_0 = stackOut_57_0;
                                    stackIn_59_1 = stackOut_57_1;
                                    stackIn_59_2 = stackOut_57_2;
                                    break L11;
                                  }
                                }
                                stackIn_59_0[stackIn_59_1] = stackIn_59_2;
                                var8++;
                                continue L10;
                              }
                            }
                          }
                        } else {
                          var8 = 0;
                          L12: while (true) {
                            if (var8 >= hh.field_d) {
                              break L1;
                            } else {
                              L13: {
                                var4 = var19[var8];
                                stackOut_50_0 = (int[]) var3;
                                stackOut_50_1 = var8;
                                stackIn_52_0 = stackOut_50_0;
                                stackIn_52_1 = stackOut_50_1;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                if (var4 == 4096) {
                                  stackOut_52_0 = (int[]) (Object) stackIn_52_0;
                                  stackOut_52_1 = stackIn_52_1;
                                  stackOut_52_2 = 4096;
                                  stackIn_53_0 = stackOut_52_0;
                                  stackIn_53_1 = stackOut_52_1;
                                  stackIn_53_2 = stackOut_52_2;
                                  break L13;
                                } else {
                                  stackOut_51_0 = (int[]) (Object) stackIn_51_0;
                                  stackOut_51_1 = stackIn_51_1;
                                  stackOut_51_2 = (var18[var8] << 12) / (-var4 + 4096);
                                  stackIn_53_0 = stackOut_51_0;
                                  stackIn_53_1 = stackOut_51_1;
                                  stackIn_53_2 = stackOut_51_2;
                                  break L13;
                                }
                              }
                              stackIn_53_0[stackIn_53_1] = stackIn_53_2;
                              var8++;
                              continue L12;
                            }
                          }
                        }
                      } else {
                        var8 = 0;
                        L14: while (true) {
                          if (~hh.field_d >= ~var8) {
                            break L1;
                          } else {
                            L15: {
                              var5 = var18[var8];
                              stackOut_44_0 = (int[]) var3;
                              stackOut_44_1 = var8;
                              stackIn_46_0 = stackOut_44_0;
                              stackIn_46_1 = stackOut_44_1;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              if (var5 < 2048) {
                                stackOut_46_0 = (int[]) (Object) stackIn_46_0;
                                stackOut_46_1 = stackIn_46_1;
                                stackOut_46_2 = var19[var8] * var5 >> 11;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                stackIn_47_2 = stackOut_46_2;
                                break L15;
                              } else {
                                stackOut_45_0 = (int[]) (Object) stackIn_45_0;
                                stackOut_45_1 = stackIn_45_1;
                                stackOut_45_2 = 4096 - ((4096 - var19[var8]) * (4096 + -var5) >> 11);
                                stackIn_47_0 = stackOut_45_0;
                                stackIn_47_1 = stackOut_45_1;
                                stackIn_47_2 = stackOut_45_2;
                                break L15;
                              }
                            }
                            stackIn_47_0[stackIn_47_1] = stackIn_47_2;
                            var8++;
                            continue L14;
                          }
                        }
                      }
                    } else {
                      var8 = 0;
                      L16: while (true) {
                        if (~hh.field_d >= ~var8) {
                          break L1;
                        } else {
                          var3[var8] = -((4096 + -var18[var8]) * (-var19[var8] + 4096) >> 12) + 4096;
                          var8++;
                          continue L16;
                        }
                      }
                    }
                  } else {
                    var8 = 0;
                    L17: while (true) {
                      if (~hh.field_d >= ~var8) {
                        break L1;
                      } else {
                        L18: {
                          var5 = var18[var8];
                          stackOut_35_0 = (int[]) var3;
                          stackOut_35_1 = var8;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          if (var5 != 0) {
                            stackOut_37_0 = (int[]) (Object) stackIn_37_0;
                            stackOut_37_1 = stackIn_37_1;
                            stackOut_37_2 = (var19[var8] << 12) / var5;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            stackIn_38_2 = stackOut_37_2;
                            break L18;
                          } else {
                            stackOut_36_0 = (int[]) (Object) stackIn_36_0;
                            stackOut_36_1 = stackIn_36_1;
                            stackOut_36_2 = 4096;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            stackIn_38_2 = stackOut_36_2;
                            break L18;
                          }
                        }
                        stackIn_38_0[stackIn_38_1] = stackIn_38_2;
                        var8++;
                        continue L17;
                      }
                    }
                  }
                }
              } else {
                var8 = 0;
                L19: while (true) {
                  if (~var8 <= ~hh.field_d) {
                    break L1;
                  } else {
                    var3[var8] = var19[var8] - var18[var8];
                    var8++;
                    continue L19;
                  }
                }
              }
            } else {
              var11 = var3;
              var8 = 0;
              L20: while (true) {
                if (~var8 <= ~hh.field_d) {
                  break L1;
                } else {
                  var11[var8] = var18[var8] + var19[var8];
                  var8++;
                  continue L20;
                }
              }
            }
          }
        }
        return var3;
    }

    public ska() {
        super(2, false);
        ((ska) this).field_l = 6;
    }

    static {
    }
}
