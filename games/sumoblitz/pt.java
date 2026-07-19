/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pt {
    static java.util.zip.CRC32 field_c;
    static volatile boolean field_a;
    static String field_b;

    final static void a(boolean param0, boolean param1, int param2) {
        if (param0) {
          Sumoblitz.field_H = Sumoblitz.field_H - 1;
          if (0 == Sumoblitz.field_H) {
            jg.field_b = null;
            if (param2 == -1) {
              L0: {
                if (!param1) {
                  break L0;
                } else {
                  jj.field_d = jj.field_d - 1;
                  if (-1 != (jj.field_d ^ -1)) {
                    break L0;
                  } else {
                    bb.field_i = null;
                    return;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            if (param2 == -1) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  jj.field_d = jj.field_d - 1;
                  if (-1 != (jj.field_d ^ -1)) {
                    break L1;
                  } else {
                    bb.field_i = null;
                    return;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 == -1) {
            if (param1) {
              jj.field_d = jj.field_d - 1;
              if (-1 == (jj.field_d ^ -1)) {
                bb.field_i = null;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 12) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(pj param0, int param1, pj param2) {
        if (!(null == param2.field_o)) {
            param2.c(-5106);
        }
        if (param1 != 2066481250) {
            return;
        }
        try {
            param2.field_o = param0;
            param2.field_m = param0.field_m;
            param2.field_o.field_m = param2;
            param2.field_m.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "pt.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        qv var4_ref_qv = null;
        int var4 = 0;
        lt var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        pl var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_28_0 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var10 = ig.field_a;
            if (param0 == -22683) {
              L1: {
                L2: {
                  var2 = var10.e(param0 + -8619);
                  var3 = var10.e(-31302);
                  if (var2 != 0) {
                    break L2;
                  } else {
                    var4_ref_qv = (qv) ((Object) ak.field_b.b(-95));
                    if (var4_ref_qv == null) {
                      kk.a((byte) -127);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        var5_int = gu.field_d - var10.field_p;
                        var12 = var4_ref_qv.field_m;
                        var11 = var12;
                        var6 = var11;
                        if (var5_int <= var12.length << -622066302) {
                          break L3;
                        } else {
                          var5_int = var12.length << 2066481250;
                          break L3;
                        }
                      }
                      var7 = 0;
                      L4: while (true) {
                        L5: {
                          if (var7 >= var5_int) {
                            var4_ref_qv.b(false);
                            break L5;
                          } else {
                            var6[var7 >> -746515198] = var6[var7 >> -746515198] + (var10.e(-31302) << eb.a(768, var7 << 1553025448));
                            var7++;
                            if (var8 != 0) {
                              break L5;
                            } else {
                              continue L4;
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (1 == var2) {
                    break L6;
                  } else {
                    ms.a("LR1: " + di.b((byte) 126), (Throwable) null, 0);
                    kk.a((byte) -119);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L6;
                    }
                  }
                }
                var4 = var10.h(-2858);
                var5 = (lt) ((Object) em.field_d.b(-73));
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var5 == null) {
                        break L9;
                      } else {
                        stackOut_22_0 = var3 ^ -1;
                        stackIn_29_0 = stackOut_22_0;
                        stackIn_23_0 = stackOut_22_0;
                        if (var8 != 0) {
                          break L8;
                        } else {
                          L10: {
                            if (stackIn_23_0 != (var5.field_k ^ -1)) {
                              break L10;
                            } else {
                              if (var4 == var5.field_o) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var5 = (lt) ((Object) em.field_d.d((byte) 18));
                          if (var8 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (var5 != null) {
                      var5.b(false);
                      break L1;
                    } else {
                      stackOut_28_0 = -114;
                      stackIn_29_0 = stackOut_28_0;
                      break L8;
                    }
                  }
                  kk.a((byte) stackIn_29_0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "pt.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    protected pt() throws Throwable {
        throw new Error();
    }

    final static String a(String param0, ki param1, String param2, boolean param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                field_c = (java.util.zip.CRC32) null;
                break L1;
              }
            }
            if (!param1.b((byte) 127)) {
              stackOut_4_0 = (String) (param2);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackOut_6_0 = param4 + " - " + param1.a(param0, (byte) 33) + "%";
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("pt.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_c = new java.util.zip.CRC32();
        field_b = "challenge";
        field_a = true;
    }
}
