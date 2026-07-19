/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bn extends IOException {
    static String field_a;
    static ve field_b;
    static r field_c;

    final static boolean a(int param0, int[] param1) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        long var2_long = 0L;
        tc var4_ref_tc = null;
        int var4 = 0;
        int var5_int = 0;
        tc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_35_0 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_41_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_26_0 = 0;
        boolean stackOut_29_0 = false;
        int stackOut_34_0 = 0;
        boolean stackOut_37_0 = false;
        int stackOut_40_0 = 0;
        int stackOut_56_0 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            if (li.field_a != qi.field_p) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_long = k.a(0);
                if (param0 == -19161) {
                  break L1;
                } else {
                  discarded$1 = bn.a(-56, 104);
                  break L1;
                }
              }
              L2: {
                if (i.field_f == 0) {
                  break L2;
                } else {
                  if (-1 < (ti.field_e ^ -1)) {
                    var4_ref_tc = (tc) ((Object) v.field_z.c(false));
                    if (null == var4_ref_tc) {
                      break L2;
                    } else {
                      if (var4_ref_tc.field_r >= var2_long) {
                        break L2;
                      } else {
                        var4_ref_tc.b(false);
                        rl.field_d = var4_ref_tc.field_o.length;
                        kb.field_q.field_t = 0;
                        var5_int = 0;
                        L3: while (true) {
                          L4: {
                            L5: {
                              if (rl.field_d <= var5_int) {
                                break L5;
                              } else {
                                kb.field_q.field_u[var5_int] = var4_ref_tc.field_o[var5_int];
                                var5_int++;
                                if (var7 != 0) {
                                  break L4;
                                } else {
                                  if (var7 == 0) {
                                    continue L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            mh.field_g = lk.field_sb;
                            lk.field_sb = md.field_A;
                            md.field_A = ua.field_c;
                            ua.field_c = var4_ref_tc.field_u;
                            break L4;
                          }
                          stackOut_26_0 = 1;
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if ((ti.field_e ^ -1) <= -1) {
                      break L8;
                    } else {
                      kb.field_q.field_t = 0;
                      stackOut_29_0 = en.b(97, 1);
                      stackIn_38_0 = stackOut_29_0;
                      stackIn_30_0 = stackOut_29_0;
                      if (var7 != 0) {
                        break L7;
                      } else {
                        if (!stackIn_30_0) {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          ti.field_e = kb.field_q.d(false);
                          kb.field_q.field_t = 0;
                          rl.field_d = param1[ti.field_e];
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_37_0 = ua.b(-73);
                  stackIn_38_0 = stackOut_37_0;
                  break L7;
                }
                if (!stackIn_38_0) {
                  stackOut_40_0 = 0;
                  stackIn_41_0 = stackOut_40_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L9: {
                    if (i.field_f == 0) {
                      break L9;
                    } else {
                      L10: {
                        var4 = i.field_f;
                        if (0.0 == jg.field_f) {
                          break L10;
                        } else {
                          var4 = (int)((double)var4 + ca.field_i.nextGaussian() * jg.field_f);
                          if (var4 < 0) {
                            var4 = 0;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var5 = new tc(var2_long + (long)var4, ti.field_e, new byte[rl.field_d]);
                      var6 = 0;
                      L11: while (true) {
                        L12: {
                          L13: {
                            if ((var6 ^ -1) <= (rl.field_d ^ -1)) {
                              break L13;
                            } else {
                              var5.field_o[var6] = kb.field_q.field_u[var6];
                              var6++;
                              if (var7 != 0) {
                                break L12;
                              } else {
                                if (var7 == 0) {
                                  continue L11;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          v.field_z.a(var5, false);
                          ti.field_e = -1;
                          break L12;
                        }
                        if (var7 == 0) {
                          continue L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  mh.field_g = lk.field_sb;
                  lk.field_sb = md.field_A;
                  md.field_A = ua.field_c;
                  ua.field_c = ti.field_e;
                  ti.field_e = -1;
                  stackOut_56_0 = 1;
                  stackIn_57_0 = stackOut_56_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) (var2);
            stackOut_58_1 = new StringBuilder().append("bn.B(").append(param0).append(',');
            stackIn_61_0 = stackOut_58_0;
            stackIn_61_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L14;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L14;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_27_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_35_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_41_0 != 0;
              } else {
                return stackIn_57_0 != 0;
              }
            }
          }
        }
    }

    bn(String param0) {
        super(param0);
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 21747) {
                break L1;
              } else {
                bn.a(-95, 3, (int[]) null, -127, 20, (int[]) null, (kc) null, 45, (int[]) null, -111, -45, (int[]) null, (int[]) null, 93, -71, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 104, (byte[]) null, (int[]) null);
                break L1;
              }
            }
            stackOut_3_0 = mb.field_u.a(param0 + -21738);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "bn.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            if (param1 >= 0) {
              if (1582 <= param1) {
                if ((param1 % 4 ^ -1) == -1) {
                  if ((param1 % 100 ^ -1) == -1) {
                    if ((param1 % 400 ^ -1) == -1) {
                      L1: {
                        if (param0 == 1) {
                          break L1;
                        } else {
                          field_b = (ve) null;
                          break L1;
                        }
                      }
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L2: {
                  if (param1 % 4 != 0) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L2;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_15_0 = stackOut_12_0;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L3: {
                if (((param1 + 1) % 4 ^ -1) != -1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "bn.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0 != 0;
                } else {
                  return stackIn_29_0 != 0;
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -26623) {
                break L1;
              } else {
                field_c = (r) null;
                break L1;
              }
            }
            field_a = null;
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "bn.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int[] param5, kc param6, int param7, int[] param8, int param9, int param10, int[] param11, int[] param12, int param13, int param14, int[] param15, int[] param16, int[] param17, int[] param18, int[] param19, int[] param20, int param21, byte[] param22, int[] param23) {
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int incrementValue$54 = 0;
        int incrementValue$55 = 0;
        int incrementValue$56 = 0;
        int incrementValue$57 = 0;
        int incrementValue$58 = 0;
        int incrementValue$59 = 0;
        int incrementValue$60 = 0;
        int fieldTemp$61 = 0;
        int fieldTemp$62 = 0;
        int fieldTemp$63 = 0;
        int fieldTemp$64 = 0;
        int fieldTemp$65 = 0;
        int fieldTemp$66 = 0;
        int fieldTemp$67 = 0;
        int fieldTemp$68 = 0;
        byte[] fieldTemp$69 = null;
        int fieldTemp$70 = 0;
        int fieldTemp$71 = 0;
        int fieldTemp$72 = 0;
        int fieldTemp$73 = 0;
        int fieldTemp$74 = 0;
        int fieldTemp$75 = 0;
        byte[] fieldTemp$76 = null;
        byte[] fieldTemp$77 = null;
        short[] fieldTemp$78 = null;
        byte[] fieldTemp$79 = null;
        byte[] fieldTemp$80 = null;
        byte[] fieldTemp$81 = null;
        short[] fieldTemp$82 = null;
        short[] fieldTemp$83 = null;
        int fieldTemp$84 = 0;
        int fieldTemp$85 = 0;
        int fieldTemp$86 = 0;
        int fieldTemp$87 = 0;
        int fieldTemp$88 = 0;
        int fieldTemp$89 = 0;
        RuntimeException var24 = null;
        int var24_int = 0;
        int[] var24_array = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
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
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int[] var54 = null;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_249_1 = 0;
        RuntimeException stackIn_338_0 = null;
        StringBuilder stackIn_338_1 = null;
        RuntimeException stackIn_340_0 = null;
        StringBuilder stackIn_340_1 = null;
        RuntimeException stackIn_341_0 = null;
        StringBuilder stackIn_341_1 = null;
        String stackIn_341_2 = null;
        RuntimeException stackIn_342_0 = null;
        StringBuilder stackIn_342_1 = null;
        RuntimeException stackIn_344_0 = null;
        StringBuilder stackIn_344_1 = null;
        RuntimeException stackIn_345_0 = null;
        StringBuilder stackIn_345_1 = null;
        String stackIn_345_2 = null;
        RuntimeException stackIn_346_0 = null;
        StringBuilder stackIn_346_1 = null;
        RuntimeException stackIn_348_0 = null;
        StringBuilder stackIn_348_1 = null;
        RuntimeException stackIn_349_0 = null;
        StringBuilder stackIn_349_1 = null;
        String stackIn_349_2 = null;
        RuntimeException stackIn_350_0 = null;
        StringBuilder stackIn_350_1 = null;
        RuntimeException stackIn_352_0 = null;
        StringBuilder stackIn_352_1 = null;
        RuntimeException stackIn_353_0 = null;
        StringBuilder stackIn_353_1 = null;
        String stackIn_353_2 = null;
        RuntimeException stackIn_354_0 = null;
        StringBuilder stackIn_354_1 = null;
        RuntimeException stackIn_356_0 = null;
        StringBuilder stackIn_356_1 = null;
        RuntimeException stackIn_357_0 = null;
        StringBuilder stackIn_357_1 = null;
        String stackIn_357_2 = null;
        RuntimeException stackIn_358_0 = null;
        StringBuilder stackIn_358_1 = null;
        RuntimeException stackIn_360_0 = null;
        StringBuilder stackIn_360_1 = null;
        RuntimeException stackIn_361_0 = null;
        StringBuilder stackIn_361_1 = null;
        String stackIn_361_2 = null;
        RuntimeException stackIn_362_0 = null;
        StringBuilder stackIn_362_1 = null;
        RuntimeException stackIn_364_0 = null;
        StringBuilder stackIn_364_1 = null;
        RuntimeException stackIn_365_0 = null;
        StringBuilder stackIn_365_1 = null;
        String stackIn_365_2 = null;
        RuntimeException stackIn_366_0 = null;
        StringBuilder stackIn_366_1 = null;
        RuntimeException stackIn_368_0 = null;
        StringBuilder stackIn_368_1 = null;
        RuntimeException stackIn_369_0 = null;
        StringBuilder stackIn_369_1 = null;
        String stackIn_369_2 = null;
        RuntimeException stackIn_370_0 = null;
        StringBuilder stackIn_370_1 = null;
        RuntimeException stackIn_372_0 = null;
        StringBuilder stackIn_372_1 = null;
        RuntimeException stackIn_373_0 = null;
        StringBuilder stackIn_373_1 = null;
        String stackIn_373_2 = null;
        RuntimeException stackIn_374_0 = null;
        StringBuilder stackIn_374_1 = null;
        RuntimeException stackIn_376_0 = null;
        StringBuilder stackIn_376_1 = null;
        RuntimeException stackIn_377_0 = null;
        StringBuilder stackIn_377_1 = null;
        String stackIn_377_2 = null;
        RuntimeException stackIn_378_0 = null;
        StringBuilder stackIn_378_1 = null;
        RuntimeException stackIn_380_0 = null;
        StringBuilder stackIn_380_1 = null;
        RuntimeException stackIn_381_0 = null;
        StringBuilder stackIn_381_1 = null;
        String stackIn_381_2 = null;
        RuntimeException stackIn_382_0 = null;
        StringBuilder stackIn_382_1 = null;
        RuntimeException stackIn_384_0 = null;
        StringBuilder stackIn_384_1 = null;
        RuntimeException stackIn_385_0 = null;
        StringBuilder stackIn_385_1 = null;
        String stackIn_385_2 = null;
        RuntimeException stackIn_386_0 = null;
        StringBuilder stackIn_386_1 = null;
        RuntimeException stackIn_388_0 = null;
        StringBuilder stackIn_388_1 = null;
        RuntimeException stackIn_389_0 = null;
        StringBuilder stackIn_389_1 = null;
        String stackIn_389_2 = null;
        RuntimeException stackIn_390_0 = null;
        StringBuilder stackIn_390_1 = null;
        RuntimeException stackIn_392_0 = null;
        StringBuilder stackIn_392_1 = null;
        RuntimeException stackIn_393_0 = null;
        StringBuilder stackIn_393_1 = null;
        String stackIn_393_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_248_1 = 0;
        RuntimeException stackOut_337_0 = null;
        StringBuilder stackOut_337_1 = null;
        RuntimeException stackOut_340_0 = null;
        StringBuilder stackOut_340_1 = null;
        String stackOut_340_2 = null;
        RuntimeException stackOut_338_0 = null;
        StringBuilder stackOut_338_1 = null;
        String stackOut_338_2 = null;
        RuntimeException stackOut_341_0 = null;
        StringBuilder stackOut_341_1 = null;
        RuntimeException stackOut_344_0 = null;
        StringBuilder stackOut_344_1 = null;
        String stackOut_344_2 = null;
        RuntimeException stackOut_342_0 = null;
        StringBuilder stackOut_342_1 = null;
        String stackOut_342_2 = null;
        RuntimeException stackOut_345_0 = null;
        StringBuilder stackOut_345_1 = null;
        RuntimeException stackOut_348_0 = null;
        StringBuilder stackOut_348_1 = null;
        String stackOut_348_2 = null;
        RuntimeException stackOut_346_0 = null;
        StringBuilder stackOut_346_1 = null;
        String stackOut_346_2 = null;
        RuntimeException stackOut_349_0 = null;
        StringBuilder stackOut_349_1 = null;
        RuntimeException stackOut_352_0 = null;
        StringBuilder stackOut_352_1 = null;
        String stackOut_352_2 = null;
        RuntimeException stackOut_350_0 = null;
        StringBuilder stackOut_350_1 = null;
        String stackOut_350_2 = null;
        RuntimeException stackOut_353_0 = null;
        StringBuilder stackOut_353_1 = null;
        RuntimeException stackOut_356_0 = null;
        StringBuilder stackOut_356_1 = null;
        String stackOut_356_2 = null;
        RuntimeException stackOut_354_0 = null;
        StringBuilder stackOut_354_1 = null;
        String stackOut_354_2 = null;
        RuntimeException stackOut_357_0 = null;
        StringBuilder stackOut_357_1 = null;
        RuntimeException stackOut_360_0 = null;
        StringBuilder stackOut_360_1 = null;
        String stackOut_360_2 = null;
        RuntimeException stackOut_358_0 = null;
        StringBuilder stackOut_358_1 = null;
        String stackOut_358_2 = null;
        RuntimeException stackOut_361_0 = null;
        StringBuilder stackOut_361_1 = null;
        RuntimeException stackOut_364_0 = null;
        StringBuilder stackOut_364_1 = null;
        String stackOut_364_2 = null;
        RuntimeException stackOut_362_0 = null;
        StringBuilder stackOut_362_1 = null;
        String stackOut_362_2 = null;
        RuntimeException stackOut_365_0 = null;
        StringBuilder stackOut_365_1 = null;
        RuntimeException stackOut_368_0 = null;
        StringBuilder stackOut_368_1 = null;
        String stackOut_368_2 = null;
        RuntimeException stackOut_366_0 = null;
        StringBuilder stackOut_366_1 = null;
        String stackOut_366_2 = null;
        RuntimeException stackOut_369_0 = null;
        StringBuilder stackOut_369_1 = null;
        RuntimeException stackOut_372_0 = null;
        StringBuilder stackOut_372_1 = null;
        String stackOut_372_2 = null;
        RuntimeException stackOut_370_0 = null;
        StringBuilder stackOut_370_1 = null;
        String stackOut_370_2 = null;
        RuntimeException stackOut_373_0 = null;
        StringBuilder stackOut_373_1 = null;
        RuntimeException stackOut_376_0 = null;
        StringBuilder stackOut_376_1 = null;
        String stackOut_376_2 = null;
        RuntimeException stackOut_374_0 = null;
        StringBuilder stackOut_374_1 = null;
        String stackOut_374_2 = null;
        RuntimeException stackOut_377_0 = null;
        StringBuilder stackOut_377_1 = null;
        RuntimeException stackOut_380_0 = null;
        StringBuilder stackOut_380_1 = null;
        String stackOut_380_2 = null;
        RuntimeException stackOut_378_0 = null;
        StringBuilder stackOut_378_1 = null;
        String stackOut_378_2 = null;
        RuntimeException stackOut_381_0 = null;
        StringBuilder stackOut_381_1 = null;
        RuntimeException stackOut_384_0 = null;
        StringBuilder stackOut_384_1 = null;
        String stackOut_384_2 = null;
        RuntimeException stackOut_382_0 = null;
        StringBuilder stackOut_382_1 = null;
        String stackOut_382_2 = null;
        RuntimeException stackOut_385_0 = null;
        StringBuilder stackOut_385_1 = null;
        RuntimeException stackOut_388_0 = null;
        StringBuilder stackOut_388_1 = null;
        String stackOut_388_2 = null;
        RuntimeException stackOut_386_0 = null;
        StringBuilder stackOut_386_1 = null;
        String stackOut_386_2 = null;
        RuntimeException stackOut_389_0 = null;
        StringBuilder stackOut_389_1 = null;
        RuntimeException stackOut_392_0 = null;
        StringBuilder stackOut_392_1 = null;
        String stackOut_392_2 = null;
        RuntimeException stackOut_390_0 = null;
        StringBuilder stackOut_390_1 = null;
        String stackOut_390_2 = null;
        var65 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (a.field_b == null) {
                  break L2;
                } else {
                  if ((param21 ^ -1) < (a.field_b.length ^ -1)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var24_int = 100 + param21;
              uj.field_q = new int[var24_int];
              a.field_b = new int[var24_int];
              break L1;
            }
            L3: {
              L4: {
                if (rl.field_c == null) {
                  break L4;
                } else {
                  if ((rl.field_c.length ^ -1) <= (param7 * 2 ^ -1)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var24_int = 2 * param7 + 100;
              rl.field_c = new int[var24_int];
              gm.field_b = new int[var24_int];
              break L3;
            }
            L5: {
              var24_array = a.field_b;
              if (lm.field_f != null) {
                break L5;
              } else {
                lm.field_f = new int[16];
                break L5;
              }
            }
            L6: {
              L7: {
                var25 = uj.field_q;
                var26 = lm.field_f;
                var27 = rl.field_c;
                mf.field_u = 0;
                var28 = gm.field_b;
                k.field_e = 0;
                fh.field_g = 0;
                le.field_Xb = 0;
                if (null == ic.field_c) {
                  break L7;
                } else {
                  if ((ic.field_c.length ^ -1) > (param21 ^ -1)) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              ic.field_c = new int[param21 - -100];
              bd.field_a = new int[100 + param21];
              nn.field_S = new int[100 + param21];
              break L6;
            }
            L8: {
              L9: {
                if (null == ja.field_l) {
                  break L9;
                } else {
                  if (ja.field_l.length >= param7) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              ja.field_l = new int[100 + param7];
              db.field_f = new int[param7 + 100];
              wk.field_b = new int[param7 + 100];
              break L8;
            }
            L10: {
              if (null == param18) {
                break L10;
              } else {
                L11: {
                  if (mc.field_m == null) {
                    break L11;
                  } else {
                    if (mc.field_m.length >= param7) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                rk.field_b = new int[100 + param7];
                mc.field_m = new int[param7 + 100];
                tc.field_w = new int[100 + param7];
                break L10;
              }
            }
            L12: {
              L13: {
                if (null == am.field_b) {
                  break L13;
                } else {
                  if ((param21 ^ -1) >= (am.field_b.length ^ -1)) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              cm.field_q = new int[100 + param21];
              am.field_b = new int[100 + param21];
              gd.field_Zb = new int[param21 - -100];
              break L12;
            }
            L14: {
              L15: {
                if (null == ve.field_a) {
                  break L15;
                } else {
                  if (ve.field_a.length < param7) {
                    break L15;
                  } else {
                    break L14;
                  }
                }
              }
              kj.field_d = new int[100 + param7];
              ve.field_a = new int[100 + param7];
              hd.field_D = new int[100 + param7];
              break L14;
            }
            L16: {
              if (null == param18) {
                break L16;
              } else {
                L17: {
                  if (ga.field_b == null) {
                    break L17;
                  } else {
                    if (param7 > ga.field_b.length) {
                      break L17;
                    } else {
                      break L16;
                    }
                  }
                }
                ga.field_b = new int[param7 - -100];
                fj.field_p = new int[param7 - -100];
                om.field_Yb = new int[param7 + 100];
                break L16;
              }
            }
            var29 = 0;
            var30 = 0;
            var31 = 0;
            var33 = 0;
            L18: while (true) {
              L19: {
                if ((param21 ^ -1) >= (var33 ^ -1)) {
                  break L19;
                } else {
                  var24_array[var33] = -1;
                  var33++;
                  if (var65 == 0) {
                    continue L18;
                  } else {
                    break L19;
                  }
                }
              }
              var32 = 0;
              if (param13 > 18) {
                var33 = 0;
                L20: while (true) {
                  L21: {
                    if (param21 <= var33) {
                      break L21;
                    } else {
                      var25[var33] = -1;
                      var33++;
                      if (var65 == 0) {
                        continue L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var35 = 0;
                  var36 = 0;
                  var37 = 0;
                  var38 = 0;
                  L22: while (true) {
                    L23: {
                      L24: {
                        if ((var38 ^ -1) <= (param7 ^ -1)) {
                          break L24;
                        } else {
                          var39 = param2[var38];
                          var40 = param23[var38];
                          var41 = param20[var38];
                          var42 = param12[var39];
                          var43 = param5[var39];
                          var44 = param11[var39];
                          var45 = param12[var40];
                          var46 = param5[var40];
                          var47 = param11[var40];
                          var48 = param12[var41];
                          var49 = param5[var41];
                          var50 = param11[var41];
                          var51 = param3 * (-param14 + var44) + param4 * (-param1 + var42) - -((-param0 + var43) * param9);
                          var52 = param9 * (var46 + -param0) + ((-param1 + var45) * param4 + param3 * (var47 + -param14));
                          var53 = param4 * (-param1 + var48) - -(param9 * (var49 + -param0)) + param3 * (-param14 + var50);
                          stackOut_71_0 = (var53 | (var52 | var51)) ^ -1;
                          stackOut_71_1 = -1;
                          stackIn_249_0 = stackOut_71_0;
                          stackIn_249_1 = stackOut_71_1;
                          stackIn_72_0 = stackOut_71_0;
                          stackIn_72_1 = stackOut_71_1;
                          if (var65 != 0) {
                            break L23;
                          } else {
                            L25: {
                              L26: {
                                if (stackIn_72_0 <= stackIn_72_1) {
                                  break L26;
                                } else {
                                  L27: {
                                    if (((-var53 | (-var52 | -var51)) ^ -1) <= -1) {
                                      break L27;
                                    } else {
                                      L28: {
                                        if ((ic.field_c.length ^ -1) <= (4 + (param21 - -var29) ^ -1)) {
                                          break L28;
                                        } else {
                                          var54 = new int[param21 + var29 + 104];
                                          rd.a(ic.field_c, 0, var54, 0, k.field_e);
                                          ic.field_c = var54;
                                          var54 = new int[var29 + (param21 + 104)];
                                          rd.a(nn.field_S, 0, var54, 0, k.field_e);
                                          nn.field_S = var54;
                                          var54 = new int[104 + param21 - -var29];
                                          rd.a(bd.field_a, 0, var54, 0, k.field_e);
                                          bd.field_a = var54;
                                          break L28;
                                        }
                                      }
                                      L29: {
                                        if ((am.field_b.length ^ -1) <= (var31 + (param21 + 4) ^ -1)) {
                                          break L29;
                                        } else {
                                          var54 = new int[104 + param21 - -var31];
                                          rd.a(am.field_b, 0, var54, 0, mf.field_u);
                                          am.field_b = var54;
                                          var54 = new int[104 + param21 + var31];
                                          rd.a(gd.field_Zb, 0, var54, 0, mf.field_u);
                                          gd.field_Zb = var54;
                                          var54 = new int[104 + (var31 + param21)];
                                          rd.a(cm.field_q, 0, var54, 0, mf.field_u);
                                          cm.field_q = var54;
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        L31: {
                                          var55 = k.field_e;
                                          var56 = mf.field_u;
                                          var57 = 0;
                                          var58 = 0;
                                          if (param22 != null) {
                                            break L31;
                                          } else {
                                            L32: {
                                              if (null != param17) {
                                                break L32;
                                              } else {
                                                var64 = 1;
                                                if (var65 == 0) {
                                                  break L30;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                            L33: {
                                              L34: {
                                                if ((param17[var38] ^ -1) == 0) {
                                                  break L34;
                                                } else {
                                                  if (1 == (param17[var38] ^ -1)) {
                                                    break L34;
                                                  } else {
                                                    stackOut_95_0 = 1;
                                                    stackIn_98_0 = stackOut_95_0;
                                                    break L33;
                                                  }
                                                }
                                              }
                                              stackOut_97_0 = 0;
                                              stackIn_98_0 = stackOut_97_0;
                                              break L33;
                                            }
                                            var64 = stackIn_98_0;
                                            if (var65 == 0) {
                                              break L30;
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                        L35: {
                                          if (-1 != (1 & param22[var38] ^ -1)) {
                                            stackOut_104_0 = 0;
                                            stackIn_105_0 = stackOut_104_0;
                                            break L35;
                                          } else {
                                            stackOut_102_0 = 1;
                                            stackIn_105_0 = stackOut_102_0;
                                            break L35;
                                          }
                                        }
                                        var64 = stackIn_105_0;
                                        break L30;
                                      }
                                      L36: {
                                        if (param18 == null) {
                                          break L36;
                                        } else {
                                          L37: {
                                            if (var64 == 0) {
                                              break L37;
                                            } else {
                                              var36 = 65535 & param8[var38];
                                              var37 = 65535 & param17[var38];
                                              var35 = param18[var38] & 65535;
                                              if (var65 == 0) {
                                                break L36;
                                              } else {
                                                break L37;
                                              }
                                            }
                                          }
                                          var37 = param17[var38];
                                          var36 = param8[var38];
                                          var35 = param18[var38];
                                          break L36;
                                        }
                                      }
                                      L38: {
                                        if (0 <= var51) {
                                          L39: {
                                            var34 = var24_array[var39];
                                            if ((var34 ^ -1) <= -1) {
                                              break L39;
                                            } else {
                                              incrementValue$45 = var55;
                                              var55++;
                                              var34 = incrementValue$45;
                                              var24_array[var39] = incrementValue$45;
                                              ic.field_c[var34] = var42;
                                              nn.field_S[var34] = var43;
                                              bd.field_a[var34] = var44;
                                              break L39;
                                            }
                                          }
                                          var26[var57 + 0] = var34;
                                          var26[8 - -var57] = var35;
                                          var57++;
                                          break L38;
                                        } else {
                                          break L38;
                                        }
                                      }
                                      L40: {
                                        if (0 < var51) {
                                          break L40;
                                        } else {
                                          L41: {
                                            var34 = var25[var39];
                                            if ((var34 ^ -1) > -1) {
                                              incrementValue$46 = var56;
                                              var56++;
                                              var34 = incrementValue$46;
                                              var25[var39] = incrementValue$46;
                                              am.field_b[var34] = var42;
                                              gd.field_Zb[var34] = var43;
                                              cm.field_q[var34] = var44;
                                              break L41;
                                            } else {
                                              break L41;
                                            }
                                          }
                                          var26[4 - -var58] = var34;
                                          var26[var58 + 12] = var35;
                                          var58++;
                                          break L40;
                                        }
                                      }
                                      L42: {
                                        if (var51 == 0) {
                                          break L42;
                                        } else {
                                          if ((var52 ^ -1) == -1) {
                                            break L42;
                                          } else {
                                            if ((var52 ^ var51 ^ -1) <= -1) {
                                              break L42;
                                            } else {
                                              var63 = -var51 + var52;
                                              var61 = (var44 * var52 + -(var51 * var47)) / var63;
                                              incrementValue$47 = var55;
                                              var55++;
                                              var34 = incrementValue$47;
                                              var60 = (var52 * var43 + -(var51 * var46)) / var63;
                                              var59 = (-(var51 * var45) + var42 * var52) / var63;
                                              var62 = (var52 * var35 - var51 * var36) / var63;
                                              ic.field_c[var34] = var59;
                                              nn.field_S[var34] = var60;
                                              bd.field_a[var34] = var61;
                                              var26[0 + var57] = var34;
                                              var26[var57 + 8] = var62;
                                              var57++;
                                              incrementValue$48 = var56;
                                              var56++;
                                              var34 = incrementValue$48;
                                              am.field_b[var34] = var59;
                                              gd.field_Zb[var34] = var60;
                                              cm.field_q[var34] = var61;
                                              var26[var58 + 4] = var34;
                                              var26[12 + var58] = var62;
                                              var58++;
                                              break L42;
                                            }
                                          }
                                        }
                                      }
                                      L43: {
                                        if (var52 < 0) {
                                          break L43;
                                        } else {
                                          L44: {
                                            var34 = var24_array[var40];
                                            if (-1 >= (var34 ^ -1)) {
                                              break L44;
                                            } else {
                                              incrementValue$49 = var55;
                                              var55++;
                                              var34 = incrementValue$49;
                                              var24_array[var40] = incrementValue$49;
                                              ic.field_c[var34] = var45;
                                              nn.field_S[var34] = var46;
                                              bd.field_a[var34] = var47;
                                              break L44;
                                            }
                                          }
                                          var26[0 + var57] = var34;
                                          var26[8 - -var57] = var36;
                                          var57++;
                                          break L43;
                                        }
                                      }
                                      L45: {
                                        if (var52 > 0) {
                                          break L45;
                                        } else {
                                          L46: {
                                            var34 = var25[var40];
                                            if ((var34 ^ -1) <= -1) {
                                              break L46;
                                            } else {
                                              incrementValue$50 = var56;
                                              var56++;
                                              var34 = incrementValue$50;
                                              var25[var40] = incrementValue$50;
                                              am.field_b[var34] = var45;
                                              gd.field_Zb[var34] = var46;
                                              cm.field_q[var34] = var47;
                                              break L46;
                                            }
                                          }
                                          var26[var58 + 4] = var34;
                                          var26[12 + var58] = var36;
                                          var58++;
                                          break L45;
                                        }
                                      }
                                      L47: {
                                        if (0 == var52) {
                                          break L47;
                                        } else {
                                          if (0 == var53) {
                                            break L47;
                                          } else {
                                            if ((var52 ^ var53 ^ -1) <= -1) {
                                              break L47;
                                            } else {
                                              var63 = -var52 + var53;
                                              var59 = (var45 * var53 - var48 * var52) / var63;
                                              var62 = (-(var52 * var37) + var53 * var36) / var63;
                                              var60 = (var46 * var53 + -(var52 * var49)) / var63;
                                              var61 = (-(var50 * var52) + var47 * var53) / var63;
                                              incrementValue$51 = var55;
                                              var55++;
                                              var34 = incrementValue$51;
                                              ic.field_c[var34] = var59;
                                              nn.field_S[var34] = var60;
                                              bd.field_a[var34] = var61;
                                              var26[0 + var57] = var34;
                                              var26[var57 + 8] = var62;
                                              var57++;
                                              incrementValue$52 = var56;
                                              var56++;
                                              var34 = incrementValue$52;
                                              am.field_b[var34] = var59;
                                              gd.field_Zb[var34] = var60;
                                              cm.field_q[var34] = var61;
                                              var26[4 + var58] = var34;
                                              var26[12 - -var58] = var62;
                                              var58++;
                                              break L47;
                                            }
                                          }
                                        }
                                      }
                                      L48: {
                                        if (var53 < 0) {
                                          break L48;
                                        } else {
                                          L49: {
                                            var34 = var24_array[var41];
                                            if ((var34 ^ -1) > -1) {
                                              incrementValue$53 = var55;
                                              var55++;
                                              var34 = incrementValue$53;
                                              var24_array[var41] = incrementValue$53;
                                              ic.field_c[var34] = var48;
                                              nn.field_S[var34] = var49;
                                              bd.field_a[var34] = var50;
                                              break L49;
                                            } else {
                                              break L49;
                                            }
                                          }
                                          var26[0 + var57] = var34;
                                          var26[8 + var57] = var37;
                                          var57++;
                                          break L48;
                                        }
                                      }
                                      L50: {
                                        if (-1 > (var53 ^ -1)) {
                                          break L50;
                                        } else {
                                          L51: {
                                            var34 = var25[var41];
                                            if (0 > var34) {
                                              incrementValue$54 = var56;
                                              var56++;
                                              var34 = incrementValue$54;
                                              var25[var41] = incrementValue$54;
                                              am.field_b[var34] = var48;
                                              gd.field_Zb[var34] = var49;
                                              cm.field_q[var34] = var50;
                                              break L51;
                                            } else {
                                              break L51;
                                            }
                                          }
                                          var26[var58 + 4] = var34;
                                          var26[var58 + 12] = var37;
                                          var58++;
                                          break L50;
                                        }
                                      }
                                      L52: {
                                        if (0 == (var51 | var53)) {
                                          break L52;
                                        } else {
                                          if ((var51 ^ var53 ^ -1) > -1) {
                                            var63 = -var53 + var51;
                                            var60 = (-(var53 * var43) + var51 * var49) / var63;
                                            incrementValue$55 = var55;
                                            var55++;
                                            var34 = incrementValue$55;
                                            var61 = (-(var53 * var44) + var50 * var51) / var63;
                                            var62 = (-(var53 * var35) + var51 * var37) / var63;
                                            var59 = (-(var53 * var42) + var51 * var48) / var63;
                                            ic.field_c[var34] = var59;
                                            nn.field_S[var34] = var60;
                                            bd.field_a[var34] = var61;
                                            var26[var57 + 0] = var34;
                                            var26[8 - -var57] = var62;
                                            var57++;
                                            incrementValue$56 = var56;
                                            var56++;
                                            var34 = incrementValue$56;
                                            am.field_b[var34] = var59;
                                            gd.field_Zb[var34] = var60;
                                            cm.field_q[var34] = var61;
                                            var26[var58 + 4] = var34;
                                            var26[12 + var58] = var62;
                                            var58++;
                                            break L52;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                      L53: {
                                        var29 = var29 + (-k.field_e + var55);
                                        var33 = fh.field_g;
                                        k.field_e = var55;
                                        if ((ja.field_l.length ^ -1) <= (-2 + var57 + var30 + param7 ^ -1)) {
                                          break L53;
                                        } else {
                                          var54 = new int[param7 + var30 + (var57 + 98)];
                                          rd.a(ja.field_l, 0, var54, 0, var33);
                                          ja.field_l = var54;
                                          var54 = new int[var57 + (param7 - -var30) + 98];
                                          rd.a(db.field_f, 0, var54, 0, var33);
                                          db.field_f = var54;
                                          var54 = new int[98 + var57 + (var30 + param7)];
                                          rd.a(wk.field_b, 0, var54, 0, var33);
                                          wk.field_b = var54;
                                          if (null != param18) {
                                            var54 = new int[98 + (var30 + (param7 + var57))];
                                            rd.a(mc.field_m, 0, var54, 0, var33);
                                            mc.field_m = var54;
                                            var54 = new int[var30 + (param7 + var57 - -98)];
                                            rd.a(tc.field_w, 0, var54, 0, var33);
                                            tc.field_w = var54;
                                            var54 = new int[98 + var57 + (var30 + param7)];
                                            rd.a(rk.field_b, 0, var54, 0, var33);
                                            rk.field_b = var54;
                                            break L53;
                                          } else {
                                            break L53;
                                          }
                                        }
                                      }
                                      L54: {
                                        ja.field_l[var33] = var26[0];
                                        db.field_f[var33] = var26[1];
                                        wk.field_b[var33] = var26[2];
                                        if (param18 != null) {
                                          L55: {
                                            if (var64 != 0) {
                                              break L55;
                                            } else {
                                              mc.field_m[var33] = var35;
                                              rk.field_b[var33] = var37;
                                              if (var65 == 0) {
                                                break L54;
                                              } else {
                                                break L55;
                                              }
                                            }
                                          }
                                          mc.field_m[var33] = var26[8];
                                          tc.field_w[var33] = var26[9];
                                          rk.field_b[var33] = var26[10];
                                          break L54;
                                        } else {
                                          break L54;
                                        }
                                      }
                                      L56: {
                                        incrementValue$57 = var33;
                                        var33++;
                                        var27[incrementValue$57] = var38;
                                        if (4 != var57) {
                                          break L56;
                                        } else {
                                          L57: {
                                            ja.field_l[var33] = var26[2];
                                            db.field_f[var33] = var26[3];
                                            wk.field_b[var33] = var26[0];
                                            if (param18 != null) {
                                              L58: {
                                                if (var64 == 0) {
                                                  break L58;
                                                } else {
                                                  mc.field_m[var33] = var26[10];
                                                  tc.field_w[var33] = var26[11];
                                                  rk.field_b[var33] = var26[8];
                                                  if (var65 == 0) {
                                                    break L57;
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                              }
                                              mc.field_m[var33] = var35;
                                              rk.field_b[var33] = var37;
                                              break L57;
                                            } else {
                                              break L57;
                                            }
                                          }
                                          var30++;
                                          incrementValue$58 = var33;
                                          var33++;
                                          var27[incrementValue$58] = var38;
                                          break L56;
                                        }
                                      }
                                      L59: {
                                        fh.field_g = var33;
                                        var31 = var31 + (-mf.field_u + var56);
                                        mf.field_u = var56;
                                        var33 = le.field_Xb;
                                        if ((var58 + param7 - (-var32 - -2) ^ -1) < (ve.field_a.length ^ -1)) {
                                          var54 = new int[var58 + (var32 + (param7 + 98))];
                                          rd.a(ve.field_a, 0, var54, 0, var33);
                                          ve.field_a = var54;
                                          var54 = new int[98 + var58 + (param7 + var32)];
                                          rd.a(hd.field_D, 0, var54, 0, var33);
                                          hd.field_D = var54;
                                          var54 = new int[param7 - (-var32 + -var58) - -98];
                                          rd.a(kj.field_d, 0, var54, 0, var33);
                                          kj.field_d = var54;
                                          if (null == param18) {
                                            break L59;
                                          } else {
                                            var54 = new int[param7 + var32 + (var58 + 98)];
                                            rd.a(ga.field_b, 0, var54, 0, var33);
                                            ga.field_b = var54;
                                            var54 = new int[98 + var58 + (param7 + var32)];
                                            rd.a(fj.field_p, 0, var54, 0, var33);
                                            fj.field_p = var54;
                                            var54 = new int[98 + (param7 + var32) - -var58];
                                            rd.a(om.field_Yb, 0, var54, 0, var33);
                                            om.field_Yb = var54;
                                            break L59;
                                          }
                                        } else {
                                          break L59;
                                        }
                                      }
                                      L60: {
                                        ve.field_a[var33] = var26[4];
                                        hd.field_D[var33] = var26[5];
                                        kj.field_d[var33] = var26[6];
                                        if (null == param18) {
                                          break L60;
                                        } else {
                                          L61: {
                                            if (var64 == 0) {
                                              break L61;
                                            } else {
                                              ga.field_b[var33] = var26[12];
                                              fj.field_p[var33] = var26[13];
                                              om.field_Yb[var33] = var26[14];
                                              if (var65 == 0) {
                                                break L60;
                                              } else {
                                                break L61;
                                              }
                                            }
                                          }
                                          ga.field_b[var33] = var35;
                                          om.field_Yb[var33] = var37;
                                          break L60;
                                        }
                                      }
                                      L62: {
                                        incrementValue$59 = var33;
                                        var33++;
                                        var28[incrementValue$59] = var38;
                                        if (var58 == 4) {
                                          L63: {
                                            ve.field_a[var33] = var26[6];
                                            hd.field_D[var33] = var26[7];
                                            kj.field_d[var33] = var26[4];
                                            if (param18 != null) {
                                              L64: {
                                                if (var64 != 0) {
                                                  break L64;
                                                } else {
                                                  ga.field_b[var33] = var35;
                                                  om.field_Yb[var33] = var37;
                                                  if (var65 == 0) {
                                                    break L63;
                                                  } else {
                                                    break L64;
                                                  }
                                                }
                                              }
                                              ga.field_b[var33] = var26[14];
                                              fj.field_p[var33] = var26[15];
                                              om.field_Yb[var33] = var26[12];
                                              break L63;
                                            } else {
                                              break L63;
                                            }
                                          }
                                          incrementValue$60 = var33;
                                          var33++;
                                          var28[incrementValue$60] = var38;
                                          var32++;
                                          break L62;
                                        } else {
                                          break L62;
                                        }
                                      }
                                      le.field_Xb = var33;
                                      if (var65 == 0) {
                                        break L25;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  L65: {
                                    fieldTemp$61 = le.field_Xb;
                                    le.field_Xb = le.field_Xb + 1;
                                    var33 = fieldTemp$61;
                                    var34 = var25[var39];
                                    if (-1 >= (var34 ^ -1)) {
                                      break L65;
                                    } else {
                                      fieldTemp$62 = mf.field_u;
                                      mf.field_u = mf.field_u + 1;
                                      var34 = fieldTemp$62;
                                      var25[var39] = fieldTemp$62;
                                      am.field_b[var34] = var42;
                                      gd.field_Zb[var34] = var43;
                                      cm.field_q[var34] = var44;
                                      break L65;
                                    }
                                  }
                                  L66: {
                                    ve.field_a[var33] = var34;
                                    var34 = var25[var40];
                                    if ((var34 ^ -1) > -1) {
                                      fieldTemp$63 = mf.field_u;
                                      mf.field_u = mf.field_u + 1;
                                      var34 = fieldTemp$63;
                                      var25[var40] = fieldTemp$63;
                                      am.field_b[var34] = var45;
                                      gd.field_Zb[var34] = var46;
                                      cm.field_q[var34] = var47;
                                      break L66;
                                    } else {
                                      break L66;
                                    }
                                  }
                                  L67: {
                                    hd.field_D[var33] = var34;
                                    var34 = var25[var41];
                                    if ((var34 ^ -1) <= -1) {
                                      break L67;
                                    } else {
                                      fieldTemp$64 = mf.field_u;
                                      mf.field_u = mf.field_u + 1;
                                      var34 = fieldTemp$64;
                                      var25[var41] = fieldTemp$64;
                                      am.field_b[var34] = var48;
                                      gd.field_Zb[var34] = var49;
                                      cm.field_q[var34] = var50;
                                      break L67;
                                    }
                                  }
                                  L68: {
                                    kj.field_d[var33] = var34;
                                    if (param18 != null) {
                                      ga.field_b[var33] = param18[var38];
                                      fj.field_p[var33] = param8[var38];
                                      om.field_Yb[var33] = param17[var38];
                                      break L68;
                                    } else {
                                      break L68;
                                    }
                                  }
                                  var28[var33] = var38;
                                  if (var65 == 0) {
                                    break L25;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              L69: {
                                fieldTemp$65 = fh.field_g;
                                fh.field_g = fh.field_g + 1;
                                var33 = fieldTemp$65;
                                var34 = var24_array[var39];
                                if ((var34 ^ -1) <= -1) {
                                  break L69;
                                } else {
                                  fieldTemp$66 = k.field_e;
                                  k.field_e = k.field_e + 1;
                                  var34 = fieldTemp$66;
                                  var24_array[var39] = fieldTemp$66;
                                  ic.field_c[var34] = var42;
                                  nn.field_S[var34] = var43;
                                  bd.field_a[var34] = var44;
                                  break L69;
                                }
                              }
                              L70: {
                                ja.field_l[var33] = var34;
                                var34 = var24_array[var40];
                                if (0 > var34) {
                                  fieldTemp$67 = k.field_e;
                                  k.field_e = k.field_e + 1;
                                  var34 = fieldTemp$67;
                                  var24_array[var40] = fieldTemp$67;
                                  ic.field_c[var34] = var45;
                                  nn.field_S[var34] = var46;
                                  bd.field_a[var34] = var47;
                                  break L70;
                                } else {
                                  break L70;
                                }
                              }
                              L71: {
                                db.field_f[var33] = var34;
                                var34 = var24_array[var41];
                                if (var34 >= 0) {
                                  break L71;
                                } else {
                                  fieldTemp$68 = k.field_e;
                                  k.field_e = k.field_e + 1;
                                  var34 = fieldTemp$68;
                                  var24_array[var41] = fieldTemp$68;
                                  ic.field_c[var34] = var48;
                                  nn.field_S[var34] = var49;
                                  bd.field_a[var34] = var50;
                                  break L71;
                                }
                              }
                              L72: {
                                wk.field_b[var33] = var34;
                                if (null == param18) {
                                  break L72;
                                } else {
                                  mc.field_m[var33] = param18[var38];
                                  tc.field_w[var33] = param8[var38];
                                  rk.field_b[var33] = param17[var38];
                                  break L72;
                                }
                              }
                              var27[var33] = var38;
                              break L25;
                            }
                            var38++;
                            if (var65 == 0) {
                              continue L22;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      bm.field_p = param10;
                      hb.field_d = param10;
                      d.field_b = mf.field_u;
                      ea.field_e = k.field_e;
                      stackOut_248_0 = 0;
                      stackOut_248_1 = param10;
                      stackIn_249_0 = stackOut_248_0;
                      stackIn_249_1 = stackOut_248_1;
                      break L23;
                    }
                    L73: {
                      L74: {
                        if (stackIn_249_0 < stackIn_249_1) {
                          L75: {
                            if (null == param6) {
                              break L75;
                            } else {
                              L76: {
                                L77: {
                                  fieldTemp$69 = param6.field_v;
                                  va.field_q.field_v = param6.field_v;
                                  fl.field_o.field_v = fieldTemp$69;
                                  if (fl.field_o.field_k == null) {
                                    break L77;
                                  } else {
                                    if (fl.field_o.field_k.length < param10) {
                                      break L77;
                                    } else {
                                      break L76;
                                    }
                                  }
                                }
                                fl.field_o.field_Q = new short[param10];
                                fl.field_o.field_k = new short[param10];
                                fl.field_o.field_N = new short[param10];
                                break L76;
                              }
                              L78: {
                                L79: {
                                  if (va.field_q.field_k == null) {
                                    break L79;
                                  } else {
                                    if ((param10 ^ -1) < (va.field_q.field_k.length ^ -1)) {
                                      break L79;
                                    } else {
                                      break L78;
                                    }
                                  }
                                }
                                va.field_q.field_Q = new short[param10];
                                va.field_q.field_N = new short[param10];
                                va.field_q.field_k = new short[param10];
                                break L78;
                              }
                              var38 = 0;
                              L80: while (true) {
                                L81: {
                                  L82: {
                                    if (param10 <= var38) {
                                      break L82;
                                    } else {
                                      if (var65 != 0) {
                                        break L81;
                                      } else {
                                        L83: {
                                          L84: {
                                            if (-1 == (param6.field_v[var38] ^ -1)) {
                                              break L84;
                                            } else {
                                              va.field_q.field_k[var38] = param6.field_k[var38];
                                              fl.field_o.field_k[var38] = param6.field_k[var38];
                                              va.field_q.field_N[var38] = param6.field_N[var38];
                                              fl.field_o.field_N[var38] = param6.field_N[var38];
                                              va.field_q.field_Q[var38] = param6.field_Q[var38];
                                              fl.field_o.field_Q[var38] = param6.field_Q[var38];
                                              if (var65 == 0) {
                                                break L83;
                                              } else {
                                                break L84;
                                              }
                                            }
                                          }
                                          L85: {
                                            var33 = param6.field_k[var38];
                                            var34 = var24_array[var33];
                                            if ((var34 ^ -1) <= -1) {
                                              break L85;
                                            } else {
                                              fieldTemp$70 = k.field_e;
                                              k.field_e = k.field_e + 1;
                                              var34 = fieldTemp$70;
                                              var24_array[var33] = fieldTemp$70;
                                              ic.field_c[var34] = param12[var33];
                                              nn.field_S[var34] = param5[var33];
                                              bd.field_a[var34] = param11[var33];
                                              break L85;
                                            }
                                          }
                                          L86: {
                                            fl.field_o.field_k[var38] = (short)var34;
                                            var34 = var25[var33];
                                            if ((var34 ^ -1) > -1) {
                                              fieldTemp$71 = mf.field_u;
                                              mf.field_u = mf.field_u + 1;
                                              var34 = fieldTemp$71;
                                              var25[var33] = fieldTemp$71;
                                              am.field_b[var34] = param12[var33];
                                              gd.field_Zb[var34] = param5[var33];
                                              cm.field_q[var34] = param11[var33];
                                              break L86;
                                            } else {
                                              break L86;
                                            }
                                          }
                                          L87: {
                                            va.field_q.field_k[var38] = (short)var34;
                                            var33 = param6.field_N[var38];
                                            var34 = var24_array[var33];
                                            if (-1 >= (var34 ^ -1)) {
                                              break L87;
                                            } else {
                                              fieldTemp$72 = k.field_e;
                                              k.field_e = k.field_e + 1;
                                              var34 = fieldTemp$72;
                                              var24_array[var33] = fieldTemp$72;
                                              ic.field_c[var34] = param12[var33];
                                              nn.field_S[var34] = param5[var33];
                                              bd.field_a[var34] = param11[var33];
                                              break L87;
                                            }
                                          }
                                          L88: {
                                            fl.field_o.field_N[var38] = (short)var34;
                                            var34 = var25[var33];
                                            if (-1 < (var34 ^ -1)) {
                                              fieldTemp$73 = mf.field_u;
                                              mf.field_u = mf.field_u + 1;
                                              var34 = fieldTemp$73;
                                              var25[var33] = fieldTemp$73;
                                              am.field_b[var34] = param12[var33];
                                              gd.field_Zb[var34] = param5[var33];
                                              cm.field_q[var34] = param11[var33];
                                              break L88;
                                            } else {
                                              break L88;
                                            }
                                          }
                                          L89: {
                                            va.field_q.field_N[var38] = (short)var34;
                                            var33 = param6.field_Q[var38];
                                            var34 = var24_array[var33];
                                            if (var34 >= 0) {
                                              break L89;
                                            } else {
                                              fieldTemp$74 = k.field_e;
                                              k.field_e = k.field_e + 1;
                                              var34 = fieldTemp$74;
                                              var24_array[var33] = fieldTemp$74;
                                              ic.field_c[var34] = param12[var33];
                                              nn.field_S[var34] = param5[var33];
                                              bd.field_a[var34] = param11[var33];
                                              break L89;
                                            }
                                          }
                                          L90: {
                                            fl.field_o.field_Q[var38] = (short)var34;
                                            var34 = var25[var33];
                                            if (0 <= var34) {
                                              break L90;
                                            } else {
                                              fieldTemp$75 = mf.field_u;
                                              mf.field_u = mf.field_u + 1;
                                              var34 = fieldTemp$75;
                                              var25[var33] = fieldTemp$75;
                                              am.field_b[var34] = param12[var33];
                                              gd.field_Zb[var34] = param5[var33];
                                              cm.field_q[var34] = param11[var33];
                                              break L90;
                                            }
                                          }
                                          va.field_q.field_Q[var38] = (short)var34;
                                          break L83;
                                        }
                                        var38++;
                                        if (var65 == 0) {
                                          continue L80;
                                        } else {
                                          break L82;
                                        }
                                      }
                                    }
                                  }
                                  fieldTemp$76 = param6.field_S;
                                  va.field_q.field_S = param6.field_S;
                                  fl.field_o.field_S = fieldTemp$76;
                                  fieldTemp$77 = param6.field_x;
                                  va.field_q.field_x = param6.field_x;
                                  fl.field_o.field_x = fieldTemp$77;
                                  fieldTemp$78 = param6.field_D;
                                  va.field_q.field_D = param6.field_D;
                                  fl.field_o.field_D = fieldTemp$78;
                                  fieldTemp$79 = param6.field_n;
                                  va.field_q.field_n = param6.field_n;
                                  fl.field_o.field_n = fieldTemp$79;
                                  fieldTemp$80 = param6.field_M;
                                  va.field_q.field_M = param6.field_M;
                                  fl.field_o.field_M = fieldTemp$80;
                                  fieldTemp$81 = param6.field_F;
                                  va.field_q.field_F = param6.field_F;
                                  fl.field_o.field_F = fieldTemp$81;
                                  fieldTemp$82 = param6.field_L;
                                  va.field_q.field_L = param6.field_L;
                                  fl.field_o.field_L = fieldTemp$82;
                                  fieldTemp$83 = param6.field_l;
                                  va.field_q.field_l = param6.field_l;
                                  fl.field_o.field_l = fieldTemp$83;
                                  break L81;
                                }
                                if (var65 == 0) {
                                  break L74;
                                } else {
                                  break L75;
                                }
                              }
                            }
                          }
                          L91: {
                            L92: {
                              if (bg.field_f == null) {
                                break L92;
                              } else {
                                if ((param10 ^ -1) < (bg.field_f.length ^ -1)) {
                                  break L92;
                                } else {
                                  break L91;
                                }
                              }
                            }
                            gb.field_r = new int[param10];
                            bg.field_f = new int[param10];
                            ch.field_s = new int[param10];
                            break L91;
                          }
                          L93: {
                            L94: {
                              if (nh.field_Mb == null) {
                                break L94;
                              } else {
                                if (param10 <= nh.field_Mb.length) {
                                  break L93;
                                } else {
                                  break L94;
                                }
                              }
                            }
                            nh.field_Mb = new int[param10];
                            li.field_m = new int[param10];
                            gk.field_c = new int[param10];
                            break L93;
                          }
                          var38 = 0;
                          L95: while (true) {
                            if ((var38 ^ -1) <= (param10 ^ -1)) {
                              break L74;
                            } else {
                              var33 = param19[var38];
                              var34 = var24_array[var33];
                              if (var65 != 0) {
                                break L73;
                              } else {
                                L96: {
                                  if (0 <= var34) {
                                    break L96;
                                  } else {
                                    fieldTemp$84 = k.field_e;
                                    k.field_e = k.field_e + 1;
                                    var34 = fieldTemp$84;
                                    var24_array[var33] = fieldTemp$84;
                                    ic.field_c[var34] = param12[var33];
                                    nn.field_S[var34] = param5[var33];
                                    bd.field_a[var34] = param11[var33];
                                    break L96;
                                  }
                                }
                                L97: {
                                  bg.field_f[var38] = var34;
                                  var34 = var25[var33];
                                  if ((var34 ^ -1) <= -1) {
                                    break L97;
                                  } else {
                                    fieldTemp$85 = mf.field_u;
                                    mf.field_u = mf.field_u + 1;
                                    var34 = fieldTemp$85;
                                    var25[var33] = fieldTemp$85;
                                    am.field_b[var34] = param12[var33];
                                    gd.field_Zb[var34] = param5[var33];
                                    cm.field_q[var34] = param11[var33];
                                    break L97;
                                  }
                                }
                                L98: {
                                  nh.field_Mb[var38] = var34;
                                  var33 = param16[var38];
                                  var34 = var24_array[var33];
                                  if (var34 < 0) {
                                    fieldTemp$86 = k.field_e;
                                    k.field_e = k.field_e + 1;
                                    var34 = fieldTemp$86;
                                    var24_array[var33] = fieldTemp$86;
                                    ic.field_c[var34] = param12[var33];
                                    nn.field_S[var34] = param5[var33];
                                    bd.field_a[var34] = param11[var33];
                                    break L98;
                                  } else {
                                    break L98;
                                  }
                                }
                                L99: {
                                  gb.field_r[var38] = var34;
                                  var34 = var25[var33];
                                  if (-1 >= (var34 ^ -1)) {
                                    break L99;
                                  } else {
                                    fieldTemp$87 = mf.field_u;
                                    mf.field_u = mf.field_u + 1;
                                    var34 = fieldTemp$87;
                                    var25[var33] = fieldTemp$87;
                                    am.field_b[var34] = param12[var33];
                                    gd.field_Zb[var34] = param5[var33];
                                    cm.field_q[var34] = param11[var33];
                                    break L99;
                                  }
                                }
                                L100: {
                                  li.field_m[var38] = var34;
                                  var33 = param15[var38];
                                  var34 = var24_array[var33];
                                  if (0 > var34) {
                                    fieldTemp$88 = k.field_e;
                                    k.field_e = k.field_e + 1;
                                    var34 = fieldTemp$88;
                                    var24_array[var33] = fieldTemp$88;
                                    ic.field_c[var34] = param12[var33];
                                    nn.field_S[var34] = param5[var33];
                                    bd.field_a[var34] = param11[var33];
                                    break L100;
                                  } else {
                                    break L100;
                                  }
                                }
                                L101: {
                                  ch.field_s[var38] = var34;
                                  var34 = var25[var33];
                                  if ((var34 ^ -1) > -1) {
                                    fieldTemp$89 = mf.field_u;
                                    mf.field_u = mf.field_u + 1;
                                    var34 = fieldTemp$89;
                                    var25[var33] = fieldTemp$89;
                                    am.field_b[var34] = param12[var33];
                                    gd.field_Zb[var34] = param5[var33];
                                    cm.field_q[var34] = param11[var33];
                                    break L101;
                                  } else {
                                    break L101;
                                  }
                                }
                                gk.field_c[var38] = var34;
                                var38++;
                                if (var65 == 0) {
                                  continue L95;
                                } else {
                                  break L74;
                                }
                              }
                            }
                          }
                        } else {
                          break L74;
                        }
                      }
                      break L73;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L102: {
            var24 = decompiledCaughtException;
            stackOut_337_0 = (RuntimeException) (var24);
            stackOut_337_1 = new StringBuilder().append("bn.C(").append(param0).append(',').append(param1).append(',');
            stackIn_340_0 = stackOut_337_0;
            stackIn_340_1 = stackOut_337_1;
            stackIn_338_0 = stackOut_337_0;
            stackIn_338_1 = stackOut_337_1;
            if (param2 == null) {
              stackOut_340_0 = (RuntimeException) ((Object) stackIn_340_0);
              stackOut_340_1 = (StringBuilder) ((Object) stackIn_340_1);
              stackOut_340_2 = "null";
              stackIn_341_0 = stackOut_340_0;
              stackIn_341_1 = stackOut_340_1;
              stackIn_341_2 = stackOut_340_2;
              break L102;
            } else {
              stackOut_338_0 = (RuntimeException) ((Object) stackIn_338_0);
              stackOut_338_1 = (StringBuilder) ((Object) stackIn_338_1);
              stackOut_338_2 = "{...}";
              stackIn_341_0 = stackOut_338_0;
              stackIn_341_1 = stackOut_338_1;
              stackIn_341_2 = stackOut_338_2;
              break L102;
            }
          }
          L103: {
            stackOut_341_0 = (RuntimeException) ((Object) stackIn_341_0);
            stackOut_341_1 = ((StringBuilder) (Object) stackIn_341_1).append(stackIn_341_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_344_0 = stackOut_341_0;
            stackIn_344_1 = stackOut_341_1;
            stackIn_342_0 = stackOut_341_0;
            stackIn_342_1 = stackOut_341_1;
            if (param5 == null) {
              stackOut_344_0 = (RuntimeException) ((Object) stackIn_344_0);
              stackOut_344_1 = (StringBuilder) ((Object) stackIn_344_1);
              stackOut_344_2 = "null";
              stackIn_345_0 = stackOut_344_0;
              stackIn_345_1 = stackOut_344_1;
              stackIn_345_2 = stackOut_344_2;
              break L103;
            } else {
              stackOut_342_0 = (RuntimeException) ((Object) stackIn_342_0);
              stackOut_342_1 = (StringBuilder) ((Object) stackIn_342_1);
              stackOut_342_2 = "{...}";
              stackIn_345_0 = stackOut_342_0;
              stackIn_345_1 = stackOut_342_1;
              stackIn_345_2 = stackOut_342_2;
              break L103;
            }
          }
          L104: {
            stackOut_345_0 = (RuntimeException) ((Object) stackIn_345_0);
            stackOut_345_1 = ((StringBuilder) (Object) stackIn_345_1).append(stackIn_345_2).append(',');
            stackIn_348_0 = stackOut_345_0;
            stackIn_348_1 = stackOut_345_1;
            stackIn_346_0 = stackOut_345_0;
            stackIn_346_1 = stackOut_345_1;
            if (param6 == null) {
              stackOut_348_0 = (RuntimeException) ((Object) stackIn_348_0);
              stackOut_348_1 = (StringBuilder) ((Object) stackIn_348_1);
              stackOut_348_2 = "null";
              stackIn_349_0 = stackOut_348_0;
              stackIn_349_1 = stackOut_348_1;
              stackIn_349_2 = stackOut_348_2;
              break L104;
            } else {
              stackOut_346_0 = (RuntimeException) ((Object) stackIn_346_0);
              stackOut_346_1 = (StringBuilder) ((Object) stackIn_346_1);
              stackOut_346_2 = "{...}";
              stackIn_349_0 = stackOut_346_0;
              stackIn_349_1 = stackOut_346_1;
              stackIn_349_2 = stackOut_346_2;
              break L104;
            }
          }
          L105: {
            stackOut_349_0 = (RuntimeException) ((Object) stackIn_349_0);
            stackOut_349_1 = ((StringBuilder) (Object) stackIn_349_1).append(stackIn_349_2).append(',').append(param7).append(',');
            stackIn_352_0 = stackOut_349_0;
            stackIn_352_1 = stackOut_349_1;
            stackIn_350_0 = stackOut_349_0;
            stackIn_350_1 = stackOut_349_1;
            if (param8 == null) {
              stackOut_352_0 = (RuntimeException) ((Object) stackIn_352_0);
              stackOut_352_1 = (StringBuilder) ((Object) stackIn_352_1);
              stackOut_352_2 = "null";
              stackIn_353_0 = stackOut_352_0;
              stackIn_353_1 = stackOut_352_1;
              stackIn_353_2 = stackOut_352_2;
              break L105;
            } else {
              stackOut_350_0 = (RuntimeException) ((Object) stackIn_350_0);
              stackOut_350_1 = (StringBuilder) ((Object) stackIn_350_1);
              stackOut_350_2 = "{...}";
              stackIn_353_0 = stackOut_350_0;
              stackIn_353_1 = stackOut_350_1;
              stackIn_353_2 = stackOut_350_2;
              break L105;
            }
          }
          L106: {
            stackOut_353_0 = (RuntimeException) ((Object) stackIn_353_0);
            stackOut_353_1 = ((StringBuilder) (Object) stackIn_353_1).append(stackIn_353_2).append(',').append(param9).append(',').append(param10).append(',');
            stackIn_356_0 = stackOut_353_0;
            stackIn_356_1 = stackOut_353_1;
            stackIn_354_0 = stackOut_353_0;
            stackIn_354_1 = stackOut_353_1;
            if (param11 == null) {
              stackOut_356_0 = (RuntimeException) ((Object) stackIn_356_0);
              stackOut_356_1 = (StringBuilder) ((Object) stackIn_356_1);
              stackOut_356_2 = "null";
              stackIn_357_0 = stackOut_356_0;
              stackIn_357_1 = stackOut_356_1;
              stackIn_357_2 = stackOut_356_2;
              break L106;
            } else {
              stackOut_354_0 = (RuntimeException) ((Object) stackIn_354_0);
              stackOut_354_1 = (StringBuilder) ((Object) stackIn_354_1);
              stackOut_354_2 = "{...}";
              stackIn_357_0 = stackOut_354_0;
              stackIn_357_1 = stackOut_354_1;
              stackIn_357_2 = stackOut_354_2;
              break L106;
            }
          }
          L107: {
            stackOut_357_0 = (RuntimeException) ((Object) stackIn_357_0);
            stackOut_357_1 = ((StringBuilder) (Object) stackIn_357_1).append(stackIn_357_2).append(',');
            stackIn_360_0 = stackOut_357_0;
            stackIn_360_1 = stackOut_357_1;
            stackIn_358_0 = stackOut_357_0;
            stackIn_358_1 = stackOut_357_1;
            if (param12 == null) {
              stackOut_360_0 = (RuntimeException) ((Object) stackIn_360_0);
              stackOut_360_1 = (StringBuilder) ((Object) stackIn_360_1);
              stackOut_360_2 = "null";
              stackIn_361_0 = stackOut_360_0;
              stackIn_361_1 = stackOut_360_1;
              stackIn_361_2 = stackOut_360_2;
              break L107;
            } else {
              stackOut_358_0 = (RuntimeException) ((Object) stackIn_358_0);
              stackOut_358_1 = (StringBuilder) ((Object) stackIn_358_1);
              stackOut_358_2 = "{...}";
              stackIn_361_0 = stackOut_358_0;
              stackIn_361_1 = stackOut_358_1;
              stackIn_361_2 = stackOut_358_2;
              break L107;
            }
          }
          L108: {
            stackOut_361_0 = (RuntimeException) ((Object) stackIn_361_0);
            stackOut_361_1 = ((StringBuilder) (Object) stackIn_361_1).append(stackIn_361_2).append(',').append(param13).append(',').append(param14).append(',');
            stackIn_364_0 = stackOut_361_0;
            stackIn_364_1 = stackOut_361_1;
            stackIn_362_0 = stackOut_361_0;
            stackIn_362_1 = stackOut_361_1;
            if (param15 == null) {
              stackOut_364_0 = (RuntimeException) ((Object) stackIn_364_0);
              stackOut_364_1 = (StringBuilder) ((Object) stackIn_364_1);
              stackOut_364_2 = "null";
              stackIn_365_0 = stackOut_364_0;
              stackIn_365_1 = stackOut_364_1;
              stackIn_365_2 = stackOut_364_2;
              break L108;
            } else {
              stackOut_362_0 = (RuntimeException) ((Object) stackIn_362_0);
              stackOut_362_1 = (StringBuilder) ((Object) stackIn_362_1);
              stackOut_362_2 = "{...}";
              stackIn_365_0 = stackOut_362_0;
              stackIn_365_1 = stackOut_362_1;
              stackIn_365_2 = stackOut_362_2;
              break L108;
            }
          }
          L109: {
            stackOut_365_0 = (RuntimeException) ((Object) stackIn_365_0);
            stackOut_365_1 = ((StringBuilder) (Object) stackIn_365_1).append(stackIn_365_2).append(',');
            stackIn_368_0 = stackOut_365_0;
            stackIn_368_1 = stackOut_365_1;
            stackIn_366_0 = stackOut_365_0;
            stackIn_366_1 = stackOut_365_1;
            if (param16 == null) {
              stackOut_368_0 = (RuntimeException) ((Object) stackIn_368_0);
              stackOut_368_1 = (StringBuilder) ((Object) stackIn_368_1);
              stackOut_368_2 = "null";
              stackIn_369_0 = stackOut_368_0;
              stackIn_369_1 = stackOut_368_1;
              stackIn_369_2 = stackOut_368_2;
              break L109;
            } else {
              stackOut_366_0 = (RuntimeException) ((Object) stackIn_366_0);
              stackOut_366_1 = (StringBuilder) ((Object) stackIn_366_1);
              stackOut_366_2 = "{...}";
              stackIn_369_0 = stackOut_366_0;
              stackIn_369_1 = stackOut_366_1;
              stackIn_369_2 = stackOut_366_2;
              break L109;
            }
          }
          L110: {
            stackOut_369_0 = (RuntimeException) ((Object) stackIn_369_0);
            stackOut_369_1 = ((StringBuilder) (Object) stackIn_369_1).append(stackIn_369_2).append(',');
            stackIn_372_0 = stackOut_369_0;
            stackIn_372_1 = stackOut_369_1;
            stackIn_370_0 = stackOut_369_0;
            stackIn_370_1 = stackOut_369_1;
            if (param17 == null) {
              stackOut_372_0 = (RuntimeException) ((Object) stackIn_372_0);
              stackOut_372_1 = (StringBuilder) ((Object) stackIn_372_1);
              stackOut_372_2 = "null";
              stackIn_373_0 = stackOut_372_0;
              stackIn_373_1 = stackOut_372_1;
              stackIn_373_2 = stackOut_372_2;
              break L110;
            } else {
              stackOut_370_0 = (RuntimeException) ((Object) stackIn_370_0);
              stackOut_370_1 = (StringBuilder) ((Object) stackIn_370_1);
              stackOut_370_2 = "{...}";
              stackIn_373_0 = stackOut_370_0;
              stackIn_373_1 = stackOut_370_1;
              stackIn_373_2 = stackOut_370_2;
              break L110;
            }
          }
          L111: {
            stackOut_373_0 = (RuntimeException) ((Object) stackIn_373_0);
            stackOut_373_1 = ((StringBuilder) (Object) stackIn_373_1).append(stackIn_373_2).append(',');
            stackIn_376_0 = stackOut_373_0;
            stackIn_376_1 = stackOut_373_1;
            stackIn_374_0 = stackOut_373_0;
            stackIn_374_1 = stackOut_373_1;
            if (param18 == null) {
              stackOut_376_0 = (RuntimeException) ((Object) stackIn_376_0);
              stackOut_376_1 = (StringBuilder) ((Object) stackIn_376_1);
              stackOut_376_2 = "null";
              stackIn_377_0 = stackOut_376_0;
              stackIn_377_1 = stackOut_376_1;
              stackIn_377_2 = stackOut_376_2;
              break L111;
            } else {
              stackOut_374_0 = (RuntimeException) ((Object) stackIn_374_0);
              stackOut_374_1 = (StringBuilder) ((Object) stackIn_374_1);
              stackOut_374_2 = "{...}";
              stackIn_377_0 = stackOut_374_0;
              stackIn_377_1 = stackOut_374_1;
              stackIn_377_2 = stackOut_374_2;
              break L111;
            }
          }
          L112: {
            stackOut_377_0 = (RuntimeException) ((Object) stackIn_377_0);
            stackOut_377_1 = ((StringBuilder) (Object) stackIn_377_1).append(stackIn_377_2).append(',');
            stackIn_380_0 = stackOut_377_0;
            stackIn_380_1 = stackOut_377_1;
            stackIn_378_0 = stackOut_377_0;
            stackIn_378_1 = stackOut_377_1;
            if (param19 == null) {
              stackOut_380_0 = (RuntimeException) ((Object) stackIn_380_0);
              stackOut_380_1 = (StringBuilder) ((Object) stackIn_380_1);
              stackOut_380_2 = "null";
              stackIn_381_0 = stackOut_380_0;
              stackIn_381_1 = stackOut_380_1;
              stackIn_381_2 = stackOut_380_2;
              break L112;
            } else {
              stackOut_378_0 = (RuntimeException) ((Object) stackIn_378_0);
              stackOut_378_1 = (StringBuilder) ((Object) stackIn_378_1);
              stackOut_378_2 = "{...}";
              stackIn_381_0 = stackOut_378_0;
              stackIn_381_1 = stackOut_378_1;
              stackIn_381_2 = stackOut_378_2;
              break L112;
            }
          }
          L113: {
            stackOut_381_0 = (RuntimeException) ((Object) stackIn_381_0);
            stackOut_381_1 = ((StringBuilder) (Object) stackIn_381_1).append(stackIn_381_2).append(',');
            stackIn_384_0 = stackOut_381_0;
            stackIn_384_1 = stackOut_381_1;
            stackIn_382_0 = stackOut_381_0;
            stackIn_382_1 = stackOut_381_1;
            if (param20 == null) {
              stackOut_384_0 = (RuntimeException) ((Object) stackIn_384_0);
              stackOut_384_1 = (StringBuilder) ((Object) stackIn_384_1);
              stackOut_384_2 = "null";
              stackIn_385_0 = stackOut_384_0;
              stackIn_385_1 = stackOut_384_1;
              stackIn_385_2 = stackOut_384_2;
              break L113;
            } else {
              stackOut_382_0 = (RuntimeException) ((Object) stackIn_382_0);
              stackOut_382_1 = (StringBuilder) ((Object) stackIn_382_1);
              stackOut_382_2 = "{...}";
              stackIn_385_0 = stackOut_382_0;
              stackIn_385_1 = stackOut_382_1;
              stackIn_385_2 = stackOut_382_2;
              break L113;
            }
          }
          L114: {
            stackOut_385_0 = (RuntimeException) ((Object) stackIn_385_0);
            stackOut_385_1 = ((StringBuilder) (Object) stackIn_385_1).append(stackIn_385_2).append(',').append(param21).append(',');
            stackIn_388_0 = stackOut_385_0;
            stackIn_388_1 = stackOut_385_1;
            stackIn_386_0 = stackOut_385_0;
            stackIn_386_1 = stackOut_385_1;
            if (param22 == null) {
              stackOut_388_0 = (RuntimeException) ((Object) stackIn_388_0);
              stackOut_388_1 = (StringBuilder) ((Object) stackIn_388_1);
              stackOut_388_2 = "null";
              stackIn_389_0 = stackOut_388_0;
              stackIn_389_1 = stackOut_388_1;
              stackIn_389_2 = stackOut_388_2;
              break L114;
            } else {
              stackOut_386_0 = (RuntimeException) ((Object) stackIn_386_0);
              stackOut_386_1 = (StringBuilder) ((Object) stackIn_386_1);
              stackOut_386_2 = "{...}";
              stackIn_389_0 = stackOut_386_0;
              stackIn_389_1 = stackOut_386_1;
              stackIn_389_2 = stackOut_386_2;
              break L114;
            }
          }
          L115: {
            stackOut_389_0 = (RuntimeException) ((Object) stackIn_389_0);
            stackOut_389_1 = ((StringBuilder) (Object) stackIn_389_1).append(stackIn_389_2).append(',');
            stackIn_392_0 = stackOut_389_0;
            stackIn_392_1 = stackOut_389_1;
            stackIn_390_0 = stackOut_389_0;
            stackIn_390_1 = stackOut_389_1;
            if (param23 == null) {
              stackOut_392_0 = (RuntimeException) ((Object) stackIn_392_0);
              stackOut_392_1 = (StringBuilder) ((Object) stackIn_392_1);
              stackOut_392_2 = "null";
              stackIn_393_0 = stackOut_392_0;
              stackIn_393_1 = stackOut_392_1;
              stackIn_393_2 = stackOut_392_2;
              break L115;
            } else {
              stackOut_390_0 = (RuntimeException) ((Object) stackIn_390_0);
              stackOut_390_1 = (StringBuilder) ((Object) stackIn_390_1);
              stackOut_390_2 = "{...}";
              stackIn_393_0 = stackOut_390_0;
              stackIn_393_1 = stackOut_390_1;
              stackIn_393_2 = stackOut_390_2;
              break L115;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_393_0), stackIn_393_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
