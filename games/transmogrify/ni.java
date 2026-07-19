/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ni extends h {
    static sh field_o;

    final static int a(byte param0) {
        StringBuilder discarded$2 = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        sj var5 = null;
        int var6 = 0;
        sj[] var7 = null;
        String var8 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            of.field_e.setLength(0);
            if (param0 < -107) {
              if (null == od.field_g.field_e[0]) {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                if (!qi.field_c.a(-1, od.field_g.field_e)) {
                  stackOut_24_0 = -1;
                  stackIn_25_0 = stackOut_24_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  var1_int = 0;
                  var2 = 0;
                  var7 = od.field_g.field_e;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      if (var4 >= var7.length) {
                        break L2;
                      } else {
                        L3: {
                          var5 = var7[var4];
                          if (var5 != null) {
                            break L3;
                          } else {
                            if (var6 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        discarded$2 = of.field_e.append((char)(255 & var5.field_i));
                        var2 = var2 != 0 | var5.field_x ? 1 : 0;
                        var1_int = var1_int + (var5.field_v + (var5.field_h << -207909247));
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var8 = of.field_e.toString();
                    var4 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var4 >= n.field_a) {
                            break L6;
                          } else {
                            stackOut_14_0 = var8.equalsIgnoreCase(vi.field_g[var4].toString());
                            stackIn_20_0 = stackOut_14_0 ? 1 : 0;
                            stackIn_15_0 = stackOut_14_0;
                            if (var6 != 0) {
                              break L5;
                            } else {
                              if (!stackIn_15_0) {
                                var4++;
                                if (var6 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              } else {
                                stackOut_16_0 = -1;
                                stackIn_17_0 = stackOut_16_0;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              }
                            }
                          }
                        }
                        stackOut_19_0 = var2;
                        stackIn_20_0 = stackOut_19_0;
                        break L5;
                      }
                      if (stackIn_20_0 != 0) {
                        stackOut_22_0 = var1_int << 1366194081;
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        return var1_int;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 87;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ni.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0;
              } else {
                return stackIn_27_0;
              }
            }
          }
        }
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        try {
            int var6_int = -104 / ((param3 - 51) / 47);
            if (!(!param2)) {
                jl.a(param0 + param4.field_p, param4.field_n + param1, 13612, param4.field_l, param4.field_h);
            }
            super.a(param0, param1, param2, (byte) 107, param4);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ni.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_o = null;
        if (param0 != 255) {
            field_o = (sh) null;
        }
    }

    ni(kg param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_y, -1, 2147483647, false);
    }

    ni(int param0) {
        this(vd.field_h, param0);
    }

    static {
        field_o = new sh();
    }
}
