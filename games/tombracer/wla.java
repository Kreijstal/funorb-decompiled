/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wla extends jea {
    private jea field_zb;
    private int field_Gb;
    private jea[] field_yb;
    private jea field_xb;
    private jea field_Fb;
    private jea field_Bb;
    private jea field_tb;
    static ur field_Eb;
    long field_Db;
    static int field_ub;
    private jea field_wb;
    private StringBuilder field_vb;
    private ta field_Ab;
    static volatile boolean field_Cb;

    private final int a(int param0, int param1, jea param2, int param3, jea param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            param0 += 8;
            if (param1 == 13) {
              var6_int = param4.field_H.a(param4.field_r, -(2 * param4.field_x) + param3, param4.field_P);
              param4.a(param3, var6_int, -23776, param0, 0);
              param0 = param0 + (var6_int - 0);
              param2.b(-125, param4);
              stackOut_3_0 = param0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -113;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6);
            stackOut_5_1 = new StringBuilder().append("wla.D(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(boolean param0) {
        field_Eb = null;
        if (!param0) {
            field_Cb = true;
        }
    }

    final String f(int param0) {
        int var2 = -32 / ((-45 - param0) / 61);
        return this.field_vb.toString();
    }

    wla(int param0, int param1, int param2, int param3, int param4, jea param5, jea param6, jea param7, jea param8, ta param9, jea param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        RuntimeException var15 = null;
        int var15_int = 0;
        jea[] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        jea[] var28 = null;
        Object stackIn_5_0 = null;
        ta stackIn_5_1 = null;
        ta stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        ta stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        ta stackIn_6_1 = null;
        ta stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        ta stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        ta stackIn_7_1 = null;
        ta stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        ta stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        ta stackIn_8_1 = null;
        ta stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        ta stackIn_8_4 = null;
        String stackIn_8_5 = null;
        Object stackIn_12_0 = null;
        String stackIn_12_1 = null;
        jea stackIn_14_0 = null;
        jea stackIn_15_0 = null;
        jea stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_19_0 = null;
        String stackIn_19_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        ta stackOut_4_1 = null;
        ta stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        ta stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        ta stackOut_5_1 = null;
        ta stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        ta stackOut_5_4 = null;
        Object stackOut_6_0 = null;
        ta stackOut_6_1 = null;
        ta stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        ta stackOut_6_4 = null;
        String stackOut_6_5 = null;
        Object stackOut_7_0 = null;
        ta stackOut_7_1 = null;
        ta stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        ta stackOut_7_4 = null;
        String stackOut_7_5 = null;
        Object stackOut_11_0 = null;
        String stackOut_11_1 = null;
        jea stackOut_13_0 = null;
        jea stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        jea stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_18_0 = null;
        String stackOut_18_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var27 = TombRacer.field_G ? 1 : 0;
        this.field_Gb = -2;
        try {
          L0: {
            L1: {
              L2: {
                this.field_Db = param12;
                this.field_zb = new jea(0L, param6, gfa.field_m.toUpperCase());
                this.field_zb.field_z = 1;
                this.b(-126, this.field_zb);
                this.field_Fb = new jea(0L, param7);
                this.field_zb.b(-123, this.field_Fb);
                this.field_wb = new jea(0L, (jea) null);
                this.b(-127, this.field_wb);
                if (param11 == null) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      this.field_Bb = new jea(0L, param8, fpa.field_a);
                      this.field_Bb.field_ib = 11184810;
                      this.field_Bb.field_z = 1;
                      this.field_wb.b(-122, this.field_Bb);
                      this.field_tb = new jea(0L, param8, nla.field_b);
                      this.field_tb.field_ib = 11184810;
                      this.field_tb.field_z = 1;
                      this.field_wb.b(-122, this.field_tb);
                      this.field_xb = new jea(0L, param8);
                      this.field_xb.field_ib = 16764006;
                      this.field_wb.b(-125, this.field_xb);
                      this.field_xb.field_sb = "|";
                      if (rja.field_e >= 5) {
                        break L4;
                      } else {
                        if (ld.field_e < 2) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      L6: {
                        stackOut_4_0 = this;
                        stackOut_4_1 = null;
                        stackOut_4_2 = null;
                        stackOut_4_3 = 0L;
                        stackOut_4_4 = (ta) (param9);
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        stackIn_7_3 = stackOut_4_3;
                        stackIn_7_4 = stackOut_4_4;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        stackIn_5_3 = stackOut_4_3;
                        stackIn_5_4 = stackOut_4_4;
                        if (-8 >= (rja.field_e ^ -1)) {
                          break L6;
                        } else {
                          stackOut_5_0 = this;
                          stackOut_5_1 = null;
                          stackOut_5_2 = null;
                          stackOut_5_3 = stackIn_5_3;
                          stackOut_5_4 = (ta) ((Object) stackIn_5_4);
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_7_2 = stackOut_5_2;
                          stackIn_7_3 = stackOut_5_3;
                          stackIn_7_4 = stackOut_5_4;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          stackIn_6_2 = stackOut_5_2;
                          stackIn_6_3 = stackOut_5_3;
                          stackIn_6_4 = stackOut_5_4;
                          if (-3 >= (ld.field_e ^ -1)) {
                            break L6;
                          } else {
                            stackOut_6_0 = this;
                            stackOut_6_1 = null;
                            stackOut_6_2 = null;
                            stackOut_6_3 = stackIn_6_3;
                            stackOut_6_4 = (ta) ((Object) stackIn_6_4);
                            stackOut_6_5 = pl.field_c;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            stackIn_8_3 = stackOut_6_3;
                            stackIn_8_4 = stackOut_6_4;
                            stackIn_8_5 = stackOut_6_5;
                            break L5;
                          }
                        }
                      }
                      stackOut_7_0 = this;
                      stackOut_7_1 = null;
                      stackOut_7_2 = null;
                      stackOut_7_3 = stackIn_7_3;
                      stackOut_7_4 = (ta) ((Object) stackIn_7_4);
                      stackOut_7_5 = ur.field_b;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      stackIn_8_3 = stackOut_7_3;
                      stackIn_8_4 = stackOut_7_4;
                      stackIn_8_5 = stackOut_7_5;
                      break L5;
                    }
                    ((wla) (this)).field_Ab = new ta(stackIn_8_3, stackIn_8_4, stackIn_8_5);
                    this.field_wb.b(-125, this.field_Ab);
                    break L3;
                  }
                  var28 = new jea[3];
                  var15_array = var28;
                  var28[0] = new jea(0L, (jea) null);
                  this.field_wb.b(-123, var28[0]);
                  var28[1] = new jea(0L, (jea) null);
                  this.field_wb.b(-122, var28[1]);
                  var28[2] = new jea(0L, (jea) null);
                  this.field_wb.b(-127, var28[2]);
                  this.field_yb = new jea[rh.field_n];
                  var16 = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (rh.field_n <= var16) {
                          break L9;
                        } else {
                          stackOut_11_0 = null;
                          stackOut_11_1 = aca.field_h[var16];
                          stackIn_19_0 = stackOut_11_0;
                          stackIn_19_1 = stackOut_11_1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          if (var27 != 0) {
                            break L8;
                          } else {
                            L10: {
                              if (stackIn_12_0 == stackIn_12_1) {
                                break L10;
                              } else {
                                L11: {
                                  this.field_yb[var16] = new jea(0L, param10, aca.field_h[var16]);
                                  this.field_yb[var16].field_z = 0;
                                  stackOut_13_0 = this.field_yb[var16];
                                  stackIn_15_0 = stackOut_13_0;
                                  stackIn_14_0 = stackOut_13_0;
                                  if (param11 == null) {
                                    stackOut_15_0 = (jea) ((Object) stackIn_15_0);
                                    stackOut_15_1 = 0;
                                    stackIn_16_0 = stackOut_15_0;
                                    stackIn_16_1 = stackOut_15_1;
                                    break L11;
                                  } else {
                                    stackOut_14_0 = (jea) ((Object) stackIn_14_0);
                                    stackOut_14_1 = 1;
                                    stackIn_16_0 = stackOut_14_0;
                                    stackIn_16_1 = stackOut_14_1;
                                    break L11;
                                  }
                                }
                                stackIn_16_0.field_X = stackIn_16_1 != 0;
                                this.field_wb.b(-128, this.field_yb[var16]);
                                break L10;
                              }
                            }
                            var16++;
                            if (var27 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      this.field_vb = new StringBuilder(12);
                      stackOut_18_0 = null;
                      stackOut_18_1 = (String) (param11);
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L8;
                    }
                    L12: {
                      if (stackIn_19_0 == stackIn_19_1) {
                        break L12;
                      } else {
                        discarded$1 = this.field_vb.append(param11);
                        break L12;
                      }
                    }
                    L13: {
                      var16 = 0;
                      var17 = param6.field_H.b(ai.field_c);
                      if (var17 <= var16) {
                        break L13;
                      } else {
                        var16 = var17;
                        break L13;
                      }
                    }
                    L14: {
                      var17 = param6.field_H.b(qba.field_b);
                      if (var16 >= var17) {
                        break L14;
                      } else {
                        var16 = var17;
                        break L14;
                      }
                    }
                    L15: {
                      var17 = param6.field_H.b(lo.field_o);
                      if (var17 <= var16) {
                        break L15;
                      } else {
                        var16 = var17;
                        break L15;
                      }
                    }
                    var17 = 0;
                    L16: while (true) {
                      L17: {
                        L18: {
                          if (var17 >= rh.field_n) {
                            break L18;
                          } else {
                            if (var27 != 0) {
                              break L17;
                            } else {
                              L19: {
                                if (this.field_yb[var17] == null) {
                                  break L19;
                                } else {
                                  var18 = this.field_yb[var17].b((byte) 69);
                                  if (var18 <= var16) {
                                    break L19;
                                  } else {
                                    var16 = var18;
                                    break L19;
                                  }
                                }
                              }
                              var17++;
                              if (var27 == 0) {
                                continue L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        L20: {
                          if (var16 <= 140) {
                            break L20;
                          } else {
                            var16 = 140;
                            break L20;
                          }
                        }
                        var17 = 0;
                        break L17;
                      }
                      L21: {
                        var18 = 0;
                        var18 = 0;
                        var18 = this.a(param6, ai.field_c, var16, var18, 8421504, var28[0]);
                        var18 = this.a(var18, 13, var28[0], var16, this.field_yb[6]);
                        var18 = this.a(var18, 13, var28[0], var16, this.field_yb[9]);
                        var18 = this.a(var18, 13, var28[0], var16, this.field_yb[5]);
                        var18 = this.a(var18, 13, var28[0], var16, this.field_yb[7]);
                        var18 = this.a(var18, 13, var28[0], var16, this.field_yb[15]);
                        var18 = this.a(var18, 13, var28[0], var16, this.field_yb[4]);
                        if (var18 <= var17) {
                          break L21;
                        } else {
                          var17 = var18;
                          break L21;
                        }
                      }
                      L22: {
                        var18 = 0;
                        var18 = this.a(param6, qba.field_b, var16, var18, 8421504, var28[1]);
                        var18 = this.a(var18, 13, var28[1], var16, this.field_yb[16]);
                        var18 = this.a(var18, 13, var28[1], var16, this.field_yb[17]);
                        var18 = this.a(var18, 13, var28[1], var16, this.field_yb[18]);
                        var18 = this.a(var18, 13, var28[1], var16, this.field_yb[19]);
                        var18 = this.a(var18, 13, var28[1], var16, this.field_yb[20]);
                        if (var18 <= var17) {
                          break L22;
                        } else {
                          var17 = var18;
                          break L22;
                        }
                      }
                      L23: {
                        var18 = 0;
                        var18 = this.a(param6, lo.field_o, var16, var18, 8421504, var28[2]);
                        var18 = this.a(var18, 13, var28[2], var16, this.field_yb[13]);
                        var18 = this.a(var18, 13, var28[2], var16, this.field_yb[21]);
                        var18 = this.a(var18, 13, var28[2], var16, this.field_yb[11]);
                        if (var17 >= var18) {
                          break L23;
                        } else {
                          var17 = var18;
                          break L23;
                        }
                      }
                      L24: {
                        var19 = 26 + 3 * var16;
                        var20 = this.field_zb.b((byte) 69);
                        if (var19 >= var20) {
                          break L24;
                        } else {
                          var19 = var20;
                          break L24;
                        }
                      }
                      L25: {
                        if (null == this.field_Ab) {
                          break L25;
                        } else {
                          var20 = this.field_Ab.a((byte) 95, 4);
                          if (var20 <= var19) {
                            break L25;
                          } else {
                            var19 = var20;
                            break L25;
                          }
                        }
                      }
                      L26: {
                        this.field_zb.a(13 + (13 - -var19), 24, -23776, 0, 0);
                        this.field_Fb.a(15, 15, -23776, 5, -20 + this.field_zb.field_G);
                        var21 = 10;
                        this.field_Bb.a(var19, 2 * di.field_a, -23776, var21, 13);
                        var21 = var21 + di.field_a * 2;
                        this.field_tb.a(var19, 2 * di.field_a, -23776, var21, 13);
                        var21 = var21 + (10 + 2 * di.field_a);
                        this.field_xb.a(0, di.field_a, -23776, var21, 0);
                        var21 = var21 + (di.field_a + 10);
                        if (null == this.field_Ab) {
                          break L26;
                        } else {
                          var20 = this.field_Ab.a((byte) 95, 4);
                          this.field_Ab.a(var20, var21, (byte) -110, 4, di.field_a, 13 - -((-var20 + var19) / 2));
                          var21 = var21 + (10 + di.field_a);
                          break L26;
                        }
                      }
                      var28[0].a(var16, var17, -23776, var21, 13);
                      var28[1].a(var16, var17, -23776, var21, 13 + (13 - -var16));
                      var28[2].a(var16, var17, -23776, var21, 26 + (2 * var16 + 13));
                      var22 = var21;
                      this.field_wb.a(var19 + 26, 10 + (var17 + var22), -23776, 24, 0);
                      this.field_wb.field_w = hca.c(this.field_wb.field_t, 2105376, 3, 11579568, -125, 8421504);
                      var23 = 13 + (13 - -var19);
                      var24 = 10 + var17 + (var22 + 24);
                      var25 = bt.a((byte) -8, var23, param2, param0);
                      var26 = hsa.a(param3, var24, param1, (byte) -99);
                      this.a(var23, var24, -23776, var26, var25);
                      if (var27 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              this.field_Bb = new jea(0L, param8, rh.field_r);
              this.field_Bb.field_z = 1;
              this.field_Bb.field_ib = 11184810;
              this.field_wb.b(-126, this.field_Bb);
              var15_int = 226;
              var16 = 10;
              var17 = this.field_Bb.field_H.a(this.field_Bb.field_r, var15_int);
              this.field_Bb.a(var15_int, di.field_a * var17, -23776, var16, 13);
              var16 = var16 + var17 * di.field_a;
              this.field_wb.a(26 + var15_int, var16 + 10, -23776, 24, 0);
              this.field_wb.field_w = hca.c(this.field_wb.field_t, 2105376, 3, 11579568, -121, 8421504);
              var18 = 13 + var15_int + 13;
              var19 = var16 + 34;
              var20 = bt.a((byte) -8, var18, param2, param0);
              var21 = hsa.a(param3, var19, param1, (byte) 53);
              this.a(var18, var19, -23776, var21, var20);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var15 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) (var15);
            stackOut_53_1 = new StringBuilder().append("wla.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param5 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L27;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L27;
            }
          }
          L28: {
            stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',');
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param6 == null) {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L28;
            } else {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L28;
            }
          }
          L29: {
            stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',');
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param7 == null) {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L29;
            } else {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L29;
            }
          }
          L30: {
            stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param8 == null) {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L30;
            } else {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L30;
            }
          }
          L31: {
            stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param9 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L31;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L31;
            }
          }
          L32: {
            stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param10 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L32;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L32;
            }
          }
          L33: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param11 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L33;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L33;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param12 + ')');
        }
    }

    final boolean c(boolean param0) {
        boolean discarded$2 = false;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            discarded$2 = this.b(false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_Ab) {
              break L2;
            } else {
              if (!this.field_Ab.field_cb) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final int a(jea param0, String param1, int param2, int param3, int param4, jea param5) {
        jea var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param4 == 8421504) {
              var7 = new jea(0L, param0, 0, param3, param2, 24, param1);
              param3 += 32;
              param5.b(param4 ^ -8421632, var7);
              stackOut_3_0 = param3;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -60;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var7_ref);
            stackOut_5_1 = new StringBuilder().append("wla.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean b(boolean param0) {
        if ((this.field_Gb ^ -1) == 1) {
          L0: {
            if (-14 == (fna.field_h ^ -1)) {
              this.field_Gb = -1;
              break L0;
            } else {
              break L0;
            }
          }
          if (!param0) {
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final int d(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        ta stackIn_5_0 = null;
        ta stackIn_6_0 = null;
        ta stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        jea stackIn_14_0 = null;
        jea stackIn_15_0 = null;
        jea stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ta stackOut_4_0 = null;
        ta stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ta stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        jea stackOut_13_0 = null;
        jea stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        jea stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          L1: {
            var4 = TombRacer.field_G ? 1 : 0;
            this.c(44, param1);
            if (null == this.field_xb) {
              break L1;
            } else {
              L2: {
                this.field_xb.field_r = this.field_vb.toString();
                this.field_xb.field_qb = (this.field_G + -this.field_xb.field_H.b(this.field_xb.field_r)) / 2;
                this.field_xb.field_G = -this.field_xb.field_qb + this.field_G;
                if (this.field_Ab == null) {
                  break L2;
                } else {
                  if (this.field_Ab.field_y != 0) {
                    L3: {
                      stackOut_4_0 = this.field_Ab;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (this.field_Ab.field_cb) {
                        stackOut_6_0 = (ta) ((Object) stackIn_6_0);
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L3;
                      } else {
                        stackOut_5_0 = (ta) ((Object) stackIn_5_0);
                        stackOut_5_1 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        break L3;
                      }
                    }
                    stackIn_7_0.field_cb = stackIn_7_1 != 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = 0;
              L4: while (true) {
                if (var3 >= rh.field_n) {
                  break L1;
                } else {
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L5: {
                      if (null != this.field_yb[var3]) {
                        L6: {
                          stackOut_13_0 = this.field_yb[var3];
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (-1 <= (this.field_vb.length() ^ -1)) {
                            stackOut_15_0 = (jea) ((Object) stackIn_15_0);
                            stackOut_15_1 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            break L6;
                          } else {
                            stackOut_14_0 = (jea) ((Object) stackIn_14_0);
                            stackOut_14_1 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            break L6;
                          }
                        }
                        stackIn_16_0.field_X = stackIn_16_1 != 0;
                        if (!this.field_yb[var3].field_X) {
                          break L5;
                        } else {
                          if (this.field_yb[var3].field_y == 0) {
                            break L5;
                          } else {
                            return var3;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    var3++;
                    if (var4 == 0) {
                      continue L4;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          if (param0 == (this.field_Fb.field_y ^ -1)) {
            break L0;
          } else {
            return -1;
          }
        }
        if (param1) {
          if (-1 != (hf.field_b ^ -1)) {
            if (this.field_y == 0) {
              return -1;
            } else {
              return this.field_Gb;
            }
          } else {
            return this.field_Gb;
          }
        } else {
          return this.field_Gb;
        }
    }

    static {
        field_Eb = new ur(2);
        field_Cb = false;
    }
}
