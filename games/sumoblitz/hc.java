/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static gt field_c;
    static da field_e;
    static int field_f;
    static ri[] field_a;
    static ri field_b;
    static String field_d;

    private hc() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_e = null;
        int var1 = 80 / ((69 - param0) / 40);
        field_c = null;
    }

    final static sn a(int param0, mk[] param1, fr param2) {
        Object stackIn_7_0 = null;
        sn stackIn_14_0 = null;
        Object stackIn_27_0 = null;
        sn stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        int var5Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 0;
          while (var3_int < param1.length) {
            if (null == param1[var3_int]) {
              return null;
            }
            if (param1[var3_int].field_b > 0L) {
              var3_int++;
              continue;
            }
            stackIn_7_0 = null;
            return (sn) (stackIn_7_0);
          }
          var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
          for (var5 = 0; param1.length > var5; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3_long, param1[var5].field_b);
          }
          jaggl.OpenGL.glLinkProgramARB(var3_long);
          if (param0 != -14382) {
            stackIn_14_0 = (sn) null;
            return stackIn_14_0;
          }
          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, sc.field_o, 0);
          if (0 == sc.field_o[0]) {
            if (sc.field_o[0] == 0) {
              System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, sc.field_o, 1);
            if (sc.field_o[1] > 1) {
              var11 = new byte[sc.field_o[1]];
              jaggl.OpenGL.glGetInfoLogARB(var3_long, sc.field_o[1], sc.field_o, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (sc.field_o[0] == 0) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (param1.length > var7) {
                jaggl.OpenGL.glDetachObjectARB(var3_long, param1[var7].field_b);
                var7++;
              }
              jaggl.OpenGL.glDeleteObjectARB(var3_long);
              stackIn_27_0 = null;
              return (sn) (stackIn_27_0);
            }
          }
          stackIn_29_0 = new sn(param2, var3_long, param1);
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("hc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    static {
        field_d = "Continue to next level?";
        field_f = 1;
    }
}
