/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gha extends rqa {
    static ri field_r;
    static int field_o;
    static rrb field_q;
    static llb field_p;

    gha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(byte param0, int param1) {
        int var4 = 0;
        int var2 = param1 * (param1 * param1 >> 12) >> 12;
        int var3 = param1 * 6 - 61440;
        int var4Lifetime1;
        if (param0 > 54) {
          var4 = (param1 * var3 >> 12) + 40960;
          return var4 * var2 >> 12;
        }
        jp var5 = (jp) null;
        gha.a((byte[]) null, 119, (byte) -84, (jp) null);
        var4Lifetime1 = (param1 * var3 >> 12) + 40960;
        return var4Lifetime1 * var2 >> 12;
    }

    final static ue a(byte[] param0, int param1, byte param2, jp param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        Object stackIn_4_0 = null;
        Object stackIn_16_0 = null;
        ue stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param0.length == 0) {
            stackIn_4_0 = null;
            return (ue) (stackIn_4_0);
          }
          var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param1);
          jaggl.OpenGL.glShaderSourceRawARB(var4_long, param0);
          jaggl.OpenGL.glCompileShaderARB(var4_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, rm.field_f, 0);
          if (param2 != -15) {
            field_o = 36;
          }
          if (rm.field_f[0] == 0) {
            if (rm.field_f[0] == 0) {
              System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, rm.field_f, 1);
            if (rm.field_f[1] > 1) {
              var10 = new byte[rm.field_f[1]];
              jaggl.OpenGL.glGetInfoLogARB(var4_long, rm.field_f[1], rm.field_f, 0, var10, 0);
              System.out.println(new String(var10));
            }
            if (0 == rm.field_f[0]) {
              jaggl.OpenGL.glDeleteObjectARB(var4_long);
              stackIn_16_0 = null;
              return (ue) (stackIn_16_0);
            }
          }
          stackIn_18_0 = new ue(param3, var4_long, param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("gha.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_q = null;
        if (param0 != 0) {
          field_r = (ri) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            gha.a(-36);
          }
          stackIn_3_0 = new nc(frb.a(182, 85));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gha.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = 0;
        field_r = new ri(1, 2, 2, 0);
        field_q = new rrb();
    }
}
