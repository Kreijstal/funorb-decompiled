/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb implements Runnable {
    static ml field_j;
    static String field_g;
    static String field_e;
    static int[][] field_h;
    static int field_l;
    static String field_d;
    private ra field_i;
    static String field_a;
    private boolean field_b;
    int field_f;
    static int[] field_c;
    private Thread field_k;

    private final void a(byte param0, df param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((cb) this).field_i;
                    // monitorenter ((cb) this).field_i
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((cb) this).field_i.a((byte) 47, (kd) (Object) param1);
                        if (param0 < -52) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_g = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((cb) this).field_f = ((cb) this).field_f + 1;
                        ((Object) (Object) ((cb) this).field_i).notifyAll();
                        // monitorexit var3
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var4;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final df a(int param0, int param1, rc param2) {
        df var4 = null;
        Object var5 = null;
        df var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        df stackIn_8_0 = null;
        df stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = SteelSentinels.field_G;
                    var4 = new df();
                    var4.field_H = 1;
                    var5 = (Object) (Object) ((cb) this).field_i;
                    // monitorenter ((cb) this).field_i
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (df) (Object) ((cb) this).field_i.b(22);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 == null) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((var6.field_w ^ -1L) != ((long)param1 ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6.field_G != param2) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var6.field_H == 2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4.field_z = false;
                        var4.field_L = var6.field_L;
                        // monitorexit var5
                        stackOut_7_0 = (df) var4;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        var6 = (df) (Object) ((cb) this).field_i.a(false);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var5
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var7;
                }
                case 14: {
                    var4.field_L = param2.b(param1, false);
                    if (param0 == 21598) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return null;
                }
                case 16: {
                    var4.field_B = true;
                    var4.field_z = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        ((cb) this).field_b = true;
        Object var2 = (Object) (Object) ((cb) this).field_i;
        // monitorenter ((cb) this).field_i
        ((Object) (Object) ((cb) this).field_i).notifyAll();
        // monitorexit var2
        if (param0 != 0) {
            field_j = null;
        }
        try {
            if (false) throw (InterruptedException) null;
            ((cb) this).field_k.join();
        } catch (InterruptedException interruptedException) {
        }
        ((cb) this).field_k = null;
    }

    final static void a(hk param0, byte param1, int param2, boolean param3) {
        String var8_ref2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        qh[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        qh var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        String var18_ref_String = null;
        Object var19 = null;
        String var19_ref = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        int var22_int = 0;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        int var27 = 0;
        qh var28 = null;
        qh var29 = null;
        qh[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        qh stackIn_33_0 = null;
        qh stackIn_34_0 = null;
        qh stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        qh stackIn_40_0 = null;
        qh stackIn_41_0 = null;
        qh stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_72_0 = 0;
        qh stackIn_87_0 = null;
        qh stackIn_88_0 = null;
        qh stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        qh stackIn_94_0 = null;
        boolean stackIn_94_1 = false;
        qh stackIn_95_0 = null;
        boolean stackIn_95_1 = false;
        qh stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        int stackIn_96_2 = 0;
        qh stackIn_98_0 = null;
        qh stackIn_99_0 = null;
        qh stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        qh stackIn_102_0 = null;
        qh stackIn_103_0 = null;
        qh stackIn_104_0 = null;
        qh stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_109_0 = 0;
        qh stackIn_123_0 = null;
        qh stackIn_124_0 = null;
        qh stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        qh stackIn_127_0 = null;
        qh stackIn_128_0 = null;
        qh stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        qh stackIn_131_0 = null;
        qh stackIn_132_0 = null;
        qh stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        String stackIn_147_0 = null;
        qh stackIn_150_0 = null;
        qh stackIn_151_0 = null;
        qh stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        qh stackIn_153_0 = null;
        qh stackIn_154_0 = null;
        qh stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_163_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_224_0 = 0;
        qh stackIn_319_0 = null;
        qh stackIn_320_0 = null;
        qh stackIn_321_0 = null;
        qh stackIn_322_0 = null;
        int stackIn_322_1 = 0;
        qh stackIn_327_0 = null;
        boolean stackIn_327_1 = false;
        qh stackIn_328_0 = null;
        boolean stackIn_328_1 = false;
        qh stackIn_329_0 = null;
        boolean stackIn_329_1 = false;
        int stackIn_329_2 = 0;
        qh stackIn_331_0 = null;
        qh stackIn_332_0 = null;
        qh stackIn_333_0 = null;
        int stackIn_333_1 = 0;
        qh stackIn_335_0 = null;
        qh stackIn_336_0 = null;
        qh stackIn_337_0 = null;
        qh stackIn_338_0 = null;
        int stackIn_338_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        qh stackOut_32_0 = null;
        qh stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        qh stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        qh stackOut_39_0 = null;
        qh stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        qh stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        qh stackOut_97_0 = null;
        qh stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        qh stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        qh stackOut_93_0 = null;
        boolean stackOut_93_1 = false;
        qh stackOut_95_0 = null;
        boolean stackOut_95_1 = false;
        int stackOut_95_2 = 0;
        qh stackOut_94_0 = null;
        boolean stackOut_94_1 = false;
        int stackOut_94_2 = 0;
        qh stackOut_86_0 = null;
        qh stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        qh stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        qh stackOut_101_0 = null;
        qh stackOut_102_0 = null;
        qh stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        qh stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        String stackOut_146_0 = null;
        Object stackOut_145_0 = null;
        qh stackOut_149_0 = null;
        qh stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        qh stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        qh stackOut_152_0 = null;
        qh stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        qh stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_162_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_215_0 = 0;
        int stackOut_213_0 = 0;
        qh stackOut_330_0 = null;
        qh stackOut_332_0 = null;
        int stackOut_332_1 = 0;
        qh stackOut_331_0 = null;
        int stackOut_331_1 = 0;
        qh stackOut_326_0 = null;
        boolean stackOut_326_1 = false;
        qh stackOut_328_0 = null;
        boolean stackOut_328_1 = false;
        int stackOut_328_2 = 0;
        qh stackOut_327_0 = null;
        boolean stackOut_327_1 = false;
        int stackOut_327_2 = 0;
        qh stackOut_318_0 = null;
        qh stackOut_319_0 = null;
        qh stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        qh stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        qh stackOut_334_0 = null;
        qh stackOut_335_0 = null;
        qh stackOut_336_0 = null;
        int stackOut_336_1 = 0;
        qh stackOut_337_0 = null;
        int stackOut_337_1 = 0;
        qh stackOut_126_0 = null;
        qh stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        qh stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        qh stackOut_122_0 = null;
        qh stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        qh stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        qh stackOut_130_0 = null;
        qh stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        qh stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        var8_ref2 = null;
        L0: {
          var26 = SteelSentinels.field_G;
          if (param3) {
            L1: {
              if (ad.field_f) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
            }
            var4 = stackIn_11_0;
            break L0;
          } else {
            L2: {
              if (kk.a(-28548)) {
                if (!param0.field_rc) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L2;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L2;
              }
            }
            var4 = stackIn_7_0;
            break L0;
          }
        }
        L3: {
          L4: {
            L5: {
              var5 = 0;
              if (!param3) {
                var6 = 0;
                L6: while (true) {
                  if (5 <= var6) {
                    L7: {
                      if (un.field_h[0][2].field_K) {
                        if (kk.a(-28548)) {
                          ll.field_i = da.field_c;
                          break L7;
                        } else {
                          ll.field_i = db.a(fk.field_a, -75, new String[1]);
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    if (jg.field_l.length >= 2) {
                      L8: {
                        if (param3) {
                          if (-1 != qm.field_h) {
                            stackOut_54_0 = 1;
                            stackIn_56_0 = stackOut_54_0;
                            break L8;
                          } else {
                            stackOut_53_0 = 0;
                            stackIn_56_0 = stackOut_53_0;
                            break L8;
                          }
                        } else {
                          stackOut_51_0 = 0;
                          stackIn_56_0 = stackOut_51_0;
                          break L8;
                        }
                      }
                      var6 = stackIn_56_0;
                      if (var6 == 0) {
                        break L4;
                      } else {
                        var7 = qm.field_h;
                        var8_int = 0;
                        L9: while (true) {
                          if (var8_int >= rb.field_i.length) {
                            break L5;
                          } else {
                            rb.field_i[var8_int] = (byte) 0;
                            var8_int++;
                            continue L9;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    L10: {
                      if (var4 == 0) {
                        break L10;
                      } else {
                        if (-1 == (un.field_h[0][var6 - -1].field_Eb ^ -1)) {
                          break L10;
                        } else {
                          if (var6 != param0.field_Nc) {
                            param0.field_Nc = var6;
                            var5 = 1;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    L11: {
                      stackOut_32_0 = un.field_h[0][var6 - -1];
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_33_0 = stackOut_32_0;
                      if (var4 == 0) {
                        stackOut_34_0 = (qh) (Object) stackIn_34_0;
                        stackOut_34_1 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        break L11;
                      } else {
                        stackOut_33_0 = (qh) (Object) stackIn_33_0;
                        stackOut_33_1 = 1;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        break L11;
                      }
                    }
                    L12: {
                      stackIn_35_0.field_T = stackIn_35_1 != 0;
                      if (rm.field_p) {
                        break L12;
                      } else {
                        if (var6 == 3) {
                          un.field_h[0][var6 - -1].field_T = false;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      stackOut_39_0 = un.field_h[0][var6 + 1];
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_40_0 = stackOut_39_0;
                      if (var6 != param0.field_Nc) {
                        stackOut_41_0 = (qh) (Object) stackIn_41_0;
                        stackOut_41_1 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        break L13;
                      } else {
                        stackOut_40_0 = (qh) (Object) stackIn_40_0;
                        stackOut_40_1 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        break L13;
                      }
                    }
                    stackIn_42_0.field_G = stackIn_42_1 != 0;
                    var6++;
                    continue L6;
                  }
                }
              } else {
                if (jg.field_l.length >= 2) {
                  L14: {
                    if (param3) {
                      if (-1 != qm.field_h) {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        break L14;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_21_0 = stackOut_18_0;
                        break L14;
                      }
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_21_0 = stackOut_16_0;
                      break L14;
                    }
                  }
                  var6 = stackIn_21_0;
                  if (var6 == 0) {
                    break L4;
                  } else {
                    var7 = qm.field_h;
                    var8_int = 0;
                    L15: while (true) {
                      if (var8_int >= rb.field_i.length) {
                        break L5;
                      } else {
                        rb.field_i[var8_int] = (byte) 0;
                        var8_int++;
                        continue L15;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            rb.field_i[var7 / 8] = (byte)vn.a((int) rb.field_i[var7 / 8], 1 << var7 % 8);
            break L4;
          }
          L16: {
            if (!param3) {
              stackOut_63_0 = 0;
              stackIn_64_0 = stackOut_63_0;
              break L16;
            } else {
              stackOut_62_0 = -1;
              stackIn_64_0 = stackOut_62_0;
              break L16;
            }
          }
          var7 = stackIn_64_0;
          L17: while (true) {
            if (jg.field_l.length <= var7) {
              break L3;
            } else {
              L18: {
                if (var6 != 0) {
                  if (var7 != qm.field_h) {
                    stackOut_70_0 = 1;
                    stackIn_72_0 = stackOut_70_0;
                    break L18;
                  } else {
                    stackOut_69_0 = 0;
                    stackIn_72_0 = stackOut_69_0;
                    break L18;
                  }
                } else {
                  stackOut_67_0 = 0;
                  stackIn_72_0 = stackOut_67_0;
                  break L18;
                }
              }
              L19: {
                var8_int = stackIn_72_0;
                if (var4 == 0) {
                  break L19;
                } else {
                  if (un.field_h[1][var7 - -1].field_Eb != 0) {
                    if (!param3) {
                      var9 = jg.field_l[var7];
                      if (var9 == param0.field_Ub) {
                        break L19;
                      } else {
                        param0.field_Ub = var9;
                        var5 = 1;
                        break L19;
                      }
                    } else {
                      if (var6 == 0) {
                        if ((var7 ^ -1) != 0) {
                          rb.field_i[var7 / 8] = (byte)bi.a((int) rb.field_i[var7 / 8], 1 << ec.a(7, var7));
                          break L19;
                        } else {
                          var9 = 0;
                          L20: while (true) {
                            if (rb.field_i.length <= var9) {
                              break L19;
                            } else {
                              rb.field_i[var9] = (byte) 0;
                              var9++;
                              continue L20;
                            }
                          }
                        }
                      } else {
                        break L19;
                      }
                    }
                  } else {
                    break L19;
                  }
                }
              }
              L21: {
                if (param3) {
                  if (0 != (var7 ^ -1)) {
                    L22: {
                      stackOut_97_0 = un.field_h[1][var7 + 1];
                      stackIn_99_0 = stackOut_97_0;
                      stackIn_98_0 = stackOut_97_0;
                      if ((rb.field_i[var7 / 8] & 1 << (var7 & 7)) == 0) {
                        stackOut_99_0 = (qh) (Object) stackIn_99_0;
                        stackOut_99_1 = 0;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        break L22;
                      } else {
                        stackOut_98_0 = (qh) (Object) stackIn_98_0;
                        stackOut_98_1 = 1;
                        stackIn_100_0 = stackOut_98_0;
                        stackIn_100_1 = stackOut_98_1;
                        break L22;
                      }
                    }
                    stackIn_100_0.field_G = stackIn_100_1 != 0;
                    break L21;
                  } else {
                    un.field_h[1][1 + var7].field_G = true;
                    var9 = 0;
                    L23: while (true) {
                      if (jg.field_l.length <= var9) {
                        break L21;
                      } else {
                        L24: {
                          stackOut_93_0 = un.field_h[1][var7 + 1];
                          stackOut_93_1 = un.field_h[1][var7 + 1].field_G;
                          stackIn_95_0 = stackOut_93_0;
                          stackIn_95_1 = stackOut_93_1;
                          stackIn_94_0 = stackOut_93_0;
                          stackIn_94_1 = stackOut_93_1;
                          if ((rb.field_i[var9 / 8] & 1 << (var9 & 7)) != 0) {
                            stackOut_95_0 = (qh) (Object) stackIn_95_0;
                            stackOut_95_1 = stackIn_95_1;
                            stackOut_95_2 = 0;
                            stackIn_96_0 = stackOut_95_0;
                            stackIn_96_1 = stackOut_95_1;
                            stackIn_96_2 = stackOut_95_2;
                            break L24;
                          } else {
                            stackOut_94_0 = (qh) (Object) stackIn_94_0;
                            stackOut_94_1 = stackIn_94_1;
                            stackOut_94_2 = 1;
                            stackIn_96_0 = stackOut_94_0;
                            stackIn_96_1 = stackOut_94_1;
                            stackIn_96_2 = stackOut_94_2;
                            break L24;
                          }
                        }
                        stackIn_96_0.field_G = stackIn_96_1 & stackIn_96_2 != 0;
                        var9++;
                        continue L23;
                      }
                    }
                  }
                } else {
                  L25: {
                    var9 = jg.field_l[var7];
                    stackOut_86_0 = un.field_h[1][1 + var7];
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_87_0 = stackOut_86_0;
                    if (var9 != param0.field_Ub) {
                      stackOut_88_0 = (qh) (Object) stackIn_88_0;
                      stackOut_88_1 = 0;
                      stackIn_89_0 = stackOut_88_0;
                      stackIn_89_1 = stackOut_88_1;
                      break L25;
                    } else {
                      stackOut_87_0 = (qh) (Object) stackIn_87_0;
                      stackOut_87_1 = 1;
                      stackIn_89_0 = stackOut_87_0;
                      stackIn_89_1 = stackOut_87_1;
                      break L25;
                    }
                  }
                  stackIn_89_0.field_G = stackIn_89_1 != 0;
                  break L21;
                }
              }
              L26: {
                L27: {
                  stackOut_101_0 = un.field_h[1][var7 - -1];
                  stackIn_104_0 = stackOut_101_0;
                  stackIn_102_0 = stackOut_101_0;
                  if (var4 == 0) {
                    break L27;
                  } else {
                    stackOut_102_0 = (qh) (Object) stackIn_102_0;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_103_0 = stackOut_102_0;
                    if (var8_int != 0) {
                      break L27;
                    } else {
                      stackOut_103_0 = (qh) (Object) stackIn_103_0;
                      stackOut_103_1 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      break L26;
                    }
                  }
                }
                stackOut_104_0 = (qh) (Object) stackIn_104_0;
                stackOut_104_1 = 0;
                stackIn_105_0 = stackOut_104_0;
                stackIn_105_1 = stackOut_104_1;
                break L26;
              }
              stackIn_105_0.field_T = stackIn_105_1 != 0;
              var7++;
              continue L17;
            }
          }
        }
        L28: {
          if (param3) {
            stackOut_108_0 = 0;
            stackIn_109_0 = stackOut_108_0;
            break L28;
          } else {
            stackOut_107_0 = 1;
            stackIn_109_0 = stackOut_107_0;
            break L28;
          }
        }
        var6 = stackIn_109_0;
        L29: while (true) {
          if (var6 >= 3) {
            L30: {
              if (!param3) {
                break L30;
              } else {
                if (1 >= tc.field_z) {
                  break L30;
                } else {
                  var6 = 0;
                  L31: while (true) {
                    if (tc.field_z - -1 <= var6) {
                      break L30;
                    } else {
                      L32: {
                        var29 = un.field_h[3][var6];
                        if (var4 == 0) {
                          break L32;
                        } else {
                          if (0 == var29.field_Eb) {
                            break L32;
                          } else {
                            fi.field_l = var6;
                            break L32;
                          }
                        }
                      }
                      L33: {
                        if (!var29.field_K) {
                          break L33;
                        } else {
                          if (var6 > 0) {
                            L34: {
                              if (e.field_g != null) {
                                stackOut_146_0 = e.field_g[-1 + var6];
                                stackIn_147_0 = stackOut_146_0;
                                break L34;
                              } else {
                                stackOut_145_0 = null;
                                stackIn_147_0 = (String) (Object) stackOut_145_0;
                                break L34;
                              }
                            }
                            var8_ref2 = stackIn_147_0;
                            if (var8_ref2 == null) {
                              break L33;
                            } else {
                              ll.field_i = var8_ref2;
                              break L33;
                            }
                          } else {
                            break L33;
                          }
                        }
                      }
                      L35: {
                        stackOut_149_0 = (qh) var29;
                        stackIn_151_0 = stackOut_149_0;
                        stackIn_150_0 = stackOut_149_0;
                        if (fi.field_l != var6) {
                          stackOut_151_0 = (qh) (Object) stackIn_151_0;
                          stackOut_151_1 = 0;
                          stackIn_152_0 = stackOut_151_0;
                          stackIn_152_1 = stackOut_151_1;
                          break L35;
                        } else {
                          stackOut_150_0 = (qh) (Object) stackIn_150_0;
                          stackOut_150_1 = 1;
                          stackIn_152_0 = stackOut_150_0;
                          stackIn_152_1 = stackOut_150_1;
                          break L35;
                        }
                      }
                      L36: {
                        stackIn_152_0.field_G = stackIn_152_1 != 0;
                        stackOut_152_0 = (qh) var29;
                        stackIn_154_0 = stackOut_152_0;
                        stackIn_153_0 = stackOut_152_0;
                        if (var4 == 0) {
                          stackOut_154_0 = (qh) (Object) stackIn_154_0;
                          stackOut_154_1 = 0;
                          stackIn_155_0 = stackOut_154_0;
                          stackIn_155_1 = stackOut_154_1;
                          break L36;
                        } else {
                          stackOut_153_0 = (qh) (Object) stackIn_153_0;
                          stackOut_153_1 = 1;
                          stackIn_155_0 = stackOut_153_0;
                          stackIn_155_1 = stackOut_153_1;
                          break L36;
                        }
                      }
                      stackIn_155_0.field_T = stackIn_155_1 != 0;
                      var6++;
                      continue L31;
                    }
                  }
                }
              }
            }
            if (param1 <= -114) {
              var6 = 0;
              var7 = 0;
              L37: while (true) {
                if (var7 >= be.field_a) {
                  L38: {
                    if (var5 == 0) {
                      break L38;
                    } else {
                      if (!param3) {
                        ad.a(0, param2);
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                  }
                  return;
                } else {
                  L39: {
                    var30 = un.field_h[4 - -var7];
                    var8 = var30;
                    if (param3) {
                      stackOut_162_0 = -1;
                      stackIn_163_0 = stackOut_162_0;
                      break L39;
                    } else {
                      stackOut_161_0 = 0;
                      stackIn_163_0 = stackOut_161_0;
                      break L39;
                    }
                  }
                  var9 = stackIn_163_0;
                  L40: while (true) {
                    if (var30.length - 1 <= var9) {
                      var6 = var6 + (255 & wb.field_j[var7]);
                      var7++;
                      continue L37;
                    } else {
                      L41: {
                        var10 = 0;
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        if (var4 == 0) {
                          break L41;
                        } else {
                          if (0 > var9) {
                            break L41;
                          } else {
                            L42: {
                              if (fc.field_b == null) {
                                break L42;
                              } else {
                                if (null != fc.field_b[var7]) {
                                  if (-1 < (jj.field_i & fc.field_b[var7][var9])) {
                                    var14 = 1;
                                    var15 = ok.a((jj.field_i ^ -1) & fc.field_b[var7][var9], (byte) 51);
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                } else {
                                  break L42;
                                }
                              }
                            }
                            L43: {
                              if (null == ad.field_d) {
                                break L43;
                              } else {
                                if (ad.field_d[var7] == null) {
                                  break L43;
                                } else {
                                  if (-1 > (rd.field_b ^ -1)) {
                                    break L43;
                                  } else {
                                    if (!ad.field_d[var7][var9]) {
                                      break L43;
                                    } else {
                                      var10 = 1;
                                      break L43;
                                    }
                                  }
                                }
                              }
                            }
                            L44: {
                              if (null == ja.field_b) {
                                break L44;
                              } else {
                                if (null != ja.field_b[var7]) {
                                  L45: {
                                    var16 = ja.field_b[var7][var9];
                                    if (0 >= var16) {
                                      break L45;
                                    } else {
                                      if (ba.field_b < var16) {
                                        var12 = 1;
                                        break L45;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                  if (var16 == 0) {
                                    break L44;
                                  } else {
                                    if (vg.field_a) {
                                      break L44;
                                    } else {
                                      if (rd.field_b > 0) {
                                        break L44;
                                      } else {
                                        var10 = 1;
                                        break L44;
                                      }
                                    }
                                  }
                                } else {
                                  break L44;
                                }
                              }
                            }
                            L46: {
                              if (param3) {
                                if (gl.field_x != null) {
                                  if (null != gl.field_x[var7]) {
                                    if (!gl.field_x[var7][var9]) {
                                      stackOut_197_0 = 0;
                                      stackIn_198_0 = stackOut_197_0;
                                      break L46;
                                    } else {
                                      stackOut_196_0 = 1;
                                      stackIn_198_0 = stackOut_196_0;
                                      break L46;
                                    }
                                  } else {
                                    stackOut_194_0 = 0;
                                    stackIn_198_0 = stackOut_194_0;
                                    break L46;
                                  }
                                } else {
                                  stackOut_192_0 = 0;
                                  stackIn_198_0 = stackOut_192_0;
                                  break L46;
                                }
                              } else {
                                stackOut_190_0 = 0;
                                stackIn_198_0 = stackOut_190_0;
                                break L46;
                              }
                            }
                            var13 = stackIn_198_0;
                            if (null == ol.field_cc) {
                              break L41;
                            } else {
                              if (null == ol.field_cc[var7]) {
                                break L41;
                              } else {
                                L47: {
                                  var16 = ol.field_cc[var7][var9];
                                  if (var16 == 0) {
                                    break L47;
                                  } else {
                                    if (vg.field_a) {
                                      break L47;
                                    } else {
                                      if (rd.field_b <= 0) {
                                        var10 = 1;
                                        break L47;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                }
                                if (-1 <= var16) {
                                  break L41;
                                } else {
                                  if (ud.field_D < var16) {
                                    var11 = 1;
                                    break L41;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L48: {
                        if (-3 > ul.field_d) {
                          break L48;
                        } else {
                          if (!fc.field_e[12]) {
                            break L48;
                          } else {
                            var11 = 0;
                            var14 = 0;
                            var10 = 0;
                            var13 = 0;
                            var12 = 0;
                            break L48;
                          }
                        }
                      }
                      L49: {
                        if (var10 == 0) {
                          if (var11 == 0) {
                            if (var12 == 0) {
                              if (var13 == 0) {
                                if (var14 != 0) {
                                  stackOut_222_0 = 1;
                                  stackIn_224_0 = stackOut_222_0;
                                  break L49;
                                } else {
                                  stackOut_221_0 = 0;
                                  stackIn_224_0 = stackOut_221_0;
                                  break L49;
                                }
                              } else {
                                stackOut_219_0 = 1;
                                stackIn_224_0 = stackOut_219_0;
                                break L49;
                              }
                            } else {
                              stackOut_217_0 = 1;
                              stackIn_224_0 = stackOut_217_0;
                              break L49;
                            }
                          } else {
                            stackOut_215_0 = 1;
                            stackIn_224_0 = stackOut_215_0;
                            break L49;
                          }
                        } else {
                          stackOut_213_0 = 1;
                          stackIn_224_0 = stackOut_213_0;
                          break L49;
                        }
                      }
                      L50: {
                        var16 = stackIn_224_0;
                        ng.field_k = true;
                        if (var16 != 0) {
                          break L50;
                        } else {
                          if (var9 < 0) {
                            break L50;
                          } else {
                            if (null == m.field_b) {
                              break L50;
                            } else {
                              L51: {
                                if (!param3) {
                                  break L51;
                                } else {
                                  if (!ad.field_f) {
                                    break L51;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              L52: {
                                gi.field_u = false;
                                ng.field_k = false;
                                if (null != dl.field_O) {
                                  break L52;
                                } else {
                                  m.field_h = new boolean[be.field_a];
                                  dl.field_O = new byte[be.field_a];
                                  break L52;
                                }
                              }
                              var17_int = 0;
                              L53: while (true) {
                                if (var17_int >= var7) {
                                  L54: {
                                    lc.a(var9, -1, param0, var7, -1, -89, 0, param3);
                                    if (-3 < (ul.field_d ^ -1)) {
                                      break L54;
                                    } else {
                                      if (fc.field_e[12]) {
                                        ng.field_k = true;
                                        break L54;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                  if (ng.field_k) {
                                    break L50;
                                  } else {
                                    var16 = 1;
                                    break L50;
                                  }
                                } else {
                                  m.field_h[var17_int] = false;
                                  var17_int++;
                                  continue L53;
                                }
                              }
                            }
                          }
                        }
                      }
                      L55: {
                        var17 = var8[var9 - -1];
                        if (var4 == 0) {
                          break L55;
                        } else {
                          if (-1 != var17.field_Eb) {
                            if (!param3) {
                              if (var16 != 0) {
                                break L55;
                              } else {
                                if ((byte)var9 == param0.field_Sb[var7]) {
                                  break L55;
                                } else {
                                  var5 = 1;
                                  param0.field_Sb[var7] = (byte)var9;
                                  break L55;
                                }
                              }
                            } else {
                              if (0 == var9) {
                                var18 = var6;
                                L56: while (true) {
                                  if (var18 >= var6 + var30.length + -1) {
                                    break L55;
                                  } else {
                                    ti.field_s[var18 / 8] = (byte)ec.a((int) ti.field_s[var18 / 8], 1 << ec.a(var18, 7) ^ -1);
                                    var18++;
                                    continue L56;
                                  }
                                }
                              } else {
                                ti.field_s[(var9 - -var6) / 8] = (byte)bi.a((int) ti.field_s[(var9 + var6) / 8], 1 << ec.a(7, var9 + var6));
                                break L55;
                              }
                            }
                          } else {
                            break L55;
                          }
                        }
                      }
                      L57: {
                        if (!param3) {
                          break L57;
                        } else {
                          if (var16 != 0) {
                            ti.field_s[(var9 - -var6) / 8] = (byte)ec.a((int) ti.field_s[(var9 + var6) / 8], 1 << ec.a(var6 + var9, 7) ^ -1);
                            break L57;
                          } else {
                            break L57;
                          }
                        }
                      }
                      L58: {
                        if (var9 < 0) {
                          break L58;
                        } else {
                          if (!var17.field_K) {
                            break L58;
                          } else {
                            L59: {
                              if (bl.field_h == null) {
                                var18_ref = null;
                                break L59;
                              } else {
                                if (null == bl.field_h[var7]) {
                                  var18_ref = null;
                                  break L59;
                                } else {
                                  var18_ref_String = bl.field_h[var7][var9];
                                  break L59;
                                }
                              }
                            }
                            L60: {
                              if (fj.field_b == null) {
                                var19 = null;
                                break L60;
                              } else {
                                if (null != fj.field_b[var7]) {
                                  var19_ref = fj.field_b[var7][var9];
                                  break L60;
                                } else {
                                  var19_ref = null;
                                  break L60;
                                }
                              }
                            }
                            L61: {
                              var20 = null;
                              if (var19 == null) {
                                break L61;
                              } else {
                                if (!((String) var19).equals(var18_ref)) {
                                  var20 = (String) var19;
                                  break L61;
                                } else {
                                  break L61;
                                }
                              }
                            }
                            L62: {
                              var21 = null;
                              if (var13 != 0) {
                                var21 = vi.field_X;
                                var22 = var21;
                                var25 = var22;
                                var22 = var25;
                                var21 = var22;
                                var25 = var21;
                                var22 = var25;
                                var25 = var22;
                                var22 = var25;
                                var21 = var22;
                                var22 = var25;
                                break L62;
                              } else {
                                if (var10 != 0) {
                                  var21 = in.field_c;
                                  break L62;
                                } else {
                                  L63: {
                                    if (var11 == 0) {
                                      break L63;
                                    } else {
                                      var22_int = ol.field_cc[var7][var9] - ud.field_D;
                                      if ((var22_int ^ -1) != -2) {
                                        var21 = db.a(hd.field_d, -34, new String[1]);
                                        break L63;
                                      } else {
                                        var21 = wb.field_e;
                                        break L63;
                                      }
                                    }
                                  }
                                  L64: {
                                    if (var12 != 0) {
                                      var31 = db.a(bj.field_c, -74, new String[2]);
                                      var22 = var31;
                                      var25 = var22;
                                      var22 = var25;
                                      var21 = var22;
                                      var25 = var31;
                                      var22 = var25;
                                      if (var21 == null) {
                                        var21 = var31;
                                        break L64;
                                      } else {
                                        var21 = var21 + "<br>" + var31;
                                        break L64;
                                      }
                                    } else {
                                      break L64;
                                    }
                                  }
                                  if (var14 == 0) {
                                    break L62;
                                  } else {
                                    L65: {
                                      var22 = si.field_u;
                                      if ((var15 ^ -1) >= -1) {
                                        break L65;
                                      } else {
                                        if (null == in.field_b) {
                                          break L65;
                                        } else {
                                          if (in.field_b.length < var15) {
                                            break L65;
                                          } else {
                                            if (in.field_b[var15 - 1] == null) {
                                              break L65;
                                            } else {
                                              var22_ref = in.field_b[-1 + var15][0];
                                              break L65;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var21 != null) {
                                      var21 = var21 + "<br>" + var22_ref;
                                      break L62;
                                    } else {
                                      var21 = var22_ref;
                                      break L62;
                                    }
                                  }
                                }
                              }
                            }
                            L66: {
                              if (var4 == 0) {
                                break L66;
                              } else {
                                if (ng.field_k) {
                                  break L66;
                                } else {
                                  L67: {
                                    var22_ref = null;
                                    if (!gi.field_u) {
                                      break L67;
                                    } else {
                                      var22 = "</col>" + rb.field_d + "<col=A00000>";
                                      var25 = var22;
                                      var22 = var25;
                                      var25 = var22;
                                      var22 = var25;
                                      var21 = var22;
                                      break L67;
                                    }
                                  }
                                  var23 = 0;
                                  var24 = 0;
                                  L68: while (true) {
                                    if (var7 <= var24) {
                                      if (var23 != 0) {
                                        var21 = mb.field_Ob + var22;
                                        break L66;
                                      } else {
                                        var21 = db.a(be.field_g, -84, new String[1]);
                                        break L66;
                                      }
                                    } else {
                                      if (m.field_h[var24]) {
                                        var25 = "</col>" + al.field_a[var24] + "<col=A00000>";
                                        var22 = var25;
                                        var21 = var22;
                                        var22 = var25;
                                        if (var22 != null) {
                                          var23 = 1;
                                          var22 = var22 + ", " + var25;
                                          var21 = var22;
                                          var21 = var22;
                                          var24++;
                                          continue L68;
                                        } else {
                                          var22 = var25;
                                          var24++;
                                          continue L68;
                                        }
                                      } else {
                                        var24++;
                                        continue L68;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L69: {
                              if (var21 != null) {
                                var32 = "<col=A00000>" + var21;
                                var33 = ln.a("<br>", (byte) 11, "<br><col=A00000>", var32);
                                if (var20 == null) {
                                  var20 = var33;
                                  break L69;
                                } else {
                                  var20 = var20 + "<br>" + var33;
                                  break L69;
                                }
                              } else {
                                break L69;
                              }
                            }
                            if (var20 != null) {
                              ll.field_i = var20;
                              break L58;
                            } else {
                              break L58;
                            }
                          }
                        }
                      }
                      L70: {
                        if (param3) {
                          if (var9 != -1) {
                            L71: {
                              stackOut_330_0 = (qh) var17;
                              stackIn_332_0 = stackOut_330_0;
                              stackIn_331_0 = stackOut_330_0;
                              if (-1 == (ti.field_s[(var9 + var6) / 8] & 1 << (var6 + var9 & 7) ^ -1)) {
                                stackOut_332_0 = (qh) (Object) stackIn_332_0;
                                stackOut_332_1 = 0;
                                stackIn_333_0 = stackOut_332_0;
                                stackIn_333_1 = stackOut_332_1;
                                break L71;
                              } else {
                                stackOut_331_0 = (qh) (Object) stackIn_331_0;
                                stackOut_331_1 = 1;
                                stackIn_333_0 = stackOut_331_0;
                                stackIn_333_1 = stackOut_331_1;
                                break L71;
                              }
                            }
                            stackIn_333_0.field_G = stackIn_333_1 != 0;
                            break L70;
                          } else {
                            var17.field_G = true;
                            var27 = var6;
                            var18 = var27;
                            L72: while (true) {
                              if (-1 + (var6 + var30.length) <= var27) {
                                break L70;
                              } else {
                                L73: {
                                  stackOut_326_0 = (qh) var17;
                                  stackOut_326_1 = var17.field_G;
                                  stackIn_328_0 = stackOut_326_0;
                                  stackIn_328_1 = stackOut_326_1;
                                  stackIn_327_0 = stackOut_326_0;
                                  stackIn_327_1 = stackOut_326_1;
                                  if (-1 != (ti.field_s[var27 / 8] & 1 << (var27 & 7) ^ -1)) {
                                    stackOut_328_0 = (qh) (Object) stackIn_328_0;
                                    stackOut_328_1 = stackIn_328_1;
                                    stackOut_328_2 = 0;
                                    stackIn_329_0 = stackOut_328_0;
                                    stackIn_329_1 = stackOut_328_1;
                                    stackIn_329_2 = stackOut_328_2;
                                    break L73;
                                  } else {
                                    stackOut_327_0 = (qh) (Object) stackIn_327_0;
                                    stackOut_327_1 = stackIn_327_1;
                                    stackOut_327_2 = 1;
                                    stackIn_329_0 = stackOut_327_0;
                                    stackIn_329_1 = stackOut_327_1;
                                    stackIn_329_2 = stackOut_327_2;
                                    break L73;
                                  }
                                }
                                stackIn_329_0.field_G = stackIn_329_1 & stackIn_329_2 != 0;
                                var27++;
                                continue L72;
                              }
                            }
                          }
                        } else {
                          L74: {
                            L75: {
                              stackOut_318_0 = (qh) var17;
                              stackIn_321_0 = stackOut_318_0;
                              stackIn_319_0 = stackOut_318_0;
                              if (!ng.field_k) {
                                break L75;
                              } else {
                                stackOut_319_0 = (qh) (Object) stackIn_319_0;
                                stackIn_321_0 = stackOut_319_0;
                                stackIn_320_0 = stackOut_319_0;
                                if ((byte)var9 != param0.field_Sb[var7]) {
                                  break L75;
                                } else {
                                  stackOut_320_0 = (qh) (Object) stackIn_320_0;
                                  stackOut_320_1 = 1;
                                  stackIn_322_0 = stackOut_320_0;
                                  stackIn_322_1 = stackOut_320_1;
                                  break L74;
                                }
                              }
                            }
                            stackOut_321_0 = (qh) (Object) stackIn_321_0;
                            stackOut_321_1 = 0;
                            stackIn_322_0 = stackOut_321_0;
                            stackIn_322_1 = stackOut_321_1;
                            break L74;
                          }
                          stackIn_322_0.field_G = stackIn_322_1 != 0;
                          break L70;
                        }
                      }
                      L76: {
                        L77: {
                          stackOut_334_0 = (qh) var17;
                          stackIn_337_0 = stackOut_334_0;
                          stackIn_335_0 = stackOut_334_0;
                          if (var4 == 0) {
                            break L77;
                          } else {
                            stackOut_335_0 = (qh) (Object) stackIn_335_0;
                            stackIn_337_0 = stackOut_335_0;
                            stackIn_336_0 = stackOut_335_0;
                            if (var16 != 0) {
                              break L77;
                            } else {
                              stackOut_336_0 = (qh) (Object) stackIn_336_0;
                              stackOut_336_1 = 1;
                              stackIn_338_0 = stackOut_336_0;
                              stackIn_338_1 = stackOut_336_1;
                              break L76;
                            }
                          }
                        }
                        stackOut_337_0 = (qh) (Object) stackIn_337_0;
                        stackOut_337_1 = 0;
                        stackIn_338_0 = stackOut_337_0;
                        stackIn_338_1 = stackOut_337_1;
                        break L76;
                      }
                      stackIn_338_0.field_T = stackIn_338_1 != 0;
                      var9++;
                      continue L40;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            L78: {
              var28 = un.field_h[2][var6];
              if (var4 == 0) {
                break L78;
              } else {
                if (-1 == (var28.field_Eb ^ -1)) {
                  break L78;
                } else {
                  if (param3) {
                    if (var6 != 0) {
                      nb.field_L = nb.field_L ^ var6;
                      break L78;
                    } else {
                      nb.field_L = 0;
                      break L78;
                    }
                  } else {
                    if (var6 == param0.field_sc) {
                      break L78;
                    } else {
                      param0.field_sc = var6;
                      var5 = 1;
                      break L78;
                    }
                  }
                }
              }
            }
            L79: {
              if (!param3) {
                L80: {
                  stackOut_126_0 = (qh) var28;
                  stackIn_128_0 = stackOut_126_0;
                  stackIn_127_0 = stackOut_126_0;
                  if ((param0.field_sc & var6) == 0) {
                    stackOut_128_0 = (qh) (Object) stackIn_128_0;
                    stackOut_128_1 = 0;
                    stackIn_129_0 = stackOut_128_0;
                    stackIn_129_1 = stackOut_128_1;
                    break L80;
                  } else {
                    stackOut_127_0 = (qh) (Object) stackIn_127_0;
                    stackOut_127_1 = 1;
                    stackIn_129_0 = stackOut_127_0;
                    stackIn_129_1 = stackOut_127_1;
                    break L80;
                  }
                }
                stackIn_129_0.field_G = stackIn_129_1 != 0;
                break L79;
              } else {
                if (var6 != 0) {
                  L81: {
                    stackOut_122_0 = (qh) var28;
                    stackIn_124_0 = stackOut_122_0;
                    stackIn_123_0 = stackOut_122_0;
                    if ((var6 & nb.field_L) == 0) {
                      stackOut_124_0 = (qh) (Object) stackIn_124_0;
                      stackOut_124_1 = 0;
                      stackIn_125_0 = stackOut_124_0;
                      stackIn_125_1 = stackOut_124_1;
                      break L81;
                    } else {
                      stackOut_123_0 = (qh) (Object) stackIn_123_0;
                      stackOut_123_1 = 1;
                      stackIn_125_0 = stackOut_123_0;
                      stackIn_125_1 = stackOut_123_1;
                      break L81;
                    }
                  }
                  stackIn_125_0.field_G = stackIn_125_1 != 0;
                  break L79;
                } else {
                  var28.field_G = true;
                  break L79;
                }
              }
            }
            L82: {
              stackOut_130_0 = (qh) var28;
              stackIn_132_0 = stackOut_130_0;
              stackIn_131_0 = stackOut_130_0;
              if (var4 == 0) {
                stackOut_132_0 = (qh) (Object) stackIn_132_0;
                stackOut_132_1 = 0;
                stackIn_133_0 = stackOut_132_0;
                stackIn_133_1 = stackOut_132_1;
                break L82;
              } else {
                stackOut_131_0 = (qh) (Object) stackIn_131_0;
                stackOut_131_1 = 1;
                stackIn_133_0 = stackOut_131_0;
                stackIn_133_1 = stackOut_131_1;
                break L82;
              }
            }
            stackIn_133_0.field_T = stackIn_133_1 != 0;
            var6++;
            continue L29;
          }
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            df var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = SteelSentinels.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((cb) this).field_b) {
                            statePc = 22;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((cb) this).field_i;
                        // monitorenter ((cb) this).field_i
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (df) (Object) ((cb) this).field_i.c(-104);
                            if (var7 != null) {
                                statePc = 10;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((Object) (Object) ((cb) this).field_i).wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 7 : 12);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            interruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var2
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((cb) this).field_f = ((cb) this).field_f - 1;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 14: {
                        try {
                            if (-3 == (var7.field_H ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if ((var7.field_H ^ -1) == -4) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_L = var7.field_G.b((int)var7.field_w, false);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            boolean discarded$1 = var7.field_G.a(79, var7.field_L.length, (int)var7.field_w, var7.field_L);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        sj.a((String) null, -36, (Throwable) (Object) var2_ref);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        var7.field_z = false;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 22: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final df a(byte param0, rc param1, int param2, byte[] param3) {
        df var5 = new df();
        if (param0 < 33) {
            return null;
        }
        var5.field_B = false;
        var5.field_H = 2;
        var5.field_w = (long)param2;
        var5.field_G = param1;
        var5.field_L = param3;
        this.a((byte) -92, var5);
        return var5;
    }

    public static void b(int param0) {
        field_h = null;
        field_a = null;
        field_e = null;
        field_j = null;
        field_c = null;
        if (param0 != -1) {
            field_l = -46;
        }
        field_g = null;
        field_d = null;
    }

    final df a(rc param0, int param1, int param2) {
        df var4 = new df();
        var4.field_w = (long)param1;
        var4.field_H = param2;
        var4.field_G = param0;
        var4.field_B = false;
        this.a((byte) -109, var4);
        return var4;
    }

    cb(pn param0) {
        ((cb) this).field_i = new ra();
        ((cb) this).field_b = false;
        ((cb) this).field_f = 0;
        wj var2 = param0.a(2, 5, (Runnable) this);
        while (var2.field_a == 0) {
            a.a((byte) 121, 10L);
        }
        if ((var2.field_a ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((cb) this).field_k = (Thread) var2.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Don't mind";
        field_l = 0;
        field_h = new int[][]{null, null, null};
        field_a = "DEFAULT SET";
        field_g = "Accept";
        field_d = "Remove friend";
    }
}
