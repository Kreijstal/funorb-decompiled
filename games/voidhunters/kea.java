/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kea {
    static boolean field_b;
    static llb field_a;

    final static boolean a(boolean param0, Class param1, String param2) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_18_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            StringBuilder stackIn_24_1 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Class var3 = null;
            RuntimeException var3_ref = null;
            Object var4 = null;
            Class var5 = null;
            NoSuchMethodException var5_ref = null;
            Throwable var5_ref2 = null;
            Class var6 = null;
            java.lang.reflect.Method var7 = null;
            java.lang.reflect.Method var8 = null;
            File var9 = null;
            try {
              L0: {
                var3 = (Class) (fnb.field_c.get(param2));
                if (var3 != null) {
                  if (var3.getClassLoader() != param1.getClassLoader()) {
                    stackIn_5_0 = 0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    return true;
                  }
                } else {
                  if (!param0) {
                    L1: {
                      var4 = null;
                      if (var4 != null) {
                        break L1;
                      } else {
                        var4 = (File) (jma.field_q.get(param2));
                        break L1;
                      }
                    }
                    if (var4 != null) {
                      try {
                        L2: {
                          var9 = new File(((File) (var4)).getCanonicalPath());
                          var4 = var9;
                          var5 = Class.forName("java.lang.Runtime");
                          var6 = Class.forName("java.lang.reflect.AccessibleObject");
                          var7 = var6.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
                          var8 = var5.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")});
                          var7.invoke((Object) (var8), new Object[]{Boolean.TRUE});
                          var8.invoke((Object) (Runtime.getRuntime()), new Object[]{param1, var9.getPath()});
                          var7.invoke((Object) (var8), new Object[]{Boolean.FALSE});
                          fnb.field_c.put(param2, param1);
                          stackIn_14_0 = 1;
                          break L2;
                        }
                      } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var5_ref = (NoSuchMethodException) (Object) decompiledCaughtException;
                        System.load(((File) (var4)).getPath());
                        fnb.field_c.put(param2, cd.class);
                        stackIn_16_0 = 1;
                        return stackIn_16_0 != 0;
                      } catch (java.lang.Throwable decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        var5_ref2 = decompiledCaughtException;
                        stackIn_18_0 = 0;
                        return stackIn_18_0 != 0;
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return false;
                    }
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L3: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_21_0 = (RuntimeException) (var3_ref);

                stackIn_21_1 = new StringBuilder().append("kea.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L3;
                } else {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

                if (param2 == null) {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "null";
                  break L4;
                } else {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "{...}";
                  break L4;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_5_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_8_0 != 0;
              } else {
                return stackIn_14_0 != 0;
              }
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
        field_b = false;
    }
}
