/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends mc {
    boolean field_s;
    int[] field_u;
    static boolean field_r;
    int field_t;
    static byte[] field_q;
    static int field_n;
    static vl field_p;
    static jb field_o;

    public static void b(byte param0) {
        if (param0 != 6) {
            return;
        }
        field_p = null;
        field_o = null;
        field_q = null;
    }

    final static hb a(int param0) {
        if (param0 <= 22) {
            return (hb) null;
        }
        return new hb(i.e(-11), ld.j(-97));
    }

    final static boolean a(int param0, byte param1) {
        hb discarded$0 = null;
        if (0 == (param0 ^ -1)) {
            return true;
        }
        if (param1 <= 104) {
            discarded$0 = cf.a(-75);
        }
        return (1 << param0 & me.field_a) != 0 ? true : false;
    }

    cf() {
        this.field_s = false;
    }

    final static mh a(String param0, byte param1) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mh stackIn_6_0 = null;
        mh stackIn_10_0 = null;
        mh stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        mh stackIn_28_0 = null;
        mh stackIn_42_0 = null;
        mh stackIn_46_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_5_0 = null;
        mh stackOut_9_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        mh stackOut_27_0 = null;
        mh stackOut_14_0 = null;
        mh stackOut_41_0 = null;
        mh stackOut_45_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param1 <= -112) {
                break L1;
              } else {
                discarded$1 = cf.a(-113, (byte) -111);
                break L1;
              }
            }
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_5_0 = c.field_o;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2_int > 64) {
                stackOut_9_0 = nb.field_V;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) == 34) {
                  if (param0.charAt(var2_int - 1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L2: while (true) {
                      if (-1 + var2_int > var4) {
                        L3: {
                          var5 = param0.charAt(var4);
                          if (var5 == 92) {
                            L4: {
                              if (var3 != 0) {
                                stackOut_23_0 = 0;
                                stackIn_24_0 = stackOut_23_0;
                                break L4;
                              } else {
                                stackOut_22_0 = 1;
                                stackIn_24_0 = stackOut_22_0;
                                break L4;
                              }
                            }
                            var3 = stackIn_24_0;
                            break L3;
                          } else {
                            L5: {
                              if (var5 != 34) {
                                break L5;
                              } else {
                                if (var3 != 0) {
                                  break L5;
                                } else {
                                  stackOut_27_0 = jg.field_h;
                                  stackIn_28_0 = stackOut_27_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
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
                    stackOut_14_0 = jg.field_h;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  L6: while (true) {
                    if (var4 < var2_int) {
                      L7: {
                        var5 = param0.charAt(var4);
                        if (var5 == 46) {
                          L8: {
                            if (0 == var4) {
                              break L8;
                            } else {
                              if (var4 == -1 + var2_int) {
                                break L8;
                              } else {
                                if (var3 != 0) {
                                  break L8;
                                } else {
                                  var3 = 1;
                                  break L7;
                                }
                              }
                            }
                          }
                          stackOut_41_0 = jg.field_h;
                          stackIn_42_0 = stackOut_41_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (0 != (lc.field_c.indexOf(var5) ^ -1)) {
                            var3 = 0;
                            break L7;
                          } else {
                            stackOut_45_0 = jg.field_h;
                            stackIn_46_0 = stackOut_45_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      var4++;
                      continue L6;
                    } else {
                      return null;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var2);
            stackOut_50_1 = new StringBuilder().append("cf.B(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L9;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L9;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0;
                } else {
                  return stackIn_46_0;
                }
              }
            }
          }
        }
    }

    static {
        field_q = new byte[520];
        field_r = false;
    }
}
