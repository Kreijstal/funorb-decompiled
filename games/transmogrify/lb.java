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
        }
        field_c = (byte[][][]) null;
        field_h = null;
        field_f = null;
        field_g = (int[][]) null;
        field_e = null;
    }

    final static short[] a(short[] param0, int param1, int param2, hj param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
                  var5 = param3.k(4, 1522829539);
                  var6 = (short)param3.k(16, 1522829539);
                  if (0 >= var5) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param0[var7] = (short)var6;
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param0[var7] = (short)(param3.k(var5, 1522829539) + var6);
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackIn_19_0 = (short[]) (param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_10_0 = (short[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("lb.D(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_19_0;
        }
    }

    final static String a(boolean param0) {
        String var1 = "";
        if (!(null == ok.field_a)) {
            var1 = ok.field_a.e((byte) 28);
        }
        if (-1 == (var1.length() ^ -1)) {
            var1 = gj.a(-113);
        }
        if (!param0) {
            field_g = (int[][]) null;
        }
        if (!(0 != var1.length())) {
            var1 = nf.field_q;
        }
        return var1;
    }

    final static q a(String param0, int param1) {
        q stackIn_4_0 = null;
        q stackIn_10_0 = null;
        q stackIn_14_0 = null;
        int stackIn_23_0 = 0;
        q stackIn_28_0 = null;
        q stackIn_41_0 = null;
        q stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackIn_4_0 = ai.field_a;
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
                stackIn_10_0 = rd.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var2_int > var4) {
                      L3: {
                        var5 = param0.charAt(var4);
                        if (46 != var5) {
                          if (-1 == nb.field_c.indexOf(var5)) {
                            stackIn_46_0 = vc.field_N;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L3;
                          }
                        } else {
                          L4: {
                            if (0 == var4) {
                              break L4;
                            } else {
                              if (var4 == var2_int - 1) {
                                break L4;
                              } else {
                                if (var3 != 0) {
                                  break L4;
                                } else {
                                  var3 = 1;
                                  break L3;
                                }
                              }
                            }
                          }
                          stackIn_41_0 = vc.field_N;
                          decompiledRegionSelector0 = 4;
                          break L0;
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
                    L5: while (true) {
                      if (var4 < -1 + var2_int) {
                        L6: {
                          var5 = param0.charAt(var4);
                          if (92 == var5) {
                            L7: {
                              if (var3 != 0) {
                                stackIn_23_0 = 0;
                                break L7;
                              } else {
                                stackIn_23_0 = 1;
                                break L7;
                              }
                            }
                            var3 = stackIn_23_0;
                            break L6;
                          } else {
                            L8: {
                              if (var5 != 34) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  stackIn_28_0 = vc.field_N;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var3 = 0;
                            break L6;
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_14_0 = vc.field_N;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var2);

            stackIn_52_1 = new StringBuilder().append("lb.A(");

            if (param0 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L9;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
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
                  return stackIn_41_0;
                } else {
                  return stackIn_46_0;
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
