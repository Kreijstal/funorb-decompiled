/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fw extends ms {
    ha field_k;
    static wb[] field_m;
    pm field_l;

    final static cp c(boolean param0) {
        RuntimeException var1 = null;
        cp stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        cp stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              if (jt.field_v != null) {
                break L1;
              } else {
                jt.field_v = new cp();
                jt.field_v.a(kw.field_b, (byte) -118);
                jt.field_v.field_q = 5;
                jt.field_v.field_l = 6;
                jt.field_v.field_v = jm.field_a;
                jt.field_v.field_m = 4;
                jt.field_v.field_d = 2763306;
                jt.field_v.field_u = 14;
                jt.field_v.field_r = 7697781;
                jt.field_v.field_s = 0;
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                gm discarded$2 = fw.a(-20);
                break L2;
              }
            }
            stackOut_6_0 = jt.field_v;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "fw.C(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static boolean a(byte param0, Class param1, String param2) {
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
            int stackIn_7_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_19_0 = 0;
            int stackIn_21_0 = 0;
            int stackIn_24_0 = 0;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            String stackIn_29_2 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            String stackIn_33_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_23_0 = 0;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            String stackOut_32_2 = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            String stackOut_30_2 = null;
            try {
              L0: {
                var3 = (Class) jo.field_a.get((Object) (Object) param2);
                if (null != var3) {
                  if (var3.getClassLoader() != param1.getClassLoader()) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                } else {
                  L1: {
                    if (param0 > 123) {
                      break L1;
                    } else {
                      field_m = null;
                      break L1;
                    }
                  }
                  L2: {
                    var4 = null;
                    if (var4 == null) {
                      var4 = (Object) (Object) (File) mi.field_b.get((Object) (Object) param2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          var4 = (Object) (Object) new File(((File) var4).getCanonicalPath());
                          var5_ref2 = Class.forName("java.lang.Runtime");
                          var6 = Class.forName("java.lang.reflect.AccessibleObject");
                          var7 = var6.getDeclaredMethod("setAccessible", new Class[1]);
                          var8 = var5_ref2.getDeclaredMethod("load0", new Class[2]);
                          Object discarded$5 = var7.invoke((Object) (Object) var8, new Object[1]);
                          Object discarded$6 = var8.invoke((Object) (Object) Runtime.getRuntime(), new Object[2]);
                          Object discarded$7 = var7.invoke((Object) (Object) var8, new Object[1]);
                          Object discarded$8 = jo.field_a.put((Object) (Object) param2, (Object) (Object) param1);
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var5 = (NoSuchMethodException) (Object) decompiledCaughtException;
                        System.load(((File) var4).getPath());
                        Object discarded$9 = jo.field_a.put((Object) (Object) param2, (Object) (Object) hc.class);
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      } catch (java.lang.Throwable decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L5: {
                          var5_ref = decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L5;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        return stackIn_19_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_25_0 = (RuntimeException) var3_ref;
                stackOut_25_1 = new StringBuilder().append("fw.D(").append(param0).append(',');
                stackIn_28_0 = stackOut_25_0;
                stackIn_28_1 = stackOut_25_1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                if (param1 == null) {
                  stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                  stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                  stackOut_28_2 = "null";
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  stackIn_29_2 = stackOut_28_2;
                  break L6;
                } else {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "{...}";
                  stackIn_29_0 = stackOut_26_0;
                  stackIn_29_1 = stackOut_26_1;
                  stackIn_29_2 = stackOut_26_2;
                  break L6;
                }
              }
              L7: {
                stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
                stackIn_32_0 = stackOut_29_0;
                stackIn_32_1 = stackOut_29_1;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                if (param2 == null) {
                  stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
                  stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
                  stackOut_32_2 = "null";
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  break L7;
                } else {
                  stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                  stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                  stackOut_30_2 = "{...}";
                  stackIn_33_0 = stackOut_30_0;
                  stackIn_33_1 = stackOut_30_1;
                  stackIn_33_2 = stackOut_30_2;
                  break L7;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
            }
            return stackIn_24_0 != 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        try {
            field_m = null;
            if (param0 > -109) {
                cp discarded$0 = fw.c(true);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fw.B(" + param0 + ')');
        }
    }

    fw(ha param0, pm param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((fw) this).field_l = param1;
            ((fw) this).field_k = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("fw.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static gm a(int param0) {
        RuntimeException var1 = null;
        gm stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        gm stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              if (null != pp.field_d) {
                break L1;
              } else {
                pp.field_d = new gm(jm.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, jm.field_a.field_s, -1, 2147483647, true);
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                cp discarded$2 = fw.c(false);
                break L2;
              }
            }
            stackOut_6_0 = pp.field_d;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "fw.A(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    static {
    }
}
