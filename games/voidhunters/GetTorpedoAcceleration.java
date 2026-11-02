/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetTorpedoAcceleration extends ConsoleCommand {
    static int field_p;
    static String field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            GetTorpedoAcceleration.a(85);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(169, 94));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wra.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetTorpedoAcceleration(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_o = (String) null;
        }
        field_o = null;
    }

    final static of a(ts[] param0, byte param1, OpenGlToolkit param2) {
        int var3_int = 0;
        Object stackIn_25_0 = null;
        of stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        int var5Lifetime1;
        var6 = VoidHunters.field_G;
        try {
          for (var3_int = 0; param0.length > var3_int; var3_int++) {
            if (null == param0[var3_int]) {
              return null;
            }
            if (param0[var3_int].field_c <= 0L) {
              return null;
            }
          }
          if (param1 != 107) {
            GetTorpedoAcceleration.a(-108);
          }
          var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
          for (var5 = 0; var5 < param0.length; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3_long, param0[var5].field_c);
          }
          jaggl.OpenGL.glLinkProgramARB(var3_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, grb.field_j, 0);
          if (0 == grb.field_j[0]) {
            if (0 == grb.field_j[0]) {
              System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, grb.field_j, 1);
            if (1 < grb.field_j[1]) {
              var11 = new byte[grb.field_j[1]];
              jaggl.OpenGL.glGetInfoLogARB(var3_long, grb.field_j[1], grb.field_j, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (grb.field_j[0] == 0) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (var7 < param0.length) {
                jaggl.OpenGL.glDetachObjectARB(var3_long, param0[var7].field_c);
                var7++;
              }
              jaggl.OpenGL.glDeleteObjectARB(var3_long);
              stackIn_25_0 = null;
              return (of) (stackIn_25_0);
            }
          }
          stackIn_27_0 = new of(param2, var3_long, param0);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("wra.C(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    static {
        field_p = 20;
        field_o = "Double Assault";
    }
}
