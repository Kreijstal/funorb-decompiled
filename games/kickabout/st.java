/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class st extends iq {
    private int field_k;
    private int field_l;
    private hu field_g;
    private boolean field_h;
    private int field_n;
    private String field_p;
    static ld field_j;
    static ut field_q;
    private int field_e;
    static String field_m;
    static String field_o;
    private int field_i;
    static String field_d;
    static String field_f;

    final static void a(nu param0, int param1, int param2) {
        vl.field_d = true;
        gp.field_i = -pq.field_Q.field_o;
        bm.field_I = 0;
        mk.field_c = param1;
        iu.field_i = param2;
        tb.field_w = param0;
    }

    final static int[] c(int param0) {
        if (param0 != -23091) {
            st.b((byte) -38);
            return new int[8];
        }
        return new int[8];
    }

    private final qj a(int param0, boolean param1, hu param2, String param3) {
        qj var5 = null;
        qj var6 = null;
        if (!param1) {
          field_o = null;
          var6 = new qj(param0 - param2.field_G, param2.field_p + param0, param3.length());
          var5 = var6;
          ((st) this).field_c = new qj[]{var6};
          return var5;
        } else {
          var6 = new qj(param0 - param2.field_G, param2.field_p + param0, param3.length());
          var5 = var6;
          ((st) this).field_c = new qj[]{var6};
          return var5;
        }
    }

    final void a(int param0, String param1, byte param2, hu param3, int param4) {
        Object var7 = null;
        qj var10 = null;
        qj var11 = null;
        qj var12 = null;
        qj var13 = null;
        qj var14 = null;
        qj var15 = null;
        qj var16 = null;
        qj var17 = null;
        if (param1 != null) {
          if (((st) this).field_g == param3) {
            if (((st) this).field_h) {
              L0: {
                if (((st) this).field_l != 0) {
                  break L0;
                } else {
                  if (((st) this).field_p == null) {
                    break L0;
                  } else {
                    if (!((st) this).field_p.equals((Object) (Object) param1)) {
                      ((st) this).field_h = true;
                      ((st) this).field_p = param1;
                      ((st) this).field_g = param3;
                      ((st) this).field_l = 0;
                      var14 = this.a(param4, true, param3, param1);
                      var15 = var14;
                      var14.field_b[0] = param0;
                      var15.field_b[param1.length()] = param3.a(param1) + param0;
                      if (param2 == 80) {
                        is.a(param3, param1, var15, 0, -1942293368);
                        return;
                      } else {
                        var7 = null;
                        st.a((nu) null, -19, 117);
                        is.a(param3, param1, var15, 0, -1942293368);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              ((st) this).field_h = true;
              ((st) this).field_p = param1;
              ((st) this).field_g = param3;
              ((st) this).field_l = 0;
              var16 = this.a(param4, true, param3, param1);
              var17 = var16;
              var16.field_b[0] = param0;
              var17.field_b[param1.length()] = param3.a(param1) + param0;
              if (param2 == 80) {
                is.a(param3, param1, var17, 0, -1942293368);
                return;
              } else {
                var7 = null;
                st.a((nu) null, -19, 117);
                is.a(param3, param1, var17, 0, -1942293368);
                return;
              }
            } else {
              ((st) this).field_h = true;
              ((st) this).field_p = param1;
              ((st) this).field_g = param3;
              ((st) this).field_l = 0;
              var12 = this.a(param4, true, param3, param1);
              var13 = var12;
              var12.field_b[0] = param0;
              var13.field_b[param1.length()] = param3.a(param1) + param0;
              if (param2 == 80) {
                is.a(param3, param1, var13, 0, -1942293368);
                return;
              } else {
                var7 = null;
                st.a((nu) null, -19, 117);
                is.a(param3, param1, var13, 0, -1942293368);
                return;
              }
            }
          } else {
            ((st) this).field_h = true;
            ((st) this).field_p = param1;
            ((st) this).field_g = param3;
            ((st) this).field_l = 0;
            var10 = this.a(param4, true, param3, param1);
            var11 = var10;
            var10.field_b[0] = param0;
            var11.field_b[param1.length()] = param3.a(param1) + param0;
            if (param2 == 80) {
              is.a(param3, param1, var11, 0, -1942293368);
              return;
            } else {
              var7 = null;
              st.a((nu) null, -19, 117);
              is.a(param3, param1, var11, 0, -1942293368);
              return;
            }
          }
        } else {
          ((st) this).field_c = null;
          return;
        }
    }

    final void a(int param0, hu param1, int param2, int param3, int param4, byte param5, String param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var15 = 0;
        String[] var16 = null;
        String[] var18 = null;
        String[] var19 = null;
        String var20 = null;
        qj var21 = null;
        String[] var22 = null;
        String[] var23 = null;
        String var24 = null;
        qj var25 = null;
        String var32 = null;
        qj var33 = null;
        String var38 = null;
        qj var39 = null;
        String var40 = null;
        qj var41 = null;
        String var42 = null;
        qj var43 = null;
        qj stackIn_31_0 = null;
        qj stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        qj stackIn_32_0 = null;
        qj stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        qj stackIn_33_0 = null;
        qj stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        hu stackIn_35_0 = null;
        String stackIn_35_1 = null;
        qj stackIn_35_2 = null;
        hu stackIn_36_0 = null;
        String stackIn_36_1 = null;
        qj stackIn_36_2 = null;
        hu stackIn_37_0 = null;
        String stackIn_37_1 = null;
        qj stackIn_37_2 = null;
        int stackIn_37_3 = 0;
        qj stackIn_58_0 = null;
        qj stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        qj stackIn_59_0 = null;
        qj stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        qj stackIn_60_0 = null;
        qj stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_60_4 = 0;
        hu stackIn_62_0 = null;
        String stackIn_62_1 = null;
        qj stackIn_62_2 = null;
        hu stackIn_63_0 = null;
        String stackIn_63_1 = null;
        qj stackIn_63_2 = null;
        hu stackIn_64_0 = null;
        String stackIn_64_1 = null;
        qj stackIn_64_2 = null;
        int stackIn_64_3 = 0;
        qj stackIn_73_0 = null;
        qj stackIn_73_1 = null;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        qj stackIn_74_0 = null;
        qj stackIn_74_1 = null;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        qj stackIn_75_0 = null;
        qj stackIn_75_1 = null;
        int stackIn_75_2 = 0;
        int stackIn_75_3 = 0;
        int stackIn_75_4 = 0;
        hu stackIn_77_0 = null;
        String stackIn_77_1 = null;
        qj stackIn_77_2 = null;
        hu stackIn_78_0 = null;
        String stackIn_78_1 = null;
        qj stackIn_78_2 = null;
        hu stackIn_79_0 = null;
        String stackIn_79_1 = null;
        qj stackIn_79_2 = null;
        int stackIn_79_3 = 0;
        qj stackIn_85_0 = null;
        qj stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        qj stackIn_86_0 = null;
        qj stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        qj stackIn_87_0 = null;
        qj stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        int stackIn_87_4 = 0;
        hu stackIn_89_0 = null;
        String stackIn_89_1 = null;
        qj stackIn_89_2 = null;
        hu stackIn_90_0 = null;
        String stackIn_90_1 = null;
        qj stackIn_90_2 = null;
        hu stackIn_91_0 = null;
        String stackIn_91_1 = null;
        qj stackIn_91_2 = null;
        int stackIn_91_3 = 0;
        qj stackIn_100_0 = null;
        qj stackIn_100_1 = null;
        int stackIn_100_2 = 0;
        int stackIn_100_3 = 0;
        qj stackIn_101_0 = null;
        qj stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        qj stackIn_102_0 = null;
        qj stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        int stackIn_102_3 = 0;
        int stackIn_102_4 = 0;
        hu stackIn_104_0 = null;
        String stackIn_104_1 = null;
        qj stackIn_104_2 = null;
        hu stackIn_105_0 = null;
        String stackIn_105_1 = null;
        qj stackIn_105_2 = null;
        hu stackIn_106_0 = null;
        String stackIn_106_1 = null;
        qj stackIn_106_2 = null;
        int stackIn_106_3 = 0;
        qj stackIn_114_0 = null;
        qj stackIn_114_1 = null;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        qj stackIn_115_0 = null;
        qj stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        qj stackIn_116_0 = null;
        qj stackIn_116_1 = null;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_116_4 = 0;
        hu stackIn_118_0 = null;
        String stackIn_118_1 = null;
        qj stackIn_118_2 = null;
        hu stackIn_119_0 = null;
        String stackIn_119_1 = null;
        qj stackIn_119_2 = null;
        hu stackIn_120_0 = null;
        String stackIn_120_1 = null;
        qj stackIn_120_2 = null;
        int stackIn_120_3 = 0;
        qj stackOut_30_0 = null;
        qj stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        qj stackOut_32_0 = null;
        qj stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        qj stackOut_31_0 = null;
        qj stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        hu stackOut_34_0 = null;
        String stackOut_34_1 = null;
        qj stackOut_34_2 = null;
        hu stackOut_36_0 = null;
        String stackOut_36_1 = null;
        qj stackOut_36_2 = null;
        int stackOut_36_3 = 0;
        hu stackOut_35_0 = null;
        String stackOut_35_1 = null;
        qj stackOut_35_2 = null;
        int stackOut_35_3 = 0;
        qj stackOut_57_0 = null;
        qj stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        qj stackOut_59_0 = null;
        qj stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        qj stackOut_58_0 = null;
        qj stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        hu stackOut_61_0 = null;
        String stackOut_61_1 = null;
        qj stackOut_61_2 = null;
        hu stackOut_63_0 = null;
        String stackOut_63_1 = null;
        qj stackOut_63_2 = null;
        int stackOut_63_3 = 0;
        hu stackOut_62_0 = null;
        String stackOut_62_1 = null;
        qj stackOut_62_2 = null;
        int stackOut_62_3 = 0;
        qj stackOut_113_0 = null;
        qj stackOut_113_1 = null;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        qj stackOut_115_0 = null;
        qj stackOut_115_1 = null;
        int stackOut_115_2 = 0;
        int stackOut_115_3 = 0;
        int stackOut_115_4 = 0;
        qj stackOut_114_0 = null;
        qj stackOut_114_1 = null;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        hu stackOut_117_0 = null;
        String stackOut_117_1 = null;
        qj stackOut_117_2 = null;
        hu stackOut_119_0 = null;
        String stackOut_119_1 = null;
        qj stackOut_119_2 = null;
        int stackOut_119_3 = 0;
        hu stackOut_118_0 = null;
        String stackOut_118_1 = null;
        qj stackOut_118_2 = null;
        int stackOut_118_3 = 0;
        qj stackOut_99_0 = null;
        qj stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        int stackOut_99_3 = 0;
        qj stackOut_101_0 = null;
        qj stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        int stackOut_101_4 = 0;
        qj stackOut_100_0 = null;
        qj stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        int stackOut_100_4 = 0;
        hu stackOut_103_0 = null;
        String stackOut_103_1 = null;
        qj stackOut_103_2 = null;
        hu stackOut_105_0 = null;
        String stackOut_105_1 = null;
        qj stackOut_105_2 = null;
        int stackOut_105_3 = 0;
        hu stackOut_104_0 = null;
        String stackOut_104_1 = null;
        qj stackOut_104_2 = null;
        int stackOut_104_3 = 0;
        qj stackOut_84_0 = null;
        qj stackOut_84_1 = null;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        qj stackOut_86_0 = null;
        qj stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int stackOut_86_4 = 0;
        qj stackOut_85_0 = null;
        qj stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        int stackOut_85_4 = 0;
        hu stackOut_88_0 = null;
        String stackOut_88_1 = null;
        qj stackOut_88_2 = null;
        hu stackOut_90_0 = null;
        String stackOut_90_1 = null;
        qj stackOut_90_2 = null;
        int stackOut_90_3 = 0;
        hu stackOut_89_0 = null;
        String stackOut_89_1 = null;
        qj stackOut_89_2 = null;
        int stackOut_89_3 = 0;
        qj stackOut_72_0 = null;
        qj stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        qj stackOut_74_0 = null;
        qj stackOut_74_1 = null;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        int stackOut_74_4 = 0;
        qj stackOut_73_0 = null;
        qj stackOut_73_1 = null;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        int stackOut_73_4 = 0;
        hu stackOut_76_0 = null;
        String stackOut_76_1 = null;
        qj stackOut_76_2 = null;
        hu stackOut_78_0 = null;
        String stackOut_78_1 = null;
        qj stackOut_78_2 = null;
        int stackOut_78_3 = 0;
        hu stackOut_77_0 = null;
        String stackOut_77_1 = null;
        qj stackOut_77_2 = null;
        int stackOut_77_3 = 0;
        L0: {
          var15 = Kickabout.field_G;
          if (param7 != 0) {
            break L0;
          } else {
            param7 = param1.field_x;
            break L0;
          }
        }
        if (param6 == null) {
          ((st) this).field_c = null;
          return;
        } else {
          L1: {
            if (((st) this).field_g != param1) {
              break L1;
            } else {
              if (((st) this).field_h) {
                break L1;
              } else {
                if (((st) this).field_l != param4) {
                  break L1;
                } else {
                  if (param2 != ((st) this).field_n) {
                    break L1;
                  } else {
                    if (param7 != ((st) this).field_i) {
                      break L1;
                    } else {
                      if (param3 != ((st) this).field_k) {
                        break L1;
                      } else {
                        if (param0 != ((st) this).field_e) {
                          break L1;
                        } else {
                          if (((st) this).field_p == null) {
                            break L1;
                          } else {
                            if (!((st) this).field_p.equals((Object) (Object) param6)) {
                              ((st) this).field_i = param7;
                              ((st) this).field_h = false;
                              ((st) this).field_n = param2;
                              ((st) this).field_e = param0;
                              ((st) this).field_l = param4;
                              ((st) this).field_g = param1;
                              ((st) this).field_p = param6;
                              ((st) this).field_k = param3;
                              var19 = new String[1 + param1.b(param6, param0)];
                              var16 = var19;
                              var18 = var19;
                              var10 = Math.max(1, param1.a(param6, new int[1], var18));
                              if (param5 < 89) {
                                return;
                              } else {
                                L2: {
                                  if (((st) this).field_n != -4) {
                                    break L2;
                                  } else {
                                    if (var10 != 1) {
                                      break L2;
                                    } else {
                                      ((st) this).field_n = 1;
                                      break L2;
                                    }
                                  }
                                }
                                L3: {
                                  ((st) this).field_c = new qj[var10];
                                  if (-1 != ((st) this).field_n) {
                                    if (((st) this).field_n == 1) {
                                      var11 = (((st) this).field_k + -(var10 * ((st) this).field_i) >> -137005791) + param1.field_G;
                                      break L3;
                                    } else {
                                      if ((((st) this).field_n ^ -1) != -3) {
                                        L4: {
                                          var12 = (((st) this).field_k - var10 * ((st) this).field_i) / (1 + var10);
                                          if (0 <= var12) {
                                            break L4;
                                          } else {
                                            var12 = 0;
                                            break L4;
                                          }
                                        }
                                        ((st) this).field_i = ((st) this).field_i + var12;
                                        var11 = param1.field_G - -var12;
                                        break L3;
                                      } else {
                                        var11 = -param1.field_p + ((st) this).field_k + -(var10 * ((st) this).field_i);
                                        break L3;
                                      }
                                    }
                                  } else {
                                    var11 = param1.field_G;
                                    break L3;
                                  }
                                }
                                var12 = 0;
                                L5: while (true) {
                                  if (var10 <= var12) {
                                    return;
                                  } else {
                                    L6: {
                                      var20 = var19[var12];
                                      stackOut_30_0 = null;
                                      stackOut_30_1 = null;
                                      stackOut_30_2 = -param1.field_G + var11;
                                      stackOut_30_3 = var11 + param1.field_p;
                                      stackIn_32_0 = stackOut_30_0;
                                      stackIn_32_1 = stackOut_30_1;
                                      stackIn_32_2 = stackOut_30_2;
                                      stackIn_32_3 = stackOut_30_3;
                                      stackIn_31_0 = stackOut_30_0;
                                      stackIn_31_1 = stackOut_30_1;
                                      stackIn_31_2 = stackOut_30_2;
                                      stackIn_31_3 = stackOut_30_3;
                                      if (var20 == null) {
                                        stackOut_32_0 = null;
                                        stackOut_32_1 = null;
                                        stackOut_32_2 = stackIn_32_2;
                                        stackOut_32_3 = stackIn_32_3;
                                        stackOut_32_4 = 0;
                                        stackIn_33_0 = stackOut_32_0;
                                        stackIn_33_1 = stackOut_32_1;
                                        stackIn_33_2 = stackOut_32_2;
                                        stackIn_33_3 = stackOut_32_3;
                                        stackIn_33_4 = stackOut_32_4;
                                        break L6;
                                      } else {
                                        stackOut_31_0 = null;
                                        stackOut_31_1 = null;
                                        stackOut_31_2 = stackIn_31_2;
                                        stackOut_31_3 = stackIn_31_3;
                                        stackOut_31_4 = var20.length();
                                        stackIn_33_0 = stackOut_31_0;
                                        stackIn_33_1 = stackOut_31_1;
                                        stackIn_33_2 = stackOut_31_2;
                                        stackIn_33_3 = stackOut_31_3;
                                        stackIn_33_4 = stackOut_31_4;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      new qj(stackIn_33_2, stackIn_33_3, stackIn_33_4);
                                      var21 = stackIn_33_0;
                                      var21.field_b[0] = 0;
                                      if (var20 == null) {
                                        break L7;
                                      } else {
                                        L8: {
                                          var21.field_b[var20.length()] = param1.a(var20);
                                          stackOut_34_0 = (hu) param1;
                                          stackOut_34_1 = (String) var20;
                                          stackOut_34_2 = (qj) var21;
                                          stackIn_36_0 = stackOut_34_0;
                                          stackIn_36_1 = stackOut_34_1;
                                          stackIn_36_2 = stackOut_34_2;
                                          stackIn_35_0 = stackOut_34_0;
                                          stackIn_35_1 = stackOut_34_1;
                                          stackIn_35_2 = stackOut_34_2;
                                          if ((param4 ^ -1) == -4) {
                                            stackOut_36_0 = (hu) (Object) stackIn_36_0;
                                            stackOut_36_1 = (String) (Object) stackIn_36_1;
                                            stackOut_36_2 = (qj) (Object) stackIn_36_2;
                                            stackOut_36_3 = ((st) this).a(param0, -61, param1.a(var20), var20);
                                            stackIn_37_0 = stackOut_36_0;
                                            stackIn_37_1 = stackOut_36_1;
                                            stackIn_37_2 = stackOut_36_2;
                                            stackIn_37_3 = stackOut_36_3;
                                            break L8;
                                          } else {
                                            stackOut_35_0 = (hu) (Object) stackIn_35_0;
                                            stackOut_35_1 = (String) (Object) stackIn_35_1;
                                            stackOut_35_2 = (qj) (Object) stackIn_35_2;
                                            stackOut_35_3 = 0;
                                            stackIn_37_0 = stackOut_35_0;
                                            stackIn_37_1 = stackOut_35_1;
                                            stackIn_37_2 = stackOut_35_2;
                                            stackIn_37_3 = stackOut_35_3;
                                            break L8;
                                          }
                                        }
                                        is.a(stackIn_37_0, stackIn_37_1, stackIn_37_2, stackIn_37_3, -1942293368);
                                        break L7;
                                      }
                                    }
                                    var11 = var11 + param7;
                                    ((st) this).field_c[var12] = var21;
                                    var12++;
                                    continue L5;
                                  }
                                }
                              }
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
          ((st) this).field_i = param7;
          ((st) this).field_h = false;
          ((st) this).field_n = param2;
          ((st) this).field_e = param0;
          ((st) this).field_l = param4;
          ((st) this).field_g = param1;
          ((st) this).field_p = param6;
          ((st) this).field_k = param3;
          var23 = new String[1 + param1.b(param6, param0)];
          var16 = var23;
          var22 = var23;
          var10 = Math.max(1, param1.a(param6, new int[1], var22));
          if (param5 >= 89) {
            L9: {
              if (((st) this).field_n != -4) {
                break L9;
              } else {
                if (var10 != 1) {
                  break L9;
                } else {
                  L10: {
                    ((st) this).field_n = 1;
                    ((st) this).field_c = new qj[var10];
                    if (-1 != ((st) this).field_n) {
                      if (((st) this).field_n == 1) {
                        var11 = (((st) this).field_k + -(var10 * ((st) this).field_i) >> -137005791) + param1.field_G;
                        break L10;
                      } else {
                        if ((((st) this).field_n ^ -1) != -3) {
                          L11: {
                            var12 = (((st) this).field_k - var10 * ((st) this).field_i) / (1 + var10);
                            if (0 <= var12) {
                              break L11;
                            } else {
                              var12 = 0;
                              break L11;
                            }
                          }
                          ((st) this).field_i = ((st) this).field_i + var12;
                          var11 = param1.field_G - -var12;
                          break L10;
                        } else {
                          var11 = -param1.field_p + ((st) this).field_k + -(var10 * ((st) this).field_i);
                          break L10;
                        }
                      }
                    } else {
                      var11 = param1.field_G;
                      break L10;
                    }
                  }
                  var12 = 0;
                  L12: while (true) {
                    if (var10 <= var12) {
                      return;
                    } else {
                      L13: {
                        var24 = var23[var12];
                        stackOut_57_0 = null;
                        stackOut_57_1 = null;
                        stackOut_57_2 = -param1.field_G + var11;
                        stackOut_57_3 = var11 + param1.field_p;
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_59_1 = stackOut_57_1;
                        stackIn_59_2 = stackOut_57_2;
                        stackIn_59_3 = stackOut_57_3;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        stackIn_58_2 = stackOut_57_2;
                        stackIn_58_3 = stackOut_57_3;
                        if (var24 == null) {
                          stackOut_59_0 = null;
                          stackOut_59_1 = null;
                          stackOut_59_2 = stackIn_59_2;
                          stackOut_59_3 = stackIn_59_3;
                          stackOut_59_4 = 0;
                          stackIn_60_0 = stackOut_59_0;
                          stackIn_60_1 = stackOut_59_1;
                          stackIn_60_2 = stackOut_59_2;
                          stackIn_60_3 = stackOut_59_3;
                          stackIn_60_4 = stackOut_59_4;
                          break L13;
                        } else {
                          stackOut_58_0 = null;
                          stackOut_58_1 = null;
                          stackOut_58_2 = stackIn_58_2;
                          stackOut_58_3 = stackIn_58_3;
                          stackOut_58_4 = var24.length();
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_60_1 = stackOut_58_1;
                          stackIn_60_2 = stackOut_58_2;
                          stackIn_60_3 = stackOut_58_3;
                          stackIn_60_4 = stackOut_58_4;
                          break L13;
                        }
                      }
                      L14: {
                        new qj(stackIn_60_2, stackIn_60_3, stackIn_60_4);
                        var25 = stackIn_60_0;
                        var25.field_b[0] = 0;
                        if (var24 == null) {
                          break L14;
                        } else {
                          L15: {
                            var25.field_b[var24.length()] = param1.a(var24);
                            stackOut_61_0 = (hu) param1;
                            stackOut_61_1 = (String) var24;
                            stackOut_61_2 = (qj) var25;
                            stackIn_63_0 = stackOut_61_0;
                            stackIn_63_1 = stackOut_61_1;
                            stackIn_63_2 = stackOut_61_2;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            stackIn_62_2 = stackOut_61_2;
                            if ((param4 ^ -1) == -4) {
                              stackOut_63_0 = (hu) (Object) stackIn_63_0;
                              stackOut_63_1 = (String) (Object) stackIn_63_1;
                              stackOut_63_2 = (qj) (Object) stackIn_63_2;
                              stackOut_63_3 = ((st) this).a(param0, -61, param1.a(var24), var24);
                              stackIn_64_0 = stackOut_63_0;
                              stackIn_64_1 = stackOut_63_1;
                              stackIn_64_2 = stackOut_63_2;
                              stackIn_64_3 = stackOut_63_3;
                              break L15;
                            } else {
                              stackOut_62_0 = (hu) (Object) stackIn_62_0;
                              stackOut_62_1 = (String) (Object) stackIn_62_1;
                              stackOut_62_2 = (qj) (Object) stackIn_62_2;
                              stackOut_62_3 = 0;
                              stackIn_64_0 = stackOut_62_0;
                              stackIn_64_1 = stackOut_62_1;
                              stackIn_64_2 = stackOut_62_2;
                              stackIn_64_3 = stackOut_62_3;
                              break L15;
                            }
                          }
                          is.a(stackIn_64_0, stackIn_64_1, stackIn_64_2, stackIn_64_3, -1942293368);
                          break L14;
                        }
                      }
                      var11 = var11 + param7;
                      ((st) this).field_c[var12] = var25;
                      var12++;
                      continue L12;
                    }
                  }
                }
              }
            }
            ((st) this).field_c = new qj[var10];
            if (-1 != (((st) this).field_n ^ -1)) {
              if (((st) this).field_n != 1) {
                if ((((st) this).field_n ^ -1) == -3) {
                  var11 = -param1.field_p + ((st) this).field_k + -(var10 * ((st) this).field_i);
                  var12 = 0;
                  L16: while (true) {
                    if (var10 > var12) {
                      L17: {
                        var38 = var23[var12];
                        stackOut_113_0 = null;
                        stackOut_113_1 = null;
                        stackOut_113_2 = -param1.field_G + var11;
                        stackOut_113_3 = var11 + param1.field_p;
                        stackIn_115_0 = stackOut_113_0;
                        stackIn_115_1 = stackOut_113_1;
                        stackIn_115_2 = stackOut_113_2;
                        stackIn_115_3 = stackOut_113_3;
                        stackIn_114_0 = stackOut_113_0;
                        stackIn_114_1 = stackOut_113_1;
                        stackIn_114_2 = stackOut_113_2;
                        stackIn_114_3 = stackOut_113_3;
                        if (var38 == null) {
                          stackOut_115_0 = null;
                          stackOut_115_1 = null;
                          stackOut_115_2 = stackIn_115_2;
                          stackOut_115_3 = stackIn_115_3;
                          stackOut_115_4 = 0;
                          stackIn_116_0 = stackOut_115_0;
                          stackIn_116_1 = stackOut_115_1;
                          stackIn_116_2 = stackOut_115_2;
                          stackIn_116_3 = stackOut_115_3;
                          stackIn_116_4 = stackOut_115_4;
                          break L17;
                        } else {
                          stackOut_114_0 = null;
                          stackOut_114_1 = null;
                          stackOut_114_2 = stackIn_114_2;
                          stackOut_114_3 = stackIn_114_3;
                          stackOut_114_4 = var38.length();
                          stackIn_116_0 = stackOut_114_0;
                          stackIn_116_1 = stackOut_114_1;
                          stackIn_116_2 = stackOut_114_2;
                          stackIn_116_3 = stackOut_114_3;
                          stackIn_116_4 = stackOut_114_4;
                          break L17;
                        }
                      }
                      L18: {
                        new qj(stackIn_116_2, stackIn_116_3, stackIn_116_4);
                        var39 = stackIn_116_0;
                        var39.field_b[0] = 0;
                        if (var38 == null) {
                          break L18;
                        } else {
                          L19: {
                            var39.field_b[var38.length()] = param1.a(var38);
                            stackOut_117_0 = (hu) param1;
                            stackOut_117_1 = (String) var38;
                            stackOut_117_2 = (qj) var39;
                            stackIn_119_0 = stackOut_117_0;
                            stackIn_119_1 = stackOut_117_1;
                            stackIn_119_2 = stackOut_117_2;
                            stackIn_118_0 = stackOut_117_0;
                            stackIn_118_1 = stackOut_117_1;
                            stackIn_118_2 = stackOut_117_2;
                            if ((param4 ^ -1) == -4) {
                              stackOut_119_0 = (hu) (Object) stackIn_119_0;
                              stackOut_119_1 = (String) (Object) stackIn_119_1;
                              stackOut_119_2 = (qj) (Object) stackIn_119_2;
                              stackOut_119_3 = ((st) this).a(param0, -61, param1.a(var38), var38);
                              stackIn_120_0 = stackOut_119_0;
                              stackIn_120_1 = stackOut_119_1;
                              stackIn_120_2 = stackOut_119_2;
                              stackIn_120_3 = stackOut_119_3;
                              break L19;
                            } else {
                              stackOut_118_0 = (hu) (Object) stackIn_118_0;
                              stackOut_118_1 = (String) (Object) stackIn_118_1;
                              stackOut_118_2 = (qj) (Object) stackIn_118_2;
                              stackOut_118_3 = 0;
                              stackIn_120_0 = stackOut_118_0;
                              stackIn_120_1 = stackOut_118_1;
                              stackIn_120_2 = stackOut_118_2;
                              stackIn_120_3 = stackOut_118_3;
                              break L19;
                            }
                          }
                          is.a(stackIn_120_0, stackIn_120_1, stackIn_120_2, stackIn_120_3, -1942293368);
                          break L18;
                        }
                      }
                      var11 = var11 + param7;
                      ((st) this).field_c[var12] = var39;
                      var12++;
                      continue L16;
                    } else {
                      return;
                    }
                  }
                } else {
                  L20: {
                    var12 = (((st) this).field_k - var10 * ((st) this).field_i) / (1 + var10);
                    if (0 <= var12) {
                      break L20;
                    } else {
                      var12 = 0;
                      break L20;
                    }
                  }
                  ((st) this).field_i = ((st) this).field_i + var12;
                  var11 = param1.field_G - -var12;
                  var12 = 0;
                  L21: while (true) {
                    if (var10 <= var12) {
                      return;
                    } else {
                      L22: {
                        var40 = var23[var12];
                        stackOut_99_0 = null;
                        stackOut_99_1 = null;
                        stackOut_99_2 = -param1.field_G + var11;
                        stackOut_99_3 = var11 + param1.field_p;
                        stackIn_101_0 = stackOut_99_0;
                        stackIn_101_1 = stackOut_99_1;
                        stackIn_101_2 = stackOut_99_2;
                        stackIn_101_3 = stackOut_99_3;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        stackIn_100_2 = stackOut_99_2;
                        stackIn_100_3 = stackOut_99_3;
                        if (var40 == null) {
                          stackOut_101_0 = null;
                          stackOut_101_1 = null;
                          stackOut_101_2 = stackIn_101_2;
                          stackOut_101_3 = stackIn_101_3;
                          stackOut_101_4 = 0;
                          stackIn_102_0 = stackOut_101_0;
                          stackIn_102_1 = stackOut_101_1;
                          stackIn_102_2 = stackOut_101_2;
                          stackIn_102_3 = stackOut_101_3;
                          stackIn_102_4 = stackOut_101_4;
                          break L22;
                        } else {
                          stackOut_100_0 = null;
                          stackOut_100_1 = null;
                          stackOut_100_2 = stackIn_100_2;
                          stackOut_100_3 = stackIn_100_3;
                          stackOut_100_4 = var40.length();
                          stackIn_102_0 = stackOut_100_0;
                          stackIn_102_1 = stackOut_100_1;
                          stackIn_102_2 = stackOut_100_2;
                          stackIn_102_3 = stackOut_100_3;
                          stackIn_102_4 = stackOut_100_4;
                          break L22;
                        }
                      }
                      L23: {
                        new qj(stackIn_102_2, stackIn_102_3, stackIn_102_4);
                        var41 = stackIn_102_0;
                        var41.field_b[0] = 0;
                        if (var40 == null) {
                          break L23;
                        } else {
                          L24: {
                            var41.field_b[var40.length()] = param1.a(var40);
                            stackOut_103_0 = (hu) param1;
                            stackOut_103_1 = (String) var40;
                            stackOut_103_2 = (qj) var41;
                            stackIn_105_0 = stackOut_103_0;
                            stackIn_105_1 = stackOut_103_1;
                            stackIn_105_2 = stackOut_103_2;
                            stackIn_104_0 = stackOut_103_0;
                            stackIn_104_1 = stackOut_103_1;
                            stackIn_104_2 = stackOut_103_2;
                            if ((param4 ^ -1) == -4) {
                              stackOut_105_0 = (hu) (Object) stackIn_105_0;
                              stackOut_105_1 = (String) (Object) stackIn_105_1;
                              stackOut_105_2 = (qj) (Object) stackIn_105_2;
                              stackOut_105_3 = ((st) this).a(param0, -61, param1.a(var40), var40);
                              stackIn_106_0 = stackOut_105_0;
                              stackIn_106_1 = stackOut_105_1;
                              stackIn_106_2 = stackOut_105_2;
                              stackIn_106_3 = stackOut_105_3;
                              break L24;
                            } else {
                              stackOut_104_0 = (hu) (Object) stackIn_104_0;
                              stackOut_104_1 = (String) (Object) stackIn_104_1;
                              stackOut_104_2 = (qj) (Object) stackIn_104_2;
                              stackOut_104_3 = 0;
                              stackIn_106_0 = stackOut_104_0;
                              stackIn_106_1 = stackOut_104_1;
                              stackIn_106_2 = stackOut_104_2;
                              stackIn_106_3 = stackOut_104_3;
                              break L24;
                            }
                          }
                          is.a(stackIn_106_0, stackIn_106_1, stackIn_106_2, stackIn_106_3, -1942293368);
                          break L23;
                        }
                      }
                      var11 = var11 + param7;
                      ((st) this).field_c[var12] = var41;
                      var12++;
                      continue L21;
                    }
                  }
                }
              } else {
                var11 = (((st) this).field_k + -(var10 * ((st) this).field_i) >> -137005791) + param1.field_G;
                var12 = 0;
                L25: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L26: {
                      var42 = var23[var12];
                      stackOut_84_0 = null;
                      stackOut_84_1 = null;
                      stackOut_84_2 = -param1.field_G + var11;
                      stackOut_84_3 = var11 + param1.field_p;
                      stackIn_86_0 = stackOut_84_0;
                      stackIn_86_1 = stackOut_84_1;
                      stackIn_86_2 = stackOut_84_2;
                      stackIn_86_3 = stackOut_84_3;
                      stackIn_85_0 = stackOut_84_0;
                      stackIn_85_1 = stackOut_84_1;
                      stackIn_85_2 = stackOut_84_2;
                      stackIn_85_3 = stackOut_84_3;
                      if (var42 == null) {
                        stackOut_86_0 = null;
                        stackOut_86_1 = null;
                        stackOut_86_2 = stackIn_86_2;
                        stackOut_86_3 = stackIn_86_3;
                        stackOut_86_4 = 0;
                        stackIn_87_0 = stackOut_86_0;
                        stackIn_87_1 = stackOut_86_1;
                        stackIn_87_2 = stackOut_86_2;
                        stackIn_87_3 = stackOut_86_3;
                        stackIn_87_4 = stackOut_86_4;
                        break L26;
                      } else {
                        stackOut_85_0 = null;
                        stackOut_85_1 = null;
                        stackOut_85_2 = stackIn_85_2;
                        stackOut_85_3 = stackIn_85_3;
                        stackOut_85_4 = var42.length();
                        stackIn_87_0 = stackOut_85_0;
                        stackIn_87_1 = stackOut_85_1;
                        stackIn_87_2 = stackOut_85_2;
                        stackIn_87_3 = stackOut_85_3;
                        stackIn_87_4 = stackOut_85_4;
                        break L26;
                      }
                    }
                    L27: {
                      new qj(stackIn_87_2, stackIn_87_3, stackIn_87_4);
                      var43 = stackIn_87_0;
                      var43.field_b[0] = 0;
                      if (var42 == null) {
                        break L27;
                      } else {
                        L28: {
                          var43.field_b[var42.length()] = param1.a(var42);
                          stackOut_88_0 = (hu) param1;
                          stackOut_88_1 = (String) var42;
                          stackOut_88_2 = (qj) var43;
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_90_1 = stackOut_88_1;
                          stackIn_90_2 = stackOut_88_2;
                          stackIn_89_0 = stackOut_88_0;
                          stackIn_89_1 = stackOut_88_1;
                          stackIn_89_2 = stackOut_88_2;
                          if ((param4 ^ -1) == -4) {
                            stackOut_90_0 = (hu) (Object) stackIn_90_0;
                            stackOut_90_1 = (String) (Object) stackIn_90_1;
                            stackOut_90_2 = (qj) (Object) stackIn_90_2;
                            stackOut_90_3 = ((st) this).a(param0, -61, param1.a(var42), var42);
                            stackIn_91_0 = stackOut_90_0;
                            stackIn_91_1 = stackOut_90_1;
                            stackIn_91_2 = stackOut_90_2;
                            stackIn_91_3 = stackOut_90_3;
                            break L28;
                          } else {
                            stackOut_89_0 = (hu) (Object) stackIn_89_0;
                            stackOut_89_1 = (String) (Object) stackIn_89_1;
                            stackOut_89_2 = (qj) (Object) stackIn_89_2;
                            stackOut_89_3 = 0;
                            stackIn_91_0 = stackOut_89_0;
                            stackIn_91_1 = stackOut_89_1;
                            stackIn_91_2 = stackOut_89_2;
                            stackIn_91_3 = stackOut_89_3;
                            break L28;
                          }
                        }
                        is.a(stackIn_91_0, stackIn_91_1, stackIn_91_2, stackIn_91_3, -1942293368);
                        break L27;
                      }
                    }
                    var11 = var11 + param7;
                    ((st) this).field_c[var12] = var43;
                    var12++;
                    continue L25;
                  }
                }
              }
            } else {
              var11 = param1.field_G;
              var12 = 0;
              L29: while (true) {
                if (var10 > var12) {
                  L30: {
                    var32 = var23[var12];
                    stackOut_72_0 = null;
                    stackOut_72_1 = null;
                    stackOut_72_2 = -param1.field_G + var11;
                    stackOut_72_3 = var11 + param1.field_p;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_74_1 = stackOut_72_1;
                    stackIn_74_2 = stackOut_72_2;
                    stackIn_74_3 = stackOut_72_3;
                    stackIn_73_0 = stackOut_72_0;
                    stackIn_73_1 = stackOut_72_1;
                    stackIn_73_2 = stackOut_72_2;
                    stackIn_73_3 = stackOut_72_3;
                    if (var32 == null) {
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
                      break L30;
                    } else {
                      stackOut_73_0 = null;
                      stackOut_73_1 = null;
                      stackOut_73_2 = stackIn_73_2;
                      stackOut_73_3 = stackIn_73_3;
                      stackOut_73_4 = var32.length();
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_75_1 = stackOut_73_1;
                      stackIn_75_2 = stackOut_73_2;
                      stackIn_75_3 = stackOut_73_3;
                      stackIn_75_4 = stackOut_73_4;
                      break L30;
                    }
                  }
                  L31: {
                    new qj(stackIn_75_2, stackIn_75_3, stackIn_75_4);
                    var33 = stackIn_75_0;
                    var33.field_b[0] = 0;
                    if (var32 == null) {
                      break L31;
                    } else {
                      L32: {
                        var33.field_b[var32.length()] = param1.a(var32);
                        stackOut_76_0 = (hu) param1;
                        stackOut_76_1 = (String) var32;
                        stackOut_76_2 = (qj) var33;
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_78_1 = stackOut_76_1;
                        stackIn_78_2 = stackOut_76_2;
                        stackIn_77_0 = stackOut_76_0;
                        stackIn_77_1 = stackOut_76_1;
                        stackIn_77_2 = stackOut_76_2;
                        if ((param4 ^ -1) == -4) {
                          stackOut_78_0 = (hu) (Object) stackIn_78_0;
                          stackOut_78_1 = (String) (Object) stackIn_78_1;
                          stackOut_78_2 = (qj) (Object) stackIn_78_2;
                          stackOut_78_3 = ((st) this).a(param0, -61, param1.a(var32), var32);
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          stackIn_79_2 = stackOut_78_2;
                          stackIn_79_3 = stackOut_78_3;
                          break L32;
                        } else {
                          stackOut_77_0 = (hu) (Object) stackIn_77_0;
                          stackOut_77_1 = (String) (Object) stackIn_77_1;
                          stackOut_77_2 = (qj) (Object) stackIn_77_2;
                          stackOut_77_3 = 0;
                          stackIn_79_0 = stackOut_77_0;
                          stackIn_79_1 = stackOut_77_1;
                          stackIn_79_2 = stackOut_77_2;
                          stackIn_79_3 = stackOut_77_3;
                          break L32;
                        }
                      }
                      is.a(stackIn_79_0, stackIn_79_1, stackIn_79_2, stackIn_79_3, -1942293368);
                      break L31;
                    }
                  }
                  var11 = var11 + param7;
                  ((st) this).field_c[var12] = var33;
                  var12++;
                  continue L29;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(byte param0, String param1, int param2, int param3, hu param4) {
        qj var8 = null;
        qj var10 = null;
        qj var11 = null;
        qj var12 = null;
        qj var13 = null;
        if (param1 != null) {
          if (param4 == ((st) this).field_g) {
            if (((st) this).field_h) {
              L0: {
                if (-3 != (((st) this).field_l ^ -1)) {
                  break L0;
                } else {
                  if (null == ((st) this).field_p) {
                    break L0;
                  } else {
                    if (!((st) this).field_p.equals((Object) (Object) param1)) {
                      ((st) this).field_p = param1;
                      ((st) this).field_h = true;
                      ((st) this).field_g = param4;
                      ((st) this).field_l = 2;
                      if (param0 < 120) {
                        return;
                      } else {
                        var8 = this.a(param2, true, param4, param1);
                        var12 = var8;
                        var12.field_b[0] = -param4.a(param1) + param3;
                        var12.field_b[param1.length()] = param3;
                        is.a(param4, param1, var12, 0, -1942293368);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              ((st) this).field_p = param1;
              ((st) this).field_h = true;
              ((st) this).field_g = param4;
              ((st) this).field_l = 2;
              if (param0 < 120) {
                return;
              } else {
                var8 = this.a(param2, true, param4, param1);
                var13 = var8;
                var13.field_b[0] = -param4.a(param1) + param3;
                var13.field_b[param1.length()] = param3;
                is.a(param4, param1, var13, 0, -1942293368);
                return;
              }
            } else {
              ((st) this).field_p = param1;
              ((st) this).field_h = true;
              ((st) this).field_g = param4;
              ((st) this).field_l = 2;
              if (param0 < 120) {
                return;
              } else {
                var8 = this.a(param2, true, param4, param1);
                var11 = var8;
                var11.field_b[0] = -param4.a(param1) + param3;
                var11.field_b[param1.length()] = param3;
                is.a(param4, param1, var11, 0, -1942293368);
                return;
              }
            }
          } else {
            ((st) this).field_p = param1;
            ((st) this).field_h = true;
            ((st) this).field_g = param4;
            ((st) this).field_l = 2;
            if (param0 < 120) {
              return;
            } else {
              var8 = this.a(param2, true, param4, param1);
              var10 = var8;
              var10.field_b[0] = -param4.a(param1) + param3;
              var10.field_b[param1.length()] = param3;
              is.a(param4, param1, var10, 0, -1942293368);
              return;
            }
          }
        } else {
          ((st) this).field_c = null;
          return;
        }
    }

    public static void b(byte param0) {
        field_j = null;
        field_f = null;
        if (param0 != -103) {
            return;
        }
        field_o = null;
        field_d = null;
        field_m = null;
        field_q = null;
    }

    final void a(int param0, int param1, hu param2, String param3, int param4) {
        int var7 = 0;
        qj var9 = null;
        qj var10 = null;
        qj var11 = null;
        qj var12 = null;
        if (param3 == null) {
          ((st) this).field_c = null;
          return;
        } else {
          if (param2 == ((st) this).field_g) {
            if (((st) this).field_h) {
              if (-2 == (((st) this).field_l ^ -1)) {
                if (null != ((st) this).field_p) {
                  if (!((st) this).field_p.equals((Object) (Object) param3)) {
                    ((st) this).field_l = param0;
                    ((st) this).field_h = true;
                    ((st) this).field_g = param2;
                    var11 = this.a(param4, true, param2, param3);
                    var7 = param2.a(param3);
                    var11.field_b[0] = param1 + -(var7 >> 762736673);
                    var11.field_b[param3.length()] = (var7 >> 1296583297) + param1;
                    is.a(param2, param3, var11, 0, -1942293368);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((st) this).field_l = param0;
                  ((st) this).field_h = true;
                  ((st) this).field_g = param2;
                  var12 = this.a(param4, true, param2, param3);
                  var7 = param2.a(param3);
                  var12.field_b[0] = param1 + -(var7 >> 762736673);
                  var12.field_b[param3.length()] = (var7 >> 1296583297) + param1;
                  is.a(param2, param3, var12, 0, -1942293368);
                  return;
                }
              } else {
                ((st) this).field_l = param0;
                ((st) this).field_h = true;
                ((st) this).field_g = param2;
                var12 = this.a(param4, true, param2, param3);
                var7 = param2.a(param3);
                var12.field_b[0] = param1 + -(var7 >> 762736673);
                var12.field_b[param3.length()] = (var7 >> 1296583297) + param1;
                is.a(param2, param3, var12, 0, -1942293368);
                return;
              }
            } else {
              ((st) this).field_l = param0;
              ((st) this).field_h = true;
              ((st) this).field_g = param2;
              var10 = this.a(param4, true, param2, param3);
              var7 = param2.a(param3);
              var10.field_b[0] = param1 + -(var7 >> 762736673);
              var10.field_b[param3.length()] = (var7 >> 1296583297) + param1;
              is.a(param2, param3, var10, 0, -1942293368);
              return;
            }
          } else {
            ((st) this).field_l = param0;
            ((st) this).field_h = true;
            ((st) this).field_g = param2;
            var9 = this.a(param4, true, param2, param3);
            var7 = param2.a(param3);
            var9.field_b[0] = param1 + -(var7 >> 762736673);
            var9.field_b[param3.length()] = (var7 >> 1296583297) + param1;
            is.a(param2, param3, var9, 0, -1942293368);
            return;
          }
        }
    }

    final static void b(int param0, int param1, int param2) {
        gp.field_i = param0;
        if (param1 < 76) {
            field_d = null;
            hq.field_d = param2;
            return;
        }
        hq.field_d = param2;
    }

    public st() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ld();
        field_o = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_m = null;
        field_d = "Loading models";
        field_f = "Quick Chat game";
    }
}
