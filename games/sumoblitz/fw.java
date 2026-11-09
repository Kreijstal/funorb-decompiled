/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fw extends IntrusiveNode {
    GraphicsToolkit field_k;
    static Sprite[] field_m;
    pm field_l;

    final static cp c(boolean param0) {
        if (CacheReferenceNode.field_v == null) {
          CacheReferenceNode.field_v = new cp();
          CacheReferenceNode.field_v.a(kw.field_b, (byte) -118);
          CacheReferenceNode.field_v.field_q = 5;
          CacheReferenceNode.field_v.field_l = 6;
          CacheReferenceNode.field_v.field_v = jm.field_a;
          CacheReferenceNode.field_v.field_m = 4;
          CacheReferenceNode.field_v.field_d = 2763306;
          CacheReferenceNode.field_v.field_u = 14;
          CacheReferenceNode.field_v.field_r = 7697781;
          CacheReferenceNode.field_v.field_s = 0;
          if (param0) {
            fw.a(-20);
            return CacheReferenceNode.field_v;
          }
          return CacheReferenceNode.field_v;
        }
        if (!param0) {
          return CacheReferenceNode.field_v;
        }
        fw.a(-20);
        return CacheReferenceNode.field_v;
    }

    final static boolean a(byte param0, Class param1, String param2) {
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
            var3 = (Class) (jo.field_a.get(param2));
            if (var3 != null) {
              if (var3.getClassLoader() == param1.getClassLoader()) {
                return true;
              }
              return false;
            }
            if (param0 <= 123) {
              field_m = (Sprite[]) null;
            }
            var4 = null;
            if (var4 == null) {
              var4 = (File) (TextureCombineSource.field_b.get(param2));
            }
            if (var4 != null) {
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
                jo.field_a.put(param2, param1);
                return true;
              } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref = (NoSuchMethodException) (Object) decompiledCaughtException;
                System.load(((File) (var4)).getPath());
                jo.field_a.put(param2, hc.class);
                return true;
              } catch (java.lang.Throwable decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var5_ref2 = decompiledCaughtException;
              }
            }
            return false;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var3_ref;
            stackIn_21_1 = new StringBuilder().append("fw.D(").append(param0).append(',');
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
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        if (param0 > -109) {
          fw.c(true);
        }
    }

    fw(GraphicsToolkit param0, pm param1) {
        try {
          this.field_l = param1;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static TextWidgetRenderer a(int param0) {
        if (null == AudioServiceThread.field_d) {
          AudioServiceThread.field_d = new TextWidgetRenderer(jm.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, jm.field_a.field_s, -1, 2147483647, true);
          if (param0 != 0) {
            fw.c(false);
            return AudioServiceThread.field_d;
          }
          return AudioServiceThread.field_d;
        }
        if (param0 == 0) {
          return AudioServiceThread.field_d;
        }
        fw.c(false);
        return AudioServiceThread.field_d;
    }

    static {
    }
}
