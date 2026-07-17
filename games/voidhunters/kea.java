/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kea {
    static boolean field_b;
    static llb field_a;

    final static boolean a(boolean param0, Class param1, String param2) {
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
            int stackIn_8_0 = 0;
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
            int stackOut_4_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_7_0 = 0;
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
              var3 = (Class) fnb.field_c.get((Object) (Object) param2);
              if (var3 != null) {
                if (var3.getClassLoader() != param1.getClassLoader()) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                } else {
                  return true;
                }
              } else {
                if (!param0) {
                  L0: {
                    var4 = null;
                    if (var4 != null) {
                      break L0;
                    } else {
                      var4 = (Object) (Object) (File) jma.field_q.get((Object) (Object) param2);
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
                        Object discarded$8 = fnb.field_c.put((Object) (Object) param2, (Object) (Object) param1);
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        break L1;
                      }
                    } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var5 = (NoSuchMethodException) (Object) decompiledCaughtException;
                      System.load(((File) var4).getPath());
                      Object discarded$9 = fnb.field_c.put((Object) (Object) param2, (Object) (Object) cd.class);
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
                } else {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L2: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_19_0 = (RuntimeException) var3_ref;
                stackOut_19_1 = new StringBuilder().append("kea.A(").append(param0).append(44);
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
              throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 35 / ((param0 - 40) / 63);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
