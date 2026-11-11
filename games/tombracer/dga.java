/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dga {
    static String field_a;
    static String field_b;

    final static void a(PacketBuffer param0, int param1) {
        kc.field_b = param0.readUnsignedShort(123) << 5;
        int var2_int = param0.readUnsignedByte(255);
        kc.field_b = kc.field_b + (var2_int >> 3);
        RandomMazeBehaviour.field_p = var2_int << 18 & 1835008;
        RandomMazeBehaviour.field_p = RandomMazeBehaviour.field_p + (param0.readUnsignedShort(125) << 2);
        if (param1 != 0) {
          return;
        }
        try {
          var2_int = param0.readUnsignedByte(param1 + 255);
          RandomMazeBehaviour.field_p = RandomMazeBehaviour.field_p + (var2_int >> 6);
          IntPoint.field_a = (var2_int & 63) << 15;
          IntPoint.field_a = IntPoint.field_a + (param0.readUnsignedByte(255) << 7);
          var2_int = param0.readUnsignedByte(255);
          IntPoint.field_a = IntPoint.field_a + (var2_int >> 1);
          DivisionMazeGenerator.field_f = (1 & var2_int) << 16;
          DivisionMazeGenerator.field_f = DivisionMazeGenerator.field_f + param0.readUnsignedShort(127);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "dga.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static cua linkShaderProgram(int param0, OpenGlToolkit param1, fca[] param2) {
        int var3_int = 0;
        cua stackIn_3_0 = null;
        Object stackIn_27_0 = null;
        cua stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        int var5Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 21885) {
            stackIn_3_0 = (cua) null;
            return stackIn_3_0;
          }
          for (var3_int = 0; param2.length > var3_int; var3_int++) {
            if (null == param2[var3_int]) {
              return null;
            }
            if (param2[var3_int].field_a <= 0L) {
              return null;
            }
          }
          var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
          for (var5 = 0; param2.length > var5; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3_long, param2[var5].field_a);
          }
          jaggl.OpenGL.glLinkProgramARB(var3_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, TimingPattern.field_g, 0);
          if (TimingPattern.field_g[0] == 0) {
            if (TimingPattern.field_g[0] == 0) {
              System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, TimingPattern.field_g, 1);
            if (TimingPattern.field_g[1] > 1) {
              var11 = new byte[TimingPattern.field_g[1]];
              jaggl.OpenGL.glGetInfoLogARB(var3_long, TimingPattern.field_g[1], TimingPattern.field_g, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (0 == TimingPattern.field_g[0]) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (param2.length > var7) {
                jaggl.OpenGL.glDetachObjectARB(var3_long, param2[var7].field_a);
                var7++;
              }
              jaggl.OpenGL.glDeleteObjectARB(var3_long);
              stackIn_27_0 = null;
              return (cua) (stackIn_27_0);
            }
          }
          stackIn_29_0 = new cua(param1, var3_long, param2);
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("dga.D(").append(param0).append(',');
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
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var2 = (SceneLight.field_i - 640) / 2;
        int var3 = SoftwareTransform3D.field_q * SoftwareTransform3D.field_q;
        int var4 = var3 - param0 * param0;
        C2SRoomResultPacket.field_c.setBounds(param1, -124 + SoftwareRasterizer.height - 90, -23776, 90, -(var4 * 199 / var3) + var2);
        dka.field_b.setBounds(438, -124 + SoftwareRasterizer.height, param1 - 23975, 0, var2 + 202 + var4 * 438 / var3);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -29262) {
          field_b = (String) null;
        }
    }

    static {
        field_b = "Unable to delete friend - system busy";
    }
}
