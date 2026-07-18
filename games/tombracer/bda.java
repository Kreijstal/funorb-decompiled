/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bda extends ci {
    static int field_m;

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int[] var8 = ((bda) this).field_i.a((byte) 66, param1);
        int[] var3 = var8;
        if (!(!((bda) this).field_i.field_d)) {
            var4 = sj.field_b[param1];
            for (var5 = 0; var5 < ns.field_g; var5++) {
                var8[var5] = this.d(param0 + 1876, ht.field_Fb[var5], var4) % 4096;
            }
        }
        if (param0 != 1) {
            Object var7 = null;
            nv discarded$0 = bda.a(true, (byte) 12, (la) null, (kh) null);
        }
        return var3;
    }

    final static nv a(boolean param0, byte param1, la param2, kh param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        eq var6 = null;
        int var7 = 0;
        fra stackIn_51_0 = null;
        hi stackIn_53_0 = null;
        rea stackIn_55_0 = null;
        ana stackIn_57_0 = null;
        ov stackIn_59_0 = null;
        eia stackIn_61_0 = null;
        rl stackIn_63_0 = null;
        ef stackIn_65_0 = null;
        ok stackIn_67_0 = null;
        rb stackIn_69_0 = null;
        mo stackIn_71_0 = null;
        lpa stackIn_73_0 = null;
        sg stackIn_76_0 = null;
        eq stackIn_78_0 = null;
        dja stackIn_80_0 = null;
        vd stackIn_82_0 = null;
        eq stackIn_84_0 = null;
        wn stackIn_86_0 = null;
        sea stackIn_88_0 = null;
        wma stackIn_90_0 = null;
        rh stackIn_92_0 = null;
        ska stackIn_94_0 = null;
        tl stackIn_96_0 = null;
        kj stackIn_98_0 = null;
        oh stackIn_100_0 = null;
        cu stackIn_102_0 = null;
        ue stackIn_104_0 = null;
        th stackIn_106_0 = null;
        bn stackIn_108_0 = null;
        im stackIn_110_0 = null;
        mc stackIn_112_0 = null;
        wh stackIn_114_0 = null;
        ula stackIn_116_0 = null;
        sm stackIn_118_0 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        RuntimeException decompiledCaughtException = null;
        fra stackOut_50_0 = null;
        hi stackOut_52_0 = null;
        rea stackOut_54_0 = null;
        rl stackOut_62_0 = null;
        ef stackOut_64_0 = null;
        lpa stackOut_72_0 = null;
        dja stackOut_79_0 = null;
        vd stackOut_81_0 = null;
        eq stackOut_83_0 = null;
        wn stackOut_85_0 = null;
        wma stackOut_89_0 = null;
        ska stackOut_93_0 = null;
        kj stackOut_97_0 = null;
        oh stackOut_99_0 = null;
        bn stackOut_107_0 = null;
        im stackOut_109_0 = null;
        wh stackOut_113_0 = null;
        sm stackOut_117_0 = null;
        ula stackOut_115_0 = null;
        mc stackOut_111_0 = null;
        th stackOut_105_0 = null;
        ue stackOut_103_0 = null;
        cu stackOut_101_0 = null;
        tl stackOut_95_0 = null;
        rh stackOut_91_0 = null;
        sea stackOut_87_0 = null;
        eq stackOut_77_0 = null;
        sg stackOut_75_0 = null;
        mo stackOut_70_0 = null;
        rb stackOut_68_0 = null;
        ok stackOut_66_0 = null;
        eia stackOut_60_0 = null;
        ov stackOut_58_0 = null;
        ana stackOut_56_0 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param3.b((byte) 44, 6);
          var5 = 81 / ((-38 - param1) / 57);
          var6_int = var4_int;
          if (var6_int == 0) {
            stackOut_50_0 = new fra(param2, param3, param0);
            stackIn_51_0 = stackOut_50_0;
            return (nv) (Object) stackIn_51_0;
          } else {
            if (var6_int == 1) {
              stackOut_52_0 = new hi(param2, param3, param0);
              stackIn_53_0 = stackOut_52_0;
              return (nv) (Object) stackIn_53_0;
            } else {
              if (var6_int == 2) {
                stackOut_54_0 = new rea(param2, param3, param0);
                stackIn_55_0 = stackOut_54_0;
                return (nv) (Object) stackIn_55_0;
              } else {
                if (var6_int != 3) {
                  if (var6_int != 4) {
                    if (var6_int != 18) {
                      if (var6_int == 7) {
                        stackOut_62_0 = new rl(param2, param3, param0);
                        stackIn_63_0 = stackOut_62_0;
                        return (nv) (Object) stackIn_63_0;
                      } else {
                        if (var6_int == 5) {
                          stackOut_64_0 = new ef(param2, param3, param0);
                          stackIn_65_0 = stackOut_64_0;
                          return (nv) (Object) stackIn_65_0;
                        } else {
                          if (var6_int != 6) {
                            if (var6_int != 13) {
                              if (var6_int != 8) {
                                if (var6_int == 9) {
                                  stackOut_72_0 = new lpa(param2, param3, param0);
                                  stackIn_73_0 = stackOut_72_0;
                                  return (nv) (Object) stackIn_73_0;
                                } else {
                                  if (var6_int != 10) {
                                    if (var6_int == 17) {
                                      stackOut_79_0 = new dja(param2, param3, param0);
                                      stackIn_80_0 = stackOut_79_0;
                                      return (nv) (Object) stackIn_80_0;
                                    } else {
                                      if (11 == var6_int) {
                                        stackOut_81_0 = new vd(param2, param3, param0);
                                        stackIn_82_0 = stackOut_81_0;
                                        return (nv) (Object) stackIn_82_0;
                                      } else {
                                        if (var6_int == 12) {
                                          stackOut_83_0 = new eq(param2, param3, param0);
                                          stackIn_84_0 = stackOut_83_0;
                                          return (nv) (Object) stackIn_84_0;
                                        } else {
                                          if (var6_int == 14) {
                                            stackOut_85_0 = new wn(param2, param3, param0);
                                            stackIn_86_0 = stackOut_85_0;
                                            return (nv) (Object) stackIn_86_0;
                                          } else {
                                            if (var6_int != 15) {
                                              if (var6_int == 16) {
                                                stackOut_89_0 = new wma(param2, param3, param0);
                                                stackIn_90_0 = stackOut_89_0;
                                                return (nv) (Object) stackIn_90_0;
                                              } else {
                                                if (var6_int != 19) {
                                                  if (var6_int == 20) {
                                                    stackOut_93_0 = new ska(param2, param3, param0);
                                                    stackIn_94_0 = stackOut_93_0;
                                                    return (nv) (Object) stackIn_94_0;
                                                  } else {
                                                    if (21 != var6_int) {
                                                      if (var6_int == 22) {
                                                        stackOut_97_0 = new kj(param2, param3, param0);
                                                        stackIn_98_0 = stackOut_97_0;
                                                        return (nv) (Object) stackIn_98_0;
                                                      } else {
                                                        if (23 == var6_int) {
                                                          stackOut_99_0 = new oh(param2, param3, param0);
                                                          stackIn_100_0 = stackOut_99_0;
                                                          return (nv) (Object) stackIn_100_0;
                                                        } else {
                                                          if (var6_int != 24) {
                                                            if (var6_int != 25) {
                                                              if (var6_int != 26) {
                                                                if (27 == var6_int) {
                                                                  stackOut_107_0 = new bn(param2, param3, param0);
                                                                  stackIn_108_0 = stackOut_107_0;
                                                                  return (nv) (Object) stackIn_108_0;
                                                                } else {
                                                                  if (var6_int == 28) {
                                                                    stackOut_109_0 = new im(param2, param3, param0);
                                                                    stackIn_110_0 = stackOut_109_0;
                                                                    return (nv) (Object) stackIn_110_0;
                                                                  } else {
                                                                    if (var6_int != 29) {
                                                                      if (var6_int == 30) {
                                                                        stackOut_113_0 = new wh(param2, param3, param0);
                                                                        stackIn_114_0 = stackOut_113_0;
                                                                        return (nv) (Object) stackIn_114_0;
                                                                      } else {
                                                                        if (var6_int != 31) {
                                                                          if (32 == var6_int) {
                                                                            stackOut_117_0 = new sm(param2, param3, param0);
                                                                            stackIn_118_0 = stackOut_117_0;
                                                                            return (nv) (Object) stackIn_118_0;
                                                                          } else {
                                                                            throw new IllegalStateException("Unrecognised behaviour type: " + var4_int);
                                                                          }
                                                                        } else {
                                                                          stackOut_115_0 = new ula(param2, param3, param0);
                                                                          stackIn_116_0 = stackOut_115_0;
                                                                          return (nv) (Object) stackIn_116_0;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      stackOut_111_0 = new mc(param2, param3, param0);
                                                                      stackIn_112_0 = stackOut_111_0;
                                                                      return (nv) (Object) stackIn_112_0;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                stackOut_105_0 = new th(param2, param3, param0);
                                                                stackIn_106_0 = stackOut_105_0;
                                                                return (nv) (Object) stackIn_106_0;
                                                              }
                                                            } else {
                                                              stackOut_103_0 = new ue(param2, param3, param0);
                                                              stackIn_104_0 = stackOut_103_0;
                                                              return (nv) (Object) stackIn_104_0;
                                                            }
                                                          } else {
                                                            stackOut_101_0 = new cu(param2, param3, param0);
                                                            stackIn_102_0 = stackOut_101_0;
                                                            return (nv) (Object) stackIn_102_0;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      stackOut_95_0 = new tl(param2, param3, param0);
                                                      stackIn_96_0 = stackOut_95_0;
                                                      return (nv) (Object) stackIn_96_0;
                                                    }
                                                  }
                                                } else {
                                                  stackOut_91_0 = new rh(param2, param3, param0);
                                                  stackIn_92_0 = stackOut_91_0;
                                                  return (nv) (Object) stackIn_92_0;
                                                }
                                              }
                                            } else {
                                              stackOut_87_0 = new sea(param2, param3, param0);
                                              stackIn_88_0 = stackOut_87_0;
                                              return (nv) (Object) stackIn_88_0;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (7 > param2.field_E) {
                                      var6 = new eq(param2, param0);
                                      stackOut_77_0 = (eq) var6;
                                      stackIn_78_0 = stackOut_77_0;
                                      return (nv) (Object) stackIn_78_0;
                                    } else {
                                      stackOut_75_0 = new sg(param2, param3, param0);
                                      stackIn_76_0 = stackOut_75_0;
                                      return (nv) (Object) stackIn_76_0;
                                    }
                                  }
                                }
                              } else {
                                stackOut_70_0 = new mo(param2, param3, param0);
                                stackIn_71_0 = stackOut_70_0;
                                return (nv) (Object) stackIn_71_0;
                              }
                            } else {
                              stackOut_68_0 = new rb(param2, param3, param0);
                              stackIn_69_0 = stackOut_68_0;
                              return (nv) (Object) stackIn_69_0;
                            }
                          } else {
                            stackOut_66_0 = new ok(param2, param3, param0);
                            stackIn_67_0 = stackOut_66_0;
                            return (nv) (Object) stackIn_67_0;
                          }
                        }
                      }
                    } else {
                      stackOut_60_0 = new eia(param2, param3, param0);
                      stackIn_61_0 = stackOut_60_0;
                      return (nv) (Object) stackIn_61_0;
                    }
                  } else {
                    stackOut_58_0 = new ov(param2, param3, param0);
                    stackIn_59_0 = stackOut_58_0;
                    return (nv) (Object) stackIn_59_0;
                  }
                } else {
                  stackOut_56_0 = new ana(param2, param3, param0);
                  stackIn_57_0 = stackOut_56_0;
                  return (nv) (Object) stackIn_57_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_120_0 = (RuntimeException) var4;
            stackOut_120_1 = new StringBuilder().append("bda.B(").append(param0).append(',').append(param1).append(',');
            stackIn_122_0 = stackOut_120_0;
            stackIn_122_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param2 == null) {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L0;
            } else {
              stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
              stackOut_121_1 = (StringBuilder) (Object) stackIn_121_1;
              stackOut_121_2 = "{...}";
              stackIn_123_0 = stackOut_121_0;
              stackIn_123_1 = stackOut_121_1;
              stackIn_123_2 = stackOut_121_2;
              break L0;
            }
          }
          L1: {
            stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
            stackOut_123_1 = ((StringBuilder) (Object) stackIn_123_1).append(stackIn_123_2).append(',');
            stackIn_125_0 = stackOut_123_0;
            stackIn_125_1 = stackOut_123_1;
            stackIn_124_0 = stackOut_123_0;
            stackIn_124_1 = stackOut_123_1;
            if (param3 == null) {
              stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
              stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
              stackOut_125_2 = "null";
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              stackIn_126_2 = stackOut_125_2;
              break L1;
            } else {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "{...}";
              stackIn_126_0 = stackOut_124_0;
              stackIn_126_1 = stackOut_124_1;
              stackIn_126_2 = stackOut_124_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_126_0, stackIn_126_2 + ')');
        }
    }

    public bda() {
        super(0, true);
    }

    private final int d(int param0, int param1, int param2) {
        if (param0 != 1877) {
            field_m = -3;
        }
        int var4 = param1 + param2 * 57;
        var4 = var4 << 1 ^ var4;
        return 4096 - (2147483647 & 1376312589 + (var4 * (var4 * 15731) + 789221) * var4) / 262144;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 50;
    }
}
