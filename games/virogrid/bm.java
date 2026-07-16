/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends ie {
    private int field_l;
    private int field_q;
    static wl field_i;
    private int field_j;
    private int field_p;
    private String field_h;
    private boolean field_m;
    private e field_f;
    static String field_g;
    private int field_k;
    static String field_o;
    static String field_n;

    final void a(int param0, byte param1, e param2, int param3, String param4) {
        ri var9 = null;
        ri var10 = null;
        ri var11 = null;
        ri var12 = null;
        ri var13 = null;
        ri var14 = null;
        if (param4 != null) {
          if (((bm) this).field_f == param2) {
            if (((bm) this).field_m) {
              L0: {
                if (0 != ((bm) this).field_j) {
                  break L0;
                } else {
                  if (((bm) this).field_h == null) {
                    break L0;
                  } else {
                    if (!((bm) this).field_h.equals((Object) (Object) param4)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((bm) this).field_f = param2;
              ((bm) this).field_m = true;
              ((bm) this).field_j = 0;
              ((bm) this).field_h = param4;
              var13 = this.a(false, param4, param2, param0);
              var14 = var13;
              var13.field_d[0] = param3;
              var14.field_d[param4.length()] = param3 + param2.a(param4);
              bd.a(param1 ^ 91, 0, var14, param2, param4);
              if (param1 != 59) {
                ((bm) this).field_h = null;
                return;
              } else {
                return;
              }
            } else {
              ((bm) this).field_f = param2;
              ((bm) this).field_m = true;
              ((bm) this).field_j = 0;
              ((bm) this).field_h = param4;
              var11 = this.a(false, param4, param2, param0);
              var12 = var11;
              var11.field_d[0] = param3;
              var12.field_d[param4.length()] = param3 + param2.a(param4);
              bd.a(param1 ^ 91, 0, var12, param2, param4);
              if (param1 != 59) {
                ((bm) this).field_h = null;
                return;
              } else {
                return;
              }
            }
          } else {
            ((bm) this).field_f = param2;
            ((bm) this).field_m = true;
            ((bm) this).field_j = 0;
            ((bm) this).field_h = param4;
            var9 = this.a(false, param4, param2, param0);
            var10 = var9;
            var9.field_d[0] = param3;
            var10.field_d[param4.length()] = param3 + param2.a(param4);
            bd.a(param1 ^ 91, 0, var10, param2, param4);
            if (param1 != 59) {
              ((bm) this).field_h = null;
              return;
            } else {
              return;
            }
          }
        } else {
          ((bm) this).field_d = null;
          return;
        }
    }

    final static mg[] a(int param0, int param1, int param2, byte param3) {
        if (param3 >= -68) {
          boolean discarded$2 = bm.a('￶', true);
          return he.b(param2, 1, param1, (byte) 89, param0);
        } else {
          return he.b(param2, 1, param1, (byte) 89, param0);
        }
    }

    final static void d(int param0, int param1) {
        c.field_a = param0;
        if (param1 == 0) {
          L0: {
            if (null != vg.field_B) {
              vg.field_B.e(2, param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (null != wc.field_f) {
            wc.field_f.a((byte) 90, param0);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            field_g = null;
            if (null != vg.field_B) {
              vg.field_B.e(2, param0);
              break L1;
            } else {
              break L1;
            }
          }
          if (null == wc.field_f) {
            return;
          } else {
            wc.field_f.a((byte) 90, param0);
            return;
          }
        }
    }

    final void a(byte param0, int param1, String param2, int param3, e param4) {
        ri var8 = null;
        ri var10 = null;
        ri var11 = null;
        ri var12 = null;
        ri var13 = null;
        if (param2 == null) {
          ((bm) this).field_d = null;
          return;
        } else {
          if (param0 <= -49) {
            if (param4 == ((bm) this).field_f) {
              if (((bm) this).field_m) {
                if ((((bm) this).field_j ^ -1) == -3) {
                  if (((bm) this).field_h != null) {
                    if (!((bm) this).field_h.equals((Object) (Object) param2)) {
                      ((bm) this).field_j = 2;
                      ((bm) this).field_f = param4;
                      ((bm) this).field_h = param2;
                      ((bm) this).field_m = true;
                      var8 = this.a(false, param2, param4, param3);
                      var12 = var8;
                      var12.field_d[0] = -param4.a(param2) + param1;
                      var12.field_d[param2.length()] = param1;
                      bd.a(37, 0, var12, param4, param2);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((bm) this).field_j = 2;
                    ((bm) this).field_f = param4;
                    ((bm) this).field_h = param2;
                    ((bm) this).field_m = true;
                    var8 = this.a(false, param2, param4, param3);
                    var13 = var8;
                    var13.field_d[0] = -param4.a(param2) + param1;
                    var13.field_d[param2.length()] = param1;
                    bd.a(37, 0, var13, param4, param2);
                    return;
                  }
                } else {
                  ((bm) this).field_j = 2;
                  ((bm) this).field_f = param4;
                  ((bm) this).field_h = param2;
                  ((bm) this).field_m = true;
                  var8 = this.a(false, param2, param4, param3);
                  var13 = var8;
                  var13.field_d[0] = -param4.a(param2) + param1;
                  var13.field_d[param2.length()] = param1;
                  bd.a(37, 0, var13, param4, param2);
                  return;
                }
              } else {
                ((bm) this).field_j = 2;
                ((bm) this).field_f = param4;
                ((bm) this).field_h = param2;
                ((bm) this).field_m = true;
                var8 = this.a(false, param2, param4, param3);
                var11 = var8;
                var11.field_d[0] = -param4.a(param2) + param1;
                var11.field_d[param2.length()] = param1;
                bd.a(37, 0, var11, param4, param2);
                return;
              }
            } else {
              ((bm) this).field_j = 2;
              ((bm) this).field_f = param4;
              ((bm) this).field_h = param2;
              ((bm) this).field_m = true;
              var8 = this.a(false, param2, param4, param3);
              var10 = var8;
              var10.field_d[0] = -param4.a(param2) + param1;
              var10.field_d[param2.length()] = param1;
              bd.a(37, 0, var10, param4, param2);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, String param4, e param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var15 = 0;
        Object var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        String var19 = null;
        ri var20 = null;
        String var21 = null;
        ri var22 = null;
        String var29 = null;
        ri var30 = null;
        String var35 = null;
        ri var36 = null;
        String var37 = null;
        ri var38 = null;
        String var39 = null;
        ri var40 = null;
        ri stackIn_32_0 = null;
        ri stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        ri stackIn_33_0 = null;
        ri stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        ri stackIn_34_0 = null;
        ri stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        ri stackIn_57_0 = null;
        ri stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        ri stackIn_58_0 = null;
        ri stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        ri stackIn_59_0 = null;
        ri stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        ri stackIn_73_0 = null;
        ri stackIn_73_1 = null;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        ri stackIn_74_0 = null;
        ri stackIn_74_1 = null;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        ri stackIn_75_0 = null;
        ri stackIn_75_1 = null;
        int stackIn_75_2 = 0;
        int stackIn_75_3 = 0;
        int stackIn_75_4 = 0;
        int stackIn_78_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        ri stackIn_89_0 = null;
        ri stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        ri stackIn_90_0 = null;
        ri stackIn_90_1 = null;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        ri stackIn_91_0 = null;
        ri stackIn_91_1 = null;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        int stackIn_91_4 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        ri stackIn_104_0 = null;
        ri stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        ri stackIn_105_0 = null;
        ri stackIn_105_1 = null;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        ri stackIn_106_0 = null;
        ri stackIn_106_1 = null;
        int stackIn_106_2 = 0;
        int stackIn_106_3 = 0;
        int stackIn_106_4 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        ri stackIn_117_0 = null;
        ri stackIn_117_1 = null;
        int stackIn_117_2 = 0;
        int stackIn_117_3 = 0;
        ri stackIn_118_0 = null;
        ri stackIn_118_1 = null;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        ri stackIn_119_0 = null;
        ri stackIn_119_1 = null;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        int stackIn_119_4 = 0;
        int stackIn_122_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        ri stackOut_56_0 = null;
        ri stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        ri stackOut_58_0 = null;
        ri stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        ri stackOut_57_0 = null;
        ri stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        ri stackOut_116_0 = null;
        ri stackOut_116_1 = null;
        int stackOut_116_2 = 0;
        int stackOut_116_3 = 0;
        ri stackOut_118_0 = null;
        ri stackOut_118_1 = null;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        int stackOut_118_4 = 0;
        ri stackOut_117_0 = null;
        ri stackOut_117_1 = null;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        int stackOut_117_4 = 0;
        int stackOut_121_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        ri stackOut_103_0 = null;
        ri stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        ri stackOut_105_0 = null;
        ri stackOut_105_1 = null;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        int stackOut_105_4 = 0;
        ri stackOut_104_0 = null;
        ri stackOut_104_1 = null;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        int stackOut_104_4 = 0;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        ri stackOut_88_0 = null;
        ri stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        ri stackOut_90_0 = null;
        ri stackOut_90_1 = null;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        int stackOut_90_4 = 0;
        ri stackOut_89_0 = null;
        ri stackOut_89_1 = null;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        int stackOut_89_4 = 0;
        int stackOut_93_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        ri stackOut_72_0 = null;
        ri stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        ri stackOut_74_0 = null;
        ri stackOut_74_1 = null;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        int stackOut_74_4 = 0;
        ri stackOut_73_0 = null;
        ri stackOut_73_1 = null;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        int stackOut_73_4 = 0;
        int stackOut_77_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        ri stackOut_31_0 = null;
        ri stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        ri stackOut_33_0 = null;
        ri stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        ri stackOut_32_0 = null;
        ri stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        L0: {
          var15 = Virogrid.field_F ? 1 : 0;
          if ((param3 ^ -1) != -1) {
            break L0;
          } else {
            param3 = param5.field_J;
            break L0;
          }
        }
        if (param4 == null) {
          ((bm) this).field_d = null;
          return;
        } else {
          L1: {
            if (param5 != ((bm) this).field_f) {
              break L1;
            } else {
              if (((bm) this).field_m) {
                break L1;
              } else {
                if ((((bm) this).field_j ^ -1) != (param1 ^ -1)) {
                  break L1;
                } else {
                  if ((param0 ^ -1) != (((bm) this).field_l ^ -1)) {
                    break L1;
                  } else {
                    if ((param3 ^ -1) != (((bm) this).field_q ^ -1)) {
                      break L1;
                    } else {
                      if ((param7 ^ -1) != (((bm) this).field_k ^ -1)) {
                        break L1;
                      } else {
                        if (((bm) this).field_p != param6) {
                          break L1;
                        } else {
                          if (((bm) this).field_h == null) {
                            break L1;
                          } else {
                            if (!((bm) this).field_h.equals((Object) (Object) param4)) {
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
          ((bm) this).field_l = param0;
          ((bm) this).field_j = param1;
          ((bm) this).field_q = param3;
          ((bm) this).field_k = param7;
          ((bm) this).field_h = param4;
          ((bm) this).field_f = param5;
          ((bm) this).field_m = false;
          ((bm) this).field_p = param6;
          var17 = new String[1 + param5.b(param4, param6)];
          var18 = var17;
          if (param2) {
            L2: {
              var10 = Math.max(1, param5.a(param4, new int[1], var18));
              if ((((bm) this).field_l ^ -1) != -4) {
                break L2;
              } else {
                if (-2 != (var10 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    ((bm) this).field_l = 1;
                    if (0 != ((bm) this).field_l) {
                      if (1 == ((bm) this).field_l) {
                        var11 = (-(var10 * ((bm) this).field_q) + ((bm) this).field_k >> 675191489) + param5.field_H;
                        break L3;
                      } else {
                        if ((((bm) this).field_l ^ -1) != -3) {
                          L4: {
                            var12 = (((bm) this).field_k - ((bm) this).field_q * var10) / (var10 - -1);
                            if (0 > var12) {
                              var12 = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var11 = param5.field_H - -var12;
                          ((bm) this).field_q = ((bm) this).field_q + var12;
                          break L3;
                        } else {
                          var11 = -(var10 * ((bm) this).field_q) + (-param5.field_G + ((bm) this).field_k);
                          break L3;
                        }
                      }
                    } else {
                      var11 = param5.field_H;
                      break L3;
                    }
                  }
                  ((bm) this).field_d = new ri[var10];
                  var12 = 0;
                  L5: while (true) {
                    if ((var10 ^ -1) >= (var12 ^ -1)) {
                      return;
                    } else {
                      L6: {
                        var21 = var17[var12];
                        stackOut_56_0 = null;
                        stackOut_56_1 = null;
                        stackOut_56_2 = -param5.field_H + var11;
                        stackOut_56_3 = var11 + param5.field_G;
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        stackIn_58_2 = stackOut_56_2;
                        stackIn_58_3 = stackOut_56_3;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        stackIn_57_3 = stackOut_56_3;
                        if (var21 == null) {
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
                          stackOut_57_4 = var21.length();
                          stackIn_59_0 = stackOut_57_0;
                          stackIn_59_1 = stackOut_57_1;
                          stackIn_59_2 = stackOut_57_2;
                          stackIn_59_3 = stackOut_57_3;
                          stackIn_59_4 = stackOut_57_4;
                          break L6;
                        }
                      }
                      L7: {
                        var22 = new ri(stackIn_59_2, stackIn_59_3, stackIn_59_4);
                        var22.field_d[0] = 0;
                        if (var21 != null) {
                          L8: {
                            var22.field_d[var21.length()] = param5.a(var21);
                            stackOut_61_0 = 62;
                            stackIn_63_0 = stackOut_61_0;
                            stackIn_62_0 = stackOut_61_0;
                            if (-4 != (param1 ^ -1)) {
                              stackOut_63_0 = stackIn_63_0;
                              stackOut_63_1 = 0;
                              stackIn_64_0 = stackOut_63_0;
                              stackIn_64_1 = stackOut_63_1;
                              break L8;
                            } else {
                              stackOut_62_0 = stackIn_62_0;
                              stackOut_62_1 = ((bm) this).a(var21, param5.a(var21), true, param6);
                              stackIn_64_0 = stackOut_62_0;
                              stackIn_64_1 = stackOut_62_1;
                              break L8;
                            }
                          }
                          bd.a(stackIn_64_0, stackIn_64_1, var22, param5, var21);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var11 = var11 + param3;
                      ((bm) this).field_d[var12] = var22;
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
            }
            if (0 != ((bm) this).field_l) {
              if (1 == ((bm) this).field_l) {
                var11 = (-(var10 * ((bm) this).field_q) + ((bm) this).field_k >> 675191489) + param5.field_H;
                ((bm) this).field_d = new ri[var10];
                var12 = 0;
                L9: while (true) {
                  if ((var10 ^ -1) >= (var12 ^ -1)) {
                    return;
                  } else {
                    L10: {
                      var39 = var17[var12];
                      stackOut_116_0 = null;
                      stackOut_116_1 = null;
                      stackOut_116_2 = -param5.field_H + var11;
                      stackOut_116_3 = var11 + param5.field_G;
                      stackIn_118_0 = stackOut_116_0;
                      stackIn_118_1 = stackOut_116_1;
                      stackIn_118_2 = stackOut_116_2;
                      stackIn_118_3 = stackOut_116_3;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      stackIn_117_2 = stackOut_116_2;
                      stackIn_117_3 = stackOut_116_3;
                      if (var39 == null) {
                        stackOut_118_0 = null;
                        stackOut_118_1 = null;
                        stackOut_118_2 = stackIn_118_2;
                        stackOut_118_3 = stackIn_118_3;
                        stackOut_118_4 = 0;
                        stackIn_119_0 = stackOut_118_0;
                        stackIn_119_1 = stackOut_118_1;
                        stackIn_119_2 = stackOut_118_2;
                        stackIn_119_3 = stackOut_118_3;
                        stackIn_119_4 = stackOut_118_4;
                        break L10;
                      } else {
                        stackOut_117_0 = null;
                        stackOut_117_1 = null;
                        stackOut_117_2 = stackIn_117_2;
                        stackOut_117_3 = stackIn_117_3;
                        stackOut_117_4 = var39.length();
                        stackIn_119_0 = stackOut_117_0;
                        stackIn_119_1 = stackOut_117_1;
                        stackIn_119_2 = stackOut_117_2;
                        stackIn_119_3 = stackOut_117_3;
                        stackIn_119_4 = stackOut_117_4;
                        break L10;
                      }
                    }
                    L11: {
                      var40 = new ri(stackIn_119_2, stackIn_119_3, stackIn_119_4);
                      var40.field_d[0] = 0;
                      if (var39 != null) {
                        L12: {
                          var40.field_d[var39.length()] = param5.a(var39);
                          stackOut_121_0 = 62;
                          stackIn_123_0 = stackOut_121_0;
                          stackIn_122_0 = stackOut_121_0;
                          if (-4 != (param1 ^ -1)) {
                            stackOut_123_0 = stackIn_123_0;
                            stackOut_123_1 = 0;
                            stackIn_124_0 = stackOut_123_0;
                            stackIn_124_1 = stackOut_123_1;
                            break L12;
                          } else {
                            stackOut_122_0 = stackIn_122_0;
                            stackOut_122_1 = ((bm) this).a(var39, param5.a(var39), true, param6);
                            stackIn_124_0 = stackOut_122_0;
                            stackIn_124_1 = stackOut_122_1;
                            break L12;
                          }
                        }
                        bd.a(stackIn_124_0, stackIn_124_1, var40, param5, var39);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var11 = var11 + param3;
                    ((bm) this).field_d[var12] = var40;
                    var12++;
                    continue L9;
                  }
                }
              } else {
                if ((((bm) this).field_l ^ -1) != -3) {
                  L13: {
                    var12 = (((bm) this).field_k - ((bm) this).field_q * var10) / (var10 - -1);
                    if (0 > var12) {
                      var12 = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var11 = param5.field_H - -var12;
                  ((bm) this).field_q = ((bm) this).field_q + var12;
                  ((bm) this).field_d = new ri[var10];
                  var12 = 0;
                  L14: while (true) {
                    if ((var10 ^ -1) >= (var12 ^ -1)) {
                      return;
                    } else {
                      L15: {
                        var37 = var17[var12];
                        stackOut_103_0 = null;
                        stackOut_103_1 = null;
                        stackOut_103_2 = -param5.field_H + var11;
                        stackOut_103_3 = var11 + param5.field_G;
                        stackIn_105_0 = stackOut_103_0;
                        stackIn_105_1 = stackOut_103_1;
                        stackIn_105_2 = stackOut_103_2;
                        stackIn_105_3 = stackOut_103_3;
                        stackIn_104_0 = stackOut_103_0;
                        stackIn_104_1 = stackOut_103_1;
                        stackIn_104_2 = stackOut_103_2;
                        stackIn_104_3 = stackOut_103_3;
                        if (var37 == null) {
                          stackOut_105_0 = null;
                          stackOut_105_1 = null;
                          stackOut_105_2 = stackIn_105_2;
                          stackOut_105_3 = stackIn_105_3;
                          stackOut_105_4 = 0;
                          stackIn_106_0 = stackOut_105_0;
                          stackIn_106_1 = stackOut_105_1;
                          stackIn_106_2 = stackOut_105_2;
                          stackIn_106_3 = stackOut_105_3;
                          stackIn_106_4 = stackOut_105_4;
                          break L15;
                        } else {
                          stackOut_104_0 = null;
                          stackOut_104_1 = null;
                          stackOut_104_2 = stackIn_104_2;
                          stackOut_104_3 = stackIn_104_3;
                          stackOut_104_4 = var37.length();
                          stackIn_106_0 = stackOut_104_0;
                          stackIn_106_1 = stackOut_104_1;
                          stackIn_106_2 = stackOut_104_2;
                          stackIn_106_3 = stackOut_104_3;
                          stackIn_106_4 = stackOut_104_4;
                          break L15;
                        }
                      }
                      L16: {
                        var38 = new ri(stackIn_106_2, stackIn_106_3, stackIn_106_4);
                        var38.field_d[0] = 0;
                        if (var37 != null) {
                          L17: {
                            var38.field_d[var37.length()] = param5.a(var37);
                            stackOut_108_0 = 62;
                            stackIn_110_0 = stackOut_108_0;
                            stackIn_109_0 = stackOut_108_0;
                            if (-4 != (param1 ^ -1)) {
                              stackOut_110_0 = stackIn_110_0;
                              stackOut_110_1 = 0;
                              stackIn_111_0 = stackOut_110_0;
                              stackIn_111_1 = stackOut_110_1;
                              break L17;
                            } else {
                              stackOut_109_0 = stackIn_109_0;
                              stackOut_109_1 = ((bm) this).a(var37, param5.a(var37), true, param6);
                              stackIn_111_0 = stackOut_109_0;
                              stackIn_111_1 = stackOut_109_1;
                              break L17;
                            }
                          }
                          bd.a(stackIn_111_0, stackIn_111_1, var38, param5, var37);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var11 = var11 + param3;
                      ((bm) this).field_d[var12] = var38;
                      var12++;
                      continue L14;
                    }
                  }
                } else {
                  var11 = -(var10 * ((bm) this).field_q) + (-param5.field_G + ((bm) this).field_k);
                  ((bm) this).field_d = new ri[var10];
                  var12 = 0;
                  L18: while (true) {
                    if ((var10 ^ -1) < (var12 ^ -1)) {
                      L19: {
                        var35 = var17[var12];
                        stackOut_88_0 = null;
                        stackOut_88_1 = null;
                        stackOut_88_2 = -param5.field_H + var11;
                        stackOut_88_3 = var11 + param5.field_G;
                        stackIn_90_0 = stackOut_88_0;
                        stackIn_90_1 = stackOut_88_1;
                        stackIn_90_2 = stackOut_88_2;
                        stackIn_90_3 = stackOut_88_3;
                        stackIn_89_0 = stackOut_88_0;
                        stackIn_89_1 = stackOut_88_1;
                        stackIn_89_2 = stackOut_88_2;
                        stackIn_89_3 = stackOut_88_3;
                        if (var35 == null) {
                          stackOut_90_0 = null;
                          stackOut_90_1 = null;
                          stackOut_90_2 = stackIn_90_2;
                          stackOut_90_3 = stackIn_90_3;
                          stackOut_90_4 = 0;
                          stackIn_91_0 = stackOut_90_0;
                          stackIn_91_1 = stackOut_90_1;
                          stackIn_91_2 = stackOut_90_2;
                          stackIn_91_3 = stackOut_90_3;
                          stackIn_91_4 = stackOut_90_4;
                          break L19;
                        } else {
                          stackOut_89_0 = null;
                          stackOut_89_1 = null;
                          stackOut_89_2 = stackIn_89_2;
                          stackOut_89_3 = stackIn_89_3;
                          stackOut_89_4 = var35.length();
                          stackIn_91_0 = stackOut_89_0;
                          stackIn_91_1 = stackOut_89_1;
                          stackIn_91_2 = stackOut_89_2;
                          stackIn_91_3 = stackOut_89_3;
                          stackIn_91_4 = stackOut_89_4;
                          break L19;
                        }
                      }
                      L20: {
                        var36 = new ri(stackIn_91_2, stackIn_91_3, stackIn_91_4);
                        var36.field_d[0] = 0;
                        if (var35 != null) {
                          L21: {
                            var36.field_d[var35.length()] = param5.a(var35);
                            stackOut_93_0 = 62;
                            stackIn_95_0 = stackOut_93_0;
                            stackIn_94_0 = stackOut_93_0;
                            if (-4 != (param1 ^ -1)) {
                              stackOut_95_0 = stackIn_95_0;
                              stackOut_95_1 = 0;
                              stackIn_96_0 = stackOut_95_0;
                              stackIn_96_1 = stackOut_95_1;
                              break L21;
                            } else {
                              stackOut_94_0 = stackIn_94_0;
                              stackOut_94_1 = ((bm) this).a(var35, param5.a(var35), true, param6);
                              stackIn_96_0 = stackOut_94_0;
                              stackIn_96_1 = stackOut_94_1;
                              break L21;
                            }
                          }
                          bd.a(stackIn_96_0, stackIn_96_1, var36, param5, var35);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      var11 = var11 + param3;
                      ((bm) this).field_d[var12] = var36;
                      var12++;
                      continue L18;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              var11 = param5.field_H;
              ((bm) this).field_d = new ri[var10];
              var12 = 0;
              L22: while (true) {
                if ((var10 ^ -1) < (var12 ^ -1)) {
                  L23: {
                    var29 = var17[var12];
                    stackOut_72_0 = null;
                    stackOut_72_1 = null;
                    stackOut_72_2 = -param5.field_H + var11;
                    stackOut_72_3 = var11 + param5.field_G;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_74_1 = stackOut_72_1;
                    stackIn_74_2 = stackOut_72_2;
                    stackIn_74_3 = stackOut_72_3;
                    stackIn_73_0 = stackOut_72_0;
                    stackIn_73_1 = stackOut_72_1;
                    stackIn_73_2 = stackOut_72_2;
                    stackIn_73_3 = stackOut_72_3;
                    if (var29 == null) {
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
                      stackOut_73_4 = var29.length();
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_75_1 = stackOut_73_1;
                      stackIn_75_2 = stackOut_73_2;
                      stackIn_75_3 = stackOut_73_3;
                      stackIn_75_4 = stackOut_73_4;
                      break L23;
                    }
                  }
                  L24: {
                    var30 = new ri(stackIn_75_2, stackIn_75_3, stackIn_75_4);
                    var30.field_d[0] = 0;
                    if (var29 != null) {
                      L25: {
                        var30.field_d[var29.length()] = param5.a(var29);
                        stackOut_77_0 = 62;
                        stackIn_79_0 = stackOut_77_0;
                        stackIn_78_0 = stackOut_77_0;
                        if (-4 != (param1 ^ -1)) {
                          stackOut_79_0 = stackIn_79_0;
                          stackOut_79_1 = 0;
                          stackIn_80_0 = stackOut_79_0;
                          stackIn_80_1 = stackOut_79_1;
                          break L25;
                        } else {
                          stackOut_78_0 = stackIn_78_0;
                          stackOut_78_1 = ((bm) this).a(var29, param5.a(var29), true, param6);
                          stackIn_80_0 = stackOut_78_0;
                          stackIn_80_1 = stackOut_78_1;
                          break L25;
                        }
                      }
                      bd.a(stackIn_80_0, stackIn_80_1, var30, param5, var29);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  var11 = var11 + param3;
                  ((bm) this).field_d[var12] = var30;
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
              ((bm) this).a(-35, (byte) -77, (e) null, 104, (String) null);
              var10 = Math.max(1, param5.a(param4, new int[1], var18));
              if ((((bm) this).field_l ^ -1) != -4) {
                break L26;
              } else {
                if (-2 != (var10 ^ -1)) {
                  break L26;
                } else {
                  ((bm) this).field_l = 1;
                  break L26;
                }
              }
            }
            L27: {
              if (0 != ((bm) this).field_l) {
                if (1 == ((bm) this).field_l) {
                  var11 = (-(var10 * ((bm) this).field_q) + ((bm) this).field_k >> 675191489) + param5.field_H;
                  break L27;
                } else {
                  if ((((bm) this).field_l ^ -1) != -3) {
                    L28: {
                      var12 = (((bm) this).field_k - ((bm) this).field_q * var10) / (var10 - -1);
                      if (0 > var12) {
                        var12 = 0;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var11 = param5.field_H - -var12;
                    ((bm) this).field_q = ((bm) this).field_q + var12;
                    break L27;
                  } else {
                    var11 = -(var10 * ((bm) this).field_q) + (-param5.field_G + ((bm) this).field_k);
                    break L27;
                  }
                }
              } else {
                var11 = param5.field_H;
                break L27;
              }
            }
            ((bm) this).field_d = new ri[var10];
            var12 = 0;
            L29: while (true) {
              if ((var10 ^ -1) >= (var12 ^ -1)) {
                return;
              } else {
                L30: {
                  var19 = var17[var12];
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = -param5.field_H + var11;
                  stackOut_31_3 = var11 + param5.field_G;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  stackIn_32_3 = stackOut_31_3;
                  if (var19 == null) {
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
                    stackOut_32_4 = var19.length();
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    stackIn_34_3 = stackOut_32_3;
                    stackIn_34_4 = stackOut_32_4;
                    break L30;
                  }
                }
                L31: {
                  var20 = new ri(stackIn_34_2, stackIn_34_3, stackIn_34_4);
                  var20.field_d[0] = 0;
                  if (var19 != null) {
                    L32: {
                      var20.field_d[var19.length()] = param5.a(var19);
                      stackOut_36_0 = 62;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_37_0 = stackOut_36_0;
                      if (-4 != (param1 ^ -1)) {
                        stackOut_38_0 = stackIn_38_0;
                        stackOut_38_1 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        break L32;
                      } else {
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = ((bm) this).a(var19, param5.a(var19), true, param6);
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        break L32;
                      }
                    }
                    bd.a(stackIn_39_0, stackIn_39_1, var20, param5, var19);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                var11 = var11 + param3;
                ((bm) this).field_d[var12] = var20;
                var12++;
                continue L29;
              }
            }
          }
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
          if (65 > param0) {
            if (param0 >= 97) {
              if (122 < param0) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (122 < param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private final ri a(boolean param0, String param1, e param2, int param3) {
        ri var5 = null;
        ri var6 = null;
        var6 = new ri(-param2.field_H + param3, param3 + param2.field_G, param1.length());
        var5 = var6;
        if (param0) {
          return null;
        } else {
          ((bm) this).field_d = new ri[]{var6};
          return var5;
        }
    }

    final static void c(int param0, int param1) {
        if (50 != param1) {
            throw new IllegalArgumentException();
        }
        if (param0 > -77) {
            bm.d(-53, 115);
            return;
        }
    }

    public static void c(int param0) {
        if (param0 != 2797) {
          field_g = null;
          field_o = null;
          field_i = null;
          field_n = null;
          field_g = null;
          return;
        } else {
          field_o = null;
          field_i = null;
          field_n = null;
          field_g = null;
          return;
        }
    }

    final void a(String param0, byte param1, e param2, int param3, int param4) {
        int var6 = 0;
        int var8 = 0;
        ri var9 = null;
        ri var10 = null;
        ri var11 = null;
        ri var12 = null;
        if (param0 != null) {
          if (((bm) this).field_f == param2) {
            if (((bm) this).field_m) {
              if (-2 == (((bm) this).field_j ^ -1)) {
                if (((bm) this).field_h != null) {
                  if (!((bm) this).field_h.equals((Object) (Object) param0)) {
                    var6 = 78 / ((-27 - param1) / 49);
                    ((bm) this).field_m = true;
                    ((bm) this).field_j = 1;
                    ((bm) this).field_f = param2;
                    var11 = this.a(false, param0, param2, param4);
                    var8 = param2.a(param0);
                    var11.field_d[0] = param3 + -(var8 >> 1240474017);
                    var11.field_d[param0.length()] = (var8 >> -1671175295) + param3;
                    bd.a(94, 0, var11, param2, param0);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var6 = 78 / ((-27 - param1) / 49);
                  ((bm) this).field_m = true;
                  ((bm) this).field_j = 1;
                  ((bm) this).field_f = param2;
                  var12 = this.a(false, param0, param2, param4);
                  var8 = param2.a(param0);
                  var12.field_d[0] = param3 + -(var8 >> 1240474017);
                  var12.field_d[param0.length()] = (var8 >> -1671175295) + param3;
                  bd.a(94, 0, var12, param2, param0);
                  return;
                }
              } else {
                var6 = 78 / ((-27 - param1) / 49);
                ((bm) this).field_m = true;
                ((bm) this).field_j = 1;
                ((bm) this).field_f = param2;
                var12 = this.a(false, param0, param2, param4);
                var8 = param2.a(param0);
                var12.field_d[0] = param3 + -(var8 >> 1240474017);
                var12.field_d[param0.length()] = (var8 >> -1671175295) + param3;
                bd.a(94, 0, var12, param2, param0);
                return;
              }
            } else {
              var6 = 78 / ((-27 - param1) / 49);
              ((bm) this).field_m = true;
              ((bm) this).field_j = 1;
              ((bm) this).field_f = param2;
              var10 = this.a(false, param0, param2, param4);
              var8 = param2.a(param0);
              var10.field_d[0] = param3 + -(var8 >> 1240474017);
              var10.field_d[param0.length()] = (var8 >> -1671175295) + param3;
              bd.a(94, 0, var10, param2, param0);
              return;
            }
          } else {
            var6 = 78 / ((-27 - param1) / 49);
            ((bm) this).field_m = true;
            ((bm) this).field_j = 1;
            ((bm) this).field_f = param2;
            var9 = this.a(false, param0, param2, param4);
            var8 = param2.a(param0);
            var9.field_d[0] = param3 + -(var8 >> 1240474017);
            var9.field_d[param0.length()] = (var8 >> -1671175295) + param3;
            bd.a(94, 0, var9, param2, param0);
            return;
          }
        } else {
          ((bm) this).field_d = null;
          return;
        }
    }

    public bm() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "This game has been updated! Please reload this page.";
        field_i = new wl();
        field_o = "Auto-respond to <%0>";
        field_n = "Waiting for sound effects";
    }
}
