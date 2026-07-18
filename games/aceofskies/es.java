/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class es {
    static String[] field_a;
    private wt field_d;
    static int field_c;
    private int field_f;
    static pa[] field_b;
    static String field_g;
    private wt[] field_e;
    private long field_h;
    static vd field_i;

    final wt a(boolean param0) {
        wt var2 = null;
        RuntimeException var2_ref = null;
        wt var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        wt stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_16_0 = null;
        wt stackOut_13_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            if (null == ((es) this).field_d) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (wt) (Object) stackIn_4_0;
            } else {
              if (!param0) {
                var2 = ((es) this).field_e[(int)((long)(((es) this).field_f - 1) & ((es) this).field_h)];
                L1: while (true) {
                  if (var2 == ((es) this).field_d) {
                    ((es) this).field_d = null;
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    if (~((es) this).field_d.field_i != ~((es) this).field_h) {
                      ((es) this).field_d = ((es) this).field_d.field_j;
                      continue L1;
                    } else {
                      var3 = ((es) this).field_d;
                      ((es) this).field_d = ((es) this).field_d.field_j;
                      stackOut_13_0 = (wt) var3;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  }
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (wt) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2_ref, "es.B(" + param0 + ')');
        }
        return (wt) (Object) stackIn_17_0;
    }

    final wt a(int param0, long param1) {
        wt var4 = null;
        RuntimeException var4_ref = null;
        wt var5 = null;
        wt stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        wt stackOut_8_0 = null;
        try {
          L0: {
            L1: {
              ((es) this).field_h = param1;
              var4 = ((es) this).field_e[(int)((long)(((es) this).field_f - 1) & param1)];
              if (param0 >= 87) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            ((es) this).field_d = var4.field_j;
            L2: while (true) {
              if (var4 == ((es) this).field_d) {
                ((es) this).field_d = null;
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                if (~((es) this).field_d.field_i != ~param1) {
                  ((es) this).field_d = ((es) this).field_d.field_j;
                  continue L2;
                } else {
                  var5 = ((es) this).field_d;
                  ((es) this).field_d = ((es) this).field_d.field_j;
                  stackOut_8_0 = (wt) var5;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4_ref, "es.D(" + param0 + ',' + param1 + ')');
        }
        return (wt) (Object) stackIn_12_0;
    }

    final void a(wt param0, long param1, byte param2) {
        wt var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_f) {
                break L1;
              } else {
                param0.d(-122);
                break L1;
              }
            }
            L2: {
              var5 = ((es) this).field_e[(int)(param1 & (long)(((es) this).field_f - 1))];
              param0.field_f = var5.field_f;
              param0.field_j = var5;
              param0.field_f.field_j = param0;
              if (param2 == 56) {
                break L2;
              } else {
                wt discarded$2 = ((es) this).a(false);
                break L2;
              }
            }
            param0.field_i = param1;
            param0.field_j.field_f = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5_ref;
            stackOut_8_1 = new StringBuilder().append("es.C(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(Class param0, int param1, String param2) {
        try {
            Class var3 = null;
            RuntimeException var3_ref = null;
            Object var4 = null;
            NoSuchMethodException var5 = null;
            Throwable var5_ref = null;
            Class var5_ref2 = null;
            Class var6 = null;
            java.lang.reflect.Method var7 = null;
            java.lang.reflect.Method var8 = null;
            int stackIn_5_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_19_0 = 0;
            int stackIn_22_0 = 0;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            String stackIn_31_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_21_0 = 0;
            int stackOut_9_0 = 0;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            String stackOut_30_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            try {
              L0: {
                var3 = (Class) sk.field_e.get((Object) (Object) param2);
                if (null != var3) {
                  if (var3.getClassLoader() == param0.getClassLoader()) {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0 != 0;
                  }
                } else {
                  var4 = null;
                  if (param1 <= -38) {
                    L1: {
                      if (var4 != null) {
                        break L1;
                      } else {
                        var4 = (Object) (Object) (File) vg.field_j.get((Object) (Object) param2);
                        break L1;
                      }
                    }
                    L2: {
                      if (null != var4) {
                        try {
                          L3: {
                            var4 = (Object) (Object) new File(((File) var4).getCanonicalPath());
                            var5_ref2 = Class.forName("java.lang.Runtime");
                            var6 = Class.forName("java.lang.reflect.AccessibleObject");
                            var7 = var6.getDeclaredMethod("setAccessible", new Class[1]);
                            var8 = var5_ref2.getDeclaredMethod("load0", new Class[2]);
                            Object discarded$5 = var7.invoke((Object) (Object) var8, new Object[1]);
                            Object discarded$6 = var8.invoke((Object) (Object) Runtime.getRuntime(), new Object[2]);
                            Object discarded$7 = var7.invoke((Object) (Object) var8, new Object[1]);
                            Object discarded$8 = sk.field_e.put((Object) (Object) param2, (Object) (Object) param0);
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            decompiledRegionSelector0 = 0;
                            break L3;
                          }
                        } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var5 = (NoSuchMethodException) (Object) decompiledCaughtException;
                          System.load(((File) var4).getPath());
                          Object discarded$9 = sk.field_e.put((Object) (Object) param2, (Object) (Object) ln.class);
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L4: {
                            var5_ref = decompiledCaughtException;
                            decompiledRegionSelector0 = 1;
                            break L4;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          return stackIn_17_0 != 0;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var3_ref;
                stackOut_23_1 = new StringBuilder().append("es.E(");
                stackIn_26_0 = stackOut_23_0;
                stackIn_26_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param0 == null) {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L5;
                } else {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "{...}";
                  stackIn_27_0 = stackOut_24_0;
                  stackIn_27_1 = stackOut_24_1;
                  stackIn_27_2 = stackOut_24_2;
                  break L5;
                }
              }
              L6: {
                stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
                stackIn_30_0 = stackOut_27_0;
                stackIn_30_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (param2 == null) {
                  stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                  stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                  stackOut_30_2 = "null";
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  stackIn_31_2 = stackOut_30_2;
                  break L6;
                } else {
                  stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                  stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                  stackOut_28_2 = "{...}";
                  stackIn_31_0 = stackOut_28_0;
                  stackIn_31_1 = stackOut_28_1;
                  stackIn_31_2 = stackOut_28_2;
                  break L6;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
            }
            return stackIn_22_0 != 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    es(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        wt var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            ((es) this).field_f = param0;
            ((es) this).field_e = new wt[param0];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var2_int <= ~param0) {
                    break L3;
                  } else {
                    wt dupTemp$2 = new wt();
                    ((es) this).field_e[var2_int] = dupTemp$2;
                    var3 = dupTemp$2;
                    var3.field_f = var3;
                    var3.field_j = var3;
                    var2_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "es.<init>(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1020) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            field_b = null;
            field_g = null;
            field_i = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "es.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_g = "Player Name: ";
    }
}
