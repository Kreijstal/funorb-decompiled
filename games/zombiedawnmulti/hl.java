/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    static int[] field_c;
    static db field_b;
    static int[] field_e;
    static ug[] field_d;
    static int field_a;
    static int[] field_f;

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 + param1;
              var6 = param0 + param4;
              if (oo.field_f >= param1) {
                stackOut_3_0 = oo.field_f;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (oo.field_e < param0) {
                stackOut_6_0 = param0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = oo.field_e;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int < oo.field_g) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = oo.field_g;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (oo.field_d > var6) {
                stackOut_12_0 = var6;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = oo.field_d;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              L6: {
                L7: {
                  var10 = stackIn_13_0;
                  if (param1 < oo.field_f) {
                    break L7;
                  } else {
                    if (oo.field_g > param1) {
                      var11 = param1 + oo.field_b * var8;
                      var12 = var10 + 1 - var8 >> -299578431;
                      L8: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L7;
                        } else {
                          oo.field_i[var11] = 16777215;
                          var11 = var11 + oo.field_b * 2;
                          if (var13 != 0) {
                            break L6;
                          } else {
                            if (var13 == 0) {
                              continue L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                if (param0 < oo.field_e) {
                  break L6;
                } else {
                  if (var6 < oo.field_d) {
                    var11 = oo.field_b * param0 - -var7;
                    var12 = -var7 + var9 + 1 >> -1726082751;
                    L9: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L6;
                      } else {
                        oo.field_i[var11] = 16777215;
                        var11 += 2;
                        if (var13 != 0) {
                          break L5;
                        } else {
                          if (var13 == 0) {
                            continue L9;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              }
              if (param2 >= 82) {
                break L5;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L10: {
              L11: {
                if (var5_int < oo.field_f) {
                  break L11;
                } else {
                  if (var5_int < oo.field_g) {
                    var11 = var5_int + ((var5_int - param1 & 1) + var8) * oo.field_b;
                    var12 = -var8 + var10 + 1 >> -1637771327;
                    L12: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L11;
                      } else {
                        oo.field_i[var11] = 16777215;
                        var11 = var11 + oo.field_b * 2;
                        if (var13 != 0) {
                          break L10;
                        } else {
                          if (var13 == 0) {
                            continue L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  } else {
                    break L11;
                  }
                }
              }
              if (oo.field_e > param0) {
                break L10;
              } else {
                if (oo.field_d <= var6) {
                  break L10;
                } else {
                  var11 = (1 & var6 + -param0) + (var7 + oo.field_b * var6);
                  var12 = var9 + 1 + -var7 >> 938479457;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L10;
                    } else {
                      oo.field_i[var11] = 16777215;
                      var11 += 2;
                      if (var13 != 0) {
                        break L10;
                      } else {
                        if (var13 == 0) {
                          continue L13;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5), "hl.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte[] param0, byte param1, cj param2, int param3, cj param4, int param5, int param6, cj param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            ie.field_sb = -1L;
            od.field_Gb = param0;
            qa.field_h = param5;
            kj.field_h = param0.length;
            la.field_k = false;
            fg.field_k = new byte[(qa.field_h + 7) / 8];
            mh.field_c = null;
            ej.field_n = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var11 >= od.field_Gb.length) {
                    break L3;
                  } else {
                    var10_int = var10_int + (255 & od.field_Gb[var11]);
                    var11++;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var10_int = (7 + var10_int) / 8;
                tg.field_a = new byte[var10_int];
                break L2;
              }
              L4: {
                if (null != param2.field_Cb) {
                  break L4;
                } else {
                  param2.field_Cb = new th();
                  break L4;
                }
              }
              cg.field_i = param2.field_Cb;
              cg.field_i.e(-30986);
              hq.field_c = new sc(param8);
              ao.field_e = 0;
              if (param1 == 75) {
                L5: {
                  dm.field_Zb = -1;
                  cb.field_i = 0;
                  bc.field_e = -1;
                  if (null != param7.field_Cb) {
                    break L5;
                  } else {
                    param7.field_Cb = new th();
                    break L5;
                  }
                }
                L6: {
                  tn.field_C = param7.field_Cb;
                  tn.field_C.e(-30986);
                  af.field_h = new sc(param9);
                  if (param4.field_Cb != null) {
                    break L6;
                  } else {
                    param4.field_Cb = new th();
                    break L6;
                  }
                }
                nh.field_g = param4.field_Cb;
                nh.field_g.e(param1 + -31061);
                kp.field_o = new sc(param6);
                so.field_r = param3;
                qi.field_c = 0L;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var10);
            stackOut_17_1 = new StringBuilder().append("hl.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param3).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param7 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param8 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 16777215) {
            field_e = (int[]) null;
        }
        field_c = null;
        field_f = null;
        field_e = null;
        field_b = null;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            field_b = (db) null;
        }
        return ie.field_sb == mh.field_c.field_nc ? true : false;
    }

    static {
        field_e = new int[1024];
        field_b = new db();
        field_d = new ug[15];
        field_a = -1;
        field_f = new int[8192];
    }
}
