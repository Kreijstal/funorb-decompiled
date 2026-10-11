/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su extends RuntimeException {
    static String field_d;
    String field_a;
    static String field_c;
    Throwable field_b;

    final static qj a(int param0, on param1, byte[] param2, int param3) {
        Object stackIn_15_0 = null;
        qj stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        try {
          if (param2 == null) {
            return null;
          }
          if (0 == param2.length) {
            return null;
          }
          var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param0);
          jaggl.OpenGL.glShaderSourceRawARB(var4_long, param2);
          jaggl.OpenGL.glCompileShaderARB(var4_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, dh.field_H, 0);
          if (dh.field_H[0] == 0) {
            if (dh.field_H[0] == 0) {
              System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, dh.field_H, 1);
            if (dh.field_H[1] > 1) {
              var10 = new byte[dh.field_H[1]];
              jaggl.OpenGL.glGetInfoLogARB(var4_long, dh.field_H[1], dh.field_H, 0, var10, 0);
              System.out.println(new String(var10));
            }
            if (dh.field_H[0] == 0) {
              jaggl.OpenGL.glDeleteObjectARB(var4_long);
              stackIn_15_0 = null;
              return (qj) (stackIn_15_0);
            }
          }
          if (param3 > -113) {
            su.b((byte) -11);
          }
          stackIn_19_0 = new qj(param1, var4_long, param0);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("su.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
          byte[] var2 = (byte[]) null;
          su.a(6, (on) null, (byte[]) null, -63);
          if (!nt.field_r) {
            return vs.b((byte) 9) ? true : false;
          }
          return true;
        }
        if (nt.field_r) {
          return true;
        }
        if (!vs.b((byte) 9)) {
          return false;
        }
        return true;
    }

    final static void a(byte param0) {
        rl var1 = (rl) (te.field_g.b((byte) -124));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        lk.a(var1.field_v, var1.field_t, var1.field_m);
        lk.d(var1.field_s, var1.field_r, var1.field_u, var1.field_p);
        var1.field_v = null;
        ko.field_m.a((ms) (var1), (byte) 39);
        int var2 = -37 / ((param0 - 1) / 38);
    }

    public static void b(byte param0) {
        if (param0 != -18) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    su(Throwable param0, String param1) {
        this.field_a = param1;
        this.field_b = param0;
    }

    static {
        field_d = "Unpacking music";
        field_c = "Creating your account";
    }
}
