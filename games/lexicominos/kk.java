/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends ve {
    private int field_m;
    private int field_j;
    private int field_h;
    static int field_o;
    static String field_n;
    private int field_g;
    static int field_r;
    static String field_q;
    private int field_f;
    private le field_k;
    static String field_i;
    private boolean field_p;
    private String field_l;

    final void a(int param0, int param1, String param2, le param3, int param4) {
        Object var7 = null;
        rj var10 = null;
        rj var11 = null;
        rj var12 = null;
        rj var13 = null;
        rj var14 = null;
        rj var15 = null;
        rj var16 = null;
        rj var17 = null;
        rj var18 = null;
        rj var19 = null;
        rj var20 = null;
        rj var21 = null;
        rj var22 = null;
        rj var23 = null;
        if (param2 == null) {
          ((kk) this).field_c = null;
          return;
        } else {
          if (((kk) this).field_k == param3) {
            if (((kk) this).field_p) {
              L0: {
                if (-1 != (((kk) this).field_f ^ -1)) {
                  break L0;
                } else {
                  if (null == ((kk) this).field_l) {
                    break L0;
                  } else {
                    if (!((kk) this).field_l.equals((Object) (Object) param2)) {
                      L1: {
                        ((kk) this).field_l = param2;
                        if (param0 >= 94) {
                          break L1;
                        } else {
                          var7 = null;
                          ((kk) this).a(-77, 114, (String) null, (le) null, -62);
                          break L1;
                        }
                      }
                      ((kk) this).field_p = true;
                      ((kk) this).field_k = param3;
                      ((kk) this).field_f = 0;
                      var18 = this.a(param3, param2, (byte) 121, param4);
                      var19 = var18;
                      var18.field_a[0] = param1;
                      var19.field_a[param2.length()] = param3.b(param2) + param1;
                      fa.a(var19, param3, 0, param2, (byte) 123);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((kk) this).field_l = param2;
              if (param0 < 94) {
                var7 = null;
                ((kk) this).a(-77, 114, (String) null, (le) null, -62);
                ((kk) this).field_p = true;
                ((kk) this).field_k = param3;
                ((kk) this).field_f = 0;
                var20 = this.a(param3, param2, (byte) 121, param4);
                var21 = var20;
                var20.field_a[0] = param1;
                var21.field_a[param2.length()] = param3.b(param2) + param1;
                fa.a(var21, param3, 0, param2, (byte) 123);
                return;
              } else {
                ((kk) this).field_p = true;
                ((kk) this).field_k = param3;
                ((kk) this).field_f = 0;
                var22 = this.a(param3, param2, (byte) 121, param4);
                var23 = var22;
                var22.field_a[0] = param1;
                var23.field_a[param2.length()] = param3.b(param2) + param1;
                fa.a(var23, param3, 0, param2, (byte) 123);
                return;
              }
            } else {
              ((kk) this).field_l = param2;
              if (param0 < 94) {
                var7 = null;
                ((kk) this).a(-77, 114, (String) null, (le) null, -62);
                ((kk) this).field_p = true;
                ((kk) this).field_k = param3;
                ((kk) this).field_f = 0;
                var14 = this.a(param3, param2, (byte) 121, param4);
                var15 = var14;
                var14.field_a[0] = param1;
                var15.field_a[param2.length()] = param3.b(param2) + param1;
                fa.a(var15, param3, 0, param2, (byte) 123);
                return;
              } else {
                ((kk) this).field_p = true;
                ((kk) this).field_k = param3;
                ((kk) this).field_f = 0;
                var16 = this.a(param3, param2, (byte) 121, param4);
                var17 = var16;
                var16.field_a[0] = param1;
                var17.field_a[param2.length()] = param3.b(param2) + param1;
                fa.a(var17, param3, 0, param2, (byte) 123);
                return;
              }
            }
          } else {
            ((kk) this).field_l = param2;
            if (param0 < 94) {
              var7 = null;
              ((kk) this).a(-77, 114, (String) null, (le) null, -62);
              ((kk) this).field_p = true;
              ((kk) this).field_k = param3;
              ((kk) this).field_f = 0;
              var10 = this.a(param3, param2, (byte) 121, param4);
              var11 = var10;
              var10.field_a[0] = param1;
              var11.field_a[param2.length()] = param3.b(param2) + param1;
              fa.a(var11, param3, 0, param2, (byte) 123);
              return;
            } else {
              ((kk) this).field_p = true;
              ((kk) this).field_k = param3;
              ((kk) this).field_f = 0;
              var12 = this.a(param3, param2, (byte) 121, param4);
              var13 = var12;
              var12.field_a[0] = param1;
              var13.field_a[param2.length()] = param3.b(param2) + param1;
              fa.a(var13, param3, 0, param2, (byte) 123);
              return;
            }
          }
        }
    }

    final static java.applet.Applet c(int param0) {
        if (pg.field_b != null) {
            return pg.field_b;
        }
        if (param0 != -14047) {
            java.applet.Applet discarded$0 = kk.c(7);
            return (java.applet.Applet) (Object) c.field_j;
        }
        return (java.applet.Applet) (Object) c.field_j;
    }

    final void a(le param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        String var18 = null;
        rj var19 = null;
        String var20 = null;
        rj var21 = null;
        String var28 = null;
        rj var29 = null;
        String var34 = null;
        rj var35 = null;
        String var36 = null;
        rj var37 = null;
        String var38 = null;
        rj var39 = null;
        rj stackIn_31_0 = null;
        rj stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        rj stackIn_32_0 = null;
        rj stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        rj stackIn_33_0 = null;
        rj stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        rj stackIn_35_0 = null;
        le stackIn_35_1 = null;
        rj stackIn_36_0 = null;
        le stackIn_36_1 = null;
        rj stackIn_37_0 = null;
        le stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        rj stackIn_54_0 = null;
        rj stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        rj stackIn_55_0 = null;
        rj stackIn_55_1 = null;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        rj stackIn_56_0 = null;
        rj stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        rj stackIn_58_0 = null;
        le stackIn_58_1 = null;
        rj stackIn_59_0 = null;
        le stackIn_59_1 = null;
        rj stackIn_60_0 = null;
        le stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        rj stackIn_67_0 = null;
        rj stackIn_67_1 = null;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        rj stackIn_68_0 = null;
        rj stackIn_68_1 = null;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        rj stackIn_69_0 = null;
        rj stackIn_69_1 = null;
        int stackIn_69_2 = 0;
        int stackIn_69_3 = 0;
        int stackIn_69_4 = 0;
        rj stackIn_71_0 = null;
        le stackIn_71_1 = null;
        rj stackIn_72_0 = null;
        le stackIn_72_1 = null;
        rj stackIn_73_0 = null;
        le stackIn_73_1 = null;
        int stackIn_73_2 = 0;
        rj stackIn_80_0 = null;
        rj stackIn_80_1 = null;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        rj stackIn_81_0 = null;
        rj stackIn_81_1 = null;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        rj stackIn_82_0 = null;
        rj stackIn_82_1 = null;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        int stackIn_82_4 = 0;
        rj stackIn_84_0 = null;
        le stackIn_84_1 = null;
        rj stackIn_85_0 = null;
        le stackIn_85_1 = null;
        rj stackIn_86_0 = null;
        le stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        rj stackIn_95_0 = null;
        rj stackIn_95_1 = null;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        rj stackIn_96_0 = null;
        rj stackIn_96_1 = null;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        rj stackIn_97_0 = null;
        rj stackIn_97_1 = null;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        int stackIn_97_4 = 0;
        rj stackIn_99_0 = null;
        le stackIn_99_1 = null;
        rj stackIn_100_0 = null;
        le stackIn_100_1 = null;
        rj stackIn_101_0 = null;
        le stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        rj stackIn_110_0 = null;
        rj stackIn_110_1 = null;
        int stackIn_110_2 = 0;
        int stackIn_110_3 = 0;
        rj stackIn_111_0 = null;
        rj stackIn_111_1 = null;
        int stackIn_111_2 = 0;
        int stackIn_111_3 = 0;
        rj stackIn_112_0 = null;
        rj stackIn_112_1 = null;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        int stackIn_112_4 = 0;
        rj stackIn_114_0 = null;
        le stackIn_114_1 = null;
        rj stackIn_115_0 = null;
        le stackIn_115_1 = null;
        rj stackIn_116_0 = null;
        le stackIn_116_1 = null;
        int stackIn_116_2 = 0;
        rj stackOut_53_0 = null;
        rj stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        rj stackOut_55_0 = null;
        rj stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        rj stackOut_54_0 = null;
        rj stackOut_54_1 = null;
        int stackOut_54_2 = 0;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        rj stackOut_57_0 = null;
        le stackOut_57_1 = null;
        rj stackOut_59_0 = null;
        le stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        rj stackOut_58_0 = null;
        le stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        rj stackOut_109_0 = null;
        rj stackOut_109_1 = null;
        int stackOut_109_2 = 0;
        int stackOut_109_3 = 0;
        rj stackOut_111_0 = null;
        rj stackOut_111_1 = null;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        int stackOut_111_4 = 0;
        rj stackOut_110_0 = null;
        rj stackOut_110_1 = null;
        int stackOut_110_2 = 0;
        int stackOut_110_3 = 0;
        int stackOut_110_4 = 0;
        rj stackOut_113_0 = null;
        le stackOut_113_1 = null;
        rj stackOut_115_0 = null;
        le stackOut_115_1 = null;
        int stackOut_115_2 = 0;
        rj stackOut_114_0 = null;
        le stackOut_114_1 = null;
        int stackOut_114_2 = 0;
        rj stackOut_94_0 = null;
        rj stackOut_94_1 = null;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        rj stackOut_96_0 = null;
        rj stackOut_96_1 = null;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        int stackOut_96_4 = 0;
        rj stackOut_95_0 = null;
        rj stackOut_95_1 = null;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        rj stackOut_98_0 = null;
        le stackOut_98_1 = null;
        rj stackOut_100_0 = null;
        le stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        rj stackOut_99_0 = null;
        le stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        rj stackOut_79_0 = null;
        rj stackOut_79_1 = null;
        int stackOut_79_2 = 0;
        int stackOut_79_3 = 0;
        rj stackOut_81_0 = null;
        rj stackOut_81_1 = null;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        int stackOut_81_4 = 0;
        rj stackOut_80_0 = null;
        rj stackOut_80_1 = null;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        int stackOut_80_4 = 0;
        rj stackOut_83_0 = null;
        le stackOut_83_1 = null;
        rj stackOut_85_0 = null;
        le stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        rj stackOut_84_0 = null;
        le stackOut_84_1 = null;
        int stackOut_84_2 = 0;
        rj stackOut_66_0 = null;
        rj stackOut_66_1 = null;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        rj stackOut_68_0 = null;
        rj stackOut_68_1 = null;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        int stackOut_68_4 = 0;
        rj stackOut_67_0 = null;
        rj stackOut_67_1 = null;
        int stackOut_67_2 = 0;
        int stackOut_67_3 = 0;
        int stackOut_67_4 = 0;
        rj stackOut_70_0 = null;
        le stackOut_70_1 = null;
        rj stackOut_72_0 = null;
        le stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        rj stackOut_71_0 = null;
        le stackOut_71_1 = null;
        int stackOut_71_2 = 0;
        rj stackOut_30_0 = null;
        rj stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        rj stackOut_32_0 = null;
        rj stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        rj stackOut_31_0 = null;
        rj stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        rj stackOut_34_0 = null;
        le stackOut_34_1 = null;
        rj stackOut_36_0 = null;
        le stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        rj stackOut_35_0 = null;
        le stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        L0: {
          var15 = Lexicominos.field_L ? 1 : 0;
          if (param2 != 0) {
            break L0;
          } else {
            param2 = param0.field_C;
            break L0;
          }
        }
        if (param7 == null) {
          ((kk) this).field_c = null;
          return;
        } else {
          L1: {
            if (((kk) this).field_k != param0) {
              break L1;
            } else {
              if (((kk) this).field_p) {
                break L1;
              } else {
                if (param1 != ((kk) this).field_f) {
                  break L1;
                } else {
                  if (((kk) this).field_h != param3) {
                    break L1;
                  } else {
                    if (((kk) this).field_g != param2) {
                      break L1;
                    } else {
                      if (param5 != ((kk) this).field_m) {
                        break L1;
                      } else {
                        if (param4 != ((kk) this).field_j) {
                          break L1;
                        } else {
                          if (((kk) this).field_l == null) {
                            break L1;
                          } else {
                            if (!((kk) this).field_l.equals((Object) (Object) param7)) {
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
          ((kk) this).field_l = param7;
          ((kk) this).field_h = param3;
          ((kk) this).field_f = param1;
          ((kk) this).field_j = param4;
          ((kk) this).field_g = param2;
          ((kk) this).field_p = false;
          ((kk) this).field_k = param0;
          ((kk) this).field_m = param5;
          var16 = new String[param0.a(param7, param4) + 1];
          var17 = var16;
          if (param6 < -113) {
            L2: {
              var10 = Math.max(1, param0.a(param7, new int[1], var17));
              if (-4 != (((kk) this).field_h ^ -1)) {
                break L2;
              } else {
                if (1 != var10) {
                  break L2;
                } else {
                  L3: {
                    ((kk) this).field_h = 1;
                    ((kk) this).field_c = new rj[var10];
                    if (((kk) this).field_h == -1) {
                      var11 = param0.field_E;
                      break L3;
                    } else {
                      if (-2 == ((kk) this).field_h) {
                        var11 = (((kk) this).field_m + -(var10 * ((kk) this).field_g) >> 1882456225) + param0.field_E;
                        break L3;
                      } else {
                        if (2 != ((kk) this).field_h) {
                          L4: {
                            var12 = (((kk) this).field_m + -(((kk) this).field_g * var10)) / (var10 - -1);
                            if (0 <= var12) {
                              break L4;
                            } else {
                              var12 = 0;
                              break L4;
                            }
                          }
                          var11 = param0.field_E - -var12;
                          ((kk) this).field_g = ((kk) this).field_g + var12;
                          break L3;
                        } else {
                          var11 = -(((kk) this).field_g * var10) + ((kk) this).field_m + -param0.field_G;
                          break L3;
                        }
                      }
                    }
                  }
                  var12 = 0;
                  L5: while (true) {
                    if (var10 <= var12) {
                      return;
                    } else {
                      L6: {
                        var20 = var16[var12];
                        stackOut_53_0 = null;
                        stackOut_53_1 = null;
                        stackOut_53_2 = var11 - param0.field_E;
                        stackOut_53_3 = param0.field_G + var11;
                        stackIn_55_0 = stackOut_53_0;
                        stackIn_55_1 = stackOut_53_1;
                        stackIn_55_2 = stackOut_53_2;
                        stackIn_55_3 = stackOut_53_3;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        stackIn_54_2 = stackOut_53_2;
                        stackIn_54_3 = stackOut_53_3;
                        if (var20 == null) {
                          stackOut_55_0 = null;
                          stackOut_55_1 = null;
                          stackOut_55_2 = stackIn_55_2;
                          stackOut_55_3 = stackIn_55_3;
                          stackOut_55_4 = 0;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          stackIn_56_2 = stackOut_55_2;
                          stackIn_56_3 = stackOut_55_3;
                          stackIn_56_4 = stackOut_55_4;
                          break L6;
                        } else {
                          stackOut_54_0 = null;
                          stackOut_54_1 = null;
                          stackOut_54_2 = stackIn_54_2;
                          stackOut_54_3 = stackIn_54_3;
                          stackOut_54_4 = var20.length();
                          stackIn_56_0 = stackOut_54_0;
                          stackIn_56_1 = stackOut_54_1;
                          stackIn_56_2 = stackOut_54_2;
                          stackIn_56_3 = stackOut_54_3;
                          stackIn_56_4 = stackOut_54_4;
                          break L6;
                        }
                      }
                      L7: {
                        new rj(stackIn_56_2, stackIn_56_3, stackIn_56_4);
                        var21 = stackIn_56_0;
                        var21.field_a[0] = 0;
                        if (var20 == null) {
                          break L7;
                        } else {
                          L8: {
                            var21.field_a[var20.length()] = param0.b(var20);
                            stackOut_57_0 = (rj) var21;
                            stackOut_57_1 = (le) param0;
                            stackIn_59_0 = stackOut_57_0;
                            stackIn_59_1 = stackOut_57_1;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            if (-4 != (param1 ^ -1)) {
                              stackOut_59_0 = (rj) (Object) stackIn_59_0;
                              stackOut_59_1 = (le) (Object) stackIn_59_1;
                              stackOut_59_2 = 0;
                              stackIn_60_0 = stackOut_59_0;
                              stackIn_60_1 = stackOut_59_1;
                              stackIn_60_2 = stackOut_59_2;
                              break L8;
                            } else {
                              stackOut_58_0 = (rj) (Object) stackIn_58_0;
                              stackOut_58_1 = (le) (Object) stackIn_58_1;
                              stackOut_58_2 = ((kk) this).a(param4, false, param0.b(var20), var20);
                              stackIn_60_0 = stackOut_58_0;
                              stackIn_60_1 = stackOut_58_1;
                              stackIn_60_2 = stackOut_58_2;
                              break L8;
                            }
                          }
                          fa.a(stackIn_60_0, stackIn_60_1, stackIn_60_2, var20, (byte) 124);
                          break L7;
                        }
                      }
                      var11 = var11 + param2;
                      ((kk) this).field_c[var12] = var21;
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
            }
            ((kk) this).field_c = new rj[var10];
            if (((kk) this).field_h != -1) {
              if (-2 != ((kk) this).field_h) {
                if (2 != ((kk) this).field_h) {
                  L9: {
                    var12 = (((kk) this).field_m + -(((kk) this).field_g * var10)) / (var10 - -1);
                    if (0 <= var12) {
                      break L9;
                    } else {
                      var12 = 0;
                      break L9;
                    }
                  }
                  var11 = param0.field_E - -var12;
                  ((kk) this).field_g = ((kk) this).field_g + var12;
                  var12 = 0;
                  L10: while (true) {
                    if (var10 > var12) {
                      L11: {
                        var34 = var16[var12];
                        stackOut_109_0 = null;
                        stackOut_109_1 = null;
                        stackOut_109_2 = var11 - param0.field_E;
                        stackOut_109_3 = param0.field_G + var11;
                        stackIn_111_0 = stackOut_109_0;
                        stackIn_111_1 = stackOut_109_1;
                        stackIn_111_2 = stackOut_109_2;
                        stackIn_111_3 = stackOut_109_3;
                        stackIn_110_0 = stackOut_109_0;
                        stackIn_110_1 = stackOut_109_1;
                        stackIn_110_2 = stackOut_109_2;
                        stackIn_110_3 = stackOut_109_3;
                        if (var34 == null) {
                          stackOut_111_0 = null;
                          stackOut_111_1 = null;
                          stackOut_111_2 = stackIn_111_2;
                          stackOut_111_3 = stackIn_111_3;
                          stackOut_111_4 = 0;
                          stackIn_112_0 = stackOut_111_0;
                          stackIn_112_1 = stackOut_111_1;
                          stackIn_112_2 = stackOut_111_2;
                          stackIn_112_3 = stackOut_111_3;
                          stackIn_112_4 = stackOut_111_4;
                          break L11;
                        } else {
                          stackOut_110_0 = null;
                          stackOut_110_1 = null;
                          stackOut_110_2 = stackIn_110_2;
                          stackOut_110_3 = stackIn_110_3;
                          stackOut_110_4 = var34.length();
                          stackIn_112_0 = stackOut_110_0;
                          stackIn_112_1 = stackOut_110_1;
                          stackIn_112_2 = stackOut_110_2;
                          stackIn_112_3 = stackOut_110_3;
                          stackIn_112_4 = stackOut_110_4;
                          break L11;
                        }
                      }
                      L12: {
                        new rj(stackIn_112_2, stackIn_112_3, stackIn_112_4);
                        var35 = stackIn_112_0;
                        var35.field_a[0] = 0;
                        if (var34 == null) {
                          break L12;
                        } else {
                          L13: {
                            var35.field_a[var34.length()] = param0.b(var34);
                            stackOut_113_0 = (rj) var35;
                            stackOut_113_1 = (le) param0;
                            stackIn_115_0 = stackOut_113_0;
                            stackIn_115_1 = stackOut_113_1;
                            stackIn_114_0 = stackOut_113_0;
                            stackIn_114_1 = stackOut_113_1;
                            if (-4 != (param1 ^ -1)) {
                              stackOut_115_0 = (rj) (Object) stackIn_115_0;
                              stackOut_115_1 = (le) (Object) stackIn_115_1;
                              stackOut_115_2 = 0;
                              stackIn_116_0 = stackOut_115_0;
                              stackIn_116_1 = stackOut_115_1;
                              stackIn_116_2 = stackOut_115_2;
                              break L13;
                            } else {
                              stackOut_114_0 = (rj) (Object) stackIn_114_0;
                              stackOut_114_1 = (le) (Object) stackIn_114_1;
                              stackOut_114_2 = ((kk) this).a(param4, false, param0.b(var34), var34);
                              stackIn_116_0 = stackOut_114_0;
                              stackIn_116_1 = stackOut_114_1;
                              stackIn_116_2 = stackOut_114_2;
                              break L13;
                            }
                          }
                          fa.a(stackIn_116_0, stackIn_116_1, stackIn_116_2, var34, (byte) 124);
                          break L12;
                        }
                      }
                      var11 = var11 + param2;
                      ((kk) this).field_c[var12] = var35;
                      var12++;
                      continue L10;
                    } else {
                      return;
                    }
                  }
                } else {
                  var11 = -(((kk) this).field_g * var10) + ((kk) this).field_m + -param0.field_G;
                  var12 = 0;
                  L14: while (true) {
                    if (var10 > var12) {
                      L15: {
                        var28 = var16[var12];
                        stackOut_94_0 = null;
                        stackOut_94_1 = null;
                        stackOut_94_2 = var11 - param0.field_E;
                        stackOut_94_3 = param0.field_G + var11;
                        stackIn_96_0 = stackOut_94_0;
                        stackIn_96_1 = stackOut_94_1;
                        stackIn_96_2 = stackOut_94_2;
                        stackIn_96_3 = stackOut_94_3;
                        stackIn_95_0 = stackOut_94_0;
                        stackIn_95_1 = stackOut_94_1;
                        stackIn_95_2 = stackOut_94_2;
                        stackIn_95_3 = stackOut_94_3;
                        if (var28 == null) {
                          stackOut_96_0 = null;
                          stackOut_96_1 = null;
                          stackOut_96_2 = stackIn_96_2;
                          stackOut_96_3 = stackIn_96_3;
                          stackOut_96_4 = 0;
                          stackIn_97_0 = stackOut_96_0;
                          stackIn_97_1 = stackOut_96_1;
                          stackIn_97_2 = stackOut_96_2;
                          stackIn_97_3 = stackOut_96_3;
                          stackIn_97_4 = stackOut_96_4;
                          break L15;
                        } else {
                          stackOut_95_0 = null;
                          stackOut_95_1 = null;
                          stackOut_95_2 = stackIn_95_2;
                          stackOut_95_3 = stackIn_95_3;
                          stackOut_95_4 = var28.length();
                          stackIn_97_0 = stackOut_95_0;
                          stackIn_97_1 = stackOut_95_1;
                          stackIn_97_2 = stackOut_95_2;
                          stackIn_97_3 = stackOut_95_3;
                          stackIn_97_4 = stackOut_95_4;
                          break L15;
                        }
                      }
                      L16: {
                        new rj(stackIn_97_2, stackIn_97_3, stackIn_97_4);
                        var29 = stackIn_97_0;
                        var29.field_a[0] = 0;
                        if (var28 == null) {
                          break L16;
                        } else {
                          L17: {
                            var29.field_a[var28.length()] = param0.b(var28);
                            stackOut_98_0 = (rj) var29;
                            stackOut_98_1 = (le) param0;
                            stackIn_100_0 = stackOut_98_0;
                            stackIn_100_1 = stackOut_98_1;
                            stackIn_99_0 = stackOut_98_0;
                            stackIn_99_1 = stackOut_98_1;
                            if (-4 != (param1 ^ -1)) {
                              stackOut_100_0 = (rj) (Object) stackIn_100_0;
                              stackOut_100_1 = (le) (Object) stackIn_100_1;
                              stackOut_100_2 = 0;
                              stackIn_101_0 = stackOut_100_0;
                              stackIn_101_1 = stackOut_100_1;
                              stackIn_101_2 = stackOut_100_2;
                              break L17;
                            } else {
                              stackOut_99_0 = (rj) (Object) stackIn_99_0;
                              stackOut_99_1 = (le) (Object) stackIn_99_1;
                              stackOut_99_2 = ((kk) this).a(param4, false, param0.b(var28), var28);
                              stackIn_101_0 = stackOut_99_0;
                              stackIn_101_1 = stackOut_99_1;
                              stackIn_101_2 = stackOut_99_2;
                              break L17;
                            }
                          }
                          fa.a(stackIn_101_0, stackIn_101_1, stackIn_101_2, var28, (byte) 124);
                          break L16;
                        }
                      }
                      var11 = var11 + param2;
                      ((kk) this).field_c[var12] = var29;
                      var12++;
                      continue L14;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                var11 = (((kk) this).field_m + -(var10 * ((kk) this).field_g) >> 1882456225) + param0.field_E;
                var12 = 0;
                L18: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L19: {
                      var36 = var16[var12];
                      stackOut_79_0 = null;
                      stackOut_79_1 = null;
                      stackOut_79_2 = var11 - param0.field_E;
                      stackOut_79_3 = param0.field_G + var11;
                      stackIn_81_0 = stackOut_79_0;
                      stackIn_81_1 = stackOut_79_1;
                      stackIn_81_2 = stackOut_79_2;
                      stackIn_81_3 = stackOut_79_3;
                      stackIn_80_0 = stackOut_79_0;
                      stackIn_80_1 = stackOut_79_1;
                      stackIn_80_2 = stackOut_79_2;
                      stackIn_80_3 = stackOut_79_3;
                      if (var36 == null) {
                        stackOut_81_0 = null;
                        stackOut_81_1 = null;
                        stackOut_81_2 = stackIn_81_2;
                        stackOut_81_3 = stackIn_81_3;
                        stackOut_81_4 = 0;
                        stackIn_82_0 = stackOut_81_0;
                        stackIn_82_1 = stackOut_81_1;
                        stackIn_82_2 = stackOut_81_2;
                        stackIn_82_3 = stackOut_81_3;
                        stackIn_82_4 = stackOut_81_4;
                        break L19;
                      } else {
                        stackOut_80_0 = null;
                        stackOut_80_1 = null;
                        stackOut_80_2 = stackIn_80_2;
                        stackOut_80_3 = stackIn_80_3;
                        stackOut_80_4 = var36.length();
                        stackIn_82_0 = stackOut_80_0;
                        stackIn_82_1 = stackOut_80_1;
                        stackIn_82_2 = stackOut_80_2;
                        stackIn_82_3 = stackOut_80_3;
                        stackIn_82_4 = stackOut_80_4;
                        break L19;
                      }
                    }
                    L20: {
                      new rj(stackIn_82_2, stackIn_82_3, stackIn_82_4);
                      var37 = stackIn_82_0;
                      var37.field_a[0] = 0;
                      if (var36 == null) {
                        break L20;
                      } else {
                        L21: {
                          var37.field_a[var36.length()] = param0.b(var36);
                          stackOut_83_0 = (rj) var37;
                          stackOut_83_1 = (le) param0;
                          stackIn_85_0 = stackOut_83_0;
                          stackIn_85_1 = stackOut_83_1;
                          stackIn_84_0 = stackOut_83_0;
                          stackIn_84_1 = stackOut_83_1;
                          if (-4 != (param1 ^ -1)) {
                            stackOut_85_0 = (rj) (Object) stackIn_85_0;
                            stackOut_85_1 = (le) (Object) stackIn_85_1;
                            stackOut_85_2 = 0;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            stackIn_86_2 = stackOut_85_2;
                            break L21;
                          } else {
                            stackOut_84_0 = (rj) (Object) stackIn_84_0;
                            stackOut_84_1 = (le) (Object) stackIn_84_1;
                            stackOut_84_2 = ((kk) this).a(param4, false, param0.b(var36), var36);
                            stackIn_86_0 = stackOut_84_0;
                            stackIn_86_1 = stackOut_84_1;
                            stackIn_86_2 = stackOut_84_2;
                            break L21;
                          }
                        }
                        fa.a(stackIn_86_0, stackIn_86_1, stackIn_86_2, var36, (byte) 124);
                        break L20;
                      }
                    }
                    var11 = var11 + param2;
                    ((kk) this).field_c[var12] = var37;
                    var12++;
                    continue L18;
                  }
                }
              }
            } else {
              var11 = param0.field_E;
              var12 = 0;
              L22: while (true) {
                if (var10 <= var12) {
                  return;
                } else {
                  L23: {
                    var38 = var16[var12];
                    stackOut_66_0 = null;
                    stackOut_66_1 = null;
                    stackOut_66_2 = var11 - param0.field_E;
                    stackOut_66_3 = param0.field_G + var11;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_68_1 = stackOut_66_1;
                    stackIn_68_2 = stackOut_66_2;
                    stackIn_68_3 = stackOut_66_3;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    stackIn_67_2 = stackOut_66_2;
                    stackIn_67_3 = stackOut_66_3;
                    if (var38 == null) {
                      stackOut_68_0 = null;
                      stackOut_68_1 = null;
                      stackOut_68_2 = stackIn_68_2;
                      stackOut_68_3 = stackIn_68_3;
                      stackOut_68_4 = 0;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      stackIn_69_2 = stackOut_68_2;
                      stackIn_69_3 = stackOut_68_3;
                      stackIn_69_4 = stackOut_68_4;
                      break L23;
                    } else {
                      stackOut_67_0 = null;
                      stackOut_67_1 = null;
                      stackOut_67_2 = stackIn_67_2;
                      stackOut_67_3 = stackIn_67_3;
                      stackOut_67_4 = var38.length();
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      stackIn_69_2 = stackOut_67_2;
                      stackIn_69_3 = stackOut_67_3;
                      stackIn_69_4 = stackOut_67_4;
                      break L23;
                    }
                  }
                  L24: {
                    new rj(stackIn_69_2, stackIn_69_3, stackIn_69_4);
                    var39 = stackIn_69_0;
                    var39.field_a[0] = 0;
                    if (var38 == null) {
                      break L24;
                    } else {
                      L25: {
                        var39.field_a[var38.length()] = param0.b(var38);
                        stackOut_70_0 = (rj) var39;
                        stackOut_70_1 = (le) param0;
                        stackIn_72_0 = stackOut_70_0;
                        stackIn_72_1 = stackOut_70_1;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        if (-4 != (param1 ^ -1)) {
                          stackOut_72_0 = (rj) (Object) stackIn_72_0;
                          stackOut_72_1 = (le) (Object) stackIn_72_1;
                          stackOut_72_2 = 0;
                          stackIn_73_0 = stackOut_72_0;
                          stackIn_73_1 = stackOut_72_1;
                          stackIn_73_2 = stackOut_72_2;
                          break L25;
                        } else {
                          stackOut_71_0 = (rj) (Object) stackIn_71_0;
                          stackOut_71_1 = (le) (Object) stackIn_71_1;
                          stackOut_71_2 = ((kk) this).a(param4, false, param0.b(var38), var38);
                          stackIn_73_0 = stackOut_71_0;
                          stackIn_73_1 = stackOut_71_1;
                          stackIn_73_2 = stackOut_71_2;
                          break L25;
                        }
                      }
                      fa.a(stackIn_73_0, stackIn_73_1, stackIn_73_2, var38, (byte) 124);
                      break L24;
                    }
                  }
                  var11 = var11 + param2;
                  ((kk) this).field_c[var12] = var39;
                  var12++;
                  continue L22;
                }
              }
            }
          } else {
            L26: {
              ((kk) this).field_k = null;
              var10 = Math.max(1, param0.a(param7, new int[1], var17));
              if (-4 != (((kk) this).field_h ^ -1)) {
                break L26;
              } else {
                if (1 != var10) {
                  break L26;
                } else {
                  ((kk) this).field_h = 1;
                  break L26;
                }
              }
            }
            L27: {
              ((kk) this).field_c = new rj[var10];
              if (((kk) this).field_h == -1) {
                var16 = var17;
                var11 = param0.field_E;
                break L27;
              } else {
                if (-2 == ((kk) this).field_h) {
                  var11 = (((kk) this).field_m + -(var10 * ((kk) this).field_g) >> 1882456225) + param0.field_E;
                  break L27;
                } else {
                  if (2 != ((kk) this).field_h) {
                    L28: {
                      var12 = (((kk) this).field_m + -(((kk) this).field_g * var10)) / (var10 - -1);
                      if (0 <= var12) {
                        break L28;
                      } else {
                        var12 = 0;
                        break L28;
                      }
                    }
                    var11 = param0.field_E - -var12;
                    ((kk) this).field_g = ((kk) this).field_g + var12;
                    break L27;
                  } else {
                    var11 = -(((kk) this).field_g * var10) + ((kk) this).field_m + -param0.field_G;
                    break L27;
                  }
                }
              }
            }
            var16 = var17;
            var12 = 0;
            L29: while (true) {
              if (var10 <= var12) {
                return;
              } else {
                L30: {
                  var18 = var16[var12];
                  stackOut_30_0 = null;
                  stackOut_30_1 = null;
                  stackOut_30_2 = var11 - param0.field_E;
                  stackOut_30_3 = param0.field_G + var11;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  stackIn_32_2 = stackOut_30_2;
                  stackIn_32_3 = stackOut_30_3;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  stackIn_31_2 = stackOut_30_2;
                  stackIn_31_3 = stackOut_30_3;
                  if (var18 == null) {
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
                    break L30;
                  } else {
                    stackOut_31_0 = null;
                    stackOut_31_1 = null;
                    stackOut_31_2 = stackIn_31_2;
                    stackOut_31_3 = stackIn_31_3;
                    stackOut_31_4 = var18.length();
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    stackIn_33_2 = stackOut_31_2;
                    stackIn_33_3 = stackOut_31_3;
                    stackIn_33_4 = stackOut_31_4;
                    break L30;
                  }
                }
                L31: {
                  new rj(stackIn_33_2, stackIn_33_3, stackIn_33_4);
                  var19 = stackIn_33_0;
                  var19.field_a[0] = 0;
                  if (var18 == null) {
                    break L31;
                  } else {
                    L32: {
                      var19.field_a[var18.length()] = param0.b(var18);
                      stackOut_34_0 = (rj) var19;
                      stackOut_34_1 = (le) param0;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      if (-4 != (param1 ^ -1)) {
                        stackOut_36_0 = (rj) (Object) stackIn_36_0;
                        stackOut_36_1 = (le) (Object) stackIn_36_1;
                        stackOut_36_2 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        break L32;
                      } else {
                        stackOut_35_0 = (rj) (Object) stackIn_35_0;
                        stackOut_35_1 = (le) (Object) stackIn_35_1;
                        stackOut_35_2 = ((kk) this).a(param4, false, param0.b(var18), var18);
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_37_2 = stackOut_35_2;
                        break L32;
                      }
                    }
                    fa.a(stackIn_37_0, stackIn_37_1, stackIn_37_2, var18, (byte) 124);
                    break L31;
                  }
                }
                var11 = var11 + param2;
                ((kk) this).field_c[var12] = var19;
                var12++;
                continue L29;
              }
            }
          }
        }
    }

    private final rj a(le param0, String param1, byte param2, int param3) {
        rj var7 = new rj(-param0.field_E + param3, param0.field_G + param3, param1.length());
        rj var5 = var7;
        int var6 = -83 % ((param2 - 29) / 32);
        ((kk) this).field_c = new rj[]{var7};
        return var5;
    }

    public static void d(int param0) {
        if (param0 >= -70) {
          field_r = 82;
          field_n = null;
          field_i = null;
          field_q = null;
          return;
        } else {
          field_n = null;
          field_i = null;
          field_q = null;
          return;
        }
    }

    final void a(int param0, le param1, String param2, int param3, byte param4) {
        int var7 = 0;
        Object var8 = null;
        rj var10 = null;
        rj var11 = null;
        rj var12 = null;
        rj var13 = null;
        rj var14 = null;
        rj var15 = null;
        if (param2 != null) {
          if (((kk) this).field_k == param1) {
            if (((kk) this).field_p) {
              L0: {
                if (-2 != (((kk) this).field_f ^ -1)) {
                  break L0;
                } else {
                  if (null == ((kk) this).field_l) {
                    break L0;
                  } else {
                    if (!((kk) this).field_l.equals((Object) (Object) param2)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((kk) this).field_k = param1;
              ((kk) this).field_p = true;
              if (param4 != -11) {
                var8 = null;
                ((kk) this).a(59, (le) null, (String) null, 117, (byte) -57);
                ((kk) this).field_f = 1;
                var14 = this.a(param1, param2, (byte) 93, param0);
                var7 = param1.b(param2);
                var14.field_a[0] = -(var7 >> -516197599) + param3;
                var14.field_a[param2.length()] = param3 - -(var7 >> -349956415);
                fa.a(var14, param1, 0, param2, (byte) 107);
                return;
              } else {
                ((kk) this).field_f = 1;
                var15 = this.a(param1, param2, (byte) 93, param0);
                var7 = param1.b(param2);
                var15.field_a[0] = -(var7 >> -516197599) + param3;
                var15.field_a[param2.length()] = param3 - -(var7 >> -349956415);
                fa.a(var15, param1, 0, param2, (byte) 107);
                return;
              }
            } else {
              ((kk) this).field_k = param1;
              ((kk) this).field_p = true;
              if (param4 != -11) {
                var8 = null;
                ((kk) this).a(59, (le) null, (String) null, 117, (byte) -57);
                ((kk) this).field_f = 1;
                var12 = this.a(param1, param2, (byte) 93, param0);
                var7 = param1.b(param2);
                var12.field_a[0] = -(var7 >> -516197599) + param3;
                var12.field_a[param2.length()] = param3 - -(var7 >> -349956415);
                fa.a(var12, param1, 0, param2, (byte) 107);
                return;
              } else {
                ((kk) this).field_f = 1;
                var13 = this.a(param1, param2, (byte) 93, param0);
                var7 = param1.b(param2);
                var13.field_a[0] = -(var7 >> -516197599) + param3;
                var13.field_a[param2.length()] = param3 - -(var7 >> -349956415);
                fa.a(var13, param1, 0, param2, (byte) 107);
                return;
              }
            }
          } else {
            ((kk) this).field_k = param1;
            ((kk) this).field_p = true;
            if (param4 != -11) {
              var8 = null;
              ((kk) this).a(59, (le) null, (String) null, 117, (byte) -57);
              ((kk) this).field_f = 1;
              var10 = this.a(param1, param2, (byte) 93, param0);
              var7 = param1.b(param2);
              var10.field_a[0] = -(var7 >> -516197599) + param3;
              var10.field_a[param2.length()] = param3 - -(var7 >> -349956415);
              fa.a(var10, param1, 0, param2, (byte) 107);
              return;
            } else {
              ((kk) this).field_f = 1;
              var11 = this.a(param1, param2, (byte) 93, param0);
              var7 = param1.b(param2);
              var11.field_a[0] = -(var7 >> -516197599) + param3;
              var11.field_a[param2.length()] = param3 - -(var7 >> -349956415);
              fa.a(var11, param1, 0, param2, (byte) 107);
              return;
            }
          }
        } else {
          ((kk) this).field_c = null;
          return;
        }
    }

    final void a(le param0, String param1, byte param2, int param3, int param4) {
        Object var7 = null;
        rj var9 = null;
        rj var11 = null;
        rj var12 = null;
        rj var13 = null;
        rj var14 = null;
        rj var15 = null;
        rj var16 = null;
        rj var17 = null;
        if (param1 != null) {
          if (param0 == ((kk) this).field_k) {
            if (((kk) this).field_p) {
              L0: {
                if (-3 != (((kk) this).field_f ^ -1)) {
                  break L0;
                } else {
                  if (((kk) this).field_l == null) {
                    break L0;
                  } else {
                    if (!((kk) this).field_l.equals((Object) (Object) param1)) {
                      L1: {
                        ((kk) this).field_k = param0;
                        ((kk) this).field_l = param1;
                        if (param2 <= -69) {
                          break L1;
                        } else {
                          var7 = null;
                          ((kk) this).a((le) null, (String) null, (byte) 76, -31, 44);
                          break L1;
                        }
                      }
                      ((kk) this).field_p = true;
                      ((kk) this).field_f = 2;
                      var9 = this.a(param0, param1, (byte) -36, param4);
                      var15 = var9;
                      var15.field_a[0] = -param0.b(param1) + param3;
                      var15.field_a[param1.length()] = param3;
                      fa.a(var15, param0, 0, param1, (byte) 120);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((kk) this).field_k = param0;
              ((kk) this).field_l = param1;
              if (param2 > -69) {
                var7 = null;
                ((kk) this).a((le) null, (String) null, (byte) 76, -31, 44);
                ((kk) this).field_p = true;
                ((kk) this).field_f = 2;
                var9 = this.a(param0, param1, (byte) -36, param4);
                var16 = var9;
                var16.field_a[0] = -param0.b(param1) + param3;
                var16.field_a[param1.length()] = param3;
                fa.a(var16, param0, 0, param1, (byte) 120);
                return;
              } else {
                ((kk) this).field_p = true;
                ((kk) this).field_f = 2;
                var9 = this.a(param0, param1, (byte) -36, param4);
                var17 = var9;
                var17.field_a[0] = -param0.b(param1) + param3;
                var17.field_a[param1.length()] = param3;
                fa.a(var17, param0, 0, param1, (byte) 120);
                return;
              }
            } else {
              ((kk) this).field_k = param0;
              ((kk) this).field_l = param1;
              if (param2 > -69) {
                var7 = null;
                ((kk) this).a((le) null, (String) null, (byte) 76, -31, 44);
                ((kk) this).field_p = true;
                ((kk) this).field_f = 2;
                var9 = this.a(param0, param1, (byte) -36, param4);
                var13 = var9;
                var13.field_a[0] = -param0.b(param1) + param3;
                var13.field_a[param1.length()] = param3;
                fa.a(var13, param0, 0, param1, (byte) 120);
                return;
              } else {
                ((kk) this).field_p = true;
                ((kk) this).field_f = 2;
                var9 = this.a(param0, param1, (byte) -36, param4);
                var14 = var9;
                var14.field_a[0] = -param0.b(param1) + param3;
                var14.field_a[param1.length()] = param3;
                fa.a(var14, param0, 0, param1, (byte) 120);
                return;
              }
            }
          } else {
            ((kk) this).field_k = param0;
            ((kk) this).field_l = param1;
            if (param2 > -69) {
              var7 = null;
              ((kk) this).a((le) null, (String) null, (byte) 76, -31, 44);
              ((kk) this).field_p = true;
              ((kk) this).field_f = 2;
              var9 = this.a(param0, param1, (byte) -36, param4);
              var11 = var9;
              var11.field_a[0] = -param0.b(param1) + param3;
              var11.field_a[param1.length()] = param3;
              fa.a(var11, param0, 0, param1, (byte) 120);
              return;
            } else {
              ((kk) this).field_p = true;
              ((kk) this).field_f = 2;
              var9 = this.a(param0, param1, (byte) -36, param4);
              var12 = var9;
              var12.field_a[0] = -param0.b(param1) + param3;
              var12.field_a[param1.length()] = param3;
              fa.a(var12, param0, 0, param1, (byte) 120);
              return;
            }
          }
        } else {
          ((kk) this).field_c = null;
          return;
        }
    }

    public kk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "This tutorial consists of a series of demonstrations, each teaching one lesson. Move and rotate the falling blocks to make words.";
        field_r = -1;
        field_q = "The game is over when a falling block cannot fully enter the playing area.<br><br>For further details, see the instructions, which are available from the main menu and the pause menu.";
        field_i = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
