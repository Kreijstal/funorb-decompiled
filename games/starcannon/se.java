/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends bd {
    private int field_r;
    private int field_i;
    private String field_s;
    private int field_v;
    static int field_u;
    static String field_t;
    static String[] field_n;
    private int field_q;
    private boolean field_k;
    static ue field_l;
    private qe field_h;
    private int field_j;
    static ia field_p;
    static int[] field_o;
    static int field_m;

    private final nh a(String param0, int param1, qe param2, int param3) {
        nh var5 = null;
        nh var6 = null;
        var6 = new nh(-param2.field_p + param1, param2.field_q + param1, param0.length());
        var5 = var6;
        ((se) this).field_d = new nh[]{var6};
        if (param3 < 99) {
          field_t = null;
          return var5;
        } else {
          return var5;
        }
    }

    public static void c(byte param0) {
        field_l = null;
        field_p = null;
        field_t = null;
        if (param0 != -2) {
          se.c((byte) 85);
          field_o = null;
          field_n = null;
          return;
        } else {
          field_o = null;
          field_n = null;
          return;
        }
    }

    final static void a(boolean param0, hh param1, int param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          jl.field_b[param2] = di.field_l.nextInt();
          jl.field_b[1] = di.field_l.nextInt();
          ck.field_g.field_g = 0;
          jl.field_b[3] = (int)mi.field_o;
          jl.field_b[2] = (int)(mi.field_o >> -743624096);
          ck.field_g.c((byte) -113, jl.field_b[0]);
          ck.field_g.c((byte) -71, jl.field_b[1]);
          ck.field_g.c((byte) -109, jl.field_b[2]);
          ck.field_g.c((byte) -107, jl.field_b[3]);
          fd.a(ck.field_g, (byte) -111);
          ck.field_g.c(param3, param2 + -306);
          param1.a((byte) 69, ck.field_g);
          d.field_b.field_g = 0;
          if (!param0) {
            d.field_b.a(16, -110);
            break L0;
          } else {
            d.field_b.a(18, -108);
            break L0;
          }
        }
        L1: {
          d.field_b.field_g = d.field_b.field_g + 2;
          var5 = d.field_b.field_g;
          d.field_b.c((byte) -123, ce.field_b);
          d.field_b.a(true, gh.field_B);
          var6 = 0;
          if (ah.field_i) {
            var6 = var6 | 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!qa.field_e) {
            break L2;
          } else {
            var6 = var6 | 4;
            break L2;
          }
        }
        L3: {
          if (!param4) {
            break L3;
          } else {
            var6 = var6 | 8;
            break L3;
          }
        }
        L4: {
          if (lj.field_c != null) {
            var6 = var6 | 16;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          d.field_b.a(var6, param2 + -93);
          var7 = uj.a(ll.b(125), 61);
          if (var7 == null) {
            var7 = "";
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          d.field_b.b(false, var7);
          if (null != lj.field_c) {
            d.field_b.a(false, lj.field_c);
            break L6;
          } else {
            break L6;
          }
        }
        fc.a(ck.field_g, (rb) (Object) d.field_b, ed.field_j, gg.field_e, 0);
        d.field_b.a((byte) 88, -var5 + d.field_b.field_g);
        nf.a(-1, (byte) 95);
    }

    final static boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -91) {
          if (-11 <= bl.field_a) {
            if (ai.field_c) {
              return false;
            } else {
              L0: {
                if (fc.a((byte) 57)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_n = null;
          if (-11 >= bl.field_a) {
            if (ai.field_c) {
              return false;
            } else {
              L1: {
                if (fc.a((byte) 57)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0, qe param1, int param2, int param3, int param4, int param5, int param6, String param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var15 = 0;
        Object var16 = null;
        String[] var17 = null;
        String[] var19 = null;
        String[] var20 = null;
        String var21 = null;
        nh var22 = null;
        String[] var23 = null;
        String[] var24 = null;
        String var25 = null;
        nh var26 = null;
        String var33 = null;
        nh var34 = null;
        String var39 = null;
        nh var40 = null;
        String var41 = null;
        nh var42 = null;
        String var43 = null;
        nh var44 = null;
        nh stackIn_32_0 = null;
        nh stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        nh stackIn_33_0 = null;
        nh stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        nh stackIn_34_0 = null;
        nh stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        nh stackIn_37_0 = null;
        qe stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        String stackIn_37_3 = null;
        nh stackIn_38_0 = null;
        qe stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        String stackIn_38_3 = null;
        nh stackIn_39_0 = null;
        qe stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        String stackIn_39_3 = null;
        int stackIn_39_4 = 0;
        nh stackIn_57_0 = null;
        nh stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        nh stackIn_58_0 = null;
        nh stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        nh stackIn_59_0 = null;
        nh stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        nh stackIn_62_0 = null;
        qe stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        String stackIn_62_3 = null;
        nh stackIn_63_0 = null;
        qe stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        String stackIn_63_3 = null;
        nh stackIn_64_0 = null;
        qe stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        String stackIn_64_3 = null;
        int stackIn_64_4 = 0;
        nh stackIn_73_0 = null;
        nh stackIn_73_1 = null;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        nh stackIn_74_0 = null;
        nh stackIn_74_1 = null;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        nh stackIn_75_0 = null;
        nh stackIn_75_1 = null;
        int stackIn_75_2 = 0;
        int stackIn_75_3 = 0;
        int stackIn_75_4 = 0;
        nh stackIn_78_0 = null;
        qe stackIn_78_1 = null;
        int stackIn_78_2 = 0;
        String stackIn_78_3 = null;
        nh stackIn_79_0 = null;
        qe stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        String stackIn_79_3 = null;
        nh stackIn_80_0 = null;
        qe stackIn_80_1 = null;
        int stackIn_80_2 = 0;
        String stackIn_80_3 = null;
        int stackIn_80_4 = 0;
        nh stackIn_86_0 = null;
        nh stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        nh stackIn_87_0 = null;
        nh stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        nh stackIn_88_0 = null;
        nh stackIn_88_1 = null;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        int stackIn_88_4 = 0;
        nh stackIn_91_0 = null;
        qe stackIn_91_1 = null;
        int stackIn_91_2 = 0;
        String stackIn_91_3 = null;
        nh stackIn_92_0 = null;
        qe stackIn_92_1 = null;
        int stackIn_92_2 = 0;
        String stackIn_92_3 = null;
        nh stackIn_93_0 = null;
        qe stackIn_93_1 = null;
        int stackIn_93_2 = 0;
        String stackIn_93_3 = null;
        int stackIn_93_4 = 0;
        nh stackIn_103_0 = null;
        nh stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        nh stackIn_104_0 = null;
        nh stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        nh stackIn_105_0 = null;
        nh stackIn_105_1 = null;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        int stackIn_105_4 = 0;
        nh stackIn_108_0 = null;
        qe stackIn_108_1 = null;
        int stackIn_108_2 = 0;
        String stackIn_108_3 = null;
        nh stackIn_109_0 = null;
        qe stackIn_109_1 = null;
        int stackIn_109_2 = 0;
        String stackIn_109_3 = null;
        nh stackIn_110_0 = null;
        qe stackIn_110_1 = null;
        int stackIn_110_2 = 0;
        String stackIn_110_3 = null;
        int stackIn_110_4 = 0;
        nh stackIn_118_0 = null;
        nh stackIn_118_1 = null;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        nh stackIn_119_0 = null;
        nh stackIn_119_1 = null;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        nh stackIn_120_0 = null;
        nh stackIn_120_1 = null;
        int stackIn_120_2 = 0;
        int stackIn_120_3 = 0;
        int stackIn_120_4 = 0;
        nh stackIn_123_0 = null;
        qe stackIn_123_1 = null;
        int stackIn_123_2 = 0;
        String stackIn_123_3 = null;
        nh stackIn_124_0 = null;
        qe stackIn_124_1 = null;
        int stackIn_124_2 = 0;
        String stackIn_124_3 = null;
        nh stackIn_125_0 = null;
        qe stackIn_125_1 = null;
        int stackIn_125_2 = 0;
        String stackIn_125_3 = null;
        int stackIn_125_4 = 0;
        nh stackOut_56_0 = null;
        nh stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        nh stackOut_58_0 = null;
        nh stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        nh stackOut_57_0 = null;
        nh stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        nh stackOut_61_0 = null;
        qe stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        String stackOut_61_3 = null;
        nh stackOut_63_0 = null;
        qe stackOut_63_1 = null;
        int stackOut_63_2 = 0;
        String stackOut_63_3 = null;
        int stackOut_63_4 = 0;
        nh stackOut_62_0 = null;
        qe stackOut_62_1 = null;
        int stackOut_62_2 = 0;
        String stackOut_62_3 = null;
        int stackOut_62_4 = 0;
        nh stackOut_117_0 = null;
        nh stackOut_117_1 = null;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        nh stackOut_119_0 = null;
        nh stackOut_119_1 = null;
        int stackOut_119_2 = 0;
        int stackOut_119_3 = 0;
        int stackOut_119_4 = 0;
        nh stackOut_118_0 = null;
        nh stackOut_118_1 = null;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        int stackOut_118_4 = 0;
        nh stackOut_122_0 = null;
        qe stackOut_122_1 = null;
        int stackOut_122_2 = 0;
        String stackOut_122_3 = null;
        nh stackOut_124_0 = null;
        qe stackOut_124_1 = null;
        int stackOut_124_2 = 0;
        String stackOut_124_3 = null;
        int stackOut_124_4 = 0;
        nh stackOut_123_0 = null;
        qe stackOut_123_1 = null;
        int stackOut_123_2 = 0;
        String stackOut_123_3 = null;
        int stackOut_123_4 = 0;
        nh stackOut_102_0 = null;
        nh stackOut_102_1 = null;
        int stackOut_102_2 = 0;
        int stackOut_102_3 = 0;
        nh stackOut_104_0 = null;
        nh stackOut_104_1 = null;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        int stackOut_104_4 = 0;
        nh stackOut_103_0 = null;
        nh stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_103_4 = 0;
        nh stackOut_107_0 = null;
        qe stackOut_107_1 = null;
        int stackOut_107_2 = 0;
        String stackOut_107_3 = null;
        nh stackOut_109_0 = null;
        qe stackOut_109_1 = null;
        int stackOut_109_2 = 0;
        String stackOut_109_3 = null;
        int stackOut_109_4 = 0;
        nh stackOut_108_0 = null;
        qe stackOut_108_1 = null;
        int stackOut_108_2 = 0;
        String stackOut_108_3 = null;
        int stackOut_108_4 = 0;
        nh stackOut_85_0 = null;
        nh stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        nh stackOut_87_0 = null;
        nh stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        int stackOut_87_4 = 0;
        nh stackOut_86_0 = null;
        nh stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int stackOut_86_4 = 0;
        nh stackOut_90_0 = null;
        qe stackOut_90_1 = null;
        int stackOut_90_2 = 0;
        String stackOut_90_3 = null;
        nh stackOut_92_0 = null;
        qe stackOut_92_1 = null;
        int stackOut_92_2 = 0;
        String stackOut_92_3 = null;
        int stackOut_92_4 = 0;
        nh stackOut_91_0 = null;
        qe stackOut_91_1 = null;
        int stackOut_91_2 = 0;
        String stackOut_91_3 = null;
        int stackOut_91_4 = 0;
        nh stackOut_72_0 = null;
        nh stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        nh stackOut_74_0 = null;
        nh stackOut_74_1 = null;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        int stackOut_74_4 = 0;
        nh stackOut_73_0 = null;
        nh stackOut_73_1 = null;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        int stackOut_73_4 = 0;
        nh stackOut_77_0 = null;
        qe stackOut_77_1 = null;
        int stackOut_77_2 = 0;
        String stackOut_77_3 = null;
        nh stackOut_79_0 = null;
        qe stackOut_79_1 = null;
        int stackOut_79_2 = 0;
        String stackOut_79_3 = null;
        int stackOut_79_4 = 0;
        nh stackOut_78_0 = null;
        qe stackOut_78_1 = null;
        int stackOut_78_2 = 0;
        String stackOut_78_3 = null;
        int stackOut_78_4 = 0;
        nh stackOut_31_0 = null;
        nh stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        nh stackOut_33_0 = null;
        nh stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        nh stackOut_32_0 = null;
        nh stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        nh stackOut_36_0 = null;
        qe stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        String stackOut_36_3 = null;
        nh stackOut_38_0 = null;
        qe stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        String stackOut_38_3 = null;
        int stackOut_38_4 = 0;
        nh stackOut_37_0 = null;
        qe stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        String stackOut_37_3 = null;
        int stackOut_37_4 = 0;
        L0: {
          var15 = StarCannon.field_A;
          if (param6 == 0) {
            param6 = param1.field_x;
            break L0;
          } else {
            break L0;
          }
        }
        if (param7 != null) {
          L1: {
            if (((se) this).field_h != param1) {
              break L1;
            } else {
              if (((se) this).field_k) {
                break L1;
              } else {
                if (((se) this).field_v != param2) {
                  break L1;
                } else {
                  if (param5 != ((se) this).field_q) {
                    break L1;
                  } else {
                    if (((se) this).field_r != param6) {
                      break L1;
                    } else {
                      if (((se) this).field_i != param4) {
                        break L1;
                      } else {
                        if (((se) this).field_j != param3) {
                          break L1;
                        } else {
                          if (null == ((se) this).field_s) {
                            break L1;
                          } else {
                            if (!((se) this).field_s.equals((Object) (Object) param7)) {
                              break L1;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((se) this).field_s = param7;
          ((se) this).field_i = param4;
          ((se) this).field_q = param5;
          ((se) this).field_v = param2;
          ((se) this).field_h = param1;
          if (param0 >= 5) {
            L2: {
              ((se) this).field_j = param3;
              ((se) this).field_r = param6;
              ((se) this).field_k = false;
              var24 = new String[param1.a(param7, param3) - -1];
              var17 = var24;
              var23 = var24;
              var10 = Math.max(1, param1.a(param7, new int[1], var23));
              if (((se) this).field_q != 3) {
                break L2;
              } else {
                if (1 != var10) {
                  break L2;
                } else {
                  L3: {
                    ((se) this).field_q = 1;
                    ((se) this).field_d = new nh[var10];
                    if (-1 != (((se) this).field_q ^ -1)) {
                      if (((se) this).field_q == -2) {
                        var11 = (((se) this).field_i - var10 * ((se) this).field_r >> -678881375) + param1.field_p;
                        break L3;
                      } else {
                        if (-3 != ((se) this).field_q) {
                          L4: {
                            var12 = (((se) this).field_i + -(((se) this).field_r * var10)) / (1 + var10);
                            if ((var12 ^ -1) > -1) {
                              var12 = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((se) this).field_r = ((se) this).field_r + var12;
                          var11 = param1.field_p - -var12;
                          break L3;
                        } else {
                          var11 = -(((se) this).field_r * var10) + -param1.field_q + ((se) this).field_i;
                          break L3;
                        }
                      }
                    } else {
                      var11 = param1.field_p;
                      break L3;
                    }
                  }
                  var12 = 0;
                  L5: while (true) {
                    if (var10 <= var12) {
                      return;
                    } else {
                      L6: {
                        var25 = var24[var12];
                        stackOut_56_0 = null;
                        stackOut_56_1 = null;
                        stackOut_56_2 = var11 - param1.field_p;
                        stackOut_56_3 = var11 + param1.field_q;
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        stackIn_58_2 = stackOut_56_2;
                        stackIn_58_3 = stackOut_56_3;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        stackIn_57_3 = stackOut_56_3;
                        if (var25 == null) {
                          stackOut_58_0 = null;
                          stackOut_58_1 = null;
                          stackOut_58_2 = stackIn_58_2;
                          stackOut_58_3 = stackIn_58_3;
                          stackOut_58_4 = 0;
                          stackIn_59_0 = stackOut_58_0;
                          stackIn_59_1 = stackOut_58_1;
                          stackIn_59_2 = stackOut_58_2;
                          stackIn_59_3 = stackOut_58_3;
                          stackIn_59_4 = stackOut_58_4;
                          break L6;
                        } else {
                          stackOut_57_0 = null;
                          stackOut_57_1 = null;
                          stackOut_57_2 = stackIn_57_2;
                          stackOut_57_3 = stackIn_57_3;
                          stackOut_57_4 = var25.length();
                          stackIn_59_0 = stackOut_57_0;
                          stackIn_59_1 = stackOut_57_1;
                          stackIn_59_2 = stackOut_57_2;
                          stackIn_59_3 = stackOut_57_3;
                          stackIn_59_4 = stackOut_57_4;
                          break L6;
                        }
                      }
                      L7: {
                        new nh(stackIn_59_2, stackIn_59_3, stackIn_59_4);
                        var26 = stackIn_59_0;
                        var26.field_d[0] = 0;
                        if (var25 != null) {
                          L8: {
                            var26.field_d[var25.length()] = param1.a(var25);
                            stackOut_61_0 = (nh) var26;
                            stackOut_61_1 = (qe) param1;
                            stackOut_61_2 = 3853;
                            stackOut_61_3 = (String) var25;
                            stackIn_63_0 = stackOut_61_0;
                            stackIn_63_1 = stackOut_61_1;
                            stackIn_63_2 = stackOut_61_2;
                            stackIn_63_3 = stackOut_61_3;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            stackIn_62_2 = stackOut_61_2;
                            stackIn_62_3 = stackOut_61_3;
                            if (param2 == 3) {
                              stackOut_63_0 = (nh) (Object) stackIn_63_0;
                              stackOut_63_1 = (qe) (Object) stackIn_63_1;
                              stackOut_63_2 = stackIn_63_2;
                              stackOut_63_3 = (String) (Object) stackIn_63_3;
                              stackOut_63_4 = ((se) this).a((byte) 85, param3, param1.a(var25), var25);
                              stackIn_64_0 = stackOut_63_0;
                              stackIn_64_1 = stackOut_63_1;
                              stackIn_64_2 = stackOut_63_2;
                              stackIn_64_3 = stackOut_63_3;
                              stackIn_64_4 = stackOut_63_4;
                              break L8;
                            } else {
                              stackOut_62_0 = (nh) (Object) stackIn_62_0;
                              stackOut_62_1 = (qe) (Object) stackIn_62_1;
                              stackOut_62_2 = stackIn_62_2;
                              stackOut_62_3 = (String) (Object) stackIn_62_3;
                              stackOut_62_4 = 0;
                              stackIn_64_0 = stackOut_62_0;
                              stackIn_64_1 = stackOut_62_1;
                              stackIn_64_2 = stackOut_62_2;
                              stackIn_64_3 = stackOut_62_3;
                              stackIn_64_4 = stackOut_62_4;
                              break L8;
                            }
                          }
                          lb.a(stackIn_64_0, stackIn_64_1, stackIn_64_2, stackIn_64_3, stackIn_64_4);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((se) this).field_d[var12] = var26;
                      var11 = var11 + param6;
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
            }
            ((se) this).field_d = new nh[var10];
            if (-1 != (((se) this).field_q ^ -1)) {
              if (((se) this).field_q != -2) {
                if (-3 == ((se) this).field_q) {
                  var11 = -(((se) this).field_r * var10) + -param1.field_q + ((se) this).field_i;
                  var12 = 0;
                  L9: while (true) {
                    if (var10 > var12) {
                      L10: {
                        var39 = var24[var12];
                        stackOut_117_0 = null;
                        stackOut_117_1 = null;
                        stackOut_117_2 = var11 - param1.field_p;
                        stackOut_117_3 = var11 + param1.field_q;
                        stackIn_119_0 = stackOut_117_0;
                        stackIn_119_1 = stackOut_117_1;
                        stackIn_119_2 = stackOut_117_2;
                        stackIn_119_3 = stackOut_117_3;
                        stackIn_118_0 = stackOut_117_0;
                        stackIn_118_1 = stackOut_117_1;
                        stackIn_118_2 = stackOut_117_2;
                        stackIn_118_3 = stackOut_117_3;
                        if (var39 == null) {
                          stackOut_119_0 = null;
                          stackOut_119_1 = null;
                          stackOut_119_2 = stackIn_119_2;
                          stackOut_119_3 = stackIn_119_3;
                          stackOut_119_4 = 0;
                          stackIn_120_0 = stackOut_119_0;
                          stackIn_120_1 = stackOut_119_1;
                          stackIn_120_2 = stackOut_119_2;
                          stackIn_120_3 = stackOut_119_3;
                          stackIn_120_4 = stackOut_119_4;
                          break L10;
                        } else {
                          stackOut_118_0 = null;
                          stackOut_118_1 = null;
                          stackOut_118_2 = stackIn_118_2;
                          stackOut_118_3 = stackIn_118_3;
                          stackOut_118_4 = var39.length();
                          stackIn_120_0 = stackOut_118_0;
                          stackIn_120_1 = stackOut_118_1;
                          stackIn_120_2 = stackOut_118_2;
                          stackIn_120_3 = stackOut_118_3;
                          stackIn_120_4 = stackOut_118_4;
                          break L10;
                        }
                      }
                      L11: {
                        new nh(stackIn_120_2, stackIn_120_3, stackIn_120_4);
                        var40 = stackIn_120_0;
                        var40.field_d[0] = 0;
                        if (var39 != null) {
                          L12: {
                            var40.field_d[var39.length()] = param1.a(var39);
                            stackOut_122_0 = (nh) var40;
                            stackOut_122_1 = (qe) param1;
                            stackOut_122_2 = 3853;
                            stackOut_122_3 = (String) var39;
                            stackIn_124_0 = stackOut_122_0;
                            stackIn_124_1 = stackOut_122_1;
                            stackIn_124_2 = stackOut_122_2;
                            stackIn_124_3 = stackOut_122_3;
                            stackIn_123_0 = stackOut_122_0;
                            stackIn_123_1 = stackOut_122_1;
                            stackIn_123_2 = stackOut_122_2;
                            stackIn_123_3 = stackOut_122_3;
                            if (param2 == 3) {
                              stackOut_124_0 = (nh) (Object) stackIn_124_0;
                              stackOut_124_1 = (qe) (Object) stackIn_124_1;
                              stackOut_124_2 = stackIn_124_2;
                              stackOut_124_3 = (String) (Object) stackIn_124_3;
                              stackOut_124_4 = ((se) this).a((byte) 85, param3, param1.a(var39), var39);
                              stackIn_125_0 = stackOut_124_0;
                              stackIn_125_1 = stackOut_124_1;
                              stackIn_125_2 = stackOut_124_2;
                              stackIn_125_3 = stackOut_124_3;
                              stackIn_125_4 = stackOut_124_4;
                              break L12;
                            } else {
                              stackOut_123_0 = (nh) (Object) stackIn_123_0;
                              stackOut_123_1 = (qe) (Object) stackIn_123_1;
                              stackOut_123_2 = stackIn_123_2;
                              stackOut_123_3 = (String) (Object) stackIn_123_3;
                              stackOut_123_4 = 0;
                              stackIn_125_0 = stackOut_123_0;
                              stackIn_125_1 = stackOut_123_1;
                              stackIn_125_2 = stackOut_123_2;
                              stackIn_125_3 = stackOut_123_3;
                              stackIn_125_4 = stackOut_123_4;
                              break L12;
                            }
                          }
                          lb.a(stackIn_125_0, stackIn_125_1, stackIn_125_2, stackIn_125_3, stackIn_125_4);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      ((se) this).field_d[var12] = var40;
                      var11 = var11 + param6;
                      var12++;
                      continue L9;
                    } else {
                      return;
                    }
                  }
                } else {
                  L13: {
                    var12 = (((se) this).field_i + -(((se) this).field_r * var10)) / (1 + var10);
                    if ((var12 ^ -1) > -1) {
                      var12 = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  ((se) this).field_r = ((se) this).field_r + var12;
                  var11 = param1.field_p - -var12;
                  var12 = 0;
                  L14: while (true) {
                    if (var10 <= var12) {
                      return;
                    } else {
                      L15: {
                        var41 = var24[var12];
                        stackOut_102_0 = null;
                        stackOut_102_1 = null;
                        stackOut_102_2 = var11 - param1.field_p;
                        stackOut_102_3 = var11 + param1.field_q;
                        stackIn_104_0 = stackOut_102_0;
                        stackIn_104_1 = stackOut_102_1;
                        stackIn_104_2 = stackOut_102_2;
                        stackIn_104_3 = stackOut_102_3;
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        stackIn_103_2 = stackOut_102_2;
                        stackIn_103_3 = stackOut_102_3;
                        if (var41 == null) {
                          stackOut_104_0 = null;
                          stackOut_104_1 = null;
                          stackOut_104_2 = stackIn_104_2;
                          stackOut_104_3 = stackIn_104_3;
                          stackOut_104_4 = 0;
                          stackIn_105_0 = stackOut_104_0;
                          stackIn_105_1 = stackOut_104_1;
                          stackIn_105_2 = stackOut_104_2;
                          stackIn_105_3 = stackOut_104_3;
                          stackIn_105_4 = stackOut_104_4;
                          break L15;
                        } else {
                          stackOut_103_0 = null;
                          stackOut_103_1 = null;
                          stackOut_103_2 = stackIn_103_2;
                          stackOut_103_3 = stackIn_103_3;
                          stackOut_103_4 = var41.length();
                          stackIn_105_0 = stackOut_103_0;
                          stackIn_105_1 = stackOut_103_1;
                          stackIn_105_2 = stackOut_103_2;
                          stackIn_105_3 = stackOut_103_3;
                          stackIn_105_4 = stackOut_103_4;
                          break L15;
                        }
                      }
                      L16: {
                        new nh(stackIn_105_2, stackIn_105_3, stackIn_105_4);
                        var42 = stackIn_105_0;
                        var42.field_d[0] = 0;
                        if (var41 != null) {
                          L17: {
                            var42.field_d[var41.length()] = param1.a(var41);
                            stackOut_107_0 = (nh) var42;
                            stackOut_107_1 = (qe) param1;
                            stackOut_107_2 = 3853;
                            stackOut_107_3 = (String) var41;
                            stackIn_109_0 = stackOut_107_0;
                            stackIn_109_1 = stackOut_107_1;
                            stackIn_109_2 = stackOut_107_2;
                            stackIn_109_3 = stackOut_107_3;
                            stackIn_108_0 = stackOut_107_0;
                            stackIn_108_1 = stackOut_107_1;
                            stackIn_108_2 = stackOut_107_2;
                            stackIn_108_3 = stackOut_107_3;
                            if (param2 == 3) {
                              stackOut_109_0 = (nh) (Object) stackIn_109_0;
                              stackOut_109_1 = (qe) (Object) stackIn_109_1;
                              stackOut_109_2 = stackIn_109_2;
                              stackOut_109_3 = (String) (Object) stackIn_109_3;
                              stackOut_109_4 = ((se) this).a((byte) 85, param3, param1.a(var41), var41);
                              stackIn_110_0 = stackOut_109_0;
                              stackIn_110_1 = stackOut_109_1;
                              stackIn_110_2 = stackOut_109_2;
                              stackIn_110_3 = stackOut_109_3;
                              stackIn_110_4 = stackOut_109_4;
                              break L17;
                            } else {
                              stackOut_108_0 = (nh) (Object) stackIn_108_0;
                              stackOut_108_1 = (qe) (Object) stackIn_108_1;
                              stackOut_108_2 = stackIn_108_2;
                              stackOut_108_3 = (String) (Object) stackIn_108_3;
                              stackOut_108_4 = 0;
                              stackIn_110_0 = stackOut_108_0;
                              stackIn_110_1 = stackOut_108_1;
                              stackIn_110_2 = stackOut_108_2;
                              stackIn_110_3 = stackOut_108_3;
                              stackIn_110_4 = stackOut_108_4;
                              break L17;
                            }
                          }
                          lb.a(stackIn_110_0, stackIn_110_1, stackIn_110_2, stackIn_110_3, stackIn_110_4);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      ((se) this).field_d[var12] = var42;
                      var11 = var11 + param6;
                      var12++;
                      continue L14;
                    }
                  }
                }
              } else {
                var11 = (((se) this).field_i - var10 * ((se) this).field_r >> -678881375) + param1.field_p;
                var12 = 0;
                L18: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L19: {
                      var43 = var24[var12];
                      stackOut_85_0 = null;
                      stackOut_85_1 = null;
                      stackOut_85_2 = var11 - param1.field_p;
                      stackOut_85_3 = var11 + param1.field_q;
                      stackIn_87_0 = stackOut_85_0;
                      stackIn_87_1 = stackOut_85_1;
                      stackIn_87_2 = stackOut_85_2;
                      stackIn_87_3 = stackOut_85_3;
                      stackIn_86_0 = stackOut_85_0;
                      stackIn_86_1 = stackOut_85_1;
                      stackIn_86_2 = stackOut_85_2;
                      stackIn_86_3 = stackOut_85_3;
                      if (var43 == null) {
                        stackOut_87_0 = null;
                        stackOut_87_1 = null;
                        stackOut_87_2 = stackIn_87_2;
                        stackOut_87_3 = stackIn_87_3;
                        stackOut_87_4 = 0;
                        stackIn_88_0 = stackOut_87_0;
                        stackIn_88_1 = stackOut_87_1;
                        stackIn_88_2 = stackOut_87_2;
                        stackIn_88_3 = stackOut_87_3;
                        stackIn_88_4 = stackOut_87_4;
                        break L19;
                      } else {
                        stackOut_86_0 = null;
                        stackOut_86_1 = null;
                        stackOut_86_2 = stackIn_86_2;
                        stackOut_86_3 = stackIn_86_3;
                        stackOut_86_4 = var43.length();
                        stackIn_88_0 = stackOut_86_0;
                        stackIn_88_1 = stackOut_86_1;
                        stackIn_88_2 = stackOut_86_2;
                        stackIn_88_3 = stackOut_86_3;
                        stackIn_88_4 = stackOut_86_4;
                        break L19;
                      }
                    }
                    L20: {
                      new nh(stackIn_88_2, stackIn_88_3, stackIn_88_4);
                      var44 = stackIn_88_0;
                      var44.field_d[0] = 0;
                      if (var43 != null) {
                        L21: {
                          var44.field_d[var43.length()] = param1.a(var43);
                          stackOut_90_0 = (nh) var44;
                          stackOut_90_1 = (qe) param1;
                          stackOut_90_2 = 3853;
                          stackOut_90_3 = (String) var43;
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_92_1 = stackOut_90_1;
                          stackIn_92_2 = stackOut_90_2;
                          stackIn_92_3 = stackOut_90_3;
                          stackIn_91_0 = stackOut_90_0;
                          stackIn_91_1 = stackOut_90_1;
                          stackIn_91_2 = stackOut_90_2;
                          stackIn_91_3 = stackOut_90_3;
                          if (param2 == 3) {
                            stackOut_92_0 = (nh) (Object) stackIn_92_0;
                            stackOut_92_1 = (qe) (Object) stackIn_92_1;
                            stackOut_92_2 = stackIn_92_2;
                            stackOut_92_3 = (String) (Object) stackIn_92_3;
                            stackOut_92_4 = ((se) this).a((byte) 85, param3, param1.a(var43), var43);
                            stackIn_93_0 = stackOut_92_0;
                            stackIn_93_1 = stackOut_92_1;
                            stackIn_93_2 = stackOut_92_2;
                            stackIn_93_3 = stackOut_92_3;
                            stackIn_93_4 = stackOut_92_4;
                            break L21;
                          } else {
                            stackOut_91_0 = (nh) (Object) stackIn_91_0;
                            stackOut_91_1 = (qe) (Object) stackIn_91_1;
                            stackOut_91_2 = stackIn_91_2;
                            stackOut_91_3 = (String) (Object) stackIn_91_3;
                            stackOut_91_4 = 0;
                            stackIn_93_0 = stackOut_91_0;
                            stackIn_93_1 = stackOut_91_1;
                            stackIn_93_2 = stackOut_91_2;
                            stackIn_93_3 = stackOut_91_3;
                            stackIn_93_4 = stackOut_91_4;
                            break L21;
                          }
                        }
                        lb.a(stackIn_93_0, stackIn_93_1, stackIn_93_2, stackIn_93_3, stackIn_93_4);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    ((se) this).field_d[var12] = var44;
                    var11 = var11 + param6;
                    var12++;
                    continue L18;
                  }
                }
              }
            } else {
              var11 = param1.field_p;
              var12 = 0;
              L22: while (true) {
                if (var10 > var12) {
                  L23: {
                    var33 = var24[var12];
                    stackOut_72_0 = null;
                    stackOut_72_1 = null;
                    stackOut_72_2 = var11 - param1.field_p;
                    stackOut_72_3 = var11 + param1.field_q;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_74_1 = stackOut_72_1;
                    stackIn_74_2 = stackOut_72_2;
                    stackIn_74_3 = stackOut_72_3;
                    stackIn_73_0 = stackOut_72_0;
                    stackIn_73_1 = stackOut_72_1;
                    stackIn_73_2 = stackOut_72_2;
                    stackIn_73_3 = stackOut_72_3;
                    if (var33 == null) {
                      stackOut_74_0 = null;
                      stackOut_74_1 = null;
                      stackOut_74_2 = stackIn_74_2;
                      stackOut_74_3 = stackIn_74_3;
                      stackOut_74_4 = 0;
                      stackIn_75_0 = stackOut_74_0;
                      stackIn_75_1 = stackOut_74_1;
                      stackIn_75_2 = stackOut_74_2;
                      stackIn_75_3 = stackOut_74_3;
                      stackIn_75_4 = stackOut_74_4;
                      break L23;
                    } else {
                      stackOut_73_0 = null;
                      stackOut_73_1 = null;
                      stackOut_73_2 = stackIn_73_2;
                      stackOut_73_3 = stackIn_73_3;
                      stackOut_73_4 = var33.length();
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_75_1 = stackOut_73_1;
                      stackIn_75_2 = stackOut_73_2;
                      stackIn_75_3 = stackOut_73_3;
                      stackIn_75_4 = stackOut_73_4;
                      break L23;
                    }
                  }
                  L24: {
                    new nh(stackIn_75_2, stackIn_75_3, stackIn_75_4);
                    var34 = stackIn_75_0;
                    var34.field_d[0] = 0;
                    if (var33 != null) {
                      L25: {
                        var34.field_d[var33.length()] = param1.a(var33);
                        stackOut_77_0 = (nh) var34;
                        stackOut_77_1 = (qe) param1;
                        stackOut_77_2 = 3853;
                        stackOut_77_3 = (String) var33;
                        stackIn_79_0 = stackOut_77_0;
                        stackIn_79_1 = stackOut_77_1;
                        stackIn_79_2 = stackOut_77_2;
                        stackIn_79_3 = stackOut_77_3;
                        stackIn_78_0 = stackOut_77_0;
                        stackIn_78_1 = stackOut_77_1;
                        stackIn_78_2 = stackOut_77_2;
                        stackIn_78_3 = stackOut_77_3;
                        if (param2 == 3) {
                          stackOut_79_0 = (nh) (Object) stackIn_79_0;
                          stackOut_79_1 = (qe) (Object) stackIn_79_1;
                          stackOut_79_2 = stackIn_79_2;
                          stackOut_79_3 = (String) (Object) stackIn_79_3;
                          stackOut_79_4 = ((se) this).a((byte) 85, param3, param1.a(var33), var33);
                          stackIn_80_0 = stackOut_79_0;
                          stackIn_80_1 = stackOut_79_1;
                          stackIn_80_2 = stackOut_79_2;
                          stackIn_80_3 = stackOut_79_3;
                          stackIn_80_4 = stackOut_79_4;
                          break L25;
                        } else {
                          stackOut_78_0 = (nh) (Object) stackIn_78_0;
                          stackOut_78_1 = (qe) (Object) stackIn_78_1;
                          stackOut_78_2 = stackIn_78_2;
                          stackOut_78_3 = (String) (Object) stackIn_78_3;
                          stackOut_78_4 = 0;
                          stackIn_80_0 = stackOut_78_0;
                          stackIn_80_1 = stackOut_78_1;
                          stackIn_80_2 = stackOut_78_2;
                          stackIn_80_3 = stackOut_78_3;
                          stackIn_80_4 = stackOut_78_4;
                          break L25;
                        }
                      }
                      lb.a(stackIn_80_0, stackIn_80_1, stackIn_80_2, stackIn_80_3, stackIn_80_4);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  ((se) this).field_d[var12] = var34;
                  var11 = var11 + param6;
                  var12++;
                  continue L22;
                } else {
                  return;
                }
              }
            }
          } else {
            L26: {
              var16 = null;
              ((se) this).a(16, -33, (byte) 44, (String) null, (qe) null);
              ((se) this).field_j = param3;
              ((se) this).field_r = param6;
              ((se) this).field_k = false;
              var20 = new String[param1.a(param7, param3) - -1];
              var17 = var20;
              var19 = var20;
              var10 = Math.max(1, param1.a(param7, new int[1], var19));
              if (((se) this).field_q != 3) {
                break L26;
              } else {
                if (1 != var10) {
                  break L26;
                } else {
                  ((se) this).field_q = 1;
                  break L26;
                }
              }
            }
            L27: {
              ((se) this).field_d = new nh[var10];
              if (-1 != (((se) this).field_q ^ -1)) {
                if (((se) this).field_q == -2) {
                  var11 = (((se) this).field_i - var10 * ((se) this).field_r >> -678881375) + param1.field_p;
                  break L27;
                } else {
                  if (-3 != ((se) this).field_q) {
                    L28: {
                      var12 = (((se) this).field_i + -(((se) this).field_r * var10)) / (1 + var10);
                      if ((var12 ^ -1) > -1) {
                        var12 = 0;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    ((se) this).field_r = ((se) this).field_r + var12;
                    var11 = param1.field_p - -var12;
                    break L27;
                  } else {
                    var11 = -(((se) this).field_r * var10) + -param1.field_q + ((se) this).field_i;
                    break L27;
                  }
                }
              } else {
                var11 = param1.field_p;
                break L27;
              }
            }
            var12 = 0;
            L29: while (true) {
              if (var10 <= var12) {
                return;
              } else {
                L30: {
                  var21 = var20[var12];
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = var11 - param1.field_p;
                  stackOut_31_3 = var11 + param1.field_q;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  stackIn_32_3 = stackOut_31_3;
                  if (var21 == null) {
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = stackIn_33_2;
                    stackOut_33_3 = stackIn_33_3;
                    stackOut_33_4 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    stackIn_34_3 = stackOut_33_3;
                    stackIn_34_4 = stackOut_33_4;
                    break L30;
                  } else {
                    stackOut_32_0 = null;
                    stackOut_32_1 = null;
                    stackOut_32_2 = stackIn_32_2;
                    stackOut_32_3 = stackIn_32_3;
                    stackOut_32_4 = var21.length();
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    stackIn_34_3 = stackOut_32_3;
                    stackIn_34_4 = stackOut_32_4;
                    break L30;
                  }
                }
                L31: {
                  new nh(stackIn_34_2, stackIn_34_3, stackIn_34_4);
                  var22 = stackIn_34_0;
                  var22.field_d[0] = 0;
                  if (var21 != null) {
                    L32: {
                      var22.field_d[var21.length()] = param1.a(var21);
                      stackOut_36_0 = (nh) var22;
                      stackOut_36_1 = (qe) param1;
                      stackOut_36_2 = 3853;
                      stackOut_36_3 = (String) var21;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      stackIn_38_3 = stackOut_36_3;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      if (param2 == 3) {
                        stackOut_38_0 = (nh) (Object) stackIn_38_0;
                        stackOut_38_1 = (qe) (Object) stackIn_38_1;
                        stackOut_38_2 = stackIn_38_2;
                        stackOut_38_3 = (String) (Object) stackIn_38_3;
                        stackOut_38_4 = ((se) this).a((byte) 85, param3, param1.a(var21), var21);
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        stackIn_39_3 = stackOut_38_3;
                        stackIn_39_4 = stackOut_38_4;
                        break L32;
                      } else {
                        stackOut_37_0 = (nh) (Object) stackIn_37_0;
                        stackOut_37_1 = (qe) (Object) stackIn_37_1;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = (String) (Object) stackIn_37_3;
                        stackOut_37_4 = 0;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_39_3 = stackOut_37_3;
                        stackIn_39_4 = stackOut_37_4;
                        break L32;
                      }
                    }
                    lb.a(stackIn_39_0, stackIn_39_1, stackIn_39_2, stackIn_39_3, stackIn_39_4);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                ((se) this).field_d[var12] = var22;
                var11 = var11 + param6;
                var12++;
                continue L29;
              }
            }
          }
        } else {
          ((se) this).field_d = null;
          return;
        }
    }

    final static boolean d(byte param0) {
        int var1 = 62 % ((param0 - 86) / 37);
        return tc.field_x;
    }

    final void a(String param0, int param1, byte param2, int param3, qe param4) {
        nh var8 = null;
        nh var10 = null;
        nh var12 = null;
        nh var14 = null;
        nh var15 = null;
        if (param2 > 126) {
          if (param0 == null) {
            ((se) this).field_d = null;
            return;
          } else {
            if (((se) this).field_h == param4) {
              if (((se) this).field_k) {
                if (((se) this).field_v == 2) {
                  if (((se) this).field_s != null) {
                    if (((se) this).field_s.equals((Object) (Object) param0)) {
                      return;
                    } else {
                      ((se) this).field_h = param4;
                      ((se) this).field_k = true;
                      ((se) this).field_v = 2;
                      ((se) this).field_s = param0;
                      var8 = this.a(param0, param3, param4, 119);
                      var15 = var8;
                      var15.field_d[0] = param1 - param4.a(param0);
                      var15.field_d[param0.length()] = param1;
                      lb.a(var15, param4, 3853, param0, 0);
                      return;
                    }
                  } else {
                    ((se) this).field_h = param4;
                    ((se) this).field_k = true;
                    ((se) this).field_v = 2;
                    ((se) this).field_s = param0;
                    var8 = this.a(param0, param3, param4, 119);
                    var15 = var8;
                    var15.field_d[0] = param1 - param4.a(param0);
                    var15.field_d[param0.length()] = param1;
                    lb.a(var15, param4, 3853, param0, 0);
                    return;
                  }
                } else {
                  ((se) this).field_h = param4;
                  ((se) this).field_k = true;
                  ((se) this).field_v = 2;
                  ((se) this).field_s = param0;
                  var8 = this.a(param0, param3, param4, 119);
                  var15 = var8;
                  var15.field_d[0] = param1 - param4.a(param0);
                  var15.field_d[param0.length()] = param1;
                  lb.a(var15, param4, 3853, param0, 0);
                  return;
                }
              } else {
                ((se) this).field_h = param4;
                ((se) this).field_k = true;
                ((se) this).field_v = 2;
                ((se) this).field_s = param0;
                var8 = this.a(param0, param3, param4, 119);
                var15 = var8;
                var15.field_d[0] = param1 - param4.a(param0);
                var15.field_d[param0.length()] = param1;
                lb.a(var15, param4, 3853, param0, 0);
                return;
              }
            } else {
              ((se) this).field_h = param4;
              ((se) this).field_k = true;
              ((se) this).field_v = 2;
              ((se) this).field_s = param0;
              var8 = this.a(param0, param3, param4, 119);
              var15 = var8;
              var15.field_d[0] = param1 - param4.a(param0);
              var15.field_d[param0.length()] = param1;
              lb.a(var15, param4, 3853, param0, 0);
              return;
            }
          }
        } else {
          ((se) this).field_i = -18;
          if (param0 == null) {
            ((se) this).field_d = null;
            return;
          } else {
            if (((se) this).field_h == param4) {
              if (((se) this).field_k) {
                if (((se) this).field_v == 2) {
                  if (((se) this).field_s != null) {
                    if (((se) this).field_s.equals((Object) (Object) param0)) {
                      return;
                    } else {
                      ((se) this).field_h = param4;
                      ((se) this).field_k = true;
                      ((se) this).field_v = 2;
                      ((se) this).field_s = param0;
                      var8 = this.a(param0, param3, param4, 119);
                      var14 = var8;
                      var14.field_d[0] = param1 - param4.a(param0);
                      var14.field_d[param0.length()] = param1;
                      lb.a(var14, param4, 3853, param0, 0);
                      return;
                    }
                  } else {
                    ((se) this).field_h = param4;
                    ((se) this).field_k = true;
                    ((se) this).field_v = 2;
                    ((se) this).field_s = param0;
                    var8 = this.a(param0, param3, param4, 119);
                    var14 = var8;
                    var14.field_d[0] = param1 - param4.a(param0);
                    var14.field_d[param0.length()] = param1;
                    lb.a(var14, param4, 3853, param0, 0);
                    return;
                  }
                } else {
                  ((se) this).field_h = param4;
                  ((se) this).field_k = true;
                  ((se) this).field_v = 2;
                  ((se) this).field_s = param0;
                  var8 = this.a(param0, param3, param4, 119);
                  var14 = var8;
                  var14.field_d[0] = param1 - param4.a(param0);
                  var14.field_d[param0.length()] = param1;
                  lb.a(var14, param4, 3853, param0, 0);
                  return;
                }
              } else {
                ((se) this).field_h = param4;
                ((se) this).field_k = true;
                ((se) this).field_v = 2;
                ((se) this).field_s = param0;
                var8 = this.a(param0, param3, param4, 119);
                var12 = var8;
                var12.field_d[0] = param1 - param4.a(param0);
                var12.field_d[param0.length()] = param1;
                lb.a(var12, param4, 3853, param0, 0);
                return;
              }
            } else {
              ((se) this).field_h = param4;
              ((se) this).field_k = true;
              ((se) this).field_v = 2;
              ((se) this).field_s = param0;
              var8 = this.a(param0, param3, param4, 119);
              var10 = var8;
              var10.field_d[0] = param1 - param4.a(param0);
              var10.field_d[param0.length()] = param1;
              lb.a(var10, param4, 3853, param0, 0);
              return;
            }
          }
        }
    }

    final void a(qe param0, String param1, int param2, int param3, int param4) {
        int var7 = 0;
        nh var9 = null;
        nh var10 = null;
        nh var11 = null;
        if (param1 == null) {
          ((se) this).field_d = null;
          return;
        } else {
          if (param0 == ((se) this).field_h) {
            if (((se) this).field_k) {
              L0: {
                if ((((se) this).field_v ^ -1) != -2) {
                  break L0;
                } else {
                  if (null == ((se) this).field_s) {
                    break L0;
                  } else {
                    if (!((se) this).field_s.equals((Object) (Object) param1)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((se) this).field_k = true;
              ((se) this).field_v = 1;
              ((se) this).field_h = param0;
              var11 = this.a(param1, param4, param0, param2 ^ 466572270);
              var7 = param0.a(param1);
              var11.field_d[0] = -(var7 >> 466572161) + param3;
              var11.field_d[param1.length()] = param3 - -(var7 >> -1405445823);
              if (param2 == 466572161) {
                lb.a(var11, param0, 3853, param1, 0);
                return;
              } else {
                field_u = 97;
                lb.a(var11, param0, 3853, param1, 0);
                return;
              }
            } else {
              ((se) this).field_k = true;
              ((se) this).field_v = 1;
              ((se) this).field_h = param0;
              var10 = this.a(param1, param4, param0, param2 ^ 466572270);
              var7 = param0.a(param1);
              var10.field_d[0] = -(var7 >> 466572161) + param3;
              var10.field_d[param1.length()] = param3 - -(var7 >> -1405445823);
              if (param2 == 466572161) {
                lb.a(var10, param0, 3853, param1, 0);
                return;
              } else {
                field_u = 97;
                lb.a(var10, param0, 3853, param1, 0);
                return;
              }
            }
          } else {
            ((se) this).field_k = true;
            ((se) this).field_v = 1;
            ((se) this).field_h = param0;
            var9 = this.a(param1, param4, param0, param2 ^ 466572270);
            var7 = param0.a(param1);
            var9.field_d[0] = -(var7 >> 466572161) + param3;
            var9.field_d[param1.length()] = param3 - -(var7 >> -1405445823);
            if (param2 == 466572161) {
              lb.a(var9, param0, 3853, param1, 0);
              return;
            } else {
              field_u = 97;
              lb.a(var9, param0, 3853, param1, 0);
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, String param3, qe param4) {
        nh var9 = null;
        nh var10 = null;
        nh var11 = null;
        nh var12 = null;
        nh var13 = null;
        nh var14 = null;
        if (param2 > 9) {
          if (param3 == null) {
            ((se) this).field_d = null;
            return;
          } else {
            if (((se) this).field_h == param4) {
              if (((se) this).field_k) {
                if (-1 == (((se) this).field_v ^ -1)) {
                  if (((se) this).field_s != null) {
                    if (((se) this).field_s.equals((Object) (Object) param3)) {
                      return;
                    } else {
                      ((se) this).field_s = param3;
                      ((se) this).field_k = true;
                      ((se) this).field_v = 0;
                      ((se) this).field_h = param4;
                      var13 = this.a(param3, param0, param4, 123);
                      var14 = var13;
                      var13.field_d[0] = param1;
                      var14.field_d[param3.length()] = param4.a(param3) + param1;
                      lb.a(var14, param4, 3853, param3, 0);
                      return;
                    }
                  } else {
                    ((se) this).field_s = param3;
                    ((se) this).field_k = true;
                    ((se) this).field_v = 0;
                    ((se) this).field_h = param4;
                    var13 = this.a(param3, param0, param4, 123);
                    var14 = var13;
                    var13.field_d[0] = param1;
                    var14.field_d[param3.length()] = param4.a(param3) + param1;
                    lb.a(var14, param4, 3853, param3, 0);
                    return;
                  }
                } else {
                  ((se) this).field_s = param3;
                  ((se) this).field_k = true;
                  ((se) this).field_v = 0;
                  ((se) this).field_h = param4;
                  var13 = this.a(param3, param0, param4, 123);
                  var14 = var13;
                  var13.field_d[0] = param1;
                  var14.field_d[param3.length()] = param4.a(param3) + param1;
                  lb.a(var14, param4, 3853, param3, 0);
                  return;
                }
              } else {
                ((se) this).field_s = param3;
                ((se) this).field_k = true;
                ((se) this).field_v = 0;
                ((se) this).field_h = param4;
                var11 = this.a(param3, param0, param4, 123);
                var12 = var11;
                var11.field_d[0] = param1;
                var12.field_d[param3.length()] = param4.a(param3) + param1;
                lb.a(var12, param4, 3853, param3, 0);
                return;
              }
            } else {
              ((se) this).field_s = param3;
              ((se) this).field_k = true;
              ((se) this).field_v = 0;
              ((se) this).field_h = param4;
              var9 = this.a(param3, param0, param4, 123);
              var10 = var9;
              var9.field_d[0] = param1;
              var10.field_d[param3.length()] = param4.a(param3) + param1;
              lb.a(var10, param4, 3853, param3, 0);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        if (0 >= u.field_d) {
          if (wk.a(param1 ^ 421)) {
            var2 = 0;
            if (param1 == 480) {
              if (kd.field_B == null) {
                if (!vf.field_b) {
                  return;
                } else {
                  ig.a((byte) 61, var2, param0);
                  return;
                }
              } else {
                return;
              }
            } else {
              field_t = null;
              if (kd.field_B == null) {
                if (vf.field_b) {
                  ig.a((byte) 61, var2, param0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            var2 = 1;
            if (param1 == 480) {
              if (kd.field_B == null) {
                if (!vf.field_b) {
                  return;
                } else {
                  ig.a((byte) 61, var2, param0);
                  return;
                }
              } else {
                return;
              }
            } else {
              field_t = null;
              if (kd.field_B == null) {
                if (vf.field_b) {
                  ig.a((byte) 61, var2, param0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          L0: {
            if (null == kd.field_B) {
              n.field_a = re.a(0, nb.field_e, 0, true, 640, 480);
              break L0;
            } else {
              n.field_a = kd.field_B.a(2);
              ae.a(2, (byte) 31);
              break L0;
            }
          }
          if (n.field_a == null) {
            var2 = 3;
            if (param1 == 480) {
              if (kd.field_B == null) {
                if (vf.field_b) {
                  ig.a((byte) 61, var2, param0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              field_t = null;
              if (kd.field_B == null) {
                if (vf.field_b) {
                  ig.a((byte) 61, var2, param0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            var2 = 2;
            mf.a(true, (java.awt.Canvas) (Object) n.field_a);
            if (param1 != 480) {
              field_t = null;
              if (kd.field_B == null) {
                if (vf.field_b) {
                  ig.a((byte) 61, var2, param0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (kd.field_B == null) {
                if (!vf.field_b) {
                  return;
                } else {
                  ig.a((byte) 61, var2, param0);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    public se() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Members' Benefits";
        field_u = 256;
    }
}
