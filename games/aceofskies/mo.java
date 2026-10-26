/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    private jc field_b;
    int field_d;
    static int[] field_c;
    static w field_a;

    final static io a(int param0, jc param1, vj[] param2) {
        int var3_int = 0;
        Object stackIn_24_0 = null;
        io stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        int var5Lifetime1;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          for (var3_int = 0; var3_int < param2.length; var3_int++) {
            if (null == param2[var3_int]) {
              return null;
            }
            if (param2[var3_int].field_c <= 0L) {
              return null;
            }
          }
          var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
          for (var5 = 0; param2.length > var5; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3_long, param2[var5].field_c);
          }
          jaggl.OpenGL.glLinkProgramARB(var3_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, ee.field_d, 0);
          if (ee.field_d[param0] == 0) {
            if (ee.field_d[0] == 0) {
              System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, ee.field_d, 1);
            if (1 < ee.field_d[1]) {
              var11 = new byte[ee.field_d[1]];
              jaggl.OpenGL.glGetInfoLogARB(var3_long, ee.field_d[1], ee.field_d, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (ee.field_d[0] == 0) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (var7 < param2.length) {
                jaggl.OpenGL.glDetachObjectARB(var3_long, param2[var7].field_c);
                var7++;
              }
              jaggl.OpenGL.glDeleteObjectARB(var3_long);
              stackIn_24_0 = null;
              return (io) (stackIn_24_0);
            }
          }
          stackIn_26_0 = new io(param1, var3_long, param2);
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("mo.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!ks.field_b) {
          throw new IllegalStateException();
        }
        nq.field_a = true;
        ep.a(false, param0 ^ param0);
        SoundCache.field_d = 0;
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -16 / ((param0 + 33) / 39);
    }

    mo(jc param0, int param1, int param2) {
        try {
          this.field_d = param2;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "mo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.field_b.c(110, this.field_d);
        super.finalize();
    }

    static {
        field_a = new w();
    }
}
