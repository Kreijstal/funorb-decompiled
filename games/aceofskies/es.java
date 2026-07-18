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
        wt var3 = null;
        if (null == ((es) this).field_d) {
            return null;
        }
        if (param0) {
            return null;
        }
        wt var2 = ((es) this).field_e[(int)((long)(((es) this).field_f - 1) & ((es) this).field_h)];
        while (var2 != ((es) this).field_d) {
            if (~((es) this).field_d.field_i == ~((es) this).field_h) {
                var3 = ((es) this).field_d;
                ((es) this).field_d = ((es) this).field_d.field_j;
                return var3;
            }
            ((es) this).field_d = ((es) this).field_d.field_j;
        }
        ((es) this).field_d = null;
        return null;
    }

    final wt a(int param0, long param1) {
        wt var4 = null;
        wt var5 = null;
        ((es) this).field_h = param1;
        var4 = ((es) this).field_e[(int)((long)(((es) this).field_f - 1) & param1)];
        if (param0 >= 87) {
          ((es) this).field_d = var4.field_j;
          L0: while (true) {
            if (var4 == ((es) this).field_d) {
              ((es) this).field_d = null;
              return null;
            } else {
              if (~((es) this).field_d.field_i != ~param1) {
                ((es) this).field_d = ((es) this).field_d.field_j;
                continue L0;
              } else {
                var5 = ((es) this).field_d;
                ((es) this).field_d = ((es) this).field_d.field_j;
                return var5;
              }
            }
          }
        } else {
          field_b = null;
          ((es) this).field_d = var4.field_j;
          L1: while (true) {
            if (var4 == ((es) this).field_d) {
              ((es) this).field_d = null;
              return null;
            } else {
              if (~((es) this).field_d.field_i != ~param1) {
                ((es) this).field_d = ((es) this).field_d.field_j;
                continue L1;
              } else {
                var5 = ((es) this).field_d;
                ((es) this).field_d = ((es) this).field_d.field_j;
                return var5;
              }
            }
          }
        }
    }

    final void a(wt param0, long param1, byte param2) {
        wt var5 = null;
        try {
            if (null != param0.field_f) {
                param0.d(-122);
            }
            var5 = ((es) this).field_e[(int)(param1 & (long)(((es) this).field_f - 1))];
            param0.field_f = var5.field_f;
            param0.field_j = var5;
            param0.field_f.field_j = param0;
            if (param2 != 56) {
                wt discarded$0 = ((es) this).a(false);
            }
            param0.field_i = param1;
            param0.field_j.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "es.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
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
            File var9 = null;
            int stackIn_4_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
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
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
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
              var3 = (Class) sk.field_e.get((Object) (Object) param2);
              if (var3 != null) {
                if (var3.getClassLoader() == param0.getClassLoader()) {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0 != 0;
                }
              } else {
                var4 = null;
                L0: {
                  if (var4 != null) {
                    break L0;
                  } else {
                    var4 = (Object) (Object) (File) vg.field_j.get((Object) (Object) param2);
                    break L0;
                  }
                }
                if (var4 != null) {
                  try {
                    L1: {
                      var9 = new File(((File) var4).getCanonicalPath());
                      var4 = (Object) (Object) var9;
                      var5_ref2 = Class.forName("java.lang.Runtime");
                      var6 = Class.forName("java.lang.reflect.AccessibleObject");
                      var7 = var6.getDeclaredMethod("setAccessible", new Class[1]);
                      var8 = var5_ref2.getDeclaredMethod("load0", new Class[2]);
                      Object discarded$5 = var7.invoke((Object) (Object) var8, new Object[1]);
                      Object discarded$6 = var8.invoke((Object) (Object) Runtime.getRuntime(), new Object[2]);
                      Object discarded$7 = var7.invoke((Object) (Object) var8, new Object[1]);
                      Object discarded$8 = sk.field_e.put((Object) (Object) param2, (Object) (Object) param0);
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      break L1;
                    }
                  } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var5 = (NoSuchMethodException) (Object) decompiledCaughtException;
                    System.load(((File) var4).getPath());
                    Object discarded$9 = sk.field_e.put((Object) (Object) param2, (Object) (Object) ln.class);
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  } catch (java.lang.Throwable decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var5_ref = decompiledCaughtException;
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  }
                  return stackIn_14_0 != 0;
                } else {
                  return false;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L2: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_19_0 = (RuntimeException) var3_ref;
                stackOut_19_1 = new StringBuilder().append("es.E(");
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
                  break L2;
                } else {
                  stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                  stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                  stackOut_20_2 = "{...}";
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  break L2;
                }
              }
              L3: {
                stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(-106).append(',');
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
                  break L3;
                } else {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L3;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    es(int param0) {
        int var2 = 0;
        wt var3 = null;
        ((es) this).field_f = param0;
        ((es) this).field_e = new wt[param0];
        for (var2 = 0; var2 < param0; var2++) {
            wt dupTemp$0 = new wt();
            var3 = dupTemp$0;
            ((es) this).field_e[var2] = dupTemp$0;
            var3.field_f = var3;
            var3.field_j = var3;
        }
    }

    public static void a() {
        field_b = null;
        field_g = null;
        field_i = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_g = "Player Name: ";
    }
}
