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
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3 = (Object) (Object) ((cb) this).field_i;
            synchronized (var3) {
              L1: {
                L2: {
                  ((cb) this).field_i.a((byte) 47, (kd) (Object) param1);
                  if (param0 < -52) {
                    break L2;
                  } else {
                    field_g = null;
                    break L2;
                  }
                }
                ((cb) this).field_f = ((cb) this).field_f + 1;
                ((Object) (Object) ((cb) this).field_i).notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final df a(int param0, int param1, rc param2) {
        df var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        df var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        df stackIn_9_0 = null;
        Object stackIn_17_0 = null;
        df stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        df stackOut_8_0 = null;
        df stackOut_18_0 = null;
        Object stackOut_16_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var4 = new df();
            var4.field_H = 1;
            var5 = (Object) (Object) ((cb) this).field_i;
            synchronized (var5) {
              L1: {
                var6 = (df) (Object) ((cb) this).field_i.b(22);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (~var6.field_w != ~(long)param1) {
                        break L3;
                      } else {
                        if (var6.field_G != param2) {
                          break L3;
                        } else {
                          if (var6.field_H == 2) {
                            var4.field_z = false;
                            var4.field_L = var6.field_L;
                            stackOut_8_0 = (df) var4;
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6 = (df) (Object) ((cb) this).field_i.a(false);
                    continue L2;
                  }
                }
              }
            }
            var4.field_L = param2.b(param1, false);
            if (param0 == 21598) {
              var4.field_B = true;
              var4.field_z = false;
              stackOut_18_0 = (df) var4;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              stackOut_16_0 = null;
              stackIn_17_0 = stackOut_16_0;
              return (df) (Object) stackIn_17_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4_ref;
            stackOut_20_1 = new StringBuilder().append("cb.A(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((cb) this).field_b = true;
        var2 = (Object) (Object) ((cb) this).field_i;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((cb) this).field_i).notifyAll();
            break L0;
          }
        }
        L1: {
          if (param0 == 0) {
            break L1;
          } else {
            field_j = null;
            break L1;
          }
        }
        try {
          L2: {
            ((cb) this).field_k.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((cb) this).field_k = null;
    }

    final static void a(hk param0, byte param1, int param2, boolean param3) {
        int var4_int = 0;
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
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        qh var28 = null;
        qh var29 = null;
        qh[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        qh stackIn_29_0 = null;
        qh stackIn_30_0 = null;
        qh stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        qh stackIn_36_0 = null;
        qh stackIn_37_0 = null;
        qh stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        qh stackIn_79_0 = null;
        qh stackIn_80_0 = null;
        qh stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        qh stackIn_86_0 = null;
        boolean stackIn_86_1 = false;
        qh stackIn_87_0 = null;
        boolean stackIn_87_1 = false;
        qh stackIn_88_0 = null;
        boolean stackIn_88_1 = false;
        int stackIn_88_2 = 0;
        qh stackIn_90_0 = null;
        qh stackIn_91_0 = null;
        qh stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        qh stackIn_94_0 = null;
        qh stackIn_95_0 = null;
        qh stackIn_96_0 = null;
        qh stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_101_0 = 0;
        qh stackIn_115_0 = null;
        qh stackIn_116_0 = null;
        qh stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        qh stackIn_119_0 = null;
        qh stackIn_120_0 = null;
        qh stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        qh stackIn_123_0 = null;
        qh stackIn_124_0 = null;
        qh stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        String stackIn_139_0 = null;
        qh stackIn_142_0 = null;
        qh stackIn_143_0 = null;
        qh stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        qh stackIn_145_0 = null;
        qh stackIn_146_0 = null;
        qh stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_209_0 = 0;
        qh stackIn_304_0 = null;
        qh stackIn_305_0 = null;
        qh stackIn_306_0 = null;
        qh stackIn_307_0 = null;
        int stackIn_307_1 = 0;
        qh stackIn_312_0 = null;
        boolean stackIn_312_1 = false;
        qh stackIn_313_0 = null;
        boolean stackIn_313_1 = false;
        qh stackIn_314_0 = null;
        boolean stackIn_314_1 = false;
        int stackIn_314_2 = 0;
        qh stackIn_316_0 = null;
        qh stackIn_317_0 = null;
        qh stackIn_318_0 = null;
        int stackIn_318_1 = 0;
        qh stackIn_320_0 = null;
        qh stackIn_321_0 = null;
        qh stackIn_322_0 = null;
        qh stackIn_323_0 = null;
        int stackIn_323_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        qh stackOut_28_0 = null;
        qh stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        qh stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        qh stackOut_35_0 = null;
        qh stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        qh stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        qh stackOut_89_0 = null;
        qh stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        qh stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        qh stackOut_85_0 = null;
        boolean stackOut_85_1 = false;
        qh stackOut_87_0 = null;
        boolean stackOut_87_1 = false;
        int stackOut_87_2 = 0;
        qh stackOut_86_0 = null;
        boolean stackOut_86_1 = false;
        int stackOut_86_2 = 0;
        qh stackOut_78_0 = null;
        qh stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        qh stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        qh stackOut_93_0 = null;
        qh stackOut_94_0 = null;
        qh stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        qh stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        String stackOut_138_0 = null;
        Object stackOut_137_0 = null;
        qh stackOut_141_0 = null;
        qh stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        qh stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        qh stackOut_144_0 = null;
        qh stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        qh stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_207_0 = 0;
        qh stackOut_315_0 = null;
        qh stackOut_317_0 = null;
        int stackOut_317_1 = 0;
        qh stackOut_316_0 = null;
        int stackOut_316_1 = 0;
        qh stackOut_311_0 = null;
        boolean stackOut_311_1 = false;
        qh stackOut_313_0 = null;
        boolean stackOut_313_1 = false;
        int stackOut_313_2 = 0;
        qh stackOut_312_0 = null;
        boolean stackOut_312_1 = false;
        int stackOut_312_2 = 0;
        qh stackOut_303_0 = null;
        qh stackOut_304_0 = null;
        qh stackOut_305_0 = null;
        int stackOut_305_1 = 0;
        qh stackOut_306_0 = null;
        int stackOut_306_1 = 0;
        qh stackOut_319_0 = null;
        qh stackOut_320_0 = null;
        qh stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        qh stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        qh stackOut_118_0 = null;
        qh stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        qh stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        qh stackOut_114_0 = null;
        qh stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        qh stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        qh stackOut_122_0 = null;
        qh stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        qh stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        L0: {
          var26 = SteelSentinels.field_G;
          if (param3) {
            L1: {
              if (ad.field_f) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            var4_int = stackIn_9_0;
            break L0;
          } else {
            L2: {
              L3: {
                if (!kk.a(-28548)) {
                  break L3;
                } else {
                  if (param0.field_rc) {
                    break L3;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L2;
            }
            var4_int = stackIn_5_0;
            break L0;
          }
        }
        L4: {
          L5: {
            L6: {
              var5 = 0;
              if (!param3) {
                var6 = 0;
                L7: while (true) {
                  if (5 <= var6) {
                    L8: {
                      if (un.field_h[0][2].field_K) {
                        if (kk.a(-28548)) {
                          ll.field_i = da.field_c;
                          break L8;
                        } else {
                          ll.field_i = db.a(fk.field_a, -75, new String[1]);
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    if (jg.field_l.length >= 2) {
                      L9: {
                        L10: {
                          if (!param3) {
                            break L10;
                          } else {
                            if (-1 == qm.field_h) {
                              break L10;
                            } else {
                              stackOut_48_0 = 1;
                              stackIn_50_0 = stackOut_48_0;
                              break L9;
                            }
                          }
                        }
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        break L9;
                      }
                      var6 = stackIn_50_0;
                      if (var6 == 0) {
                        break L5;
                      } else {
                        var7 = qm.field_h;
                        var8_int = 0;
                        L11: while (true) {
                          if (var8_int >= rb.field_i.length) {
                            break L6;
                          } else {
                            rb.field_i[var8_int] = (byte) 0;
                            var8_int++;
                            continue L11;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L12: {
                      if (var4_int == 0) {
                        break L12;
                      } else {
                        if (un.field_h[0][var6 - -1].field_Eb == 0) {
                          break L12;
                        } else {
                          if (~var6 != ~param0.field_Nc) {
                            param0.field_Nc = var6;
                            var5 = 1;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      stackOut_28_0 = un.field_h[0][var6 - -1];
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (var4_int == 0) {
                        stackOut_30_0 = (qh) (Object) stackIn_30_0;
                        stackOut_30_1 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        break L13;
                      } else {
                        stackOut_29_0 = (qh) (Object) stackIn_29_0;
                        stackOut_29_1 = 1;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        break L13;
                      }
                    }
                    L14: {
                      stackIn_31_0.field_T = stackIn_31_1 != 0;
                      if (rm.field_p) {
                        break L14;
                      } else {
                        if (var6 == 3) {
                          un.field_h[0][var6 - -1].field_T = false;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      stackOut_35_0 = un.field_h[0][var6 + 1];
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (~var6 != ~param0.field_Nc) {
                        stackOut_37_0 = (qh) (Object) stackIn_37_0;
                        stackOut_37_1 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L15;
                      } else {
                        stackOut_36_0 = (qh) (Object) stackIn_36_0;
                        stackOut_36_1 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        break L15;
                      }
                    }
                    stackIn_38_0.field_G = stackIn_38_1 != 0;
                    var6++;
                    continue L7;
                  }
                }
              } else {
                if (jg.field_l.length >= 2) {
                  L16: {
                    L17: {
                      if (!param3) {
                        break L17;
                      } else {
                        if (-1 == qm.field_h) {
                          break L17;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L16;
                        }
                      }
                    }
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L16;
                  }
                  var6 = stackIn_17_0;
                  if (var6 == 0) {
                    break L5;
                  } else {
                    var7 = qm.field_h;
                    var8_int = 0;
                    L18: while (true) {
                      if (var8_int >= rb.field_i.length) {
                        break L6;
                      } else {
                        rb.field_i[var8_int] = (byte) 0;
                        var8_int++;
                        continue L18;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            rb.field_i[var7 / 8] = (byte)vn.a((int) rb.field_i[var7 / 8], 1 << var7 % 8);
            break L5;
          }
          L19: {
            if (!param3) {
              stackOut_57_0 = 0;
              stackIn_58_0 = stackOut_57_0;
              break L19;
            } else {
              stackOut_56_0 = -1;
              stackIn_58_0 = stackOut_56_0;
              break L19;
            }
          }
          var7 = stackIn_58_0;
          L20: while (true) {
            if (~jg.field_l.length >= ~var7) {
              break L4;
            } else {
              L21: {
                L22: {
                  if (var6 == 0) {
                    break L22;
                  } else {
                    if (var7 == qm.field_h) {
                      break L22;
                    } else {
                      stackOut_62_0 = 1;
                      stackIn_64_0 = stackOut_62_0;
                      break L21;
                    }
                  }
                }
                stackOut_63_0 = 0;
                stackIn_64_0 = stackOut_63_0;
                break L21;
              }
              L23: {
                var8_int = stackIn_64_0;
                if (var4_int == 0) {
                  break L23;
                } else {
                  if (un.field_h[1][var7 - -1].field_Eb != 0) {
                    if (!param3) {
                      var9 = jg.field_l[var7];
                      if (var9 == param0.field_Ub) {
                        break L23;
                      } else {
                        param0.field_Ub = var9;
                        var5 = 1;
                        break L23;
                      }
                    } else {
                      if (var6 == 0) {
                        if (var7 != -1) {
                          rb.field_i[var7 / 8] = (byte)bi.a((int) rb.field_i[var7 / 8], 1 << ec.a(7, var7));
                          break L23;
                        } else {
                          var9 = 0;
                          L24: while (true) {
                            if (~rb.field_i.length >= ~var9) {
                              break L23;
                            } else {
                              rb.field_i[var9] = (byte) 0;
                              var9++;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        break L23;
                      }
                    }
                  } else {
                    break L23;
                  }
                }
              }
              L25: {
                if (param3) {
                  if (var7 != -1) {
                    L26: {
                      stackOut_89_0 = un.field_h[1][var7 + 1];
                      stackIn_91_0 = stackOut_89_0;
                      stackIn_90_0 = stackOut_89_0;
                      if ((rb.field_i[var7 / 8] & 1 << (var7 & 7)) == 0) {
                        stackOut_91_0 = (qh) (Object) stackIn_91_0;
                        stackOut_91_1 = 0;
                        stackIn_92_0 = stackOut_91_0;
                        stackIn_92_1 = stackOut_91_1;
                        break L26;
                      } else {
                        stackOut_90_0 = (qh) (Object) stackIn_90_0;
                        stackOut_90_1 = 1;
                        stackIn_92_0 = stackOut_90_0;
                        stackIn_92_1 = stackOut_90_1;
                        break L26;
                      }
                    }
                    stackIn_92_0.field_G = stackIn_92_1 != 0;
                    break L25;
                  } else {
                    un.field_h[1][1 + var7].field_G = true;
                    var9 = 0;
                    L27: while (true) {
                      if (~jg.field_l.length >= ~var9) {
                        break L25;
                      } else {
                        L28: {
                          stackOut_85_0 = un.field_h[1][var7 + 1];
                          stackOut_85_1 = un.field_h[1][var7 + 1].field_G;
                          stackIn_87_0 = stackOut_85_0;
                          stackIn_87_1 = stackOut_85_1;
                          stackIn_86_0 = stackOut_85_0;
                          stackIn_86_1 = stackOut_85_1;
                          if ((rb.field_i[var9 / 8] & 1 << (var9 & 7)) != 0) {
                            stackOut_87_0 = (qh) (Object) stackIn_87_0;
                            stackOut_87_1 = stackIn_87_1;
                            stackOut_87_2 = 0;
                            stackIn_88_0 = stackOut_87_0;
                            stackIn_88_1 = stackOut_87_1;
                            stackIn_88_2 = stackOut_87_2;
                            break L28;
                          } else {
                            stackOut_86_0 = (qh) (Object) stackIn_86_0;
                            stackOut_86_1 = stackIn_86_1;
                            stackOut_86_2 = 1;
                            stackIn_88_0 = stackOut_86_0;
                            stackIn_88_1 = stackOut_86_1;
                            stackIn_88_2 = stackOut_86_2;
                            break L28;
                          }
                        }
                        stackIn_88_0.field_G = stackIn_88_1 & stackIn_88_2 != 0;
                        var9++;
                        continue L27;
                      }
                    }
                  }
                } else {
                  L29: {
                    var9 = jg.field_l[var7];
                    stackOut_78_0 = un.field_h[1][1 + var7];
                    stackIn_80_0 = stackOut_78_0;
                    stackIn_79_0 = stackOut_78_0;
                    if (~var9 != ~param0.field_Ub) {
                      stackOut_80_0 = (qh) (Object) stackIn_80_0;
                      stackOut_80_1 = 0;
                      stackIn_81_0 = stackOut_80_0;
                      stackIn_81_1 = stackOut_80_1;
                      break L29;
                    } else {
                      stackOut_79_0 = (qh) (Object) stackIn_79_0;
                      stackOut_79_1 = 1;
                      stackIn_81_0 = stackOut_79_0;
                      stackIn_81_1 = stackOut_79_1;
                      break L29;
                    }
                  }
                  stackIn_81_0.field_G = stackIn_81_1 != 0;
                  break L25;
                }
              }
              L30: {
                L31: {
                  stackOut_93_0 = un.field_h[1][var7 - -1];
                  stackIn_96_0 = stackOut_93_0;
                  stackIn_94_0 = stackOut_93_0;
                  if (var4_int == 0) {
                    break L31;
                  } else {
                    stackOut_94_0 = (qh) (Object) stackIn_94_0;
                    stackIn_96_0 = stackOut_94_0;
                    stackIn_95_0 = stackOut_94_0;
                    if (var8_int != 0) {
                      break L31;
                    } else {
                      stackOut_95_0 = (qh) (Object) stackIn_95_0;
                      stackOut_95_1 = 1;
                      stackIn_97_0 = stackOut_95_0;
                      stackIn_97_1 = stackOut_95_1;
                      break L30;
                    }
                  }
                }
                stackOut_96_0 = (qh) (Object) stackIn_96_0;
                stackOut_96_1 = 0;
                stackIn_97_0 = stackOut_96_0;
                stackIn_97_1 = stackOut_96_1;
                break L30;
              }
              stackIn_97_0.field_T = stackIn_97_1 != 0;
              var7++;
              continue L20;
            }
          }
        }
        L32: {
          if (param3) {
            stackOut_100_0 = 0;
            stackIn_101_0 = stackOut_100_0;
            break L32;
          } else {
            stackOut_99_0 = 1;
            stackIn_101_0 = stackOut_99_0;
            break L32;
          }
        }
        var6 = stackIn_101_0;
        L33: while (true) {
          if (var6 >= 3) {
            L34: {
              if (!param3) {
                break L34;
              } else {
                if (1 >= tc.field_z) {
                  break L34;
                } else {
                  var6 = 0;
                  L35: while (true) {
                    if (~(tc.field_z - -1) >= ~var6) {
                      break L34;
                    } else {
                      L36: {
                        var29 = un.field_h[3][var6];
                        if (var4_int == 0) {
                          break L36;
                        } else {
                          if (0 == var29.field_Eb) {
                            break L36;
                          } else {
                            fi.field_l = var6;
                            break L36;
                          }
                        }
                      }
                      L37: {
                        if (!var29.field_K) {
                          break L37;
                        } else {
                          if (var6 > 0) {
                            L38: {
                              if (e.field_g != null) {
                                stackOut_138_0 = e.field_g[-1 + var6];
                                stackIn_139_0 = stackOut_138_0;
                                break L38;
                              } else {
                                stackOut_137_0 = null;
                                stackIn_139_0 = (String) (Object) stackOut_137_0;
                                break L38;
                              }
                            }
                            var8_ref = stackIn_139_0;
                            if (var8_ref == null) {
                              break L37;
                            } else {
                              ll.field_i = var8_ref;
                              break L37;
                            }
                          } else {
                            break L37;
                          }
                        }
                      }
                      L39: {
                        stackOut_141_0 = (qh) var29;
                        stackIn_143_0 = stackOut_141_0;
                        stackIn_142_0 = stackOut_141_0;
                        if (~fi.field_l != ~var6) {
                          stackOut_143_0 = (qh) (Object) stackIn_143_0;
                          stackOut_143_1 = 0;
                          stackIn_144_0 = stackOut_143_0;
                          stackIn_144_1 = stackOut_143_1;
                          break L39;
                        } else {
                          stackOut_142_0 = (qh) (Object) stackIn_142_0;
                          stackOut_142_1 = 1;
                          stackIn_144_0 = stackOut_142_0;
                          stackIn_144_1 = stackOut_142_1;
                          break L39;
                        }
                      }
                      L40: {
                        stackIn_144_0.field_G = stackIn_144_1 != 0;
                        stackOut_144_0 = (qh) var29;
                        stackIn_146_0 = stackOut_144_0;
                        stackIn_145_0 = stackOut_144_0;
                        if (var4_int == 0) {
                          stackOut_146_0 = (qh) (Object) stackIn_146_0;
                          stackOut_146_1 = 0;
                          stackIn_147_0 = stackOut_146_0;
                          stackIn_147_1 = stackOut_146_1;
                          break L40;
                        } else {
                          stackOut_145_0 = (qh) (Object) stackIn_145_0;
                          stackOut_145_1 = 1;
                          stackIn_147_0 = stackOut_145_0;
                          stackIn_147_1 = stackOut_145_1;
                          break L40;
                        }
                      }
                      stackIn_147_0.field_T = stackIn_147_1 != 0;
                      var6++;
                      continue L35;
                    }
                  }
                }
              }
            }
            if (param1 <= -114) {
              var6 = 0;
              var7 = 0;
              L41: while (true) {
                if (var7 >= be.field_a) {
                  L42: {
                    L43: {
                      if (var5 == 0) {
                        break L43;
                      } else {
                        if (!param3) {
                          ad.a(0, param2);
                          break L43;
                        } else {
                          break L42;
                        }
                      }
                    }
                    break L42;
                  }
                  return;
                } else {
                  L44: {
                    var30 = un.field_h[4 - -var7];
                    var8 = var30;
                    if (param3) {
                      stackOut_154_0 = -1;
                      stackIn_155_0 = stackOut_154_0;
                      break L44;
                    } else {
                      stackOut_153_0 = 0;
                      stackIn_155_0 = stackOut_153_0;
                      break L44;
                    }
                  }
                  var9 = stackIn_155_0;
                  L45: while (true) {
                    if (~(var30.length - 1) >= ~var9) {
                      var6 = var6 + (255 & wb.field_j[var7]);
                      var7++;
                      continue L41;
                    } else {
                      L46: {
                        var10 = 0;
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        if (var4_int == 0) {
                          break L46;
                        } else {
                          if (0 > var9) {
                            break L46;
                          } else {
                            L47: {
                              if (fc.field_b == null) {
                                break L47;
                              } else {
                                if (null != fc.field_b[var7]) {
                                  if ((~jj.field_i & fc.field_b[var7][var9]) > 0) {
                                    var14 = 1;
                                    var15 = ok.a(~jj.field_i & fc.field_b[var7][var9], (byte) 51);
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                } else {
                                  break L47;
                                }
                              }
                            }
                            L48: {
                              if (null == ad.field_d) {
                                break L48;
                              } else {
                                if (ad.field_d[var7] == null) {
                                  break L48;
                                } else {
                                  if (rd.field_b > 0) {
                                    break L48;
                                  } else {
                                    if (!ad.field_d[var7][var9]) {
                                      break L48;
                                    } else {
                                      var10 = 1;
                                      break L48;
                                    }
                                  }
                                }
                              }
                            }
                            L49: {
                              if (null == ja.field_b) {
                                break L49;
                              } else {
                                if (null != ja.field_b[var7]) {
                                  L50: {
                                    var16 = ja.field_b[var7][var9];
                                    if (0 >= var16) {
                                      break L50;
                                    } else {
                                      if (~ba.field_b > ~var16) {
                                        var12 = 1;
                                        break L50;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  if (var16 == 0) {
                                    break L49;
                                  } else {
                                    if (vg.field_a) {
                                      break L49;
                                    } else {
                                      if (rd.field_b > 0) {
                                        break L49;
                                      } else {
                                        var10 = 1;
                                        break L49;
                                      }
                                    }
                                  }
                                } else {
                                  break L49;
                                }
                              }
                            }
                            L51: {
                              L52: {
                                if (!param3) {
                                  break L52;
                                } else {
                                  if (gl.field_x == null) {
                                    break L52;
                                  } else {
                                    if (null == gl.field_x[var7]) {
                                      break L52;
                                    } else {
                                      if (!gl.field_x[var7][var9]) {
                                        break L52;
                                      } else {
                                        stackOut_185_0 = 1;
                                        stackIn_187_0 = stackOut_185_0;
                                        break L51;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_186_0 = 0;
                              stackIn_187_0 = stackOut_186_0;
                              break L51;
                            }
                            var13 = stackIn_187_0;
                            if (null == ol.field_cc) {
                              break L46;
                            } else {
                              if (null == ol.field_cc[var7]) {
                                break L46;
                              } else {
                                L53: {
                                  var16 = ol.field_cc[var7][var9];
                                  if (var16 == 0) {
                                    break L53;
                                  } else {
                                    if (vg.field_a) {
                                      break L53;
                                    } else {
                                      if (rd.field_b <= 0) {
                                        var10 = 1;
                                        break L53;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                }
                                if (var16 <= 0) {
                                  break L46;
                                } else {
                                  if (ud.field_D < var16) {
                                    var11 = 1;
                                    break L46;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L54: {
                        if (ul.field_d < 2) {
                          break L54;
                        } else {
                          if (!fc.field_e[12]) {
                            break L54;
                          } else {
                            var11 = 0;
                            var14 = 0;
                            var10 = 0;
                            var13 = 0;
                            var12 = 0;
                            break L54;
                          }
                        }
                      }
                      L55: {
                        L56: {
                          if (var10 != 0) {
                            break L56;
                          } else {
                            if (var11 != 0) {
                              break L56;
                            } else {
                              if (var12 != 0) {
                                break L56;
                              } else {
                                if (var13 != 0) {
                                  break L56;
                                } else {
                                  if (var14 == 0) {
                                    stackOut_208_0 = 0;
                                    stackIn_209_0 = stackOut_208_0;
                                    break L55;
                                  } else {
                                    break L56;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_207_0 = 1;
                        stackIn_209_0 = stackOut_207_0;
                        break L55;
                      }
                      L57: {
                        var16 = stackIn_209_0;
                        ng.field_k = true;
                        if (var16 != 0) {
                          break L57;
                        } else {
                          if (var9 < 0) {
                            break L57;
                          } else {
                            if (null == m.field_b) {
                              break L57;
                            } else {
                              L58: {
                                if (!param3) {
                                  break L58;
                                } else {
                                  if (!ad.field_f) {
                                    break L58;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                              L59: {
                                gi.field_u = false;
                                ng.field_k = false;
                                if (null != dl.field_O) {
                                  break L59;
                                } else {
                                  m.field_h = new boolean[be.field_a];
                                  dl.field_O = new byte[be.field_a];
                                  break L59;
                                }
                              }
                              var17_int = 0;
                              L60: while (true) {
                                if (var17_int >= var7) {
                                  L61: {
                                    lc.a(var9, -1, param0, var7, -1, -89, 0, param3);
                                    if (ul.field_d < 2) {
                                      break L61;
                                    } else {
                                      if (fc.field_e[12]) {
                                        ng.field_k = true;
                                        break L61;
                                      } else {
                                        break L61;
                                      }
                                    }
                                  }
                                  if (ng.field_k) {
                                    break L57;
                                  } else {
                                    var16 = 1;
                                    break L57;
                                  }
                                } else {
                                  m.field_h[var17_int] = false;
                                  var17_int++;
                                  continue L60;
                                }
                              }
                            }
                          }
                        }
                      }
                      L62: {
                        var17 = var8[var9 - -1];
                        if (var4_int == 0) {
                          break L62;
                        } else {
                          if (var17.field_Eb != 0) {
                            if (!param3) {
                              if (var16 != 0) {
                                break L62;
                              } else {
                                if (~(byte)var9 == ~param0.field_Sb[var7]) {
                                  break L62;
                                } else {
                                  var5 = 1;
                                  param0.field_Sb[var7] = (byte)var9;
                                  break L62;
                                }
                              }
                            } else {
                              if (var9 == -1) {
                                var18 = var6;
                                L63: while (true) {
                                  if (~var18 <= ~(var6 + var30.length + -1)) {
                                    break L62;
                                  } else {
                                    ti.field_s[var18 / 8] = (byte)ec.a((int) ti.field_s[var18 / 8], ~(1 << ec.a(var18, 7)));
                                    var18++;
                                    continue L63;
                                  }
                                }
                              } else {
                                ti.field_s[(var9 - -var6) / 8] = (byte)bi.a((int) ti.field_s[(var9 + var6) / 8], 1 << ec.a(7, var9 + var6));
                                break L62;
                              }
                            }
                          } else {
                            break L62;
                          }
                        }
                      }
                      L64: {
                        if (!param3) {
                          break L64;
                        } else {
                          if (var16 != 0) {
                            ti.field_s[(var9 - -var6) / 8] = (byte)ec.a((int) ti.field_s[(var9 + var6) / 8], ~(1 << ec.a(var6 + var9, 7)));
                            break L64;
                          } else {
                            break L64;
                          }
                        }
                      }
                      L65: {
                        if (var9 < 0) {
                          break L65;
                        } else {
                          if (!var17.field_K) {
                            break L65;
                          } else {
                            L66: {
                              if (bl.field_h == null) {
                                var18_ref = null;
                                break L66;
                              } else {
                                if (null == bl.field_h[var7]) {
                                  var18_ref = null;
                                  break L66;
                                } else {
                                  var18_ref = (Object) (Object) bl.field_h[var7][var9];
                                  break L66;
                                }
                              }
                            }
                            L67: {
                              if (fj.field_b == null) {
                                var19 = null;
                                break L67;
                              } else {
                                if (null != fj.field_b[var7]) {
                                  var19 = (Object) (Object) fj.field_b[var7][var9];
                                  break L67;
                                } else {
                                  var19 = null;
                                  break L67;
                                }
                              }
                            }
                            L68: {
                              var20 = null;
                              if (var19 == null) {
                                break L68;
                              } else {
                                if (!((String) var19).equals(var18_ref)) {
                                  var20 = var19;
                                  break L68;
                                } else {
                                  break L68;
                                }
                              }
                            }
                            L69: {
                              var21 = null;
                              if (var13 != 0) {
                                var21 = (Object) (Object) vi.field_X;
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
                                break L69;
                              } else {
                                if (var10 != 0) {
                                  var21 = (Object) (Object) in.field_c;
                                  break L69;
                                } else {
                                  L70: {
                                    if (var11 == 0) {
                                      break L70;
                                    } else {
                                      var22_int = ol.field_cc[var7][var9] - ud.field_D;
                                      if (var22_int != 1) {
                                        var21 = (Object) (Object) db.a(hd.field_d, -34, new String[1]);
                                        break L70;
                                      } else {
                                        var21 = (Object) (Object) wb.field_e;
                                        break L70;
                                      }
                                    }
                                  }
                                  L71: {
                                    if (var12 != 0) {
                                      var31 = db.a(bj.field_c, -74, new String[2]);
                                      var22_ref = var31;
                                      var25_ref = var22_ref;
                                      var22_ref = var25_ref;
                                      var21 = (Object) (Object) var22_ref;
                                      var25_ref = var31;
                                      var22_ref = var25_ref;
                                      if (var21 == null) {
                                        var21 = (Object) (Object) var31;
                                        break L71;
                                      } else {
                                        var21 = (Object) (Object) ((String) var21 + "<br>" + var31);
                                        break L71;
                                      }
                                    } else {
                                      break L71;
                                    }
                                  }
                                  if (var14 == 0) {
                                    break L69;
                                  } else {
                                    L72: {
                                      var22_ref = si.field_u;
                                      if (var15 <= 0) {
                                        break L72;
                                      } else {
                                        if (null == in.field_b) {
                                          break L72;
                                        } else {
                                          if (in.field_b.length < var15) {
                                            break L72;
                                          } else {
                                            if (in.field_b[var15 - 1] == null) {
                                              break L72;
                                            } else {
                                              var22_ref = in.field_b[-1 + var15][0];
                                              break L72;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var21 != null) {
                                      var21 = (Object) (Object) ((String) var21 + "<br>" + var22_ref);
                                      break L69;
                                    } else {
                                      var21 = (Object) (Object) var22_ref;
                                      break L69;
                                    }
                                  }
                                }
                              }
                            }
                            L73: {
                              if (var4_int == 0) {
                                break L73;
                              } else {
                                if (ng.field_k) {
                                  break L73;
                                } else {
                                  L74: {
                                    var22_ref = null;
                                    if (!gi.field_u) {
                                      break L74;
                                    } else {
                                      var22_ref = "</col>" + rb.field_d + "<col=A00000>";
                                      var25_ref = var22_ref;
                                      var22_ref = var25_ref;
                                      var25_ref = var22_ref;
                                      var22_ref = var25_ref;
                                      var21 = (Object) (Object) var22_ref;
                                      break L74;
                                    }
                                  }
                                  var23 = 0;
                                  var24 = 0;
                                  L75: while (true) {
                                    if (~var7 >= ~var24) {
                                      if (var23 != 0) {
                                        var21 = (Object) (Object) (mb.field_Ob + var22_ref);
                                        break L73;
                                      } else {
                                        var21 = (Object) (Object) db.a(be.field_g, -84, new String[1]);
                                        break L73;
                                      }
                                    } else {
                                      L76: {
                                        if (!m.field_h[var24]) {
                                          break L76;
                                        } else {
                                          var25_ref = "</col>" + al.field_a[var24] + "<col=A00000>";
                                          var22_ref = var25_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          var22_ref = var25_ref;
                                          if (var22_ref != null) {
                                            var23 = 1;
                                            var22_ref = var22_ref + ", " + var25_ref;
                                            var21 = (Object) (Object) var22_ref;
                                            var21 = (Object) (Object) var22_ref;
                                            break L76;
                                          } else {
                                            var22_ref = var25_ref;
                                            break L76;
                                          }
                                        }
                                      }
                                      var24++;
                                      continue L75;
                                    }
                                  }
                                }
                              }
                            }
                            L77: {
                              if (var21 != null) {
                                var32 = "<col=A00000>" + (String) var21;
                                var33 = ln.a("<br>", (byte) 11, "<br><col=A00000>", var32);
                                if (var20 == null) {
                                  var20 = (Object) (Object) var33;
                                  break L77;
                                } else {
                                  var20 = (Object) (Object) ((String) var20 + "<br>" + var33);
                                  break L77;
                                }
                              } else {
                                break L77;
                              }
                            }
                            if (var20 != null) {
                              ll.field_i = (String) var20;
                              break L65;
                            } else {
                              break L65;
                            }
                          }
                        }
                      }
                      L78: {
                        if (param3) {
                          if (var9 != -1) {
                            L79: {
                              stackOut_315_0 = (qh) var17;
                              stackIn_317_0 = stackOut_315_0;
                              stackIn_316_0 = stackOut_315_0;
                              if ((ti.field_s[(var9 + var6) / 8] & 1 << (var6 + var9 & 7)) == 0) {
                                stackOut_317_0 = (qh) (Object) stackIn_317_0;
                                stackOut_317_1 = 0;
                                stackIn_318_0 = stackOut_317_0;
                                stackIn_318_1 = stackOut_317_1;
                                break L79;
                              } else {
                                stackOut_316_0 = (qh) (Object) stackIn_316_0;
                                stackOut_316_1 = 1;
                                stackIn_318_0 = stackOut_316_0;
                                stackIn_318_1 = stackOut_316_1;
                                break L79;
                              }
                            }
                            stackIn_318_0.field_G = stackIn_318_1 != 0;
                            break L78;
                          } else {
                            var17.field_G = true;
                            var27 = var6;
                            var18 = var27;
                            L80: while (true) {
                              if (~(-1 + (var6 + var30.length)) >= ~var27) {
                                break L78;
                              } else {
                                L81: {
                                  stackOut_311_0 = (qh) var17;
                                  stackOut_311_1 = var17.field_G;
                                  stackIn_313_0 = stackOut_311_0;
                                  stackIn_313_1 = stackOut_311_1;
                                  stackIn_312_0 = stackOut_311_0;
                                  stackIn_312_1 = stackOut_311_1;
                                  if ((ti.field_s[var27 / 8] & 1 << (var27 & 7)) != 0) {
                                    stackOut_313_0 = (qh) (Object) stackIn_313_0;
                                    stackOut_313_1 = stackIn_313_1;
                                    stackOut_313_2 = 0;
                                    stackIn_314_0 = stackOut_313_0;
                                    stackIn_314_1 = stackOut_313_1;
                                    stackIn_314_2 = stackOut_313_2;
                                    break L81;
                                  } else {
                                    stackOut_312_0 = (qh) (Object) stackIn_312_0;
                                    stackOut_312_1 = stackIn_312_1;
                                    stackOut_312_2 = 1;
                                    stackIn_314_0 = stackOut_312_0;
                                    stackIn_314_1 = stackOut_312_1;
                                    stackIn_314_2 = stackOut_312_2;
                                    break L81;
                                  }
                                }
                                stackIn_314_0.field_G = stackIn_314_1 & stackIn_314_2 != 0;
                                var27++;
                                continue L80;
                              }
                            }
                          }
                        } else {
                          L82: {
                            L83: {
                              stackOut_303_0 = (qh) var17;
                              stackIn_306_0 = stackOut_303_0;
                              stackIn_304_0 = stackOut_303_0;
                              if (!ng.field_k) {
                                break L83;
                              } else {
                                stackOut_304_0 = (qh) (Object) stackIn_304_0;
                                stackIn_306_0 = stackOut_304_0;
                                stackIn_305_0 = stackOut_304_0;
                                if ((byte)var9 != param0.field_Sb[var7]) {
                                  break L83;
                                } else {
                                  stackOut_305_0 = (qh) (Object) stackIn_305_0;
                                  stackOut_305_1 = 1;
                                  stackIn_307_0 = stackOut_305_0;
                                  stackIn_307_1 = stackOut_305_1;
                                  break L82;
                                }
                              }
                            }
                            stackOut_306_0 = (qh) (Object) stackIn_306_0;
                            stackOut_306_1 = 0;
                            stackIn_307_0 = stackOut_306_0;
                            stackIn_307_1 = stackOut_306_1;
                            break L82;
                          }
                          stackIn_307_0.field_G = stackIn_307_1 != 0;
                          break L78;
                        }
                      }
                      L84: {
                        L85: {
                          stackOut_319_0 = (qh) var17;
                          stackIn_322_0 = stackOut_319_0;
                          stackIn_320_0 = stackOut_319_0;
                          if (var4_int == 0) {
                            break L85;
                          } else {
                            stackOut_320_0 = (qh) (Object) stackIn_320_0;
                            stackIn_322_0 = stackOut_320_0;
                            stackIn_321_0 = stackOut_320_0;
                            if (var16 != 0) {
                              break L85;
                            } else {
                              stackOut_321_0 = (qh) (Object) stackIn_321_0;
                              stackOut_321_1 = 1;
                              stackIn_323_0 = stackOut_321_0;
                              stackIn_323_1 = stackOut_321_1;
                              break L84;
                            }
                          }
                        }
                        stackOut_322_0 = (qh) (Object) stackIn_322_0;
                        stackOut_322_1 = 0;
                        stackIn_323_0 = stackOut_322_0;
                        stackIn_323_1 = stackOut_322_1;
                        break L84;
                      }
                      stackIn_323_0.field_T = stackIn_323_1 != 0;
                      var9++;
                      continue L45;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            L86: {
              var28 = un.field_h[2][var6];
              if (var4_int == 0) {
                break L86;
              } else {
                if (var28.field_Eb == 0) {
                  break L86;
                } else {
                  if (param3) {
                    if (var6 != 0) {
                      nb.field_L = nb.field_L ^ var6;
                      break L86;
                    } else {
                      nb.field_L = 0;
                      break L86;
                    }
                  } else {
                    if (var6 == param0.field_sc) {
                      break L86;
                    } else {
                      param0.field_sc = var6;
                      var5 = 1;
                      break L86;
                    }
                  }
                }
              }
            }
            L87: {
              if (!param3) {
                L88: {
                  stackOut_118_0 = (qh) var28;
                  stackIn_120_0 = stackOut_118_0;
                  stackIn_119_0 = stackOut_118_0;
                  if ((param0.field_sc & var6) == 0) {
                    stackOut_120_0 = (qh) (Object) stackIn_120_0;
                    stackOut_120_1 = 0;
                    stackIn_121_0 = stackOut_120_0;
                    stackIn_121_1 = stackOut_120_1;
                    break L88;
                  } else {
                    stackOut_119_0 = (qh) (Object) stackIn_119_0;
                    stackOut_119_1 = 1;
                    stackIn_121_0 = stackOut_119_0;
                    stackIn_121_1 = stackOut_119_1;
                    break L88;
                  }
                }
                stackIn_121_0.field_G = stackIn_121_1 != 0;
                break L87;
              } else {
                if (var6 != 0) {
                  L89: {
                    stackOut_114_0 = (qh) var28;
                    stackIn_116_0 = stackOut_114_0;
                    stackIn_115_0 = stackOut_114_0;
                    if ((var6 & nb.field_L) == 0) {
                      stackOut_116_0 = (qh) (Object) stackIn_116_0;
                      stackOut_116_1 = 0;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      break L89;
                    } else {
                      stackOut_115_0 = (qh) (Object) stackIn_115_0;
                      stackOut_115_1 = 1;
                      stackIn_117_0 = stackOut_115_0;
                      stackIn_117_1 = stackOut_115_1;
                      break L89;
                    }
                  }
                  stackIn_117_0.field_G = stackIn_117_1 != 0;
                  break L87;
                } else {
                  var28.field_G = true;
                  break L87;
                }
              }
            }
            L90: {
              stackOut_122_0 = (qh) var28;
              stackIn_124_0 = stackOut_122_0;
              stackIn_123_0 = stackOut_122_0;
              if (var4_int == 0) {
                stackOut_124_0 = (qh) (Object) stackIn_124_0;
                stackOut_124_1 = 0;
                stackIn_125_0 = stackOut_124_0;
                stackIn_125_1 = stackOut_124_1;
                break L90;
              } else {
                stackOut_123_0 = (qh) (Object) stackIn_123_0;
                stackOut_123_1 = 1;
                stackIn_125_0 = stackOut_123_0;
                stackIn_125_1 = stackOut_123_1;
                break L90;
              }
            }
            stackIn_125_0.field_T = stackIn_125_1 != 0;
            var6++;
            continue L33;
          }
        }
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            df var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = SteelSentinels.field_G;
            L0: while (true) {
              if (((cb) this).field_b) {
                return;
              } else {
                var2 = (Object) (Object) ((cb) this).field_i;
                synchronized (var2) {
                  L1: {
                    var7 = (df) (Object) ((cb) this).field_i.c(-104);
                    if (var7 != null) {
                      ((cb) this).field_f = ((cb) this).field_f - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((cb) this).field_i).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var7.field_H == 2) {
                          boolean discarded$1 = var7.field_G.a(79, var7.field_L.length, (int)var7.field_w, var7.field_L);
                          break L5;
                        } else {
                          if (var7.field_H == 3) {
                            var7.field_L = var7.field_G.b((int)var7.field_w, false);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      sj.a((String) null, -36, (Throwable) (Object) var2_ref);
                      break L6;
                    }
                  }
                  var7.field_z = false;
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final df a(byte param0, rc param1, int param2, byte[] param3) {
        df var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_2_0 = null;
        df stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        df stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5 = new df();
            if (param0 >= 33) {
              var5.field_B = false;
              var5.field_H = 2;
              var5.field_w = (long)param2;
              var5.field_G = param1;
              var5.field_L = param3;
              this.a((byte) -92, var5);
              stackOut_3_0 = (df) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (df) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("cb.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        field_h = null;
        field_a = null;
        field_e = null;
        field_j = null;
        field_c = null;
        field_g = null;
        field_d = null;
    }

    final df a(rc param0, int param1, int param2) {
        df var4 = null;
        RuntimeException var4_ref = null;
        df stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        df stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new df();
            var4.field_w = (long)param1;
            var4.field_H = param2;
            var4.field_G = param0;
            var4.field_B = false;
            this.a((byte) -109, var4);
            stackOut_0_0 = (df) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("cb.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    cb(pn param0) {
        wj var2 = null;
        ((cb) this).field_i = new ra();
        ((cb) this).field_b = false;
        ((cb) this).field_f = 0;
        try {
            var2 = param0.a(2, 5, (Runnable) this);
            while (var2.field_a == 0) {
                a.a((byte) 121, 10L);
            }
            if (var2.field_a == 2) {
                throw new RuntimeException();
            }
            ((cb) this).field_k = (Thread) var2.field_c;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "cb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
