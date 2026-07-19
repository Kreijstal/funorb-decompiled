/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int[] field_d;
    static String field_b;
    static bn field_c;
    static int field_a;
    private Object field_e;

    final cn a(int param0) {
        try {
            IllegalAccessException var2 = null;
            java.lang.reflect.InvocationTargetException var2_ref = null;
            Object[] var3 = null;
            cn stackIn_6_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            cn stackOut_5_0 = null;
            if (this.field_e instanceof cn) {
              return (cn) (this.field_e);
            } else {
              try {
                L0: {
                  L1: {
                    if (param0 == 16) {
                      break L1;
                    } else {
                      this.field_e = (Object) null;
                      break L1;
                    }
                  }
                  var3 = (Object[]) null;
                  stackOut_5_0 = (cn) (hd.field_e.invoke(this.field_e, (Object[]) null));
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var2 = (IllegalAccessException) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 1;
                  break L2;
                }
              } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L3: {
                  var2_ref = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 1;
                  break L3;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_6_0;
              } else {
                return null;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!pp.a(-63, param1)) {
                var6 = wk.field_f;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = ul.field_c;
                    var3 = 0;
                    L2: while (true) {
                      if (var2.length <= var3) {
                        if (param0) {
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        var4 = var2[var3];
                        if (param1 == var4) {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param1 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2_ref), "il.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  return stackIn_24_0 != 0;
                }
              }
            }
          }
        }
    }

    il(cn param0) {
        try {
            IllegalAccessException var2 = null;
            java.lang.reflect.InvocationTargetException var2_ref = null;
            InstantiationException var2_ref2 = null;
            RuntimeException var2_ref3 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                L1: {
                  this.field_e = param0;
                  if (hd.field_h == null) {
                    break L1;
                  } else {
                    ql.field_e[0] = param0;
                    try {
                      L2: {
                        this.field_e = hd.field_h.newInstance(ql.field_e);
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var2 = (IllegalAccessException) (Object) decompiledCaughtException;
                      return;
                    } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var2_ref = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                      return;
                    } catch (java.lang.InstantiationException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L3: {
                        var2_ref2 = (InstantiationException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L4: {
                var2_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var2_ref3);
                stackOut_9_1 = new StringBuilder().append("il.<init>(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L4;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L4;
                }
              }
              throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 <= 103) {
            field_d = (int[]) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_b = "Most dungeon rooms contain rats scavenging for food. The rats in this room are much, much larger and do more than scavenge.";
        field_c = null;
        field_d = new int[]{15, 15, 16};
    }
}
