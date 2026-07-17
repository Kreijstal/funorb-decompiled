/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class f extends vg implements ni {
    static String field_z;
    static boolean field_C;
    static int[] field_y;
    static String field_B;
    pf field_A;

    final boolean a(int param0, int param1, int param2, vg param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        vg var9 = null;
        int var10 = 0;
        Object var11 = null;
        on var12 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var11 = null;
                boolean discarded$2 = ((f) this).a(118, -43, -76, (vg) null, 87, 88, 5);
                break L1;
              }
            }
            var12 = new on(((f) this).field_A);
            var9 = (vg) (Object) var12.a(2);
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.c(param0 + 2048)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.f(1)) {
                        break L4;
                      } else {
                        if (!var9.a(0, param1, param2, param3, param4, param5, param6)) {
                          break L4;
                        } else {
                          stackOut_8_0 = 1;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        }
                      }
                    }
                    var9 = (vg) (Object) var12.a((byte) 58);
                    continue L2;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("f.MA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        RuntimeException var8 = null;
        vg var9 = null;
        int var10 = 0;
        Object var11 = null;
        on var12 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = new on(((f) this).field_A);
              if (param2 >= 95) {
                break L1;
              } else {
                var11 = null;
                boolean discarded$2 = ((f) this).a((vg) null, -47);
                break L1;
              }
            }
            var9 = (vg) (Object) var12.a(2);
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.c(2048)) {
                    break L3;
                  } else {
                    if (!var9.a(param0, param1, (byte) 109, param3, param4 + ((f) this).field_m, param5 + ((f) this).field_q, param6)) {
                      var9 = (vg) (Object) var12.a((byte) 87);
                      continue L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("f.TA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param6 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        vg var6_ref_vg = null;
        int var6 = 0;
        int var7 = 0;
        on var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_17_0 = false;
        boolean stackOut_16_0 = false;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var8 = new on(((f) this).field_A);
            var6_ref_vg = (vg) (Object) var8.a(param2 ^ 15);
            L1: while (true) {
              L2: {
                if (var6_ref_vg == null) {
                  break L2;
                } else {
                  if (!var6_ref_vg.c(param2 ^ 2061)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var6_ref_vg.f(1)) {
                        break L3;
                      } else {
                        if (var6_ref_vg.a(param0, param1, 13, param3)) {
                          stackOut_7_0 = 1;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6_ref_vg = (vg) (Object) var8.a((byte) 84);
                    continue L1;
                  }
                }
              }
              if (param2 == 13) {
                var6 = param0;
                if (var6 == 80) {
                  L4: {
                    if (di.field_p[81]) {
                      stackOut_17_0 = ((f) this).a(param3, true);
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      stackOut_16_0 = ((f) this).a(param3, param2 + 105);
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("f.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    vg i(int param0) {
        on var2 = null;
        vg var3 = null;
        int var4 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = new on(((f) this).field_A);
          if (param0 == 1) {
            break L0;
          } else {
            field_C = true;
            break L0;
          }
        }
        var3 = (vg) (Object) var2.a(param0 ^ 3);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.f(1)) {
              var3 = (vg) (Object) var2.a((byte) 121);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 103, param3, param4);
        if (param2 < 99) {
            vg discarded$0 = ((f) this).i(-8);
        }
        this.h(-87);
    }

    private final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        on var5 = null;
        RuntimeException var5_ref = null;
        vg var6 = null;
        int var7 = 0;
        int var8 = 0;
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
        RuntimeException decompiledCaughtException = null;
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
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = new on(((f) this).field_A);
            var6 = (vg) (Object) var5.a(2);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                StringBuilder discarded$12 = param0.append(10);
                var7 = 0;
                L2: while (true) {
                  if (var7 > param3) {
                    StringBuilder discarded$13 = var6.a((byte) 125, param1, param3 - -1, param0);
                    var6 = (vg) (Object) var5.a((byte) 89);
                    continue L1;
                  } else {
                    StringBuilder discarded$14 = param0.append(32);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5_ref;
            stackOut_8_1 = new StringBuilder().append("f.QA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + -114 + 44 + param3 + 41);
        }
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        on var3 = new on(((f) this).field_A);
        vg var4 = (vg) (Object) var3.a(2);
        while (var4 != null) {
            var5 = var4.e(param0);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (vg) (Object) var3.a((byte) 51);
        }
        if (param0 != -600269855) {
            field_B = null;
        }
        return var2;
    }

    final boolean a(byte param0, vg param1) {
        on var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        vg var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = new on(((f) this).field_A);
            var6 = (vg) (Object) var3.a(2);
            L1: while (true) {
              if (var6 == null) {
                var4 = -111 / ((param0 - 61) / 59);
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                if (!var6.a((byte) 125, param1)) {
                  var6 = (vg) (Object) var3.a((byte) 100);
                  continue L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("f.CA(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    final boolean a(vg param0, boolean param1) {
        on var3 = null;
        RuntimeException var3_ref = null;
        vg var4 = null;
        on var5 = null;
        vg var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((f) this).field_A.g(-86)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3 = new on(((f) this).field_A);
                if (param1) {
                  break L1;
                } else {
                  field_B = null;
                  break L1;
                }
              }
              var4 = (vg) (Object) var3.c(-30);
              L2: while (true) {
                if (var4 == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L3: {
                    if (!var4.f(1)) {
                      break L3;
                    } else {
                      var5 = new on(((f) this).field_A);
                      oh discarded$2 = var5.a((byte) 109, (oh) (Object) var4);
                      var6 = (vg) (Object) var5.b((byte) -124);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a((byte) 124, param0)) {
                            var6 = (vg) (Object) var5.b((byte) -124);
                            continue L4;
                          } else {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (vg) (Object) var3.b((byte) -124);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("f.RA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final boolean a(vg param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        vg var5 = null;
        on var6 = null;
        vg var7 = null;
        int var8 = 0;
        on var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((f) this).field_A.g(102)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var4 = 70 % ((5 - param1) / 50);
              var9 = new on(((f) this).field_A);
              var5 = (vg) (Object) var9.a(2);
              L1: while (true) {
                if (var5 == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L2: {
                    if (var5.f(1)) {
                      var6 = new on(((f) this).field_A);
                      oh discarded$2 = var6.a(false, (oh) (Object) var5);
                      var7 = (vg) (Object) var6.a((byte) 54);
                      L3: while (true) {
                        if (var7 == null) {
                          break L2;
                        } else {
                          if (var7.a((byte) 123, param0)) {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          } else {
                            var7 = (vg) (Object) var6.a((byte) 68);
                            continue L3;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var5 = (vg) (Object) var9.a((byte) 111);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("f.DA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == 0) {
            if (null != ((f) this).field_p) {
                ((f) this).field_p.a((vg) this, param3, true, param2, (byte) 12);
            }
        }
        on var5 = new on(((f) this).field_A);
        if (param1 != -11857) {
            return;
        }
        vg var6 = (vg) (Object) var5.c(param1 ^ -11803);
        while (var6 != null) {
            var6.a(param0, -11857, ((f) this).field_q + param2, ((f) this).field_m + param3);
            var6 = (vg) (Object) var5.b((byte) -124);
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var5_int = 31 % ((64 - param0) / 61);
              if (((f) this).a(false, param2, param3, param1)) {
                ((f) this).a(param1, param2, false, param3);
                this.a(param3, param1, (byte) -114, param2);
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = (StringBuilder) param3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("f.NA(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, mj param1) {
        mj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            param1.b((byte) -127);
            var2 = (mj) (Object) gr.field_p.d(0);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a(param1, 0)) {
                    break L2;
                  } else {
                    var2 = (mj) (Object) gr.field_p.a((byte) -71);
                    continue L1;
                  }
                }
              }
              L3: {
                if (var2 != null) {
                  wp.a((byte) -127, (oh) (Object) param1, (oh) (Object) var2);
                  break L3;
                } else {
                  gr.field_p.a((byte) -113, (oh) (Object) param1);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref;
            stackOut_11_1 = new StringBuilder().append("f.SA(").append(-60).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    public static void j(int param0) {
        field_z = null;
        if (param0 < 88) {
            field_C = true;
        }
        field_y = null;
        field_B = null;
    }

    private final void h(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        on var2 = new on(((f) this).field_A);
        vg var3 = (vg) (Object) var2.a(2);
        while (var3 != null) {
            var3.d((byte) 90);
            var3 = (vg) (Object) var2.a((byte) 63);
        }
    }

    final void b(byte param0, vg param1) {
        try {
            if (param0 >= -41) {
                field_z = null;
            }
            ((f) this).field_A.a((byte) -113, (oh) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "f.LA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        on var7 = null;
        RuntimeException var7_ref = null;
        vg var8 = null;
        int var9 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var7 = new on(((f) this).field_A);
            var8 = (vg) (Object) var7.a(param4 + 600269857);
            if (param4 == -600269855) {
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.c(2048)) {
                      break L2;
                    } else {
                      var8.a(param0, ((f) this).field_q + param1, param2 - -((f) this).field_m, param3, -600269855, param5);
                      var8 = (vg) (Object) var7.a((byte) 60);
                      continue L1;
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7_ref;
            stackOut_7_1 = new StringBuilder().append("f.HA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void e(byte param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = -104 / ((param0 - -84) / 33);
        on var3 = new on(((f) this).field_A);
        vg var4 = (vg) (Object) var3.a(2);
        while (var4 != null) {
            var4.e((byte) -121);
            var4 = (vg) (Object) var3.a((byte) 88);
        }
    }

    String c(boolean param0) {
        on var2 = null;
        vg var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = new on(((f) this).field_A);
        if (param0) {
          var3 = (vg) (Object) var2.a(2);
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.c(true);
              if (var4 == null) {
                var3 = (vg) (Object) var2.a((byte) 104);
                continue L0;
              } else {
                return var4;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    f(int param0, int param1, int param2, int param3, iq param4) {
        super(param0, param1, param2, param3, param4, (ko) null);
        ((f) this).field_A = new pf();
    }

    void a(int param0, int param1, vg param2, byte param3) {
        on var5 = null;
        RuntimeException var5_ref = null;
        vg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new on(((f) this).field_A);
            var6 = (vg) (Object) var5.a(2);
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.c(2048)) {
                    break L2;
                  } else {
                    var6.a(((f) this).field_m + param0, ((f) this).field_q + param1, param2, (byte) 91);
                    var6 = (vg) (Object) var5.a((byte) 94);
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("f.PA(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    final boolean f(int param0) {
        if (param0 != 1) {
            field_z = null;
        }
        return ((f) this).i(1) != null ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "You are offering a rematch.";
        field_z = "Options";
        field_C = false;
    }
}
