/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ig {
    static jn field_b;
    static pl field_a;

    final static boolean b(int param0) {
        ah[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var11 = 0;
        wc var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        ah var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (ku.field_J != null) {
              if (0 != (an.field_a ^ -1)) {
                if (ku.field_J.length <= an.field_a) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var12 = ku.field_J[an.field_a];
                  var2 = var12.field_b;
                  var3 = 0;
                  var4 = 26 / ((67 - param0) / 42);
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var2.length) {
                      g.field_c = g.field_c + 1;
                      if (var3 == 0) {
                        stackIn_21_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    } else {
                      if (var2[var5] != null) {
                        if (var2[var5].field_F == g.field_c) {
                          var6 = var2[var5];
                          var7 = var6.field_C;
                          var8 = var6.field_z;
                          var9 = var6.field_Q;
                          var10 = var6.field_N;
                          var3 = 1;
                          oc.a(uj.a(var9, var7, var10, (byte) 84, var8), false);
                          var5++;
                          continue L1;
                        } else {
                          var5++;
                          continue L1;
                        }
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "ig.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 22075) {
            ig.a(66);
        }
        lf.a(0, 256);
    }

    final static int a(String param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        RuntimeException var6_ref_RuntimeException = null;
        int var6 = 0;
        byte[] var7 = null;
        int var8_int = 0;
        Throwable var8 = null;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_b = (jn) null;
                break L1;
              }
            }
            if (!qn.field_e.field_f) {
              stackIn_6_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (mi.field_b.containsKey(param0)) {
                stackIn_10_0 = 100;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var10 = ua.a((byte) 53, param0);
                if (var10 == null) {
                  stackIn_14_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var3 = pn.field_n + var10;
                  if (ha.field_e.b("", var3, -1)) {
                    if (ha.field_e.a(var3, 100)) {
                      var15 = ha.field_e.a("", var3, -1);
                      var13 = var15;
                      var4 = var13;
                      var5 = null;
                      try {
                        L2: {
                          var11 = el.a(var10, (byte) -8);
                          break L2;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
                        stackIn_25_0 = -1;
                        return stackIn_25_0;
                      }
                      L3: {
                        if (var4 == null) {
                          break L3;
                        } else {
                          if (var11 == null) {
                            break L3;
                          } else {
                            L4: {
                              L5: {
                                var6 = 1;
                                var14 = si.a(var11, (byte) -23);
                                var12 = var14;
                                var7 = var12;
                                if (var7 == null) {
                                  break L5;
                                } else {
                                  if (var14.length == var15.length) {
                                    var8_int = 0;
                                    L6: while (true) {
                                      if (var14.length <= var8_int) {
                                        break L4;
                                      } else {
                                        if (var14[var8_int] != var15[var8_int]) {
                                          var6 = 0;
                                          break L4;
                                        } else {
                                          var8_int++;
                                          continue L6;
                                        }
                                      }
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var6 = 0;
                              break L4;
                            }
                            try {
                              L7: {
                                L8: {
                                  if (var6 != 0) {
                                    break L8;
                                  } else {
                                    qn.field_e.a(var15, -31357, var11);
                                    break L8;
                                  }
                                }
                                break L7;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              var8 = decompiledCaughtException;
                              stackIn_42_0 = -1;
                              return stackIn_42_0;
                            }
                            hw.a(var11, param0, 23295);
                            stackIn_44_0 = 100;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      stackIn_46_0 = -1;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      stackIn_20_0 = ha.field_e.a(var3, (byte) 33);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_17_0 = -1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L9: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var2);

            stackIn_49_1 = new StringBuilder().append("ig.C(");

            if (param0 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L9;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_44_0;
                  } else {
                    return stackIn_46_0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_a = (pl) null;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = new jn();
    }
}
