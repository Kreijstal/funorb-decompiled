/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends bp implements ef {
    static int field_j;
    static PcmSample[] field_l;
    static SpriteData field_i;
    static IntrusiveDeque sceneEffects;
    static int field_k;

    public final void a(int param0) {
        if (param0 != 8905) {
          field_i = (SpriteData) null;
          super.a(param0 ^ 0);
          return;
        }
        super.a(param0 ^ 0);
    }

    public static void releaseStatics(int param0) {
        if (param0 < 115) {
          return;
        }
        sceneEffects = null;
        field_l = null;
        field_i = null;
    }

    public final void a(ji param0, int param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rc.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    rc(OpenGlGraphicsToolkit param0, int param1, boolean param2, int[][] param3) {
        super(param0, 34067, nl.field_p, io.field_g, param1 * (param1 * 6), param2);
        int var5_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7 = 0;
        int var5_intLifetime1;
        try {
          this.field_e.a((ed) (this), 100);
          if (param2) {
            for (var5_int = 0; 6 > var5_int; var5_int++) {
              this.a(param1, param1, param3[var5_int], 34069 + var5_int, -1);
            }
            return;
          }
          var7 = 0;
          var5_intLifetime1 = var7;
          while (var7 < 6) {
            jaggl.OpenGL.glTexImage2Di(var7 + 34069, 0, this.e(19), param1, param1, 0, IntrusiveNodeHashTable.a(-21339, this.field_c), this.field_e.field_Ec, param3[var7], 0);
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("rc.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -23) {
            stackIn_4_0 = ToolkitRasterBuffer.field_q.fetchNamedFile(param0, "", -1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rc.M(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_l = new PcmSample[38];
    }
}
