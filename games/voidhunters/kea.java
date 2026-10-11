/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kea {
    static boolean field_b;
    static llb field_a;

    final static boolean a(boolean param0, Class param1, String param2) {
        try {
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
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
            var3 = (Class) (fnb.field_c.get(param2));
            if (var3 != null) {
              if (var3.getClassLoader() == param1.getClassLoader()) {
                return true;
              }
              return false;
            }
            if (param0) {
              return true;
            }
            var4 = null;
            if (var4 == null) {
              var4 = (File) (jma.field_q.get(param2));
            }
            if (var4 == null) {
              return false;
            }
            try {
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
              return true;
            } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref = (NoSuchMethodException) (Object) decompiledCaughtException;
              System.load(((File) (var4)).getPath());
              fnb.field_c.put(param2, cd.class);
              return true;
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5_ref2 = decompiledCaughtException;
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var3_ref;
            stackIn_21_1 = new StringBuilder().append("kea.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
            if (param2 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
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
