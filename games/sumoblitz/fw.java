/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fw extends ms {
    ha field_k;
    static wb[] field_m;
    pm field_l;

    final static cp c(boolean param0) {
        if (jt.field_v != null) {
          if (param0) {
            gm discarded$4 = fw.a(-20);
            return jt.field_v;
          } else {
            return jt.field_v;
          }
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
          if (!param0) {
            return jt.field_v;
          } else {
            gm discarded$5 = fw.a(-20);
            return jt.field_v;
          }
        }
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
            File var9 = null;
            int stackIn_5_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_18_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_17_0 = 0;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            try {
              L0: {
                var3 = (Class) jo.field_a.get((Object) (Object) param2);
                if (var3 != null) {
                  if (var3.getClassLoader() != param1.getClassLoader()) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0 != 0;
                  } else {
                    return true;
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
                          var9 = new File(((File) var4).getCanonicalPath());
                          var4 = (Object) (Object) var9;
                          var5_ref2 = Class.forName("java.lang.Runtime");
                          var6 = Class.forName("java.lang.reflect.AccessibleObject");
                          var7 = var6.getDeclaredMethod("setAccessible", new Class[1]);
                          var8 = var5_ref2.getDeclaredMethod("load0", new Class[2]);
                          Object discarded$5 = var7.invoke((Object) (Object) var8, new Object[1]);
                          Object discarded$6 = var8.invoke((Object) (Object) Runtime.getRuntime(), new Object[2]);
                          Object discarded$7 = var7.invoke((Object) (Object) var8, new Object[1]);
                          Object discarded$8 = jo.field_a.put((Object) (Object) param2, (Object) (Object) param1);
                          stackOut_12_0 = 1;
                          stackIn_13_0 = stackOut_12_0;
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var5 = (NoSuchMethodException) (Object) decompiledCaughtException;
                        System.load(((File) var4).getPath());
                        Object discarded$9 = jo.field_a.put((Object) (Object) param2, (Object) (Object) hc.class);
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } catch (java.lang.Throwable decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L5: {
                          var5_ref = decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L5;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        return stackIn_13_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_19_0 = (RuntimeException) var3_ref;
                stackOut_19_1 = new StringBuilder().append("fw.D(").append(param0).append(44);
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                if (param1 == null) {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L6;
                } else {
                  stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                  stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                  stackOut_20_2 = "{...}";
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  break L6;
                }
              }
              L7: {
                stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param2 == null) {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L7;
                } else {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L7;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
            }
            return stackIn_18_0 != 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_m = null;
        if (param0 > -109) {
            cp discarded$0 = fw.c(true);
        }
    }

    fw(ha param0, pm param1) {
        try {
            ((fw) this).field_l = param1;
            ((fw) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fw.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static gm a(int param0) {
        if (null == pp.field_d) {
          pp.field_d = new gm(jm.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, jm.field_a.field_s, -1, 2147483647, true);
          cp discarded$4 = fw.c(false);
          return pp.field_d;
        } else {
          cp discarded$5 = fw.c(false);
          return pp.field_d;
        }
    }

    static {
    }
}
