/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ccb implements dja {
    static kl field_a;

    public final tv[] a(int param0, int param1) {
        if (param0 == 11995) {
          return (tv[]) ((Object) new sg[param1]);
        }
        String var4 = (String) null;
        ccb.a(117, (qfa) null, 46, (String) null);
        return (tv[]) ((Object) new sg[param1]);
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 <= 65) {
          int[] var2 = (int[]) null;
          ccb.a((Random) null, (int[]) null, (byte) -97, false);
        }
    }

    final static int a(Random param0, int[] param1, byte param2, boolean param3) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -21) {
            field_a = (kl) null;
          }
          stackIn_3_0 = sj.a(-71, param1.length, param0, param3, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ccb.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static ts a(int param0, qfa param1, int param2, String param3) {
        Object stackIn_12_0 = null;
        ts stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var4_long = 0L;
        RuntimeException var4 = null;
        String var7 = null;
        byte[] var11 = null;
        try {
          var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param0);
          if (param2 != 18753) {
            var7 = (String) null;
            ccb.a(-110, (qfa) null, 41, (String) null);
          }
          jaggl.OpenGL.glShaderSourceARB(var4_long, param3);
          jaggl.OpenGL.glCompileShaderARB(var4_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, ika.field_c, 0);
          if (ika.field_c[0] == 0) {
            if (ika.field_c[0] == 0) {
              System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, ika.field_c, 1);
            if (ika.field_c[1] > 1) {
              var11 = new byte[ika.field_c[1]];
              jaggl.OpenGL.glGetInfoLogARB(var4_long, ika.field_c[1], ika.field_c, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (0 == ika.field_c[0]) {
              jaggl.OpenGL.glDeleteObjectARB(var4_long);
              stackIn_12_0 = null;
              return (ts) (stackIn_12_0);
            }
          }
          stackIn_14_0 = new ts(param1, var4_long, param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ccb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public final tv a(byte param0) {
        int var2 = -8 % ((param0 + 64) / 50);
        return (tv) ((Object) new sg());
    }

    static {
        field_a = new kl();
    }
}
