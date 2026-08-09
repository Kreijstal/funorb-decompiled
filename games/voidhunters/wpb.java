/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wpb extends rqa {
    static java.awt.Color field_p;
    static String field_o;

    wpb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            wpb.a(108, -55);
            field_p = null;
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              oq.field_d = param0[0].a(66);
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, -50);
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wpb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int[] param0, int[] param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == param1) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != null) {
                if (param0 != null) {
                  if (param2 == 28) {
                    if (param1.length != param0.length) {
                      stackIn_19_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var3_int = 0;
                      var4 = param1.length - 3;
                      L1: while (true) {
                        if (var4 <= var3_int) {
                          var4 += 3;
                          L2: while (true) {
                            if (var4 <= var3_int) {
                              stackIn_45_0 = 0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              if (param0[var3_int] == param1[var3_int]) {
                                var3_int++;
                                continue L2;
                              } else {
                                stackIn_42_0 = 1;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              }
                            }
                          }
                        } else {
                          if ((param0[var3_int] ^ -1) == (param1[var3_int] ^ -1)) {
                            var3_int++;
                            if (param1[var3_int] != param0[var3_int]) {
                              stackIn_29_0 = 1;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              var3_int++;
                              if (param1[var3_int] != param0[var3_int]) {
                                stackIn_33_0 = 1;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              } else {
                                var3_int++;
                                if (param0[var3_int] == param1[var3_int]) {
                                  var3_int++;
                                  continue L1;
                                } else {
                                  stackIn_36_0 = 1;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                  } else {
                    stackIn_15_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L3: {
                  if (param0 == null) {
                    stackIn_9_0 = 0;
                    break L3;
                  } else {
                    stackIn_9_0 = 1;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var3);

            stackIn_48_1 = new StringBuilder().append("wpb.D(");

            if (param0 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L4;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');

            if (param1 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L5;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_49_0), stackIn_52_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_29_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_33_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_36_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_42_0 != 0;
                        } else {
                          return stackIn_45_0 != 0;
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

    final static asb a(int param0, int param1) {
        asb stackIn_5_0 = null;
        asb stackIn_11_0 = null;
        if (param1 == 11835) {
          if (akb.field_a == null) {
            if (-1 == param0) {
              return akb.field_a;
            } else {
              return mla.a(true, false, -52, true, param0, 1);
            }
          } else {
            stackIn_11_0 = akb.field_a;
            return stackIn_11_0;
          }
        } else {
          field_o = (String) null;
          if (akb.field_a != null) {
            return akb.field_a;
          } else {
            L0: {
              if (-1 != param0) {
                stackIn_5_0 = mla.a(true, false, -52, true, param0, 1);
                break L0;
              } else {
                stackIn_5_0 = akb.field_a;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    static {
        field_o = "Accept rematch";
        field_p = new java.awt.Color(10040319);
    }
}
