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
            Object var4 = null;
            int discarded$0 = ((asb) this).a((String) null, 14);
        }
        if (-2 == (((asb) this).field_g.field_m.length ^ -1)) {
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
        if (!((asb) this).b((byte) 106)) {
            return 0;
        }
        if (param1 != -2118) {
            return 1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((asb) this).field_g.field_a.a(param1 ^ 123456123, vla.a((byte) 120, var4));
        return ((asb) this).a(var3, 1045);
    }

    final int b(String param0, int param1) {
        if (!((asb) this).b((byte) -117)) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 109, var4));
        if (!(this.b((byte) -72, var3))) {
            return -1;
        }
        if (param1 > -69) {
            boolean discarded$0 = ((asb) this).c(((int[]) ((asb) this).field_i[12])[7], ((int[]) ((Object[]) ((asb) this).field_i[2])[2])[7]);
        }
        return var3;
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        Object var27 = null;
        int var28 = 0;
        cna var29 = null;
        cna var30 = null;
        cna[] var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        cna stackIn_32_0 = null;
        cna stackIn_33_0 = null;
        cna stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        cna stackIn_39_0 = null;
        cna stackIn_40_0 = null;
        cna stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        cna stackIn_87_0 = null;
        cna stackIn_88_0 = null;
        cna stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        cna stackIn_94_0 = null;
        boolean stackIn_94_1 = false;
        cna stackIn_95_0 = null;
        boolean stackIn_95_1 = false;
        cna stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        int stackIn_96_2 = 0;
        cna stackIn_98_0 = null;
        cna stackIn_99_0 = null;
        cna stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        cna stackIn_102_0 = null;
        cna stackIn_103_0 = null;
        cna stackIn_104_0 = null;
        cna stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_109_0 = 0;
        cna stackIn_120_0 = null;
        cna stackIn_121_0 = null;
        cna stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        cna stackIn_125_0 = null;
        cna stackIn_126_0 = null;
        cna stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        cna stackIn_129_0 = null;
        cna stackIn_130_0 = null;
        cna stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        cna stackIn_133_0 = null;
        cna stackIn_134_0 = null;
        cna stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        String stackIn_150_0 = null;
        cna stackIn_154_0 = null;
        cna stackIn_155_0 = null;
        cna stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        cna stackIn_157_0 = null;
        cna stackIn_158_0 = null;
        cna stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_223_0 = 0;
        cna stackIn_310_0 = null;
        cna stackIn_311_0 = null;
        cna stackIn_312_0 = null;
        int stackIn_312_1 = 0;
        cna stackIn_316_0 = null;
        boolean stackIn_316_1 = false;
        cna stackIn_317_0 = null;
        boolean stackIn_317_1 = false;
        cna stackIn_318_0 = null;
        boolean stackIn_318_1 = false;
        int stackIn_318_2 = 0;
        cna stackIn_320_0 = null;
        cna stackIn_321_0 = null;
        cna stackIn_322_0 = null;
        cna stackIn_323_0 = null;
        int stackIn_323_1 = 0;
        cna stackIn_325_0 = null;
        cna stackIn_326_0 = null;
        cna stackIn_327_0 = null;
        cna stackIn_328_0 = null;
        int stackIn_328_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        cna stackOut_31_0 = null;
        cna stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        cna stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        cna stackOut_38_0 = null;
        cna stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        cna stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_66_0 = 0;
        cna stackOut_97_0 = null;
        cna stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        cna stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        cna stackOut_93_0 = null;
        boolean stackOut_93_1 = false;
        cna stackOut_95_0 = null;
        boolean stackOut_95_1 = false;
        int stackOut_95_2 = 0;
        cna stackOut_94_0 = null;
        boolean stackOut_94_1 = false;
        int stackOut_94_2 = 0;
        cna stackOut_86_0 = null;
        cna stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        cna stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        cna stackOut_101_0 = null;
        cna stackOut_102_0 = null;
        cna stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        cna stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        Object stackOut_149_0 = null;
        String stackOut_148_0 = null;
        cna stackOut_153_0 = null;
        cna stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        cna stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        cna stackOut_156_0 = null;
        cna stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        cna stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        int stackOut_164_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_212_0 = 0;
        cna stackOut_319_0 = null;
        cna stackOut_320_0 = null;
        cna stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        cna stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        cna stackOut_315_0 = null;
        boolean stackOut_315_1 = false;
        cna stackOut_317_0 = null;
        boolean stackOut_317_1 = false;
        int stackOut_317_2 = 0;
        cna stackOut_316_0 = null;
        boolean stackOut_316_1 = false;
        int stackOut_316_2 = 0;
        cna stackOut_309_0 = null;
        cna stackOut_311_0 = null;
        int stackOut_311_1 = 0;
        cna stackOut_310_0 = null;
        int stackOut_310_1 = 0;
        cna stackOut_324_0 = null;
        cna stackOut_325_0 = null;
        cna stackOut_326_0 = null;
        int stackOut_326_1 = 0;
        cna stackOut_327_0 = null;
        int stackOut_327_1 = 0;
        cna stackOut_119_0 = null;
        cna stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        cna stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        cna stackOut_132_0 = null;
        cna stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        cna stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        cna stackOut_128_0 = null;
        cna stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        cna stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        cna stackOut_124_0 = null;
        cna stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        cna stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        L0: {
          var26 = VoidHunters.field_G;
          if (param2) {
            L1: {
              if (ii.field_h) {
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
              if (nmb.b(param3 + 164)) {
                if (!param1.field_fc) {
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
              if (!param2) {
                var6 = 0;
                L6: while (true) {
                  if (var6 >= 5) {
                    L7: {
                      if (inb.field_q[0][2].field_Q) {
                        if (nmb.b(97)) {
                          lob.field_a = mla.field_r;
                          break L7;
                        } else {
                          lob.field_a = isa.a(oba.field_p, new String[1], 124);
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    if ((ieb.field_o.length ^ -1) <= -3) {
                      L8: {
                        if (param2) {
                          if (-1 != tsa.field_h) {
                            stackOut_53_0 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            break L8;
                          } else {
                            stackOut_52_0 = 0;
                            stackIn_55_0 = stackOut_52_0;
                            break L8;
                          }
                        } else {
                          stackOut_50_0 = 0;
                          stackIn_55_0 = stackOut_50_0;
                          break L8;
                        }
                      }
                      var6 = stackIn_55_0;
                      if (var6 == 0) {
                        break L4;
                      } else {
                        var7 = tsa.field_h;
                        var8_int = 0;
                        L9: while (true) {
                          if (var8_int >= ce.field_o.length) {
                            break L5;
                          } else {
                            ce.field_o[var8_int] = (byte) 0;
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
                        if (0 == inb.field_q[0][var6 + 1].field_o) {
                          break L10;
                        } else {
                          if (param1.field_Cb == var6) {
                            break L10;
                          } else {
                            var5 = 1;
                            param1.field_Cb = var6;
                            break L10;
                          }
                        }
                      }
                    }
                    L11: {
                      stackOut_31_0 = inb.field_q[0][var6 - -1];
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_32_0 = stackOut_31_0;
                      if (var4 == 0) {
                        stackOut_33_0 = (cna) (Object) stackIn_33_0;
                        stackOut_33_1 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        break L11;
                      } else {
                        stackOut_32_0 = (cna) (Object) stackIn_32_0;
                        stackOut_32_1 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        break L11;
                      }
                    }
                    L12: {
                      stackIn_34_0.field_y = stackIn_34_1 != 0;
                      if (ll.field_o) {
                        break L12;
                      } else {
                        if ((var6 ^ -1) == -4) {
                          inb.field_q[0][var6 - -1].field_y = false;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      stackOut_38_0 = inb.field_q[0][1 + var6];
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_39_0 = stackOut_38_0;
                      if (var6 != param1.field_Cb) {
                        stackOut_40_0 = (cna) (Object) stackIn_40_0;
                        stackOut_40_1 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        break L13;
                      } else {
                        stackOut_39_0 = (cna) (Object) stackIn_39_0;
                        stackOut_39_1 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        break L13;
                      }
                    }
                    stackIn_41_0.field_J = stackIn_41_1 != 0;
                    var6++;
                    continue L6;
                  }
                }
              } else {
                if ((ieb.field_o.length ^ -1) <= -3) {
                  L14: {
                    if (param2) {
                      if (-1 != tsa.field_h) {
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
                    var7 = tsa.field_h;
                    var8_int = 0;
                    L15: while (true) {
                      if (var8_int >= ce.field_o.length) {
                        break L5;
                      } else {
                        ce.field_o[var8_int] = (byte) 0;
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
            ce.field_o[var7 / 8] = (byte)knb.a((int) ce.field_o[var7 / 8], 1 << var7 % 8);
            break L4;
          }
          L16: {
            if (!param2) {
              stackOut_62_0 = 0;
              stackIn_63_0 = stackOut_62_0;
              break L16;
            } else {
              stackOut_61_0 = -1;
              stackIn_63_0 = stackOut_61_0;
              break L16;
            }
          }
          var7 = stackIn_63_0;
          L17: while (true) {
            if (var7 >= ieb.field_o.length) {
              break L3;
            } else {
              L18: {
                if (var6 != 0) {
                  if (tsa.field_h != var7) {
                    stackOut_69_0 = 1;
                    stackIn_71_0 = stackOut_69_0;
                    break L18;
                  } else {
                    stackOut_68_0 = 0;
                    stackIn_71_0 = stackOut_68_0;
                    break L18;
                  }
                } else {
                  stackOut_66_0 = 0;
                  stackIn_71_0 = stackOut_66_0;
                  break L18;
                }
              }
              L19: {
                var8_int = stackIn_71_0;
                if (var4 == 0) {
                  break L19;
                } else {
                  if (0 != inb.field_q[1][var7 + 1].field_o) {
                    if (!param2) {
                      var9 = ieb.field_o[var7];
                      if (param1.field_Fb != var9) {
                        var5 = 1;
                        param1.field_Fb = var9;
                        break L19;
                      } else {
                        break L19;
                      }
                    } else {
                      if (var6 == 0) {
                        if (var7 == -1) {
                          var9 = 0;
                          L20: while (true) {
                            if (ce.field_o.length <= var9) {
                              break L19;
                            } else {
                              ce.field_o[var9] = (byte) 0;
                              var9++;
                              continue L20;
                            }
                          }
                        } else {
                          ce.field_o[var7 / 8] = (byte)mgb.a((int) ce.field_o[var7 / 8], 1 << dla.a(7, var7));
                          break L19;
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
                if (param2) {
                  if (0 != (var7 ^ -1)) {
                    L22: {
                      stackOut_97_0 = inb.field_q[1][1 + var7];
                      stackIn_99_0 = stackOut_97_0;
                      stackIn_98_0 = stackOut_97_0;
                      if (-1 == (ce.field_o[var7 / 8] & 1 << (7 & var7) ^ -1)) {
                        stackOut_99_0 = (cna) (Object) stackIn_99_0;
                        stackOut_99_1 = 0;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        break L22;
                      } else {
                        stackOut_98_0 = (cna) (Object) stackIn_98_0;
                        stackOut_98_1 = 1;
                        stackIn_100_0 = stackOut_98_0;
                        stackIn_100_1 = stackOut_98_1;
                        break L22;
                      }
                    }
                    stackIn_100_0.field_J = stackIn_100_1 != 0;
                    break L21;
                  } else {
                    inb.field_q[1][var7 + 1].field_J = true;
                    var9 = 0;
                    L23: while (true) {
                      if (var9 >= ieb.field_o.length) {
                        break L21;
                      } else {
                        L24: {
                          stackOut_93_0 = inb.field_q[1][var7 - -1];
                          stackOut_93_1 = inb.field_q[1][var7 - -1].field_J;
                          stackIn_95_0 = stackOut_93_0;
                          stackIn_95_1 = stackOut_93_1;
                          stackIn_94_0 = stackOut_93_0;
                          stackIn_94_1 = stackOut_93_1;
                          if ((ce.field_o[var9 / 8] & 1 << (7 & var9)) != 0) {
                            stackOut_95_0 = (cna) (Object) stackIn_95_0;
                            stackOut_95_1 = stackIn_95_1;
                            stackOut_95_2 = 0;
                            stackIn_96_0 = stackOut_95_0;
                            stackIn_96_1 = stackOut_95_1;
                            stackIn_96_2 = stackOut_95_2;
                            break L24;
                          } else {
                            stackOut_94_0 = (cna) (Object) stackIn_94_0;
                            stackOut_94_1 = stackIn_94_1;
                            stackOut_94_2 = 1;
                            stackIn_96_0 = stackOut_94_0;
                            stackIn_96_1 = stackOut_94_1;
                            stackIn_96_2 = stackOut_94_2;
                            break L24;
                          }
                        }
                        stackIn_96_0.field_J = stackIn_96_1 & stackIn_96_2 != 0;
                        var9++;
                        continue L23;
                      }
                    }
                  }
                } else {
                  L25: {
                    var9 = ieb.field_o[var7];
                    stackOut_86_0 = inb.field_q[1][1 + var7];
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_87_0 = stackOut_86_0;
                    if (param1.field_Fb != var9) {
                      stackOut_88_0 = (cna) (Object) stackIn_88_0;
                      stackOut_88_1 = 0;
                      stackIn_89_0 = stackOut_88_0;
                      stackIn_89_1 = stackOut_88_1;
                      break L25;
                    } else {
                      stackOut_87_0 = (cna) (Object) stackIn_87_0;
                      stackOut_87_1 = 1;
                      stackIn_89_0 = stackOut_87_0;
                      stackIn_89_1 = stackOut_87_1;
                      break L25;
                    }
                  }
                  stackIn_89_0.field_J = stackIn_89_1 != 0;
                  break L21;
                }
              }
              L26: {
                L27: {
                  stackOut_101_0 = inb.field_q[1][1 + var7];
                  stackIn_104_0 = stackOut_101_0;
                  stackIn_102_0 = stackOut_101_0;
                  if (var4 == 0) {
                    break L27;
                  } else {
                    stackOut_102_0 = (cna) (Object) stackIn_102_0;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_103_0 = stackOut_102_0;
                    if (var8_int != 0) {
                      break L27;
                    } else {
                      stackOut_103_0 = (cna) (Object) stackIn_103_0;
                      stackOut_103_1 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      break L26;
                    }
                  }
                }
                stackOut_104_0 = (cna) (Object) stackIn_104_0;
                stackOut_104_1 = 0;
                stackIn_105_0 = stackOut_104_0;
                stackIn_105_1 = stackOut_104_1;
                break L26;
              }
              stackIn_105_0.field_y = stackIn_105_1 != 0;
              var7++;
              continue L17;
            }
          }
        }
        L28: {
          if (!param2) {
            stackOut_108_0 = 1;
            stackIn_109_0 = stackOut_108_0;
            break L28;
          } else {
            stackOut_107_0 = 0;
            stackIn_109_0 = stackOut_107_0;
            break L28;
          }
        }
        var6 = stackIn_109_0;
        L29: while (true) {
          if (var6 >= 3) {
            L30: {
              if (param3 == -67) {
                break L30;
              } else {
                var27 = null;
                asb.a(-90, (mm) null, true, (byte) -109);
                break L30;
              }
            }
            L31: {
              if (!param2) {
                break L31;
              } else {
                if (nkb.field_r <= 1) {
                  break L31;
                } else {
                  var6 = 0;
                  L32: while (true) {
                    if (var6 >= nkb.field_r - -1) {
                      break L31;
                    } else {
                      L33: {
                        var30 = inb.field_q[3][var6];
                        if (var4 == 0) {
                          break L33;
                        } else {
                          if (0 == var30.field_o) {
                            break L33;
                          } else {
                            imb.field_a = var6;
                            break L33;
                          }
                        }
                      }
                      L34: {
                        if (!var30.field_Q) {
                          break L34;
                        } else {
                          if (var6 <= 0) {
                            break L34;
                          } else {
                            L35: {
                              if (ea.field_k == null) {
                                stackOut_149_0 = null;
                                stackIn_150_0 = (String) (Object) stackOut_149_0;
                                break L35;
                              } else {
                                stackOut_148_0 = ea.field_k[-1 + var6];
                                stackIn_150_0 = stackOut_148_0;
                                break L35;
                              }
                            }
                            var8_ref = stackIn_150_0;
                            if (var8_ref != null) {
                              lob.field_a = var8_ref;
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                        }
                      }
                      L36: {
                        stackOut_153_0 = (cna) var30;
                        stackIn_155_0 = stackOut_153_0;
                        stackIn_154_0 = stackOut_153_0;
                        if (var6 != imb.field_a) {
                          stackOut_155_0 = (cna) (Object) stackIn_155_0;
                          stackOut_155_1 = 0;
                          stackIn_156_0 = stackOut_155_0;
                          stackIn_156_1 = stackOut_155_1;
                          break L36;
                        } else {
                          stackOut_154_0 = (cna) (Object) stackIn_154_0;
                          stackOut_154_1 = 1;
                          stackIn_156_0 = stackOut_154_0;
                          stackIn_156_1 = stackOut_154_1;
                          break L36;
                        }
                      }
                      L37: {
                        stackIn_156_0.field_J = stackIn_156_1 != 0;
                        stackOut_156_0 = (cna) var30;
                        stackIn_158_0 = stackOut_156_0;
                        stackIn_157_0 = stackOut_156_0;
                        if (var4 == 0) {
                          stackOut_158_0 = (cna) (Object) stackIn_158_0;
                          stackOut_158_1 = 0;
                          stackIn_159_0 = stackOut_158_0;
                          stackIn_159_1 = stackOut_158_1;
                          break L37;
                        } else {
                          stackOut_157_0 = (cna) (Object) stackIn_157_0;
                          stackOut_157_1 = 1;
                          stackIn_159_0 = stackOut_157_0;
                          stackIn_159_1 = stackOut_157_1;
                          break L37;
                        }
                      }
                      stackIn_159_0.field_y = stackIn_159_1 != 0;
                      var6++;
                      continue L32;
                    }
                  }
                }
              }
            }
            var6 = 0;
            var7 = 0;
            L38: while (true) {
              if (var7 >= ocb.field_l) {
                L39: {
                  if (var5 == 0) {
                    break L39;
                  } else {
                    if (!param2) {
                      bh.a(param0, true);
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                }
                return;
              } else {
                L40: {
                  var31 = inb.field_q[4 - -var7];
                  var8 = var31;
                  if (!param2) {
                    stackOut_164_0 = 0;
                    stackIn_165_0 = stackOut_164_0;
                    break L40;
                  } else {
                    stackOut_163_0 = -1;
                    stackIn_165_0 = stackOut_163_0;
                    break L40;
                  }
                }
                var9 = stackIn_165_0;
                L41: while (true) {
                  if (var9 >= -1 + var31.length) {
                    var6 = var6 + (255 & vu.field_zb[var7]);
                    var7++;
                    continue L38;
                  } else {
                    L42: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4 == 0) {
                        break L42;
                      } else {
                        if (var9 >= 0) {
                          L43: {
                            if (hia.field_o == null) {
                              break L43;
                            } else {
                              if (hia.field_o[var7] == null) {
                                break L43;
                              } else {
                                if (0 >= ((kbb.field_p ^ -1) & hia.field_o[var7][var9])) {
                                  break L43;
                                } else {
                                  var14 = 1;
                                  var15 = wsb.a(hia.field_o[var7][var9] & (kbb.field_p ^ -1), 1302374146);
                                  break L43;
                                }
                              }
                            }
                          }
                          L44: {
                            if (null == qcb.field_o) {
                              break L44;
                            } else {
                              if (qcb.field_o[var7] == null) {
                                break L44;
                              } else {
                                if (0 < hcb.field_o) {
                                  break L44;
                                } else {
                                  if (!qcb.field_o[var7][var9]) {
                                    break L44;
                                  } else {
                                    var10 = 1;
                                    break L44;
                                  }
                                }
                              }
                            }
                          }
                          L45: {
                            if (null == crb.field_w) {
                              break L45;
                            } else {
                              if (null == crb.field_w[var7]) {
                                break L45;
                              } else {
                                L46: {
                                  var16 = crb.field_w[var7][var9];
                                  if (var16 >= -1) {
                                    break L46;
                                  } else {
                                    if (tg.field_q < var16) {
                                      var12 = 1;
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                                if (-1 == var16) {
                                  break L45;
                                } else {
                                  if (ufa.field_o) {
                                    break L45;
                                  } else {
                                    if ((hcb.field_o ^ -1) < -1) {
                                      break L45;
                                    } else {
                                      var10 = 1;
                                      break L45;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L47: {
                            if (param2) {
                              if (nqa.field_b != null) {
                                if (nqa.field_b[var7] != null) {
                                  if (!nqa.field_b[var7][var9]) {
                                    stackOut_197_0 = 0;
                                    stackIn_198_0 = stackOut_197_0;
                                    break L47;
                                  } else {
                                    stackOut_196_0 = 1;
                                    stackIn_198_0 = stackOut_196_0;
                                    break L47;
                                  }
                                } else {
                                  stackOut_194_0 = 0;
                                  stackIn_198_0 = stackOut_194_0;
                                  break L47;
                                }
                              } else {
                                stackOut_192_0 = 0;
                                stackIn_198_0 = stackOut_192_0;
                                break L47;
                              }
                            } else {
                              stackOut_190_0 = 0;
                              stackIn_198_0 = stackOut_190_0;
                              break L47;
                            }
                          }
                          var13 = stackIn_198_0;
                          if (tab.field_p == null) {
                            break L42;
                          } else {
                            if (tab.field_p[var7] == null) {
                              break L42;
                            } else {
                              L48: {
                                var16 = tab.field_p[var7][var9];
                                if (var16 <= 0) {
                                  break L48;
                                } else {
                                  if (var16 > cla.field_b) {
                                    var11 = 1;
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                              if (0 == var16) {
                                break L42;
                              } else {
                                if (ufa.field_o) {
                                  break L42;
                                } else {
                                  if (0 < hcb.field_o) {
                                    break L42;
                                  } else {
                                    var10 = 1;
                                    break L42;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L42;
                        }
                      }
                    }
                    L49: {
                      if (go.field_p < 2) {
                        break L49;
                      } else {
                        if (!si.field_o[12]) {
                          break L49;
                        } else {
                          var12 = 0;
                          var10 = 0;
                          var14 = 0;
                          var11 = 0;
                          var13 = 0;
                          break L49;
                        }
                      }
                    }
                    L50: {
                      if (var10 == 0) {
                        if (var11 == 0) {
                          if (var12 == 0) {
                            if (var13 == 0) {
                              if (var14 != 0) {
                                stackOut_221_0 = 1;
                                stackIn_223_0 = stackOut_221_0;
                                break L50;
                              } else {
                                stackOut_220_0 = 0;
                                stackIn_223_0 = stackOut_220_0;
                                break L50;
                              }
                            } else {
                              stackOut_218_0 = 1;
                              stackIn_223_0 = stackOut_218_0;
                              break L50;
                            }
                          } else {
                            stackOut_216_0 = 1;
                            stackIn_223_0 = stackOut_216_0;
                            break L50;
                          }
                        } else {
                          stackOut_214_0 = 1;
                          stackIn_223_0 = stackOut_214_0;
                          break L50;
                        }
                      } else {
                        stackOut_212_0 = 1;
                        stackIn_223_0 = stackOut_212_0;
                        break L50;
                      }
                    }
                    L51: {
                      var16 = stackIn_223_0;
                      hrb.field_b = true;
                      if (var16 != 0) {
                        break L51;
                      } else {
                        if (var9 < 0) {
                          break L51;
                        } else {
                          if (null == ncb.field_a) {
                            break L51;
                          } else {
                            L52: {
                              if (!param2) {
                                break L52;
                              } else {
                                if (!ii.field_h) {
                                  break L52;
                                } else {
                                  break L51;
                                }
                              }
                            }
                            L53: {
                              nr.field_p = false;
                              hrb.field_b = false;
                              if (tib.field_i == null) {
                                tib.field_i = new byte[ocb.field_l];
                                mia.field_a = new boolean[ocb.field_l];
                                break L53;
                              } else {
                                break L53;
                              }
                            }
                            var17_int = 0;
                            L54: while (true) {
                              if (var7 <= var17_int) {
                                L55: {
                                  bea.a(var7, var9, param1, -1, 93, param2, 0, -1);
                                  if (2 > go.field_p) {
                                    break L55;
                                  } else {
                                    if (!si.field_o[12]) {
                                      break L55;
                                    } else {
                                      hrb.field_b = true;
                                      break L55;
                                    }
                                  }
                                }
                                if (hrb.field_b) {
                                  break L51;
                                } else {
                                  var16 = 1;
                                  break L51;
                                }
                              } else {
                                mia.field_a[var17_int] = false;
                                var17_int++;
                                continue L54;
                              }
                            }
                          }
                        }
                      }
                    }
                    L56: {
                      var17 = var8[var9 - -1];
                      if (var4 != 0) {
                        if (!param2) {
                          break L56;
                        } else {
                          nkb.field_p[(var6 + var9) / 8] = (byte)dla.a((int) nkb.field_p[(var6 + var9) / 8], 1 << dla.a(var9 + var6, 7) ^ -1);
                          break L56;
                        }
                      } else {
                        if (!param2) {
                          break L56;
                        } else {
                          if (var16 == 0) {
                            break L56;
                          } else {
                            nkb.field_p[(var6 + var9) / 8] = (byte)dla.a((int) nkb.field_p[(var6 + var9) / 8], 1 << dla.a(var9 + var6, 7) ^ -1);
                            break L56;
                          }
                        }
                      }
                    }
                    L57: {
                      if (-1 > var9) {
                        break L57;
                      } else {
                        if (var17.field_Q) {
                          L58: {
                            if (hqb.field_k == null) {
                              var18_ref = null;
                              break L58;
                            } else {
                              if (null == hqb.field_k[var7]) {
                                var18_ref = null;
                                break L58;
                              } else {
                                var18_ref_String = hqb.field_k[var7][var9];
                                break L58;
                              }
                            }
                          }
                          L59: {
                            if (awa.field_o == null) {
                              var19 = null;
                              break L59;
                            } else {
                              if (null != awa.field_o[var7]) {
                                var19_ref = awa.field_o[var7][var9];
                                break L59;
                              } else {
                                var19_ref = null;
                                break L59;
                              }
                            }
                          }
                          L60: {
                            var20 = null;
                            if (var19 == null) {
                              break L60;
                            } else {
                              if (!((String) var19).equals(var18_ref)) {
                                var20 = (String) var19;
                                break L60;
                              } else {
                                break L60;
                              }
                            }
                          }
                          L61: {
                            var21 = null;
                            if (var13 != 0) {
                              var21 = k.field_q;
                              var22 = var21;
                              var25 = var22;
                              var22 = var25;
                              var21 = var22;
                              var22 = var21;
                              break L61;
                            } else {
                              if (var10 != 0) {
                                var21 = bpa.field_d;
                                break L61;
                              } else {
                                L62: {
                                  if (var11 != 0) {
                                    var22_int = tab.field_p[var7][var9] + -cla.field_b;
                                    if (var22_int == 1) {
                                      var21 = wia.field_b;
                                      var32 = var21;
                                      var21 = var32;
                                      var32 = var21;
                                      var21 = var32;
                                      break L62;
                                    } else {
                                      var21 = isa.a(nra.field_a, new String[1], 105);
                                      break L62;
                                    }
                                  } else {
                                    break L62;
                                  }
                                }
                                L63: {
                                  if (var12 == 0) {
                                    break L63;
                                  } else {
                                    var32 = isa.a(gh.field_p, new String[2], 110);
                                    var21 = var32;
                                    var21 = var32;
                                    if (var21 == null) {
                                      var21 = var32;
                                      break L63;
                                    } else {
                                      var21 = var21 + "<br>" + var32;
                                      break L63;
                                    }
                                  }
                                }
                                if (var14 == 0) {
                                  break L61;
                                } else {
                                  L64: {
                                    var22 = lp.field_a;
                                    if (-1 <= (var15 ^ -1)) {
                                      break L64;
                                    } else {
                                      if (mta.field_a == null) {
                                        break L64;
                                      } else {
                                        if (mta.field_a.length < var15) {
                                          break L64;
                                        } else {
                                          if (null == mta.field_a[var15 + -1]) {
                                            break L64;
                                          } else {
                                            var22_ref = mta.field_a[var15 - 1][0];
                                            break L64;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 == null) {
                                    var21 = var22_ref;
                                    break L61;
                                  } else {
                                    var21 = var21 + "<br>" + var22_ref;
                                    break L61;
                                  }
                                }
                              }
                            }
                          }
                          L65: {
                            if (var4 == 0) {
                              break L65;
                            } else {
                              if (!hrb.field_b) {
                                L66: {
                                  var22_ref = null;
                                  var23 = 0;
                                  if (!nr.field_p) {
                                    break L66;
                                  } else {
                                    var22 = "</col>" + uda.field_a + "<col=A00000>";
                                    var25 = var22;
                                    var22 = var25;
                                    var25 = var22;
                                    var22 = var25;
                                    var21 = var22;
                                    break L66;
                                  }
                                }
                                var24 = 0;
                                L67: while (true) {
                                  if (var7 <= var24) {
                                    if (var23 == 0) {
                                      var21 = isa.a(fra.field_c, new String[1], 78);
                                      break L65;
                                    } else {
                                      var21 = nna.field_F + var22;
                                      break L65;
                                    }
                                  } else {
                                    if (mia.field_a[var24]) {
                                      var25 = "</col>" + hva.field_c[var24] + "<col=A00000>";
                                      var22 = var25;
                                      var21 = var22;
                                      var22 = var25;
                                      if (var22 == null) {
                                        var22 = var25;
                                        var21 = var22;
                                        var21 = var22;
                                        var24++;
                                        continue L67;
                                      } else {
                                        var23 = 1;
                                        var22 = var22 + ", " + var25;
                                        var24++;
                                        continue L67;
                                      }
                                    } else {
                                      var24++;
                                      continue L67;
                                    }
                                  }
                                }
                              } else {
                                break L65;
                              }
                            }
                          }
                          L68: {
                            if (var21 == null) {
                              break L68;
                            } else {
                              var21 = "<col=A00000>" + var21;
                              var33 = jd.a(var21, "<br>", 0, "<br><col=A00000>");
                              if (var20 != null) {
                                var20 = var20 + "<br>" + var33;
                                break L68;
                              } else {
                                var20 = var33;
                                break L68;
                              }
                            }
                          }
                          if (var20 == null) {
                            break L57;
                          } else {
                            lob.field_a = var20;
                            break L57;
                          }
                        } else {
                          break L57;
                        }
                      }
                    }
                    L69: {
                      if (!param2) {
                        L70: {
                          L71: {
                            stackOut_319_0 = (cna) var17;
                            stackIn_322_0 = stackOut_319_0;
                            stackIn_320_0 = stackOut_319_0;
                            if (!hrb.field_b) {
                              break L71;
                            } else {
                              stackOut_320_0 = (cna) (Object) stackIn_320_0;
                              stackIn_322_0 = stackOut_320_0;
                              stackIn_321_0 = stackOut_320_0;
                              if ((byte)var9 != param1.field_Pb[var7]) {
                                break L71;
                              } else {
                                stackOut_321_0 = (cna) (Object) stackIn_321_0;
                                stackOut_321_1 = 1;
                                stackIn_323_0 = stackOut_321_0;
                                stackIn_323_1 = stackOut_321_1;
                                break L70;
                              }
                            }
                          }
                          stackOut_322_0 = (cna) (Object) stackIn_322_0;
                          stackOut_322_1 = 0;
                          stackIn_323_0 = stackOut_322_0;
                          stackIn_323_1 = stackOut_322_1;
                          break L70;
                        }
                        stackIn_323_0.field_J = stackIn_323_1 != 0;
                        break L69;
                      } else {
                        if (0 == (var9 ^ -1)) {
                          var17.field_J = true;
                          var28 = var6;
                          var18 = var28;
                          L72: while (true) {
                            if (var28 >= var6 - (-var31.length + 1)) {
                              break L69;
                            } else {
                              L73: {
                                stackOut_315_0 = (cna) var17;
                                stackOut_315_1 = var17.field_J;
                                stackIn_317_0 = stackOut_315_0;
                                stackIn_317_1 = stackOut_315_1;
                                stackIn_316_0 = stackOut_315_0;
                                stackIn_316_1 = stackOut_315_1;
                                if (0 != (nkb.field_p[var28 / 8] & 1 << (var28 & 7))) {
                                  stackOut_317_0 = (cna) (Object) stackIn_317_0;
                                  stackOut_317_1 = stackIn_317_1;
                                  stackOut_317_2 = 0;
                                  stackIn_318_0 = stackOut_317_0;
                                  stackIn_318_1 = stackOut_317_1;
                                  stackIn_318_2 = stackOut_317_2;
                                  break L73;
                                } else {
                                  stackOut_316_0 = (cna) (Object) stackIn_316_0;
                                  stackOut_316_1 = stackIn_316_1;
                                  stackOut_316_2 = 1;
                                  stackIn_318_0 = stackOut_316_0;
                                  stackIn_318_1 = stackOut_316_1;
                                  stackIn_318_2 = stackOut_316_2;
                                  break L73;
                                }
                              }
                              stackIn_318_0.field_J = stackIn_318_1 & stackIn_318_2 != 0;
                              var28++;
                              continue L72;
                            }
                          }
                        } else {
                          L74: {
                            stackOut_309_0 = (cna) var17;
                            stackIn_311_0 = stackOut_309_0;
                            stackIn_310_0 = stackOut_309_0;
                            if (-1 == (nkb.field_p[(var6 - -var9) / 8] & 1 << (var9 + var6 & 7) ^ -1)) {
                              stackOut_311_0 = (cna) (Object) stackIn_311_0;
                              stackOut_311_1 = 0;
                              stackIn_312_0 = stackOut_311_0;
                              stackIn_312_1 = stackOut_311_1;
                              break L74;
                            } else {
                              stackOut_310_0 = (cna) (Object) stackIn_310_0;
                              stackOut_310_1 = 1;
                              stackIn_312_0 = stackOut_310_0;
                              stackIn_312_1 = stackOut_310_1;
                              break L74;
                            }
                          }
                          stackIn_312_0.field_J = stackIn_312_1 != 0;
                          break L69;
                        }
                      }
                    }
                    L75: {
                      L76: {
                        stackOut_324_0 = (cna) var17;
                        stackIn_327_0 = stackOut_324_0;
                        stackIn_325_0 = stackOut_324_0;
                        if (var4 == 0) {
                          break L76;
                        } else {
                          stackOut_325_0 = (cna) (Object) stackIn_325_0;
                          stackIn_327_0 = stackOut_325_0;
                          stackIn_326_0 = stackOut_325_0;
                          if (var16 != 0) {
                            break L76;
                          } else {
                            stackOut_326_0 = (cna) (Object) stackIn_326_0;
                            stackOut_326_1 = 1;
                            stackIn_328_0 = stackOut_326_0;
                            stackIn_328_1 = stackOut_326_1;
                            break L75;
                          }
                        }
                      }
                      stackOut_327_0 = (cna) (Object) stackIn_327_0;
                      stackOut_327_1 = 0;
                      stackIn_328_0 = stackOut_327_0;
                      stackIn_328_1 = stackOut_327_1;
                      break L75;
                    }
                    stackIn_328_0.field_y = stackIn_328_1 != 0;
                    var9++;
                    continue L41;
                  }
                }
              }
            }
          } else {
            L77: {
              var29 = inb.field_q[2][var6];
              if (var4 == 0) {
                break L77;
              } else {
                if (var29.field_o == 0) {
                  break L77;
                } else {
                  if (!param2) {
                    if (param1.field_Bb == var6) {
                      break L77;
                    } else {
                      var5 = 1;
                      param1.field_Bb = var6;
                      break L77;
                    }
                  } else {
                    if (0 != var6) {
                      qd.field_d = qd.field_d ^ var6;
                      break L77;
                    } else {
                      qd.field_d = 0;
                      break L77;
                    }
                  }
                }
              }
            }
            L78: {
              stackOut_119_0 = (cna) var29;
              stackIn_121_0 = stackOut_119_0;
              stackIn_120_0 = stackOut_119_0;
              if (var4 == 0) {
                stackOut_121_0 = (cna) (Object) stackIn_121_0;
                stackOut_121_1 = 0;
                stackIn_122_0 = stackOut_121_0;
                stackIn_122_1 = stackOut_121_1;
                break L78;
              } else {
                stackOut_120_0 = (cna) (Object) stackIn_120_0;
                stackOut_120_1 = 1;
                stackIn_122_0 = stackOut_120_0;
                stackIn_122_1 = stackOut_120_1;
                break L78;
              }
            }
            stackIn_122_0.field_y = stackIn_122_1 != 0;
            if (!param2) {
              L79: {
                stackOut_132_0 = (cna) var29;
                stackIn_134_0 = stackOut_132_0;
                stackIn_133_0 = stackOut_132_0;
                if (0 == (var6 & param1.field_Bb)) {
                  stackOut_134_0 = (cna) (Object) stackIn_134_0;
                  stackOut_134_1 = 0;
                  stackIn_135_0 = stackOut_134_0;
                  stackIn_135_1 = stackOut_134_1;
                  break L79;
                } else {
                  stackOut_133_0 = (cna) (Object) stackIn_133_0;
                  stackOut_133_1 = 1;
                  stackIn_135_0 = stackOut_133_0;
                  stackIn_135_1 = stackOut_133_1;
                  break L79;
                }
              }
              stackIn_135_0.field_J = stackIn_135_1 != 0;
              var6++;
              continue L29;
            } else {
              if (-1 != (var6 ^ -1)) {
                L80: {
                  stackOut_128_0 = (cna) var29;
                  stackIn_130_0 = stackOut_128_0;
                  stackIn_129_0 = stackOut_128_0;
                  if ((qd.field_d & var6) == 0) {
                    stackOut_130_0 = (cna) (Object) stackIn_130_0;
                    stackOut_130_1 = 0;
                    stackIn_131_0 = stackOut_130_0;
                    stackIn_131_1 = stackOut_130_1;
                    break L80;
                  } else {
                    stackOut_129_0 = (cna) (Object) stackIn_129_0;
                    stackOut_129_1 = 1;
                    stackIn_131_0 = stackOut_129_0;
                    stackIn_131_1 = stackOut_129_1;
                    break L80;
                  }
                }
                stackIn_131_0.field_J = stackIn_131_1 != 0;
                var6++;
                continue L29;
              } else {
                L81: {
                  stackOut_124_0 = (cna) var29;
                  stackIn_126_0 = stackOut_124_0;
                  stackIn_125_0 = stackOut_124_0;
                  if (0 != qd.field_d) {
                    stackOut_126_0 = (cna) (Object) stackIn_126_0;
                    stackOut_126_1 = 0;
                    stackIn_127_0 = stackOut_126_0;
                    stackIn_127_1 = stackOut_126_1;
                    break L81;
                  } else {
                    stackOut_125_0 = (cna) (Object) stackIn_125_0;
                    stackOut_125_1 = 1;
                    stackIn_127_0 = stackOut_125_0;
                    stackIn_127_1 = stackOut_125_1;
                    break L81;
                  }
                }
                stackIn_127_0.field_J = stackIn_127_1 != 0;
                var6++;
                continue L29;
              }
            }
          }
        }
    }

    final int a(boolean param0, int param1, String param2) {
        if (!(this.b((byte) 127, param1))) {
            return -1;
        }
        param2 = param2.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param2;
        int var4 = ((asb) this).field_g.field_p[param1].a(-123454015, vla.a((byte) 122, var5));
        if (!param0) {
            return 78;
        }
        if (!(this.a(var4, param1, 0))) {
            return -1;
        }
        return var4;
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
        if (!param1) {
            ((asb) this).field_e = ((boolean[]) ((Object[]) ((asb) this).field_i[30])[11])[9];
        }
        if (!((asb) this).b((byte) -77)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 114, var6));
        if (!this.b((byte) -28, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((asb) this).field_g.field_p[var4].a(-123454015, vla.a((byte) 116, var7));
        return ((asb) this).a(var4, var5, (byte) 13);
    }

    final boolean a(int param0, String param1) {
        if (!((asb) this).b((byte) 116)) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = ((asb) this).field_g.field_a.a(param0 + -123486186, vla.a((byte) 127, var5));
        if (param0 != 32171) {
            Object var4 = null;
            boolean discarded$0 = ((asb) this).a(-117, (String) null);
        }
        return ((asb) this).c(121, var3);
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
        if (!((asb) this).b((byte) 77)) {
            return false;
        }
        if (!param0) {
            return ((boolean[]) ((Object[]) ((asb) this).field_i[13])[2])[12];
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 108, var4));
        if (var3 < 0) {
            return false;
        }
        return true;
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
            if (param3 >= -68) {
                Object var7 = null;
                asb.a(-105, (String) null, (byte[]) null, 12, (String) null);
            }
            File var5 = new File("//contentfs/mgcontent_v4/WIP/voidhunters/src/freelevels/" + param4 + param1);
            try {
                oj.a(var5, 3, param2, param0);
            } catch (IOException iOException) {
                iOException.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        byte[] var6_array = null;
        byte[] var8 = null;
        var5 = -73 % ((param1 - 20) / 48);
        if (this.a(param3, param0, 0)) {
          L0: {
            L1: {
              var6 = null;
              if (null == ((asb) this).field_c[param0]) {
                break L1;
              } else {
                if (null == ((asb) this).field_c[param0][param3]) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (!this.a(param3, 0, param0, param2)) {
              this.a((byte) -78, param0);
              if (this.a(param3, 0, param0, param2)) {
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (null != ((asb) this).field_c[param0]) {
            L2: {
              if (((asb) this).field_c[param0][param3] == null) {
                break L2;
              } else {
                var8 = ffb.a(false, ((asb) this).field_c[param0][param3], true);
                var6_array = var8;
                if (var8 == null) {
                  throw new RuntimeException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var6_array != null) {
                if (((asb) this).field_h == 1) {
                  ((asb) this).field_c[param0][param3] = null;
                  if ((((asb) this).field_g.field_m[param0] ^ -1) != -2) {
                    break L3;
                  } else {
                    ((asb) this).field_c[param0] = null;
                    break L3;
                  }
                } else {
                  if (2 != ((asb) this).field_h) {
                    break L3;
                  } else {
                    ((asb) this).field_c[param0] = null;
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            return var6_array;
          } else {
            throw new RuntimeException("");
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = -114 % ((param0 - 25) / 54);
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
        Object var5 = null;
        if (((asb) this).b((byte) 83)) {
          L0: {
            if ((param1 ^ -1) > -1) {
              break L0;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                if (param1 >= ((asb) this).field_g.field_m.length) {
                  break L0;
                } else {
                  if (param0 < ((asb) this).field_g.field_m[param1]) {
                    if (param2 == 0) {
                      return true;
                    } else {
                      var5 = null;
                      boolean discarded$2 = ((asb) this).a(((int[]) ((asb) this).field_i[0])[0], (String) null);
                      return true;
                    }
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
        if (!(((asb) this).b((byte) -106))) {
            return false;
        }
        param2 = param2.toLowerCase();
        if (param0 != -107) {
            ((asb) this).field_c = (Object[][]) ((Object[]) ((Object[]) ((asb) this).field_i[6])[6])[0];
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 127, var6));
        if (-1 < (var4 ^ -1)) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((asb) this).field_g.field_p[var4].a(-123454015, vla.a((byte) 123, var7));
        if (-1 < (var5 ^ -1)) {
            return false;
        }
        return true;
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 != 13) {
            return (byte[]) ((asb) this).field_i[0];
        }
        return this.a(param0, -83, (int[]) null, param1);
    }

    final boolean a(boolean param0, String param1, String param2) {
        if (!(((asb) this).b((byte) 82))) {
            return false;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        if (param0) {
            ((asb) this).field_c = null;
        }
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((asb) this).field_g.field_a.a(-123454015, vla.a((byte) 120, var6));
        if (!(this.b((byte) 125, var4))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((asb) this).field_g.field_p[var4].a(-123454015, vla.a((byte) 108, var7));
        return ((asb) this).a((byte) 84, var5, var4);
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
        if (-2 == (((asb) this).field_g.field_m[param0] ^ -1)) {
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
              if (-1 > (((asb) this).field_g.field_j[var4] ^ -1)) {
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
        int var5 = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        ds var26 = null;
        byte[] var27 = null;
        ds var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ds var32 = null;
        int[] var34 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var42 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int[] var47 = null;
        byte[][] var48 = null;
        int[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        int[] var55 = null;
        byte[][] var56 = null;
        byte[] var57 = null;
        var22 = VoidHunters.field_G;
        if (!this.b((byte) 120, param2)) {
          return false;
        } else {
          if (null == ((asb) this).field_i[param2]) {
            return false;
          } else {
            L0: {
              var5 = ((asb) this).field_g.field_j[param2];
              var50 = ((asb) this).field_g.field_g[param2];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (null == ((asb) this).field_c[param2]) {
                ((asb) this).field_c[param2] = new Object[((asb) this).field_g.field_m[param2]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((asb) this).field_c[param2];
            var8 = 1;
            var9_int = 0;
            L1: while (true) {
              L2: {
                if (var9_int >= var5) {
                  break L2;
                } else {
                  L3: {
                    if (var6 == null) {
                      var10 = var9_int;
                      break L3;
                    } else {
                      var10 = var50[var9_int];
                      break L3;
                    }
                  }
                  if (var7[var10] == null) {
                    var8 = 0;
                    break L2;
                  } else {
                    var9_int++;
                    continue L1;
                  }
                }
              }
              if (var8 == 0) {
                L4: {
                  L5: {
                    if (param3 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param3[0] != 0) {
                          break L6;
                        } else {
                          if (param3[1] != 0) {
                            break L6;
                          } else {
                            if (param3[2] != 0) {
                              break L6;
                            } else {
                              if (0 == param3[3]) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var51 = ffb.a(true, ((asb) this).field_i[param2], true);
                      var26 = new ds(var51);
                      var26.a(5, param3, var26.field_h.length, false);
                      var52 = var51;
                      break L4;
                    }
                  }
                  var52 = ffb.a(false, ((asb) this).field_i[param2], true);
                  var44 = var52;
                  var36 = var44;
                  var9 = var36;
                  break L4;
                }
                L7: {
                  var53 = rob.a(param1, var52);
                  var45 = var53;
                  var37 = var45;
                  var27 = var37;
                  var23 = var27;
                  var54 = var23;
                  if (!((asb) this).field_e) {
                    break L7;
                  } else {
                    ((asb) this).field_i[param2] = null;
                    break L7;
                  }
                }
                L8: {
                  if (1 < var5) {
                    var53 = var45;
                    if (((asb) this).field_h == 2) {
                      var53 = var45;
                      var11 = var53.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var12 * var5 * 4;
                      var32 = new ds(var54);
                      var14 = 0;
                      var15 = 0;
                      var32.field_e = var11;
                      var16 = 0;
                      L9: while (true) {
                        if (var12 <= var16) {
                          if (var14 == 0) {
                            return true;
                          } else {
                            var57 = new byte[var14];
                            var32.field_e = var11;
                            var14 = 0;
                            var17 = 0;
                            var18 = 0;
                            L10: while (true) {
                              if (var12 <= var18) {
                                var7[var15] = (Object) (Object) var57;
                                break L8;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L11: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L10;
                                  } else {
                                    L12: {
                                      var19 = var19 + var32.h(46);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L12;
                                      } else {
                                        var21 = var50[var20];
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (param0 != var21) {
                                        break L13;
                                      } else {
                                        cua.a(var54, var17, var57, var14, var19);
                                        var14 = var14 + var19;
                                        break L13;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L14: while (true) {
                            if (var18 >= var5) {
                              var16++;
                              continue L9;
                            } else {
                              L15: {
                                var17 = var17 + var32.h(param1 + 37);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L15;
                                } else {
                                  var19 = var50[var18];
                                  break L15;
                                }
                              }
                              if (param0 == var19) {
                                var15 = var19;
                                var14 = var14 + var17;
                                var18++;
                                continue L14;
                              } else {
                                var18++;
                                continue L14;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var53.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * (var12 * var5);
                      var29 = new ds(var54);
                      var29.field_e = var11;
                      var55 = new int[var5];
                      var47 = var55;
                      var39 = var47;
                      var30 = var39;
                      var14_ref_int__ = var30;
                      var15 = 0;
                      L16: while (true) {
                        if (var15 >= var12) {
                          var56 = new byte[var5][];
                          var48 = var56;
                          var40 = var48;
                          var31 = var40;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L17: while (true) {
                            if (var16 >= var5) {
                              var29.field_e = var11;
                              var16 = 0;
                              var17 = 0;
                              L18: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L19: while (true) {
                                    if (var5 <= var17) {
                                      break L8;
                                    } else {
                                      L20: {
                                        if (var6 == null) {
                                          var18 = var17;
                                          break L20;
                                        } else {
                                          var18 = var50[var17];
                                          break L20;
                                        }
                                      }
                                      if (0 == ((asb) this).field_h) {
                                        var7[var18] = gfb.a(false, var56[var17], -12445);
                                        var17++;
                                        continue L19;
                                      } else {
                                        var7[var18] = (Object) (Object) var56[var17];
                                        var17++;
                                        continue L19;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L21: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L18;
                                    } else {
                                      var18 = var18 + var29.h(param1 ^ 19);
                                      cua.a(var54, var16, var56[var19], var55[var19], var18);
                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                      var16 = var16 + var18;
                                      var19++;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15_ref_byte____[var16] = new byte[var55[var16]];
                              var55[var16] = 0;
                              var16++;
                              continue L17;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L22: while (true) {
                            if (var17 >= var5) {
                              var15++;
                              continue L16;
                            } else {
                              var16 = var16 + var29.h(68);
                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                              var17++;
                              continue L22;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L23: {
                      if (var6 == null) {
                        var11 = 0;
                        break L23;
                      } else {
                        var11 = var50[0];
                        break L23;
                      }
                    }
                    if (((asb) this).field_h != 0) {
                      var7[var11] = (Object) (Object) var54;
                      break L8;
                    } else {
                      var7[var11] = gfb.a(false, var53, -12445);
                      return true;
                    }
                  }
                }
                return true;
              } else {
                return true;
              }
            }
          }
        }
    }

    asb(fnb param0, boolean param1, int param2) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          ((asb) this).field_g = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              ((asb) this).field_e = stackIn_6_1 != 0;
              ((asb) this).field_h = param2;
              ((asb) this).field_d = param0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Teams have been balanced";
        field_f = 1;
    }
}
