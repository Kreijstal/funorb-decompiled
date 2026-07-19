/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static qj field_f;
    static long field_b;
    static hi field_e;
    static int field_a;
    static String field_h;
    static boolean field_d;
    static int[][] field_g;
    static byte[][][] field_c;
    static int field_i;
    static int field_j;

    public static void a(byte param0) {
        if (param0 <= 62) {
          field_g = (int[][]) null;
          field_c = (byte[][][]) null;
          field_h = null;
          field_f = null;
          field_g = (int[][]) null;
          field_e = null;
          return;
        } else {
          field_c = (byte[][][]) null;
          field_h = null;
          field_f = null;
          field_g = (int[][]) null;
          field_e = null;
          return;
        }
    }

    final static short[] a(short[] param0, int param1, int param2, hj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_21_0 = null;
        short[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_20_0 = null;
        short[] stackOut_23_0 = null;
        short[] stackOut_9_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param3.k(param2, 1522829539);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (var4_int != param0.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L1;
              }
              if (param1 == 256) {
                L3: {
                  L4: {
                    L5: {
                      var5 = param3.k(4, 1522829539);
                      var6 = (short)param3.k(16, 1522829539);
                      if (0 >= var5) {
                        break L5;
                      } else {
                        var7 = 0;
                        L6: while (true) {
                          if (var7 >= var4_int) {
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            param0[var7] = (short)(param3.k(var5, 1522829539) + var6);
                            var7++;
                            if (var8 != 0) {
                              break L4;
                            } else {
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                    var7 = 0;
                    L7: while (true) {
                      if (var7 >= var4_int) {
                        break L4;
                      } else {
                        stackOut_20_0 = (short[]) (param0);
                        stackIn_24_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          stackIn_21_0[var7] = (short)var6;
                          var7++;
                          continue L7;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = (short[]) (param0);
                  stackIn_24_0 = stackOut_23_0;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_9_0 = (short[]) null;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("lb.D(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_24_0;
        }
    }

    final static String a(boolean param0) {
        String var1 = null;
        L0: {
          var1 = "";
          if (null != ok.field_a) {
            var1 = ok.field_a.e((byte) 28);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-1 != (var1.length() ^ -1)) {
            break L1;
          } else {
            var1 = gj.a(-113);
            break L1;
          }
        }
        if (!param0) {
          L2: {
            field_g = (int[][]) null;
            if (0 == var1.length()) {
              var1 = nf.field_q;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (0 == var1.length()) {
              var1 = nf.field_q;
              break L3;
            } else {
              break L3;
            }
          }
          return var1;
        }
    }

    final static q a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        q stackIn_4_0 = null;
        q stackIn_10_0 = null;
        q stackIn_14_0 = null;
        int stackIn_23_0 = 0;
        q stackIn_28_0 = null;
        q stackIn_42_0 = null;
        q stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        q stackOut_3_0 = null;
        q stackOut_9_0 = null;
        q stackOut_41_0 = null;
        q stackOut_46_0 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        q stackOut_27_0 = null;
        q stackOut_13_0 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = ai.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 5507) {
                  break L1;
                } else {
                  field_a = -60;
                  break L1;
                }
              }
              if (-65 > (var2_int ^ -1)) {
                stackOut_9_0 = rd.field_d;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var2_int > var4) {
                      L3: {
                        L4: {
                          var5 = param0.charAt(var4);
                          if (46 != var5) {
                            break L4;
                          } else {
                            L5: {
                              if (0 == var4) {
                                break L5;
                              } else {
                                if (var4 == var2_int - 1) {
                                  break L5;
                                } else {
                                  if (var3 != 0) {
                                    break L5;
                                  } else {
                                    var3 = 1;
                                    if (var6 == 0) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_41_0 = vc.field_N;
                            stackIn_42_0 = stackOut_41_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                        if (-1 == nb.field_c.indexOf(var5)) {
                          stackOut_46_0 = vc.field_N;
                          stackIn_47_0 = stackOut_46_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          var3 = 0;
                          break L3;
                        }
                      }
                      var4++;
                      continue L2;
                    } else {
                      return null;
                    }
                  }
                } else {
                  if (-35 == (param0.charAt(var2_int + -1) ^ -1)) {
                    var3 = 0;
                    var4 = 1;
                    L6: while (true) {
                      if (var4 < -1 + var2_int) {
                        L7: {
                          L8: {
                            var5 = param0.charAt(var4);
                            if (92 == var5) {
                              L9: {
                                if (var3 != 0) {
                                  stackOut_22_0 = 0;
                                  stackIn_23_0 = stackOut_22_0;
                                  break L9;
                                } else {
                                  stackOut_21_0 = 1;
                                  stackIn_23_0 = stackOut_21_0;
                                  break L9;
                                }
                              }
                              var3 = stackIn_23_0;
                              if (var6 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          L10: {
                            if (var5 != 34) {
                              break L10;
                            } else {
                              if (var3 == 0) {
                                stackOut_27_0 = vc.field_N;
                                stackIn_28_0 = stackOut_27_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var3 = 0;
                          break L7;
                        }
                        var4++;
                        continue L6;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_13_0 = vc.field_N;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var2);
            stackOut_52_1 = new StringBuilder().append("lb.A(");
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L11;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0;
                } else {
                  return stackIn_47_0;
                }
              }
            }
          }
        }
    }

    static {
        field_b = 0L;
        field_f = new qj();
        field_a = 256;
        field_e = new hi();
        field_i = 0;
        field_g = new int[][]{new int[]{0, 0, 640, 480}};
    }
}
