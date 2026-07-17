/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class asb {
    boolean field_e;
    private Object[][] field_c;
    static String field_b;
    int field_h;
    private fnb field_d;
    private qp field_g;
    static int field_f;
    static llb field_a;
    private Object[] field_i;

    final synchronized byte[] c(byte param0, int param1) {
        if (!((asb) this).b((byte) -59)) {
            return null;
        }
        if (param0 != 9) {
            int discarded$0 = ((asb) this).a((String) null, 14);
        }
        if (((asb) this).field_g.field_m.length == 1) {
            return ((asb) this).a(0, param1, (byte) 13);
        }
        if (!this.b((byte) 125, param1)) {
            return null;
        }
        if (!(((asb) this).field_g.field_m[param1] != 1)) {
            return ((asb) this).a(param1, 0, (byte) 13);
        }
        throw new RuntimeException();
    }

    final int c(byte param0) {
        if (!((asb) this).b((byte) 88)) {
            return -1;
        }
        if (param0 < 37) {
            int discarded$0 = ((asb) this).a(86, -10);
        }
        return ((asb) this).field_g.field_m.length;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((asb) this).b((byte) 106)) {
              if (param1 == -2118) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((asb) this).field_g.field_a.a(param1 ^ 123456123, vla.a((byte) 120, var4));
                stackOut_6_0 = ((asb) this).a(var3_int, 1045);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("asb.S(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) -117)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 109, var4));
              if (!this.b((byte) -72, var3_int)) {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                L1: {
                  if (param1 <= -69) {
                    break L1;
                  } else {
                    boolean discarded$2 = ((asb) this).c(((int[]) ((asb) this).field_i[12])[7], ((int[]) ((Object[]) ((asb) this).field_i[2])[2])[7]);
                    break L1;
                  }
                }
                stackOut_9_0 = var3_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("asb.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b((byte) -121, param0)) {
            return 0;
        }
        if (((asb) this).field_i[param0] != null) {
            return 100;
        }
        if (param1 != 1045) {
            return -57;
        }
        return ((asb) this).field_d.a(param0, false);
    }

    final static void a(int param0, mm param1, boolean param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        cna var7_ref_cna = null;
        int var8_int = 0;
        cna[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        cna var17 = null;
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
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        cna stackIn_28_0 = null;
        cna stackIn_29_0 = null;
        cna stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        cna stackIn_35_0 = null;
        cna stackIn_36_0 = null;
        cna stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_63_0 = 0;
        cna stackIn_79_0 = null;
        cna stackIn_80_0 = null;
        cna stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        cna stackIn_86_0 = null;
        boolean stackIn_86_1 = false;
        cna stackIn_87_0 = null;
        boolean stackIn_87_1 = false;
        cna stackIn_88_0 = null;
        boolean stackIn_88_1 = false;
        int stackIn_88_2 = 0;
        cna stackIn_90_0 = null;
        cna stackIn_91_0 = null;
        cna stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        cna stackIn_94_0 = null;
        cna stackIn_95_0 = null;
        cna stackIn_96_0 = null;
        cna stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_101_0 = 0;
        cna stackIn_112_0 = null;
        cna stackIn_113_0 = null;
        cna stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        cna stackIn_117_0 = null;
        cna stackIn_118_0 = null;
        cna stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        cna stackIn_121_0 = null;
        cna stackIn_122_0 = null;
        cna stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        cna stackIn_125_0 = null;
        cna stackIn_126_0 = null;
        cna stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        String stackIn_143_0 = null;
        cna stackIn_147_0 = null;
        cna stackIn_148_0 = null;
        cna stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        cna stackIn_150_0 = null;
        cna stackIn_151_0 = null;
        cna stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_209_0 = 0;
        cna stackIn_303_0 = null;
        cna stackIn_304_0 = null;
        cna stackIn_305_0 = null;
        int stackIn_305_1 = 0;
        cna stackIn_309_0 = null;
        boolean stackIn_309_1 = false;
        cna stackIn_310_0 = null;
        boolean stackIn_310_1 = false;
        cna stackIn_311_0 = null;
        boolean stackIn_311_1 = false;
        int stackIn_311_2 = 0;
        cna stackIn_313_0 = null;
        cna stackIn_314_0 = null;
        cna stackIn_315_0 = null;
        cna stackIn_316_0 = null;
        int stackIn_316_1 = 0;
        cna stackIn_318_0 = null;
        cna stackIn_319_0 = null;
        cna stackIn_320_0 = null;
        cna stackIn_321_0 = null;
        int stackIn_321_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_48_0 = 0;
        cna stackOut_27_0 = null;
        cna stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        cna stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        cna stackOut_34_0 = null;
        cna stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        cna stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_62_0 = 0;
        cna stackOut_89_0 = null;
        cna stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        cna stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        cna stackOut_85_0 = null;
        boolean stackOut_85_1 = false;
        cna stackOut_87_0 = null;
        boolean stackOut_87_1 = false;
        int stackOut_87_2 = 0;
        cna stackOut_86_0 = null;
        boolean stackOut_86_1 = false;
        int stackOut_86_2 = 0;
        cna stackOut_78_0 = null;
        cna stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        cna stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        cna stackOut_93_0 = null;
        cna stackOut_94_0 = null;
        cna stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        cna stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        Object stackOut_142_0 = null;
        String stackOut_141_0 = null;
        cna stackOut_146_0 = null;
        cna stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        cna stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        cna stackOut_149_0 = null;
        cna stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        cna stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_207_0 = 0;
        cna stackOut_312_0 = null;
        cna stackOut_313_0 = null;
        cna stackOut_314_0 = null;
        int stackOut_314_1 = 0;
        cna stackOut_315_0 = null;
        int stackOut_315_1 = 0;
        cna stackOut_308_0 = null;
        boolean stackOut_308_1 = false;
        cna stackOut_310_0 = null;
        boolean stackOut_310_1 = false;
        int stackOut_310_2 = 0;
        cna stackOut_309_0 = null;
        boolean stackOut_309_1 = false;
        int stackOut_309_2 = 0;
        cna stackOut_302_0 = null;
        cna stackOut_304_0 = null;
        int stackOut_304_1 = 0;
        cna stackOut_303_0 = null;
        int stackOut_303_1 = 0;
        cna stackOut_317_0 = null;
        cna stackOut_318_0 = null;
        cna stackOut_319_0 = null;
        int stackOut_319_1 = 0;
        cna stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        cna stackOut_111_0 = null;
        cna stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        cna stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        cna stackOut_124_0 = null;
        cna stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        cna stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        cna stackOut_120_0 = null;
        cna stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        cna stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        cna stackOut_116_0 = null;
        cna stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        cna stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        L0: {
          var26 = VoidHunters.field_G;
          if (param2) {
            L1: {
              if (ii.field_h) {
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
                if (!nmb.b(param3 + 164)) {
                  break L3;
                } else {
                  if (param1.field_fc) {
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
              if (!param2) {
                var6 = 0;
                L7: while (true) {
                  if (var6 >= 5) {
                    L8: {
                      if (inb.field_q[0][2].field_Q) {
                        if (nmb.b(97)) {
                          lob.field_a = mla.field_r;
                          break L8;
                        } else {
                          lob.field_a = isa.a(oba.field_p, new String[1], 124);
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    if (ieb.field_o.length >= 2) {
                      L9: {
                        L10: {
                          if (!param2) {
                            break L10;
                          } else {
                            if (-1 == tsa.field_h) {
                              break L10;
                            } else {
                              stackOut_47_0 = 1;
                              stackIn_49_0 = stackOut_47_0;
                              break L9;
                            }
                          }
                        }
                        stackOut_48_0 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        break L9;
                      }
                      var6 = stackIn_49_0;
                      if (var6 == 0) {
                        break L5;
                      } else {
                        var7 = tsa.field_h;
                        var8_int = 0;
                        L11: while (true) {
                          if (~var8_int <= ~ce.field_o.length) {
                            break L6;
                          } else {
                            ce.field_o[var8_int] = (byte) 0;
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
                        if (0 == inb.field_q[0][var6 + 1].field_o) {
                          break L12;
                        } else {
                          if (param1.field_Cb == var6) {
                            break L12;
                          } else {
                            var5 = 1;
                            param1.field_Cb = var6;
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      stackOut_27_0 = inb.field_q[0][var6 - -1];
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (var4_int == 0) {
                        stackOut_29_0 = (cna) (Object) stackIn_29_0;
                        stackOut_29_1 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        break L13;
                      } else {
                        stackOut_28_0 = (cna) (Object) stackIn_28_0;
                        stackOut_28_1 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        break L13;
                      }
                    }
                    L14: {
                      stackIn_30_0.field_y = stackIn_30_1 != 0;
                      if (ll.field_o) {
                        break L14;
                      } else {
                        if (var6 == 3) {
                          inb.field_q[0][var6 - -1].field_y = false;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      stackOut_34_0 = inb.field_q[0][1 + var6];
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (var6 != param1.field_Cb) {
                        stackOut_36_0 = (cna) (Object) stackIn_36_0;
                        stackOut_36_1 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L15;
                      } else {
                        stackOut_35_0 = (cna) (Object) stackIn_35_0;
                        stackOut_35_1 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        break L15;
                      }
                    }
                    stackIn_37_0.field_J = stackIn_37_1 != 0;
                    var6++;
                    continue L7;
                  }
                }
              } else {
                if (ieb.field_o.length >= 2) {
                  L16: {
                    L17: {
                      if (!param2) {
                        break L17;
                      } else {
                        if (-1 == tsa.field_h) {
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
                    var7 = tsa.field_h;
                    var8_int = 0;
                    L18: while (true) {
                      if (~var8_int <= ~ce.field_o.length) {
                        break L6;
                      } else {
                        ce.field_o[var8_int] = (byte) 0;
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
            ce.field_o[var7 / 8] = (byte)knb.a((int) ce.field_o[var7 / 8], 1 << var7 % 8);
            break L5;
          }
          L19: {
            if (!param2) {
              stackOut_56_0 = 0;
              stackIn_57_0 = stackOut_56_0;
              break L19;
            } else {
              stackOut_55_0 = -1;
              stackIn_57_0 = stackOut_55_0;
              break L19;
            }
          }
          var7 = stackIn_57_0;
          L20: while (true) {
            if (var7 >= ieb.field_o.length) {
              break L4;
            } else {
              L21: {
                L22: {
                  if (var6 == 0) {
                    break L22;
                  } else {
                    if (~tsa.field_h == ~var7) {
                      break L22;
                    } else {
                      stackOut_61_0 = 1;
                      stackIn_63_0 = stackOut_61_0;
                      break L21;
                    }
                  }
                }
                stackOut_62_0 = 0;
                stackIn_63_0 = stackOut_62_0;
                break L21;
              }
              L23: {
                var8_int = stackIn_63_0;
                if (var4_int == 0) {
                  break L23;
                } else {
                  if (0 != inb.field_q[1][var7 + 1].field_o) {
                    if (!param2) {
                      var9 = ieb.field_o[var7];
                      if (param1.field_Fb != var9) {
                        var5 = 1;
                        param1.field_Fb = var9;
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      if (var6 == 0) {
                        if (var7 == -1) {
                          var9 = 0;
                          L24: while (true) {
                            if (ce.field_o.length <= var9) {
                              break L23;
                            } else {
                              ce.field_o[var9] = (byte) 0;
                              var9++;
                              continue L24;
                            }
                          }
                        } else {
                          ce.field_o[var7 / 8] = (byte)mgb.a((int) ce.field_o[var7 / 8], 1 << dla.a(7, var7));
                          break L23;
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
                if (param2) {
                  if (var7 != -1) {
                    L26: {
                      stackOut_89_0 = inb.field_q[1][1 + var7];
                      stackIn_91_0 = stackOut_89_0;
                      stackIn_90_0 = stackOut_89_0;
                      if ((ce.field_o[var7 / 8] & 1 << (7 & var7)) == 0) {
                        stackOut_91_0 = (cna) (Object) stackIn_91_0;
                        stackOut_91_1 = 0;
                        stackIn_92_0 = stackOut_91_0;
                        stackIn_92_1 = stackOut_91_1;
                        break L26;
                      } else {
                        stackOut_90_0 = (cna) (Object) stackIn_90_0;
                        stackOut_90_1 = 1;
                        stackIn_92_0 = stackOut_90_0;
                        stackIn_92_1 = stackOut_90_1;
                        break L26;
                      }
                    }
                    stackIn_92_0.field_J = stackIn_92_1 != 0;
                    break L25;
                  } else {
                    inb.field_q[1][var7 + 1].field_J = true;
                    var9 = 0;
                    L27: while (true) {
                      if (~var9 <= ~ieb.field_o.length) {
                        break L25;
                      } else {
                        L28: {
                          stackOut_85_0 = inb.field_q[1][var7 - -1];
                          stackOut_85_1 = inb.field_q[1][var7 - -1].field_J;
                          stackIn_87_0 = stackOut_85_0;
                          stackIn_87_1 = stackOut_85_1;
                          stackIn_86_0 = stackOut_85_0;
                          stackIn_86_1 = stackOut_85_1;
                          if ((ce.field_o[var9 / 8] & 1 << (7 & var9)) != 0) {
                            stackOut_87_0 = (cna) (Object) stackIn_87_0;
                            stackOut_87_1 = stackIn_87_1;
                            stackOut_87_2 = 0;
                            stackIn_88_0 = stackOut_87_0;
                            stackIn_88_1 = stackOut_87_1;
                            stackIn_88_2 = stackOut_87_2;
                            break L28;
                          } else {
                            stackOut_86_0 = (cna) (Object) stackIn_86_0;
                            stackOut_86_1 = stackIn_86_1;
                            stackOut_86_2 = 1;
                            stackIn_88_0 = stackOut_86_0;
                            stackIn_88_1 = stackOut_86_1;
                            stackIn_88_2 = stackOut_86_2;
                            break L28;
                          }
                        }
                        stackIn_88_0.field_J = stackIn_88_1 & stackIn_88_2 != 0;
                        var9++;
                        continue L27;
                      }
                    }
                  }
                } else {
                  L29: {
                    var9 = ieb.field_o[var7];
                    stackOut_78_0 = inb.field_q[1][1 + var7];
                    stackIn_80_0 = stackOut_78_0;
                    stackIn_79_0 = stackOut_78_0;
                    if (~param1.field_Fb != ~var9) {
                      stackOut_80_0 = (cna) (Object) stackIn_80_0;
                      stackOut_80_1 = 0;
                      stackIn_81_0 = stackOut_80_0;
                      stackIn_81_1 = stackOut_80_1;
                      break L29;
                    } else {
                      stackOut_79_0 = (cna) (Object) stackIn_79_0;
                      stackOut_79_1 = 1;
                      stackIn_81_0 = stackOut_79_0;
                      stackIn_81_1 = stackOut_79_1;
                      break L29;
                    }
                  }
                  stackIn_81_0.field_J = stackIn_81_1 != 0;
                  break L25;
                }
              }
              L30: {
                L31: {
                  stackOut_93_0 = inb.field_q[1][1 + var7];
                  stackIn_96_0 = stackOut_93_0;
                  stackIn_94_0 = stackOut_93_0;
                  if (var4_int == 0) {
                    break L31;
                  } else {
                    stackOut_94_0 = (cna) (Object) stackIn_94_0;
                    stackIn_96_0 = stackOut_94_0;
                    stackIn_95_0 = stackOut_94_0;
                    if (var8_int != 0) {
                      break L31;
                    } else {
                      stackOut_95_0 = (cna) (Object) stackIn_95_0;
                      stackOut_95_1 = 1;
                      stackIn_97_0 = stackOut_95_0;
                      stackIn_97_1 = stackOut_95_1;
                      break L30;
                    }
                  }
                }
                stackOut_96_0 = (cna) (Object) stackIn_96_0;
                stackOut_96_1 = 0;
                stackIn_97_0 = stackOut_96_0;
                stackIn_97_1 = stackOut_96_1;
                break L30;
              }
              stackIn_97_0.field_y = stackIn_97_1 != 0;
              var7++;
              continue L20;
            }
          }
        }
        L32: {
          if (!param2) {
            stackOut_100_0 = 1;
            stackIn_101_0 = stackOut_100_0;
            break L32;
          } else {
            stackOut_99_0 = 0;
            stackIn_101_0 = stackOut_99_0;
            break L32;
          }
        }
        var6 = stackIn_101_0;
        L33: while (true) {
          if (var6 >= 3) {
            L34: {
              if (param3 == -67) {
                break L34;
              } else {
                asb.a(-90, (mm) null, true, (byte) -109);
                break L34;
              }
            }
            L35: {
              if (!param2) {
                break L35;
              } else {
                if (nkb.field_r <= 1) {
                  break L35;
                } else {
                  var6 = 0;
                  L36: while (true) {
                    if (~var6 <= ~(nkb.field_r - -1)) {
                      break L35;
                    } else {
                      L37: {
                        var7_ref_cna = inb.field_q[3][var6];
                        if (var4_int == 0) {
                          break L37;
                        } else {
                          if (0 == var7_ref_cna.field_o) {
                            break L37;
                          } else {
                            imb.field_a = var6;
                            break L37;
                          }
                        }
                      }
                      L38: {
                        if (!var7_ref_cna.field_Q) {
                          break L38;
                        } else {
                          if (var6 <= 0) {
                            break L38;
                          } else {
                            L39: {
                              if (ea.field_k == null) {
                                stackOut_142_0 = null;
                                stackIn_143_0 = (String) (Object) stackOut_142_0;
                                break L39;
                              } else {
                                stackOut_141_0 = ea.field_k[-1 + var6];
                                stackIn_143_0 = stackOut_141_0;
                                break L39;
                              }
                            }
                            var8_ref = stackIn_143_0;
                            if (var8_ref != null) {
                              lob.field_a = var8_ref;
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                      L40: {
                        stackOut_146_0 = (cna) var7_ref_cna;
                        stackIn_148_0 = stackOut_146_0;
                        stackIn_147_0 = stackOut_146_0;
                        if (var6 != imb.field_a) {
                          stackOut_148_0 = (cna) (Object) stackIn_148_0;
                          stackOut_148_1 = 0;
                          stackIn_149_0 = stackOut_148_0;
                          stackIn_149_1 = stackOut_148_1;
                          break L40;
                        } else {
                          stackOut_147_0 = (cna) (Object) stackIn_147_0;
                          stackOut_147_1 = 1;
                          stackIn_149_0 = stackOut_147_0;
                          stackIn_149_1 = stackOut_147_1;
                          break L40;
                        }
                      }
                      L41: {
                        stackIn_149_0.field_J = stackIn_149_1 != 0;
                        stackOut_149_0 = (cna) var7_ref_cna;
                        stackIn_151_0 = stackOut_149_0;
                        stackIn_150_0 = stackOut_149_0;
                        if (var4_int == 0) {
                          stackOut_151_0 = (cna) (Object) stackIn_151_0;
                          stackOut_151_1 = 0;
                          stackIn_152_0 = stackOut_151_0;
                          stackIn_152_1 = stackOut_151_1;
                          break L41;
                        } else {
                          stackOut_150_0 = (cna) (Object) stackIn_150_0;
                          stackOut_150_1 = 1;
                          stackIn_152_0 = stackOut_150_0;
                          stackIn_152_1 = stackOut_150_1;
                          break L41;
                        }
                      }
                      stackIn_152_0.field_y = stackIn_152_1 != 0;
                      var6++;
                      continue L36;
                    }
                  }
                }
              }
            }
            var6 = 0;
            var7 = 0;
            L42: while (true) {
              if (var7 >= ocb.field_l) {
                L43: {
                  L44: {
                    if (var5 == 0) {
                      break L44;
                    } else {
                      if (!param2) {
                        int discarded$1 = 1;
                        bh.a(param0);
                        break L44;
                      } else {
                        break L43;
                      }
                    }
                  }
                  break L43;
                }
                return;
              } else {
                L45: {
                  var8 = inb.field_q[4 - -var7];
                  if (!param2) {
                    stackOut_157_0 = 0;
                    stackIn_158_0 = stackOut_157_0;
                    break L45;
                  } else {
                    stackOut_156_0 = -1;
                    stackIn_158_0 = stackOut_156_0;
                    break L45;
                  }
                }
                var9 = stackIn_158_0;
                L46: while (true) {
                  if (var9 >= -1 + var8.length) {
                    var6 = var6 + (255 & vu.field_zb[var7]);
                    var7++;
                    continue L42;
                  } else {
                    L47: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4_int == 0) {
                        break L47;
                      } else {
                        if (var9 >= 0) {
                          L48: {
                            if (hia.field_o == null) {
                              break L48;
                            } else {
                              if (hia.field_o[var7] == null) {
                                break L48;
                              } else {
                                if (0 >= (~kbb.field_p & hia.field_o[var7][var9])) {
                                  break L48;
                                } else {
                                  var14 = 1;
                                  var15 = wsb.a(hia.field_o[var7][var9] & ~kbb.field_p, 1302374146);
                                  break L48;
                                }
                              }
                            }
                          }
                          L49: {
                            if (null == qcb.field_o) {
                              break L49;
                            } else {
                              if (qcb.field_o[var7] == null) {
                                break L49;
                              } else {
                                if (0 < hcb.field_o) {
                                  break L49;
                                } else {
                                  if (!qcb.field_o[var7][var9]) {
                                    break L49;
                                  } else {
                                    var10 = 1;
                                    break L49;
                                  }
                                }
                              }
                            }
                          }
                          L50: {
                            if (null == crb.field_w) {
                              break L50;
                            } else {
                              if (null == crb.field_w[var7]) {
                                break L50;
                              } else {
                                L51: {
                                  var16 = crb.field_w[var7][var9];
                                  if (var16 <= 0) {
                                    break L51;
                                  } else {
                                    if (~tg.field_q > ~var16) {
                                      var12 = 1;
                                      break L51;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                                if (var16 == 0) {
                                  break L50;
                                } else {
                                  if (ufa.field_o) {
                                    break L50;
                                  } else {
                                    if (hcb.field_o > 0) {
                                      break L50;
                                    } else {
                                      var10 = 1;
                                      break L50;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L52: {
                            L53: {
                              if (!param2) {
                                break L53;
                              } else {
                                if (nqa.field_b == null) {
                                  break L53;
                                } else {
                                  if (nqa.field_b[var7] == null) {
                                    break L53;
                                  } else {
                                    if (!nqa.field_b[var7][var9]) {
                                      break L53;
                                    } else {
                                      stackOut_186_0 = 1;
                                      stackIn_188_0 = stackOut_186_0;
                                      break L52;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_187_0 = 0;
                            stackIn_188_0 = stackOut_187_0;
                            break L52;
                          }
                          var13 = stackIn_188_0;
                          if (tab.field_p == null) {
                            break L47;
                          } else {
                            if (tab.field_p[var7] == null) {
                              break L47;
                            } else {
                              L54: {
                                var16 = tab.field_p[var7][var9];
                                if (var16 <= 0) {
                                  break L54;
                                } else {
                                  if (var16 > cla.field_b) {
                                    var11 = 1;
                                    break L54;
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                              if (0 == var16) {
                                break L47;
                              } else {
                                if (ufa.field_o) {
                                  break L47;
                                } else {
                                  if (0 < hcb.field_o) {
                                    break L47;
                                  } else {
                                    var10 = 1;
                                    break L47;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L47;
                        }
                      }
                    }
                    L55: {
                      if (go.field_p < 2) {
                        break L55;
                      } else {
                        if (!si.field_o[12]) {
                          break L55;
                        } else {
                          var12 = 0;
                          var10 = 0;
                          var14 = 0;
                          var11 = 0;
                          var13 = 0;
                          break L55;
                        }
                      }
                    }
                    L56: {
                      L57: {
                        if (var10 != 0) {
                          break L57;
                        } else {
                          if (var11 != 0) {
                            break L57;
                          } else {
                            if (var12 != 0) {
                              break L57;
                            } else {
                              if (var13 != 0) {
                                break L57;
                              } else {
                                if (var14 == 0) {
                                  stackOut_208_0 = 0;
                                  stackIn_209_0 = stackOut_208_0;
                                  break L56;
                                } else {
                                  break L57;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_207_0 = 1;
                      stackIn_209_0 = stackOut_207_0;
                      break L56;
                    }
                    L58: {
                      var16 = stackIn_209_0;
                      hrb.field_b = true;
                      if (var16 != 0) {
                        break L58;
                      } else {
                        if (var9 < 0) {
                          break L58;
                        } else {
                          if (null == ncb.field_a) {
                            break L58;
                          } else {
                            L59: {
                              if (!param2) {
                                break L59;
                              } else {
                                if (!ii.field_h) {
                                  break L59;
                                } else {
                                  break L58;
                                }
                              }
                            }
                            L60: {
                              nr.field_p = false;
                              hrb.field_b = false;
                              if (tib.field_i == null) {
                                tib.field_i = new byte[ocb.field_l];
                                mia.field_a = new boolean[ocb.field_l];
                                break L60;
                              } else {
                                break L60;
                              }
                            }
                            var17_int = 0;
                            L61: while (true) {
                              if (~var7 >= ~var17_int) {
                                L62: {
                                  bea.a(var7, var9, param1, -1, 93, param2, 0, -1);
                                  if (2 > go.field_p) {
                                    break L62;
                                  } else {
                                    if (!si.field_o[12]) {
                                      break L62;
                                    } else {
                                      hrb.field_b = true;
                                      break L62;
                                    }
                                  }
                                }
                                if (hrb.field_b) {
                                  break L58;
                                } else {
                                  var16 = 1;
                                  break L58;
                                }
                              } else {
                                mia.field_a[var17_int] = false;
                                var17_int++;
                                continue L61;
                              }
                            }
                          }
                        }
                      }
                    }
                    L63: {
                      var17 = var8[var9 - -1];
                      if (var4_int == 0) {
                        break L63;
                      } else {
                        if (0 == var17.field_o) {
                          break L63;
                        } else {
                          if (!param2) {
                            if (var16 != 0) {
                              break L63;
                            } else {
                              if (~(byte)var9 == ~param1.field_Pb[var7]) {
                                break L63;
                              } else {
                                param1.field_Pb[var7] = (byte)var9;
                                var5 = 1;
                                break L63;
                              }
                            }
                          } else {
                            if (var9 == -1) {
                              var18 = var6;
                              L64: while (true) {
                                if (~(var6 - (-var8.length + 1)) >= ~var18) {
                                  break L63;
                                } else {
                                  nkb.field_p[var18 / 8] = (byte)dla.a((int) nkb.field_p[var18 / 8], ~(1 << dla.a(7, var18)));
                                  var18++;
                                  continue L64;
                                }
                              }
                            } else {
                              nkb.field_p[(var9 + var6) / 8] = (byte)mgb.a((int) nkb.field_p[(var9 + var6) / 8], 1 << dla.a(var6 + var9, 7));
                              break L63;
                            }
                          }
                        }
                      }
                    }
                    L65: {
                      if (!param2) {
                        break L65;
                      } else {
                        if (var16 == 0) {
                          break L65;
                        } else {
                          nkb.field_p[(var6 + var9) / 8] = (byte)dla.a((int) nkb.field_p[(var6 + var9) / 8], ~(1 << dla.a(var9 + var6, 7)));
                          break L65;
                        }
                      }
                    }
                    L66: {
                      if (var9 < 0) {
                        break L66;
                      } else {
                        if (var17.field_Q) {
                          L67: {
                            if (hqb.field_k == null) {
                              var18_ref = null;
                              break L67;
                            } else {
                              if (null == hqb.field_k[var7]) {
                                var18_ref = null;
                                break L67;
                              } else {
                                var18_ref = (Object) (Object) hqb.field_k[var7][var9];
                                break L67;
                              }
                            }
                          }
                          L68: {
                            if (awa.field_o == null) {
                              var19 = null;
                              break L68;
                            } else {
                              if (null != awa.field_o[var7]) {
                                var19 = (Object) (Object) awa.field_o[var7][var9];
                                break L68;
                              } else {
                                var19 = null;
                                break L68;
                              }
                            }
                          }
                          L69: {
                            var20 = null;
                            if (var19 == null) {
                              break L69;
                            } else {
                              if (!((String) var19).equals(var18_ref)) {
                                var20 = var19;
                                break L69;
                              } else {
                                break L69;
                              }
                            }
                          }
                          L70: {
                            var21 = null;
                            if (var13 != 0) {
                              var21 = (Object) (Object) k.field_q;
                              var22 = var21;
                              var25 = var22;
                              var22 = var25;
                              var21 = var22;
                              var22 = var21;
                              break L70;
                            } else {
                              if (var10 != 0) {
                                var21 = (Object) (Object) bpa.field_d;
                                break L70;
                              } else {
                                L71: {
                                  if (var11 != 0) {
                                    var22_int = tab.field_p[var7][var9] + -cla.field_b;
                                    if (var22_int == 1) {
                                      var21 = (Object) (Object) wia.field_b;
                                      var22 = var21;
                                      var21 = var22;
                                      var22 = var21;
                                      var21 = var22;
                                      break L71;
                                    } else {
                                      var21 = (Object) (Object) isa.a(nra.field_a, new String[1], 105);
                                      break L71;
                                    }
                                  } else {
                                    break L71;
                                  }
                                }
                                L72: {
                                  if (var12 == 0) {
                                    break L72;
                                  } else {
                                    var22_ref = isa.a(gh.field_p, new String[2], 110);
                                    var21 = (Object) (Object) var22_ref;
                                    var21 = (Object) (Object) var22_ref;
                                    if (var21 == null) {
                                      var21 = (Object) (Object) var22_ref;
                                      break L72;
                                    } else {
                                      var21 = (Object) (Object) (var21 + "<br>" + var22_ref);
                                      break L72;
                                    }
                                  }
                                }
                                if (var14 == 0) {
                                  break L70;
                                } else {
                                  L73: {
                                    var22_ref = lp.field_a;
                                    if (var15 <= 0) {
                                      break L73;
                                    } else {
                                      if (mta.field_a == null) {
                                        break L73;
                                      } else {
                                        if (~mta.field_a.length > ~var15) {
                                          break L73;
                                        } else {
                                          if (null == mta.field_a[var15 + -1]) {
                                            break L73;
                                          } else {
                                            var22_ref = mta.field_a[var15 - 1][0];
                                            break L73;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 == null) {
                                    var21 = (Object) (Object) var22_ref;
                                    break L70;
                                  } else {
                                    var21 = (Object) (Object) (var21 + "<br>" + var22_ref);
                                    break L70;
                                  }
                                }
                              }
                            }
                          }
                          L74: {
                            if (var4_int == 0) {
                              break L74;
                            } else {
                              if (!hrb.field_b) {
                                L75: {
                                  var22_ref = null;
                                  var23 = 0;
                                  if (!nr.field_p) {
                                    break L75;
                                  } else {
                                    var22_ref = "</col>" + uda.field_a + "<col=A00000>";
                                    var25_ref = var22_ref;
                                    var22_ref = var25_ref;
                                    var25_ref = var22_ref;
                                    var22_ref = var25_ref;
                                    var21 = (Object) (Object) var22_ref;
                                    break L75;
                                  }
                                }
                                var24 = 0;
                                L76: while (true) {
                                  if (~var7 >= ~var24) {
                                    if (var23 == 0) {
                                      var21 = (Object) (Object) isa.a(fra.field_c, new String[1], 78);
                                      break L74;
                                    } else {
                                      var21 = (Object) (Object) (nna.field_F + var22_ref);
                                      break L74;
                                    }
                                  } else {
                                    L77: {
                                      if (!mia.field_a[var24]) {
                                        break L77;
                                      } else {
                                        var25_ref = "</col>" + hva.field_c[var24] + "<col=A00000>";
                                        var22_ref = var25_ref;
                                        var21 = (Object) (Object) var22_ref;
                                        var22_ref = var25_ref;
                                        if (var22_ref == null) {
                                          var22_ref = var25_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          break L77;
                                        } else {
                                          var23 = 1;
                                          var22_ref = var22_ref + ", " + var25_ref;
                                          break L77;
                                        }
                                      }
                                    }
                                    var24++;
                                    continue L76;
                                  }
                                }
                              } else {
                                break L74;
                              }
                            }
                          }
                          L78: {
                            if (var21 == null) {
                              break L78;
                            } else {
                              var21 = (Object) (Object) ("<col=A00000>" + var21);
                              var21 = (Object) (Object) jd.a((String) var21, "<br>", 0, "<br><col=A00000>");
                              if (var20 != null) {
                                var20 = (Object) (Object) (var20 + "<br>" + var21);
                                break L78;
                              } else {
                                var20 = var21;
                                break L78;
                              }
                            }
                          }
                          if (var20 == null) {
                            break L66;
                          } else {
                            lob.field_a = (String) var20;
                            break L66;
                          }
                        } else {
                          break L66;
                        }
                      }
                    }
                    L79: {
                      if (!param2) {
                        L80: {
                          L81: {
                            stackOut_312_0 = (cna) var17;
                            stackIn_315_0 = stackOut_312_0;
                            stackIn_313_0 = stackOut_312_0;
                            if (!hrb.field_b) {
                              break L81;
                            } else {
                              stackOut_313_0 = (cna) (Object) stackIn_313_0;
                              stackIn_315_0 = stackOut_313_0;
                              stackIn_314_0 = stackOut_313_0;
                              if (~(byte)var9 != ~param1.field_Pb[var7]) {
                                break L81;
                              } else {
                                stackOut_314_0 = (cna) (Object) stackIn_314_0;
                                stackOut_314_1 = 1;
                                stackIn_316_0 = stackOut_314_0;
                                stackIn_316_1 = stackOut_314_1;
                                break L80;
                              }
                            }
                          }
                          stackOut_315_0 = (cna) (Object) stackIn_315_0;
                          stackOut_315_1 = 0;
                          stackIn_316_0 = stackOut_315_0;
                          stackIn_316_1 = stackOut_315_1;
                          break L80;
                        }
                        stackIn_316_0.field_J = stackIn_316_1 != 0;
                        break L79;
                      } else {
                        if (var9 == -1) {
                          var17.field_J = true;
                          var27 = var6;
                          var18 = var27;
                          L82: while (true) {
                            if (var27 >= var6 - (-var8.length + 1)) {
                              break L79;
                            } else {
                              L83: {
                                stackOut_308_0 = (cna) var17;
                                stackOut_308_1 = var17.field_J;
                                stackIn_310_0 = stackOut_308_0;
                                stackIn_310_1 = stackOut_308_1;
                                stackIn_309_0 = stackOut_308_0;
                                stackIn_309_1 = stackOut_308_1;
                                if (0 != (nkb.field_p[var27 / 8] & 1 << (var27 & 7))) {
                                  stackOut_310_0 = (cna) (Object) stackIn_310_0;
                                  stackOut_310_1 = stackIn_310_1;
                                  stackOut_310_2 = 0;
                                  stackIn_311_0 = stackOut_310_0;
                                  stackIn_311_1 = stackOut_310_1;
                                  stackIn_311_2 = stackOut_310_2;
                                  break L83;
                                } else {
                                  stackOut_309_0 = (cna) (Object) stackIn_309_0;
                                  stackOut_309_1 = stackIn_309_1;
                                  stackOut_309_2 = 1;
                                  stackIn_311_0 = stackOut_309_0;
                                  stackIn_311_1 = stackOut_309_1;
                                  stackIn_311_2 = stackOut_309_2;
                                  break L83;
                                }
                              }
                              stackIn_311_0.field_J = stackIn_311_1 & stackIn_311_2 != 0;
                              var27++;
                              continue L82;
                            }
                          }
                        } else {
                          L84: {
                            stackOut_302_0 = (cna) var17;
                            stackIn_304_0 = stackOut_302_0;
                            stackIn_303_0 = stackOut_302_0;
                            if ((nkb.field_p[(var6 - -var9) / 8] & 1 << (var9 + var6 & 7)) == 0) {
                              stackOut_304_0 = (cna) (Object) stackIn_304_0;
                              stackOut_304_1 = 0;
                              stackIn_305_0 = stackOut_304_0;
                              stackIn_305_1 = stackOut_304_1;
                              break L84;
                            } else {
                              stackOut_303_0 = (cna) (Object) stackIn_303_0;
                              stackOut_303_1 = 1;
                              stackIn_305_0 = stackOut_303_0;
                              stackIn_305_1 = stackOut_303_1;
                              break L84;
                            }
                          }
                          stackIn_305_0.field_J = stackIn_305_1 != 0;
                          break L79;
                        }
                      }
                    }
                    L85: {
                      L86: {
                        stackOut_317_0 = (cna) var17;
                        stackIn_320_0 = stackOut_317_0;
                        stackIn_318_0 = stackOut_317_0;
                        if (var4_int == 0) {
                          break L86;
                        } else {
                          stackOut_318_0 = (cna) (Object) stackIn_318_0;
                          stackIn_320_0 = stackOut_318_0;
                          stackIn_319_0 = stackOut_318_0;
                          if (var16 != 0) {
                            break L86;
                          } else {
                            stackOut_319_0 = (cna) (Object) stackIn_319_0;
                            stackOut_319_1 = 1;
                            stackIn_321_0 = stackOut_319_0;
                            stackIn_321_1 = stackOut_319_1;
                            break L85;
                          }
                        }
                      }
                      stackOut_320_0 = (cna) (Object) stackIn_320_0;
                      stackOut_320_1 = 0;
                      stackIn_321_0 = stackOut_320_0;
                      stackIn_321_1 = stackOut_320_1;
                      break L85;
                    }
                    stackIn_321_0.field_y = stackIn_321_1 != 0;
                    var9++;
                    continue L46;
                  }
                }
              }
            }
          } else {
            L87: {
              var7_ref_cna = inb.field_q[2][var6];
              if (var4_int == 0) {
                break L87;
              } else {
                if (var7_ref_cna.field_o == 0) {
                  break L87;
                } else {
                  if (!param2) {
                    if (param1.field_Bb == var6) {
                      break L87;
                    } else {
                      var5 = 1;
                      param1.field_Bb = var6;
                      break L87;
                    }
                  } else {
                    if (0 != var6) {
                      qd.field_d = qd.field_d ^ var6;
                      break L87;
                    } else {
                      qd.field_d = 0;
                      break L87;
                    }
                  }
                }
              }
            }
            L88: {
              stackOut_111_0 = (cna) var7_ref_cna;
              stackIn_113_0 = stackOut_111_0;
              stackIn_112_0 = stackOut_111_0;
              if (var4_int == 0) {
                stackOut_113_0 = (cna) (Object) stackIn_113_0;
                stackOut_113_1 = 0;
                stackIn_114_0 = stackOut_113_0;
                stackIn_114_1 = stackOut_113_1;
                break L88;
              } else {
                stackOut_112_0 = (cna) (Object) stackIn_112_0;
                stackOut_112_1 = 1;
                stackIn_114_0 = stackOut_112_0;
                stackIn_114_1 = stackOut_112_1;
                break L88;
              }
            }
            L89: {
              stackIn_114_0.field_y = stackIn_114_1 != 0;
              if (!param2) {
                L90: {
                  stackOut_124_0 = (cna) var7_ref_cna;
                  stackIn_126_0 = stackOut_124_0;
                  stackIn_125_0 = stackOut_124_0;
                  if (0 == (var6 & param1.field_Bb)) {
                    stackOut_126_0 = (cna) (Object) stackIn_126_0;
                    stackOut_126_1 = 0;
                    stackIn_127_0 = stackOut_126_0;
                    stackIn_127_1 = stackOut_126_1;
                    break L90;
                  } else {
                    stackOut_125_0 = (cna) (Object) stackIn_125_0;
                    stackOut_125_1 = 1;
                    stackIn_127_0 = stackOut_125_0;
                    stackIn_127_1 = stackOut_125_1;
                    break L90;
                  }
                }
                stackIn_127_0.field_J = stackIn_127_1 != 0;
                break L89;
              } else {
                if (var6 != 0) {
                  L91: {
                    stackOut_120_0 = (cna) var7_ref_cna;
                    stackIn_122_0 = stackOut_120_0;
                    stackIn_121_0 = stackOut_120_0;
                    if ((qd.field_d & var6) == 0) {
                      stackOut_122_0 = (cna) (Object) stackIn_122_0;
                      stackOut_122_1 = 0;
                      stackIn_123_0 = stackOut_122_0;
                      stackIn_123_1 = stackOut_122_1;
                      break L91;
                    } else {
                      stackOut_121_0 = (cna) (Object) stackIn_121_0;
                      stackOut_121_1 = 1;
                      stackIn_123_0 = stackOut_121_0;
                      stackIn_123_1 = stackOut_121_1;
                      break L91;
                    }
                  }
                  stackIn_123_0.field_J = stackIn_123_1 != 0;
                  break L89;
                } else {
                  L92: {
                    stackOut_116_0 = (cna) var7_ref_cna;
                    stackIn_118_0 = stackOut_116_0;
                    stackIn_117_0 = stackOut_116_0;
                    if (0 != qd.field_d) {
                      stackOut_118_0 = (cna) (Object) stackIn_118_0;
                      stackOut_118_1 = 0;
                      stackIn_119_0 = stackOut_118_0;
                      stackIn_119_1 = stackOut_118_1;
                      break L92;
                    } else {
                      stackOut_117_0 = (cna) (Object) stackIn_117_0;
                      stackOut_117_1 = 1;
                      stackIn_119_0 = stackOut_117_0;
                      stackIn_119_1 = stackOut_117_1;
                      break L92;
                    }
                  }
                  stackIn_119_0.field_J = stackIn_119_1 != 0;
                  break L89;
                }
              }
            }
            var6++;
            continue L33;
          }
        }
    }

    final int a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!this.b((byte) 127, param1)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param2 = param2.toLowerCase();
              var5 = (CharSequence) (Object) param2;
              var4_int = ((asb) this).field_g.field_p[param1].a(-123454015, vla.a((byte) 122, var5));
              if (param0) {
                if (!this.a(var4_int, param1, 0)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return var4_int;
                }
              } else {
                stackOut_5_0 = 78;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("asb.T(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    private final synchronized boolean b(byte param0, int param1) {
        int var3 = -101 % ((85 - param0) / 33);
        if (!((asb) this).b((byte) 103)) {
            return false;
        }
        if (param1 >= 0) {
            if (((asb) this).field_g.field_m.length > param1) {
                if (0 != ((asb) this).field_g.field_m[param1]) {
                    return true;
                }
            }
        }
        if (sl.field_b) {
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final synchronized byte[] a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((asb) this).field_e = ((boolean[]) ((Object[]) ((asb) this).field_i[30])[11])[9];
                break L1;
              }
            }
            if (((asb) this).b((byte) -77)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 114, var6));
              if (this.b((byte) -28, var4_int)) {
                var7 = (CharSequence) (Object) param0;
                var5 = ((asb) this).field_g.field_p[var4_int].a(-123454015, vla.a((byte) 116, var7));
                stackOut_8_0 = ((asb) this).a(var4_int, var5, (byte) 13);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("asb.U(");
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) 116)) {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((asb) this).field_g.field_a.a(param0 + -123486186, vla.a((byte) 127, var4));
                if (param0 == 32171) {
                  break L1;
                } else {
                  boolean discarded$2 = ((asb) this).a(-117, (String) null);
                  break L1;
                }
              }
              stackOut_5_0 = ((asb) this).c(121, var3_int);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("asb.G(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.b((byte) -40, param1)) {
            return false;
        }
        if (!(((asb) this).field_i[param1] == null)) {
            return true;
        }
        this.a((byte) -92, param1);
        if (param0 <= 46) {
            int discarded$0 = ((asb) this).b(((int[]) ((asb) this).field_i[8])[0]);
        }
        if (((asb) this).field_i[param1] != null) {
            return true;
        }
        return false;
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((asb) this).b((byte) 77)) {
              if (param0) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 108, var4));
                if (var3_int >= 0) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = ((boolean[]) ((Object[]) ((asb) this).field_i[13])[2])[12];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("asb.BA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final synchronized boolean b(byte param0) {
        if (null == ((asb) this).field_g) {
            ((asb) this).field_g = ((asb) this).field_d.a((byte) 9);
            if (((asb) this).field_g == null) {
                return false;
            }
            ((asb) this).field_c = new Object[((asb) this).field_g.field_l][];
            ((asb) this).field_i = new Object[((asb) this).field_g.field_l];
        }
        int var2 = -12 / ((param0 - 21) / 56);
        return true;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (((asb) this).b((byte) 84)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (((asb) this).field_g.field_i.length <= var3) {
              L1: {
                if (param0 >= 1) {
                  break L1;
                } else {
                  ((asb) this).field_g = null;
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = ((asb) this).field_g.field_i[var3];
              if (null == ((asb) this).field_i[var4]) {
                this.a((byte) -122, var4);
                if (((asb) this).field_i[var4] == null) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, String param1, byte[] param2, int param3, String param4) {
        try {
            File var5 = null;
            if (param3 >= -68) {
                asb.a(-105, (String) null, (byte[]) null, 12, (String) null);
            }
            var5 = new File("//contentfs/mgcontent_v4/WIP/voidhunters/src/freelevels/" + param4 + param1);
            {
                oj.a(var5, 3, param2, param0);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        byte[] var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            var5_int = -1;
            if (this.a(param3, param0, 0)) {
              L1: {
                L2: {
                  var6 = null;
                  if (null == ((asb) this).field_c[param0]) {
                    break L2;
                  } else {
                    if (null == ((asb) this).field_c[param0][param3]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (!this.a(param3, 0, param0, param2)) {
                  this.a((byte) -78, param0);
                  if (this.a(param3, 0, param0, param2)) {
                    break L1;
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (byte[]) (Object) stackIn_10_0;
                  }
                } else {
                  break L1;
                }
              }
              if (null != ((asb) this).field_c[param0]) {
                L3: {
                  if (((asb) this).field_c[param0][param3] == null) {
                    break L3;
                  } else {
                    int discarded$1 = 1;
                    var8 = ffb.a(false, ((asb) this).field_c[param0][param3]);
                    var6 = (Object) (Object) var8;
                    if (var8 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 != null) {
                    if (((asb) this).field_h == 1) {
                      ((asb) this).field_c[param0][param3] = null;
                      if (((asb) this).field_g.field_m[param0] != 1) {
                        break L4;
                      } else {
                        ((asb) this).field_c[param0] = null;
                        break L4;
                      }
                    } else {
                      if (2 != ((asb) this).field_h) {
                        break L4;
                      } else {
                        ((asb) this).field_c[param0] = null;
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_24_0 = var6;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("asb.B(").append(param0).append(44).append(-83).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_25_0;
    }

    public static void a() {
        field_b = null;
        int var1 = 0;
        field_a = null;
    }

    private final synchronized void a(byte param0, int param1) {
        if (!((asb) this).field_e) {
            ((asb) this).field_i[param1] = gfb.a(false, ((asb) this).field_d.a(127, param1), -12445);
        } else {
            ((asb) this).field_i[param1] = (Object) (Object) ((asb) this).field_d.a(118, param1);
        }
        if (param0 >= -67) {
            ((long[]) ((asb) this).field_i[9])[11] = -71L;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((asb) this).b((byte) 83)) {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                if (param1 >= ((asb) this).field_g.field_m.length) {
                  break L0;
                } else {
                  if (param0 < ((asb) this).field_g.field_m[param1]) {
                    boolean discarded$2 = ((asb) this).a(((int[]) ((asb) this).field_i[0])[0], (String) null);
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (sl.field_b) {
            throw new IllegalArgumentException(param1 + " " + param0);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (!((asb) this).b((byte) -106)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 == -107) {
                  break L1;
                } else {
                  ((asb) this).field_c = (Object[][]) ((Object[]) ((Object[]) ((asb) this).field_i[6])[6])[0];
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 127, var6));
              if (var4_int >= 0) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((asb) this).field_g.field_p[var4_int].a(-123454015, vla.a((byte) 123, var7));
                if (var5 >= 0) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("asb.W(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 != 13) {
            return (byte[]) ((asb) this).field_i[0];
        }
        return this.a(param0, -83, (int[]) null, param1);
    }

    final boolean a(boolean param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!((asb) this).b((byte) 82)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                if (!param0) {
                  break L1;
                } else {
                  ((asb) this).field_c = null;
                  break L1;
                }
              }
              var6 = (CharSequence) (Object) param2;
              var4_int = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 120, var6));
              if (!this.b((byte) 125, var4_int)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                var7 = (CharSequence) (Object) param1;
                var5 = ((asb) this).field_g.field_p[var4_int].a(-123454015, vla.a((byte) 108, var7));
                stackOut_10_0 = ((asb) this).a((byte) 84, var5, var4_int);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("asb.DA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!(((asb) this).b((byte) 81))) {
            return false;
        }
        if (((asb) this).field_g.field_m.length == 1) {
            return ((asb) this).a((byte) 95, param0, 0);
        }
        if (!this.b((byte) 121, param0)) {
            return false;
        }
        if (!param1) {
            ((asb) this).field_i[1] = null;
        }
        if (((asb) this).field_g.field_m[param0] == 1) {
            return ((asb) this).a((byte) 97, 0, param0);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (!((asb) this).b((byte) 109)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((asb) this).field_i.length) {
              if (0 != var2) {
                L1: {
                  if (param0 <= -101) {
                    break L1;
                  } else {
                    ((asb) this).field_h = 103;
                    break L1;
                  }
                }
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (((asb) this).field_g.field_j[var4] > 0) {
                var3 = var3 + ((asb) this).a(var4, 1045);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final int b(int param0, int param1) {
        if (param1 != -6942) {
            ((asb) this).field_i[2] = ((Object[]) ((asb) this).field_i[3])[1];
        }
        if (!this.b((byte) -33, param0)) {
            return 0;
        }
        return ((asb) this).field_g.field_m[param0];
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!(this.a(param1, param2, 0))) {
            return false;
        }
        if (((asb) this).field_c[param2] != null) {
            if (!(null == ((asb) this).field_c[param2][param1])) {
                return true;
            }
        }
        if (param0 <= 56) {
            return ((boolean[]) ((asb) this).field_i[7])[0];
        }
        if (null != ((asb) this).field_i[param2]) {
            return true;
        }
        this.a((byte) -116, param2);
        if (((asb) this).field_i[param2] == null) {
            return false;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        ds var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        ds var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_86_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_85_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        var22 = VoidHunters.field_G;
        try {
          L0: {
            if (!this.b((byte) 120, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null == ((asb) this).field_i[param2]) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                L1: {
                  var5_int = ((asb) this).field_g.field_j[param2];
                  var6 = ((asb) this).field_g.field_g[param2];
                  if (null == ((asb) this).field_c[param2]) {
                    ((asb) this).field_c[param2] = new Object[((asb) this).field_g.field_m[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((asb) this).field_c[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10_int = var9_int;
                          break L4;
                        } else {
                          var10_int = var6[var9_int];
                          break L4;
                        }
                      }
                      if (var7[var10_int] == null) {
                        var8 = 0;
                        break L3;
                      } else {
                        var9_int++;
                        continue L2;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L5: {
                      L6: {
                        if (param3 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param3[0] != 0) {
                              break L7;
                            } else {
                              if (param3[1] != 0) {
                                break L7;
                              } else {
                                if (param3[2] != 0) {
                                  break L7;
                                } else {
                                  if (0 == param3[3]) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          int discarded$4 = 1;
                          var9_array = ffb.a(true, ((asb) this).field_i[param2]);
                          var10_ref = new ds(var9_array);
                          var10_ref.a(5, param3, var10_ref.field_h.length, false);
                          break L5;
                        }
                      }
                      int discarded$5 = 1;
                      var9_array = ffb.a(false, ((asb) this).field_i[param2]);
                      break L5;
                    }
                    try {
                      L8: {
                        var23 = rob.a(0, var9_array);
                        var10 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_34_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_34_1 = new StringBuilder();
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        if (param3 == null) {
                          stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                          stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                          stackOut_36_2 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          stackIn_37_2 = stackOut_36_2;
                          break L9;
                        } else {
                          stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                          stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                          stackOut_35_2 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_37_2 = stackOut_35_2;
                          break L9;
                        }
                      }
                      int discarded$6 = 0;
                      int discarded$7 = 0;
                      throw rta.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + " " + param2 + " " + param3.length + " " + psb.a(var9_array, param3.length) + " " + psb.a(var9_array, -2 + param3.length) + " " + ((asb) this).field_g.field_d[param2] + " " + ((asb) this).field_g.field_k);
                    }
                    L10: {
                      if (!((asb) this).field_e) {
                        break L10;
                      } else {
                        ((asb) this).field_i[param2] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if (1 < var5_int) {
                        if (((asb) this).field_h == 2) {
                          var11 = var23.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * var5_int * 4;
                          var13 = new ds(var10);
                          var14 = 0;
                          var15 = 0;
                          var13.field_e = var11;
                          var16_int = 0;
                          L12: while (true) {
                            if (var12 <= var16_int) {
                              if (var14 == 0) {
                                stackOut_85_0 = 1;
                                stackIn_86_0 = stackOut_85_0;
                                return stackIn_86_0 != 0;
                              } else {
                                var16 = new byte[var14];
                                var13.field_e = var11;
                                var14 = 0;
                                var17 = 0;
                                var18 = 0;
                                L13: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15] = (Object) (Object) var16;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L14: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var19 = var19 + var13.h(46);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L15;
                                          } else {
                                            var21 = var6[var20];
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (param0 != var21) {
                                            break L16;
                                          } else {
                                            cua.a(var10, var17, var16, var14, var19);
                                            var14 = var14 + var19;
                                            break L16;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L17: while (true) {
                                if (var18 >= var5_int) {
                                  var16_int++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var17 = var17 + var13.h(37);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L18;
                                    } else {
                                      var19 = var6[var18];
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (param0 != var19) {
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var18++;
                                  continue L17;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var23.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var12 * var5_int);
                          var13 = new ds(var10);
                          var13.field_e = var11;
                          var14_ref_int__ = new int[var5_int];
                          var15 = 0;
                          L20: while (true) {
                            if (var15 >= var12) {
                              var15_ref_byte____ = new byte[var5_int][];
                              var16_int = 0;
                              L21: while (true) {
                                if (var16_int >= var5_int) {
                                  var13.field_e = var11;
                                  var16_int = 0;
                                  var17 = 0;
                                  L22: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L23: while (true) {
                                        if (var5_int <= var17) {
                                          break L11;
                                        } else {
                                          L24: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L24;
                                            } else {
                                              var18 = var6[var17];
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (0 == ((asb) this).field_h) {
                                              var7[var18] = gfb.a(false, var15_ref_byte____[var17], -12445);
                                              break L25;
                                            } else {
                                              var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                              break L25;
                                            }
                                          }
                                          var17++;
                                          continue L23;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L26: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L22;
                                        } else {
                                          var18 = var18 + var13.h(19);
                                          cua.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var16_int = var16_int + var18;
                                          var19++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                  var14_ref_int__[var16_int] = 0;
                                  var16_int++;
                                  continue L21;
                                }
                              }
                            } else {
                              var16_int = 0;
                              var17 = 0;
                              L27: while (true) {
                                if (var17 >= var5_int) {
                                  var15++;
                                  continue L20;
                                } else {
                                  var16_int = var16_int + var13.h(68);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                  var17++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 == null) {
                            var11 = 0;
                            break L28;
                          } else {
                            var11 = var6[0];
                            break L28;
                          }
                        }
                        if (((asb) this).field_h != 0) {
                          var7[var11] = (Object) (Object) var10;
                          break L11;
                        } else {
                          var7[var11] = gfb.a(false, var23, -12445);
                          return true;
                        }
                      }
                    }
                    stackOut_99_0 = 1;
                    stackIn_100_0 = stackOut_99_0;
                    break L0;
                  } else {
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var5;
            stackOut_101_1 = new StringBuilder().append("asb.F(").append(param0).append(44).append(0).append(44).append(param2).append(44);
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param3 == null) {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L29;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L29;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + 41);
        }
        return stackIn_100_0 != 0;
    }

    asb(fnb param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((asb) this).field_g = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((asb) this).field_e = stackIn_7_1 != 0;
                  ((asb) this).field_h = param2;
                  ((asb) this).field_d = param0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("asb.<init>(");
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
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Teams have been balanced";
        field_f = 1;
    }
}
